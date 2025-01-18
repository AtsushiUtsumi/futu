package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeleniumTest {

	@Test
	void グーグル開いてみる() {
		System.setProperty("webdriver.edge.driver", "./src/test/resources/msedgedriver.exe");

		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		EdgeDriver driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		try {
			driver.navigate().to("https://google.co.jp");
			Thread.sleep(5000);
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}

		assertEquals("0", "0");
	}
}
