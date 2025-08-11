# Playwright E2E Testing with Java & Spring

This project demonstrates how to use [Playwright](https://playwright.dev/) for end-to-end (E2E) testing in a Java application built with Spring.

## Overview
Playwright is a modern browser automation library that enables reliable end-to-end testing across Chromium, Firefox, and WebKit. Combined with Spring, it allows Java developers to write robust E2E tests for web applications.

## Key Features
- Cross-browser automation (Chromium, Firefox, WebKit)
- Fast and reliable execution with auto-waiting
- Supports single-page applications and dynamic content
- Easy headless/headed mode switching
- Advanced features: browser context isolation, network interception, device emulation

## Example Usage
See `src/test/java/com/kerki/playwrite/PlaywriteApplicationTests.java` for a sample Playwright test using Spring Boot.
The test uses a page object (`MainPage`) for better structure and maintainability.

## Getting Started
1. Add Playwright to your Maven dependencies.
2. Ensure you have the required browsers installed (see Playwright docs).
3. Run your Spring application to execute the E2E test logic.

## Resources

For more details, explore the code and official documentation links above.
## When to Use Playwright Over Selenium
Playwright is recommended over Selenium when you need:
- **Cross-browser support** including Chromium, Firefox, and WebKit (Safari).
- **Faster and more reliable automation** with modern browser APIs and auto-waiting for elements.
- **Native support for single-page applications** and dynamic content.
- **Headless and headed execution** with easy configuration.
- **Advanced features** like browser context isolation, network interception, and emulation.

Selenium remains a good choice for legacy projects or when you need support for browsers not covered by Playwright.
