package stepDefination;

import org.junit.runner.RunWith;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefine {


@Given("Go to {string}")
public void go_to(String string) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(string);
}

@When("entered username {string} and password {string}")
public void entered_username_and_password(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(string);
	System.out.println(string2);
}

@When("user acess request is {string} and {string}")
public void user_acess_request_is_and(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(string);
	System.out.println(string2);
}

@Then("test login")
public void test_login() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("then");
}

@Then("Status code is {int}")
public void status_code_is(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(int1);
}
}
