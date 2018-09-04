package pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import util.ConfigReader;

/**
 * @author archit.singhal
 *
 */

public class user_Role_Elements {

	@FindBy(xpath = "//*[@id='userNameInput']")
	public WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(xpath = "//*[@id='passwordInput']")
	public WebElement password;

	public WebElement getpassword() {
		return password;
	}

	@FindBy(xpath = "//*[@id='submitButton']")
	public WebElement submitbutton;

	public WebElement getsubmitbutton() {
		return submitbutton;
	}

	@FindBy(xpath = "//div[@class='cards']")
	public WebElement homepagecard;

	public WebElement gethomepagecard() {
		return homepagecard;
	}

	
	@FindBy(xpath = "//div[@class='cards']//div//h1[@title='9thMar2018']")
	public WebElement cardtobeclicked;

	public WebElement getcardtobeclicked() {
		return cardtobeclicked;
	}
	
	@FindBys(@FindBy(xpath = "//ul[@role='menu']//li[@role='menuitem']"))
	private List<WebElement> menuheadericonslist;

	public List<WebElement> getmenuheadericonslist() {
		return menuheadericonslist;
	}
	/////////////////
	
	@FindBy(xpath = "//a//span[contains(@class,'plan')]")
	public WebElement planheader;

	public WebElement getplanheader() {
		return planheader;
	}
	
	@FindBy(xpath = "//a//span[contains(@class,'execution')]")
	public WebElement executionheader;

	public WebElement getexecutionheader() {
		return executionheader;
	}
	
	@FindBy(xpath = "//a//span[contains(@class,'governance')]")
	public WebElement governanceheader;

	public WebElement getgovernanceheader() {
		return governanceheader;
	}
	
	@FindBy(xpath = "//a//span[contains(@class,'quick-link')]")
	public WebElement quicklinkheader;

	public WebElement getquicklinkheader() {
		return quicklinkheader;
	}
	
	@FindBy(xpath = "//a//span[contains(@class,'stabilization')]")
	public WebElement stabilizationheader;

	public WebElement getstabilizationheader() {
		return stabilizationheader;
	}
	
	@FindBy(xpath = "//a//span[contains(@class,'reports')]")
	public WebElement reportsheader;

	public WebElement getreportsheader() {
		return reportsheader;
	}
	
	
	
	@FindBys(@FindBy(xpath = "//a//span[contains(@class,'plan')]//ancestor::li/div/div/div[2]/ul/li/a[1]"))
	private List<WebElement> plansubmenuheader;

	public List<WebElement> getplansubmenuheader() {
		return plansubmenuheader;
	}
	
	
	@FindBy(xpath = "//a//span[contains(@class,'plan')]//ancestor::li/div/div//div//p")
	public WebElement planheadershortdescription;

	public WebElement getplanheadershortdescription() {
		return planheadershortdescription;
	}
	
	
	@FindBy(xpath = "//a//span[contains(@class,'execution')]//ancestor::li/div/div//div//p")
	public WebElement executionheadershortdescription;

	public WebElement getexecutionheadershortdescription() {
		return executionheadershortdescription;
	}
	
	@FindBy(xpath = "//a//span[contains(@class,'governance')]//ancestor::li/div/div//div//p")
	public WebElement governanceheadershortdescription;

	public WebElement getgovernanceheadershortdescription() {
		return governanceheadershortdescription;
	}
	
	
	@FindBy(xpath = "//a//span[contains(@class,'stabilization')]//ancestor::li/div/div//div//p")
	public WebElement stabilizationheadershortdescription;

	public WebElement getstabilizationheadershortdescription() {
		return stabilizationheadershortdescription;
	}
	
	
	

	@FindBy(xpath = "//i[contains(@class,'logout')]")
	public WebElement logoutbutton;

	public WebElement getlogoutbutton() {
		return logoutbutton;
	}
	
	@FindBy(xpath = "//i[contains(@class,'transIcon-user')]")
	public WebElement userlogobutton;

	public WebElement getuserlogobutton() {
		return userlogobutton;
	}
	//////
	
	@FindBy(xpath = "//a[text()='Deal Information']")
	public WebElement Dealinformationsubheaderofplan;

	public WebElement getDealinformationsubheaderofplan() {
		return Dealinformationsubheaderofplan;
	}
	
	@FindBy(xpath = "//a[text()='MEC Checklist']")
	public WebElement MECChecklistsubheaderofplan;

	public WebElement getMECChecklistsubheaderofplan() {
		return MECChecklistsubheaderofplan;
	}
	
