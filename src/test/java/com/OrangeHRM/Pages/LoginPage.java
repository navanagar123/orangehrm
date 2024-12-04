package com.OrangeHRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameEdt;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordEdt;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitEdt;

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public WebElement getUsernameEdt() {
        return usernameEdt;
    }

    public void setUsernameEdt(WebElement usernameEdt) {
        this.usernameEdt = usernameEdt;
    }

    public WebElement getPasswordEdt() {
        return passwordEdt;
    }

    public void setPasswordEdt(WebElement passwordEdt) {
        this.passwordEdt = passwordEdt;
    }

    public WebElement getSubmitEdt() {
        return submitEdt;
    }

    public void setSubmitEdt(WebElement submitEdt) {
        this.submitEdt = submitEdt;
    }

    public void LoginPage(String username, String password)
    {
        usernameEdt.sendKeys(username);
        passwordEdt.sendKeys(password);
        submitEdt.click();
    }

}
