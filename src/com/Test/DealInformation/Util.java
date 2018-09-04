package com.Test.DealInformation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributes;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import okhttp3.internal.platform.Platform;
import pagefactory.ArtifactUI;
import pagefactory.DTTPage;
import pagefactory.Deal_InformationPage;
import pagefactory.EnablePeoplePage;
import pagefactory.ProjectAccessUI;
import pagefactory.ProjectPlanActuals;
import pagefactory.ProjectStaffingActuals;
import pagefactory.TrainTheTrainePage;
import pagefactory.TransItUIMap;
import pagefactory.UserAccessPage;
import pagefactory.UserAccessPage;
import pagefactory.user_Role_Elements;
import util.ConfigReader;
import util.ConfigReader2;

public class Util {
	public WebDriver driver;

	Properties prop;

	WebDriverWait wait;

	user_Role_Elements user_role = new user_Role_Elements();
	Deal_InformationPage dealInfopage = new Deal_InformationPage();
	ProjectPlanActuals projectplan = new ProjectPlanActuals();
	ConfigReader conf = new ConfigReader();
	ConfigReader2 conf2 = new ConfigReader2();
	TransItUIMap login = new TransItUIMap();

	ExtentReports extent;
	ExtentTest logger;
	SoftAssert softAssertion = new SoftAssert();
	Logger log = Logger.getLogger("devpinoyLogger");

	//SoftAssert softAssertion = new SoftAssert();

	ArtifactUI Artlogin = new ArtifactUI(); 
	ProjectAccessUI projectuserUI=new ProjectAccessUI();
	ProjectStaffingActuals projectstaff=new ProjectStaffingActuals();
	EnablePeoplePage enablpplwrkstm=new EnablePeoplePage();
	TrainTheTrainePage trainTheTrainer = new TrainTheTrainePage();
	UserAccessPage UserAccess=new UserAccessPage();
	DTTPage delTeamTrain = new DTTPage();
	/*
	 * Description :- This method provides the utility for instantiating and
	 * launching the browser
	 */


	public void setupmethod() {


		String service = conf.getservicestring();
		System.setProperty("webdriver.chrome.driver", service);

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		user_role = PageFactory.initElements(driver, user_Role_Elements.class);


		login= PageFactory.initElements(driver, TransItUIMap.class);
		Artlogin = PageFactory.initElements(driver, ArtifactUI.class);
		dealInfopage = PageFactory.initElements(driver, Deal_InformationPage.class);
		projectplan = PageFactory.initElements(driver,ProjectPlanActuals.class);
		projectuserUI = PageFactory.initElements(driver, ProjectAccessUI.class);
		projectstaff=PageFactory.initElements(driver, ProjectStaffingActuals.class);
		enablpplwrkstm=PageFactory.initElements(driver, EnablePeoplePage.class);
		trainTheTrainer=PageFactory.initElements(driver, TrainTheTrainePage.class);
		UserAccess=PageFactory.initElements(driver,UserAccessPage.class);
		delTeamTrain=PageFactory.initElements(driver, DTTPage.class);
	}



	public void drivers1(String string)
	{
		extent= new ExtentReports(string,true);
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	}

	/*
	 * Description :- This method will login into the application based on the
	 * credentials given
	 */


	public void login() throws InterruptedException {

		Thread.sleep(2000);
		if (driver.getCurrentUrl().contains(
				"federation-sts-stage.accenture.com"))

		{
			wait.until(ExpectedConditions.visibilityOf(user_role.getUsername()));
			user_role.getUsername().sendKeys(conf.getUserName());

			user_role.getpassword().sendKeys(conf.getPassWord());
			user_role.getsubmitbutton().click();

		}

		//wait.until(ExpectedConditions.visibilityOf(user_role.gethomepagecard()));

		//Thread.sleep(2000);

	}

	/*	
	 * 
	 * 
	 * Description : Following Validate Methods are to validate the Transition Lead Role Access in Plan Module
	 * 
	 */

	//alphabetical order checking    
	public static boolean comp_order_Asc(LinkedList<String> pn)    
	{           
		String prev=""; // empty string    
		for (final String cur: pn)    
		{    
			if (cur.compareTo(prev) < 0)            //auto<""      
			{      
				return false;     
			}    
			prev=cur;    
		}    
		return true;    
	}  

	public static boolean comp_order_Desc(LinkedList<String> pn1)    
	{           
		String prev=""; // empty string    
		for (final String cur: pn1)    
		{    
			if (prev.compareTo(cur) < 0)    
			{                              
				return true;     
			}    
			prev=cur;    
		}    
		return false;    
	}  



