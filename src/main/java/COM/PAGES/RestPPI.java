package COM.PAGES;



import com.jayway.restassured.RestAssured;
import com.jayway.restassured.matcher.ResponseAwareMatcher;
import com.jayway.restassured.response.Response;

import io.restassured.path.json.JsonPath;

import static com .jayway.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.* ;

import org.testng.annotations.Test;

public class RestPPI {

	@Test
	public void LauncgAPI()
	{
		RestAssured.baseURI = "https://rahulshettyacademy.com" ;
		String response =given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(payLoad.Addplace()).when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP")).header("Server","Apache/2.4.18 (Ubuntu)").extract().response().asString();
		System.out.println(response);
		//To get place id so use a json
		
		JsonPath js = new JsonPath(response);
		
		String placeid =js.getString("place_id");
		
		System.out.println("placeid is =>"+ placeid);
				
	}

	
	
	
	
}
