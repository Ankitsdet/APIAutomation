package APIStepDefinitions;

import org.apache.xmlbeans.impl.tool.Extension.Param;
import org.junit.Test;

import com.atdd.utils.ReadXMLdata;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonMapFormatVisitor;
import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.JSONArray;
import org.json.JSONObject;

import static io.restassured.RestAssured.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;



public class HomePageAPIs {
	
	
	public void brandResponsecode(String manufacturerurl)
	{	
	
		Response serviceesponse= get(ReadXMLdata.getTestData("api", manufacturerurl));
		
		
		JSONObject obj_Json=new JSONObject(serviceesponse.asString());
	
		JSONObject values=	obj_Json.getJSONObject("wkda");
		
		JSONObject op= values.append("key", "value");
		
			boolean fef= op.toMap().containsValue("BMW");
			System.out.println(fef);
		
		
		
	//	String val=	(String) values.get("130");
		//JSONObject fhuehf= values.optJSONObject("130");
		
	
			
//			String brandname=	(String) values.get("130");
//			
//		
//		Response Modeltype=get("http://api-aws-eu-qa-1.auto1-test.com\r\n"
//				+ "/v1/car-types/main-types"+ brandname);
		
		
		
		
		

			
			//System.out.println("this is working fine : "+b);
			
			
		}
		
		
		
		
		
		 
		
		
		//System.out.println("ankit this is here "+ duwd);
		
		
//		System.out.println("thi is values "+ values);
//		System.out.println("ty f rgrg rg"+obj_Json.hashCode());
		
		//JSONArray brandnames= obj_Json.getJSONArray("wkda");
		
		//System.out.println(brandnames.getJSONObject(1)); 
		
		//System.out.println("Json array :"+ brandnames);
		
		
//		int length =brandnames.length();
//		System.out.println("brand names length "+length);
//		
//		for(int i=0; i<length;i++)
//		{
//			
//			System.out.println("json objet one by "+ names);
//			
//		}
			
		//JSON array_obj= brandnames.getJSONArray();
		
		//System.out.println(array_obj);
				

		
	

public void carmodels()
{
	
	Response serviceespo= get("http://api-aws-eu-qa-1.auto1-test.com/v1/car-types/main-types?manufacturer=130&wa_key=coding-puzzle-client-449cc9d");
	
	JSONObject carmodels=new JSONObject(serviceespo.asString());
	
	JSONObject modelsname=	carmodels.getJSONObject("wkda");
	
	boolean mymodelname= modelsname.toMap().containsValue("X7");
	System.out.println("car model name :"+ mymodelname);
}


public void carbuildsdates()
{
	
	Response carbuilddates= get("http://api-aws-eu-qa-1.auto1-test.com/v1/car-types/built-dates?manufacturer=130&main-type=X7&wa_key=coding-puzzle-client-449cc9d");
	
    JSONObject duilddatsres=new JSONObject(carbuilddates.asString());
	
	JSONObject builddates=	duilddatsres.getJSONObject("wkda");
	
	boolean buildyear= builddates.toMap().containsValue("2019");
	System.out.println("car build year :"+ buildyear);
}

//public Map<String,String> getMapOfResponse(String baseUrl, String brandResourceUrl, String param1){
//	
//	RestAssured.baseURI=baseUrl;		
//	RequestSpecification httpRequest = RestAssured.given().queryParam("wa_key", param1);
//	Response response = httpRequest.request(Method.GET, brandResourceUrl);
//	 String responseBody = response.getBody().asString();
//	 System.out.println("Response Body is =>  " + responseBody);
//	
//	 JsonPath jsonPathEvaluator = response.jsonPath();
//	 Map<String, String> brandKVs= new HashMap<>();				 
//	 brandKVs= jsonPathEvaluator.getMap("wkda");
//	 
//	
//	 
//	return brandKVs;
//}
//
//public Map<String,String> getMapOfResponse(String baseUrl, String brandResourceUrl, String param1, String param2){
//	
//	RestAssured.baseURI=baseUrl;		
//	RequestSpecification httpRequest = RestAssured.given().queryParam("wa_key", param1).queryParam("manufacturer", param2);
//	Response response = httpRequest.request(Method.GET, brandResourceUrl);
//	 String responseBody = response.getBody().asString();
//	 System.out.println("Response Body is =>  " + responseBody);
//	
//	 JsonPath jsonPathEvaluator = response.jsonPath();
//	 Map<String, String> modelKVs= new HashMap<>();				 
//	 modelKVs= jsonPathEvaluator.getMap("wkda");
//	 
//	return modelKVs;
//}
//
//public Map<String,String> getMapOfResponse(String baseUrl, String brandResourceUrl, String param1, String param2, String param3){
//
//RestAssured.baseURI=baseUrl;		
//RequestSpecification httpRequest = RestAssured.given().queryParam("wa_key", param1).queryParam("manufacturer", param2).queryParam("main-type", param3);
//Response response = httpRequest.request(Method.GET, brandResourceUrl);
// String responseBody = response.getBody().asString();
// System.out.println("Response Body is =>  " + responseBody);
//
// JsonPath jsonPathEvaluator = response.jsonPath();
// Map<String, String> regDateKVs= new HashMap<>();				 
// regDateKVs= jsonPathEvaluator.getMap("wkda");
// 	 
//return regDateKVs;
//}
//
//


}