	@FindBy(xpath = "//a[text()='Transition Plan']")
	public WebElement TransitionPlansubheaderofplan;

	public WebElement getTransitionPlansubheaderofplan() {
		return TransitionPlansubheaderofplan;
	}
	
	@FindBy(xpath = "//a[text()='Project Staffing']")
	public WebElement ProjectStaffingsubheaderofplan;

	public WebElement getProjectStaffingsubheaderofplan() {
		return ProjectStaffingsubheaderofplan;
	}
	
	@FindBy(xpath = "//a[text()='Project Artifacts']")
	public WebElement ProjectArtifactssubheaderofplan;

	public WebElement getProjectArtifactssubheaderofplan() {
		return ProjectArtifactssubheaderofplan;
	}
	
	@FindBy(xpath = "//a[text()='Project Plan Setup']")
	public WebElement ProjectPlanSetupsubheaderofplan;

	public WebElement getProjectPlanSetupsubheaderofplan() {
		return ProjectPlanSetupsubheaderofplan;
	}
	
	
	@FindBy(xpath = "//h2[@class='title']")
	public WebElement Dealinformationhomepage;

	public WebElement getDealinformationhomepage() {
		return Dealinformationhomepage;
	}
	@FindBy(xpath = "//h2[@class='title']")
	public WebElement MECChecklisthomepage;

	public WebElement getMECChecklisthomepage() {
		return MECChecklisthomepage;
	}
	
	
	@FindBy(xpath = "//h1[contains(text(),'Transition Plan')]")
	public WebElement TransitionPlanhomepage;

	public WebElement getTransitionPlanhomepage() {
		return TransitionPlanhomepage;
	}
	
	@FindBy(xpath = "//h1[contains(text(),'Project Staffing')]")
	public WebElement ProjectStaffinghomepage;

	public WebElement getProjectStaffinghomepage() {
		return ProjectStaffinghomepage;
	}
	
	
	
	@FindBy(xpath = "//h1[contains(text(),'Project Artifacts')]")
	public WebElement ProjectArtifactshomepage;

	public WebElement getProjectArtifactshomepage() {
		return ProjectArtifactshomepage;
	}
	
	
	
	
	@FindBy(xpath = "//h1[contains(text(),'Project Plan Setup')]")
	public WebElement ProjectPlanSetuphomepage;

	public WebElement getProjectPlanSetuphomepage() {
		return ProjectPlanSetuphomepage;
	} 
	
	@FindBy(xpath = "//div[@class='container-fluid internal-page-title']//h1")
	public WebElement HomePageHeader;

	public WebElement getHomePageHeader() {
		return HomePageHeader;
	}
	
	
	
	
	@FindBys(@FindBy(xpath = "//h1[contains(text(),'Transition Plan')]/following-sibling::ul[1]/li/a"))
	private List<WebElement> transitionplanhomepagesubheader;

	public List<WebElement> gettransitionplanhomepagesubheader() {
		return transitionplanhomepagesubheader;
	}
	
	
	@FindBy(xpath = "//a[@class='active']")
	public WebElement TransitionPlanhomepageactivetab;

	public WebElement getTransitionPlanhomepageactivetab() {
		return TransitionPlanhomepageactivetab;
	}
	
	
	@FindBy(xpath = "//a[text()='Wave Setup']")
	public WebElement WAVESETUPsubheaderoftransition;

	public WebElement getWAVESETUPsubheaderoftransition() {
		return WAVESETUPsubheaderoftransition;
	}
	
	@FindBy(xpath = "//a[text()='Wave Workstream Setup']")
	public WebElement WAVEWORKSTREAMSetupsubheaderoftransition;

	public WebElement getWAVEWORKSTREAMSetupsubheaderoftransition() {
		return WAVEWORKSTREAMSetupsubheaderoftransition;
	}
	
	
	@FindBy(xpath = "//a[text()='Gantt Chart']")
	public WebElement GanttChartsubheaderoftransition;

	public WebElement getGanttChartsubheaderoftransition() {
		return GanttChartsubheaderoftransition;
	}
	
////////////////////////////	
	
	@FindBys(@FindBy(xpath = "//h1[contains(text(),'Project Plan')]//parent::div//following-sibling::ul[2]//li//a"))
	private List<WebElement> projectplansubheaders;

	public List<WebElement> getprojectplansubheaders() {
		return projectplansubheaders;
	}
	
	
	
	
	
	
	
