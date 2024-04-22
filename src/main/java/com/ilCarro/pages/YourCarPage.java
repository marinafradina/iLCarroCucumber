package com.ilCarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCarPage extends BasePage {
    public YourCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "city")
    WebElement cityInput;

    public YourCarPage clicksOnCityLink(String city) {
        type(cityInput, city);
        return this;
    }

    @FindBy(css = "[for='dates']")
    WebElement dataInput;

    public YourCarPage entersValidData(String data) {
        type(dataInput, data);
        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement yallaButton;

    public YourCarPage clicksOnYallaButton() {
        click(yallaButton);
        return this;
    }

}
