package com.euroTech.pages;

import com.euroTech.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {
   // public DashboardPage(){
   //   PageFactory.initElements(Driver.get(),this);
   // }
    @FindBy (tagName = "h2")
    public WebElement userName;



}


