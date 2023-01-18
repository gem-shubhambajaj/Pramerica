package com.gemini.generic.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "com.gemini.generic", features ="src/test/resources/Features", tags = "@appForm")
public class TestRunner {
}
