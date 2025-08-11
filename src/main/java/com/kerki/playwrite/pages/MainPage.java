package com.kerki.playwrite.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class MainPage {

    private Page page;

    public MainPage(Page page) {
        this.page = page;
    }

    public Page getPage() {
        return this.page;
    }

    public String geTitle() {
        return page.title();
    }

    public Locator getStartedLink() {
        return page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Get Started"));
    }

    public Locator installationHeading() {
        return page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Installation"));
    }
}
