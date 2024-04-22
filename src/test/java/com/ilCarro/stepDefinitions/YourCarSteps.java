package com.ilCarro.stepDefinitions;

import com.ilCarro.pages.BasePage;
import com.ilCarro.pages.YourCarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class YourCarSteps extends BasePage {
    public YourCarSteps(WebDriver driver) {
        super(driver);
    }
    @And("User clicks on City link")
    public void clicks_on_City_link(){
        new YourCarPage(driver).clicksOnCityLink("Tel-Aviv");
    }
//    @And("User enters valid data")
//    public void enters_valid_data(){
//        new YourCarPage(driver).entersValidData("04/22/2024");
//    }
    @Then("User clicks on Yalla button")
    public void clicks_on_Yalla_button(){
        new YourCarPage(driver).clicksOnYallaButton();
    }

}
