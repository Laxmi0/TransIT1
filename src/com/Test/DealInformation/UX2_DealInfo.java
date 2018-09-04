package com.Test.DealInformation;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Log;

public class UX2_DealInfo extends Util {


	@BeforeTest
	public void setup() 
	{

		setupmethod();

	}
	
	@BeforeClass
	public void drivers(){

		drivers1("./UX2DealInfo.html");
		
		

	}
	
	@Test(priority=1,enabled=true)
	public void UX001() throws InterruptedException
	{
		logger = extent.startTest("UX001");
		log.info("Test Started");
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		wait = new WebDriverWait(driver,60);
		driver.get(conf.getUrl());
		login();
		driver.manage().window().maximize();
		feedback();
		//log.info("URL Hit");
		logger.log(LogStatus.PASS, "URL HIT");
	    //log.info("URL HIT");
		SoftAssert softAssertion = new SoftAssert();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='AutomationMay2018']")));
		dealInfopage.getProjectCard().click();
		By loadingImage = By.xpath("//div[@id='imgMppDiv']");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		dealInfopage.getExecutionIcon().click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='menu-links col-sm-6 ng-scope']//li[1]")));
		dealInfopage.getDealExecutiondashboardIcon().click();
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		softAssertion.assertTrue(dealInfopage.getDealRAG().isDisplayed(), "Deal RAG is not present");
		softAssertion.assertTrue(dealInfopage.getDealComments().isDisplayed(), "Deal Comments is not present");
		softAssertion.assertTrue(dealInfopage.getClientPerceptionRAG().isDisplayed(), "Client Perception RAG is not present");
		softAssertion.assertTrue(dealInfopage.getGovernenaceAttentionLevel().isDisplayed(), "Governenace Attention Level is not present");
		softAssertion.assertTrue(dealInfopage.getContractLegalRAGStatus().isDisplayed(), "Contract & Legal RAG Status Level is not present");
		softAssertion.assertTrue(dealInfopage.getContractLegalRAGStatus().isDisplayed(), "Contract & Legal RAG Status Level is not present");
		softAssertion.assertTrue(dealInfopage.getCoommercialRAGStatus().isDisplayed(), "Coommercial RAG Status Level is not present");
		softAssertion.assertTrue(dealInfopage.getExternalHires().isDisplayed(), "EXternal Hires Level is not present");
		softAssertion.assertTrue(dealInfopage.getSeeding().isDisplayed(), "Seeding option is not present");
		softAssertion.assertTrue(dealInfopage.getWatchListDetails().isDisplayed(), "Watchlist Details is not present");
		softAssertion.assertTrue(dealInfopage.getWatchListDetailsExpandIcon().isDisplayed(), "Coommercial Status RAG Status Level is not present");
		dealInfopage.getWatchListDetailsExpandIcon().click();
		softAssertion.assertTrue(dealInfopage.getDealonWatchList().isDisplayed(), "Is Deal on Watchlist option is not present");
		softAssertion.assertTrue(dealInfopage.getWatchListLevel().isDisplayed(), "Watchlis level is not present");
		softAssertion.assertTrue(dealInfopage.getIssueType().isDisplayed(), "Issue Type is not present");
		softAssertion.assertTrue(dealInfopage.getGoLiveDate().isDisplayed(), "Go Live Date is not present");
		softAssertion.assertTrue(dealInfopage.getStatusUpdate().isDisplayed(), "Status Update is not present");
		softAssertion.assertTrue(dealInfopage.getTargetMonth().isDisplayed(), "Target month is not present");
		softAssertion.assertTrue(dealInfopage.getWatchListExitCriteria().isDisplayed(), "WatchList Exit Criteria is not present");
		softAssertion.assertTrue(dealInfopage.getExternalHires().isDisplayed(), "EXternal Hires Level is not present");
		softAssertion.assertTrue(dealInfopage.getSeeding().isDisplayed(), "Seeding option is not present");
		softAssertion.assertTrue(dealInfopage.getWatchListDetails().isDisplayed(), "Watchlist Details is not present");

		softAssertion.assertTrue(dealInfopage.getIssue().isDisplayed(), "Notes is not present");
		softAssertion.assertTrue(dealInfopage.getNotes().isDisplayed(), "Issues is not present");
		softAssertion.assertTrue(dealInfopage.getAction().isDisplayed(), "Action is not present");
		softAssertion.assertAll();
		logger.log(LogStatus.PASS, "Test Case Passed");
	}

	@Test(priority=2,enabled=false)
	public void UX002() throws InterruptedException
	{
		// js.executeScript("arguments[0].click();",user_role.clickprojectCard());
		//js.executeScript("window.scrollTo(0,200)");
		//WebElement card=driver.findElement(By.xpath("//*[@title='Auto12']"));
		logger = extent.startTest("UX002");
		log.info("Test Started");
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		wait = new WebDriverWait(driver,60);
		driver.get(conf.getUrl());
		login();
		feedback();
		driver.manage().window().maximize();
		SoftAssert softAssertion = new SoftAssert();
		logger.log(LogStatus.PASS, "URL HIT");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='AutomationMay2018']")));
		dealInfopage.getProjectCard().click();
		By loadingImage = By.xpath("//div[@id='imgMppDiv']");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		dealInfopage.getExecutionIcon().click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='menu-links col-sm-6 ng-scope']//li[1]")));
		dealInfopage.getDealExecutiondashboardIcon().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		softAssertion.assertTrue(dealInfopage.getWatchListDetailsExpandIcon().isDisplayed(), "Coommercial Status RAG Status Level is not present");
		dealInfopage.getWatchListDetailsExpandIcon().click();
		System.out.println("a");
		// js.executeScript("window.scrollTo(0,200)");


		softAssertion.assertTrue(dealInfopage.getWatchListLevelDisabled().getAttribute("disabled").equals("true"),"Element is not enabled");
		System.out.println("a");
		softAssertion.assertTrue(dealInfopage.getGoLiveDateReadOnly().getAttribute("readonly").equals("true"),"Element ReadOnly");
		dealInfopage.getWatchListDetailsExpandIcon().click(); 
		softAssertion.assertAll();
		logger.log(LogStatus.PASS, "Test Case Passed");

	}
	@Test(priority=3,enabled=false)
	public void UX003() throws InterruptedException
	{
		logger = extent.startTest("UX003");
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		wait = new WebDriverWait(driver,60);
		driver.get(conf.getUrl());
		login();
		feedback();
		driver.manage().window().maximize();
		logger.log(LogStatus.PASS, "URL HIT");
		SoftAssert softAssertion = new SoftAssert();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='AutomationMay2018']")));
		dealInfopage.getProjectCard().click();
		By loadingImage = By.xpath("//div[@id='imgMppDiv']");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		dealInfopage.getExecutionIcon().click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='menu-links col-sm-6 ng-scope']//li[1]")));
		dealInfopage.getDealExecutiondashboardIcon().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		softAssertion.assertTrue(dealInfopage.getWatchListDetailsExpandIcon().isDisplayed(), "Coommercial Status RAG Status Level is not present");
		dealInfopage.getWatchListDetailsExpandIcon().click();
		// js.executeScript("window.scrollTo(0,200)");


		softAssertion.assertTrue(dealInfopage.getWatchListLevelDisabled().getAttribute("disabled").equals("true"),"Element is not enabled");
		softAssertion.assertTrue(dealInfopage.getGoLiveDateReadOnly().getAttribute("readonly").equals("true"),"Element ReadOnly");
		dealInfopage.getWatchListDetailsExpandIcon().click(); 
		softAssertion.assertAll();
		logger.log(LogStatus.PASS, "Test Case Passed");

	}

	@Test(enabled=false,priority=4)
	public void UX004() throws InterruptedException
	{
		logger = extent.startTest("UX004");
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		wait = new WebDriverWait(driver,60);
		driver.get(conf.getUrl());
		login();
		feedback();
		driver.manage().window().maximize();
		logger.log(LogStatus.PASS, "URL HIT");
		SoftAssert softAssertion = new SoftAssert();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='AutomationMay2018']")));
		dealInfopage.getProjectCard().click();
		By loadingImage = By.xpath("//div[@id='imgMppDiv']");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		dealInfopage.getExecutionIcon().click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='menu-links col-sm-6 ng-scope']//li[1]")));
		dealInfopage.getDealExecutiondashboardIcon().click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		softAssertion.assertEquals(dealInfopage.getDealCommentsTextArea().getText(),"");
		dealInfopage.getDealRAGDropdown().click();
		while(!driver.switchTo().activeElement().getText().contains("Amber (At Risk)"))
		{
			driver.switchTo().activeElement().sendKeys(Keys.DOWN);
		}

		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		dealInfopage.getDealCommentsTextArea().clear();
		dealInfopage.getDealExecutionSaveButton().click();
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("*//div[@id='divpopupMessageCtl']//div[@class='modal-dialog']//div[@class='modal-content']//div[@id='divpopupMessage']")).getText();
		System.out.println("text is" +text);
		softAssertion.assertEquals(text, "Deal comments is mandatory if deal rag status is red or amber.");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='btnMessageOK']")));
		dealInfopage.getMandatoryOkButton().click();

		js.executeScript("window.scrollBy(0,-250)", "");
		Thread.sleep(2000);
		dealInfopage.getDealRAGDropdown().click();
		while(!driver.switchTo().activeElement().getText().contains("Red (Behind Track)"))
		{
			driver.switchTo().activeElement().sendKeys(Keys.UP);
		}
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		dealInfopage.getDealExecutionSaveButton().click();
		Thread.sleep(2000);
		softAssertion.assertEquals(text, "Deal comments is mandatory if deal rag status is red or amber.");
		softAssertion.assertAll();  
		logger.log(LogStatus.PASS, "Test Case Passed");

	}
	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {

			logger.log(LogStatus.FAIL,
					"Test Case Failed is " + result.getName());
			logger.log(LogStatus.FAIL,
					"Test case failed" + result.getThrowable());
		}

		extent.endTest(logger);
	}
	@AfterTest
	public void tearDown() throws IOException {
		driver.close();
	}

	@AfterClass
	public void closereport(){
		extent.flush();
		extent.close();

	}


}