package com.OrangeHRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
    @FindBy(xpath = "//span[text()='Time']")
    private WebElement timeEdt;

    @FindBy(xpath = "//span[contains(.,'Timesheets ')]")
    private WebElement timesheet;

    @FindBy(xpath = "//a[text()='My Timesheets']")
    private WebElement myTimesheet;



   public HomePage(WebDriver driver)
   {

       PageFactory.initElements(driver, this);
   }

   public void timeDropDown(){
       timeEdt.click();
       timesheet.click();
       myTimesheet.click();

   }

}