	@FindBy(xpath = "//a[@class='active']")
	public WebElement ProjectPlanhomepageactivetab;

	public WebElement getProjectPlanhomepageactivetab() {
		return ProjectPlanhomepageactivetab;
	}
	
	
	@FindBy(xpath = "//a[text()='Current Project Plan']")
	public WebElement CurrentProjectPlansubheaderofprojectplan;

	public WebElement getCurrentProjectPlansubheaderofprojectplan() {
		return CurrentProjectPlansubheaderofprojectplan;
	}
	
	@FindBy(xpath = "//a[text()='Baselines']")
	public WebElement Baselinesubheaderofprojectplan;

	public WebElement getBaselinesubheaderofprojectplan() {
		return Baselinesubheaderofprojectplan;
		
		
	}
	
	@FindBy(xpath = "//a[text()='Gantt Chart']")
	public WebElement Ganttchartsubheaderofprojectplan;

	public WebElement getGanttchartsubheaderofprojectplan() {
		return Ganttchartsubheaderofprojectplan;
		
		
	}
	
	/////////////////////
	@FindBy(xpath = "//a[text()='Deal Information']//following-sibling::a//span")
	public WebElement Dealinformationbookmark;

	public WebElement getDealDealinformationbookmark() {
		return Dealinformationbookmark;
	}
	
	
	
	@FindBy(xpath = "//a[text()='MEC Checklist']//following-sibling::a//span")
	public WebElement MECChecklistbookmark;

	public WebElement getMECChecklistbookmark() {
		return MECChecklistbookmark;
	}
	
	@FindBy(xpath = "//a[text()='Transition Plan']//following-sibling::a//span")
	public WebElement TransitionPlanbookmark;

	public WebElement getTransitionPlanbookmark() {
		return TransitionPlanbookmark;
	}
	
	@FindBy(xpath = "//a[text()='Project Staffing']//following-sibling::a//span")
	public WebElement ProjectStaffingbookmark;

	public WebElement getProjectStaffingbookmark() {
		return ProjectStaffingbookmark;
	}
	
	@FindBy(xpath = "//a[text()='Project Artifacts']//following-sibling::a//span")
	public WebElement ProjectArtifactsbookmark;

	public WebElement getProjectArtifactsbookmark() {
		return ProjectArtifactsbookmark;
	}
	
	@FindBy(xpath = "//a[text()='Project Plan Setup']//following-sibling::a")
	public WebElement ProjectPlanSetupbookmark;

	public WebElement getProjectPlanSetupbookmark() {
		return ProjectPlanSetupbookmark;
	}
	
	
	@FindBy(xpath = "//span[@class='acn-cross']")
	public WebElement closebutton;

	public WebElement getclosebutton() {
		return closebutton;
	}
	
	@FindBy(xpath = "//header//a[@class='acn-angle-left back-arrow']")
	public WebElement backbutton;

	public WebElement getbackbutton() {
		return backbutton;
	}
	
	@FindBys(@FindBy(xpath = "//thead//tr//th"))
	private List<WebElement> baselinetabtable;

	public List<WebElement> getbaselinetabtable() {
		return baselinetabtable;
	}
	
	
	@FindBys(@FindBy(xpath = "//thead//tr"))
	private List<WebElement> baselinetabrowcount;

	public List<WebElement> getbaselinetabrowcount() {
		return baselinetabrowcount;
	}
	
	@FindBys(@FindBy(xpath = "//div[@class='k-grid-content']//table//tbody//tr//td[3]//span"))
	private List<WebElement> startdateganttcharttable;

	public List<WebElement> getstartdateganttcharttable() {
		return startdateganttcharttable;
	}
	
	@FindBys(@FindBy(xpath = "//div[@class='k-grid-content']//table//tbody//tr//td[4]//span"))
	private List<WebElement> enddateganttcharttable;

	public List<WebElement> getenddateganttcharttable() {
		return enddateganttcharttable;
	}

	@FindBys(@FindBy(xpath = "//div[@class='k-grid-content']//table//tbody//tr//td[5]//span"))
	private List<WebElement> weekganttcharttable;

	public List<WebElement> getweekganttcharttable() {
		return weekganttcharttable;
	}
	
	
	@FindBy(xpath = "//a[contains(text(),'View History')]")
	public WebElement viewhistorybutton;

	public WebElement getviewhistorybutton() {
		return viewhistorybutton;
	}
	
	@FindBy(xpath = "//h1[contains(text(),'VIEW HISTORY')]")
	public WebElement viewhistoryhomepage;

