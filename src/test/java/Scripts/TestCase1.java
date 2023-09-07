package Scripts;

import org.testng.annotations.Test;

import POM.AddtocartPage;
import POM.SkillraryDemoLoginPage;
import POM.SkillraryLoginPage;
import genericLibrary.BaseClass;

public class TestCase1 extends BaseClass 
{
	@Test
	public void tc1()
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		utils.switchingtabs(driver);
		
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utils.mouseHover(driver,sd.getCoursetab());
		sd.seleniumtrainingtab();
		
		AddtocartPage d=new AddtocartPage(driver);
		utils.doubleClick(driver,d.getPlusIcon());
		d.addtocartBtn();
		utils.switchFrame(driver);
	}
	
	

}
