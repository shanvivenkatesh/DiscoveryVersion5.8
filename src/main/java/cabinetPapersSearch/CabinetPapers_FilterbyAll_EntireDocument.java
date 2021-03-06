package cabinetPapersSearch;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import wrapper.Wrapper_methods;

public class CabinetPapers_FilterbyAll_EntireDocument extends Wrapper_methods{
	
	@Test
	public void cabinetSearch() throws IOException{
		
	
		launchDriver("http://test.nationalarchives.gov.uk/cabinetpapers/", "chrome");
		
		// start search
	
		clickbyXpath("//a[@class='btn']");
		//enter word
		enterTextById("all-words", "*");
		//select filter by document type and by default filter type is all
		//clickbyXpath("//input[@id='memoranda']");
		//select search Within entire document
		clickbyXpath("//input[@id='whole']");
		//click search
		clickbyXpath("(//input[@value='Search'])[1]");
		
		// filters
		String yourFliters = driver.findElementById("search-refine").getText();

		System.out.println(yourFliters);
		
		Assert.assertTrue(yourFliters.contains("Include content"));
		Assert.assertTrue(yourFliters.contains("CAB 23"));
		Assert.assertTrue(yourFliters.contains("CAB 24"));
		Assert.assertTrue(yourFliters.contains("CAB 65"));
		Assert.assertTrue(yourFliters.contains("CAB 66"));
		Assert.assertTrue(yourFliters.contains("CAB 67"));
		Assert.assertTrue(yourFliters.contains("CAB 68"));
		Assert.assertTrue(yourFliters.contains("CAB 128"));
		Assert.assertTrue(yourFliters.contains("CAB 129"));
		Assert.assertTrue(yourFliters.contains("CAB 181"));
		Assert.assertTrue(yourFliters.contains("CAB 195"));
		
		String actual = driver.findElementByLinkText("Return to Cabinet Papers website").getText();
		
		System.out.println(actual);
		
		Assert.assertEquals(actual, "Return to Cabinet Papers website");
		
		clickbyLinkText("Return to Cabinet Papers website");
		
		String actual_title = driver.getTitle();
		
		System.out.println("The title is "+actual_title);
		
		quitBrowser();
		
		

		
		
	}

}
