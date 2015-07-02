package fr.arolla.jam.webapp.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.arolla.jam.webapp.WebApplication;
import net.codestory.simplelenium.SeleniumTest;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebApplication.class, loader = SpringApplicationContextLoader.class)
@WebIntegrationTest(value = "server.port=9090")
public class HomeSimpleleniumSteps extends SeleniumTest {

    @Given("I'm on the home page simplelenium$")
    public void I_m_on_the_home_page() throws Throwable {
        goTo("http://localhost:9090/");
    }

    @Then("^I should see a welcome message simplelenium$")
    public void I_should_be_on_the_home_page() throws Throwable {
        find("#heading")
            .should()
            .contain("Hello World!");
    }

    @When("^I click on the home button simplenium$")
    public void I_click_on_the_home_button_simplenium() throws Throwable {
        find("#home-link").click();
    }
}
