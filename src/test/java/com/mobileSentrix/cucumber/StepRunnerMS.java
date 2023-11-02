package com.mobileSentrix.cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin= {"pretty","html:report/mobileSentrix.html"},
features="src/test/resources/featureFile/MSLoginScenarioOutline.feature",
glue="com.mobileSentrix.stepDefination",
tags="@ScenarioOutline",
snippets=SnippetType.CAMELCASE
)
public class StepRunnerMS {
	
}
