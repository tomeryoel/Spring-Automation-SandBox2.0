package com.Application.Spring.Automation.SandBox20.libraries;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebDriverLibraries {
    @Bean
    public WebDriver getChromeDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
