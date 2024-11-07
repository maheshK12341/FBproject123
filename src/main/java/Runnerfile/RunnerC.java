package Runnerfile;
import org.testng.annotations.AfterClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"features"},
                 glue =     {"StepDefinationlogin1"},
                 plugin =    {  "pretty","html:target/cucumber-reports",
    		     "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 tags="@regression",
                  monochrome = true )
public class RunnerC extends AbstractTestNGCucumberTests{
	
	}
