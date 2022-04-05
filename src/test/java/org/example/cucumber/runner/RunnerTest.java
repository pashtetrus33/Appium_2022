package org.example.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features = "src/test/resources/features", glue = {"src/test/java/org/example/cucumber/steps", "src/test/java/org/example/cucumber/hooks"})
public class RunnerTest extends AbstractTestNGCucumberTests {
}
