package discovery.MYC_InvalidValues;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import wrapper.Wrapper_methods;

public class ValidationCheck_FondsWithNoNameOfCreators extends Wrapper_methods{
	
	@Test
	
	public void validationcheck() throws IOException, InterruptedException{
		
		launchDriver("http://test.manage-collections.nationalarchives.gov.uk/", "chrome");
		
		SingleSignOn();
		
		clickbyXpath("//table[@id='tblActions']/tbody/tr[1]");
		
		clickbyLinkText("Add a collection");
		
		Thread.sleep(3000);
		
		clickbyLinkText("Upload file");
		Thread.sleep(3000);
		clickbyXpath("//div[@class='breather']/label/strong");
		Thread.sleep(3000);
		Runtime.getRuntime().exec("./AUTOIT/FondsWithNoNameOfCreators.exe");
		Thread.sleep(3000);
		clickbyXpath("//input[@value='Upload']");
		Thread.sleep(3000);
		
		clickbyXpath("(//button[@class='discoveryPrimaryCallToActionLink'])[2]");
		Thread.sleep(3000);
		clickbyLinkText("See error report >");
		Thread.sleep(3000);
		String Actual_Error = getTextByXpath("(//div[@class='table table-responsive'])[2]");
		
		System.out.println(Actual_Error);
		Assert.assertTrue(Actual_Error.contains("Creator name required at 'fonds' level"));
		quitBrowser();
		
		
		
		
	}
	
	

}
