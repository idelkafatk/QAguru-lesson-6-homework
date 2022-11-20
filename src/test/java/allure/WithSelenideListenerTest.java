package allure;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.partialLinkText;

public class WithSelenideListenerTest {

    @Test
    @Feature("Test Git Repo")
    @Owner("Idel Fakthullin")
    @DisplayName("Test with Selenide Listener")
    void gitTestWithListener() {
        SelenideLogger.addListener("allure", new AllureSelenide()); //add listener


        // Open GitHub
        open("https://github.com/");

        // Find repo
        $("[name=q]").setValue("fatkhullin_qa").submit();

        // Open repo
        $(partialLinkText("idelkafatk/Fatkhullin_qa")).click();

        // Find Issue
        $("#issues-tab").shouldHave(text("Issues"));
    }
}