	public WebElement getviewhistoryhomepage() {
		return viewhistoryhomepage;
	}
	
	@FindBys(@FindBy(xpath = "//h1[contains(text(),'VIEW HISTORY')]//following-sibling::div//taBLE//THEAD//tr//th"))
	private List<WebElement> viewhistorytable;

	public List<WebElement> getviewhistorytable() {
		return viewhistorytable;
	}
	
	
	@FindBy(xpath = "//th[contains(text(),'MILESTONE')]//a//span")
	public WebElement milestonefilter;

	public WebElement getmilestonefilter() {
		return milestonefilter;
	}
	//////////////
	
	@FindBy(xpath = "//th[contains(text(),'CRITICAL PATH')]//a//span")
	public WebElement criticialpathfilter;

	public WebElement getcriticialpathfilter() {
		return criticialpathfilter;
	}
	
	@FindBy(xpath = "//th[contains(text(),'LEVEL')]//a//span")
	public WebElement levelfilter;

	public WebElement getlevelfilter() {
		return levelfilter;
	}
	
	
	@FindBy(xpath = "//th[contains(text(),'WAVE')]//a//span")
	public WebElement wavefilter;

	public WebElement getwavefilter() {
		return wavefilter;
	}
	
	
	@FindBy(xpath = "//th[contains(text(),'WORKSTREAM')]//a//span")
	public WebElement workstreamfilter;

	public WebElement getworkstreamfilter() {
		return workstreamfilter;
	}
	
	
	@FindBy(xpath = "//th[text()='OWNER (Enterprise Id)*']//a//span")
	public WebElement ownerenterpriseidfilter;

	public WebElement getownerenterpriseidfilter() {
		return ownerenterpriseidfilter;
	}
	
	
	@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//tr[1]//td[12]")
	public WebElement labelvalue;

	public WebElement getlabelvalue() {
		return labelvalue;
	}
	
	@FindBy(xpath = "/html/body/div[13]/form")
	public WebElement labelfilterdropdown;

	public WebElement getlabelfilterdropdown() {
		return labelfilterdropdown;
	}
	@FindBy(xpath = "html/body/div[15]/form")
	public WebElement wavefilterdropdown;

	public WebElement getwavefilterdropdown() {
		return wavefilterdropdown;
	}
	
	@FindBy(xpath = "html/body/div[13]/form/ul/li[1]/label//span[text()='Project']//parent::label//input")
	public WebElement labelfilterProjectcheckbox;

	public WebElement getlabelfilterProjectcheckbox() {
		return labelfilterProjectcheckbox;
	}
	
	
	
	@FindBy(xpath = "html/body/div[13]/form/ul/li[2]/label//span[text()='Wave']//parent::label//input")
	public WebElement labelfilterWavecheckbox;

	public WebElement getlabelfilterWavecheckbox() {
		return labelfilterWavecheckbox;
	}
	
	
	@FindBy(xpath = "html/body/div[13]/form/button[text()='Filter']")
	public WebElement filterselectionbutton;

	public WebElement getfilterselectionbutton() {
		return filterselectionbutton;
	}
	
	
	@FindBy(xpath = "html/body/div[13]/form/button[text()='Clear']")
	public WebElement filterclearbutton;

	public WebElement getfilterclearbutton() {
		return filterclearbutton;
	}
	
	
	@FindBys(@FindBy(xpath = "//div[@id='bookmarkedItem']//li//a"))
	private List<WebElement> bookmarkeditemlist;

	public List<WebElement> getbookmarkeditemlist() {
		return bookmarkeditemlist;
	}
	
	
	@FindBy(xpath = "//div[@id='bookmarkedItem']//li//a[@aria-label='Show more items']")
	public WebElement boomarkarrowsymbol;

	public WebElement getboomarkarrowsymbol() {
		return boomarkarrowsymbol;
	}
	
	@FindBy(xpath = "//div[@class='bookmark-this']//a")
	public WebElement boomarksymbol;

	public WebElement getboomarksymbol() {
		return boomarksymbol;
	}
	
	@FindBy(xpath = "//div[@class='bookmark-this']//a[@class='bookmark docked']")
	public WebElement boomarksymbolclicked;

	public WebElement getboomarksymbolclicked() {
		return boomarksymbolclicked;
	}
	@FindBy(xpath = "//div[@class='bookmark-this']//a[@class='bookmark']")
	public WebElement boomarksymbolNotClicked;

