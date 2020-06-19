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
	@FindBy(xpath="//h5[contains(text(),'Below is a list of the fifty U.S. states in alphabetical order:')]/following-sibling::ul/li")
	public List<WebElement> states;


}









