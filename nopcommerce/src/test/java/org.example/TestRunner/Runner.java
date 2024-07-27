package org.example.TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@Regression_TCs",
        features = "D:\\testing\\amit\\web testing\\project\\nopcommerce\\src\\main\\resources\\features",
        glue = "org.example.StepDefinitions",
        plugin = {
                "pretty",
                "html: target/cucumber.html",
                "json:target/cucumber.json"
        })

public class Runner extends AbstractTestNGCucumberTests {

}