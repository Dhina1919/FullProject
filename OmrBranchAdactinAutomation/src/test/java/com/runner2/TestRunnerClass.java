
package com.runner2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=true, features="src\\test\\resources\\Features",glue="com.stepDefinition2")


public class TestRunnerClass {

}