	public WebElement getboomarksymbolNotClicked() {
		return boomarksymbolNotClicked;
	}
	
	
	
	@FindBy(xpath = "//div[@id='bookmarkedItem']//li[1]//a")
	public WebElement boomarkitemone;

	public WebElement getboomarkitemone() {
		return boomarkitemone;
	}
	
	@FindBy(xpath = "//div[@id='bookmarkedItem']//li[2]//a")
	public WebElement boomarkitemtwo;

	public WebElement getboomarkitemtwo() {
		return boomarkitemtwo ;
	}
	
	@FindBy(xpath = "//h1[text()='Execution Summary']")
	public WebElement executionsummarypage;

	public WebElement getexecutionsummarypage() {
		
		return executionsummarypage ;
}
	
	
	@FindBy(xpath = "//div[@id='bookmarkedItem']//li//a[text()='Manage Links']")
	public WebElement managelinks;

	public WebElement getmanagelinks() {
		return managelinks ;
	}
	
	
	@FindBys(@FindBy(xpath = "//div[@id='manageDock']/div[2]/div/div/div[1]//ul//li"))
	private List<WebElement> managelinkslist;

	public List<WebElement> getmanagelinkslist() {
		return managelinkslist;
	}
	
	
	
	@FindBy(xpath = "//div[@id='manageDock']/div[2]/div/div/div[1]/ul/li/a/span")
	public WebElement managelinksbookmark;

	public WebElement getmanagelinksbookmark() {
		return managelinksbookmark ;
	}
	
	@FindBy(xpath = "//div[@id='manageDock']/div[1]/button")
	public WebElement managelinkscrossbutton;

	public WebElement getmanagelinkscrossbutton() {
		return managelinkscrossbutton ;
	}
	

	@FindBy(xpath = "//div[@id='manageDock']/div[3]/button")
	public WebElement managelinkssavebutton;

	public WebElement getmanagelinkssavebutton() {
		return managelinkssavebutton ;
	}
	
	
	@FindBys(@FindBy(xpath = "html/body/div[9]/form/ul/li/label/span"))
	private List<WebElement> wavefilterlist;

	public List<WebElement> getwavefilterlist() {
		return wavefilterlist;
	}
	//////////////
	
	@FindBy(xpath = "//span[text()='AutomationMay2018']")
	public WebElement mayprojectcard;

	public WebElement getmayprojectcard() {
		return mayprojectcard ;
	}
	/////////////////
	
	@FindBy(xpath = "//div//ul//li//following-sibling::a[text()='Deal Execution']//following::a/span[@class='transIcon-bookmarked']")
	public WebElement bookmarkonDealExecution;

	public WebElement getbookmarkonDealExecution() {
		return bookmarkonDealExecution ;
	}
	
	@FindBy(xpath = "//div//ul//li//following-sibling::a[text()='Project Plan']//following::a/span[@class='transIcon-bookmarked']")
	public WebElement bookmarkonProjectplan;

	public WebElement getbookmarkonProjectplan() {
		return bookmarkonProjectplan ;
	}
	
	
	@FindBy(xpath = "//div//ul//li[3]//following-sibling::a[text()='Project Staffing']//following::a/span[@class='transIcon-bookmarked']")
	public WebElement bookmarkonProjectStaffing;

	public WebElement getbookmarkonProjectStaffing() {
		return bookmarkonProjectStaffing ;
	}
	
	
	
	@FindBy(xpath = "//div//ul//li[4]//following-sibling::a[text()='Execution Summary']//following::span[2][@class='transIcon-bookmarked']")
	public WebElement bookmarkonExecutionSummary;

	public WebElement getbookmarkonExecutionSummary() {
		return bookmarkonExecutionSummary ;
	}
	
	
	
	@FindBy(xpath = "//div//ul//li[5]//following-sibling::a[text()='Wave Details']//following::span[@class='transIcon-bookmarked']")
	public WebElement bookmarkonWaveDetails;

	public WebElement getbookmarkonWaveDetails() {
		return bookmarkonWaveDetails ;
	}
	
	
	@FindBy(xpath = "//div//ul//li[6]//following-sibling::a[text()='Enable People']//following::span[@class='transIcon-bookmarked']")
	public WebElement bookmarkonEnablePeople;

	public WebElement getbookmarkonEnablePeople() {
		return bookmarkonEnablePeople ;
	}
	
	
	
	@FindBy(xpath = "//div//ul//li[7]//following-sibling::a[text()='Train the Trainer']//following::span[@class='transIcon-bookmarked']")
	public WebElement bookmarkonTrainthetrainer;

