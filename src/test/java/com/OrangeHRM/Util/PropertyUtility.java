package com.OrangeHRM.Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility
{
    public String getDataFromProperty(String key) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Qapitol QA\\IdeaProjects\\New folder\\OrangeHRM\\PropertyFile.properties")    ;
        Properties p=new Properties();
        p.load(fis);
        String value=p.getProperty(key);
        return value;
    }
}
