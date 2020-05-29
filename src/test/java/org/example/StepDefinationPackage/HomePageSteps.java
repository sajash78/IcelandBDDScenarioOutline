package org.example.StepDefinationPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.HomePage;

public class HomePageSteps {
             HomePage homePage = new HomePage();
    @Given("^user is on the home page of iceland food website$")
    public void user_is_on_the_home_page_of_iceland_food_website() throws Throwable {
        Thread.sleep(4000);
                homePage.gettheurl();

        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user try to find multiple \"([^\"]*)\"$")
    public void user_try_to_find_multiple(String item) throws Throwable {
                 homePage.search(item);
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^user should see all the relavent searched products\\.$")
    public void user_should_see_all_the_relavent_searched_products() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

}
