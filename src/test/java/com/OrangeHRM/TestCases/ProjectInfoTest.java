package com.OrangeHRM.TestCases;

import com.OrangeHRM.Pages.CreateCustomers;
import com.OrangeHRM.Pages.CreateCustomersPage;
import com.OrangeHRM.Pages.HomePage;
import com.OrangeHRM.Pages.LoginPage;
import com.OrangeHRM.Util.ExcelUtility;
import com.OrangeHRM.base.BaseClass;
import org.apache.xmlbeans.impl.xb.ltgfmt.TestCase;
import org.testng.annotations.Test;

import java.io.IOException;

public class ProjectInfoTest extends BaseClass
{
    @Test
    public void createCustomer() throws IOException
    {
        ExcelUtility eutil=new ExcelUtility();
       String NAME=eutil.getDataFromExcel("Sheet1",1,2);
       String DES=eutil.getDataFromExcel("Sheet1",1,3);
       HomePage hp = new HomePage(driver);
       hp.getTimeEdt().click();
       hp.getProjectInfoEdt().click();
       hp.getCustomersEdt().click();
       CreateCustomersPage cc=new CreateCustomersPage(driver);
       cc.getAddBtnEdt().click();
       cc.creatingCustomer(NAME,DES);
    }


}
