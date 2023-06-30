package ua.hillel.pages.selenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class DynamicControlsPage {
    private SelenideElement cbButton = $("#checkbox-example button");
    private SelenideElement cb = $("#checkbox");
    private SelenideElement message = $("#checkbox-example #message");
    private SelenideElement loader = $("#loading");


    public void hideOrShowCheckbox(boolean hide) {
        cbButton.click();
        cbButton.shouldBe(Condition.disabled)
                .shouldBe(Condition.enabled, Duration.ofSeconds(6));


        if (hide) {
            cb.shouldNot(Condition.visible);
        } else {
            cb.shouldBe(Condition.visible);
            message.shouldBe(Condition.visible);
        }
    }
}

