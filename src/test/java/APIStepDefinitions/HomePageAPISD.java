package APIStepDefinitions;

import com.atdd.pages.HomePageAPIs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageAPISD extends HomePageAPIs {

	
	private HomePageAPIs page;
	
	public HomePageAPISD()
	{
		page= new HomePageAPIs();
	}
	@Given("^I get the model list with \"([^\"]*)\"$")
	public void iGetTheModelListWith(String manufacturerurl) throws Throwable {
	   
		page.brandResponsecode(manufacturerurl);
		page.carmodels();
		page.carbuildsdates();
		
	}

	@Then("^I validate model dropdown values$")
	public void iValidateModelDropdownValues() throws Throwable {
	   
	
		
	}
	
}
