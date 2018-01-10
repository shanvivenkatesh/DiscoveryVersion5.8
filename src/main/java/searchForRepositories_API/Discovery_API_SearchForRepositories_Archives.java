package searchForRepositories_API;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Discovery_API_SearchForRepositories_Archives {
	
	@Test
	
	public void verifySearchforRepositories()
	{
		
		Response resp = given()
		.accept(ContentType.JSON)
		.when()
		.get("http://test.discovery.nationalarchives.gov.uk/API/search/v1/archives?sps.repositoryTypes=Special&sps.searchQuery=*");
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
	