	public WebElement getbookmarkonTrainthetrainer() {
		return bookmarkonTrainthetrainer ;
	}
	
	
	
	@FindBy(xpath = "//div//ul[2]//li[1]//following-sibling::a[text()='Delivery Team Training']//following::span[@class='transIcon-bookmarked']")
	public WebElement bookmarkonDeltrain;

	public WebElement getbookmarkonDeltrain() {
		return bookmarkonDeltrain ;
	}
	
	
	
	
	@FindBy(xpath = "//div//ul[2]//li[3]//following-sibling::a[text()='Service Readiness']//following::span[@class='transIcon-bookmarked']")
	public WebElement bookmarkonServreadiness;

	public WebElement getbookmarkonServreadiness() {
		return bookmarkonServreadiness ;
	}
	
	
	
	@FindBy(xpath = "//following-sibling::a[text()='Tech & Work Environment']//following::span[@class='transIcon-bookmarked']")
	public WebElement bookmarkonTechandWork;

	public WebElement getbookmarkonbookmarkonTechandWork() {
		return bookmarkonTechandWork ;
	}
	
	@FindBy(xpath = "//ul[@role='menu']/li[2]/div/button/span[@class='acn-cross']")
	public WebElement crossbutton;

	public WebElement getcrossbutton() {
		return crossbutton ;
	}
	
	@FindBy(xpath = "//i[@class='transIcon-user_access icon']")
	public WebElement useraccessicon;

	public WebElement getuseraccessicon() {
		return useraccessicon ;
	}
	
	
	
	@FindBy(xpath = "//div//ul//li//following-sibling::a[text()='Deal Execution']")
	public WebElement Dealexecutionubheaderofexecution;

	public WebElement getDealexecutionubheaderofexecution() {
		return Dealexecutionubheaderofexecution;
	}
	
	
	@FindBy(xpath = "//div//ul//li//following-sibling::a[text()='Project Plan']")
	public WebElement ProjectPlansubheaderofexecution;

	public WebElement getProjectPlansubheaderofexecution() {
		return ProjectPlansubheaderofexecution;
	}
	
	
	
	@FindBy(xpath = "//div//ul//li[2]//following-sibling::a[text()='Project Staffing']")
	public WebElement ProjectStaffingsubheaderofexecution;

	public WebElement getProjectStaffingsubheaderofexecution() {
		return ProjectStaffingsubheaderofexecution;
	}
	
	
	
	@FindBy(xpath = "//div//ul//li[4]//following-sibling::a[text()='Execution Summary']")
	public WebElement ExecutionSummarysubheaderofexecution;

	public WebElement getExecutionSummarysubheaderofexecution() {
		return ExecutionSummarysubheaderofexecution;
	}
	
	
	
	@FindBy(xpath = "//div//ul//li[5]//following-sibling::a[text()='Wave Details']")
	public WebElement WaveDetailssubheaderofexecution;

	public WebElement getWaveDetailssubheaderofexecution() {
		return WaveDetailssubheaderofexecution;
	}
	
	@FindBy(xpath = "//div//ul[@role='tablist']/li//following::a[text()='Wave Details']")
	public WebElement wavedetailstab;

	public WebElement getwavedetailstab() {
		return wavedetailstab;
	}
	
	
	@FindBy(xpath = "//div//ul[@role='tablist']/li//following::a[text()='Automation']")
	public WebElement Automationtab;

	public WebElement getAutomationtab() {
		return Automationtab;
	}
	
	@FindBy(xpath = "//input[@id='BPOFTE_']//following::span[@aria-label='Increase value'][1]")
	public WebElement BPOFTEDealsetup;

	public WebElement getBPOFTEDealsetup() {
		return BPOFTEDealsetup;
	}
	
	@FindBy(xpath = "//input[@id='IOFTE_']//following::span[@aria-label='Increase value'][1]")
	public WebElement IOFTEDealsetup;

	public WebElement getIOFTEDealsetup() {
		return IOFTEDealsetup;
	}
	
	@FindBy(xpath = "//button[text()='SAVE']")
	public WebElement DealsetupSavebtn;

	public WebElement getDealsetupSavebtn() {
		return DealsetupSavebtn;
	}
	
	
	
	@FindBy(xpath = "//button[text()='SAVE']")
	public WebElement WavesetupTab;

	public WebElement getWavesetupTab() {
		return WavesetupTab;
	}
	
	
	
	
	
	
	
	
}
