package com.OrangeHRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateProjectsPage
{
    @FindBy(xpath = "//a[text()='Projects']")
    private WebElement projectsEdt;

    @FindBy(xpath = "//button[text()=' Add ']")
    private WebElement AddEdt;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement projectNameEdt;
//tihis is changed
}
