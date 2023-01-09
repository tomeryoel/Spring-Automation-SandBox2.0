package com.Application.Spring.Automation.SandBox20.steps;

import com.Application.Spring.Automation.SandBox20.webDriver.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class CucumberHooks {
    /**
     * Runs before each test(features) with tag '@ui'
     */
    @Before("@ui")
    public void beforeEach() {
        WebDriverFactory.createDriver();
    }

    /**
     * Runs before each test(features) with tag '@ui' whether pass or failed
     */
    @After("@ui")
    public void afterEach() {
        WebDriverFactory.cleanUpDriver();
    }
}
