package allure.steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.partialLinkText;

public class WebSteps {

    @Step("Open Github")
    public void openPage() {
        open("https://github.com");
    }
    @Step("Searching repository {repo}")
    public void searchRepo(String repo) {
        $("[name=q]").setValue(repo).submit();
    }

    @Step("Opening repository {repo}")
    public void openRepo(String repo) {
        $(partialLinkText(repo)).click();
    }

    @Step("Opening repository {repo}")
    public void checkIssueChapter() {
        $("#issues-tab").shouldHave(text("Issues"));
    }
}
