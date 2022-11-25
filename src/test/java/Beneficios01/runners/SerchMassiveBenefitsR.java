package Beneficios01.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/view_massive_benefits.feature",
        glue = "Beneficios01.stepdefinitions.serch_massive_benefits",
       snippets= SnippetType.CAMELCASE,
        dryRun = false
)
public class SerchMassiveBenefitsR {
}
