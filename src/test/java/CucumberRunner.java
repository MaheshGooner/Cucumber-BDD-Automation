import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(cucumber.api.junit.Cucumber.class)
@CucumberOptions(
        tags = "~@wip",
        plugin = "json:test-results/cucumber-reports/report.json",
        features = "src/test/resources"
)
public class CucumberRunner
{


}