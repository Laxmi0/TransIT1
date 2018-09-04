package pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class TrainTheTrainePage {

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
	
	@FindBy(xpath ="//span[@class='transIcon-export']")
	public WebElement exportButton;

	public WebElement getexportButton() {
		return exportButton;
	}
	
	
	@FindBy(xpath ="//span[@class='transIcon-import']")
	public WebElement ImportButton;

	public WebElement getImportButton() {
		return ImportButton;
	}
	

	@FindBy(xpath = "//a[@href='/waveExecution/waveExecution/TransferKnowledge?subwaveId=1672&workstreamId=19585']")
	public WebElement TTTLinkpercentage;

	public WebElement getTTTLinkpercentage() {
		return TTTLinkpercentage;
	}

	
	

	
	@FindBy(xpath = "//a[@class='active']")
	public WebElement TTTactivetab;

	public WebElement getTTTactivetab() {
		return TTTactivetab;
	}

	@FindBy(xpath = "//a[@class='transIcon-manage_bookmarks more-icon']")
	public WebElement managebookmarksymbol;

	public WebElement getmanagebookmarksymbol() {
		return managebookmarksymbol;
	}

	@FindBy(xpath = "//a[@title='Bookmark Train The Trainer']//span[@class='transIcon-bookmarked']")
	public WebElement TTTbookmarksymbol;

	public WebElement getTTTbookmarksymbol() {
		return TTTbookmarksymbol;
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


	@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//table//tbody//tr[3]//td[3]")
	public WebElement TTTEditThirdrow;

	public WebElement getTTTEditThirdrow() {
		return TTTEditThirdrow;
	}

	@FindBy(xpath = "//input[@id='txtActivity']")
	public WebElement TTTAddActivitytxbox;

	public WebElement getTTTAddActivitytxbox() {
		return TTTAddActivitytxbox;
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
	public WebElement ActualEnddaterrmsg;

	public WebElement getActualEnddaterrmsg() {
		return ActualEnddaterrmsg;
	}

	@FindBy(xpath = "//label[@id='transErrGeneral']")
	public WebElement Completioninvaliderrmsgless;

	public WebElement getCompletioninvaliderrmsgless() {
		return Completioninvaliderrmsgless;
	}



	@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//table[@role='grid']//tbody//tr[10]//td[3]//a//span[@class='k-icon k-i-edit']")
	public WebElement ActivitytableEditbtnclick;

	public WebElement getActivitytableEditbtnclick() {
		return ActivitytableEditbtnclick;
	}

	@FindBy(xpath = "//label[text()='OWNER CATEGORY ']")
	public WebElement AddActivityOwnerCat;

	public WebElement getAddActivityOwnerCat() {
		return AddActivityOwnerCat;
	}

	@FindBy(xpath = "//input[@id='txtActualEndDate']")
	public WebElement AddActivtyActualEnddate;

	public WebElement getAddActivtyActualEnddate() {
		return AddActivtyActualEnddate;
	}

	@FindBy(xpath = "//input[@id='complete_']//ancestor::span[@class='k-numeric-wrap k-state-default']")
	public WebElement AddTopicCompletion;

	public WebElement getAddTopicCompletion() {
		return AddTopicCompletion;
	}
	
	@FindBy(xpath = "//input[@id='plDuration_']//ancestor::span[@class='k-numeric-wrap k-state-default']")
	public WebElement AddTopicPlannedduration;

	public WebElement getAddTopicPlannedduration() {
		return AddTopicPlannedduration;
	}
	
	
	@FindBy(xpath = "//span[@id='ErrComplete']")
	public WebElement CompletionError;

	public WebElement getCompletionError() {
		return CompletionError;
	}
	
	@FindBy(xpath = "//input[@id='AKR_']")
	public WebElement AccKnwldgeTxtBox;

	public WebElement getAccKnwldgeTxtBox() {
		return AccKnwldgeTxtBox;
	}
	
	@FindBy(xpath = "//span[@id='ErrAKR']")
	public WebElement AccKnwldgeErr;

	public WebElement getAccKnwldgeErr() {
		return AccKnwldgeErr;
	}

	@FindBy(xpath = "//*[@data-bind='value: applications']")
	public WebElement ListOffApps;

	public WebElement getListOffApps() {
		return ListOffApps;
	}
	
	
	
	
	@FindBy(xpath = "//input[@id='actualStartDt']")
	public WebElement AddTopicActualStartdate;

	public WebElement getAddTopicActualStartdate() {
		return AddTopicActualStartdate;
	}
	

	@FindBy(xpath = "//input[@id='txtActualStartDate']")
	public WebElement AddActivtyActualStartdate;

	public WebElement getAddActivtyActualStartdate() {
		return AddActivtyActualStartdate;
	}


	@FindBy(xpath = "//input[@id='txtActualStartDate']")
	public WebElement EditActivityActstrtdate;

	public WebElement getEditActivityActstrtdate() {
		return EditActivityActstrtdate;
	}

	@FindBy(xpath = "//input[@id='txtPlannedEndDate']")
	public WebElement AddActivtyPlandEnddate;

	public WebElement getAddActivtyPlandEnddate() {
		return AddActivtyPlandEnddate;
	}


	@FindBy(xpath = "//input[@id='txtPlannedStartDate']")
	public WebElement AddActivtyPlandstrtdate;

	public WebElement getAddActivtyPlandstrtdate() {
		return AddActivtyPlandstrtdate;
	}

	@FindBy(xpath = "//a[@role='button' and @class='k-button k-bare k-button-icon k-window-action']")
	public WebElement AddActivtyClosebtn;

	public WebElement getAddActivtyClosebtn() {
		return AddActivtyClosebtn;
	}


	@FindBy(xpath = "//label[text()='COMMENTS']//following::textarea")
	public WebElement AddActivtyComments;

	public WebElement getAddActivtyComments() {
		return AddActivtyComments;
	}


	@FindBy(xpath = "//input[@id='txtOwner']")
	public WebElement ActivityOwnerId;

	public WebElement getActivityOwnerId() {
		return ActivityOwnerId;
	}


	@FindBy(xpath = "//a[@role='button' and @class='k-button k-button-icontext k-primary k-grid-update']")
	public WebElement TTAddActivitySavebtn;

	public WebElement getTTAddActivitySavebtn() {
		return TTAddActivitySavebtn;
	}

	
	@FindBy(xpath = "//a[@role='button' and @class='k-button k-button-icontext k-primary k-grid-update']")
	public WebElement TTTracAddTopicSavebtn;

	public WebElement getTTTracAddTopicSavebtn() {
		return TTTracAddTopicSavebtn;
	}

	
	@FindBy(xpath = "//a[@role='button' and @class='k-button k-button-icontext k-primary k-grid-update']")
	public WebElement TTTAssessSavebtn;

	public WebElement getTTTAssessSavebtn() {
		return TTTAssessSavebtn;
	}

	
	@FindBy(xpath = "//input[@id='txtOwner']")
	public WebElement AddActivtyOwnerId;

	public WebElement getAddActivtyOwnerId() {
		return AddActivtyOwnerId;
	}


	@FindBy(xpath = "//button[@id='btnMessageOK']")
	public WebElement TTTAddActivitySaveOkbtn;

	public WebElement getTTTAddActivitySaveOkbtn() {
		return TTTAddActivitySaveOkbtn;
	}

	@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//tbody//tr[3]//td[5]")
	public WebElement ActivityUpdatedcolumn;

	public WebElement getActivityUpdatedcolumn() {
		return ActivityUpdatedcolumn;
	}


	@FindBy(xpath = "//span[@class='transIcon-close']")
	public WebElement ViewhistoryTableclosebtn;

	public WebElement getViewhistoryTableclosebtn() {
		return ViewhistoryTableclosebtn;
	}


	@FindBy(xpath = "//input[@id='txtComplete']")
	public WebElement EditActivityCompletionperctge;

	public WebElement getEditActivityCompletionperctge() {
		return EditActivityCompletionperctge;
	}


	@FindBy(xpath = "//span[@class='acn-shrink']")
	public WebElement ExpanderShrinkIcon;

	public WebElement getExpanderShrinkIcon() {
		return ExpanderShrinkIcon;
	}


	@FindBy(xpath = "//ul[@class='nav nav-tabs tabs']//li//a[text()='DTP/Runbooks Tracker']")
	public WebElement DTPTracktab;

	public WebElement getDTPTracktab() {
		return DTPTracktab;
	}
	
	@FindBy(xpath = "//input[@id='txtdtpName']")
	public WebElement DTPRunName;

	public WebElement getDTPRunName() {
		return DTPRunName;
	}
	
	
	@FindBy(xpath = "//ul[@class='nav nav-tabs tabs']//li//a[text()='TTT Tracker']")
	public WebElement TTTTracktab;

	public WebElement getTTTTracktab() {
		return TTTTracktab;
	}

	

	@FindBy(xpath = "//ul[@class='nav nav-tabs tabs']//li//a[text()='TTT ASSESSMENTS']")
	public WebElement TTTAssessmtstab;

	public WebElement getTTTAssessmtstab() {
		return TTTAssessmtstab;
	}
	
	@FindBy(xpath = "//ul[@class='nav nav-tabs tabs']//li//a[text()='APPROVALS']")
	public WebElement TTTApprovalsTab;

	public WebElement getTTTApprovalsTab() {
		return TTTApprovalsTab;
	}
	
	@FindBy(xpath = "//div[@class='row overall']//following::div[@class='col-sm-6 overall-progress']//h2[@class='ttt-title']")
	public WebElement TTTApprovalsHeader;

	public WebElement getTTTApprovalsHeader() {
		return TTTApprovalsHeader;
	}
	
	@FindBy(xpath = "//div[@class='row overall'][2]//following::div[@class='col-sm-6 overall-progress']//h2[@class='ttt-title']")
	public WebElement TTTApprovalsSecondHeader;

	public WebElement getTTTApprovalsSecondHeader() {
		return TTTApprovalsSecondHeader;
	}
	

	
	@FindBy(xpath = "//button[@ng-click='AddDTPPlan()']")
	public WebElement AddDTPbtn;

	public WebElement getAddDTPbtn() {
		return AddDTPbtn;
	}

	@FindBy(xpath = "//button[@ng-click='AddTTTPlan()']")
	public WebElement AddTTTopicbtn;

	public WebElement getAddTTTopicbtn() {
		return AddTTTopicbtn;
	}
	
	
	@FindBy(xpath = "//button[@ng-click='Upload()']")
	public WebElement TTTLinkArtfacts;

	public WebElement getTTTLinkArtfacts() {
		return TTTLinkArtfacts;
	}
	
	@FindBy(xpath = "//button[@ng-click='WaveDetails()']")
	public WebElement TTTtrackWavedetails;

	public WebElement getTTTtrackWavedetails() {
		return TTTtrackWavedetails;
	}
	
	
	
	
	@FindBy(xpath = "//button[@ng-click='AddResource()']")
	public WebElement TTTAssAddResbtn;

	public WebElement getTTTAssAddResbtn() {
		return TTTAssAddResbtn;
	}
	

	@FindBy(xpath ="//li//a[@ng-click='AssessmentExport()']//span[@class='transIcon-export']")
	public WebElement TTTExportButton;

	public WebElement getTTTExportButton() {
		return TTTExportButton;
	}
	
	@FindBy(xpath ="//li//a[@ng-click='AssessmentImport()']//span[@class='transIcon-import']")
	public WebElement TTTImportButton;

	public WebElement getTTTImportButton() {
		return TTTImportButton;
	}
	
	
	

	@FindAll(@FindBy(xpath = "//div[@id='gridtask']//div[@class='k-grid-header-wrap k-auto-scrollable']//table[@role='grid']//thead//tr//th[text() or @data-title]"))
	java.util.List<WebElement> ActivityTableheaderlist;

	public List<WebElement> getActivityTableheaderlist() {
		return ActivityTableheaderlist;
	}

	@FindAll(@FindBy(xpath = "//span[@class='k-icon k-i-filter']//ancestor::a//ancestor::th[text() or @data-title]"))
	java.util.List<WebElement> DTPTabFilterlist;

	public List<WebElement> getDTPTabFilterlist() {
		return DTPTabFilterlist;
	}

	
	@FindAll(@FindBy(xpath = "//span[@class='k-icon k-i-filter']//ancestor::a//ancestor::th[text() or @data-title]"))
	java.util.List<WebElement> TTTAssessFilterlist;

	public List<WebElement> getTTTAssessFilterlist() {
		return TTTAssessFilterlist;
	}
	
	@FindAll(@FindBy(xpath = "//span[@class='k-icon k-i-filter']//ancestor::a//ancestor::th[text() or @data-title]"))
	java.util.List<WebElement> TTTrackerFilterlist;

	public List<WebElement> getTTTrackerFilterlist() {
		return TTTrackerFilterlist;
	}
	
	
	
	
	@FindBy(xpath = "//th[@data-field='signedOffAcc']//a")
	public WebElement DTPSignOfaccentureFilter;

	public WebElement getDTPSignOfaccentureFilter() {
		return DTPSignOfaccentureFilter;
	}
	
	@FindBy(xpath = "//th[@data-title='Assessment Type *']//a//span")
	public WebElement TTTAsessTypeFilter;

	public WebElement getTTTAsessTypeFilter() {
		return TTTAsessTypeFilter;
	}
	
	@FindBy(xpath = "//th[@data-title='Training Phase*']//a//span")
	public WebElement TTtrackTrainPhaseTypeFilter;

	public WebElement getTTtrackTrainPhaseTypeFilter() {
		return TTtrackTrainPhaseTypeFilter;
	}
	
	@FindBy(xpath = "//input[@type='checkbox' and @value='Process Design / Capture']")
	public WebElement TTTAssesstypeProcessfilter;

	public WebElement getTTTAssesstypeProcessfilter() {
		return TTTAssesstypeProcessfilter;
	}
	
	@FindBy(xpath = "//input[@type='checkbox' and @value='TTT - Hands on Practice']")
	public WebElement TTTracktypeHandsOnfilter;

	public WebElement getTTTracktypeHandsOnfilter() {
		return TTTracktypeHandsOnfilter;
	}
	
	

	@FindBy(xpath = "//li//input[@name='AssessmentType']//following::button[text()='Filter']")
	public WebElement TTTAssessFilterbutton;

	public WebElement getTTTAssessFilterbutton() {
		return TTTAssessFilterbutton;
	}
	
	
	@FindBy(xpath = "//li//input[@name='trainingPhaseNm']//following::button[text()='Filter']")
	public WebElement TTTTrackFilterbutton;

	public WebElement getTTTTrackFilterbutton() {
		return TTTTrackFilterbutton;
	}
	

	@FindBy(xpath = "//input[@type='checkbox' and @signedoffacc and @value='No']")
	public WebElement DTPsignOfAccNoOption;

	public WebElement getDTPsignOfAccNoOption() {
		return DTPsignOfAccNoOption;
	}
	
	@FindBy(xpath = "//li//input[@signedoffacc]//following::button[text()='Filter']")
	public WebElement Filterbutton;

	public WebElement getFilterbutton() {
		return Filterbutton;
	}
	
	@FindBy(xpath = "//span[@class='k-icon k-i-sort-asc-sm']")
	public WebElement AscSortbutton;

	public WebElement getAscSortbutton() {
		return AscSortbutton;
	}

	
	@FindBy(xpath = "//span[@class='k-icon k-i-sort-desc-sm']")
	public WebElement DescSortbutton;

	public WebElement getDescSortbutton() {
		return DescSortbutton;
	}
	
	@FindBy(xpath = "//a[text()='DTP/ Runbooks Name*']")
	public WebElement DTPName;

	public WebElement getDTPName() {
		return DTPName;
	}
	
	
	@FindBy(xpath = "//a[text()='Trainee Name *']")
	public WebElement TraineeName;

	public WebElement getTraineeName() {
		return TraineeName;
	}
	
	
	@FindBy(xpath = "//a[text()='Training Topic/ Activity*']")
	public WebElement TTTTrackTrainiActivity;

	public WebElement getTTTTrackTrainiActivity() {
		return TTTTrackTrainiActivity;
	}
	
	
	
	
	@FindBy(xpath = "//ul//li//input[@signedoffacc]//ancestor::div//form[@aria-hidden='false']//input[@placeholder='Search']")
	public WebElement DTPSignoffaccSearchbutton;

	public WebElement getDTPSignoffaccSearchbutton() {
		return DTPSignoffaccSearchbutton;
	}
	
	@FindBy(xpath = "//ul//li//input[@name='AssessmentType']//ancestor::div//form[@aria-hidden='false']//input[@placeholder='Search']")
	public WebElement TTTAssessTypeSearchbutton;

	public WebElement getTTTAssessTypeSearchbutton() {
		return TTTAssessTypeSearchbutton;
	}
	
	@FindBy(xpath = "//ul//li//input[@name='trainingPhaseNm']//ancestor::div//form[@aria-hidden='false']//input[@placeholder='Search']")
	public WebElement TTTrackTypeSearchbutton;

	public WebElement getTTTrackTypeSearchbutton() {
		return TTTrackTypeSearchbutton;
	}
	
	
	
	@FindBy(xpath = "//label[contains(text(),'FUNCTION/TECHNOLOGY/COMPONENT*')]//following::span/span[1]")
	public WebElement DTPFunction;

	public WebElement getDTPFunction() {
		return DTPFunction;
	}
	
	@FindBy(xpath = "//label[contains(text(),'DTP/RUNBOOKS DEVELOPED*')]//following::span/span[1]")
	public WebElement DTPDeveloped;

	public WebElement getDTPDeveloped() {
		return DTPDeveloped;
	}
	
	@FindBy(xpath = "//label[contains(text(),'SIGNED OFF FROM ACCENTURE(*)')]//following::span/span[1]")
	public WebElement DTPSignOffAcc;

	public WebElement getDTPSignOffAcc() {
		return DTPSignOffAcc;
	}
	
	
	@FindBy(xpath = "//label[contains(text(),'Function / Technology / Components ')]//following::span/span[1]")
	public WebElement TTTAssessFunction;

	public WebElement getTTTAssessFunction() {
		return TTTAssessFunction;
	}

	@FindBy(xpath = "//label[contains(text(),'Accreditation Status ')]//following::span/span[1]")
	public WebElement TTTAssessAccreditionStat;

	public WebElement TTTAssessAccreditionStat() {
		return TTTAssessAccreditionStat;
	}
	
	@FindBy(xpath = "//label[@id='transErrCerStatus']")
	public WebElement TTTAssessAccreditionStatError;

	public WebElement getTTTAssessAccreditionStatError() {
		return TTTAssessAccreditionStatError;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Assessment Type ')]//following::span/span[1]")
	public WebElement TTTAssessmentType;

	public WebElement getTTTAssessmentType() {
		return TTTAssessmentType;
	}

	@FindBy(xpath = "//input[@id='txtdtpName']")
	public WebElement DTPRunbooksName;

	public WebElement getDTPRunbooksName() {
		return DTPRunbooksName;
	}
	
	@FindBy(xpath = "//a[@class='k-button k-button-icontext k-primary k-grid-update']")
	public WebElement DTPSavebtn;

	public WebElement getDTPSavebtn() {
		return DTPSavebtn;
	}

	@FindBy(xpath = "//button[@id='btnMessageOK']")
	public WebElement DTPAddrunbookSaveOkbtn;

	public WebElement getDTPAddrunbookSaveOkbtn() {
		return DTPAddrunbookSaveOkbtn;
	}
	

	@FindBy(xpath = "//*[@id='divpopupMessage']")
	public WebElement InvalidApprovernamepopup;

	public WebElement getInvalidApprovernamepopup() {
		return InvalidApprovernamepopup;
	}
	
	
	
	@FindBy(xpath = "//label[@id='transErrdtpName']")
	public WebElement DTPRunbooknamreqderror;

	public WebElement getDTPRunbooknamreqderror() {
		return DTPRunbooknamreqderror;
	}
	

	@FindBy(xpath = "//label[@id='transErrcomp']")
	public WebElement DTPFunctionreqderror;

	public WebElement getDTPFunctionreqderror() {
		return DTPFunctionreqderror;
	}
	

	@FindBy(xpath = "//label[@id='transErrDtpdev']")
	public WebElement DTPDevelopedreqderror;

	public WebElement getDTPDevelopedreqderror() {
		return DTPDevelopedreqderror;
	}
	
	@FindBy(xpath = "//*[@title='Column Settings']/span")
	public WebElement settingsIcon;

	public WebElement getSettingsIcon() {
		return settingsIcon;
	}
	
	

	@FindBy(xpath = "//span[@class='k-link']//input[@type='checkbox' and @data-field='applications']")
	public WebElement Applicationchckbox;

	public WebElement getApplicationchckbox() {
		return Applicationchckbox;
	}

	
	

	@FindBy(xpath = "//*[contains(text(),'Columns')]")
	public WebElement gridSettingsColumn;

	public WebElement getGridSettingsColumn() {
		return gridSettingsColumn;
	}

	@FindBy(xpath = "//span//input[@type='checkbox' and @data-field='georegion']")
	public WebElement gridSettingFieldcheck;

	public WebElement gridSettingFieldcheck() {
		return gridSettingFieldcheck;
	}
	
	@FindBy(xpath = "//span//input[@type='checkbox' and @data-field='Artifacts']")
	public WebElement AssessgridSettingFieldcheck;

	public WebElement getAssessgridSettingFieldcheck() {
		return AssessgridSettingFieldcheck;
	}
	
	
	@FindBy(xpath = "//span//input[@type='checkbox' and @data-field='trainingDelivery']")
	public WebElement gridSettingFieldcheck1;

	public WebElement gridSettingFieldcheck1() {
		return gridSettingFieldcheck1;
	}
	
	@FindBy(xpath = "//span//input[@type='checkbox' and @data-field='ProficiencyScore']")
	public WebElement gridSettingFieldProfScore;

	public WebElement gridSettingFieldProfScore() {
		return gridSettingFieldProfScore;
	}
	
	

	@FindBy(xpath = "//span//input[@type='checkbox' and @data-field='georegion']")
	public WebElement TTTAssgridSettingFieldcheck;

	public WebElement getTTTAssgridSettingFieldcheck() {
		return TTTAssgridSettingFieldcheck;
	}
	
	@FindBy(xpath = "//table[@role='grid']//tbody//tr[5]//td[1]")
	public WebElement DTPEditbtn;

	public WebElement getDTPEditbtn() {
		return DTPEditbtn;
	}
	
	
	
	@FindBy(xpath = "//div[@class='k-grid-content-locked']//table//tbody//tr[5]//td[5]")
	public WebElement TTTTrackerEditbtn;

	public WebElement getTTTTrackerEditbtn() {
		return TTTTrackerEditbtn;
	}
	
	@FindBy(xpath = "//div[@class='k-grid-content-locked']//table//tbody//tr[5]//td[1]")
	public WebElement TTTAssessEditbtn;

	public WebElement getTTTAssessEditbtn() {
		return TTTAssessEditbtn;
	}
	
	@FindBy(xpath = "//div[@class='k-grid-content-locked']//table//tbody//tr[5]//td[1]")
	public WebElement TTTrackerEditbtn;

	public WebElement getTTTrackerEditbtn() {
		return TTTrackerEditbtn;
	}
	
	@FindBy(xpath = "//div[@class='k-grid-content-locked']//table//tbody//tr[5]//td[1]")
	public WebElement TTTAssessEditbtncheck;

	public WebElement getTTTAssessEditbtncheck() {
		return TTTAssessEditbtncheck;
	}
	

	@FindBy(xpath = "//input[@id='activity_']")
	public WebElement TTTTrackActivityTopic;

	public WebElement getTTTTrackActivityTopic() {
		return TTTTrackActivityTopic;
	}

	@FindBy(xpath = "//input[@data-bind='value: TrainingTopic']")
	public WebElement TTTAssessTrainTopic;

	public WebElement getTTTAssessTrainTopic() {
		return TTTAssessTrainTopic;
	}

	@FindBy(xpath = "//input[@id='txtOwner']")
	public WebElement TTTAssessTrainName;

	public WebElement getTTTAssessTrainName() {
		return TTTAssessTrainName;
	}
	
	@FindBy(xpath = "//input[@k-ng-model='dataItem.ProficiencyTarget']//ancestor::span[2]//input")
	public WebElement TTTAssessProficiencyTarget;

	public WebElement getTTTAssessProficiencyTarget() {
		return TTTAssessProficiencyTarget;
	}
	
	@FindBy(xpath = "//input[@k-ng-model='dataItem.ProficiencyScore']//ancestor::span[2]//input")
	public WebElement TTTAssessProficiencyScore;

	public WebElement getTTTAssessProficiencyScore() {
		return TTTAssessProficiencyScore;
	}
	
	
	
	@FindBy(xpath = "//table[@role='grid']//tbody//tr[5]//td[5]//span")
	public WebElement DTPEditCheck;

	public WebElement getDTPEditCheck() {
		return DTPEditCheck;
	}
	
	@FindBy(xpath = "//ul[@class='nav nav-tabs tabs']//li//a[text()='TTT ASSESSMENTS']")
	public WebElement TTTTrackertab;

	public WebElement getTTTTrackertab() {
		return TTTTrackertab;
	}
	
	@FindBy(xpath = "//table[@role='grid']//tbody//tr[5]//td[7]")
	public WebElement TTTTrackerEditCheck;

	public WebElement getTTTTrackerEditCheck() {
		return TTTTrackerEditCheck;
	}
	
	@FindBy(xpath = "//ul[@class='nav nav-tabs tabs']//li//a[text()='TTT Tracker']")
	public WebElement TTTTracker1tab;

	public WebElement getTTTTracker1tab() {
		return TTTTracker1tab;
	}
	
	
	@FindBy(xpath = "//p[@class='mandatory-text ng-scope']")
	public WebElement TTTAssessErrroMessage;

	public WebElement getTTTAssessErrroMessage() {
		return TTTAssessErrroMessage;
	}
	
	@FindBy(xpath = "//input[@k-ng-model='dataItem.AssessmentDate']")
	public WebElement TTTAssesmentDate;

	public WebElement getTTTAssesmentDate() {
		return TTTAssesmentDate;
	}
	
	@FindBy(xpath = "//label[@id='transErrAssessmentDt']")
	public WebElement TTTAssesmentDateError;

	public WebElement getTTTAssesmentDateError() {
		return TTTAssesmentDateError;
	}

	@FindBy(xpath = "//table[@role='grid']//tbody//tr[5]//td[5]")
	public WebElement TTTAssessEditCheck;

	public WebElement getTTTAssessEditCheck() {
		return TTTAssessEditCheck;
	}
	
	@FindBy(xpath = "//table[@role='grid']//tbody//tr[5]//td[7]")
	public WebElement TTTrackerEditCheck;

	public WebElement getTTTrackerEditCheck() {
		return TTTrackerEditCheck;
	}
	
	
	@FindBy(xpath = "//table[@role='grid']//tbody//tr[2]//td[3]")
	public WebElement TTTApprovernamecol;

	public WebElement getTTTApprovernamecol() {
		return TTTApprovernamecol;
	}
	
	@FindBy(xpath = "//input[@id='approverid']")
	public WebElement TTTApprovernameinput;

	public WebElement getTTTApprovernameinput() {
		return TTTApprovernameinput;
	}
	
	@FindBy(xpath = "//input[@class='k-checkbox']")
	public WebElement TTTApprovernameChckbx;

	public WebElement getTTTApprovernameChckbx() {
		return TTTApprovernameChckbx;
	}
	
	@FindBy(xpath = "//table[@role='grid']//tbody//tr[1]//td[2]")
	public WebElement TTTApproverRole;

	public WebElement getTTTApproverRole() {
		return TTTApproverRole;
	}
	
	@FindBy(xpath = "//label[contains(text(),'TTT Location*')]//following::span/span[1]")
	public WebElement TTtrackAddLocation;

	public WebElement getTTtrackAddLocation() {
		return TTtrackAddLocation;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Delivery Team Training Location*')]//following::span/span[1]")
	public WebElement DTTtrackAddLocation;

	public WebElement getDTTtrackAddLocation() {
		return DTTtrackAddLocation;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Function / Technology / Component*')]//following::span/span[1]")
	public WebElement TTtrackAddFunction;

	public WebElement getTTtrackAddFunction() {
		return TTtrackAddFunction;
	}
	
	
	@FindBy(xpath = "//label[contains(text(),'Training Phase*')]//following::span/span[1]")
	public WebElement TTtrackAddTrainPhase;

	public WebElement getTTtrackAddTrainPhase() {
		return TTtrackAddTrainPhase;
	}
	
	@FindBy(xpath = "//input[@id='activity_']")
	public WebElement TTtrackAddActivity;

	public WebElement getTTtrackAddActivity() {
		return TTtrackAddActivity;
	}
	
	@FindBy(xpath = "//input[@id='AKR_']")
	public WebElement TTtrackAddAccKnldRecep;

	public WebElement getTTtrackAddAccKnldRecep() {
		return TTtrackAddAccKnldRecep;
	}
	
	
	@FindBy(xpath = "//input[@id='plannedStartDt']")
	public WebElement TTtrackAddPlandStrtDate;

	public WebElement getTTtrackAddPlandStrtDate() {
		return TTtrackAddPlandStrtDate;
	}
	
	
	@FindBy(xpath = "//input[@id='plannedEndDt']")
	public WebElement TTtrackAddPlndEndDate;

	public WebElement getTTtrackAddPlndEndDate() {
		return TTtrackAddPlndEndDate;
	}
	

	@FindBy(xpath = "//button[@ng-click='SendApproval()']")
	public WebElement TTTSendApprovalbtn;

	public WebElement getTTTSendApprovalbtn() {
		return TTTSendApprovalbtn;
	}
	
	@FindBy(xpath = "//span[@id='ErrTTTLoc']")
	public WebElement TTTrackLocationReqdError;

	public WebElement getTTTrackLocationReqdError() {
		return TTTrackLocationReqdError;
	}
	
	@FindBy(xpath = "//span[@id='ErrFunction']")
	public WebElement TTTrackFunctionReqdError;

	public WebElement getTTTrackFunctionReqdError() {
		return TTTrackFunctionReqdError;
	}
	
	@FindBy(xpath = "//span[@id='ErrActivity']")
	public WebElement TTTrackActivityReqdError;

	public WebElement getTTTrackActivityReqdError() {
		return TTTrackActivityReqdError;
	}
	
	@FindBy(xpath = "//span[@id='ErrTrPhase']")
	public WebElement TTTrackPhaseReqdError;

	public WebElement getTTTrackPhaseReqdError() {
		return TTTrackPhaseReqdError;
	}
	
	@FindBy(xpath = "//span[@id='ErrPlStartDt']")
	public WebElement TTTrackPlnStrtDAteReqdError;

	public WebElement getTTTrackPlnStrtDAteReqdError() {
		return TTTrackPlnStrtDAteReqdError;
	}
	
	@FindBy(xpath = "//span[@id='ErrPlEndDt']")
	public WebElement TTTrackPlnEndDateReqdError;

	public WebElement getTTTrackPlnEndDateReqdError() {
		return TTTrackPlnEndDateReqdError;
	}
	
	
	@FindBy(xpath = "//button[@ng-click='addArtifacts()']")
	public WebElement AddArtifactsbtn;

	public WebElement getAddArtifactsbtn() {
		return AddArtifactsbtn;
	}
	
	
	@FindBy(xpath = "//span[@class='k-icon k-i-close']")
	public WebElement AddArtifactsdelete;

	public WebElement getAddArtifactsdelete() {
		return AddArtifactsdelete;
	}
	

	@FindBy(xpath = "//i[@class='icon-KnowledgeTransferOnshore']//following::i[@class='acn-cross']")
	public WebElement AddWavedetailsCrossbtn;

	public WebElement getAddWavedetailsCrossbtn() {
		return AddWavedetailsCrossbtn;
	}
	
	
	
	@FindBys(@FindBy(xpath = "//div//form//div//input[1]//following::ul//li[@style='display: none;']//input[@signedoffacc]"))
	public List<WebElement> DTPsignofflistnotcontainingSearch;

	public List<WebElement> getDTPsignofflistnotcontainingSearch() {
		return DTPsignofflistnotcontainingSearch;
	}
	
	@FindBys(@FindBy(xpath = "//div//form//div//input[1]//following::ul//li[@style='display: none;']//input[@name='AssessmentType']"))
	public List<WebElement> TTTAssTypelistnotcontainingSearch;

	public List<WebElement> getTTTAssTypelistnotcontainingSearch() {
		return TTTAssTypelistnotcontainingSearch;
	}
	
	@FindBys(@FindBy(xpath = "//div//form//div//input[1]//following::ul//li[@style='display: none;']//input[@name='trainingPhaseNm']"))
	public List<WebElement> TTTrackerTypelistnotcontainingSearch;

	public List<WebElement> getTTTrackerTypelistnotcontainingSearch() {
		return TTTrackerTypelistnotcontainingSearch;
	}
	
	

	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr"))
	public java.util.List<WebElement>	FilteredElements;

	public List<WebElement> getFilteredElements() {
		return FilteredElements;
	}
	
	@FindAll(@FindBy(xpath = "//div[@class='k-grid-header-wrap k-auto-scrollable']//thead//tr//th"))
	public java.util.List<WebElement> TTTTrackerHeader;

	public List<WebElement> getTTTTrackerHeader() {
		return TTTTrackerHeader;
	}
	
	
	@FindAll(@FindBy(xpath = "//*[@data-role='columnsorter']"))
	public java.util.List<WebElement> TTTTrackersorterlist;

	public List<WebElement> getTTTTrackersorterlist() {
		return TTTTrackersorterlist;
	}
	
	@FindAll(@FindBy(xpath = "//span//input[@type='checkbox']"))
	public java.util.List<WebElement> GridCheckboxlist;

	public List<WebElement> getGridCheckboxlist() {
		return GridCheckboxlist;
	}
	



	@FindAll(@FindBy(xpath = "//ul[@class='nav nav-tabs tabs']//li"))
	java.util.List<WebElement> TTTtabList;

	public List<WebElement> getTTTtabList() {
		return TTTtabList;
	}


	@FindAll(@FindBy(xpath = "//div[@id='historyId']//div[@class='k-grid-content k-auto-scrollable']//table[@role='grid']//tr//td[2]"))
	java.util.List<WebElement> ViewHistrytabdatamodifiedcolm;

	public List<WebElement> getViewHistrytabdatamodifiedcolm() {
		return ViewHistrytabdatamodifiedcolm;
	}
	


	@FindAll(@FindBy(xpath = "//div[@id='historyId']//div[@class='k-grid-content k-auto-scrollable']//table[@role='grid']//tr"))
	java.util.List<WebElement> ViewHistryTabRowSize;

	public List<WebElement> getViewHistryTabRowSize() {
		return ViewHistryTabRowSize;
	}


	@FindAll(@FindBy(xpath = "//div[@id='historyId']//div[1]//table[@role='grid']//thead//tr//th"))
	java.util.List<WebElement> ViewHistrytablist;

	public List<WebElement> getViewHistrytablist() {
		return ViewHistrytablist;
	}
	
	@FindAll(@FindBy(xpath = "//ul[@class='nav navbar-nav nav-icons pull-left tttTrackerStatus']//span[1]"))
	java.util.List<WebElement> TTTAssessmentstatus;

	public List<WebElement> getTTTAssessmentstatus() {
		return TTTAssessmentstatus;
	}
	
	@FindAll(@FindBy(xpath = "//div[@class='k-grid-header-wrap k-auto-scrollable']//table[@role='grid']//thead//tr//th[text() or @data-title]"))
	java.util.List<WebElement> TTTAssessheaderlist;

	public List<WebElement> getTTTAssessheaderlist() {
		return TTTAssessheaderlist;
	}
	
	@FindAll(@FindBy(xpath = "//table[@role='grid']//thead//tr//th[text()]"))
	java.util.List<WebElement> TTTApprovalstabcols;

	public List<WebElement> getTTTApprovalstabcols() {
		return TTTApprovalstabcols;
	}
	
	@FindAll(@FindBy(xpath = "//table[@role='grid']//thead//tr//th[text() or @data-title]"))
	java.util.List<WebElement> TTTTrackertabcols;

	public List<WebElement> getTTTTrackertabcols() {
		return TTTTrackertabcols;
	}
	
	@FindAll(@FindBy(xpath = "//table[@role='grid']//thead//tr//th[text() or @data-title]"))
	java.util.List<WebElement> TTTTrackerArtifactstabcols;

	public List<WebElement> getTTTTrackerArtifactstabcols() {
		return TTTTrackerArtifactstabcols;
	}
	
	@FindAll(@FindBy(xpath = "//i[@class='mandatory']//ancestor::label"))
	java.util.List<WebElement> AddArtifactsMandatoryList;

	public List<WebElement> getAddArtifactsMandatoryList() {
		return AddArtifactsMandatoryList;
	}

	@FindAll(@FindBy(xpath = "//a[@class='k-button k-button-icontext k-grid-delete']"))
	java.util.List<WebElement> AddArtifactsDeletebtn;

	public List<WebElement> getAddArtifactsDeletebtn() {
		return AddArtifactsDeletebtn;
	}

	@FindAll(@FindBy(xpath = "//span[@class='transIcon-cloud-download']"))
	java.util.List<WebElement> AddArtifactsdownloadbtn;

	public List<WebElement> getAddArtifactsdownloadbtn() {
		return AddArtifactsdownloadbtn;
	}

	
	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr"))
	java.util.List<WebElement> AddArtifactstableElts;

	public List<WebElement> getAddArtifactstableElts() {
		return AddArtifactstableElts;
	}

	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr//td[text()]"))
	java.util.List<WebElement> AddArtifactsrowlets;

	public List<WebElement> getAddArtifactsrowlets() {
		return AddArtifactsrowlets;
	}
	
	@FindAll(@FindBy(xpath = "//div[@class='k-grid-header-wrap k-auto-scrollable']//thead//tr//th"))
	java.util.List<WebElement> AddWavedetailsHeaderelts;

	public List<WebElement> getAddWavedetailsHeaderelts() {
		return AddWavedetailsHeaderelts;
	}



}
