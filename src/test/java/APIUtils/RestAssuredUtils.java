package APIUtils;

import java.util.HashMap; 
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredUtils {

	
	
	
public Map<String,String> getMapOfResponse(String baseUrl, String brandResourceUrl, String param1){
		
		RestAssured.baseURI=baseUrl;		
		RequestSpecification httpRequest = RestAssured.given().queryParam("wa_key", param1);
		Response response = httpRequest.request(Method.GET, brandResourceUrl);
		 String responseBody = response.getBody().asString();
		// System.out.println("Response Body is =>  " + responseBody);
		
		 JsonPath jsonPathEvaluator = response.jsonPath();
		 Map<String, String> brandKVs= new HashMap<>();				 
		 brandKVs= jsonPathEvaluator.getMap("wkda");
	
		 
		return brandKVs;
	}
	
public Map<String,String> getMapOfResponse(String baseUrl, String brandResourceUrl, String param1, String param2){
		
		RestAssured.baseURI=baseUrl;		
		RequestSpecification httpRequest = RestAssured.given().queryParam("wa_key", param1).queryParam("manufacturer", param2);
		Response response = httpRequest.request(Method.GET, brandResourceUrl);
		 String responseBody = response.getBody().asString();
		// System.out.println("Response Body is =>  " + responseBody);
		
		 JsonPath jsonPathEvaluator = response.jsonPath();
		 Map<String, String> modelKVs= new HashMap<>();				 
		 modelKVs= jsonPathEvaluator.getMap("wkda");
		 
		return modelKVs;
	}

public Map<String,String> getMapOfResponse(String baseUrl, String brandResourceUrl, String param1, String param2, String param3){
	
	RestAssured.baseURI=baseUrl;		
	RequestSpecification httpRequest = RestAssured.given().queryParam("wa_key", param1).queryParam("manufacturer", param2).queryParam("main-type", param3);
	Response response = httpRequest.request(Method.GET, brandResourceUrl);
	 String responseBody = response.getBody().asString();
//	 System.out.println("Response Body is =>  " + responseBody);
	
	 JsonPath jsonPathEvaluator = response.jsonPath();
	 Map<String, String> regDateKVs= new HashMap<>();				 
	 regDateKVs= jsonPathEvaluator.getMap("wkda");
	 	 
	return regDateKVs;
}


	
}
