package com.OrangeHRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCustomersPage
{
    @FindBy(xpath = "//button[contains(.,'Add')]")
    private WebElement AddBtnEdt;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement CustomerNameEdt;

    @FindBy(xpath = "//textarea[@placeholder='Type description here']")
    private WebElement descEdt;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement SubmitBtnEdt;

    public CreateCustomersPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public WebElement getAddBtnEdt() {
        return AddBtnEdt;
    }

    public void setAddBtnEdt(WebElement addBtnEdt) {
        AddBtnEdt = addBtnEdt;
    }

    public WebElement getCustomerNameEdt() {
        return CustomerNameEdt;
    }

    public void setCustomerNameEdt(WebElement customerNameEdt) {
        CustomerNameEdt = customerNameEdt;
    }

    public WebElement getDescEdt() {
        return descEdt;
    }

    public void setDescEdt(WebElement descEdt) {
        this.descEdt = descEdt;
    }

    public WebElement getSubmitBtnEdt() {
        return SubmitBtnEdt;
    }

    public void setSubmitBtnEdt(WebElement submitBtnEdt) {
        SubmitBtnEdt = submitBtnEdt;
    }

    public void creatingCustomer(String Cname,String description)
    {
        getCustomerNameEdt().sendKeys(Cname);
        getDescEdt().sendKeys(description);
        getSubmitBtnEdt().click();
    }

}
