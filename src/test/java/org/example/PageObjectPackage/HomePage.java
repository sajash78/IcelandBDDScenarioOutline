package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory {
    @FindBy(id = "header-search")
    WebElement searchbox;
    @FindBy(xpath = "//html//body//div//header//div//div//div//form//div//div//button//*[local-name()='svg']")
    WebElement searchButton;

    public void search(String item){
        searchbox.sendKeys(item);
        searchbox.sendKeys(Keys.ENTER);



    }
   public void gettheurl(){
           String iceland= driver.getCurrentUrl();
        Assert.assertThat(iceland, Matchers.containsString("iceland"));
    }
}

// friday