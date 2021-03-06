package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:testResults/output.html",
                "json:testResults/output.json",
                "junit:testResults/output.xml"},
       features="src/test/resources/features",
        glue="stepdefinitions",

        tags="",
        dryRun=false


)
public class Runner {

}