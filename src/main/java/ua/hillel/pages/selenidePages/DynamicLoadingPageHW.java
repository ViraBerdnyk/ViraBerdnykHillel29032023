package ua.hillel.pages.selenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DynamicLoadingPageHW {
    private SelenideElement startButton = $("#start button");
    private SelenideElement loadedText = $("#finish h4");
    private SelenideElement loadingText = $("#loading");

    public void openDynamicLoadingPage(String pageUrl) {
        open(pageUrl);
    }

    public void startLoadingExample() {
        startButton.click();
        startButton.shouldBe(Condition.disabled)
                .shouldBe(Condition.enabled, Duration.ofSeconds(6));
    }

    public void waitForContent() {
        startButton.click();
        loadedText.shouldBe(Condition.visible, Duration.ofSeconds(6));
    }

    public String getLoadedText() {
        return loadedText.getText();
    }

    public void hideOrShowCheckbox(boolean hide) {
        startButton.click();
        startButton.shouldBe(Condition.disabled)
                .shouldBe(Condition.enabled, Duration.ofSeconds(6));

        if (hide) {
            loadingText.shouldNotBe(Condition.visible);
        } else {
            loadingText.shouldBe(Condition.visible);
        }
    }
}