package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.CorejavaforseleniumTraining;
import pomPages.SkillraryLoginPage;

public class TestCae3 extends BaseClass{
	
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.searchTextField(pdata.getPropertydata("coursedata"));
		s.searchButton();
		
		CoreJavaPage cp=new CoreJavaPage(driver);
		cp.coreJavaSeleniumIcon();
		
		
		CorejavaforseleniumTraining w= new CorejavaforseleniumTraining(driver);
		

		Utilities.switchFrame(driver);
		Thread.sleep(5000);
		w.playButton();
		Thread.sleep(10000);
		w.pauseButton();
		w.addToWishlist();
		Utilities.switchbackFrame(driver);
		
		
		
		
		
	}


}
