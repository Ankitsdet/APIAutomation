package APIStepDefinitions;

import java.util.Map; 

import APIUtils.RestAssuredUtils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.ArrayList;   
import java.util.List;



public class FeatureGlues {

	
	
	String baseUrl="http://api-aws-eu-qa-1.auto1-test.com";
	RestAssuredUtils raUtils=new RestAssuredUtils();
	Map <String,String> manufacturerResponseMap;
	Map <String,String> modelTypeResponseMap;
	Map <String,String> regDateResponseMap;
	List<String> manufacturerList ;
	List<String> modelList ;
	List<String> regDateList;
	
	@Given("^I get the brand list with below parameters$")
	public void i_get_the_brand_list_with_below_parameters(DataTable dataTable) {

		List<Map<String, String>> inputList= dataTable.asMaps(String.class, String.class);
		
		String brandResourceUrl=inputList.get(0).get("ResourceUrl");
		String securityKey=inputList.get(0).get("wa_key");
		System.out.println(brandResourceUrl+":"+securityKey);
		
		manufacturerResponseMap =raUtils.getMapOfResponse(baseUrl, brandResourceUrl, securityKey);
		manufacturerList = new ArrayList<String>(manufacturerResponseMap.values());	 
		System.out.println(manufacturerList);
		
	}

	@Then("^I validate brand dropdown values for Manufacturer field$")
	public void i_validate_brand_dropdown_values_with(){		
		 //selenium code to validate dropdown values with manufacturerList
		
	}

	@Given("^I get the model list with below parameters$")
	public void i_get_the_model_list_with_below_parameters(DataTable dataTable)  {
		List<Map<String, String>> inputList= dataTable.asMaps(String.class, String.class);
		
		String brandResourceUrl=inputList.get(0).get("ResourceUrl");
		String securityKey=inputList.get(0).get("wa_key");
		String manufacturerCode=inputList.get(0).get("manufacturer");
		if(manufacturerCode.equals(null)||manufacturerCode.isEmpty()||manufacturerCode.equals("")||manufacturerCode.equals("code1")){
			manufacturerCode=new ArrayList<String>(manufacturerResponseMap.keySet()).get(0);
		}		
		System.out.println(brandResourceUrl+" : "+securityKey+" : "+manufacturerCode);
		
		modelTypeResponseMap =raUtils.getMapOfResponse(baseUrl, brandResourceUrl, securityKey,manufacturerCode);
		modelList = new ArrayList<String>(modelTypeResponseMap.values());	 
		System.out.println(modelList);
	    
	}

	@Then("^I validate model dropdown values for 'Model Type' field$")
	public void i_validate_model_dropdown_values_with() throws Throwable {
	    // Write selenium code to validate the model list	    
	}

	@Given("^I get the initial registration dates with below parameters$")
	public void i_get_the_initial_registration_dates_with_below_parameters(DataTable dataTable) {
		List<Map<String, String>> inputList= dataTable.asMaps(String.class, String.class);
		
		String brandResourceUrl=inputList.get(0).get("ResourceUrl");
		String securityKey=inputList.get(0).get("wa_key");
		String manufacturerCode=inputList.get(0).get("manufacturer");
		String modelCode=inputList.get(0).get("main-type");
		if(manufacturerCode.equals(null)||manufacturerCode.isEmpty()||manufacturerCode.equals("")||manufacturerCode.equals("code1")){
			manufacturerCode=new ArrayList<String>(manufacturerResponseMap.keySet()).get(0);
		}
		if(modelCode.equals(null)||modelCode.isEmpty()||modelCode.equals("")||modelCode.equals("code1")){
			modelCode=new ArrayList<String>(modelTypeResponseMap.keySet()).get(0);
		}		
		System.out.println(brandResourceUrl+" : "+securityKey+" : "+manufacturerCode+" : "+modelCode);
		
		Map<String,String>regDateResponseMap =raUtils.getMapOfResponse(baseUrl, brandResourceUrl, securityKey,manufacturerCode,modelCode );
		regDateList = new ArrayList<String>(regDateResponseMap.values());	 
		System.out.println(regDateList);
	    
	}

	@Then("^I validate initial registration dropdown values for 'Registration Date' field$")
	public void i_validate_initial_registration_dropdown_values_with() {
	    // Write validation for 3rd dropdown field
	    
	}


	
	
	
	
	
}
