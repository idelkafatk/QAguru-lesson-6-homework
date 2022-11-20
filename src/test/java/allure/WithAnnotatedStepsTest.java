package allure;

import allure.steps.WebSteps;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WithAnnotatedStepsTest {
    private static final String REPOSITORY = "idelkafatk/Fatkhullin_qa";
    WebSteps steps = new WebSteps();

    @Test
    @Feature("Test Git Repo")
    @Owner("Idel Fakthullin")
    @DisplayName("Test with annotated steps")
    void gitTestWithAnnotatedSteps() {
        steps.openPage();
        steps.searchRepo(REPOSITORY);
        steps.openRepo(REPOSITORY);
        steps.checkIssueChapter();
    }
}
