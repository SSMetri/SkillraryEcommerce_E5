package Scripts;

import org.testng.annotations.Test;

import POM.SkillraryDemoLoginPage;
import POM.SkillraryLoginPage;
import POM.TestingPage;
import genericLibrary.BaseClass;

public class TestCase2 extends BaseClass
{
	@Test
	public void tc2() throws Throwable
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();

		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utils.switchingtabs(driver);
		utils.dropDown(sd.getCoursedd(),pdata.getPropertydata("coursedd"));
		TestingPage tp=new TestingPage(driver);
		utils.dragdrop(driver, tp.getSeleniumTraing(), tp.getCarttab());;
		Thread.sleep(2000);
	}

}
