package com.kerki.playwrite.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.microsoft.playwright.BrowserType;


@Configuration
public class BrowserConfig {

    @Bean
    public BrowserType.LaunchOptions launchOptions() {
        return new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50);
    }

}
