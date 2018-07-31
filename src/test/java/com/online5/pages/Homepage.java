package com.online5.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.online5.utilities.Driver;

public class Homepage {
	public Homepage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//a[.='Community']")
	public WebElement communityLink;
	
	@FindBy(xpath="//a[.='Apps']")
	public WebElement AppsLink;
	
}
