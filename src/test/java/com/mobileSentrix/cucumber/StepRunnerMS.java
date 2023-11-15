package com.mobileSentrix.cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin= {"pretty","html:report/mobileSentrix.html"},
features="src/test/resources/featureFile",
glue="com.mobileSentrix.stepDefination",
tags="@sprint1",
snippets=SnippetType.CAMELCASE
)
public class StepRunnerMS {
	
}
