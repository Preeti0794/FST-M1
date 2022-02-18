package testRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\PreetiGupta\\eclipse-workspace\\FST.Cucumber\\src\\test\\java\\feature",
    glue = {"stepDefinitions"},
    plugin = { "pretty" },
    monochrome = true ,
    tags = "@SmokeTest"
)


public class Activity6 {

}
