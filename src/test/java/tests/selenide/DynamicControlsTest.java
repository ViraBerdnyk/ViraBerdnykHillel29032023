package tests.selenide;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import ua.hillel.pages.selenidePages.DynamicControlsPage;

import static com.codeborne.selenide.Selenide.open;

public class DynamicControlsTest {
    @Test
    public void dynControlsTest() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.savePageSource = false;


        open("/dynamic_controls");
        DynamicControlsPage controlsPage = new DynamicControlsPage();

        controlsPage.hideOrShowCheckbox(true);

        controlsPage.hideOrShowCheckbox(false);
    }
}

