package pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class EnablePeoplePage {
	@FindBy(xpath = "//span[text()='9thMar2018']")
	public WebElement ProjectCard;

	public WebElement getProjectCard() {
		return ProjectCard;
	}

	@FindBy(xpath = "//a[@ng-click ='ReturntoDmatHome()']")
	public WebElement ProjectCardBack;

	public WebElement geProjectCardBack() {
		return ProjectCardBack;
	}

	@FindBy(xpath = "//span[text()='Accenture 07th July 2017']")
	public WebElement ProjectCard1;

	public WebElement getProjectCard1() {
		return ProjectCard1;
	}

	@FindBy(xpath = "//div[@class='proj-code ng-binding']")
	public WebElement ProjectCode;

	public WebElement getProjectCode() {
		return ProjectCode;
	}

	@FindBy(xpath = "//a[@href='/waveExecution/waveExecution/enablePeople?subwaveId=1730&workstreamId=20053']")
	public WebElement EnablepplLinkpercentage;

	public WebElement getEnablepplLinkpercentage() {
		return EnablepplLinkpercentage;
	}

	@FindBy(xpath = "//a[@class='active']")
	public WebElement Enablepplactivetab;

	public WebElement getEnablepplactivetab() {
		return Enablepplactivetab;
	}

	@FindBy(xpath = "//a[@class='transIcon-manage_bookmarks more-icon']")
	public WebElement managebookmarksymbol;

	public WebElement getmanagebookmarksymbol() {
		return managebookmarksymbol;
	}

	@FindBy(xpath = "//a[@title='Bookmark Enable People']//span[@class='transIcon-bookmarked']")
	public WebElement Enablepplbookmarksymbol;

	public WebElement getEnablepplbookmarksymbol() {
		return Enablepplbookmarksymbol;
	}

	@FindBy(xpath = "//a[@ng-click='GetWaves()']//span[@class='dropdown-icon transIcon-dropdown']")
	public WebElement dropdwnsymbforWavename;

	public WebElement getdropdwnsymbforWavename() {
		return dropdwnsymbforWavename;
	}

	@FindBy(xpath = "//a[@ng-click='openWorkStream()']//span[@class='dropdown-icon transIcon-dropdown']")
	public WebElement dropdwnsymbforopenwrkstrm;

	public WebElement getdropdwnsymbforopenwrkstrm() {
		return dropdwnsymbforopenwrkstrm;
	}

	@FindBy(xpath = "//a[@ng-click='GetWaves()']//span[@class='dropdown-icon transIcon-dropdown']")
	public WebElement dropdwnsymbforopenwave;

	public WebElement getdropdwnsymbforopenwave() {
		return dropdwnsymbforopenwave;
	}

	@FindBy(xpath = "//div[@id='divpopupMessage']")
	public WebElement SDOInvalidFilepopupmsg;

	public WebElement getSDOInvalidFilepopupmsg() {
		return SDOInvalidFilepopupmsg;
	}

	@FindBy(xpath = "//ul//li//button[text()='Add Activity']")
	public WebElement AddActivitybutton;

	public WebElement getAddActivitybutton() {
		return AddActivitybutton;
	}

	@FindBy(xpath = "//ul//li//button[@ng-click='viewHistory()']")
	public WebElement ViewHistorybutton;

	public WebElement getViewHistorybutton() {
		return ViewHistorybutton;
	}

	@FindBy(xpath = "//span[@class='expand-grid-icon']")
	public WebElement ExpanderIcon;

	public WebElement getExpanderIcon() {
		return ExpanderIcon;
	}

	@FindBy(xpath = "//span[@class='acn-shrink']")
	public WebElement ExpanderShrinkIcon;

	public WebElement getExpanderShrinkIcon() {
		return ExpanderShrinkIcon;
	}

	@FindBy(xpath = "//div[@class='wave-rag-status']//span[@class='k-icon k-i-arrow-60-down']")
	public WebElement RAGStatsdropdown;

	public WebElement getRAGStatsdropdown() {
		return RAGStatsdropdown;
	}

	@FindBy(xpath = "//h3[@class='progress-title' and text()='RAG Status']")
	public WebElement RAGStatstitle;

	public WebElement getRAGStatstitle() {
		return RAGStatstitle;
	}

	@FindBy(xpath = "//h3[@class='progress-title' and text()='Overall Workstream']")
	public WebElement OverallPerctgeTitle;

	public WebElement getOverallPerctgeTitle() {
		return OverallPerctgeTitle;
	}

	@FindBy(xpath = "//span[@id='completionPct' and contains(., 'Completed')]")
	public WebElement Completionpercetage;

	public WebElement getCompletionpercetage() {
		return Completionpercetage;
	}

	@FindBy(xpath = "//div[@class='progress']")
	public WebElement CompletionLinegraph;

	public WebElement getCompletionLinegraph() {
		return CompletionLinegraph;
	}

	@FindBy(xpath = "//span[@class='transIcon-close']")
	public WebElement ViewhistoryTableclosebtn;

	public WebElement getViewhistoryTableclosebtn() {
		return ViewhistoryTableclosebtn;
	}

	@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//table[@role='grid']//tbody//tr[2]//td[3]//a//span[@class='k-icon k-i-edit']")
	public WebElement ActivitytableEditbtnclick;

	public WebElement getActivitytableEditbtnclick() {
		return ActivitytableEditbtnclick;
	}

	@FindBy(xpath = "//input[@id='txtActualStartDate']")
	public WebElement EditActivityActstrtdate;

	public WebElement getEditActivityActstrtdate() {
		return EditActivityActstrtdate;
	}

	@FindBy(xpath = "//input[@id='txtComplete']")
	public WebElement EditActivityCompletionperctge;

	public WebElement getEditActivityCompletionperctge() {
		return EditActivityCompletionperctge;
	}

	@FindBy(xpath = "//input[@id='txtOwner']")
	public WebElement ActivityOwnerId;

	public WebElement getActivityOwnerId() {
		return ActivityOwnerId;
	}

	@FindBy(xpath = "//a[@class='k-button k-button-icontext k-primary k-grid-update']")
	public WebElement EditActivitySavebtn;

	public WebElement getEditActivitySavebtn() {
		return EditActivitySavebtn;
	}

	@FindBy(xpath = "//button[@id='btnMessageOK']")
	public WebElement EditActivityOkbtn;

	public WebElement getEditActivityOkbtn() {
		return EditActivityOkbtn;
	}

	@FindBy(xpath = "//input[@id='txtActivity']")
	public WebElement AddActivitywthActvtytxtbox;

	public WebElement getAddActivitywthActvtytxtbox() {
		return AddActivitywthActvtytxtbox;
	}

	@FindBy(xpath = "//label[@id='transErrTaskName']")
	public WebElement AddActivitytxtboxerror;

	public WebElement getAddActivitytxtboxerror() {
		return AddActivitytxtboxerror;
	}

	@FindBy(xpath = "//label[text()='OWNER CATEGORY ']")
	public WebElement AddActivityOwnerCat;

	public WebElement getAddActivityOwnerCat() {
		return AddActivityOwnerCat;
	}

	@FindBy(xpath = "//input[@id='txtPlannedStartDate']")
	public WebElement AddActivtyPlandstrtdate;

	public WebElement getAddActivtyPlandstrtdate() {
		return AddActivtyPlandstrtdate;
	}

	@FindBy(xpath = "//label[@id='transErrPlannedStartDate']")
	public WebElement AddActivtyPlandstrtdateError;

	public WebElement getAddActivtyPlandstrtdateError() {
		return AddActivtyPlandstrtdateError;
	}

	@FindBy(xpath = "//input[@id='txtPlannedEndDate']")
	public WebElement AddActivtyPlandEnddate;

	public WebElement getAddActivtyPlandEnddate() {
		return AddActivtyPlandEnddate;
	}

	@FindBy(xpath = "//input[@id='txtActualEndDate']")
	public WebElement AddActivtyActualEnddate;

	public WebElement getAddActivtyActualEnddate() {
		return AddActivtyActualEnddate;
	}

	@FindBy(xpath = "//input[@id='txtActualStartDate']")
	public WebElement AddActivtyActualStartdate;

	public WebElement getAddActivtyActualStartdate() {
		return AddActivtyActualStartdate;
	}

	@FindBy(xpath = "//input[@id='txtComplete']")
	public WebElement AddActivtyCompletpct;

	public WebElement getAddActivtyCompletpct() {
		return AddActivtyCompletpct;
	}

	@FindBy(xpath = "//input[@id='txtOwner']")
	public WebElement AddActivtyOwnerId;

	public WebElement getAddActivtyOwnerId() {
		return AddActivtyOwnerId;
	}

	@FindBy(xpath = "//label[text()='COMMENTS']//following::textarea")
	public WebElement AddActivtyComments;

	public WebElement getAddActivtyComments() {
		return AddActivtyComments;
	}

	@FindBy(xpath = "//a[@role='button' and @class='k-button k-button-icontext k-primary k-grid-update']")
	public WebElement AddActivtySavebtn;

	public WebElement getAddActivtySavebtn() {
		return AddActivtySavebtn;
	}

	@FindBy(xpath = "//a[@role='button' and @class='k-button k-bare k-button-icon k-window-action']")
	public WebElement AddActivtyClosebtn;

	public WebElement getAddActivtyClosebtn() {
		return AddActivtyClosebtn;
	}

	@FindBy(xpath = "//div[@id='Sub_wave_selector']//div[@class='item ng-scope active']//ul//li[4]//a[text()]")
	public WebElement Enablepplsubwaveselect;

	public WebElement getEnablepplsubwaveselect() {
		return Enablepplsubwaveselect;
	}

	@FindBy(xpath = "//div[@id='workstream_selector']//h1[text()='Workstream']//following::ul//li[1]//a[text()]")
	public WebElement Enablepplwrkstrmsubwaveselect;

	public WebElement getEnablepplwrkstrmsubwaveselect() {
		return Enablepplwrkstrmsubwaveselect;
	}

	@FindBy(xpath = "//div[@id='workstream_selector']//button//i[@class='acn-cross']")
	public WebElement Workstreamwindowclosebtn;

	public WebElement getWorkstreamwindowclosebtn() {
		return Workstreamwindowclosebtn;
	}

	@FindBy(xpath = "//span[@class='k-icon k-i-sort-asc-sm']")
	public WebElement ActivityColAscSortoption;

	public WebElement getActivityColAscSortoption() {
		return ActivityColAscSortoption;
	}

	@FindBy(xpath = "//span[@class='k-icon k-i-sort-desc-sm']")
	public WebElement ActivityColDescSortoption;

	public WebElement getActivityColDescSortoption() {
		return ActivityColDescSortoption;
	}

	@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//tbody//tr[2]//td[11]")
	public WebElement UpdatedCompletiondatainActivity;

	public WebElement getUpdatedCompletiondatainActivity() {
		return UpdatedCompletiondatainActivity;
	}

	@FindBy(xpath = "//div[@id='historyId']//div[@class='k-grid-content k-auto-scrollable']//tbody//tr[1]//td[4]")
	public WebElement UpdatedCompletiondatainHistory;

	public WebElement getUpdatedCompletiondatainHistory() {
		return UpdatedCompletiondatainHistory;
	}

	@FindBy(xpath = "//label[@id='transErrGeneral']")
	public WebElement OwnerIdinvaliderrmsg;

	public WebElement getOwnerIdinvaliderrmsg() {
		return OwnerIdinvaliderrmsg;
	}

	@FindBy(xpath = "//label[@id='transErrGeneral']")
	public WebElement Actualstrtdateinvaliderrmsgless;

	public WebElement getActualstrtdateinvaliderrmsgless() {
		return Actualstrtdateinvaliderrmsgless;
	}

	@FindBy(xpath = "//label[@id='transErrGeneral']")
	public WebElement Actualstrtdateinvaliderrmsgfuture;

	public WebElement getActualstrtdateinvaliderrmsgfuture() {
		return Actualstrtdateinvaliderrmsgfuture;
	}

	@FindBy(xpath = "//label[@id='transErrGeneral']")
	public WebElement Plndstrtdateinvaliderrmsg;

	public WebElement getPlndstrtdateinvaliderrmsg() {
		return Plndstrtdateinvaliderrmsg;
	}

	@FindBy(xpath = "//label[@id='transErrGeneral']")
	public WebElement PlndEnddateinvaliderrmsg;

	public WebElement getPlndEnddateinvaliderrmsg() {
		return PlndEnddateinvaliderrmsg;
	}

	@FindBy(xpath = "//label[@id='transErrGeneral']")
	public WebElement ActualEnddaterrmsgreqdcompletion;

	public WebElement getActualEnddaterrmsgreqdcompletion() {
		return ActualEnddaterrmsgreqdcompletion;
	}

	@FindBy(xpath = "//label[@id='transErrGeneral']")
	public WebElement ActualStartdaterrmsgreqdcompletion;

	public WebElement getActualStartdaterrmsgreqdcompletion() {
		return ActualStartdaterrmsgreqdcompletion;
	}

	@FindBy(xpath = "//label[@id='transErrGeneral']")
	public WebElement ActualEnddaterrmsgnotreqd;

	public WebElement getActualEnddaterrmsgnotreqd() {
		return ActualEnddaterrmsgnotreqd;
	}

	@FindBy(xpath = "//ul[@class='nav nav-tabs tabs']//li[2]//a[@aria-controls='sdoStaffing']")
	public WebElement SDOtab;

	public WebElement getSDOtab() {
		return SDOtab;
	}

	@FindBy(xpath = "//li[@id='sdoTrackerImport']//span[@class='transIcon-import']")
	public WebElement SDOimporticon;

	public WebElement getSDOimporticon() {
		return SDOimporticon;
	}

	@FindBy(xpath = "//li//a[@ng-click='ExportSdoTracker()']//span[@class='transIcon-export']")
	public WebElement SDOexporticon;

	public WebElement getSDOexporticon() {
		return SDOexporticon;
	}

	@FindBy(xpath = "//button[@ng-click='addSdoTracker()']")
	public WebElement SDOAddresource;

	public WebElement getSDOAddresource() {
		return SDOAddresource;
	}

	@FindBy(xpath = "//button[@ng-click='AddResource()']")
	public WebElement TTTAssesAddresource;

	public WebElement getTTTAssesAddresource() {
		return TTTAssesAddresource;
	}

	@FindBy(xpath = "//span[@class='acn-shrink']")
	public WebElement SDOExpanderShrinkIcon;

	public WebElement getSDOExpanderShrinkIcon() {
		return SDOExpanderShrinkIcon;
	}

	@FindBy(xpath = "//a//span[@class='expand-grid-icon']")
	public WebElement SDOExpanderIcon;

	public WebElement getSDOExpanderIcon() {
		return SDOExpanderIcon;
	}

	@FindBy(xpath = "//*[@title='Column Settings']/span")
	public WebElement settingsIcon;

	public WebElement getSettingsIcon() {
		return settingsIcon;
	}

	@FindBy(xpath = "//*[contains(text(),'Columns')]")
	public WebElement gridSettingsColumn;

	public WebElement getGridSettingsColumn() {
		return gridSettingsColumn;
	}

	@FindBy(xpath = "C")
	public WebElement AddResrcePlannedonbrdDatedeflt;

	public WebElement getAddResrcePlannedonbrdDatedeflt() {
		return AddResrcePlannedonbrdDatedeflt;
	}

	@FindBy(xpath = "//label[text()='Actual Onboarding Date(DOJ)']//following::span//input[@type='text' and @k-ng-model='dataItem.ActualOnboardingDt_']")
	public WebElement AddResrceActualonbrdDate;

	public WebElement getAddResrceActualonbrdDate() {
		return AddResrceActualonbrdDate;
	}

	@FindBy(xpath = "//label[contains(text(),'Onboarding Status')]//following-sibling::span/span[1]")
	public WebElement AddResrceOnbordStatsdeflt;

	public WebElement getAddResrceOnbordStatsdeflt() {
		return AddResrceOnbordStatsdeflt;
	}

	@FindBy(xpath = "//label[contains(text(),'Candidate Status')]//following-sibling::span/span[1]")
	public WebElement AddResrceCandStatsdeflt;

	public WebElement getAddResrceCandStatsdeflt() {
		return AddResrceCandStatsdeflt;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Candidate Status')]//following-sibling::span/span[1]//span")
	public WebElement AddResrceCandStatsdeflt1;

	public WebElement getAddResrceCandStatsdeflt1() {
		return AddResrceCandStatsdeflt1;
	}

	@FindBy(xpath = "//label[contains(text(),'NJO Status')]//following-sibling::span/span[1]")
	public WebElement AddResrceNJOStatsdeflt;

	public WebElement getAddResrceNJOStatsdeflt() {
		return AddResrceNJOStatsdeflt;
	}

	@FindBy(xpath = "//label[contains(text(),'Visa Processing')]//following-sibling::span/span[1]//span[text()]")
	public WebElement AddResrceVisaProcessdeflt;

	public WebElement getAddResrceVisaProcessdeflt() {
		return AddResrceVisaProcessdeflt;
	}

	@FindBy(xpath = "//label[contains(text(),'Overall Status')]//following-sibling::span/span[1]//span[text()]")
	public WebElement AddResrceOverallstatusdeflt;

	public WebElement getAddResrceOverallstatusdeflt() {
		return AddResrceOverallstatusdeflt;
	}

	@FindBy(xpath = "//label[contains(text(),'Contract Awareness')]//following-sibling::span/span[1]")
	public WebElement AddResrcecntrctawrnsStatsdeflt;

	public WebElement getAddResrcecntrctawrnsStatsdeflt() {
		return AddResrcecntrctawrnsStatsdeflt;
	}

	@FindBy(xpath = "//label[contains(text(),'Contract Awareness')]//following-sibling::span/span[1]")
	public WebElement AddResrContrctawrns;

	public WebElement getAddResrContrctawrns() {
		return AddResrContrctawrns;
	}

	@FindBy(xpath = "//label[contains(text(),'Ethics & Compliance Training')]//following-sibling::span/span[1]")
	public WebElement AddResrceEthicsdeflt;

	public WebElement getAddResrceEthicsdeflt() {
		return AddResrceEthicsdeflt;
	}

	@FindBy(xpath = "//span[@class='k-icon k-i-close']")
	public WebElement AddResrceClosebtn;

	public WebElement getAddResrceClosebtn() {
		return AddResrceClosebtn;
	}

	@FindBy(xpath = "//label[contains(text(),'Planned Level ')]//following-sibling::span/span[1]")
	public WebElement AddresrcePlannedlevel;

	public WebElement getAddresrcePlannedlevel() {
		return AddresrcePlannedlevel;
	}

	@FindBy(xpath = "//label[contains(text(),'Skill Category ')]//following-sibling::span/span[1]")
	public WebElement AddresrceSkillCategory;

	public WebElement getAddresrceSkillCategory() {
		return AddresrceSkillCategory;
	}

	@FindBy(xpath = "//label[text()='SR # ']//following::input[@data-bind='value: SRNbr']")
	public WebElement AddresrceSerialNo;

	public WebElement getAddresrceSerialNo() {
		return AddresrceSerialNo;
	}

	@FindBy(xpath = "//span[@id='OnBoardingStDt']")
	public WebElement EnablepplonboradDate;

	public WebElement getEnablepplonboradDate() {
		return EnablepplonboradDate;
	}

	@FindBy(xpath = "//input[@id='transPlannedOnboardingDt']")
	public WebElement AddresPlannedonbrdDate;

	public WebElement getAddresPlannedonbrdDate() {
		return AddresPlannedonbrdDate;
	}

	@FindBy(xpath = "//span[@aria-controls='transRevisedOnboardingDate_dateview']//span[@class='k-icon k-i-calendar']")
	public WebElement AddresRevisedonbrdDateCalender;

	public WebElement getAddresRevisedonbrdDateCal() {
		return AddresRevisedonbrdDateCalender;
	}

	@FindBy(xpath = "//span[@aria-controls='transActualOnboardingDate_dateview']//span[@class='k-icon k-i-calendar']")
	public WebElement AddresActualonbrdDateCalender;

	public WebElement getAddresActualonbrdDateCalender() {
		return AddresActualonbrdDateCalender;
	}

	@FindBy(xpath = "//input[@id='transRevisedOnboardingDate']")
	public WebElement AddresRevisedonbrdDate;

	public WebElement getAddresRevisedonbrdDate() {
		return AddresRevisedonbrdDate;
	}

	@FindBy(xpath = "//input[@id='transActualOnboardingDate']")
	public WebElement AddresActualonbrdDate;

	public WebElement getAddresActualonbrdDate() {
		return AddresActualonbrdDate;
	}

	@FindBy(xpath = "//label[@id='transErrRevisedOnboardingDate']")
	public WebElement AddresRevisedonbrdDateErr;

	public WebElement getAddresRevisedonbrdDateErr() {
		return AddresRevisedonbrdDateErr;
	}

	@FindBy(xpath = "//label[@id='transErrActualOnboardingDate']")
	public WebElement AddresActualonbrdDateErr;

	public WebElement getAddresActualonbrdDateErr() {
		return AddresActualonbrdDateErr;
	}

	@FindBy(xpath = "//span[@aria-controls='transPlannedOnboardingDt_dateview']//span[@class='k-icon k-i-calendar']")
	public WebElement AddresPlannedonbrdCalder;

	public WebElement getAddresPlannedonbrdCalder() {
		return AddresPlannedonbrdCalder;
	}

	@FindBy(xpath = "//label[contains(text(),'Actual Level ')]//following-sibling::span/span[1]")
	public WebElement AddresrceActualLevel;

	public WebElement getAddresrceActualLevel() {
		return AddresrceActualLevel;
	}

	@FindBy(xpath = "//label[contains(text(),'Location ')]//following-sibling::span/span[1]")
	public WebElement AddresrceLocation;

	public WebElement getAddresrceLocation() {
		return AddresrceLocation;
	}

	@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//table//tbody//tr[10]//td[9]")
	public WebElement Plannedonbrddatesecondrow;

	public WebElement getPlannedonbrddatesecondrow() {
		return Plannedonbrddatesecondrow;
	}

	@FindBy(xpath = "//label[contains(text(),'Resource Type ')]//following-sibling::span/span[1]")
	public WebElement AddresrceResourceType;

	public WebElement getAddresrceResourceType() {
		return AddresrceResourceType;
	}

	@FindBy(xpath = "//label[contains(text(),'Recruitment Channel ')]//following-sibling::span/span[1]")
	public WebElement AddresrceRecrtmntChannel;

	public WebElement getAddresrceRecrtmntChannel() {
		return AddresrceRecrtmntChannel;
	}

	@FindBy(xpath = "//label[text()='Planned Effort ']//following::span[@class='k-icon k-i-arrow-60-up']")
	public WebElement AddresrceEffort;

	public WebElement getAddresrceEffort() {
		return AddresrceEffort;
	}
	
	
	@FindBy(xpath = "//label[text()='Planned Effort ']//following::span[@class='k-icon k-i-arrow-60-up']")
	public WebElement AddresrcePlannedEffort;

	public WebElement getAddresrcePlannedEffort() {
		return AddresrcePlannedEffort;
	}
	
	
	@FindBy(xpath = "//label[text()='Effort ']//following::span[@class='k-widget k-numerictextbox k-valid']")
	public WebElement AddresrceEfforttEXTBOX;

	public WebElement getAddresrceEfforttEXTBOX() {
		return AddresrceEfforttEXTBOX;
	}

	@FindBy(xpath = "//label[@id='transErrEffort']")
	public WebElement AddresrceEfforterrmsg;

	public WebElement getAddresrceEfforterrmsg() {
		return AddresrceEfforterrmsg;
	}

	@FindBy(xpath = "//a[@class='k-button k-button-icontext k-primary k-grid-update']")
	public WebElement AddresrceSavebtn;

	public WebElement getAddresrceSavebtn() {
		return AddresrceSavebtn;
	}

	@FindBy(xpath = "//button[@id='btnMessageOK']")
	public WebElement AddresrceOKbtn;

	public WebElement getAddresrceOKbtn() {
		return AddresrceOKbtn;
	}

	@FindBy(xpath = "//p[@class='mandatory-text  ng-scope' and text()='* Fields are Mandatory']")
	public WebElement Addresrcemandatoryerrmsg;

	public WebElement getAddresrcemandatoryerrmsg() {
		return Addresrcemandatoryerrmsg;
	}

	@FindBy(xpath = "//p[@class='mandatory-text  ng-scope' and text()='(*) Fields are mandatory if Enterprise Id is filled.']")
	public WebElement Addresrcecondtionalmandatoryerrmsg;

	public WebElement getAddresrcecondtionalmandatoryerrmsg() {
		return Addresrcecondtionalmandatoryerrmsg;
	}

	@FindBy(xpath = "//th[@data-title='ENTERPRISE ID']//a")
	public WebElement SDOEnterpriseidlink;

	public WebElement getSDOEnterpriseidlink() {
		return SDOEnterpriseidlink;
	}

	@FindBy(xpath = "//input[@id='EmpId']")
	public WebElement SDOaddresrceEmployeeId;

	public WebElement getSDOaddresrceEmployeeId() {
		return SDOaddresrceEmployeeId;
	}

	@FindBy(xpath = "//input[@id='EnterpriseId']")
	public WebElement SDOaddresrceEnterpriseId;

	public WebElement getSDOaddresrceEnterpriseId() {
		return SDOaddresrceEnterpriseId;
	}

	@FindBy(xpath = "//label[@id='transErrExitDate' and text()]")
	public WebElement SDOaddresExitdterrmsg;

	public WebElement getSDOaddresExitdterrmsg() {
		return SDOaddresExitdterrmsg;
	}

	@FindBy(xpath = "//input[@id='ExitDateTxt']")
	public WebElement SDOaddresExitdate;

	public WebElement getSDOaddresExitdate() {
		return SDOaddresExitdate;
	}

	@FindBy(xpath = "//label[@id='transErrPool' and text()]")
	public WebElement SDOaddresPoolerrmsg;

	public WebElement getSDOaddresPoolerrmsg() {
		return SDOaddresPoolerrmsg;
	}

	@FindBy(xpath = "//i[@class='EnterpriseId mandatory' and text()]")
	public WebElement SDOaddresrceEnterpriseIderrmsg;

	public WebElement getSDOaddresrceEnterpriseIderrmsg() {
		return SDOaddresrceEnterpriseIderrmsg;
	}

	@FindBy(xpath = "//input[@type='text' and @ng-model='dataItem.ContactNbr']")
	public WebElement SDOaddresContactnbr;

	public WebElement getSDOaddresContactnbr() {
		return SDOaddresContactnbr;
	}

	@FindBy(xpath = "//span[@class='k-icon k-i-sort-asc-sm']")
	public WebElement SDOascsortsymblforentrpriseid;

	public WebElement getSDOascsortsymblforentrpriseid() {
		return SDOascsortsymblforentrpriseid;
	}

	@FindBy(xpath = "//span[@class='k-icon k-i-sort-desc-sm']")
	public WebElement SDOdescsortsymblforentrpriseid;

	public WebElement getSDOdescsortsymblforentrpriseid() {
		return SDOdescsortsymblforentrpriseid;
	}

	@FindBy(xpath = "//div[@class='k-grid-content-locked']//table//tbody//tr[2]//td[1]")
	public WebElement SDOEditSecondrow;

	public WebElement getSDOEditSecondrow() {
		return SDOEditSecondrow;
	}
	
	@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//table//tbody//tr[2]//td[7]")
	public WebElement SDOEditSecondCheck;

	public WebElement getSDOEditSecondCheck() {
		return SDOEditSecondCheck;
	}

	@FindBy(xpath = "//div[@class='k-grid-content-locked']//table//tbody//tr[3]//td[1]")
	public WebElement TTEditThirdrow;

	public WebElement getTTEditThirdrow() {
		return TTEditThirdrow;
	}

	@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//table//tbody//tr[2]//td[26]")
	public WebElement TTEditSecondrowComments;

	public WebElement getTTEditSecondrowComments() {
		return TTEditSecondrowComments;
	}

	@FindBy(xpath = "//tr[2]//td[7]//span[@ng-bind='dataItem.SRNbr']")
	public WebElement SDOEditUpdateddata;

	public WebElement getSDOSDOEditUpdateddata() {
		return SDOEditUpdateddata;
	}

	@FindBy(xpath = "//div[@class='k-grid-header-wrap k-auto-scrollable']//thead//tr//th[text()='SLL/ DOMAIN']")
	public WebElement SDOSLLDomain;

	public WebElement getSDOSLLDomain() {
		return SDOSLLDomain;
	}

	@FindBy(xpath = "//textarea[@data-bind='value: AddProgressComments']")
	public WebElement TTProgresscomments;

	public WebElement getTTProgresscomments() {
		return TTProgresscomments;
	}

	@FindBy(xpath = "//li[@role='menuitemcheckbox']//input[@data-field='ProgressComments']")
	public WebElement TTProgresscommentscheckbox;

	public WebElement getTTProgresscommentscheckbox() {
		return TTProgresscommentscheckbox;
	}

	@FindBy(xpath = "//div[@class='k-grid-header-wrap k-auto-scrollable']//thead//tr//th[text()='REVISED ONBOARDING DATE']")
	public WebElement SDORevisedOnbrd;

	public WebElement getSDORevisedOnbrd() {
		return SDORevisedOnbrd;
	}

	@FindBy(xpath = "//label[@id='transErrPlannedOnboardingDt' and text()]")
	public WebElement SDOPlandonbrderrmsg;

	public WebElement getSDOPlandonbrderrmsg() {
		return SDOPlandonbrderrmsg;
	}

	@FindBy(xpath = "*//th[text()='SKILL CATEGORY *']//span[@class='k-icon k-i-filter']")
	public WebElement SkillCategoryFilter;

	public WebElement getSkillCategoryFilter() {
		return SkillCategoryFilter;
	}

	@FindBy(xpath = "//ul/li[2]/label[@class='k-label']//input[@type='checkbox' and @value='Non-Voice']")
	public WebElement SkillcatfiltforNonvoice;

	public WebElement getSkillcatfiltforNonvoice() {
		return SkillcatfiltforNonvoice;
	}

	@FindBy(xpath = "//input[@class='k-formatted-value k-input']")
	public WebElement SDOeffort;

	public WebElement getSDOeffort() {
		return SDOeffort;
	}
	
	@FindBy(xpath = "//label[text()='Actual Effort ']//following::input[@class='k-formatted-value k-input']//following::span[@class='k-icon k-i-arrow-60-down']")
	public WebElement SDOActualeffort;

	public WebElement getSDOActualeffort() {
		return SDOActualeffort;
	}

	@FindBy(xpath = "//ul[@class='k-reset k-multicheck-wrap']//following-sibling::button[1]")
	public WebElement SkillcatFilterbutton;

	public WebElement getSkillcatFilterbutton() {
		return SkillcatFilterbutton;
	}

	@FindAll(@FindBy(xpath = "//ul[@class='k-pager-numbers k-reset']//li//a"))
	public List<WebElement> SDOPagenos;

	public List<WebElement> getSDOPagenos() {
		return SDOPagenos;
	}

	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr"))
	public List<WebElement> NumberofRowsOnSkillcatSelection;

	public List<WebElement> getNumberofRowsOnSkillcatSelection() {
		return NumberofRowsOnSkillcatSelection;
	}

	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr//td[4]"))
	public List<WebElement> TextPresentOnStatusSelectionfield;

	public List<WebElement> getTextPresentOnStatusSelectionfield() {
		return TextPresentOnStatusSelectionfield;
	}

	@FindBy(xpath = "*//th[text()='ONBOARDING STATUS']//span[@class='k-icon k-i-filter']")
	public WebElement OnbrdstatusFilter;

	public WebElement getOnbrdstatusFilter() {
		return OnbrdstatusFilter;
	}

	@FindBy(xpath = "//ul/li[1]/label[@class='k-label']//input[@type='checkbox' and @value='Offer Accepted']")
	public WebElement OnbrdstatusFilterforoffeaccpt;

	public WebElement getOnbrdstatusFilterforoffeaccpt() {
		return OnbrdstatusFilterforoffeaccpt;
	}

	@FindBy(xpath = "//ul[@class='k-reset k-multicheck-wrap']//li//input[@name='OnboardingStatus']//following::button[1]")
	public WebElement OnbrdstatusFilterbutton;

	public WebElement getOnbrdstatusFilterbutton() {
		return OnbrdstatusFilterbutton;
	}
	
	@FindBy(xpath = "//a[text()='Activity*']")
	public WebElement ActivityColumnsort;

	public WebElement getActivityColumnsort() {
		return ActivityColumnsort;
	}

	@FindBy(xpath = "*//th[text()='RECRUITMENT CHANNEL (*)']//span[@class='k-icon k-i-filter']")
	public WebElement RecruitmentchannelFilter;

	public WebElement getRecruitmentchannelFilter() {
		return RecruitmentchannelFilter;
	}

	@FindBy(xpath = "//ul//li//input[@name='DemandType']//ancestor::div//form//input[@placeholder='Search']")
	public WebElement RecruitmentchannelSearchbutton;

	public WebElement getRecruitmentchannelSearchbutton() {
		return RecruitmentchannelSearchbutton;
	}

	@FindBys(@FindBy(xpath = "//div[text()]//following::div//form//div//input[1]//following::ul//li[@style='display: none;']//input[@name='DemandType']"))
	public List<WebElement> RecruitmentchannellistnotcontainingSearch;

	public List<WebElement> getRecruitmentchannellistnotcontainingSearch() {
		return RecruitmentchannellistnotcontainingSearch;
	}

	@FindBys(@FindBy(xpath = "//div[@class='k-grid-header-wrap k-auto-scrollable']//tr//th[@data-title or text()]"))
	public List<WebElement> SDOtrackerheadermandcolumns;

	public List<WebElement> getSDOtrackerheadermandcolumns() {
		return SDOtrackerheadermandcolumns;
	}

	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr"))
	public List<WebElement> NumberofRowsOnbrdstatusSelection;

	public List<WebElement> getNumberofRowsOnbrdstatusSelection() {
		return NumberofRowsOnbrdstatusSelection;
	}

	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr//td[18]"))
	public List<WebElement> TextPresentOnOnbrdstatusSelectionfield;

	public List<WebElement> getTextPresentOnOnbrdstatusSelectionfield() {
		return TextPresentOnOnbrdstatusSelectionfield;
	}

	@FindAll(@FindBy(xpath = "//ul[@class='nav nav-tabs tabs']//li"))
	java.util.List<WebElement> EnablepplList;

	public List<WebElement> getEnablepplList() {
		return EnablepplList;
	}

	@FindAll(@FindBy(xpath = "//div[@id='historyId']//div[1]//table[@role='grid']//thead//tr//th"))
	java.util.List<WebElement> ViewHistrytablist;

	public List<WebElement> getViewHistrytablist() {
		return ViewHistrytablist;
	}

	@FindAll(@FindBy(xpath = "//div[@id='historyId']//div[@class='k-grid-content k-auto-scrollable']//table[@role='grid']//tr//td[5]"))
	java.util.List<WebElement> ViewHistryTabUpdatedOncolm;

	public List<WebElement> getViewHistryTabUpdatedOncolm() {
		return ViewHistryTabUpdatedOncolm;
	}

	@FindAll(@FindBy(xpath = "//div[@id='historyId']//div[@class='k-grid-content k-auto-scrollable']//table[@role='grid']//tr//td[2]"))
	java.util.List<WebElement> ViewHistrytabdatamodifiedcolm;

	public List<WebElement> getViewHistrytabdatamodifiedcolm() {
		return ViewHistrytabdatamodifiedcolm;
	}

	@FindAll(@FindBy(xpath = "//div[@id='gridtask']//div[@class='k-grid-header-wrap k-auto-scrollable']//table[@role='grid']//thead//tr//th"))
	java.util.List<WebElement> ActivityTableheaderlist;

	public List<WebElement> getActivityTableheaderlist() {
		return ActivityTableheaderlist;
	}

	@FindAll(@FindBy(xpath = "//table[@role='grid']//thead//tr//th[@data-role='columnsorter']"))
	java.util.List<WebElement> ActivityTableheaderwithsortlist;

	public List<WebElement> getActivityTableheaderwithsortlist() {
		return ActivityTableheaderwithsortlist;
	}
	
	
	
	

	@FindAll(@FindBy(xpath = "//div[@id='workstream_selector']//h1[text()='Wave']//following::ul//li//a[text()='Wave Details']"))
	java.util.List<WebElement> EnablepplWavewindowlist;

	public List<WebElement> getEnablepplWavewindowlist() {
		return EnablepplWavewindowlist;
	}

	@FindAll(@FindBy(xpath = "//div[@id='workstream_selector']//h1[text()='Workstream']//following::ul//li//a[text()]"))
	java.util.List<WebElement> EnablepplWorkstreamwindowlist;

	public List<WebElement> getEnablepplWorkstreamwindowlist() {
		return EnablepplWorkstreamwindowlist;
	}

	@FindAll(@FindBy(xpath = "//div[@id='historyId']//div[@class='k-grid-content k-auto-scrollable']//tbody//tr[1]//td"))
	java.util.List<WebElement> UpdatedCompletioncolumninHistorytable;

	public List<WebElement> getUpdatedCompletioncolumninHistorytable() {
		return UpdatedCompletioncolumninHistorytable;
	}

	@FindAll(@FindBy(xpath = "//ul[@class='nav navbar-nav nav-icons pull-left tttTrackerStatus']//li//span[@class='label-text']"))
	java.util.List<WebElement> SDOonboardingdates;

	public List<WebElement> getSDOonboardingdates() {
		return SDOonboardingdates;
	}

	@FindAll(@FindBy(xpath = "//div[@class='k-grid-header-wrap k-auto-scrollable']//tr//th[@data-title or text()]"))
	java.util.List<WebElement> SDOtableheaderlist;

	public List<WebElement> getSDOtableheaderlist() {
		return SDOtableheaderlist;

	}

	// Travel Tracker page elements

	@FindBy(xpath = "//span[text()='Accenture 07th July 2017']")
	public WebElement ProjectCard2;

	public WebElement getProjectCard2() {
		return ProjectCard2;
	}

	@FindBy(xpath = "//ul[@class='nav nav-tabs tabs']//li[3]//a[@aria-controls='travelTracker']")
	public WebElement Traveltrackertab;

	public WebElement getTraveltrackertab() {
		return Traveltrackertab;
	}

	@FindBy(xpath = "//button[text()='Add Resource']")
	public WebElement TraveltrackerAddresrce;

	public WebElement getTraveltrackerAddresrce() {
		return TraveltrackerAddresrce;
	}

	@FindBy(xpath = "//span[@class='expand-grid-icon']")
	public WebElement TraveltrackerExpndIcon;

	public WebElement getTraveltrackerExpndIcon() {
		return TraveltrackerExpndIcon;
	}

	@FindBy(xpath = "//span[@class='acn-shrink']")
	public WebElement TraveltrackerExpndshrnkIcon;

	public WebElement getTraveltrackerExpndshrnkIcon() {
		return TraveltrackerExpndshrnkIcon;
	}

	@FindBy(xpath = "*//th[text()='Type of Visa Travel *']//span[@class='k-icon k-i-filter']")
	public WebElement VisaTypeFilter;

	public WebElement getVisaTypeFilter() {
		return VisaTypeFilter;
	}

	@FindBy(xpath = "*//th[text()='ONBOARDING STATUS']//span[@class='k-icon k-i-filter']")
	public WebElement OnbrdingstatusFilter;

	public WebElement getOnbrdingstatusFilter() {
		return OnbrdingstatusFilter;
	}

	@FindBy(xpath = "*//th[text()='CANDIDATE STATUS (*)']//span[@class='k-icon k-i-filter']")
	public WebElement CandidatestatusFilter;

	public WebElement getCandidatestatusFilter() {
		return CandidatestatusFilter;
	}

	@FindBy(xpath = "//input[@type='checkbox' and @value='Active Part Time']")
	public WebElement CAndstatusActvparttime;

	public WebElement getCAndstatusActvparttime() {
		return CAndstatusActvparttime;
	}

	@FindBy(xpath = "//input[@type='checkbox' and @value='Active Full Time']")
	public WebElement CAndstatusActvfulltime;

	public WebElement getCAndstatusActvfulltime() {
		return CAndstatusActvfulltime;
	}

	@FindBy(xpath = "//ul[@class='k-reset k-multicheck-wrap']//li//label//input[@name='Status']//following::button[text()='Filter']")
	public WebElement Candidatestatusfilterbutton;

	public WebElement getCandidatestatusfilterbutton() {
		return Candidatestatusfilterbutton;
	}

	@FindBy(xpath = "//input[@type='checkbox' and @value='Business']")
	public WebElement VisatypefiltforBusiness;

	public WebElement getVisatypefiltforBusiness() {
		return VisatypefiltforBusiness;
	}

	@FindBy(xpath = "//input[@type='checkbox' and @value='New Deal/Ramp – External Hire']")
	public WebElement RecrtmtchnlfiltforExternalHire;

	public WebElement getRecrtmtchnlfiltforExternalHire() {
		return RecrtmtchnlfiltforExternalHire;
	}

	@FindBy(xpath = "//input[@type='checkbox' and @value='New Deal/Ramp - Internal Pool/Seeding']")
	public WebElement RecrtmtchnlfiltforInternalPool;

	public WebElement getRecrtmtchnlfiltforInternalPool() {
		return RecrtmtchnlfiltforInternalPool;
	}

	@FindBy(xpath = "//ul[@class='k-reset k-multicheck-wrap']//li//label//input[@name='DemandType']//following::button[text()='Filter']")
	public WebElement Recrtmtchnlfilterbutton;

	public WebElement getRecrtmtchnlfilterbutton() {
		return Recrtmtchnlfilterbutton;
	}

	@FindBy(xpath = "//input[@type='checkbox' and @value='On Board']")
	public WebElement OnbrdingstatusFilterForOnboard;

	public WebElement getOnbrdingstatusFilterForOnboard() {
		return OnbrdingstatusFilterForOnboard;
	}

	@FindBy(xpath = "//ul[@class='k-reset k-multicheck-wrap']//li//label//input[@name='OnboardingStatus']//following::button[text()='Filter']")
	public WebElement OnboardFilterbutton;

	public WebElement getOnboardFilterbutton() {
		return OnboardFilterbutton;
	}

	@FindBy(xpath = "//ul[@class='k-reset k-multicheck-wrap']//following-sibling::button[1]")
	public WebElement VistypeFilterbutton;

	public WebElement getVistypeFilterbutton() {
		return VistypeFilterbutton;
	}

	@FindBy(xpath = "*//th[text()='Passport Status']//span[@class='k-icon k-i-filter']")
	public WebElement PassportTypeFilter;

	public WebElement getPassportTypeFilter() {
		return PassportTypeFilter;
	}

	@FindBy(xpath = "//input[@type='checkbox' and @value='']")
	public WebElement PassporttypefiltforEmptychkbx;

	public WebElement getPassporttypefiltforEmptychkbx() {
		return PassporttypefiltforEmptychkbx;
	}

	@FindBy(xpath = "//ul[@class='k-reset k-multicheck-wrap']//li//label//input[@name='PassportStatus']//following::button[1]")
	public WebElement PassporttypeFilterbutton;

	public WebElement getPassporttypeFilterbutton() {
		return PassporttypeFilterbutton;
	}

	@FindBy(xpath = "//th[@data-title='Enterprise ID *']//a")
	public WebElement TTEnterpriseidlink;

	public WebElement getTTEnterpriseidlink() {
		return TTEnterpriseidlink;
	}

	@FindBy(xpath = "//span[@class='k-icon k-i-sort-asc-sm']")
	public WebElement TTascsortsymblforentrpriseid;

	public WebElement getTTascsortsymblforentrpriseid() {
		return TTascsortsymblforentrpriseid;
	}

	@FindBy(xpath = "//span[@class='k-icon k-i-sort-desc-sm']")
	public WebElement TTdescsortsymblforentrpriseid;

	public WebElement getTTdescsortsymblforentrpriseid() {
		return SDOdescsortsymblforentrpriseid;
	}

	@FindBy(xpath = "//ul//li//input[@name='VisaType']//ancestor::div//form//input[@placeholder='Search']")
	public WebElement VisaTypeSearchbutton;

	public WebElement getVisaTypeSearchbutton() {
		return VisaTypeSearchbutton;
	}

	@FindBy(xpath = "//div[@id='inviteid']//span//span//span[text()]")
	public WebElement TTInviteIdDefault;

	public WebElement getTTInviteIdDefault() {
		return TTInviteIdDefault;
	}

	@FindBy(xpath = "//input[@id='txtOwner']")
	public WebElement TTAddresEntrpriseId;

	public WebElement getTTAddresEntrpriseId() {
		return TTAddresEntrpriseId;
	}

	@FindBy(xpath = "//input[@id='first_nm']")
	public WebElement TTAddresFirstName;

	public WebElement getTTAddresFirstName() {
		return TTAddresFirstName;
	}

	@FindBy(xpath = "//input[@id='Last_nm']")
	public WebElement TTAddresLastName;

	public WebElement getTTAddresLastName() {
		return TTAddresLastName;
	}

	@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//tbody//tr[3]//td[7]")
	public WebElement TTUpdatedcolumn;

	public WebElement getTTUpdatedcolumn() {
		return TTUpdatedcolumn;
	}

	@FindBy(xpath = "//input[@id='travelto']")
	public WebElement TTAddresTravelTo;

	public WebElement getTTAddresTravelTo() {
		return TTAddresTravelTo;
	}

	@FindBy(xpath = "//input[@k-ng-model='dataItem.PassportExpirationDate']")
	public WebElement TTAddResPlandexpirydt;

	public WebElement getTTAddResPlandexpirydt() {
		return TTAddResPlandexpirydt;
	}

	@FindBy(xpath = "//input[@id='strtdate']")
	public WebElement TTAddResPlandstrtdt;

	public WebElement getTTAddResPlandstrtdt() {
		return TTAddResPlandstrtdt;
	}

	@FindBy(xpath = "//input[@id='enddate']")
	public WebElement TTAddResPlandenddt;

	public WebElement getTTAddResPlandenddt() {
		return TTAddResPlandenddt;
	}

	@FindBy(xpath = "//label[contains(text(),'Type of Visa Travel')]//following::span/span[1]")
	public WebElement TTAddResVisaType;

	public WebElement getTTAddResVisaType() {
		return TTAddResVisaType;
	}

	@FindBy(xpath = "//label[contains(text(),'Hotel')]//following::span/span[1]")
	public WebElement TTAddResHotelType;

	public WebElement getTTAddResHotelType() {
		return TTAddResHotelType;
	}

	@FindBy(xpath = "//label[contains(text(),'Travel From')]//following::span/span[1]")
	public WebElement TTAddResTravelfrom;

	public WebElement getTTAddResTravelfrom() {
		return TTAddResTravelfrom;
	}

	@FindBy(xpath = "//a[@role='button' and @class='k-button k-button-icontext k-primary k-grid-update']")
	public WebElement TTAddResSavebtn;

	public WebElement getTTAddResSavebtn() {
		return TTAddResSavebtn;
	}

	@FindBy(xpath = "//button[@id='btnMessageOK']")
	public WebElement TTAddResSaveOkbtn;

	public WebElement getTTAddResSaveOkbtn() {
		return TTAddResSaveOkbtn;
	}

	@FindBy(xpath = "//input[@id='onsmgr']")
	public WebElement TTAddResOnshoreMgr;

	public WebElement getTTAddResOnshoreMgr() {
		return TTAddResOnshoreMgr;
	}

	@FindBy(xpath = "//label[@id='transErrenterpriseid']")
	public WebElement TTEntrprsIderrmsg;

	public WebElement getTTEntrprsIderrmsg() {
		return TTEntrprsIderrmsg;
	}

	@FindBy(xpath = "//input[@id='strtdate']")
	public WebElement TTPlannedStartDate;

	public WebElement getTTPlannedStartDate() {
		return TTPlannedStartDate;
	}

	@FindBy(xpath = "//input[@id='enddate']")
	public WebElement TTPlannedEndDate;

	public WebElement getTTPlannedEndDate() {
		return TTPlannedEndDate;
	}

	@FindBy(xpath = "//input[@k-ng-model='dataItem.PassportExpirationDate']")
	public WebElement TTPassportExpirationDate;

	public WebElement getTTPassportExpirationDate() {
		return TTPassportExpirationDate;
	}

	@FindBy(xpath = "//input[@k-ng-model='dataItem.Actual_Start_Date']")
	public WebElement TTActualStartDate;

	public WebElement getTTActualStartDate() {
		return TTActualStartDate;
	}

	@FindBy(xpath = "//input[@k-ng-model='dataItem.Actual_End_Date']")
	public WebElement TTActualEndDate;

	public WebElement getTTActualEndDate() {
		return TTActualEndDate;
	}

	@FindBy(xpath = "//label[@id='transErrFirstName']")
	public WebElement TTFirstNameerrmsg;

	public WebElement getTTFirstNameerrmsg() {
		return TTFirstNameerrmsg;
	}

	@FindBy(xpath = "//label[@id='transErrLastName']")
	public WebElement TTLastNameerrmsg;

	public WebElement getTTLastNameerrmsg() {
		return TTLastNameerrmsg;
	}

	@FindBy(xpath = "//label[@id='transErrTravelTo']")
	public WebElement TTTravelToerrmsg;

	public WebElement getTTTravelToerrmsg() {
		return TTTravelToerrmsg;
	}

	@FindBy(xpath = "//label[@id='transErrPlannedStartDate']")
	public WebElement TTPlndstrterrmsg;

	public WebElement getTTPlndstrterrmsg() {
		return TTPlndstrterrmsg;
	}

	@FindBy(xpath = "//label[@id='transErrPlannedEndDate']")
	public WebElement TTPlndenderrmsg;

	public WebElement getTTPlndenderrmsg() {
		return TTPlndenderrmsg;
	}

	@FindBy(xpath = "//label[@id='transErrVisaType']")
	public WebElement TTVisatypeerrmsg;

	public WebElement getTTVisatypeerrmsg() {
		return TTVisatypeerrmsg;
	}

	@FindBy(xpath = "//div[@class='k-grid-content-locked']//table//tbody//tr[4]//td[1]")
	public WebElement TTEditFourthrow;

	public WebElement getTTEditFourthrow() {
		return TTEditFourthrow;
	}

	@FindBy(xpath = "//label[text()='Passport Status']//following::span[2]")
	public WebElement TTAddResPassportType;

	public WebElement getTTAddResPassportType() {
		return TTAddResPassportType;
	}

	@FindBy(xpath = "//tr[4]//td[14]//span[@ng-bind='dataItem.PassportStatus']")
	public WebElement TTEditUpdatedData;

	public WebElement getTTEditUpdatedData() {
		return TTEditUpdatedData;
	}

	@FindBy(xpath = "//input[@data-bind='value: CIDnbr']")
	public WebElement SDOCIDfield;

	public WebElement getSDOCIDfield() {
		return SDOCIDfield;
	}

	@FindBys(@FindBy(xpath = "//div[text()]//following::div//form//div//input[1]//following::ul//li[@style='display: none;']//input[@name='VisaType']"))
	public List<WebElement> VisaTypelistnotcontainingSearch;

	public List<WebElement> getVisaTypelistnotcontainingSearch() {
		return VisaTypelistnotcontainingSearch;
	}

	@FindAll(@FindBy(xpath = "//ul[@class='nav nav-tabs tabs']//li//a[text()]"))
	java.util.List<WebElement> enbtableheaderlist;

	public List<WebElement> getenbtableheaderlist() {
		return enbtableheaderlist;

	}

	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr"))
	public List<WebElement> NumberofRowsOnVisaTypeSelection;

	public List<WebElement> getNumberofRowsOnVisaTypeSelection() {
		return NumberofRowsOnVisaTypeSelection;
	}

	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr"))
	public List<WebElement> TotalNumberofRows;

	public List<WebElement> getTotalNumberofRows() {
		return TotalNumberofRows;
	}

	@FindAll(@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//tbody//tr//td[12]"))
	public List<WebElement> TextPresentOnVisatypeSelectionfield;

	public List<WebElement> getTextPresentOnVisatypeSelectionfield() {
		return TextPresentOnVisatypeSelectionfield;
	}

	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr"))
	public List<WebElement> NumberofRowsOnPassportStatusSelection;

	public List<WebElement> getNumberofRowsOnPassportStatusSelection() {
		return NumberofRowsOnPassportStatusSelection;
	}

	@FindAll(@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//tbody//tr//td[14]"))
	public List<WebElement> TextPresentOnPassportStatusSelectionfield;

	public List<WebElement> getTextPresentOnPassportStatusSelectionfield() {
		return TextPresentOnPassportStatusSelectionfield;
	}

	@FindAll(@FindBy(xpath = "//div[@class='k-grid-header-wrap k-auto-scrollable']//thead//tr//th[text() or @data-title]"))
	java.util.List<WebElement> traveltrackerheaderlistAll;

	public List<WebElement> gettraveltrackerheaderlistAll() {
		return traveltrackerheaderlistAll;

	}

	@FindAll(@FindBy(xpath = "//span[@class='k-icon k-i-filter']//ancestor::th[text()]"))
	java.util.List<WebElement> TTFiltersymbollist;

	public List<WebElement> getTTFiltersymbollist() {
		return TTFiltersymbollist;

	}

	/////////////////////////////////// service delivery wave
	/////////////////////////////////// scripts//////////////////////////////////////
	@FindBy(xpath = "//span[@class='transIcon-execution icon']")
	WebElement SDWExecutionIcon;

	public WebElement getSDWExecutionIcon() {
		return SDWExecutionIcon;
	}

	@FindBy(xpath = "//a[text()='SDO Staffing']")
	WebElement SDWdashbrdIcon;

	public WebElement getSDWdashbrdIcon() {
		return SDWdashbrdIcon;
	}

	@FindBy(xpath = "//a[text()='Deal Execution']")
	WebElement DealExecutiondashbrdIcon;

	public WebElement getDealExecutiondashbrdIcon() {
		return DealExecutiondashbrdIcon;
	}

	@FindBy(xpath = "//h2//a[text() and @ng-click='openWorkStream()']")
	WebElement Enablpplheader;

	public WebElement getEnablpplheader() {
		return Enablpplheader;
	}

	@FindBy(xpath = "//input[@id='DealExecutionDetails_ExternalHires']")
	WebElement ExternalHires;

	public WebElement getExternalHires() {
		return ExternalHires;
	}

	@FindBy(xpath = "//h1[text()='Workstream']//following::ul//li//a[text()='Enable People']")
	WebElement Enablpplworkstrm;

	public WebElement getEnablpplworkstrm() {
		return Enablpplworkstrm;
	}

	@FindBy(xpath = "//h1[text()='Workstream']//following::ul//li//a[text()='Train The Trainer']")
	WebElement TTTworkstrm;

	public WebElement getTTTworkstrm() {
		return TTTworkstrm;
	}

	@FindBy(xpath = "//a[text()='TTT ASSESSMENTS']")
	WebElement TTTAssessments;

	public WebElement getTTTAssessments() {
		return TTTAssessments;
	}

	@FindBy(xpath = "//label[contains(text(),'Planned Level ')]//i[@class='mandatory']")
	public WebElement AddresrcePlannedlevelMandtry;

	public WebElement getAddresrcePlannedlevelMandtry() {
		return AddresrcePlannedlevelMandtry;
	}

	@FindBy(xpath = "//label[contains(text(),'Location ')]//i[@class='mandatory']")
	public WebElement AddresrceLocationMandtry;

	public WebElement getAddresrceLocationMandtry() {
		return AddresrceLocationMandtry;
	}

	@FindBy(xpath = "//label[contains(text(),'Resource Type ')]//following-sibling::span/span/span[2]")
	public WebElement AddresrceResourceTypeattrib;

	public WebElement getAddresrceResourceTypeattrib() {
		return AddresrceResourceTypeattrib;
	}

	@FindBy(xpath = "//label[contains(text(),'Candidate Status')]//following-sibling::span//span[2]")
	public WebElement AddresrceCanddteStatusattrib;

	public WebElement getAddresrceCanddteStatusattrib() {
		return AddresrceCanddteStatusattrib;
	}

	@FindBy(xpath = "//label[contains(text(),'Recruitment Channel')]//following-sibling::span//span[2]")
	public WebElement AddresrceRecruitmtChannelattrib;

	public WebElement getAddresrceRecruitmtChannelattrib() {
		return AddresrceRecruitmtChannelattrib;
	}

	@FindBy(xpath = "//label[contains(text(),'Skill Category')]//following-sibling::span//span[2]")
	public WebElement AddresrceSkillCategoryattrib;

	public WebElement getAddresrceSkillCategoryattrib() {
		return AddresrceSkillCategoryattrib;
	}

	@FindBy(xpath = "//label[contains(text(),'BGC Status')]//following-sibling::span//span[2]")
	public WebElement AddresrceBGCSstaus;

	public WebElement getAddresrceBGCSstaus() {
		return AddresrceBGCSstaus;
	}

	@FindBy(xpath = "//label[contains(text(),'Onboarding Status')]//following-sibling::span//span[2]")
	public WebElement AddresrceOnboardingstatus;

	public WebElement getAddresrceOnboardingstatus() {
		return AddresrceOnboardingstatus;
	}

	@FindBy(xpath = "//input[@id='txtOwner']")
	public WebElement TTTtraineename;

	public WebElement getTTTtraineename() {
		return TTTtraineename;
	}

	@FindBy(xpath = "//textarea[@data-bind='value: onboard_Add_Col_01']")
	public WebElement AddresAdditinlCol;

	public WebElement getAddresAdditinlCol() {
		return AddresAdditinlCol;
	}

	@FindAll(@FindBy(xpath = "//label[contains(text(),'Recruitment Channel')]//following-sibling::span//select//option"))
	java.util.List<WebElement> AddresrceRecruitmentchannellist;

	public List<WebElement> getAddresrceRecruitmentchannelist() {
		return AddresrceRecruitmentchannellist;
	}

	@FindAll(@FindBy(xpath = "//ul[@id='txtOwner_listbox']//li[text()]"))
	java.util.List<WebElement> ResourcewithOnboardstatus;

	public List<WebElement> getResourcewithOnboardstatus() {
		return ResourcewithOnboardstatus;
	}

	@FindAll(@FindBy(xpath = "//label[contains(text(),'Onboarding Status')]//following-sibling::span//select//option"))
	java.util.List<WebElement> AddresrceOnboardingStatuslist;

	public List<WebElement> getAddresrceOnboardingStatuslist() {
		return AddresrceOnboardingStatuslist;
	}

	@FindAll(@FindBy(xpath = "//label[contains(text(),'BGC Status')]//following-sibling::span//select//option"))
	java.util.List<WebElement> AddresrceBGCStatuslist;

	public List<WebElement> getAddresrceBGCStatuslist() {
		return AddresrceBGCStatuslist;
	}

	@FindAll(@FindBy(xpath = "//tr[1]//td//select[@k-data-source='VisaProcessing']//option"))
	java.util.List<WebElement> AddresrceVisaProcessinglist;

	public List<WebElement> getAddresrceVisaProcessinglist() {
		return AddresrceVisaProcessinglist;
	}

	@FindAll(@FindBy(xpath = "//tr[1]//td//select[@k-data-source='OverallStatusList']//option"))
	java.util.List<WebElement> AddresrceOverallStatuslist;

	public List<WebElement> getAddresrceOverallStatuslist() {
		return AddresrceOverallStatuslist;
	}

	@FindAll(@FindBy(xpath = "//label[contains(text(),'NJO Status')]//following-sibling::span//select//option"))
	java.util.List<WebElement> AddresrceNJOStatusllist;

	public List<WebElement> getAddresrceNJOStatusllist() {
		return AddresrceNJOStatusllist;
	}

	@FindAll(@FindBy(xpath = "//label[contains(text(),'Contract Awareness')]//following-sibling::span//select//option"))
	java.util.List<WebElement> AddresrceContractAwrnesslist;

	public List<WebElement> getAddresrceContractAwrnesslist() {
		return AddresrceContractAwrnesslist;
	}

	@FindAll(@FindBy(xpath = "//label[contains(text(),'Contract Awareness')]//following-sibling::span//select//option"))
	java.util.List<WebElement> AddresrEthicsComplncelist;

	public List<WebElement> getAddresrEthicsComplncelist() {
		return AddresrEthicsComplncelist;
	}

	@FindAll(@FindBy(xpath = "//label[contains(text(),'Skill Category')]//following-sibling::span//select//option"))
	java.util.List<WebElement> AddresrceSkillcatlist;

	public List<WebElement> getAddresrceSkillcatlist() {
		return AddresrceSkillcatlist;
	}

	@FindBy(xpath = "//*[@id='transErrDemandType']")
	public WebElement Recruitmentchannelerror;

	public WebElement getRecruitmentchannelerror() {
		return Recruitmentchannelerror;
	}

	@FindBy(xpath = "//textarea[@data-bind='value: AddComment']")
	public WebElement SDOAddResComments;

	public WebElement getSDOAddResComments() {
		return SDOAddResComments;
	}

	@FindBy(xpath = "//label[contains(text(),'Gender')]//following-sibling::span/span[1]")
	public WebElement SDOaddresGender;

	public WebElement getSDOaddresGender() {
		return SDOaddresGender;
	}

	@FindBy(xpath = "//label[contains(text(),'Highest Qualification')]//following::textarea[@data-bind='value: Qualification']")
	public WebElement SDOaddresHighestQualification;

	public WebElement getSDOaddresHighestQualification() {
		return SDOaddresHighestQualification;
	}

	@FindBy(xpath = "//textarea[@data-bind='value: CurrentEmployeer']")
	public WebElement SDOaddresPreviousEmployer;

	public WebElement getSDOaddresPreviousEmployer() {
		return SDOaddresPreviousEmployer;
	}

	@FindBy(xpath = "//textarea[@data-bind='value: PreviourEmployer']")
	public WebElement SDOaddresCurrentEmployer;

	public WebElement getSDOaddresCurrentEmployer() {
		return SDOaddresCurrentEmployer;
	}

	@FindBy(xpath = "//label[@id='transErrPlannedOnboardingDt']")
	public WebElement AddresPlannedonboarderror;

	public WebElement getAddresPlannedonboarderror() {
		return AddresPlannedonboarderror;
	}

	@FindBy(xpath = "//label[contains(text(),'Client Specific Role')]//following::input[@data-bind='value: RoleId']")
	public WebElement AddresClientSpecificrole;

	public WebElement getAddresClientSpecificrole() {
		return AddresClientSpecificrole;
	}

	@FindBy(xpath = "//label[contains(text(),'Passport Status')]//following-sibling::span//span[2]")
	public WebElement SDOAddresPassportStatus;

	public WebElement getSDOAddresPassportStatus() {
		return SDOAddresPassportStatus;
	}
	
	

	@FindBy(xpath = "//input[@data-bind='value: SLLDomain']")
	public WebElement SDOAddresSLLDomain;

	public WebElement getSDOAddresSLLDomain() {
		return SDOAddresSLLDomain;
	}

	@FindBy(xpath = "//input[@data-bind='value: PassPortNbr']")
	public WebElement SDOAddresPassptnbr;

	public WebElement getSDOAddresPassptnbr() {
		return SDOAddresPassptnbr;
	}

	@FindBy(xpath = "//input[@data-bind='value: JoiningBonusAmt']")
	public WebElement SDOAddresJoiningBonus;

	public WebElement getSDOAddresJoiningBonus() {
		return SDOAddresJoiningBonus;
	}

	@FindBy(xpath = "//input[@data-bind='value: NoticePayAmt']")
	public WebElement SDOAddresNoticePay;

	public WebElement getSDOAddresNoticePay() {
		return SDOAddresNoticePay;
	}

	@FindBy(xpath = "//input[@data-bind='value: RelocationBonusAmt']")
	public WebElement SDOAddresRelocationBonus;

	public WebElement getSDOAddresRelocationBonus() {
		return SDOAddresRelocationBonus;
	}

	@FindBy(xpath = "//a[@ng-click='FileUploadSdoTracker()']")
	public WebElement SDOImport;

	public WebElement getSDOImport() {
		return SDOImport;
	}

	@FindBy(xpath = "//a[@ng-click='FileUploadTravel()']")
	public WebElement TTImport;

	public WebElement getTTImport() {
		return TTImport;
	}

	@FindBy(xpath = "//input[@id='upload_file']")
	public WebElement SDOImportWindow;

	public WebElement getSDOImportWindow() {
		return SDOImportWindow;
	}
	
	@FindBy(xpath = "//input[@value='CRU']//following::input[@id='upload_file']")
	public WebElement TTtrackImportWindow;

	public WebElement getTTtrackImportWindow() {
		return TTtrackImportWindow;
	}
	

	@FindBy(xpath = "//button[@id='uploadbtnOnboarding']")
	public WebElement SDOUploadBtn;

	public WebElement getSDOUploadBtn() {
		return SDOUploadBtn;
	}
	
	@FindBy(xpath = "//button[@id='uploadbtn']")
	public WebElement TTAsssUploadBtn;

	public WebElement getTTAsssUploadBtn() {
		return TTAsssUploadBtn;
	}
	
	
	
	@FindBy(xpath = "//button[@id='uploadbtnttt']")
	public WebElement TTrackUploadBtn;

	public WebElement getTTrackUploadBtn() {
		return TTrackUploadBtn;
	}
	
	
	
	@FindBy(xpath = "//button[@id='uploadbtnIssue']")
	public WebElement WaveSetUpUploadBtn;

	public WebElement getWaveSetUpUploadBtn() {
		return WaveSetUpUploadBtn;
	}
	
	
	
	@FindBy(xpath = "//button[@id='uploadbtn']")
	public WebElement WAveWrkstrmUploadBtn;

	public WebElement getWAveWrkstrmUploadBtn() {
		return WAveWrkstrmUploadBtn;
	}

	@FindBy(xpath = "//div[@class='wave-rag-status']//span[@class='k-icon k-i-arrow-60-down']")
	public WebElement Waveragstatusdropdown;

	public WebElement getWaveragstatusdropdown() {
		return Waveragstatusdropdown;
	}

	@FindBy(xpath = "//div//h3[text()='RAG Status']")
	public WebElement WaveragTitle;

	public WebElement getWaveragTitle() {
		return WaveragTitle;
	}

	@FindBy(xpath = "//div//h3[text()='Overall Workstream']")
	public WebElement OverallWorkstreamTitle;

	public WebElement getOverallWorkstreamTitle() {
		return OverallWorkstreamTitle;
	}

	@FindBy(xpath = "//div[@class='progress']")
	public WebElement OverallWorkstreamProgressbar;

	public WebElement getOverallWorkstreamProgressbar() {
		return OverallWorkstreamProgressbar;
	}

	@FindBy(xpath = "//span[@id='completionPct']")
	public WebElement OverallWorkstreamCompleted;

	public WebElement getOverallWorkstreamCompleted() {
		return OverallWorkstreamCompleted;
	}

	@FindAll(@FindBy(xpath = "//ul[@class='header-nav hidden-xs']//li[@role='menuitem']"))
	java.util.List<WebElement> HeaderMenulist;

	public List<WebElement> getHeaderMenulist() {
		return HeaderMenulist;

	}

	@FindAll(@FindBy(xpath = "//table[@class='k-palette k-reset']//tbody//tr//td"))
	java.util.List<WebElement> WaveRagcolorDropdwn;

	public List<WebElement> getWaveRagcolorDropdwn() {
		return WaveRagcolorDropdwn;

	}

	@FindAll(@FindBy(xpath = "*//table[@role='grid']//tbody//tr//td[1]"))
	public java.util.List<WebElement> SerialNumbers;

	public List<WebElement> getSerialNumbers() {
		return SerialNumbers;
	}

	@FindAll(@FindBy(xpath = "//label[contains(text(),'Location ')]//following-sibling::span/span[1]//following::select[@k-ng-model='dataItem.LocationNm']//option"))
	public java.util.List<WebElement> SDOLocationList;

	public List<WebElement> getSDOLocationList() {
		return SDOLocationList;
	}

	@FindAll(@FindBy(xpath = "//label[contains(text(),'Planned Level ')]//following-sibling::span/span[1]//following::select[@k-ng-model='dataItem.PlannedLevel']//option"))
	public java.util.List<WebElement> SDOPlannedLevelList;

	public List<WebElement> getSDOPlannedLevelList() {
		return SDOPlannedLevelList;
	}

	@FindAll(@FindBy(xpath = "//label[contains(text(),'Gender')]//following-sibling::span/span[1]//following::select[@k-data-source='Gender']//option"))
	public java.util.List<WebElement> SDOaddresGenderList;

	public List<WebElement> getSDOaddresGenderList() {
		return SDOaddresGenderList;
	}

	@FindAll(@FindBy(xpath = "//label[contains(text(),'Pool')]//following-sibling::span//select[@id='statusDropdown']/option"))
	public java.util.List<WebElement> SDOaddresPoollist;

	public List<WebElement> getSDOaddresPoollist() {
		return SDOaddresPoollist;
	}

	@FindAll(@FindBy(xpath = "//i[@class='mandatory']//ancestor::label[text()]"))
	public java.util.List<WebElement> SDOaddresmandlist;

	public List<WebElement> getSDOaddresmandlist() {
		return SDOaddresmandlist;
	}

	
	@FindAll(@FindBy(xpath = "//label[contains(text(),'Passport Status')]//following-sibling::span//span[2]//following::select[@k-ng-model='dataItem.PassPortStatus']//option"))
	public java.util.List<WebElement>  SDOAddresPassportStatusList;

	public List<WebElement> getSDOAddresPassportStatusList() {
		return SDOAddresPassportStatusList;
	}
	
	
}
