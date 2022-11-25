package Beneficios01.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/serch_all_detail_credit.feature",
        glue = "creditos01.stepdefinitions.serch_all_detail_credit",
       snippets= SnippetType.CAMELCASE,
        dryRun = false
)
public class SerchAllDetailCreditR {
}
