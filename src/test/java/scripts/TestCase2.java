package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass {

	@Test
	public void tc2() throws IOException
	{
		 SkillraryLoginPage s=  new SkillraryLoginPage(driver);
		 s.gearsButton();
		 s.skillrarydemoapplication();
		 
		 SkillraryDemoLoginPage sp = new SkillraryDemoLoginPage(driver);
		 Utilities.switchingTabs(driver);
		 Utilities.dropdown(sp.getCoursedd(), pdata.getPropertydata("coursedd"));
		 
		 TestingPage tp=new TestingPage(driver);
		 Utilities.dragDrop(driver,tp.getSeleniumtraining(),tp.getCarttab());
		 Point fb = tp.getFacebook().getLocation();
		 int x=fb.getX();
		 int y=fb.getY();
		 Utilities.scrollBar(driver, x,y);
		 
		 tp.facebookIcon();
		 
		 
		 
		 
		 
		 
	}
	
}
