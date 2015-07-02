package fr.arolla.jam.webapp;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = "src/test/resources/fr/arolla/jam/webapp",
        glue = "fr.arolla.jam.webapp.glue",
        monochrome = true,
        format = "pretty"
)
public class CucumberTests {
}
