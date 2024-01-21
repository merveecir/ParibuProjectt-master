package com.paribuProject.pageObjects;

import com.paribuProject.utilities.PropertiesReader;
import com.paribuProject.utilities.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {
    public AbstractPage(){
        PageFactory.initElements(Browser.get(), this);
    }

    public void openUrl (){
        Browser.get().get(PropertiesReader.get("url"));
        wait(2);
    }

    public void wait (int waitTime){
        try {
            Thread.sleep(waitTime*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void moveToElement(WebElement element){
        Actions actions = new Actions(Browser.get());
        actions.moveToElement(element).perform();
    }
}
