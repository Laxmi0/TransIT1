package pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class DTTPage {
	@FindBy(xpath = "//span[text()='9thMar2018']")
	public WebElement ProjectCard;

	public WebElement getProjectCard() {
		return ProjectCard;

	}

	@FindBy(xpath = "//a[@href='/waveExecution/waveExecution/DeliveryTeamTraining?subwaveId=1672&workstreamId=19586']")
	public WebElement DTTLinkpercentage;

	public WebElement getDTTLinkpercentage() {
		return DTTLinkpercentage;
	}
	
	@FindBy(xpath = "//button[@ng-click='AddTTTPlan()']")
	public WebElement AddTTTopicbtn;

	public WebElement getAddTTTopicbtn() {
		return AddTTTopicbtn;
	}
	
	@FindBy(xpath = "//button[@ng-click='AddDTPPlan()']")
	public WebElement AddDTPbtn;

	public WebElement getAddDTPbtn() {
		return AddDTPbtn;
	}
	
	@FindBy(xpath = "//button[@ng-click='AddTask()']")
	public WebElement AddActivity;

	public WebElement getAddActivity() {
		return AddActivity;
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
	
	@FindBy(xpath = "//button[@ng-click='WaveDetails()']")
	public WebElement TTTtrackWavedetails;

	public WebElement getTTTtrackWavedetails() {
		return TTTtrackWavedetails;
	}
	
	
	
	@FindBy(xpath = "//button[@ng-click='Upload()']")
	public WebElement TTTLinkArtfacts;

	public WebElement getTTTLinkArtfacts() {
		return TTTLinkArtfacts;
	}
	
	
	
	@FindBy(xpath = "//ul[@class='nav nav-tabs tabs']//li//a[text()='DTT Tracker']")
	public WebElement DTTTracktab;

	public WebElement getDTTTracktab() {
		return DTTTracktab;
	}
	
	@FindBy(xpath = "//ul[@class='nav nav-tabs tabs']//li//a[text()='DTP/Runbooks Tracker']")
	public WebElement DTPTracktab;

	public WebElement getDTPTracktab() {
		return DTPTracktab;
	}
	
	
	@FindBy(xpath = "//th[@data-title='Training Phase*']//a//span")
	public WebElement DTTTrainTypeFilter;

	public WebElement getDTTTrainTypeFilter() {
		return DTTTrainTypeFilter;
	}
	
	@FindBy(xpath = "//table//tbody//tr[1]//td[10]")
	public WebElement RandomElt;

	public WebElement getRandomElt() {
		return RandomElt;
	}
	
	@FindBy(xpath = "//input[@type='checkbox' and @value='Training - Gate 3']")
	public WebElement DTTTrainTypefilter;

	public WebElement getDTTTrainTypefilter() {
		return DTTTrainTypefilter;
	}
	
	@FindBy(xpath = "//li//input[@name='trainingPhaseNm']//following::button[text()='Filter']")
	public WebElement DTTTrainTypeFilterbutton;

	public WebElement getDTTTrainTypeFilterbutton() {
		return DTTTrainTypeFilterbutton;
	}
	

	@FindBy(xpath = "//a[text()='Training Topic/ Activity*']")
	public WebElement TrainingTopic;

	public WebElement getTrainingTopic() {
		return TrainingTopic;
	}
	
	@FindBy(xpath = "//ul//li//input[@name='trainingPhaseNm']//ancestor::div//form[@aria-hidden='false']//input[@placeholder='Search']")
	public WebElement DTTTrainTypeSearchbutton;

	public WebElement getDTTTrainTypeSearchbutton() {
		return DTTTrainTypeSearchbutton;
	}
	
	@FindBy(xpath = "//span//input[@type='checkbox' and @data-field='georegion']")
	public WebElement DTTTrackgridSettingFieldcheck;

	public WebElement getDTTTrackgridSettingFieldcheck() {
		return DTTTrackgridSettingFieldcheck;
	}
	
	
	@FindAll(@FindBy(xpath = "//div[@class='k-grid-header-wrap k-auto-scrollable']//thead//tr//th"))
	public java.util.List<WebElement> DTTTrackerHeader;

	public List<WebElement> getDTTTrackerHeader() {
		return DTTTrackerHeader;
	}
	
	@FindBy(xpath = "//div[@class='k-grid-content-locked']//table//tbody//tr[5]//td[1]")
	public WebElement DTTTrackerEditbtn;

	public WebElement getDTTTrackerEditbtn() {
		return DTTTrackerEditbtn;
	}
	

	@FindBy(xpath = "//input[@id='activity_']")
	public WebElement DTTTrackActivityTopic;

	public WebElement getDTTTrackActivityTopic() {
		return DTTTrackActivityTopic;
	}
	@FindBy(xpath = "//a[@role='button' and @class='k-button k-button-icontext k-primary k-grid-update']")
	public WebElement DTTTracracAddTopicSavebtn;

	public WebElement getDTTTracracAddTopicSavebtn() {
		return DTTTracracAddTopicSavebtn;
	}
	
	
	@FindBy(xpath = "//button[@id='btnMessageOK']")
	public WebElement DTTSaveOkbtn;

	public WebElement getDTTSaveOkbtn() {
		return DTTSaveOkbtn;
	}
	
	@FindBy(xpath = "//ul//li//button[@ng-click='viewHistory()']")
	public WebElement ViewHistorybutton;

	public WebElement getViewHistorybutton() {
		return ViewHistorybutton;
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
	
	@FindAll(@FindBy(xpath = "//div[@id='historyId']//div[@class='k-grid-content k-auto-scrollable']//table[@role='grid']//tr//td[2]"))
	java.util.List<WebElement> ViewHistrytabdatamodifiedcolm;

	public List<WebElement> getViewHistrytabdatamodifiedcolm() {
		return ViewHistrytabdatamodifiedcolm;
	}
	
	@FindBy(xpath = "//span[@class='transIcon-close']")
	public WebElement ViewhistoryTableclosebtn;

	public WebElement getViewhistoryTableclosebtn() {
		return ViewhistoryTableclosebtn;
	}
	
	@FindAll(@FindBy(xpath = "//div[@id='historyId']//div[@class='k-grid-content k-auto-scrollable']//table[@role='grid']//tr//td[5]"))
	java.util.List<WebElement> ViewHistryTabUpdatedOncolm;

	public List<WebElement> getViewHistryTabUpdatedOncolm() {
		return ViewHistryTabUpdatedOncolm;
	}
	
	@FindBy(xpath = "//input[@id='txtActivity']")
	public WebElement DTTAddActivitytxbox;

	public WebElement getDTTAddActivitytxbox() {
		return DTTAddActivitytxbox;
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

	
	@FindBy(xpath = "//input[@id='txtActualStartDate']")
	public WebElement AddActivtyActualStartdate;

	public WebElement getAddActivtyActualStartdate() {
		return AddActivtyActualStartdate;
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
	
	
	
	@FindBy(xpath = "//input[@id='actualStartDt']")
	public WebElement AddTopicActualStartdate;

	public WebElement getAddTopicActualStartdate() {
		return AddTopicActualStartdate;
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
	
	@FindBy(xpath = "//label[text()='COMMENTS']//following::textarea")
	public WebElement AddActivtyComments;

	public WebElement getAddActivtyComments() {
		return AddActivtyComments;
	}
	
	@FindBy(xpath = "//a[@role='button' and @class='k-button k-bare k-button-icon k-window-action']")
	public WebElement AddActivtyClosebtn;

	public WebElement getAddActivtyClosebtn() {
		return AddActivtyClosebtn;
	}
	
	@FindBy(xpath = "//a[@role='button' and @class='k-button k-button-icontext k-primary k-grid-update']")
	public WebElement TTAddActivitySavebtn;

	public WebElement getTTAddActivitySavebtn() {
		return TTAddActivitySavebtn;
	}
	

	@FindBy(xpath = "//input[@id='txtOwner']")
	public WebElement AddActivtyOwnerId;

	public WebElement getAddActivtyOwnerId() {
		return AddActivtyOwnerId;
	}
	
	@FindBy(xpath = "//a[@role='button' and @class='k-button k-button-icontext k-primary k-grid-update']")
	public WebElement AddActivtySavebtn;

	public WebElement getAddActivtySavebtn() {
		return AddActivtySavebtn;
	}
	

	@FindBy(xpath = "//button[@id='btnMessageOK']")
	public WebElement EditActivityOkbtn;

	public WebElement getEditActivityOkbtn() {
		return EditActivityOkbtn;
	}
	

	
	@FindBy(xpath = "//label[@id='transErrPlannedStartDate']")
	public WebElement AddActivtyPlandstrtdateError;

	public WebElement getAddActivtyPlandstrtdateError() {
		return AddActivtyPlandstrtdateError;
	}
	
	@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//table//tbody//tr[3]//td[3]")
	public WebElement DTTEditThirdrow;

	public WebElement getDTTEditThirdrow() {
		return DTTEditThirdrow;
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
	

	@FindBy(xpath = "//label[@id='transErrGeneral']")
	public WebElement Actualstrtdateinvaliderrmsgless;

	public WebElement getActualstrtdateinvaliderrmsgless() {
		return Actualstrtdateinvaliderrmsgless;
	}
	
	@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//tbody//tr[3]//td[5]")
	public WebElement ActivityUpdatedcolumn;

	public WebElement getActivityUpdatedcolumn() {
		return ActivityUpdatedcolumn;
	}
	
	@FindBy(xpath = "//label[@id='transErrGeneral']")
	public WebElement OwnerIdinvaliderrmsg;

	public WebElement getOwnerIdinvaliderrmsg() {
		return OwnerIdinvaliderrmsg;
	}

	
	
	
	@FindBy(xpath = "//label[@id='transErrTaskName']")
	public WebElement AddActivitytxtboxerror;

	public WebElement getAddActivitytxtboxerror() {
		return AddActivitytxtboxerror;
	}
	
	
	@FindBy(xpath = "//input[@id='txtActivity']")
	public WebElement AddActivitywthActvtytxtbox;

	public WebElement getAddActivitywthActvtytxtbox() {
		return AddActivitywthActvtytxtbox;
	}
	
	
	
	@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//table[@role='grid']//tbody//tr[14]//td[3]//a//span[@class='k-icon k-i-edit']")
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
	@FindBy(xpath = "//a[@role='button' and @class='k-button k-button-icontext k-primary k-grid-update']")
	public WebElement DTTAddActivitySavebtn;

	public WebElement getDTTAddActivitySavebtn() {
		return DTTAddActivitySavebtn;
	}
	
	@FindBy(xpath = "//button[@id='btnMessageOK']")
	public WebElement DTTAddActivitySaveOkbtn;

	public WebElement getDTTAddActivitySaveOkbtn() {
		return DTTAddActivitySaveOkbtn;
	}

	@FindBy(xpath = "//table[@role='grid']//tbody//tr[5]//td[7]")
	public WebElement DTTTrackerEditCheck;

	public WebElement getDTTTrackerEditCheck() {
		return DTTTrackerEditCheck;
	}
	
	@FindBy(xpath = "//a[@class='active']")
	public WebElement TTTactivetab;

	public WebElement getTTTactivetab() {
		return TTTactivetab;
	}
	
	@FindBy(xpath = "//button[@ng-click='addArtifacts()']")
	public WebElement AddArtifactsbtn;

	public WebElement getAddArtifactsbtn() {
		return AddArtifactsbtn;
	}
	
	
	@FindBy(xpath = "//table[@role='grid']//tbody//tr[2]//td[8]")
	public WebElement AddArtifactsdelete;

	public WebElement getAddArtifactsdelete() {
		return AddArtifactsdelete;
	}
	
	@FindBy(xpath = "//table[@role='grid']//tbody//tr[5]//td[1]")
	public WebElement DTPEditbtn;

	public WebElement getDTPEditbtn() {
		return DTPEditbtn;
	}
	
	@FindBy(xpath = "//input[@id='txtdtpName']")
	public WebElement DTPRunName;

	public WebElement getDTPRunName() {
		return DTPRunName;
	}
	
	@FindBy(xpath = "//a[@role='button' and @class='k-button k-button-icontext k-primary k-grid-update']")
	public WebElement TTTracAddTopicSavebtn;

	public WebElement getTTTracAddTopicSavebtn() {
		return TTTracAddTopicSavebtn;
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
	
	@FindAll(@FindBy(xpath = "//div[@class='k-grid-header-wrap k-auto-scrollable']//thead//tr//th"))
	java.util.List<WebElement> AddWavedetailsHeaderelts;

	public List<WebElement> getAddWavedetailsHeaderelts() {
		return AddWavedetailsHeaderelts;
	}
	
	@FindBy(xpath = "//i[@class='icon-KnowledgeTransferOnshore']//following::i[@class='acn-cross']")
	public WebElement AddWavedetailsCrossbtn;

	public WebElement getAddWavedetailsCrossbtn() {
		return AddWavedetailsCrossbtn;
	}
	
	@FindBy(xpath = "//ul[@class='nav nav-tabs tabs']//li//a[text()='DTT Assessments']")
	public WebElement DTTAssessmtstab;

	public WebElement getDTTAssessmtstab() {
		return DTTAssessmtstab;
	}

	
	@FindBy(xpath = "//button[@ng-click='AddResource()']")
	public WebElement DTTAssAddResbtn;

	public WebElement getDTTAssAddResbtn() {
		return DTTAssAddResbtn;
	}
	
	@FindBy(xpath ="//li//a[@ng-click='AssessmentExport()']//span[@class='transIcon-export']")
	public WebElement DTTExportButton;

	public WebElement getDTTExportButton() {
		return DTTExportButton;
	}
	
	@FindBy(xpath ="//li//a[@ng-click='AssessmentImport()']//span[@class='transIcon-import']")
	public WebElement DTTImportButton;

	public WebElement getDTTImportButton() {
		return DTTImportButton;
	}
	

	@FindBy(xpath = "//*[contains(text(),'Columns')]")
	public WebElement gridSettingsColumn;

	public WebElement getGridSettingsColumn() {
		return gridSettingsColumn;
	}

	@FindBy(xpath = "//*[@title='Column Settings']/span")
	public WebElement settingsIcon;

	public WebElement getSettingsIcon() {
		return settingsIcon;
	}
	
	@FindBy(xpath = "//span//input[@type='checkbox' and @data-field='Artifacts']")
	public WebElement AssessgridSettingFieldcheck;

	public WebElement getAssessgridSettingFieldcheck() {
		return AssessgridSettingFieldcheck;
	}
	
	@FindBy(xpath = "//div[@class='k-grid-content-locked']//table//tbody//tr[5]//td[1]")
	public WebElement DTTAssessEditbtn;

	public WebElement getDTTAssessEditbtn() {
		return DTTAssessEditbtn;
	}
	
	@FindBy(xpath = "//input[@data-bind='value: TrainingTopic']")
	public WebElement DTTAssessTrainTopic;

	public WebElement getDTTAssessTrainTopic() {
		return DTTAssessTrainTopic;
	}
	

	@FindBy(xpath = "//a[@role='button' and @class='k-button k-button-icontext k-primary k-grid-update']")
	public WebElement DTTAssessSavebtn;

	public WebElement getDTTAssessSavebtn() {
		return DTTAssessSavebtn;
	}
	
	@FindBy(xpath = "//table[@role='grid']//tbody//tr[5]//td[5]")
	public WebElement DTTAssessEditCheck;

	public WebElement getDTTAssessEditCheck() {
		return DTTAssessEditCheck;
	}
	
	@FindBy(xpath = "//p[@class='mandatory-text ng-scope']")
	public WebElement DTTAssessErrroMessage;

	public WebElement getDTTAssessErrroMessage() {
		return DTTAssessErrroMessage;
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
	
	@FindBy(xpath = "//input[@data-bind='value: TrainingTopic']")
	public WebElement TTTAssessTrainTopic;

	public WebElement getTTTAssessTrainTopic() {
		return TTTAssessTrainTopic;
	}
	
	
	@FindAll(@FindBy(xpath = "//div[@class='k-grid-header-wrap k-auto-scrollable']//thead//tr//th"))
	public java.util.List<WebElement> TTTTrackerHeader;

	public List<WebElement> getTTTTrackerHeader() {
		return TTTTrackerHeader;
	}
	
	
	@FindBy(xpath = "//button[@id='btnMessageOK']")
	public WebElement DTPAddrunbookSaveOkbtn;

	public WebElement getDTPAddrunbookSaveOkbtn() {
		return DTPAddrunbookSaveOkbtn;
	}
	
	@FindBy(xpath = "//table[@role='grid']//tbody//tr[5]//td[5]//span")
	public WebElement DTPEditCheck;

	public WebElement getDTPEditCheck() {
		return DTPEditCheck;
	}
	

	@FindBy(xpath = "//span//input[@type='checkbox' and @data-field='ProficiencyScore']")
	public WebElement gridSettingFieldProfScore;

	public WebElement gridSettingFieldProfScore() {
		return gridSettingFieldProfScore;
	}
	
	@FindAll(@FindBy(xpath = "//span[@class='k-icon k-i-filter']//ancestor::a//ancestor::th[text() or @data-title]"))
	java.util.List<WebElement> TTTAssessFilterlist;

	public List<WebElement> getTTTAssessFilterlist() {
		return TTTAssessFilterlist;
	}
	
	@FindBy(xpath = "//th[@data-title='Assessment Type *']//a//span")
	public WebElement DTTAsessTypeFilter;

	public WebElement getDTTAsessTypeFilter() {
		return DTTAsessTypeFilter;
	}
	
	@FindBy(xpath = "//input[@type='checkbox' and @value='Training - Gate 1']")
	public WebElement DTTAssesstypeProcessfilter;

	public WebElement getDTTAssesstypeProcessfilter() {
		return DTTAssesstypeProcessfilter;
	}
	

	@FindBy(xpath = "//li//input[@name='AssessmentType']//following::button[text()='Filter']")
	public WebElement DTTAssessFilterbutton;

	public WebElement getDTTAssessFilterbutton() {
		return DTTAssessFilterbutton;
	}
	
	
	@FindBy(xpath = "//a[text()='Trainee Name *']")
	public WebElement TraineeName;

	public WebElement getTraineeName() {
		return TraineeName;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Assessment Type ')]//following::span/span[1]")
	public WebElement DTTAssessmentType;

	public WebElement getDTTAssessmentType() {
		return DTTAssessmentType;
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
	
	@FindBy(xpath = "//label[@id='transErrAssessmentDt']")
	public WebElement DTTAssesmentDateError;

	public WebElement getDTTAssesmentDateError() {
		return DTTAssesmentDateError;
	}
	
	
	@FindBy(xpath = "//input[@k-ng-model='dataItem.AssessmentDate']")
	public WebElement DTTAssesmentDate;

	public WebElement getDTTAssesmentDate() {
		return DTTAssesmentDate;
	}
	
	
	@FindBy(xpath = "//ul[@class='nav nav-tabs tabs']//li//a[text()='APPROVALS']")
	public WebElement DTTApprovalsTab;

	public WebElement getDTTApprovalsTab() {
		return DTTApprovalsTab;
	}
	
	@FindBy(xpath = "//div[@class='row overall']//following::div[@class='col-sm-6 overall-progress']//h2[@class='ttt-title']")
	public WebElement DTTApprovalsHeader;

	public WebElement getDTTApprovalsHeader() {
		return DTTApprovalsHeader;
	}
	
	@FindBy(xpath = "//div[@class='row overall'][2]//following::div[@class='col-sm-6 overall-progress']//h2[@class='ttt-title']")
	public WebElement DTTApprovalsSecondHeader;

	public WebElement getDTTApprovalsSecondHeader() {
		return DTTApprovalsSecondHeader;
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
	
	@FindBy(xpath = "//*[@id='divpopupMessage']")
	public WebElement InvalidApprovernamepopup;

	public WebElement getInvalidApprovernamepopup() {
		return InvalidApprovernamepopup;
	}
	
	@FindBy(xpath = "//table[@role='grid']//tbody//tr[1]//td[2]")
	public WebElement TTTApproverRole;

	public WebElement getTTTApproverRole() {
		return TTTApproverRole;
	}
	
	@FindBy(xpath = "//button[@ng-click='SendApproval()']")
	public WebElement TTTSendApprovalbtn;

	public WebElement getTTTSendApprovalbtn() {
		return TTTSendApprovalbtn;
	}
	
	
	@FindAll(@FindBy(xpath = "//table[@role='grid']//thead//tr//th[text()]"))
	java.util.List<WebElement> DTTApprovalstabcols;

	public List<WebElement> getDTTApprovalstabcols() {
		return DTTApprovalstabcols;
	}
	
	
	@FindBy(xpath = "//ul//li//input[@name='AssessmentType']//ancestor::div//form[@aria-hidden='false']//input[@placeholder='Search']")
	public WebElement TTTAssessTypeSearchbutton;

	public WebElement getTTTAssessTypeSearchbutton() {
		return TTTAssessTypeSearchbutton;
	}
	
	
	@FindBy(xpath = "//span[@class='k-icon k-i-sort-desc-sm']")
	public WebElement DescSortbutton;

	public WebElement getDescSortbutton() {
		return DescSortbutton;
	}
	
	@FindBy(xpath = "//span[@class='k-icon k-i-sort-asc-sm']")
	public WebElement AscSortbutton;

	public WebElement getAscSortbutton() {
		return AscSortbutton;
	}
	
	
	
	@FindBys(@FindBy(xpath = "//div//form//div//input[1]//following::ul//li[@style='display: none;']//input[@name='AssessmentType']"))
	public List<WebElement> DTTTrainTypelistnotcontainingSearch;

	public List<WebElement> getDTTTrainTypelistnotcontainingSearch() {
		return DTTTrainTypelistnotcontainingSearch;
	}

	
	@FindAll(@FindBy(xpath = "//ul[@class='nav navbar-nav nav-icons pull-left tttTrackerStatus']//span[1]"))
	java.util.List<WebElement> TTTAssessmentstatus;

	public List<WebElement> getTTTAssessmentstatus() {
		return TTTAssessmentstatus;
	}
	
	@FindAll(@FindBy(xpath = "//div[@class='k-grid-header-wrap k-auto-scrollable']//table[@role='grid']//thead//tr//th[text() or @data-title]"))
	java.util.List<WebElement> DTTTrackeheaderList;

	public List<WebElement> getDTTTrackeheaderList() {
		return DTTTrackeheaderList;
	}
	
	@FindAll(@FindBy(xpath = "//table[@role='grid']//thead//tr//th[text() or @data-title]"))
	java.util.List<WebElement> DTPTrackeheaderList;

	public List<WebElement> getDTPTrackeheaderList() {
		return DTPTrackeheaderList;
	}
	
	

	
	@FindAll(@FindBy(xpath = "//span[@class='k-icon k-i-filter']//ancestor::th[text()]"))
	java.util.List<WebElement> DTTfieldswthFilter;

	public List<WebElement> getDTTfieldswthFilter() {
		return DTTfieldswthFilter;
	}
	
	@FindAll(@FindBy(xpath = "//div[@id='gridtask']//div[@class='k-grid-header-wrap k-auto-scrollable']//table[@role='grid']//thead//tr//th[text() or @data-title]"))
	java.util.List<WebElement> ActivityTableheaderlist;

	public List<WebElement> getActivityTableheaderlist() {
		return ActivityTableheaderlist;
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
	
	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr"))
	java.util.List<WebElement> AddArtifactstableElts;

	public List<WebElement> getAddArtifactstableElts() {
		return AddArtifactstableElts;
	}
	
	@FindAll(@FindBy(xpath = "//a[@class='k-button k-button-icontext k-grid-delete']"))
	java.util.List<WebElement> AddArtifactsDeletebtn;

	public List<WebElement> getAddArtifactsDeletebtn() {
		return AddArtifactsDeletebtn;
	}
	
	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr//td[text()]"))
	java.util.List<WebElement> AddArtifactsrowlets;

	public List<WebElement> getAddArtifactsrowlets() {
		return AddArtifactsrowlets;
	}
	
	@FindAll(@FindBy(xpath = "//span[@class='transIcon-cloud-download']"))
	java.util.List<WebElement> AddArtifactsdownloadbtn;

	public List<WebElement> getAddArtifactsdownloadbtn() {
		return AddArtifactsdownloadbtn;
	}

	
	@FindAll(@FindBy(xpath = "//div[@class='k-grid-header-wrap k-auto-scrollable']//table[@role='grid']//thead//tr//th[text() or @data-title]"))
	java.util.List<WebElement> DTTAssessheaderlist;

	public List<WebElement> getDTTAssessheaderlist() {
		return DTTAssessheaderlist;
	}
	
	@FindBys(@FindBy(xpath = "//div//form//div//input[1]//following::ul//li[@style='display: none;']//input[@name='AssessmentType']"))
	public List<WebElement> DTTAssTypelistnotcontainingSearch;

	public List<WebElement> getDTTAssTypelistnotcontainingSearch() {
		return DTTAssTypelistnotcontainingSearch;
	}
	
}
