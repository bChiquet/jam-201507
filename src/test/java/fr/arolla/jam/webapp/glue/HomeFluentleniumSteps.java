package fr.arolla.jam.webapp.glue;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.arolla.jam.webapp.WebApplication;
import fr.arolla.jam.webapp.glue.page.HomePage;
import org.fluentlenium.core.FluentAdapter;
import org.fluentlenium.core.annotation.Page;
import org.junit.runner.RunWith;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.fluentlenium.assertj.FluentLeniumAssertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebApplication.class, loader = SpringApplicationContextLoader.class)
@WebIntegrationTest(value = "server.port=9090")
public class HomeFluentleniumSteps extends FluentAdapter {

    @Page
    HomePage page;

    @Before
    public void before() {
        this.initFluent(new HtmlUnitDriver());
        this.initTest();
    }

    @Given("I'm on the home page fluentlenium")
    public void I_m_on_the_home_page() throws Throwable {
        goTo(page);
    }

    @Then("^I should see a welcome message fluentlenium")
    public void I_should_be_on_the_home_page() throws Throwable {
        assertThat($("#heading")).hasText("Hello World!");
    }

    @When("^I click on the home button fluentlenium$")
    public void I_click_on_the_home_button_fluentlenium() throws Throwable {
        find("#home-link").click();
    }
}
