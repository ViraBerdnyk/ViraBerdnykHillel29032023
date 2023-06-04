package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
    @Test
    @Parameters({"url", "browserName"})
    public void runTest(String url, String browser) {
        System.out.println("Running test in " + browser + " on " + url);

    }
}
