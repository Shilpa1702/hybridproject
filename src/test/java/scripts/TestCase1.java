package scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddToCart;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass{

	@Test
	public void tc1() 
	{
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillrarydemoapplication();
		Utilities.switchingTabs(driver);
		
		SkillraryDemoLoginPage sp=new SkillraryDemoLoginPage(driver);
		Utilities.mouseHover(driver,sp.getCoursebutotn());
		sp.seleniumTrainingTab();
		
		AddToCart a =new AddToCart(driver);
		Utilities.doubleClick(driver,a.getAddbtn());
		a.cartButton();
		
		Utilities.alertPopup(driver);
		
	}
	
}
