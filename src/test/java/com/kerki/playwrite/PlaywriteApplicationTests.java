package com.kerki.playwrite;

import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import com.kerki.playwrite.pages.MainPage;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


@SpringBootTest
class PlaywriteApplicationTests {

	@Value("${playwright.base.url}")
    private String baseUrl;

    @Autowired
    private BrowserType.LaunchOptions launchOptions;

	@Test
    public void testAB() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(launchOptions);
            Page page = browser.newPage();
            page.navigate(baseUrl);

            MainPage mainPage = new MainPage(page);

            assertThat(mainPage.getPage()).hasTitle(Pattern.compile("Playwright"));

            assertThat(mainPage.getStartedLink()).hasAttribute("href", "/docs/intro");

            // Click the get started link.
            mainPage.getStartedLink().click();

            // Expects page to have a heading with the name of Installation.
            assertThat(mainPage.installationHeading()).isVisible();
        }

    }

}