	public boolean ReadWriteAccessforProjectUserAccess() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getExportButton().isDisplayed() && UserAccess.getImportButton().isDisplayed() && UserAccess.getAddButton().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;

		}

		return status;
	}

	public boolean CRUDAccess()
	{
		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getExportButton().isDisplayed() && UserAccess.getImportButton().isDisplayed() && UserAccess.getAddButton().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;

		}

		return status;
	}
	
	
	public boolean feedback()
	{
		boolean status = false;
		wait = new WebDriverWait(driver,20);
		try
		{
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='0kbtn' and text()='Provide Feedback']")));
			Thread.sleep(2000);
			driver.switchTo().activeElement().sendKeys(Keys.ESCAPE);
			Thread.sleep(2000);
		}

		catch(Exception E)
		{
			return status=false;

		}

		return status;
	}

	public void EPAddActivity() throws InterruptedException
	{
		Actions builder = new Actions(driver);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		By loadingImage = By.xpath("//div[@id='imgMppDiv']");
		Thread.sleep(2000);
		enablpplwrkstm.getAddActivitybutton().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		Actions ActivityTextbox = builder.moveToElement(enablpplwrkstm.getAddActivitywthActvtytxtbox()).click().sendKeys(enablpplwrkstm.getAddActivitywthActvtytxtbox(), "AtomationAct");
		ActivityTextbox.perform();
		enablpplwrkstm.getAddActivtyPlandstrtdate().sendKeys("06/12/2018");
		enablpplwrkstm.getAddActivtyPlandEnddate().sendKeys("06/19/2018");
		Actions ActivityOwner1 = builder.moveToElement(enablpplwrkstm.getActivityOwnerId()).click().sendKeys(enablpplwrkstm.getActivityOwnerId(), "santhana.kanniyappan");
		ActivityOwner1.perform();
		enablpplwrkstm.getAddActivtySavebtn().click();
		wait.until(ExpectedConditions.visibilityOf(enablpplwrkstm.getEditActivityOkbtn()));
		enablpplwrkstm.getEditActivityOkbtn().click();

		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

	}

	public void EPEditActivity() throws InterruptedException
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		Actions builder = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOf(enablpplwrkstm.getActivitytableEditbtnclick()));
		Thread.sleep(2000);
		enablpplwrkstm.getActivitytableEditbtnclick().click();
		enablpplwrkstm.getEditActivityCompletionperctge().clear();
		Actions ActivityComplete1 = builder.moveToElement(enablpplwrkstm.getEditActivityCompletionperctge()).click().sendKeys(enablpplwrkstm.getEditActivityCompletionperctge(), "46");
		ActivityComplete1.perform();

		enablpplwrkstm.getEditActivitySavebtn().click();
		Thread.sleep(1000);
		enablpplwrkstm.getEditActivityOkbtn().click();
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
	}

	public void SDOAdd() throws InterruptedException
	{
		Actions builder = new Actions(driver);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		Thread.sleep(2000);
		enablpplwrkstm.getSDOAddresource().click();
		Thread.sleep(2000);
		builder.moveToElement(enablpplwrkstm.getAddresrcePlannedlevel()).click().perform();
		while(!driver.switchTo().activeElement().getText().contains("Accenture Leadership"))
		{
			driver.switchTo().activeElement().sendKeys(Keys.DOWN);
		}
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);

		builder.moveToElement(enablpplwrkstm.getAddresrceSkillCategory()).click().perform();
		while(!driver.switchTo().activeElement().getText().contains("Voice"))
		{
			driver.switchTo().activeElement().sendKeys(Keys.DOWN);
		}
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);

		builder.moveToElement(enablpplwrkstm.getAddresrceLocation()).click().perform();
		while(!driver.switchTo().activeElement().getText().contains("Austin"))
		{
			Thread.sleep(1000);
			driver.switchTo().activeElement().sendKeys(Keys.DOWN);
		}
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);	

		Thread.sleep(2000);
		builder.moveToElement(enablpplwrkstm.getAddresrceSerialNo()).click().sendKeys("40").perform();
		builder.moveToElement(enablpplwrkstm.getAddresrceEffort()).click().perform();
		
		enablpplwrkstm.getAddresrceSavebtn().click();
		wait.until(ExpectedConditions.visibilityOf(enablpplwrkstm.getAddresrceOKbtn()));
		enablpplwrkstm.getAddresrceOKbtn().click();
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
	}


	public void SDOEdit() throws InterruptedException
	{
		Actions builder = new Actions(driver);
		SoftAssert softAssertion=new SoftAssert();
		Thread.sleep(2000);
		enablpplwrkstm.getSDOEditSecondrow().click();
		enablpplwrkstm.getAddresrceSerialNo().clear();
		builder.moveToElement(enablpplwrkstm.getAddresrceSerialNo()).click().sendKeys(enablpplwrkstm.getAddresrceSerialNo(), "20").perform();

		enablpplwrkstm.getAddresrceSavebtn().click();
		Thread.sleep(2000);
		enablpplwrkstm.getAddresrceOKbtn().click();
		Thread.sleep(2000);

		softAssertion.assertEquals(enablpplwrkstm.getSDOSDOEditUpdateddata().getText(),"26", "Data is not updated successfully");
		softAssertion.assertAll();
	}

	public void SDOExport() throws InterruptedException, IOException
	{
		enablpplwrkstm.getSDOexporticon().click();
		String cardnumber=	"10589652 | Adidas";
		String carddate=	"AutomationMay2018";

		boolean count1 = ReadSDOStaffExcel(cardnumber,carddate);

		if (count1 == true) {
			System.out.println("Excel downloaded");
		} else {

			System.out.println("Excel Download failed");
			//log.info("Excel Download failed");
		}

	}

	public void SDOImport() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		String cardnumber=	"10589652 | Adidas";
		String carddate=	"AutomationMay2018";
		String sdofile = getexactfilenameforSDOStaff(cardnumber, carddate);
		String filelocation= conf.getfilelocation();
		System.out.println(filelocation);
		System.out.println(sdofile);


		enablpplwrkstm.getSDOImport().click();		
		enablpplwrkstm.getSDOImportWindow().sendKeys(filelocation+"/"+sdofile);
		Thread.sleep(2000);
		enablpplwrkstm.getSDOUploadBtn().click();
		Thread.sleep(2000);

	}

	public void EPTravelTrackerAdd() throws InterruptedException
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		Actions builder = new Actions(driver);
		enablpplwrkstm.getTraveltrackerAddresrce().click();
		Thread.sleep(2000);
		builder.moveToElement(enablpplwrkstm.getTTAddresEntrpriseId()).click().sendKeys("bhagyalaxmi.sahu").build().perform();
		builder.moveToElement(enablpplwrkstm.getTTAddresFirstName()).click().sendKeys("Bhagyalaxmi").build().perform();
		builder.moveToElement(enablpplwrkstm.getTTAddresLastName()).click().sendKeys("Sahu").build().perform();
		builder.moveToElement(enablpplwrkstm.getTTAddresTravelTo()).click().sendKeys("Spain").build().perform();
		builder.moveToElement(enablpplwrkstm.getTTAddResPlandstrtdt()).click().sendKeys("07/03/2018").build().perform();
		builder.moveToElement(enablpplwrkstm.getTTAddResPlandenddt()).click().sendKeys("07/29/2018").build().perform();
		builder.moveToElement(enablpplwrkstm.getTTAddResVisaType()).click().build().perform();
		while(!driver.switchTo().activeElement().getText().contains("Schengen"))
		{
			driver.switchTo().activeElement().sendKeys(Keys.DOWN);
		}
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);

		enablpplwrkstm.getTTAddResSavebtn().click();
		wait.until(ExpectedConditions.visibilityOf(enablpplwrkstm.getTTAddResSaveOkbtn()));
		enablpplwrkstm.getTTAddResSaveOkbtn().click();
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
	}

	public void EPTravelTrackerEdit() throws InterruptedException
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		Actions builder = new Actions(driver);
		SoftAssert softAssertion =new SoftAssert();
		enablpplwrkstm.getTTEditThirdrow().click();
		Thread.sleep(1000);
		enablpplwrkstm.getTTAddresLastName().clear();
		builder.moveToElement(enablpplwrkstm.getTTAddresLastName()).click().sendKeys(enablpplwrkstm.getTTAddresLastName(),"DemoUpdate").perform();
		enablpplwrkstm.getTTAddResSavebtn().click();
		wait.until(ExpectedConditions.visibilityOf(enablpplwrkstm.getTTAddResSaveOkbtn()));
		enablpplwrkstm.getTTAddResSaveOkbtn().click();
		softAssertion.assertEquals(enablpplwrkstm.getTTUpdatedcolumn().getText(),"DemoUpdate","Column is not updated");
		softAssertion.assertAll();
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

	}

	public void EPTravelTrackerExport() throws IOException
	{

		
		UserAccess.getTTExportButton().click();
		String cardnumber=	"10589652 | Adidas";
		String carddate=	"AutomationMay2018";
		boolean count2 = ReadTTExcel(cardnumber,carddate);

		if (count2 == true) {
			System.out.println("Excel downloaded with the required format");
		} else {

			System.out.println("Excel Download failed");
			//log.info("Excel Download failed");
		}


	}

	public void EPTravelTrackerImport() throws InterruptedException
	{
		Thread.sleep(2000);
		String cardnumber=	"10589652 | Adidas";
		String carddate=	"AutomationMay2018";
		String TTfile = getexactfilenameforTraveTracker(cardnumber, carddate);
		String filelocation= conf.getfilelocation();
		System.out.println(filelocation);
		System.out.println(TTfile);

		enablpplwrkstm.getTTImport().click();		
		enablpplwrkstm.getSDOImportWindow().sendKeys(filelocation+"/"+TTfile);
		Thread.sleep(2000);
		enablpplwrkstm.getSDOUploadBtn().click();
		Thread.sleep(2000);

	}
	public void AddRoleProjUserAccess() throws InterruptedException
	{

		Actions builder=new Actions(driver);
		UserAccess.getAddButton().click();
		driver.findElement(By.xpath("*//input[@id='projUserName']")).sendKeys("guillermo.g.salao.jr$$$$$$");


		projectuserUI.getAddRoletouser().click();
		while(!driver.switchTo().activeElement().getText().contains("Client-Transition Manager"))
		{
			driver.switchTo().activeElement().sendKeys(Keys.DOWN);
		}
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		builder.moveToElement(projectuserUI.getAddLocation()).click().perform();
		while(!driver.switchTo().activeElement().getText().contains("AAPAC Client Location"))
		{
			driver.switchTo().activeElement().sendKeys(Keys.DOWN);
		}
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		builder.moveToElement(projectuserUI.getAddDealWave1()).click().perform();
		while(!driver.switchTo().activeElement().getText().contains("Deal"))
		{
			driver.switchTo().activeElement().sendKeys(Keys.DOWN);
		}
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		builder.moveToElement(projectuserUI.getAddSourcing1()).click().perform();
		while(!driver.switchTo().activeElement().getText().contains("Mobilisation"))
		{
			driver.switchTo().activeElement().sendKeys(Keys.DOWN);
		}
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		builder.moveToElement(projectuserUI.getAddStatus1()).click().perform();
		while(!driver.switchTo().activeElement().getText().contains("Active"))
		{
			driver.switchTo().activeElement().sendKeys(Keys.DOWN);
		}
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		builder.moveToElement(projectuserUI.getProjectSupervisorinputfield()).click().sendKeys("derek.gotko$$$$$$").perform();
		driver.findElement(By.xpath("*//div//a[@role='button' and text()='Save']")).click();
		wait.until(ExpectedConditions.visibilityOf(UserAccess.getSaveOkbtn()));
		UserAccess.getSaveOkbtn().click();
		for(int i=0;i<UserAccess.getAddedRoleinPrjUserAccess().size();i++)
		{
			if(UserAccess.getAddedRoleinPrjUserAccess().get(i).getText() == "guillermo.g.salao.jr$$$$$$")
			{
				logger.log(LogStatus.PASS, "Added row is present in the table");	
				continue;
			}
			else
			{
				logger.log(LogStatus.FAIL, "Added row is not present in the table");	
			}
		}

	}

	public void EditRoleProjUserAccess() throws InterruptedException
	{
		UserAccess.getUserAccessEdit().click();
		UserAccess.getAddSourcing().click();
		Thread.sleep(2000);
		while(!driver.switchTo().activeElement().getText().contains("Mobilisation"))
		{
			driver.switchTo().activeElement().sendKeys(Keys.UP);
		}
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("*//div//a[@role='button' and text()='Save']")).click();
		wait.until(ExpectedConditions.visibilityOf(UserAccess.getSaveOkbtn()));
		UserAccess.getSaveOkbtn().click();

		if(UserAccess.getProjctUserAccessEditCheck().getText() == "Mobilisation")
		{
			logger.log(LogStatus.PASS, "Added row is present in the table");	
		}
		else
		{
			logger.log(LogStatus.FAIL, "Added row is not present in the table");	
		}

	}

	public void ProjUserAccessExport() throws IOException
	{
		UserAccess.getExportButton().click();

		String cardnumber=	"10589652 | Adidas";
		String carddate=	"AutomationMay2018";

		boolean count1 = ReadProjUserAccessExcel(cardnumber,carddate);

		if (count1 == true) {
			System.out.println("Excel downloaded");
		} else {

			System.out.println("Excel Download failed");
			//log.info("Excel Download failed");
		}

	}

	public void ProjUserAccessImport() throws IOException, InterruptedException
	{
		String cardnumber=	"10589652 | Adidas";
		String carddate=	"AutomationMay2018";
		String projuseaccessfile = getexactfilenameforProjectUserAccess(cardnumber, carddate);
		String filelocation= conf.getfilelocation();
		System.out.println(filelocation);
		System.out.println(projuseaccessfile);
		UserAccess.getImportButton().click();		
		enablpplwrkstm.getSDOImportWindow().sendKeys(filelocation+"/"+projuseaccessfile);
		Thread.sleep(2000);
		enablpplwrkstm.getSDOUploadBtn().click();
		Thread.sleep(2000);	
		driver.switchTo().activeElement().sendKeys(Keys.ESCAPE);
		Thread.sleep(2000);
	}


	public void AddArtifacts()
	{

		{
			UserAccess.getAddArtifacts().click();
			UserAccess.getSharepointLocatn().sendKeys("http://oogle.com");
			UserAccess.getFileName().sendKeys("Demo");
			try
			{
				if(UserAccess.getFileCategory().isDisplayed())
				{
					UserAccess.getFileCategory().sendKeys("Demo");
				}
			}
			catch(Exception E)
			{
				System.out.println("");
			}
			UserAccess.getSavebtn().click();
			wait.until(ExpectedConditions.visibilityOf(UserAccess.getSaveOkbtn()));
			UserAccess.getSaveOkbtn().click();
			for(int i=0;i<UserAccess.getAddedArtifact().size();i++)
			{
				if(UserAccess.getAddedArtifact().get(i).getText() == "Demo")
				{
					logger.log(LogStatus.PASS, "Added row is present in the table");	
				}
				else
				{
					logger.log(LogStatus.FAIL, "Added row is not present in the table");	
				}
			}


		}

	}

	public void EditArtifacts() throws InterruptedException
	{
		Actions builder=new Actions(driver);
		Thread.sleep(2000);
		UserAccess.getUserAccessEdit().click();
		UserAccess.getFileName().clear();
		builder.moveToElement(UserAccess.getFileName()).click().sendKeys("DemoUpdate").perform();
		try
		{
			if(UserAccess.getFileCategory().isDisplayed())
			{
				builder.moveToElement(UserAccess.getFileCategory()).click().sendKeys("DemoUpdate").perform();
			}
		}
		catch(Exception E)
		{
			System.out.println("");
		}
		UserAccess.getSavebtn().click();
		wait.until(ExpectedConditions.visibilityOf(UserAccess.getSaveOkbtn()));
		builder.moveToElement(UserAccess.getSaveOkbtn()).click().perform();
		if(UserAccess.getEditedArtifactCheck().getText()=="DemoUpdate")
		{
			logger.log(LogStatus.PASS, "Edit functionality is working properly");
		}
		else
		{
			logger.log(LogStatus.FAIL, "Edit functionality is working properly");
		}


	}



	public void AddProjWrkStrm() throws InterruptedException
	{

		{
			Actions builder = new Actions(driver);
			UserAccess.getAddProjWrkstrm().click();
			UserAccess.getProjLvlWrkstrm().sendKeys("NewWave");
			Thread.sleep(2000);
			builder.moveToElement(UserAccess.getPlannedstrtdt()).click().sendKeys("7/24/2018").perform();
			builder.moveToElement(UserAccess.getPlannedenddt()).click().sendKeys("7/31/2018").perform();
			UserAccess.getSavebtn().click();
			wait.until(ExpectedConditions.visibilityOf(UserAccess.getSaveOkbtn()));
			UserAccess.getSaveOkbtn().click();
			for(int i=0;i<UserAccess.getAddedArtifact().size();i++)
			{
				if(UserAccess.getAddedArtifact().get(i).getText() == "Demo")
				{
					logger.log(LogStatus.PASS, "Added row is present in the table");	
				}
				else
				{
					logger.log(LogStatus.FAIL, "Added row is not present in the table");	
				}
			}


		}

	}

	public void AddWave() throws InterruptedException
	{

		{
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			Actions builder = new Actions(driver);
			UserAccess.getAddWaveBtn().click();

			Thread.sleep(2000);
			UserAccess.getTransitionType().click();

			while(!driver.switchTo().activeElement().getText().contains("Internal Transition"))
			{
				driver.switchTo().activeElement().sendKeys(Keys.DOWN);
			}
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			builder.moveToElement(UserAccess.getWavename()).click().sendKeys("Demo12").perform();

			builder.moveToElement(UserAccess.getOffering()).click().sendKeys("HR Services").sendKeys(Keys.ENTER).build().perform();
			builder.moveToElement(UserAccess.getFunction()).click().sendKeys("Payroll").sendKeys(Keys.ENTER).build().perform();

			Thread.sleep(2000);
			builder.moveToElement(UserAccess.getTechnology()).click().sendKeys("Process Post-Payroll for each pay cycle").sendKeys(Keys.ENTER).build().perform();

			builder.moveToElement(UserAccess.getSendingLocatn()).click().sendKeys("Andorra").sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			UserAccess.getRecevngLocation().click();

			while(!driver.switchTo().activeElement().getText().contains("Austin"))
			{
				driver.switchTo().activeElement().sendKeys(Keys.DOWN);
			}
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);

			UserAccess.getGoLiveDate().sendKeys("07/31/2018");
			UserAccess.getOnBoardDate().sendKeys("07/24/2018");
			UserAccess.getBaseFte().sendKeys("2");
			UserAccess.getBufferFte().sendKeys("4");
			UserAccess.getSavebtn().click();
			Thread.sleep(2000);
			List<WebElement> pagination =driver.findElements(By.xpath("//ul[@class='k-pager-numbers k-reset']//li")); 


			WebElement NextButton= driver.findElement(By.xpath("//a[@title='Go to the next page']"));

			WebElement prevButton= driver.findElement(By.xpath("//a[@title='Go to the previous page']"));

			// checkif pagination link exists
			if(pagination.size()>0)
			{ 
				System.out.println("pagination exists"); 

				// click on pagination link 

				for(int i=1; i <pagination.size(); i++)
				{ 

					//Check if nextbutton is enable or not.
					if(NextButton.isEnabled()) 
					{

						NextButton.click();
					}

				}
			}
			for(int i=0;i<UserAccess.getAddedWave().size();i++)
			{
				if(UserAccess.getAddedWave().get(i).getText().equalsIgnoreCase("Demo10"))
				{
					logger.log(LogStatus.PASS, "Added row is present in the table");	
					continue;
				}
				else
				{
					logger.log(LogStatus.FAIL, "Added row is not present in the table");	
				}
			}

			js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		}

	}

	public void EditWaveWrkstrm() throws InterruptedException
	{

		{
			Actions builder = new Actions(driver);
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOf(UserAccess.getUserAccessEdit()));
			UserAccess.getUserAccessEdit().click();

			Thread.sleep(2000);
			UserAccess.getRecevngLocation().click();

			while(!driver.switchTo().activeElement().getText().contains("Austin"))
			{
				driver.switchTo().activeElement().sendKeys(Keys.UP);
			}
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);

			UserAccess.getSavebtn().click();
			wait.until(ExpectedConditions.visibilityOf(UserAccess.getSaveOkbtn()));
			UserAccess.getSaveOkbtn().click();
			WebElement Languagge=driver.findElement(By.xpath("//table[@role='grid']//tbody//tr//td[9]"));
			Thread.sleep(2000);
			builder.moveToElement(Languagge).click().perform();

			System.out.println(UserAccess.getWaveWrkstrmeditcheck().getText());
			System.out.println(UserAccess.getWaveWrkstrmeditcheck().getAttribute("text"));
			if(UserAccess.getWaveWrkstrmeditcheck().getText().equalsIgnoreCase("Austin"))
			{
				logger.log(LogStatus.PASS, "Able to edit successfully");	
			}
			else
			{
				logger.log(LogStatus.FAIL, "Edit funtionality for wave workstream is not working properly");	
			}

			js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

		}

	}

	public void EditProjeWrkstrm() throws InterruptedException
	{

		{

			Actions builder=new Actions(driver);
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			UserAccess.getUserAccessEdit().click();
			UserAccess.getPlannedstrtdt().clear();
			Thread.sleep(2000);
			builder.moveToElement(UserAccess.getPlannedstrtdt()).click().sendKeys("6/1/2016").perform();


			UserAccess.getSavebtn().click();
			wait.until(ExpectedConditions.visibilityOf(UserAccess.getSaveOkbtn()));
			UserAccess.getSaveOkbtn().click();
			Thread.sleep(2000);
			if(UserAccess.getProjwrkstrmLeveleditcheck().getText() == "6/1/2016")
			{
				logger.log(LogStatus.PASS, "Able to edit successfully");	
			}
			else
			{
				logger.log(LogStatus.FAIL, "Edit funtionality is not working properly");	
			}
			js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");


		}

	}

	public void EditWaveSetUp() throws InterruptedException
	{

		{
			Thread.sleep(2000);
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			Actions builder=new Actions(driver);
			js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
			UserAccess.getUserAccessEdit().click();
			Thread.sleep(2000);
			UserAccess.getTransitionType().click();
			Thread.sleep(2000);
			UserAccess.getRecevngLocation().click();

			while(!driver.switchTo().activeElement().getText().contains("Austin"))
			{
				driver.switchTo().activeElement().sendKeys(Keys.UP);
			}
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);

			UserAccess.getSavebtn().click();
			Thread.sleep(2000);
			//WebElement Languagge=driver.findElement(By.xpath("//span[@ng-bind='dataItem.rebadging']"));
			WebElement Languagge=driver.findElement(By.xpath("//table[@role='grid']//tbody//tr//td[8]"));
			builder.moveToElement(Languagge).click().perform();
			Thread.sleep(2000);


			if(UserAccess.getWaveSetUpeditcheck().getText().equalsIgnoreCase("Austin"))
			{
				logger.log(LogStatus.PASS, "Able to edit successfully");	
			}
			else
			{
				logger.log(LogStatus.FAIL, "Edit funtionality for Wave setup is not working properly");	
			}

			js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

		}

	}

	public void EditProjectStaffing() throws InterruptedException
	{

		{
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			UserAccess.getUserAccessEdit().click();

			Thread.sleep(2000);
			UserAccess.getProjectStaffingDealWave().click();
			while(!driver.switchTo().activeElement().getText().contains("Demo4"))
			{
				driver.switchTo().activeElement().sendKeys(Keys.DOWN);
			}
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);

			UserAccess.getSavebtn().click();
			wait.until(ExpectedConditions.visibilityOf(UserAccess.getSaveOkbtn()));
			UserAccess.getSaveOkbtn().click();

			Thread.sleep(2000);


			if(UserAccess.getProjectStaffingeditcheck().getText() == "Demo4")
			{
				logger.log(LogStatus.PASS, "Able to edit successfully");	
			}
			else
			{
				logger.log(LogStatus.FAIL, "Edit funtionality is not working properly");	
			}

			js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

		}

	}

	public void AddProjectStaffing() throws InterruptedException
	{

		{
			UserAccess.getAddbutton().click();

			Thread.sleep(2000);
			UserAccess.getProjectStaffingDealWaveAdd().click();
			while(!driver.switchTo().activeElement().getText().contains("waveBPO"))
			{
				driver.switchTo().activeElement().sendKeys(Keys.DOWN);
			}
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);

			projectuserUI.getAddRoletouser().click();
			while(!driver.switchTo().activeElement().getText().contains("Transition Lead"))
			{
				driver.switchTo().activeElement().sendKeys(Keys.DOWN);
			}
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);


			UserAccess.getProjStaffAddLevel().click();
			while(!driver.switchTo().activeElement().getText().contains("Accenture Leadership"))
			{
				driver.switchTo().activeElement().sendKeys(Keys.DOWN);
			}
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);

			UserAccess.getAddLocation().click();
			while(!driver.switchTo().activeElement().getText().contains("AAPAC Client Location"))
			{
				driver.switchTo().activeElement().sendKeys(Keys.DOWN);
			}
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			UserAccess.getAddSourcing().click();		
			while(!driver.switchTo().activeElement().getText().contains("Mobilisation"))
			{
				driver.switchTo().activeElement().sendKeys(Keys.DOWN);
			}
			driver.switchTo().activeElement().sendKeys(Keys.ENTER);
			UserAccess.getProjStaffSavebtn().click();
			wait.until(ExpectedConditions.visibilityOf(UserAccess.getSaveOkbtn()));
			UserAccess.getSaveOkbtn().click();

			Thread.sleep(2000);


			if(UserAccess.getProjectStaffingeditcheck().getText() == "waveBPO")
			{
				logger.log(LogStatus.PASS, "Able to edit successfully");	
			}
			else
			{
				logger.log(LogStatus.FAIL, "Edit funtionality is not working properly");	
			}

		}

	}


	public void AddActivity()
	{
		Actions builder=new Actions(driver);
		UserAccess.getAddActivity().click();

		UserAccess.getActvityTxtbox().sendKeys("DemoTest");
		UserAccess.getPlannedstrtdt1().sendKeys("7/24/2018");
		UserAccess.getPlannedenddt1().sendKeys("7/31/2018");
		UserAccess.getOwnerName().sendKeys("denise.obara$$$$$$");
		UserAccess.getSavebtn().click();
		wait.until(ExpectedConditions.visibilityOf(UserAccess.getSaveOkbtn()));
		UserAccess.getSaveOkbtn().click();
		for(int i=0;i<UserAccess.getAddedActivity().size();i++)
		{
			if(UserAccess.getAddedActivity().get(i).getText() == "DemoTest")
			{
				logger.log(LogStatus.PASS,"Added Actobity is visible in the table");
				continue;
			}
			else
			{
				logger.log(LogStatus.FAIL, "Add functionality is not working properly");
			}
		}
	}

	public void AddActivityExecSumm() throws InterruptedException
	{
		Actions builder=new Actions(driver);
		UserAccess.getAddActivity3().click();
		UserAccess.getActvityExecSumm().sendKeys("DemoAuto2");
		Thread.sleep(1000);
		UserAccess.getPlanStrtdtExecSumm().sendKeys("7/24/2018");
		UserAccess.getPlanEnddtExecSumm().sendKeys("7/31/2018");
		UserAccess.getOwnNmExecSumm().sendKeys("denise.obara$$$$$$");
		UserAccess.getSavebtn().click();
		wait.until(ExpectedConditions.visibilityOf(UserAccess.getSaveOkbtn()));
		UserAccess.getSaveOkbtn().click();
		for(int i=0;i<UserAccess.getAddedActivityMobilisation().size();i++)
		{
			if(UserAccess.getAddedActivityMobilisation().get(i).getText() == "DemoAuto")
			{
				logger.log(LogStatus.PASS,"Added Actobity is visible in the table");
				continue;
			}
			else
			{
				logger.log(LogStatus.FAIL, "Add functionality is not working properly");
			}
		}
	}

	public void EditActivity() throws InterruptedException
	{
		Actions builder=new Actions(driver);
		UserAccess.getCurrPUserAccessEdit().click();
		Thread.sleep(2000);
		UserAccess.getActvityTxtbox().clear();
		builder.moveToElement(UserAccess.getActvityTxtbox()).click().sendKeys("DemoEdit").perform();
		UserAccess.getSavebtn().click();
		wait.until(ExpectedConditions.visibilityOf(UserAccess.getSaveOkbtn()));
		UserAccess.getSaveOkbtn().click();
		for(int i=0;i<UserAccess.getAddedActivity().size();i++)
		{
			if(UserAccess.getAddedActivity().get(i).getText() == "DemoEdit")
			{
				logger.log(LogStatus.PASS,"Added Actobity is visible in the table");
				continue;
			}
			else
			{
				logger.log(LogStatus.FAIL, "Add functionality is not working properly");
			}
		}
	}

	public void EditActivityExecSumm() throws InterruptedException
	{
		Actions builder=new Actions(driver);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		UserAccess.getCurrPUserAccessEdit().click();

		UserAccess.getActvityExecSumm().clear();
		builder.moveToElement(UserAccess.getActvityExecSumm()).click().sendKeys("DemoEditedRow1").perform();
		UserAccess.getSavebtn().click();
		wait.until(ExpectedConditions.visibilityOf(UserAccess.getSaveOkbtn()));
		UserAccess.getSaveOkbtn().click();
		for(int i=0;i<UserAccess.getAddedActivityMobilisation().size();i++)
		{
			if(UserAccess.getAddedActivityMobilisation().get(i).getText() == "DemoEditedRow1")
			{
				logger.log(LogStatus.PASS,"Added Actobity is visible in the table");
				continue;
			}
			else
			{
				logger.log(LogStatus.FAIL, "Add functionality is not working properly");
			}
		}
	}
	public void WaveSetUpExport() throws IOException
	{


		UserAccess.getWaveExportButton().click();
		String cardnumber=	"10589652 | Adidas";
		String carddate=	"AutomationMay2018";

		boolean count1 = ReadWaveSetUpExcel(cardnumber,carddate);

		if (count1 == true) {
			System.out.println("Excel downloaded");
		} else {

			System.out.println("Excel Download failed");
			//log.info("Excel Download failed");
		}


	}

	public void ExecutionSummaryExport() throws IOException
	{

		By loadingImage = By.xpath("//div[@id='imgMppDiv']");
		UserAccess.getExecSummaryBookamrk().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		UserAccess.getExportButton().click();
		String cardnumber=	"10589652 | Adidas";
		String carddate=	"AutomationMay2018";

		boolean count1 = ReadExecutionSummaryExcel(cardnumber,carddate);

		if (count1 == true) {
			System.out.println("Excel downloaded");
		} else {

			System.out.println("Excel Download failed");
			//log.info("Excel Download failed");
		}


	}


	public void WaveSetUpImportFunction() throws InterruptedException
	{
		String cardnumber=	"10589652 | Adidas";
		String carddate=	"AutomationMay2018";
		String wavesetupfile = getexactfilenameforWaveSetUp(cardnumber, carddate);
		String filelocation= conf.getfilelocation();
		System.out.println(filelocation);
		System.out.println(wavesetupfile);
		UserAccess.getWaveImportButton().click();		
		enablpplwrkstm.getSDOImportWindow().sendKeys(filelocation+"/"+wavesetupfile);
		Thread.sleep(2000);
		enablpplwrkstm.getWaveSetUpUploadBtn().click();
		wait.until(ExpectedConditions.visibilityOf(UserAccess.getSaveOkbtn()));
		UserAccess.getSaveOkbtn().click();
		Thread.sleep(2000);	
	}

	public void WaveWrkstrmSetUpExport() throws IOException
	{


		UserAccess.getWaveWrkstrmExportButton().click();
		String cardnumber=	"10589652 | Adidas";
		String carddate=	"AutomationMay2018";

		boolean count1 = ReadWaveWorkStreamSetUpExcel(cardnumber,carddate);

		if (count1 == true) {
			System.out.println("Excel downloaded");
		} else {

			System.out.println("Excel Download failed");
			//log.info("Excel Download failed");
		}


	}


	public void WaveWrkstrmSetUpImport() throws InterruptedException
	{
		String cardnumber=	"10589652 | Adidas";
		String carddate=	"AutomationMay2018";
		String wavewrkstrmsetupfile = getexactfilenameWaveWrkstrmSetUp(cardnumber, carddate);
		String filelocation= conf.getfilelocation();
		System.out.println(filelocation);
		System.out.println(wavewrkstrmsetupfile);
		UserAccess.getWaveWrkstrmImportButton().click();		
		enablpplwrkstm.getSDOImportWindow().sendKeys(filelocation+"/"+wavewrkstrmsetupfile);
		Thread.sleep(2000);
		enablpplwrkstm.getWAveWrkstrmUploadBtn().click();
		wait.until(ExpectedConditions.visibilityOf(UserAccess.getSaveOkbtn()));
		UserAccess.getSaveOkbtn().click();
		Thread.sleep(2000);	

	}



	public void ProjPlanSetUpExport() throws IOException, InterruptedException
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		UserAccess.getPlanSetUpExportButton().click();
		UserAccess.getPlanSetUpExcelButton().click();

		String cardnumber=	"10589652 | Adidas";
		String carddate=	"AutomationMay2018";

		boolean count1 = ReadPlanSetUpExcel(cardnumber,carddate);

		if (count1 == true) {
			System.out.println("Excel downloaded");
		} else {

			System.out.println("Excel Download failed");
			//log.info("Excel Download failed");
		}

	}

	public void ProjPlanSetUpImport() throws IOException, InterruptedException
	{
		String cardnumber=	"10589652 | Adidas";
		String carddate=	"AutomationMay2018";
		String plansetupfile = getexactfilenameforPlanSetUp(cardnumber, carddate);
		String filelocation= conf.getfilelocation();
		System.out.println(filelocation);
		System.out.println(plansetupfile);
		UserAccess.getImportButton().click();		
		enablpplwrkstm.getSDOImportWindow().sendKeys(filelocation+"/"+plansetupfile);
		Thread.sleep(2000);
		enablpplwrkstm.getSDOUploadBtn().click();
		Thread.sleep(2000);	
		driver.switchTo().activeElement().sendKeys(Keys.ESCAPE);
		Thread.sleep(2000);
	}

	public void ProjStaffExport() throws IOException, InterruptedException
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		UserAccess.getPlanSetUpExportButton().click();
		String cardnumber=	"10589652 | Adidas";
		String carddate=	"AutomationMay2018";

		boolean count1 = ReadProjectstaffExcel(cardnumber,carddate);

		if (count1 == true) {
			System.out.println("Excel downloaded");
		} else {

			System.out.println("Excel Download failed");
			//log.info("Excel Download failed");
		}

	}

	public void ProjStaffImport() throws IOException, InterruptedException
	{
		String cardnumber=	"10589652 | Adidas";
		String carddate=	"AutomationMay2018";
		String projectartifactsfile = getexactfilenameforProjectStaff(cardnumber, carddate);
		String filelocation= conf.getfilelocation();
		System.out.println(filelocation);
		System.out.println(projectartifactsfile);
		UserAccess.getImportButton().click();		
		enablpplwrkstm.getSDOImportWindow().sendKeys(filelocation+"/"+projectartifactsfile);
		Thread.sleep(2000);
		enablpplwrkstm.getWaveSetUpUploadBtn().click();
		Thread.sleep(2000);	
		driver.switchTo().activeElement().sendKeys(Keys.ESCAPE);
		Thread.sleep(2000);
	}



	public boolean RUAccess()
	{
		boolean status = false;
		try
		{
			if(UserAccess.getAddButton().isDisplayed() == false)
			{
				if(UserAccess.getExportButton().isDisplayed() && UserAccess.getUserAccessEdit().isDisplayed() &&  UserAccess.getImportButton().isDisplayed() )
				{
					status=true;
				}
			}
		}

		catch(Exception E)
		{
			return status=false;

		}

		return status;
	}


	public boolean ReadAccess()
	{
		boolean status = false;
		try
		{

			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getImportButton().isDisplayed() && UserAccess.getAddButton().isDisplayed() == false)
			{
				if(UserAccess.getExportButton().isDisplayed())
				{
					status=true;
				}

			}

		}

		catch(Exception E)
		{
			return status=false;

		}

		return status;
	}



	public boolean WriteAccessforProjectUserAccess() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getExportButton().isDisplayed() && UserAccess.getImportButton().isDisplayed() && UserAccess.getAddButton().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}

	public boolean UpdateAccessforTransPlanProjWrkstrm() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getAddProjWrkstrm().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}

	public boolean UpdateAccessforTransPlanWaveSetUp() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getAddWaveBtn().isDisplayed() && UserAccess.getWaveExportButton().isDisplayed() && UserAccess.getWaveImportButton().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}

	public boolean UpdateAccessforTransPlanWaveWrkstrmnSetUp() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getWaveWrkstrmExportButton().isDisplayed() && UserAccess.getWaveWrkstrmImportButton().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}


	public boolean UpdateAccessforTransPlanGantt() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getTransPlanGanttchartExportButton().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}


	public boolean UpdateAccessforPlanProjectStaffing() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getProjectStaffAddRole().isDisplayed() && UserAccess.getExportButton().isDisplayed() && UserAccess.getImportButton().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}

	public boolean UpdateAccessforPlanProjectArtifacts() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getAddProjectArtifactsBtn().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}


	public boolean UpdateAccessforProjectSetUpCurrentProjPlan() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getCurrPUserAccessEdit().isDisplayed() && UserAccess.getExportButton().isDisplayed() && UserAccess.getImportButton().isDisplayed() && UserAccess.getAddActivity().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}

	public boolean UpdateAccessforMECChecklistTablelevel() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getTableLevelApprovalbtn().isDisplayed() && UserAccess.getTableLevelCheckboxes().isEnabled())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}

	public boolean UpdateAccessforMECChecklistButtonLevel() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getAddArtifacts().isDisplayed() && UserAccess.getDeletebutton().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}

	/*	
	 * 
	 * 
	 * Description : Following Validate Methods are to validate the Transition Lead Role Access in Execution Module
	 * Project Plan Screen
	 */

	public boolean UpdateAccessProjPlanActualsOverall() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getOverAllPUserAccessEdit().isDisplayed() && UserAccess.getexportButton().isDisplayed() && UserAccess.getImportButton().isDisplayed() )
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}


	/*	  
	 * Description : Following Validate Methods are to validate the Transition Lead Role Access in Execution Module
	 * Project Staffing Screen
	 */

	public boolean UpdateAccessProjStaffActuals() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getexportButton().isDisplayed() && UserAccess.getImportButton().isDisplayed() && UserAccess.getProjectStaffAddRole().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}

	/*	  
	 * Description : Following Validate Methods are to validate the Transition Lead Role Access in Execution Module
	 * Execution Dashboard Screen
	 */
	public boolean UserAccessExecutionDash() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getExportButton().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}

	/*	  
	 * Description : Following Validate Methods are to validate the Transition Lead Role Access in Execution Module
	 * Enable People Activity Workstream
	 */

	public boolean UpdateAccessEPActivityWrkStrm() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getEPAddActivity().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}


	/*	  
	 * Description : Following Validate Methods are to validate the Transition Lead Role Access in Execution Module
	 * Enable People Service Delivery Workstream
	 */

	public boolean UpdateAccessEPSDWWrkStrm() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getEPAddResource().isDisplayed() && UserAccess.getExportButton().isDisplayed() && UserAccess.getImportButton().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}

	/*	  
	 * Description : Following Validate Methods are to validate the Transition Lead Role Access in Execution Module
	 * Enable People Travel Tracker Workstream
	 */
	public boolean UpdateAccessEPTTWrkStrm() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getEPAddResource().isDisplayed() && UserAccess.getTTExportButton().isDisplayed() && UserAccess.getTTImportButton().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}


	/*	  
	 * Description : Following Validate Methods are to validate the Transition Lead Role Access in Execution Module
	 * Train the Trainer Activity Workstream
	 */
	public boolean UpdateAccessTTTActivityWrkStrm() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getTTTAddActivity().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}


	/*	  
	 * Description : Following Validate Methods are to validate the Transition Lead Role Access in Execution Module
	 * Train the Trainer TTT Tracker Workstream
	 */
	public boolean UpdateAccessTTTWrkStrm() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getTTTAddTopic().isDisplayed() && UserAccess.getExportButton().isDisplayed() && UserAccess.getImportButton().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}

	/*	  
	 * Description : Following Validate Methods are to validate the Transition Lead Role Access in Execution Module
	 * Train the Trainer TTT Assessments Workstream
	 */
	public boolean UpdateAccessTTTAssesWrkStrm() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getTTTAddResource().isDisplayed() && UserAccess.getAssessmentExportButton().isDisplayed() && UserAccess.getTTTImportButton().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}

	/*	  
	 * Description : Following Validate Methods are to validate the Transition Lead Role Access in Execution Module
	 * Train the Trainer TTT Assessments Workstream
	 */  // Need to work on the below method
	public boolean UpdateAccessTTTApprovals() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getTTTAddResource().isDisplayed() && UserAccess.getExportButton().isDisplayed() && UserAccess.getImportButton().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}

	/*	  
	 * Description : Following Validate Methods are to validate the Transition Lead Role Access in Execution Module
	 * DTT Activity Workstream
	 */
	public boolean UpdateAccessDTTActivityWrkStrm() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getTTTAddActivity().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}

	/*	  
	 * Description : Following Validate Methods are to validate the Transition Lead Role Access in Execution Module
	 * DTT Tracker Workstream
	 */
	public boolean UpdateAccessDTTTrackerWrkStrm() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getDTTAddTopic().isDisplayed() && UserAccess.getExportButton().isDisplayed() && UserAccess.getImportButton().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}

	/*	  
	 * Description : Following Validate Methods are to validate the Transition Lead Role Access in Execution Module
	 * DTT Assessments Workstream
	 */

	public boolean UpdateAccessDTTAssessments() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getDTTAddResource().isDisplayed() && UserAccess.getDTTExportButton().isDisplayed() && UserAccess.getDTTImportButton().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}



	/*	  
	 * Description : Following Validate Methods are to validate the Transition Lead Role Access in Execution Module
	 * TWE Activity Workstream
	 */
	public boolean UpdateAccessTWEActivityWrkStrm() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getTWEAddActivity().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}

	/*	  
	 * Description : Following Validate Methods are to validate the Transition Lead Role Access in Execution Module
	 * TWE Tracker Workstream
	 */
	public boolean UpdateAccessTWETrackerWrkStrm() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getTTTAddItem().isDisplayed() && UserAccess.getExportButton().isDisplayed() && UserAccess.getImportButton().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}

	/*	  
	 * Description : Following Validate Methods are to validate the Transition Lead Role Access in Execution Module
	 * DTT Assessments Workstream
	 */

	public boolean UpdateAccessTWEAccessTracker() throws InterruptedException 
	{

		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() && UserAccess.getTWEExportButton().isDisplayed() && UserAccess.getTWEImportButton().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;

	}


	public List<String> menuheaderlist() {

		List<String> list = new ArrayList<>();

		list.add("Plan");
		list.add("Execution");
		list.add("PMO & Governance");
		list.add("Quick Links");
		list.add("Stabilization");
		list.add("Reports");
		return list;

	}

	public List<String> RecruitmentChannleList() {

		List<String> list = new ArrayList<>();

		list.add("Backfill Attrition");
		list.add("New Deal/Ramp – External Hire");
		list.add("New Deal/Ramp - Internal Pool/Seeding");
		list.add("New demand with Existing deal");
		list.add("Contractor");
		list.add("Backfill IJP");
		list.add("Rebadge");
		return list;

	}

	public List<String> SkillCatList() {

		List<String> list = new ArrayList<>();

		list.add("Voice");
		list.add("Non-Voice");
		list.add("Voice+Domain");
		return list;

	}



	public boolean validateDateFormat(String strDate){
		SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
		sdfrmt.setLenient(false);
		try
		{
			Date javaDate = sdfrmt.parse(strDate); 
			System.out.println(strDate+" is valid date format");
		}
		/* Date format is invalid */
		catch (ParseException e)
		{
			System.out.println(strDate+" is Invalid Date format");
			return false;
		}
		/* Return true if date format is valid */
		return true;
	}


	public List<String> SDOtableheaderlist() {

		List<String> list = new ArrayList<>();
		
		list.add("SL NO");                                            
		list.add("");
		list.add("PLANNED LEVEL *");
		list.add("SKILL CATEGORY *");
		list.add("LOCATION *");
		list.add("SLL/ DOMAIN");
		list.add("SR # *");
		list.add("FULFILLMENT DATE");
		list.add("PLANNED ONBOARDING DATE *");
		list.add("PLANNED EFFORT *");
		list.add("LANGUAGE");
		list.add("ENTERPRISE ID");
		list.add("ACTUAL LEVEL");
		list.add("EMPLOYEE ID");
		list.add("REVISED ONBOARDING DATE");
		list.add("CID #");
		list.add("CLIENT SPECIFIC ROLE");
		list.add("ONBOARDING STATUS");
		list.add("CANDIDATE STATUS (*)");
		list.add("EXIT DATE");
		list.add("RESOURCE TYPE (*)");
		list.add("RECRUITMENT CHANNEL (*)");
		list.add("ACTUAL EFFORT (*)");
		list.add("RESOURCE FULL NAME");
		list.add("CONTACT #");
		list.add("GENDER");
		list.add("POOL");
		list.add("HIGHEST QUALIFICATION");
		list.add("CURRENT EMPLOYER");
		list.add("PREVIOUS EMPLOYER");
		list.add("ACTUAL ONBOARDING DATE(DOJ)");
		list.add("PASSPORT NUMBER");
		list.add("PASSPORT STATUS");
		list.add("BGC STATUS");
		list.add("JOINING BONUS (USD)");
		list.add("NOTICE PAY REIMBURSEMENT (USD)");
		list.add("RELOCATION BONUS (USD)");
		list.add("NJO STATUS");
		list.add("CONTRACT AWARENESS");
		list.add("ETHICS & COMPLIANCE TRAINING");
		list.add("COMMENTS");

		return list;

	}

	public List<String> SDOtableheaderlist1() {

		List<String> list = new ArrayList<>();

		list.add("SL NO");
		list.add("");
		list.add("PLANNED LEVEL *");
		list.add("SKILL CATEGORY *");
		list.add("LOCATION *");
		list.add("SLL/ DOMAIN");
		list.add("SR # *");
		list.add("FULFILLMENT DATE");
		list.add("PLANNED ONBOARDING DATE *");
		list.add("PLANNED EFFORT *");
		list.add("LANGUAGE");
		list.add("ENTERPRISE ID");
		list.add("ACTUAL LEVEL");
		list.add("EMPLOYEE ID");
		list.add("REVISED ONBOARDING DATE");
		list.add("CID #");
		list.add("CLIENT SPECIFIC ROLE");
		list.add("ONBOARDING STATUS");
		list.add("CANDIDATE STATUS (*)");
		list.add("EXIT DATE");
		list.add("RESOURCE TYPE (*)");
		list.add("RECRUITMENT CHANNEL (*)");
		list.add("ACTUAL EFFORT (*)");
		list.add("RESOURCE FULL NAME");
		list.add("CONTACT #");
		list.add("GENDER");
		list.add("POOL");
		list.add("HIGHEST QUALIFICATION");
		list.add("CURRENT EMPLOYER");
		list.add("PREVIOUS EMPLOYER");
		list.add("ACTUAL ONBOARDING DATE(DOJ)");
		list.add("PASSPORT NUMBER");
		list.add("PASSPORT STATUS");
		list.add("BGC STATUS");
		list.add("JOINING BONUS (USD)");
		list.add("NOTICE PAY REIMBURSEMENT (USD)");
		list.add("RELOCATION BONUS (USD)");
		list.add("NJO STATUS");
		list.add("CONTRACT AWARENESS");
		list.add("ETHICS & COMPLIANCE TRAINING");
		list.add("COMMENTS");

		return list;

	}


	public List<String> SDOtableheaderMandatorylist() {

		List<String> list = new ArrayList<>();

		list.add("SL NO");
		list.add("PLANNED LEVEL *");
		list.add("SKILL CATEGORY *");
		list.add("LOCATION *");
		list.add("SR # *");
		list.add("PLANNED ONBOARDING DATE *");
		list.add("PLANNED EFFORT *");
		list.add("LANGUAGE");
		list.add("ENTERPRISE ID");
		list.add("ACTUAL LEVEL");
		list.add("ONBOARDING STATUS");
		list.add("CANDIDATE STATUS (*)");
		list.add("RESOURCE TYPE (*)");
		list.add("RECRUITMENT CHANNEL (*)");
		list.add("ACTUAL EFFORT (*)");
		return list;
	}



	public List<String> Traveltrakerlistwithfiltersymbol() {

		List<String> list = new ArrayList<>();

		list.add("TYPE OF VISA TRAVEL *");
		list.add("PASSPORT STATUS");
		list.add("PASSPORT EXPIRATION DATE (MM/DD/YYYY)");
		list.add("INVITE LETTER");
		list.add("HOTEL");
		list.add("TICKETS");
		list.add("INSURANCE");
		list.add("FOREX");
		list.add("VISA PROCESSING");
		list.add("NJO STATUS");
		list.add("OVERALL STATUS");
		return list;
	}


	public List<String> GenderList() {

		List<String> list = new ArrayList<>();

		list.add("Male");
		list.add("Female");
		list.add("LGBT");
		return list;
	}

	public List<String> TTTAssStatusList() {

		List<String> list = new ArrayList<>();

		list.add("TRANSITION LEAD APPROVAL :");
		list.add("SDO APPROVAL :");
		list.add("CLIENT APPROVAL :");
		return list;
	}

	public List<String> DTTAssStatusList() {

		List<String> list = new ArrayList<>();

		list.add("TRANSITION LEAD APPROVAL :");
		list.add("SDO APPROVAL :");
		list.add("CLIENT APPROVAL :");
		return list;
	}
	
	public List<String> DTPtrackerheaderList() {

		List<String> list = new ArrayList<>();

		list.add("#");
		list.add("FUNCTION/ TECHNOLOGY/ COMPONENT*");
		list.add("DTP/ RUNBOOKS NAME*");
		list.add("DTP/RUNBOOKS DEVELOPED?*");
		list.add("SIGNED OFF FROM ACCENTURE (*)");
		list.add("SIGNED OFF FROM CLIENT (*)");
		return list;
	}



	public List<String> PoolList() {

		List<String> list = new ArrayList<>();

		list.add("BPO");
		list.add("IO");
		list.add("Consulting");
		list.add("IDC");
		list.add("NA");
		return list;
	}

	public List<String> SDOAddresMandtryList() {

		List<String> list = new ArrayList<>();

		list.add("Planned Level ");
		list.add("Skill Category ");
		list.add("Location ");
		list.add("SR # ");
		list.add("Planned Onboarding Date ");
		list.add("Actual Level ");
		list.add("Candidate Status");
		list.add("Resource Type ");
		list.add("Recruitment Channel ");
		list.add("Effort ");

		return list;
	}


	public List<String> TravelTrackerheaderlist() {

		List<String> list = new ArrayList<>();

		list.add("#");
		list.add("ENTERPRISE ID *");
		list.add("EMPLOYEE ID");
		list.add("STAFFING (SOURCE)");
		list.add("FIRST NAME *");
		list.add("MIDDLE NAME");
		list.add("LAST NAME *");
		list.add("TRAVEL FROM *");
		list.add("TRAVEL TO *");
		list.add("PLANNED START DATE (MM/DD/YYYY) *");
		list.add("PLANNED END DATE (MM/DD/YYYY) *");
		list.add("TYPE OF VISA TRAVEL *");
		list.add("PASSPORT #");
		list.add("PASSPORT STATUS");
		list.add("PASSPORT EXPIRATION DATE (MM/DD/YYYY)");
		list.add("INVITE LETTER");
		list.add("HOTEL");
		list.add("TICKETS");
		list.add("INSURANCE");
		list.add("FOREX");
		list.add("VISA PROCESSING");
		list.add("NJO STATUS");
		list.add("ONSHORE MANAGER");
		list.add("ACTUAL START DATE");
		list.add("ACTUAL END DATE");
		list.add("PROGRESS COMMENTS");
		list.add("OVERALL STATUS");

		return list;
	}




	public List<String> Enableppllist() {

		List<String> list = new ArrayList<>();

		list.add("ACTIVITY");
		list.add("SERVICE DELIVERY WAVE STAFFING TRACKER");
		list.add("TRAVEL TRACKER");
		return list;

	}

	public List<String> TTTtabList() {

		List<String> list = new ArrayList<>();

		list.add("ACTIVITY");
		list.add("TTT TRACKER");
		list.add("DTP/RUNBOOKS TRACKER");
		list.add("TTT ASSESSMENTS");
		list.add("APPROVALS");
		return list;

	}
	
	public List<String> PassportStatusList() {

		List<String> list = new ArrayList<>();

		list.add("Active");
		list.add("Applied");
		list.add("Not Available/Expired");
		
		return list;

	}



	public List<String> Lisnotcontainingrecrtchannelsearch() {

		List<String> list = new ArrayList<>();

		list.add("Backfill Attrition");
		list.add("");
		return list;

	}

	public List<String> LisnotcontainingDTPSignoffAccsearch() {

		List<String> list = new ArrayList<>();
		
		list.add("");
		list.add("Yes");

		return list;

	}

	public List<String> LisnotcontainingTTTAssessTypesearch() {

		List<String> list = new ArrayList<>();

		list.add("TTT - Hands on Practice");
		list.add("TTT - Independently Perform & Certification");

		return list;

	}
	
	public List<String> LisnotcontainingDTTTrainTypesearch() {

		List<String> list = new ArrayList<>();

		list.add("Training - Gate 1");
		list.add("Training - Gate 3");

		return list;

	}

	public List<String> LisnotcontainingTTTTrainingTypesearch() {

		List<String> list = new ArrayList<>();

		list.add("TTT - Process & System training");

		return list;

	}



	public List<String> AddedTrackerRowlist() {

		List<String> list = new ArrayList<>();

		list.add("TTT - Process & System training");

		return list;

	}


	public static void ExcelWrite(String filePath,String fileName,String sheetName,String datatoWrite) throws IOException{

		//Create an object of File class to open xlsx file

		File file =    new File(filePath+"\\"+fileName);
		System.out.println(file);

		//Create an object of FileInputStream class to read excel file

		FileInputStream inputStream = new FileInputStream(file);

		Workbook workbook = null;

		//Find the file extension by splitting  file name in substring and getting only extension name

		String fileExtensionName = fileName.substring(fileName.indexOf("."));

		//Check condition if the file is xlsx file

		if(fileExtensionName.equals(".xlsx")){

			//If it is xlsx file then create object of XSSFWorkbook class

			workbook = new XSSFWorkbook(inputStream);

		}

		//Check condition if the file is xls file

		else if(fileExtensionName.equals(".xls")){

			//If it is xls file then create object of XSSFWorkbook class

			workbook = new HSSFWorkbook(inputStream);

		}



		//Read excel sheet by sheet name    

		Sheet sheet = workbook.getSheet(sheetName);

		//Get the current count of rows in excel file

		//int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		//System.out.println(rowCount);

		//Get the first row from the sheet

		// row = sheet.getRow(1);

		//Create a new row and append it at last of sheet

		//Row newRow = sheet.createRow(rowCount+1);

		//Create a loop over the cell of newly created Row
		workbook.getSheetAt(0);


		for(int j = 1; j <=sheet.getLastRowNum(); j++){

			//Fill data in row 
			Cell cell = sheet.getRow(j).getCell(7);

			try
			{
				System.out.println(cell);
				System.out.println(j);
				if(cell == null)
				{	 
					cell=sheet.getRow(j).createCell(7);
					cell.setCellValue(datatoWrite);  
				}
				else
				{
					continue;
				}
				break;

			}
			catch(Exception e)
			{


			}

		}




		//Close input stream

		inputStream.close();

		//Create an object of FileOutputStream class to create write data in excel file

		FileOutputStream outputStream = new FileOutputStream(file);

		//write data in the excel file

		workbook.write(outputStream);

		//close output stream

		outputStream.close();



	}



	public List<String> LisnotcontainingVisaTypesearch() {

		List<String> list = new ArrayList<>();

		list.add("Business");
		list.add("J1");
		list.add("S Pass");
		list.add("Schengen");
		list.add("H1");
		list.add("L1");
		return list;

	}

	public List<String> WaveHeaderlist() {

		List<String> list = new ArrayList<>();

		list.add("WAVE DETAILS");
		return list;

	}



	public List<String> SDOonbordingdateslist() {

		List<String> list = new ArrayList<>();

		list.add("ONBOARDING START DATE:");
		list.add("ONBOARDING ACTUAL START DATE:");
		return list;

	}



	public List<String> WorkstreamHeaderlist() {

		List<String> list = new ArrayList<>();

		list.add("ENABLE PEOPLE");
		list.add("TRAIN THE TRAINER");
		list.add("DELIVERY TEAM TRAINING");
		list.add("TECHNOLOGY AND WORK ENVIRONMENT");
		list.add("SERVICE REHEARSAL TEST (SRT)");
		return list;

	}

	public List<String> WorkstreamHeaderlistforWaveNameOne() {

		List<String> list = new ArrayList<>();

		list.add("ENABLE PEOPLE");
		list.add("TRAIN THE TRAINER");
		list.add("DELIVERY TEAM TRAINING");
		list.add("TECHNOLOGY AND WORK ENVIRONMENT");
		list.add("SERVICE REHEARSAL TEST (SRT)");
		return list;

	}


	public List<String> TTAddedRow() {

		List<String> list = new ArrayList<>();

		//list.add("bhagyalaxmi.sahu");
		list.add("Bhagyalaxmi");
		list.add("Sahu");
		list.add("Sri Lanka");
		list.add("Spain");
		list.add("Schengen");
		//list.add("07/03/2018");
		//list.add("07/29/2018");
		return list;

	}


	public List<String> SDOPlannedLevelList() {

		List<String> list = new ArrayList<>();

		list.add("Accenture Leadership");
		list.add("5 – Associate Director");
		list.add("6 - Senior Manager");
		list.add("7 - Manager");
		list.add("8 – Associate Manager");
		list.add("9 - Specialist");
		list.add("10 - Analyst");
		list.add("11 - Analyst");
		list.add("12 - Associate");
		list.add("13 - New Associate");
		list.add("Contractor/Subcontractor");

		return list;

	}

	public List<String> SDOLocationList() {

		List<String> list = new ArrayList<>();


		list.add("AAPAC Client Location");
		list.add("Austin");
		list.add("Australia");
		list.add("Belo Horizonte");
		list.add("Bengaluru");
		list.add("Bratislava");
		list.add("Bucharest");
		list.add("Buenos Aires");
		list.add("Cebu");
		list.add("Charlotte");
		list.add("Chengdu");
		list.add("Chennai");
		list.add("Costa Rica");
		list.add("Dalian");
		list.add("Dhaka");
		list.add("Dublin");
		list.add("Europe Client Location");
		list.add("Fiji");
		list.add("Hyderabad");
		list.add("Iasi");

		list.add("Ilocos");
		list.add("Japan");
		list.add("King of Prussia");
		list.add("Knoxville");
		list.add("Krakow");
		list.add("Kuala Lumpur");
		list.add("LATAM Client Location");
		list.add("Lisbon");
		list.add("Madrid");
		list.add("Manila");
		list.add("Milan");
		list.add("Mumbai");
		list.add("NA Client Location");
		list.add("New Zealand");
		list.add("Newcastle");
		list.add("Ottawa");
		list.add("Port Louis");
		list.add("Prague");
		list.add("San Antonio");
		list.add("San Jose");


		list.add("Sao Paulo");
		list.add("Shanghai");
		list.add("Singapore");
		list.add("South Africa");
		list.add("Sri Lanka");
		list.add("Sydney");
		list.add("Timisoara");
		list.add("Warsaw");
		list.add("Warwick");

		return list;

	}


	public List<String> ActivityTablellist() {

		List<String> list = new ArrayList<>();
		list.add("");
		list.add("");
		list.add("");
		list.add("#");
		list.add("Activity*");
		list.add("Owner Category*");
		list.add("PLANNED START DATE*");
		list.add("PLANNED END DATE*");
		list.add("ACTUAL START DATE");
		list.add("ACTUAL END DATE");
		list.add("% COMPLETE");
		list.add("OWNER (Enterprise Id)*");
		list.add("COMMENTS");
		list.add("ACTIONS");

		return list;

	}

	public List<String> TTTActivityTablellist() {

		List<String> list = new ArrayList<>();

		list.add("#");
		list.add("ACTIVITY*");
		list.add("OWNER CATEGORY*");
		list.add("PLANNED START DATE*");
		list.add("PLANNED END DATE*");
		list.add("ACTUAL START DATE");
		list.add("ACTUAL END DATE");
		list.add("% COMPLETE");
		list.add("");
		list.add("");
		list.add("");
		list.add("OWNER (ENTERPRISE Id)*");
		list.add("COMMENTS");
		list.add("ACTIONS");

		return list;

	}
	
	public List<String> DTTActivityTablellist() {

		List<String> list = new ArrayList<>();

		list.add("#");
		list.add("ACTIVITY*");
		list.add("OWNER CATEGORY*");
		list.add("PLANNED START DATE*");
		list.add("PLANNED END DATE*");
		list.add("ACTUAL START DATE");
		list.add("ACTUAL END DATE");
		list.add("% COMPLETE");
		list.add("");
		list.add("");
		list.add("");
		list.add("OWNER (ENTERPRISE Id)*");
		list.add("COMMENTS");
		list.add("ACTIONS");

		return list;

	}

	public List<String> DTTTrackerHeaderlist() {

		List<String> list = new ArrayList<>();

		list.add("#");
		list.add("BATCH");
		list.add("GEO/ COUNTRY");
		list.add("DTT LOCATION*");
		list.add("FUNCTION/ TECHNOLOGY/ COMPONENT*");
		list.add("TRAINING TOPIC/ ACTIVITY*");
		list.add("TRAINING PHASE*");
		list.add("TRAINING DELIVERY METHOD");
		list.add("PLANNED START DATE*");
		list.add("PLANNED END DATE*");
		list.add("ACTUAL START DATE");
		list.add("ACTUAL END DATE");
		list.add("% COMPLETE(*)");
		list.add("STATUS(*)");
		list.add("PLANNED DURATION (HRS)");
		list.add("ACTUAL DURATION (HRS)");
		list.add("CLIENT SME/ PROCESS OWNER");
		list.add("ACCENTURE KNOWLEDGE RECIPIENTS(*)");
		list.add("TRAINING RECIPIENTS(*)");
		list.add("LIST OF APPLICATIONS"	);
		list.add("COMMENTS"	);
		list.add("ADDITIONAL COL1");
		list.add("ADDITIONAL COL2");
		list.add("ADDITIONAL COL3");
		list.add("ADDITIONAL COL4");
		list.add("ADDITIONAL COL5");
		list.add("ADDITIONAL COL6");
		list.add("ADDITIONAL COL7");
		list.add("ADDITIONAL COL8");
		list.add("ADDITIONAL COL9");
		list.add("ADDITIONAL COL10");

		return list;

	}



	public List<String> TTTAssessmentHeaderlist() {

		List<String> list = new ArrayList<>();

		list.add("#");
		list.add("");
		list.add("FUNCTION / TECHNOLOGY / COMPONENTS *");
		list.add("TRAINING TOPIC *");
		list.add("ASSESSMENT TYPE *");
		list.add("ASSESSMENT LOCATION");
		list.add("TRAINEE NAME *");
		list.add("ASSESSOR NAME (ENTERPRISE ID/ EMAIL ID)");
		list.add("PROFICIENCY TARGET % *");
		list.add("PROFICIENCY SCORE %");
		list.add("ASSESSMENT DATE (*)");
		list.add("");
		list.add("");
		list.add("ACCREDITATION STATUS (*)");
		list.add("ARTIFACTS");
		list.add("COMMENTS");
		list.add("");

		return list;

	}

	public List<String> UpdateddatainHistorytable() {

		List<String> list = new ArrayList<>();

		list.add("1");
		list.add("Pyramid finalized_CompletionPct");
		list.add("80.00");
		list.add("90");
		//list.add("06/19/2018");	
		//list.add("bhagyalaxmi.sahu");

		return list;

	}


	public List<String> ViewHistoryTablellist() {

		List<String> list = new ArrayList<>();

		list.add("#");
		list.add("DATA MODIFIED");
		list.add("OLD VALUE");
		list.add("NEW VALUE");
		list.add("UPDATED ON");
		list.add("UPDATED BY");
		return list;

	}


	public List<String> projectstaffheaderlist() {

		List<String> list = new ArrayList<>();

		list.add("");
		list.add("#");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("STATUS");
		list.add("RESOURCE NAME*");
		list.add("ROLE*");
		list.add("CAREER LEVEL");
		list.add("LOCATION*");
		list.add("DEAL/ WAVE*");
		list.add("SOURCING*");
		list.add("GST ID");
		list.add("MAY-2018*");
		list.add("JUN-2018");
		list.add("JUL-2018");
		list.add("AUG-2018");
		list.add("SEP-2018");
		list.add("OCT-2018");
		

		return list;

	}

	public List<String> GanttChartcolumnsWithoutYearMonth() {

		List<String> list = new ArrayList<>();

		list.add("Level");
		list.add("Activity");
		list.add("Planned Start Date");
		list.add("Planned End Date");
		list.add("Week");
		list.add("Completion");
		list.add("");
		return list;

	}


	public List<String> ListNotconatiningSearch() {

		List<String> list = new ArrayList<>();

		list.add("Transition Lead");
		list.add("PMO Support");
		list.add("Global Transition Lead");
		
		list.add("Global Deal PMO");
		list.add("KT Lead");
		list.add("Mobilization Architect");
		list.add("BE Assessor");
		list.add("SDO Location Lead");
		list.add("Global Service Delivery lead");
		list.add("Client-SME");
		list.add("Client-Transition Manager");
		list.add("Service Delivery Lead");
		list.add("Wave Lead");
		return list;

	}

	public List<String> GanttCharttableheaderlist() {

		List<String> list = new ArrayList<>();		
		list.add("Month");
		list.add("Year");

		return list;

	}

	public List<String> ProjUserAccessList() {

		List<String> list = new ArrayList<>();

		list.add("#");
		list.add("USER NAME*");
		list.add("");
		list.add("");
		list.add("USER PROFILE");
		list.add("SERVICE GROUP");
		list.add("ROLE*");
		list.add("CAREER LEVEL*");
		list.add("LOCATION*");

		list.add("DEAL / WAVE*");



		list.add("SOURCING*");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("STATUS *");
		return list;

	}

	public List<String> StatusDropDownList() {

		List<String> list = new ArrayList<>();

		list.add("Active");
		list.add("InActive");

		return list;

	} 
	public List<String> SourcingList() {

		List<String> list = new ArrayList<>();

		list.add("Mobilisation");
		list.add("GTIN - Global Talent and Innovation Network");
		list.add("ASCN - Accenture Strategy Capability Network");
		list.add("SDO - Service Delivery Operation");
		list.add("Borrowed");
		list.add("MC - Management Consultant");
		list.add("Avanade");
		list.add("Accenture");
		list.add("Client");

		return list;
	}

	public List<String> DealWaveList() {

		List<String> list = new ArrayList<>();

		list.add("Deal");
		list.add("test");

		return list;
	}

	public List<String> FilteredList() {

		List<String> list = new ArrayList<>();

		list.add("bhagyalaxmi.sahu");
		list.add("shubham.o.gupta");
		list.add("vaibhav.ramachandran");
		list.add("");
		list.add("");
		list.add("");


		return list;
	}
	public List<String> BookamrklistnotcontainingProjUseroption() {

		List<String> list = new ArrayList<>();

		list.add("Execution Summary");
		list.add("PCT KIT");
		list.add("Deal Information");
		list.add("");
		return list;

	}

	public List<String> TTTApprovalsColstlist() {

		List<String> list = new ArrayList<>();

		list.add("APPROVER ROLE");
		list.add("APPROVER NAME");
		list.add("APPROVAL STATUS");
		return list;

	}

	public List<String> ListWithNonMandatorycolumns() {

		List<String> list = new ArrayList<>();

		list.add("#");
		list.add("USER NAME*");
		list.add("");
		list.add("");
		list.add("USER PROFILE");
		list.add("SERVICE GROUP");
		list.add("ROLE*");
		list.add("CAREER LEVEL*");
		list.add("LOCATION*");
		list.add("DEAL / WAVE*");
		list.add("SOURCING*");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("EMAIL ID");
		list.add("CONTACT NUMBER");
		list.add("PROJECT SUPERVISOR");
		list.add("STATUS *");


		return list;

	}
	public List<String> LocationList() {

		List<String> list = new ArrayList<>();

		list.add("Austin");
		list.add("AAPAC Client Location");
		list.add("Australia");
		list.add("Belo Horizonte");
		list.add("Bengaluru");
		list.add("Bratislava");
		list.add("Bucharest");
		list.add("Buenos Aires");
		list.add("Cebu");
		list.add("Charlotte");
		list.add("Chengdu");
		list.add("Chennai");
		list.add("Costa Rica");
		list.add("Dalian");
		list.add("Dhaka");
		list.add("Dublin");
		list.add("Europe Client Location");
		list.add("Fiji");
		list.add("Hyderabad");
		list.add("Iasi");

		list.add("Ilocos");
		list.add("Japan");
		list.add("King of Prussia");
		list.add("Knoxville");
		list.add("Krakow");
		list.add("Kuala Lumpur");
		list.add("LATAM Client Location");
		list.add("Lisbon");
		list.add("Madrid");
		list.add("Manila");
		list.add("Milan");
		list.add("Mumbai");
		list.add("NA Client Location");
		list.add("New Zealand");
		list.add("Newcastle");
		list.add("Ottawa");
		list.add("Port Louis");
		list.add("Prague");
		list.add("San Antonio");
		list.add("San Jose");


		list.add("Sao Paulo");
		list.add("Shanghai");
		list.add("Singapore");
		list.add("South Africa");
		list.add("Sri Lanka");
		list.add("Sydney");
		list.add("Timisoara");
		list.add("Warsaw");
		list.add("Warwick");

		return list;

	}
	public List<String> CareerLevelList() {

		List<String> list = new ArrayList<>();

		list.add("Accenture Leadership");
		list.add("5 – Associate Director");
		list.add("6 - Senior Manager");
		list.add("7 - Manager");
		list.add("8 – Associate Manager");
		list.add("9- Specialist");
		list.add("10 - Analyst");
		list.add("11 - Analyst");
		list.add("12 - Associate");
		list.add("13 – New Associate");
		return list;

	}

	public List<String> AddRoleList() {

		List<String> list = new ArrayList<>();

		list.add("Governance Lead");
		list.add("Global Transition Lead");
		list.add("Transition Lead");
		list.add("Global Deal PMO");
		list.add("PMO Support");
		list.add("SERVICE GROUP");
		list.add("Transition Support");
		list.add("Transition Coordinator");
		list.add("Wave Lead");
		list.add("KT Lead");
		list.add("Enable People Lead");
		list.add("TWE Lead");
		list.add("SRT Lead");
		list.add("Cutover Lead");
		list.add("PCT Coach");
		list.add("PCT Auditor");
		list.add("Journey Management lead");
		list.add("Journey Management Coach");
		list.add("Journey Management Team member");
		return list;

	}


	public List<String> AddedActivityList() {

		List<String> list = new ArrayList<>();

		list.add("Mobilisation Prog");
		list.add("6/4/2018");
		list.add("6/30/2018");
		list.add("bhagyalaxmi.sahu");
		return list;

	}

	public List<String> NJOStatusList() {

		List<String> list = new ArrayList<>();


		list.add("Yet to Start");
		list.add("InProgress");
		list.add("Completed");	
		return list;

	}

	public List<String> NJOStatusTTList() {

		List<String> list = new ArrayList<>();

		list.add("NA");
		list.add("Yet to Start");
		list.add("InProgress");
		list.add("Completed");	
		return list;

	}


	public List<String> VisaProcessingTTList() {

		List<String> list = new ArrayList<>();

		list.add("Yet to start");
		list.add("Approved/ Complete");
		list.add("In progress");
		list.add("Rejected/ Delayed");	
		return list;

	}

	public List<String> OverallStatusTTList() {

		List<String> list = new ArrayList<>();

		list.add("Yet to start");
		list.add("On Track");
		list.add("Behind Schedule");
		list.add("Overdue");	
		list.add("Resource dropped/ Visa Rejected");
		list.add("Complete/ Approved");
		return list;

	}


	public List<String> ContractAwrnessList() {

		List<String> list = new ArrayList<>();

		list.add("Yet to Start");
		list.add("InProgress");
		list.add("Completed");	
		return list;

	}

	public List<String> EthicsComplianceList() {

		List<String> list = new ArrayList<>();

		list.add("Yet to Start");
		list.add("InProgress");
		list.add("Completed");	
		return list;

	}

	public List<String> BGCStatusList() {

		List<String> list = new ArrayList<>();

		list.add("DB Open");
		list.add("DB Clear");
		list.add("Final Report Attn Req");	
		list.add("Final Report Clear");
		list.add("Final Report Severe");
		list.add("WIP");
		return list;

	}

	public List<String> SDOAddedrowlist() {

		List<String> list = new ArrayList<>();

		list.add("44");
		list.add("Accenture Leadership");
		list.add("Voice");	
		list.add("Austin");
		list.add("40");
		list.add("0.01");
		list.add("Open");
		//list.add("Yet to Onboard");

		return list;

	}
	
	public List<String> TTAddedrowlist() {

		List<String> list = new ArrayList<>();

		list.add("10");
		list.add("archit.singhal$$$$$$");
		list.add("Archit");	
		list.add("Singhal");
		list.add("Sri Lanka");
		list.add("Spain");
		list.add("Business");
		list.add("Yet to start");

		return list;

	}

	public List<String> TTTAddedrowlist() {

		List<String> list = new ArrayList<>();

		list.add("");
		list.add("Smetivity");
		list.add("0%");
		list.add("santhana.kanniyappan");
		//list.add("Yet to Onboard");

		return list;

	}
	
	public List<String> DTTAddedrowlist() {

		List<String> list = new ArrayList<>();

		list.add("");
		list.add("Anctivity");
		list.add("0%");
		list.add("santhana.kanniyappan");
		//list.add("Yet to Onboard");

		return list;

	}
	

	public List<String> TTTrackerAddedrowlist() {

		List<String> list = new ArrayList<>();

		list.add("Batch 1");
		list.add("Austin");
		list.add("Payroll");
		list.add("ewRow");
		list.add("TTT - Hands on Practice");
		list.add("david.musgrove");
		list.add("0");

		//list.add("Yet to Onboard");

		return list;

	}

	public List<String> TTTrackerTablecColumns() {

		List<String> list = new ArrayList<>();

		list.add("#");
		list.add("BATCH");
		list.add("GEO/ COUNTRY");
		list.add("TTT LOCATION*");
		list.add("FUNCTION/ TECHNOLOGY/ COMPONENT*");
		list.add("TRAINING TOPIC/ ACTIVITY*");
		list.add("TRAINING PHASE*");
		list.add("TRAINING DELIVERY METHOD");
		list.add("PLANNED START DATE*");
		list.add("PLANNED END DATE*");
		list.add("ACTUAL START DATE");
		list.add("ACTUAL END DATE");
		list.add("% COMPLETE(*)");
		list.add("STATUS(*)");
		list.add("PLANNED DURATION (HRS)");
		list.add("ACTUAL DURATION (HRS)");
		list.add("CLIENT SME/ PROCESS OWNER");
		list.add("ACCENTURE KNOWLEDGE RECIPIENTS(*)");
		list.add("NUMBER OF TTT RESOURCES(*)");
		list.add("LIST OF APPLICATIONS");
		list.add("COMMENTS");
		list.add("ADDITIONAL COL1");
		list.add("ADDITIONAL COL2");
		list.add("ADDITIONAL COL3");
		list.add("ADDITIONAL COL4");
		list.add("ADDITIONAL COL5");
		list.add("ADDITIONAL COL6");
		list.add("ADDITIONAL COL7");
		list.add("ADDITIONAL COL8");
		list.add("ADDITIONAL COL9");
		list.add("ADDITIONAL COL10");
		list.add("");


		return list;

	}

	public List<String> TTTrackerGridModifedColumns() {

		List<String> list = new ArrayList<>();

		list.add("#");
		list.add("BATCH");
		list.add("GEO/ COUNTRY");
		list.add("TTT LOCATION*");
		list.add("FUNCTION/ TECHNOLOGY/ COMPONENT*");
		list.add("TRAINING TOPIC/ ACTIVITY*");
		list.add("TRAINING PHASE*");
		list.add("TRAINING DELIVERY METHOD");
		list.add("PLANNED START DATE*");
		list.add("PLANNED END DATE*");
		list.add("ACTUAL START DATE");
		list.add("ACTUAL END DATE");
		list.add("% COMPLETE(*)");
		list.add("STATUS(*)");
		list.add("PLANNED DURATION (HRS)");
		list.add("ACTUAL DURATION (HRS)");
		list.add("CLIENT SME/ PROCESS OWNER");
		list.add("ACCENTURE KNOWLEDGE RECIPIENTS(*)");
		list.add("NUMBER OF TTT RESOURCES(*)");
		list.add("");
		list.add("COMMENTS");
		list.add("ADDITIONAL COL1");
		list.add("ADDITIONAL COL2");
		list.add("ADDITIONAL COL3");
		list.add("ADDITIONAL COL4");
		list.add("ADDITIONAL COL5");
		list.add("ADDITIONAL COL6");
		list.add("ADDITIONAL COL7");
		list.add("ADDITIONAL COL8");
		list.add("ADDITIONAL COL9");
		list.add("ADDITIONAL COL10");
		list.add("");

		return list;

	}

	public List<String> Onboardingstatuslist() {

		List<String> list = new ArrayList<>();

		list.add("Open");
		list.add("Offer Accepted");
		list.add("On Board");
		list.add("Attrited");
		list.add("Transferred");

		return list;

	}

	public List<String> ArtifactsTablelist() {

		List<String> list = new ArrayList<>();

		list.add("#");
		list.add("FILE NAME *");
		list.add("FILE CATEGORY *");
		list.add("UPLOADED DATE");
		list.add("LAST UPDATED BY");
		list.add("ACTION");

		return list;

	}

	public List<String> ArtifactsMandatorylist() {

		List<String> list = new ArrayList<>();

		list.add("Sharepoint Location *");
		list.add("File Name *");
		list.add("File Category *");

		return list;

	}

	public List<String> plansubmenuheaderlist() {

		List<String> list = new ArrayList<>();

		list.add("DEAL INFORMATION");
		list.add("MEC CHECKLIST");
		list.add("TRANSITION PLAN");
		list.add("PROJECT STAFFING");
		list.add("PROJECT ARTIFACTS");
		list.add("PROJECT PLAN SETUP");
		return list;

	}

	public List<String> WaveRagColorDropdwnlist() {

		List<String> list = new ArrayList<>();

		list.add("#808080");
		list.add("#0000ff");
		list.add("#008000");
		list.add("#ff7a00");
		list.add("#ff0000");

		return list;

	}

	public List<String> WaveDetailsHeaderList() {

		List<String> list = new ArrayList<>();

		list.add("WAVE");
		list.add("STATUS");
		list.add("OFFERING *(MULTI-SELECT)");
		list.add("FUNCTION *(MULTI-SELECT)");
		list.add("TECHNOLOGY/COMPONENT *(MULTI-SELECT)");
		list.add("SENDING LOCATION *(MULTI-SELECT)");

		return list;

	}
	
	
	public boolean ReadExcel(String cardnumber, String carddate) throws IOException

	{
		boolean status;
		boolean Filereadstatus;

		String location = getexactfilename(cardnumber,carddate).toString();
		System.out.println(location);

		File f = new File(conf.getfilelocation() + "/" + location);

		System.out.println(f.getName());
		if (f.exists() ) {

			status = true;
		} else {

			status = false;
		}

		return status;


	}
	
	




	public boolean ExcelType(String cardnumber, String carddate) throws IOException

	{
		boolean status;
		boolean Filereadstatus;


		String location = getexactfilename(cardnumber,carddate).toString();
		System.out.println(location);

		File f = new File(conf.getfilelocation() + "/" + location);

		System.out.println(f.getName());
		if (f.canWrite()) {

			status = true;
		} else {

			status = false;
		}

		return status;

	}



	public String getexactfilename(String cardnumber, String carddate) {

		List<String> results = new ArrayList<String>();
		String filename = null;
		File[] files = new File(conf.getfilelocation()).listFiles();

		for (File file : files) {
			if (file.isFile()) {
				results.add(file.getName());
			}
		}


		String str = currenttime();
		String []division=cardnumber.split(" ");

		String prefix = conf.getfilenameforprojectstaffactuals() + division[0]+"_"+carddate+"_"+
				str;

		System.out.println("Prefix is "+ prefix);


		for (int i = 0; i < results.size(); i++) {
			if (results.get(i).startsWith(prefix)) {

				filename = results.get(i);

			}
		}

		return filename;

	}


	public boolean ReadSDOStaffExcel(String cardnumber, String carddate) throws IOException

	{
		boolean status;
		boolean Filereadstatus;

		String location = getexactfilenameforSDOStaff(cardnumber,carddate).toString();
		System.out.println(location);

		File f = new File(conf.getfilelocation() + "/" + location);

		System.out.println(f.getName());
		if (f.exists() ) {

			status = true;
		} else {

			status = false;
		}

		return status;

	}

	public boolean ReadWaveSetUpExcel(String cardnumber, String carddate) throws IOException

	{
		boolean status;
		boolean Filereadstatus;

		String location = getexactfilenameforWaveSetUp(cardnumber,carddate).toString();
		System.out.println(location);

		File f = new File(conf.getfilelocation() + "/" + location);

		System.out.println(f.getName());
		if (f.exists() ) {

			status = true;
		} else {

			status = false;
		}

		return status;

	}

	public boolean ReadExecutionSummaryExcel(String cardnumber, String carddate) throws IOException

	{
		boolean status;
		boolean Filereadstatus;

		String location = getexactfilenameforExecutionSummary(cardnumber,carddate).toString();
		System.out.println(location);

		File f = new File(conf.getfilelocation() + "/" + location);

		System.out.println(f.getName());
		if (f.exists() ) {

			status = true;
		} else {

			status = false;
		}

		return status;

	}

	public boolean ReadWaveWorkStreamSetUpExcel(String cardnumber, String carddate) throws IOException

	{
		boolean status;
		boolean Filereadstatus;

		String location = getexactfilenameWaveWrkstrmSetUp(cardnumber,carddate).toString();
		System.out.println(location);

		File f = new File(conf.getfilelocation() + "/" + location);

		System.out.println(f.getName());
		if (f.exists() ) {

			status = true;
		} else {

			status = false;
		}

		return status;

	}

	public boolean ReadProjUserAccessExcel(String cardnumber, String carddate) throws IOException

	{
		boolean status;
		boolean Filereadstatus;

		String location = getexactfilenameforProjectUserAccess(cardnumber,carddate).toString();
		System.out.println(location);

		File f = new File(conf.getfilelocation() + "/" + location);

		System.out.println(f.getName());
		if (f.exists() ) {

			status = true;
		} else {

			status = false;
		}

		return status;

	}

	public boolean ReadPlanSetUpExcel(String cardnumber, String carddate) throws IOException

	{
		boolean status;
		boolean Filereadstatus;

		String location = getexactfilenameforPlanSetUp(cardnumber,carddate).toString();
		System.out.println(location);                                                         

		File f = new File(conf.getfilelocation() + "/" + location);

		System.out.println(f.getName());
		if (f.exists() ) {

			status = true;
		} else {

			status = false;
		}

		return status;

	}

	public boolean ReadProjectstaffExcel(String cardnumber, String carddate) throws IOException

	{
		boolean status;
		boolean Filereadstatus;

		String location = getexactfilenameforProjectStaff(cardnumber,carddate).toString();
		System.out.println(location);                                                         

		File f = new File(conf.getfilelocation() + "/" + location);

		System.out.println(f.getName());
		if (f.exists() ) {

			status = true;
		} else {

			status = false;
		}

		return status;

	}




	public boolean ReadTTExcel(String cardnumber, String carddate) throws IOException

	{
		boolean status;
		boolean Filereadstatus;

		String location = getexactfilenameforTraveTracker(cardnumber,carddate).toString();
		System.out.println(location);

		File f = new File(conf.getfilelocation() + "/" + location);

		System.out.println(f.getName());
		if (f.exists() ) {

			status = true;
		} else {

			status = false;
		}

		return status;

	}



	public boolean ExcelTypeforSDOStaff(String cardnumber, String carddate) throws IOException

	{
		boolean status;
		boolean Filereadstatus;


		String location = getexactfilenameforSDOStaff(cardnumber,carddate).toString();
		System.out.println(location);

		File f = new File(conf.getfilelocation() + "/" + location);

		System.out.println(f.getName());
		if (f.canWrite()) {

			status = true;
		} else {

			status = false;
		}

		return status;

	}



	public String getexactfilenameforSDOStaff(String cardnumber, String carddate) {

		List<String> results = new ArrayList<String>();
		String filename = null;
		File[] files = new File(conf.getfilelocation()).listFiles();

		for (File file : files) {
			if (file.isFile()) {
				results.add(file.getName());



			}
		}


		String str = currenttime();
		String []division=cardnumber.split(" ");

		String prefix = conf.getfilenameforSDOStaff() + division[0]+"_"+carddate+"_"+"One"+"_"+
				str;
		
		System.out.println("Prefix is "+ prefix);


		for (int i = 0; i < results.size(); i++) {
			if (results.get(i).startsWith(prefix)) {

				filename = results.get(i);

			}
		}

		return filename;

	}
	
	
	

	public String getexactfilenameforTraveTracker(String cardnumber, String carddate) {

		List<String> results = new ArrayList<String>();
		String filename = null;
		File[] files = new File(conf.getfilelocation()).listFiles();

		for (File file : files) {
			if (file.isFile()) {
				results.add(file.getName());



			}
		}


		String str = currenttime();
		String []division=cardnumber.split(" ");

		String prefix = conf.getfilenameforTravelTracker() + division[0]+"_"+carddate+"_"+
				str;

		System.out.println("Prefix is "+ prefix);


		for (int i = 0; i < results.size(); i++) {
			if (results.get(i).startsWith(prefix)) {

				filename = results.get(i);

			}
		}

		return filename;

	}
	public String getexactfilenameforWaveSetUp(String cardnumber, String carddate) {

		List<String> results = new ArrayList<String>();
		String filename = null;
		File[] files = new File(conf.getfilelocation()).listFiles();

		for (File file : files) {
			if (file.isFile()) {
				results.add(file.getName());



			}
		}


		String str = currenttime();
		String []division=cardnumber.split(" ");

		String prefix = conf.getfilenameforWaveSetUp() + division[0]+"_"+carddate+"_"+
				str;

		System.out.println("Prefix is "+ prefix);


		for (int i = 0; i < results.size(); i++) {
			if (results.get(i).startsWith(prefix)) {

				filename = results.get(i);

			}
		}

		return filename;

	}


	public String getexactfilenameforExecutionSummary(String cardnumber, String carddate) {

		List<String> results = new ArrayList<String>();
		String filename = null;
		File[] files = new File(conf.getfilelocation()).listFiles();

		for (File file : files) {
			if (file.isFile()) {
				results.add(file.getName());



			}
		}


		String str = currenttime();
		String []division=cardnumber.split(" ");

		String prefix = conf.getfilenameforExecutionSummary() + carddate+"_" + division[0]+"_"+
				str;

		System.out.println("Prefix is "+ prefix);


		for (int i = 0; i < results.size(); i++) {
			if (results.get(i).startsWith(prefix)) {

				filename = results.get(i);

			}
		}

		return filename;

	}

	public String getexactfilenameWaveWrkstrmSetUp(String cardnumber, String carddate) {

		List<String> results = new ArrayList<String>();
		String filename = null;
		File[] files = new File(conf.getfilelocation()).listFiles();

		for (File file : files) {
			if (file.isFile()) {
				results.add(file.getName());



			}
		}


		String str = currenttime();
		String []division=cardnumber.split(" ");

		String prefix = conf.getfilenameforWaveWrkstrmSetUp() + division[0]+"_"+carddate+"_"+
				str;

		System.out.println("Prefix is "+ prefix);


		for (int i = 0; i < results.size(); i++) {
			if (results.get(i).startsWith(prefix)) {

				filename = results.get(i);

			}
		}

		return filename;

	}

	public String getexactfilenameforProjectUserAccess(String cardnumber, String carddate) {

		List<String> results = new ArrayList<String>();
		String filename = null;
		File[] files = new File(conf.getfilelocation()).listFiles();

		for (File file : files) {
			if (file.isFile()) {
				results.add(file.getName());         



			}
		}


		String str = currenttime();
		String []division=cardnumber.split(" ");

		String prefix = division[0]+"_"+conf.getfilenameforProjectUserAccess() +carddate+"_"+
				str;

		System.out.println("Prefix is "+ prefix);


		for (int i = 0; i < results.size(); i++) {
			if (results.get(i).startsWith(prefix)) {

				filename = results.get(i);

			}
		}

		return filename;

	}

	public String getexactfilenameforPlanSetUp(String cardnumber, String carddate) {

		List<String> results = new ArrayList<String>();
		String filename = null;
		File[] files = new File(conf.getfilelocation()).listFiles();

		for (File file : files) {
			if (file.isFile()) {
				results.add(file.getName());



			}
		}


		String str = currenttime();
		String []division=cardnumber.split(" ");

		String prefix = division[0]+"_"+conf.getfilenameforPlanSetUp() +
				str;

		System.out.println("Prefix is "+ prefix);


		for (int i = 0; i < results.size(); i++) {
			if (results.get(i).startsWith(prefix)) {

				filename = results.get(i);

			}
		}

		return filename;

	}

	public String getexactfilenameforProjectStaff(String cardnumber, String carddate) {

		List<String> results = new ArrayList<String>();
		String filename = null;
		File[] files = new File(conf.getfilelocation()).listFiles();

		for (File file : files) {
			if (file.isFile()) {
				results.add(file.getName());



			}
		}


		String str = currenttime();
		String []division=cardnumber.split(" ");

		String prefix = conf.getfilenameforprojectstaff()+division[0]+"_"+ carddate+ "_"+
				str;

		System.out.println("Prefix is "+ prefix);


		for (int i = 0; i < results.size(); i++) {
			if (results.get(i).startsWith(prefix)) {

				filename = results.get(i);

			}
		}

		return filename;

	}



	public List<String> transitionplanhomepagesubheader() {

		List<String> list = new ArrayList<>();

		list.add("PROJECT WORKSTREAM");
		list.add("WAVE SETUP");
		list.add("WAVE WORKSTREAM SETUP");
		list.add("GANTT CHART");

		return list;

	}

	public List<String> projectplanhomepagesubheader() {

		List<String> list = new ArrayList<>();

		list.add("OVERALL PROJECT PLAN");
		list.add("GANTT CHART");

		return list;

	}

	public List<String> baselinetabtable() {

		List<String> list = new ArrayList<>();

		list.add("BASELINE #");
		list.add("CREATE ON DATE");
		list.add("CREATED BY");
		list.add("DETAILS");
		list.add("MS PROJECT PLAN");
		list.add("MS EXCEL PLAN");
		return list;

	}

	public List<String> viewhistorytable() {

		List<String> list = new ArrayList<>();

		list.add("#");
		list.add("DATA MODIFIED");
		list.add("OLD VALUE");
		list.add("NEW VALUE");
		list.add("UPDATED ON");
		list.add("UPDATED BY");
		return list;

	}


	public List<String> OverallRatingPercentage() {

		List<String> list = new ArrayList<>();



		list.add("NOT SATISFIED");
		list.add("SATISFIED");
		list.add("N/A");



		return list;

	}

	public List<String> Solutionheaderlist() {

		List<String> list = new ArrayList<>();


		list.add("");
		list.add("CRITERIA");
		list.add("DELIVERABLE AVAILABLE*");
		list.add("ARTIFACTS RECEIVED*");
		list.add("SOLUTION COMPLETENESS*");
		list.add("OWNER*");
		list.add("CRITERIA ARTIFACTS");
		list.add("SERVICE GROUP");
		list.add("COMMENTS");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");


		return list;

	}

	public List<String> Projectplanheaderlist() {

		List<String> list = new ArrayList<>();


		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("#");
		list.add("MILESTONE");
		list.add("");
		list.add("OWNER CATEGORY*");
		list.add("LEVEL");
		list.add("WAVE");
		list.add("WORKSTREAM*");
		list.add("");
		list.add("ACTIVITY*");
		list.add("PLANNED START DATE*");
		list.add("PLANNED END DATE*");

		list.add("ACTUAL START DATE");
		list.add("ACTUAL END DATE");
		list.add("");
		list.add("COMPLETE (%)");
		list.add("OWNER (ENTERPRISE ID)*");
		list.add("COMMENTS");
		list.add("ACTIONS");
		list.add("");


		return list;

	}

	public List<String> SolutionCriterialist() {

		List<String> list = new ArrayList<>();
		list.add("Solution Plan is finalized and approved prior to the start of transition. The approved Solution Plan includes the Delivery "
				+ "Model and Pyramid, "
				+ "Stakeholder List and Expectations, Integrated Transition Plan and Technology Solution.");
		list.add("Recruitment Doability is complete with timelines and flexes signed off with HR.");
		list.add("Roles and responsibilities defined for all Accenture entities (e.g,. BPS, AO, IO, SI, MC, SDO, etc.)");
		list.add("Transformation requirements, roles and timelines are clearly stated in the Solution Plan. The transformation teams are engaged & aligned.");
		list.add("CTV assessment completed.");
		list.add("Deal business case and solution assumptions are documented, reviewed and understood by transition lead.");
		list.add("If vendor master is in-scope:\n"+ 
				"- Adequate controls as per Foxtrot silver standards are included in the SOW (if not highlight gaps, and ask SA to obtain relevant approvals from the Rick and Compliance team)\n"+ 
				"- Approvals have been obtained from John McCormick\n"+ 
				"- Regulatory review summary is discussed and shared by SA with Service Delivery and Mobilization");
		list.add("If Payments are in scope:\n"+ 
				"- Adequate controls as per Foxtrot silver standards are included in the SOW (e.g., agreement on thresholds for approvals)\n"+ 
				"- Duplicate payment tool is included in the solution\n"+ 
				"- Risk and Compliance team informed\n"+ 
				"- Regulatory review summary discussed and shared by SA with Service Delivery and Mobilization");
		list.add("Accenture & client GPO’s are part of solution as of day 1 in Transition to enable implementation of SDS.");
		list.add("Digi KT tools (e.g. Assima/Epiplex) are part of the solution (incl. licenses/content developers costs & technical support) & client agreement is in place to install licenses on client devices to accelerate transition/reduce travel efforts.");


		return list;

	}

	public List<String> ExportDropdownlist() {

		List<String> list = new ArrayList<>();
		list.add("Excel");
		list.add("MPP");


		return list;

	}

	public List<String> ImportDropdownlist() {

		List<String> list = new ArrayList<>();
		list.add("Excel");
		list.add("MPP");

		return list;

	}


	public String currenttime() {

		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();

		String str = dateFormat.format(date);

		return str;

	}


	public String currenttime1() {

		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();

		String str = dateFormat.format(date);

		return str;

	}

	public List<String> DTPtabFilterlist() {

		List<String> list = new ArrayList<>();



		list.add("DTP/RUNBOOKS DEVELOPED?*");
		list.add("SIGNED OFF FROM ACCENTURE (*)");
		list.add("SIGNED OFF FROM CLIENT (*)");



		return list;

	}

	public List<String> TTTAssessFilterlist() {

		List<String> list = new ArrayList<>();

		list.add("FUNCTION / TECHNOLOGY / COMPONENTS *");
		list.add("ASSESSMENT TYPE *");
		list.add("ASSESSMENT LOCATION");
		list.add("PROFICIENCY TARGET % *");
		list.add("PROFICIENCY SCORE %");
		list.add("ACCREDITATION STATUS (*)");

		return list;

	}
	
	public List<String> DTTTrackfilterlist() {

		List<String> list = new ArrayList<>();

		list.add("TRAINING PHASE*");
		list.add("TRAINING DELIVERY METHOD");
		list.add("STATUS(*)");

		return list;

	}

	

	public List<String> TTTTrackersorterlist() {

		List<String> list = new ArrayList<>();

		list.add("");
		list.add("TRAINING TOPIC/ ACTIVITY*");
		list.add("% COMPLETE(*)");
		list.add("ACCENTURE KNOWLEDGE RECIPIENTS(*)");

		return list;

	}

	public List<String> TTTrackerFilterlist() {

		List<String> list = new ArrayList<>();

		list.add("TRAINING PHASE*");
		list.add("TRAINING DELIVERY METHOD");
		list.add("STATUS(*)");
		return list;

	}


	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

		//Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot =((TakesScreenshot)webdriver);

		//Call getScreenshotAs method to create image file

		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

		//Move image file to new destination

		File DestFile=new File(fileWithPath);

		//Copy file at destination

		FileUtils.copyFile(SrcFile, DestFile);

	}

	public void loggingassertequals(String element1, String element2){

		if(element1.equals(element2)){

			logger.log(LogStatus.PASS, "Element is same " );
		}
		else {
			logger.log(LogStatus.FAIL, "Element is  not same Expected= "+element2+ " but found " +element1);	
		}	


	}

	public void loggingasserttrue(WebElement webElement){

		if(webElement.isDisplayed()){
			logger.log(LogStatus.PASS, "Element is displayed " );

		}

		else {
			logger.log(LogStatus.FAIL, "Element is  not displayed");	
		}

	}

	public boolean AddButton()
	{
		boolean status = false;
		try
		{
			if(UserAccess.getAddbutton().isDisplayed() || UserAccess.getAddbutton1().isDisplayed() )
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;

		}

		return status;
	}

	public boolean EditButton()
	{
		boolean status = false;
		try
		{
			if(UserAccess.getUserAccessEdit().isDisplayed() || UserAccess.getCurrPUserAccessEdit().isDisplayed() )
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;

		}

		return status;
	}

	public boolean ExportButton()
	{
		boolean status = false;
		try
		{
			if(UserAccess.getExportButton().isDisplayed() || UserAccess.getExportButton1().isDisplayed()  
					|| UserAccess.getAssessmentExportButton().isDisplayed() || UserAccess.getAssessmentExportButton4().isDisplayed() 
					|| UserAccess.getAssessmentExportButton5().isDisplayed() || UserAccess.getAssessmentExportButton6().isDisplayed() || UserAccess.getAssessmentExportButton7().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;

		}

		return status;
	}

	public boolean ImportButton()
	{
		boolean status = false;
		try
		{
			if(UserAccess.getImportButton().isDisplayed() || UserAccess.getImportButton1().isDisplayed()  
					|| UserAccess.getAssessmentImportButton().isDisplayed() || UserAccess.getImportButton2().isDisplayed() 
					|| UserAccess.getImportButton3().isDisplayed() || UserAccess.getImportButton4().isDisplayed() || UserAccess.getImportButton5().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;

		}

		return status;
	}

	public boolean DeleteButton()
	{
		boolean status = false;
		try
		{
			if(UserAccess.getDeletebutton().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;
	}

	public boolean TableLevelCheckbox()
	{
		boolean status = false;
		try
		{
			if(UserAccess.getTableLevelCheckboxes().isEnabled())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;
	}

	public boolean ReadPlanActualsExcel(String cardnumber, String carddate) throws IOException

	{
		boolean status;
		boolean Filereadstatus;

		String location = getexactfilenameforPlanActuals(cardnumber,carddate).toString();
		System.out.println(location);                                                         

		File f = new File(conf.getfilelocation() + "/" + location);

		System.out.println(f.getName());
		if (f.exists() ) {

			status = true;
		} else {

			status = false;
		}

		return status;

	}

	
	public String getexactfilenameforPlanActuals(String cardnumber, String carddate) {

		List<String> results = new ArrayList<String>();
		String filename = null;
		File[] files = new File(conf.getfilelocation()).listFiles();

		for (File file : files) {
			if (file.isFile()) {
				results.add(file.getName());



			}
		}


		String str = currenttime();
		String []division=cardnumber.split(" ");

		String prefix = division[0]+"_"+ carddate + "_" +conf.getfilenameforProjectPlanActuals()
		+str;


		System.out.println("Prefix is "+ prefix);


		for (int i = 0; i < results.size(); i++) {
			if (results.get(i).startsWith(prefix)) {

				filename = results.get(i);

			}
		}

		return filename;

	}

	public boolean TableLevelApprovalBtn()
	{
		boolean status = false;
		try
		{
			if(UserAccess.getTableLevelApprovalbtn().isDisplayed())
			{
				status=true;
			}
		}

		catch(Exception E)
		{
			return status=false;
		}

		return status;
	}

}
