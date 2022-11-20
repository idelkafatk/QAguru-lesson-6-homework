package allure;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.partialLinkText;

public class WithLambdaStepsTest {
    private static final String REPOSITORY = "idelkafatk/Fatkhullin_qa";

    @Test
    @Feature("Test Git Repo")
    @Owner("Idel Fakthullin")
    @DisplayName("Test with lambda steps")
    void gitTestWithLambdaSteps() {

        step("Open Github", () -> {
            open("https://github.com/");
        });

        step("Searching repository " + REPOSITORY, () -> {
            $("[name=q]").setValue(REPOSITORY).submit();
        });

        step("Opening repository " + REPOSITORY, () -> {
            $(partialLinkText("idelkafatk/Fatkhullin_qa")).click();
        });

        step("Checking Issue Chapter", () -> {
            $("#issues-tab").shouldHave(text("Issues"));
        });
    }
}
