package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.webdriverutils.WebdriverUtils;

public class InchcapeHomePage
{

    @FindBy(xpath = "//h2") WebElement header;

    @FindBy(className = "px-input") WebElement regNumberField;

    public String getHeader(){
        WebdriverUtils.waitForElementToBeVisible(header);
        return header.getText().trim();
    }

}