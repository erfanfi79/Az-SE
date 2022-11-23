package problem;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(features = "src/test/resources/features/problem.feature")
@RunWith(Cucumber.class)
public class RunnerTest {
}
