package fileauthorities_API;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Discovery_API_Collections {
	
	@Test
	
	public void verifyFileAuthority()
	{
		
		Response resp = given()
		.accept(ContentType.XML)
		.when()
		.get("http://test.discovery.nationalarchives.gov.uk/API/fileauthorities/v1/collection/Family?direction=NEXT&includeCursor=true");
		System.out.println("The status cod is " +resp.asString());
		System.out.println("The status cod is " +resp.statusCode());
		if(resp.statusCode()==200){
			
			System.out.println("status code verified");
		}
			
			else
				
			{
				System.out.println("status code is not verified");
			}
		}
	
		
		
	     
	     
		
		
		
		
		
		
	}
	


