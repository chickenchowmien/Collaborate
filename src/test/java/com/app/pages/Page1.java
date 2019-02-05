package com.app.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.BrowserUtils;
import com.app.utilities.Driver;

public class Page1 {
	private WebDriver driver;
	
	public Page1() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}



}









