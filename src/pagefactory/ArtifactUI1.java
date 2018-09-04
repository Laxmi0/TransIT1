
package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class ArtifactUI1 {


	@FindBy(xpath = "//a[@ng-click='openWorkStream()']")
	public WebElement SRTPageTitle;

	public WebElement getSRTPageTitle() {
		return SRTPageTitle;
	}
	@FindBy(xpath = "//tbody[@role='rowgroup']//td[3]/a/span")//tbody/tr/td[3]/a/span
	public WebElement SRTFirstDataEditButton;

	public WebElement getSRTFirstDataEditButton() {
		return SRTFirstDataEditButton;
	}
	@FindBy(xpath = "//*[@id='grid_activity']/table/tbody/tr[1]/td[15]/a")
	public WebElement WaveSRTLink;

	public WebElement getWaveSRTLink() {
		return WaveSRTLink;
	}

	@FindBy(xpath = "//div[@class='container-fluid internal-page-title']//h2/a")
	public WebElement SRTLandingPage;

	public WebElement getSRTLandingPage() {
		return SRTLandingPage;
	}
	@FindBy(xpath = "//label[text()='ACTUAL START DATE ']//parent::div/span/span/span/span")
	public WebElement SRTActualDatePicker;

	public WebElement getSRTActualDatePicker() {
		return SRTActualDatePicker;
	}
	@FindBy(xpath = "//label[text()='% COMPLETE']//parent::div/input")
	public WebElement PercentCompletefield;

	public WebElement getPercentCompletefield() {
		return PercentCompletefield;
	}
	@FindBy(xpath = "//a[text()='Save']")
	public WebElement PopSaveButton;

	public WebElement getPopSaveButton() {
		return PopSaveButton;
	}

	@FindBy(xpath = "//button[@id='btnMessageOK']")
	public WebElement PopupOKbutton;

	public WebElement getPopupOKbutton() {
		return PopupOKbutton;
	}
	@FindBy(xpath = "//div[@id='divpopupMessage']")
	public WebElement PopupMsg;

	public WebElement getPopupMsg() {
		return PopupMsg;
	}
	@FindBy(xpath = "//input[@id='txtActualStartDate']")
	public WebElement ActalStartInput;

	public WebElement getActalStartInput() {
		return ActalStartInput;
	}

	@FindBy(xpath = "//input[@id='txtOwner']")
	public WebElement OwnerInputField;

	public WebElement getOwnerInputField() {
		return OwnerInputField;
	}

	@FindBy(xpath = "//label[text()='Please enter the activity']")
	public WebElement ActivityErrorAlert;

	public WebElement getActivityErrorAlert() {
		return ActivityErrorAlert;
	}
	@FindBy(xpath = "//button[@id='activitySaveBtn']")
	public WebElement AddActivityButton;

	public WebElement getAddActivityButton() {
		return AddActivityButton;
	}

	@FindBy(xpath = "//label[text()='Please provide valid owner name']")
	public WebElement OwnerErrorAlert;

	public WebElement getOwnerErrorAlert() {
		return OwnerErrorAlert;
	}

	@FindBy(xpath = "//input[@id='txtActivity']")
	public WebElement ActivityInputField;

	public WebElement getActivityInputField() {
		return ActivityInputField;
	}

	@FindBy(xpath = "//input[@id='txtPlannedStartDate']")
	public WebElement PlannedStartDate;

	public WebElement getPlannedStartDate() {
		return PlannedStartDate;
	}
	@FindBy(xpath = "//input[@id='txtPlannedEndDate']")
	public WebElement PlannedEndDate;

	public WebElement getPlannedEndDate() {
		return PlannedEndDate;
	}

	@FindBy(xpath = "//span[@class='expand-grid-icon']")
	public WebElement ExpandButton;

	public WebElement getExpandButton() {
		return ExpandButton;
	}
	@FindBy(xpath = "//a[text()='ESCAPE ']/span")
	public WebElement Escapebutton;

	public WebElement getEscapebutton() {
		return Escapebutton;
	}
	@FindBy(xpath = "//div[@id='twesetup']/a/span")
	public WebElement Escapebutton2;

	public WebElement getEscapebutton2() {
		return Escapebutton2;
	}
	@FindBy(xpath = "//span[@class='acn-shrink']")
	public WebElement EscapebuttonTWEAccess;

	public WebElement getEscapebuttonTWEAccess() {
		return EscapebuttonTWEAccess;
	}
	@FindBy(xpath = "//label[@id='transErrGeneral']")
	public WebElement TransErrGeneral;

	public WebElement getTransErrGeneral() {
		return TransErrGeneral;
	}
	@FindBy(xpath = "//div[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg']")
	public WebElement PersentErrorText;

	public WebElement getPersentErrorText() {
		return PersentErrorText;
	}

	@FindBy(xpath = "//a[@id='approval']")
	public WebElement SRTApproval;

	public WebElement getSRTApproval() {
		return SRTApproval;
	}

	@FindBy(xpath = "//b[text()=' SRT Approval']")
	public WebElement SRTApprovalPageTitle;

	public WebElement getSRTApprovalPageTitle() {
		return SRTApprovalPageTitle;
	}
	@FindBy(xpath = "//button[text()='Send For Approval']")
	public WebElement SRTApprovalButton;

	public WebElement getSRTApprovalButton() {
		return SRTApprovalButton;
	}

	@FindBy(xpath = "//a[@id='coreteam']")
	public WebElement SRTAssessment;

	public WebElement getSRTAssessment() {
		return SRTAssessment;
	}

	@FindBy(xpath = "//li[@id='srtIOassessmentImport']/a")
	public WebElement SRTImportButton;

	public WebElement getSRTImportButton() {
		return SRTImportButton;
	}
	@FindBy(xpath = "//li[@id='srtIOassessmentImport']/a/span")
	public WebElement SRTImportButtonSymbole;

	public WebElement getSRTImportButtonSymbole() {
		return SRTImportButtonSymbole;
	}

	@FindBy(xpath = "//li[@id='srtassessmentExport']/a")
	public WebElement SRTExportButton;

	public WebElement getSRTExportButton() {
		return SRTExportButton;
	}
	@FindBy(xpath = "//li[@id='srtassessmentExport']/a/span")
	public WebElement SRTExportButtonSymbole;

	public WebElement getSRTExportButtonSymbole() {
		return SRTExportButtonSymbole;
	}
	@FindBy(xpath = "//h6")
	public WebElement SRTStaticData;

	public WebElement getSRTStaticData() {
		return SRTStaticData;
	}

	@FindBy(xpath = "//h3[text()='RAG Status']")
	public WebElement SRTRAGStatusText;

	public WebElement getSRTRAGStatusText() {
		return SRTRAGStatusText;
	}

	@FindBy(xpath = "//div[@class='wave-rag-status']")
	public WebElement SRTRAGStatusDropDown;

	public WebElement getSRTRAGStatusDropDown() {
		return SRTRAGStatusDropDown;
	}

	@FindBy(xpath = "//button[@id='activitySaveBtn']")
	public WebElement SRTADDProcessorNameButton;

	public WebElement getSRTADDProcessorNameButton() {
		return SRTADDProcessorNameButton;
	}
	@FindBy(xpath = "//button[@id='DocumentUploadBtn']")
	public WebElement SRTLinkArtiFactsButton;

	public WebElement getSRTLinkArtiFactsButton() {
		return SRTLinkArtiFactsButton;
	}

	@FindBy(xpath = "//a[text()='Checkpoints']")
	public WebElement Checkpoints;

	public WebElement getCheckpoints() {
		return Checkpoints;
	}

	@FindBy(xpath = "//li[@id='srattrackerImport']/a")
	public WebElement SRATImportButton;

	public WebElement getSRATImportButton() {
		return SRATImportButton;
	}
	@FindBy(xpath = "//li[@id='srattrackerImport']/a/span")
	public WebElement SRATImportButtonSymbole;

	public WebElement getSRATImportButtonSymbole() {
		return SRATImportButtonSymbole;
	}

	@FindBy(xpath = "//ul[@id='srattracker']/li[2]/a")
	public WebElement SRATExportButton;

	public WebElement getSRATExportButton() {
		return SRATExportButton;
	}
	@FindBy(xpath = "//ul[@id='srattracker']/li[2]/a/span")
	public WebElement SRATExportButtonSymbole;

	public WebElement getSRATExportButtonSymbole() {
		return SRATExportButtonSymbole;
	}
	@FindBy(xpath = "//span[@id='sratVersionLabel']")
	public WebElement SRATStaticData;

	public WebElement getSRATStaticData() {
		return SRATStaticData;
	}
	@FindBy(xpath = "//span[@id='sratVersionLabel']//parent::div//span[2]/span")
	public WebElement SRATStaticDataVersion;

	public WebElement getSRATStaticDataVersion() {
		return SRATStaticDataVersion;
	}

	@FindBy(xpath = "//span[@id='sratVersionLabel']//parent::div//label[1]")
	public WebElement SRATRAGStatusText;

	public WebElement getSRATRAGStatusText() {
		return SRATRAGStatusText;
	}

	@FindBy(xpath = "//span[@id='sratVersionLabel']//parent::div//span[@class='k-select']")
	public WebElement SRATRAGStatusDropDown;

	public WebElement getSRATRAGStatusDropDown() {
		return SRATRAGStatusDropDown;
	}

	@FindBy(xpath = "//button[text()='Add SRAT Checkpoint']")
	public WebElement ADDSRATCheckPointButton;

	public WebElement getADDSRATCheckPointButton() {
		return ADDSRATCheckPointButton;
	}
	@FindBy(xpath = "//button[text()='Add Question']")
	public WebElement ADDQuestionButton;

	public WebElement getADDQuestionButton() {
		return ADDQuestionButton;
	}

	@FindAll(@FindBy(xpath = "//div[@class='col-xs-12']/label"))
	public java.util.List<WebElement> SRATStaticDataStatus;

	public java.util.List<WebElement> getSRATStaticDataStatus() {
		return SRATStaticDataStatus;
	}
	@FindAll(@FindBy(xpath = "//div[@class='col-xs-12']/span"))
	public java.util.List<WebElement> SRATStaticDataStatusValue;

	public java.util.List<WebElement> getSRATStaticDataStatusValue() {
		return SRATStaticDataStatusValue;
	}
	@FindBy(xpath = "//label[text()='Checkpoint Applicable']//parent::div//span/span//span[2]")
	public WebElement CheckPointApplicableDropdown;

	public WebElement getCheckPointApplicableDropdown() {
		return CheckPointApplicableDropdown;
	}
	@FindAll(@FindBy(xpath = "//span[@class='k-picker-wrap k-state-disabled']//parent::span//parent::span//parent::div/label"))
	public java.util.List<WebElement> SRATDisableDates;

	public java.util.List<WebElement> getSRATDisableDates() {
		return SRATDisableDates;
	}
	@FindBy(xpath = "//th[@data-title='CATEGORY']")
	public WebElement Category;

	public WebElement getCategory() {
		return Category;
	}

	@FindBy(xpath = "//span[@class='transIcon-accordian_dropdown']")
	public WebElement CategoryExpandButton;

	public WebElement getCategoryExpandButton() {
		return CategoryExpandButton;
	}
	@FindBy(xpath = "//button[text()='SAVE']")
	public WebElement SaveButton;

	public WebElement getSaveButton() {
		return SaveButton;
	}

	@FindBy(xpath = "//*[@id='grid_activity']/table/tbody/tr[1]/td[12]/a")
	public WebElement WaveTTTLink;

	public WebElement getWaveTTTLink() {
		return WaveTTTLink;
	}
	@FindBy(xpath = "//div[@class='container-fluid internal-page-title']//h2/a")
	public WebElement InternalPageTitle;

	public WebElement getInternalPageTitle() {
		return InternalPageTitle;
	}
	@FindBy(xpath = "//div[@id='columnMenuButton']/a/span")
	public WebElement SRTGridSetting;

	public WebElement getSRTGridSetting() {
		return SRTGridSetting;
	}
	@FindAll(@FindBy(xpath = "//span[@class='k-icon k-i-arrow-60-right k-menu-expand-arrow']//parent::span//parent::li[@role='menuitem']/span/span[1]"))
	public java.util.List<WebElement> SRTGridSettingColumns;

	public java.util.List<WebElement> getSRTGridSettingColumns() {
		return SRTGridSettingColumns;
	}

	@FindBy(xpath = "//th[@data-title='Tasks Planned']/a")
	public WebElement SRTColumnsTasksPlanned;

	public WebElement getSRTColumnsTasksPlanned() {
		return SRTColumnsTasksPlanned;
	}

	@FindAll(@FindBy(xpath = "//thead//tr//th/a"))
	public java.util.List<WebElement> SRTColoumnsList;

	public java.util.List<WebElement> getSRTColoumnsList() {
		return SRTColoumnsList;
	}
	@FindBy(xpath = "//tbody/tr[1]/td[1]/a/span")
	public WebElement SRTExpandColummnEditButton;

	public WebElement getSRTExpandColummnEditButton() {
		return SRTExpandColummnEditButton;
	}

	@FindBy(xpath = "//tbody/tr/td/a/span")
	public WebElement SRTEditButton;

	public WebElement getSRTEditButton() {
		return SRTEditButton;
	}

	@FindBy(xpath = "//input[@id='ScenarioEndDateId']")
	public WebElement SRTScenarioEndDateID;

	public WebElement getSRTScenarioEndDateID() {
		return SRTScenarioEndDateID;
	}
	@FindBy(xpath = "//a[text()='BPO: SRT Assessment']")
	public WebElement BPOSRTAssessment;

	public WebElement getBPOSRTAssessment() {
		return BPOSRTAssessment;
	}
	@FindAll(@FindBy(xpath = "//span[@class='k-icon k-i-filter']//parent::a//parent::th//span"))
	public java.util.List<WebElement> SRTTrackerFilter;

	public java.util.List<WebElement> getSRTTrackerFilter() {
		return SRTTrackerFilter;
	}
	@FindBy(xpath = "//th[@data-title='SRT Location *']/a/span")
	public WebElement SRTLocationFilter;

	public WebElement getSRTLocationFilter() {
		return SRTLocationFilter;
	}

	@FindBy(xpath = "//li[@class='k-item']/label/span")
	public WebElement SRTLocationFirstFilter;

	public WebElement getSRTLocationFirstFilter() {
		return SRTLocationFirstFilter;
	}

	@FindBy(xpath = "//button[text()='Filter']")
	public WebElement SRTLocationFilterButton;

	public WebElement getSRTLocationFilterButton() {
		return SRTLocationFilterButton;
	}
	@FindAll(@FindBy(xpath = "//tbody[@role='rowgroup']/tr/td[6]/span"))
	public java.util.List<WebElement> SRTTrackerLocationNames;

	public java.util.List<WebElement> getSRTTrackerLocationNames() {
		return SRTTrackerLocationNames;
	}

	@FindAll(@FindBy(xpath = "//thead//th"))
	public java.util.List<WebElement> SRTTrackerColoumnsList;

	public java.util.List<WebElement> getSRTTrackerColoumnsList() {
		return SRTTrackerColoumnsList;
	}
	@FindAll(@FindBy(xpath = "//span[@class='label-text']"))
	public java.util.List<WebElement> SRTAssessmentStatisData;

	public java.util.List<WebElement> getSRTAssessmentStatisData() {
		return SRTAssessmentStatisData;
	}

	@FindBy(xpath = "//a[text()='Activity*']")
	public WebElement SRTActivityColoumn;

	public WebElement getSRTActivityColoumn() {
		return SRTActivityColoumn;
	}
	@FindBy(xpath = "//a[text()='PLANNED START DATE*']")
	public WebElement SRTPlannedStartDateColounm;

	public WebElement getSRTPlannedStartDateColounm() {
		return SRTPlannedStartDateColounm;
	}
	@FindBy(xpath = "//a[text()='ACTUAL START DATE']")
	public WebElement SRTActualStartDateDoloumn;

	public WebElement getSRTActualStartDateDoloumn() {
		return SRTActualStartDateDoloumn;
	}
	@FindBy(xpath = "//a[text()='PLANNED END DATE*']")
	public WebElement SRTPlannedENDDateColounm;

	public WebElement getSRTPlannedENDDateColounm() {
		return SRTPlannedENDDateColounm;
	}

	@FindBy(xpath = "//a[text()='ACTUAL END DATE']")
	public WebElement SRTActualENDDateColounm;

	public WebElement getSRTActualENDDateColounm() {
		return SRTActualENDDateColounm;
	}
	@FindBy(xpath = "//span[@class='k-icon k-i-edit']")
	public WebElement SRTAssessmentEDITbutton;

	public WebElement getSRTAssessmentEDITbutton() {
		return SRTAssessmentEDITbutton;
	}
	@FindAll(@FindBy(xpath = "//span[@class='k-icon k-i-edit']"))
	public java.util.List<WebElement> SRTAssessmentAllEDITbutton;

	public java.util.List<WebElement> getSRTAssessmentAllEDITbutton() {
		return SRTAssessmentAllEDITbutton;
	}

	@FindBy(xpath = "//h1[text()='Edit Activity']")
	public WebElement SRTAssessmentEditactivityPopup;

	public WebElement getSRTAssessmentEditactivityPopup() {
		return SRTAssessmentEditactivityPopup;
	}
	@FindBy(xpath = "//h1[text()='Add Activity']")
	public WebElement SRTAssessmentADDActivityPopup;

	public WebElement getSRTAssessmentADDActivityPopup() {
		return SRTAssessmentADDActivityPopup;
	}
	@FindBy(xpath = "//button[@id='activitySaveBtn']")
	public WebElement SRTAssessmentADDButton;

	public WebElement getSRTAssessmentADDButton() {
		return SRTAssessmentADDButton;
	}
	@FindBy(xpath = "//button[text()='Add Artifacts']")
	public WebElement ADDArtifacts;

	public WebElement getADDArtifacts() {
		return ADDArtifacts;
	}

	@FindBy(xpath = "//h1[text()='Add SRT Execution']")
	public WebElement ADDArtifactsPopUpTitle;

	public WebElement getADDArtifactsPopUpTitle() {
		return ADDArtifactsPopUpTitle;
	}

	@FindBy(xpath = "//p[text()='All Fields are Mandatory']")
	public WebElement ADDArtifactsPopUpSubTitle;

	public WebElement getADDArtifactsPopUpSubTitle() {
		return ADDArtifactsPopUpSubTitle;
	}
	@FindBy(xpath = "//a[@role='button']/span[@class='k-icon k-i-close']")
	public WebElement ADDArtifactsPopUpclosebutton;

	public WebElement getADDArtifactsPopUpclosebutton() {
		return ADDArtifactsPopUpclosebutton;
	}
	@FindBy(xpath = "//input[@id='txtSharePointLoaction']")
	public WebElement ADDArtifactsPopUpSharePointinput;

	public WebElement getADDArtifactsPopUpSharePointinput() {
		return ADDArtifactsPopUpSharePointinput;
	}
	@FindBy(xpath = "//input[@id='txtFileName']")
	public WebElement ADDArtifactsPopUpFileinput;

	public WebElement getADDArtifactsPopUpFileinput() {
		return ADDArtifactsPopUpFileinput;

	}	
	@FindBy(xpath = "//a[text()='Save']")
	public WebElement ADDArtifactsPopUpSavebutton;

	public WebElement getADDArtifactsPopUpSavebutton() {
		return ADDArtifactsPopUpSavebutton;

	}

	@FindBy(xpath = "//th[@data-title='FILE NAME *']/a/span")
	public WebElement ADDArtifactsFileNameFilterButton;

	public WebElement getADDArtifactsFileNameFilterButton() {
		return ADDArtifactsFileNameFilterButton;

	}
	@FindBy(xpath = "//th[@data-title='FILE CATEGORY *']/a/span")
	public WebElement ADDArtifactsFileCateFilterButton;

	public WebElement getADDArtifactsFileCateFilterButton() {
		return ADDArtifactsFileCateFilterButton;	
	}

	@FindBy(xpath = "//a[text()='FILE NAME *']//parent::a/span")
	public WebElement ADDArtifactsFileNameSortButton;

	public WebElement getADDArtifactsFileNameSortButton() {
		return ADDArtifactsFileNameSortButton;	
	}
	@FindBy(xpath = "//a[text()='FILE CATEGORY *']//parent::a")
	public WebElement ADDArtifactsFileCateSortButton;

	public WebElement getADDArtifactsFileCateSortButton() {
		return ADDArtifactsFileCateSortButton;	
	}


	@FindBy(xpath = "//tbody//tr/td[4]")
	public WebElement ADDArtifactsFileNametableDatalist;

	public WebElement getADDArtifactsFileNametableDatalist() {
		return ADDArtifactsFileNametableDatalist;	
	}
	@FindAll(@FindBy(xpath = "//tbody//tr/td[4]"))
	public java.util.List<WebElement> ADDArtifactsFileNametableDataAlllist;

	public java.util.List<WebElement> getADDArtifactsFileNametableDataAlllist() {
		return ADDArtifactsFileNametableDataAlllist;	
	}


	@FindBy(xpath = "//a[@title='Delete']/span")
	public WebElement ADDArtifactsDeleteButton;

	public WebElement getADDArtifactsDeleteButton() {
		return ADDArtifactsDeleteButton;	
	}
	@FindBy(xpath = "//input[@type='checkbox'][@name='displayName']")
	public WebElement ADDArtifactsFirstFileNameFilter;

	public WebElement getADDArtifactsFirstFileNameFilter() {
		return ADDArtifactsFirstFileNameFilter;	
	}
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement FilterButton;

	public WebElement getFilterButton() {
		return FilterButton;	
	}


	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement FilterInputBox;

	public WebElement getFilterInputBox() {
		return FilterInputBox;	
	}

	@FindAll(@FindBy(xpath = "//span[@class='transIcon-cloud-download']"))
	public java.util.List<WebElement> FileNameDownloadcloudIcon;

	public java.util.List<WebElement> getFileNameDownloadcloudIcon() {
		return FileNameDownloadcloudIcon;	
	}

	@FindAll(@FindBy(xpath = "//li[@style='']//span"))
	public java.util.List<WebElement> AddArtifactFilterOptionList;

	public java.util.List<WebElement> getAddArtifactFilterOptionList() {
		return AddArtifactFilterOptionList;	
	}
	@FindBy(xpath = "//button[@type='reset']")
	public WebElement ClearPopupButton;

	public WebElement getClearPopupButton() {
		return ClearPopupButton;	
	}

	@FindAll(@FindBy(xpath = "//thead/tr/th"))
	public java.util.List<WebElement> AddArtifactApprovalColoumName;

	public java.util.List<WebElement> getAddArtifactApprovalColoumName() {
		return AddArtifactApprovalColoumName;	
	}

	@FindBy(xpath = "//button[text()='Send For Approval']")
	public WebElement SendForApproval;

	public WebElement getSendForApproval() {
		return SendForApproval;	
	}

	@FindBy(xpath = "//a[text()='SRT Scenario/ Activity *']")
	public WebElement SRTAssementActivitySortButton;

	public WebElement getSRTAssementActivitySortButton() {
		return SRTAssementActivitySortButton;	
	}
	@FindBy(xpath = "//a[text()='Processor Name *']")
	public WebElement ProcessorName;

	public WebElement getProcessorName() {
		return ProcessorName;	
	}
	
	
	@FindBy(xpath = "//li[@id='srtassessmentImport']/a")
	public WebElement SRTAssImportButton;

	public WebElement getSRTAssImportButton() {
		return SRTAssImportButton;
	}

	@FindBy(xpath = "//li[@id='srtassessmentImport']/a/span")
	public WebElement SRTAssImportButtonSymbole;

	public WebElement getSRTAssImportButtonSymbole() {
		return SRTAssImportButtonSymbole;
	}

	
	
	@FindBy(xpath = "//li[@id='srtassessmentExport']")
	public WebElement SRTAssExportButton;

	public WebElement getSRTAssExportButton() {
		return SRTAssExportButton;
	}
	
	@FindBy(xpath = "//li[@id='srtassessmentExport']/a")
	public WebElement SRTAssExportButtonSymbole;

	public WebElement getSRTAssExportButtonSymbole() {
		return SRTAssExportButtonSymbole;
	}
	
	
	
	@FindBy(xpath = "//tbody//tr/td[8]/span")
	public WebElement ADDArtifactsFileNametableDatalist1;

	public WebElement getADDArtifactsFileNametableDatalist1() {
		return ADDArtifactsFileNametableDatalist1;	
	}

	
	
	@FindBy(xpath = "//h1[text()='Edit SRT Execution']")
	public WebElement ADDArtifactsPopUpTitle1;

	public WebElement getADDArtifactsPopUpTitle1() {
		return ADDArtifactsPopUpTitle1;
	}

	@FindBy(xpath = "//span[text()='Tasks Planned']/input")
	public WebElement SRTColumnsTasksPlanned1;

	public WebElement getSRTColumnsTasksPlanned1() {
		return SRTColumnsTasksPlanned1;
	}

	
	@FindAll(@FindBy(xpath = "//thead//tr//th"))
	public java.util.List<WebElement> SRTColoumnsList1;

	public java.util.List<WebElement> getSRTColoumnsList1() {
		return SRTColoumnsList1;
	}

	
	@FindBy(xpath = "//th[@data-field='SRTLocation']//span[@class='k-icon k-i-filter']")
	public WebElement BPOSRTAssessmentSRTLocationFilter;

	public WebElement getBPOSRTAssessmentSRTLocationFilter() {
		return BPOSRTAssessmentSRTLocationFilter;
	}

	
	
	@FindBy(xpath = "//button[text()='Save As Draft']")
	public WebElement SaveDraftButton;

	public WebElement getSaveDraftButton() {
		return SaveDraftButton;
	}

	

	@FindBy(xpath = "//a[text()='TWE TRACKER']")
	public WebElement TWETracker;

	public WebElement getTWETracker() {
		return TWETracker;	
	}
	@FindBy(xpath = "//a[text()='TWE Tracker']")
	public WebElement TWETrackerFromMenu;

	public WebElement getTWETrackerFromMenu() {
		return TWETrackerFromMenu;	
	}
	@FindBy(xpath = "//li[@id='tweImport']/a")
	public WebElement TWEImportButton;

	public WebElement getTWEImportButton() {
		return TWEImportButton;
	}
	@FindBy(xpath = "//li[@id='tweImport']/a/span")
	public WebElement TWEImportButtonSymbole;

	public WebElement getTWEImportButtonSymbole() {
		return TWEImportButtonSymbole;
	}

	@FindBy(xpath = "//span[@class='transIcon-export']//parent::a")
	public WebElement TWEExportButton;

	public WebElement getTWEExportButton() {
		return TWEExportButton;
	}
	@FindBy(xpath = "//span[@class='transIcon-export']")
	public WebElement TWEExportButtonSymbole;

	public WebElement getTWEExportButtonSymbole() {
		return TWEExportButtonSymbole;
	}

	@FindBy(xpath = "//a[text()='TWE ACCESS TRACKER']")
	public WebElement TWEAccessTracker;

	public WebElement getTWEAccessTracker() {
		return TWEAccessTracker;
	}
	@FindBy(xpath = "//a[text()='TWE Access Tracker']")
	public WebElement TWEAccessTrackerFromExecutionMenu;

	public WebElement getTWEAccessTrackerFromExecutionMenu() {
		return TWEAccessTrackerFromExecutionMenu;
	}

	@FindBy(xpath = "//li[@id='tweAccessImport']/a")
	public WebElement TWEAccessImportButton;

	public WebElement getAccessTWEImportButton() {
		return TWEAccessImportButton;
	}
	@FindBy(xpath = "//li[@id='tweAccessImport']/a/span")
	public WebElement TWEAccessImportButtonSymbole;

	public WebElement getAccessTWEImportButtonSymbole() {
		return TWEAccessImportButtonSymbole;
	}

	@FindBy(xpath = "//li[@id='tweAccessImport']//parent::ul/li[2]/a")
	public WebElement TWEAccessExportButton;

	public WebElement getAccessTWEExportButton() {
		return TWEAccessExportButton;
	}
	@FindBy(xpath = "//li[@id='tweAccessImport']//parent::ul/li[2]/a/span")
	public WebElement TWEAccessExportButtonSymbole;

	public WebElement getAccessTWEExportButtonSymbole() {
		return TWEAccessExportButtonSymbole;
	}


	@FindAll(@FindBy(xpath = "//tbody[@role='rowgroup']/tr/td[7]"))
	public java.util.List<WebElement> TWEAccessDateRequiredData;

	public java.util.List<WebElement> getTWEAccessDateRequiredData() {
		return TWEAccessDateRequiredData;	
	}

	@FindAll(@FindBy(xpath = "//tbody[@role='rowgroup']/tr/td[10]"))
	public java.util.List<WebElement> TWEAccessReceivingLocationData;

	public java.util.List<WebElement> getTWEAccessReceivingLocationData() {
		return TWEAccessReceivingLocationData;	
	}
	@FindBy(xpath = "//div[@id='divpopupMessageCtl'][@aria-hidden='false']//div[@id='divpopupMessage']")
	public WebElement TWEAccessTrackerDataPopup;

	public WebElement getTWEAccessTrackerDataPopup() {
		return TWEAccessTrackerDataPopup;
	}

	@FindBy(xpath = "//a[text()='SERVICE DELIVERY WAVE STAFFING TRACKER']")
	public WebElement ServiceDeliveryWaveTracker;

	public WebElement getServiceDeliveryWaveTracker() {
		return ServiceDeliveryWaveTracker;
	}
	@FindBy(xpath = "//div[text()='No data available']")
	public WebElement ServiceDeliveryWaveTrackerDataTable;

	public WebElement getServiceDeliveryWaveTrackerDataTable() {
		return ServiceDeliveryWaveTrackerDataTable;
	}
	@FindBy(xpath = "//a[text()='SDO Staffing']")
	public WebElement SDOStaffing;

	public WebElement getSDOStaffing() {
		return SDOStaffing;
	}
	@FindBy(xpath = "//th[text()='ONBOARDING STATUS']")
	public WebElement OnBoardingStatus ;

	public WebElement getOnBoardingStatus() {
		return OnBoardingStatus;
	}

	@FindBy(xpath = "//th[text()='ONBOARDING STATUS']/a/span")
	public WebElement OnBoardingStatusFilter ;

	public WebElement getOnBoardingStatusFilter() {
		return OnBoardingStatusFilter;
	}
	@FindBy(xpath = "//input[@type='checkbox']//parent::label/span[text()='On Board']")
	public WebElement OnBoardCheckBox;

	public WebElement getOnBoardCheckBox() {
		return OnBoardCheckBox;
	}
	@FindBy(xpath = "//input[@type='checkbox']//parent::label/span[text()='Attrited']")
	public WebElement ATTRITEDCheckBox;

	public WebElement getATTRITEDCheckBox() {
		return ATTRITEDCheckBox;
	}

	@FindBy(xpath = "//th[text()='CANDIDATE STATUS (*)']")
	public WebElement CondidateStatus ;

	public WebElement getCondidateStatus() {
		return CondidateStatus;
	}
	@FindAll(@FindBy(xpath = "//span[@ng-bind='dataItem.OnboardingStatus']"))
	public java.util.List<WebElement> OnBoardingStatusAllListData ;

	public java.util.List<WebElement> getOnBoardingStatusAllListData() {
		return OnBoardingStatusAllListData;
	}

	@FindAll(@FindBy(xpath = "//span[@ng-bind='dataItem.EnterpriseId']"))
	public java.util.List<WebElement> SDOEnterpriseIDforOnboard ;

	public java.util.List<WebElement> getSDOEnterpriseIDforOnboard() {
		return SDOEnterpriseIDforOnboard;
	}

	@FindBy(xpath = "//table//tbody//tr//td[21]")
	public WebElement CondidateStatusValue ;

	public WebElement getCondidateStatusValue() {
		return CondidateStatusValue;
	}
	@FindBy(xpath = "//button[text()='Filter']")
	public WebElement OnBoardFilterButton ;

	public WebElement getOnBoardFilterButton() {
		return OnBoardFilterButton;
	}
	@FindAll(@FindBy(xpath = "//span[@ng-bind='dataItem.ActualLevel']"))
	public java.util.List<WebElement> ActualLevelDatalist ;

	public java.util.List<WebElement> getActualLevelDatalist() {
		return ActualLevelDatalist;
	}
	@FindBy(xpath = "//a[@title='Go to the next page']")
	public WebElement NextButton ;

	public WebElement getNextButton() {
		return NextButton;
	}
	@FindAll(@FindBy(xpath = "//ul[@class='k-pager-numbers k-reset']//li"))
	public java.util.List<WebElement> TotalPage ;

	public java.util.List<WebElement> getTotalPage() {
		return TotalPage;
	}

	@FindBy(xpath = "//label[text()='Onboarding Status']")
	public WebElement OnBoardTextinPopUp ;

	public WebElement getOnBoardTextinPopUp() {
		return OnBoardTextinPopUp;
	}
	@FindBy(xpath = "//label[text()='Onboarding Status']//parent::div//span/span/span/span")
	public WebElement OnBoardTextinPopUpFields ;

	public WebElement getOnBoardTextinPopUpFields() {
		return OnBoardTextinPopUpFields;
	}
	@FindAll(@FindBy(xpath = "//select[@k-ng-model='dataItem.OnboardingStatus']"))
	public java.util.List<WebElement> OnBoardTextinPopUpDropDownList ;

	public java.util.List<WebElement> getOnBoardTextinPopUpDropDownList() {
		return OnBoardTextinPopUpDropDownList;
	}
	@FindAll(@FindBy(xpath = "//tbody[@role='rowgroup']/tr/td[3]/span"))
	public java.util.List<WebElement> CatagoryColoumnList ;

	public java.util.List<WebElement> getCatagoryColoumnList() {
		return CatagoryColoumnList;
	}
	@FindAll(@FindBy(xpath = "//tbody[@role='rowgroup']/tr/td[6]/span"))
	public java.util.List<WebElement> RequiredColoumnList ;

	public java.util.List<WebElement> getRequiredColoumnList() {
		return RequiredColoumnList;
	}

	@FindAll(@FindBy(xpath = "//tbody[@role='rowgroup']/tr/td[5]/span"))
	public java.util.List<WebElement> ItemDescriptionColoumnList ;

	public java.util.List<WebElement> getItemDescriptionColoumnList() {
		return ItemDescriptionColoumnList;
	}
	@FindBy(xpath = "//button[@id='tweAddBtn']")
	public WebElement AddItemButton ;

	public WebElement getAddItemButton() {
		return AddItemButton;
	}
	@FindBy(xpath = "//label[text()='Category *']//parent::div/span/span//span[2]/span")
	public WebElement CategoryDropDown ;

	public WebElement getCategoryDropDown() {
		return CategoryDropDown;
	}
	@FindAll(@FindBy(xpath = "//select[@id='CategoryNm']//option"))
	public java.util.List<WebElement> CategoryDropDownList ;

	public java.util.List<WebElement> getCategoryDropDownList() {
		return CategoryDropDownList;
	}
	@FindBy(xpath = "//option[@value='Device Access']")
	public WebElement CategoryDeviceAccess ;

	public WebElement getCategoryDeviceAccess() {
		return CategoryDeviceAccess;
	}
	@FindBy(xpath = "//label[text()='Type *']//parent::div/span/span//span[2]/span")
	public WebElement TypeDropDown ;

	public WebElement getTypeDropDown() {
		return TypeDropDown;
	}
	@FindAll(@FindBy(xpath = "//select[@id='Type']//option"))
	public java.util.List<WebElement> TypeDropDownList ;

	public java.util.List<WebElement> getTypeDropDownList() {
		return TypeDropDownList;
	}
	@FindBy(xpath = "//input[@id='txtItem']")
	public WebElement ItemTextInput ;

	public WebElement getItemTextInput() {
		return ItemTextInput;
	}//label[text()='No of seats/Quantity']//parent::div/span/span/input



	@FindBy(xpath = "//input[@id='dateReq']")
	public WebElement DateReqTextInput ;

	public WebElement getDateReqTextInput() {
		return DateReqTextInput;
	}
	@FindBy(xpath = "//label[text()='No of seats/Quantity']//parent::div//input")
	public WebElement NoOfSeatTextInput ;

	public WebElement getNoOfSeatTextInput() {
		return NoOfSeatTextInput;
	}
	@FindBy(xpath = "//label[text()='Receiving Location (*)']//parent::div/span//span[2]/span")
	public WebElement ReceivingLocationDropDown ;

	public WebElement getReceivingLocationDropDown() {
		return ReceivingLocationDropDown;
	}
	@FindAll(@FindBy(xpath = "//label[text()='Receiving Location (*)']//parent::div/span//select"))
	public java.util.List<WebElement> ReceivingLocationDropDownList ;

	public java.util.List<WebElement> getReceivingLocationDropDownList() {
		return ReceivingLocationDropDownList;
	}

	@FindAll(@FindBy(xpath = "//thead/tr/th"))
	public java.util.List<WebElement> TWEAccessColoumnsList ;

	public java.util.List<WebElement> getTWEAccessColoumnsList() {
		return TWEAccessColoumnsList;
	}
	@FindBy(xpath = "//label[text()='Required']//parent::div/span//span[2]/span")
	public WebElement RequiredDropDown ;

	public WebElement getRequiredDropDown() {
		return RequiredDropDown;
	}
	@FindAll(@FindBy(xpath = "//select[@id='required']"))
	public java.util.List<WebElement> RequiredDropDownList ;

	public java.util.List<WebElement> getRequiredDropDownList() {
		return RequiredDropDownList;
	}
	@FindBy(xpath = "//th[text()='Resource Name']")
	public WebElement ResourceNameColoumn ;

	public WebElement getResourceNameColoumn() {
		return ResourceNameColoumn;
	}
	@FindBy(xpath = "//input[@id='Resourcename'][@disabled='disabled']")
	public WebElement ResourceNameInputDisbaled ;

	public WebElement getResourceNameInputDisbaled() {
		return ResourceNameInputDisbaled;
	}
	@FindAll(@FindBy(xpath = "//span[@ng-bind='dataItem.Type']"))
	public java.util.List<WebElement> TypeList ;

	public java.util.List<WebElement> getTypeList() {
		return TypeList;
	}
	@FindBy(xpath = "//a[@ng-click='TweExport()']")
	public WebElement TWETrackerExportButton ;

	public WebElement getTWETrackerExportButton() {
		return TWETrackerExportButton;
	}
	@FindBy(xpath = "//a[@ng-click='TweImport()']")
	public WebElement TWETrackerImport ;

	public WebElement getTWETrackerImport() {
		return TWETrackerImport;
	}
	@FindBy(xpath = "//button[@id='uploadbtnIssue']")
	public WebElement ImportPopButton ;

	public WebElement getImportPopButton() {
		return ImportPopButton;
	}

	@FindBy(xpath = "//strong[text()='Done']")
	public WebElement UploadedDone ;

	public WebElement getUploadedDone() {
		return UploadedDone;
	}

	@FindAll(@FindBy(xpath = "//thead[@role='rowgroup']//tr/th"))
	public java.util.List<WebElement> TWEAccessTrackerColoumnsList;

	public java.util.List<WebElement> getTWEAccessTrackerColoumnsList() {
		return TWEAccessTrackerColoumnsList;
	}
	@FindBy(xpath = "//input[@id='clientdomain']")
	public WebElement ClientDomainTextField ;

	public WebElement getClientDomainTextField() {
		return ClientDomainTextField;
	}
	@FindBy(xpath = "//input[@id='clientdomain'][@maxlength='20']")
	public WebElement ClientDomainTextFieldLimitCheck;

	public WebElement getClientDomainTextFieldLimitCheck() {
		return ClientDomainTextFieldLimitCheck;
	}	

	@FindBy(xpath = "//input[@id='clientemail'][@maxlength='40']")
	public WebElement ClientEmailIDTextField ;

	public WebElement getClientEmailIDTextField() {
		return ClientEmailIDTextField;
	}

	@FindBy(xpath = "//span[@ng-bind='dataItem.ClientDomainId']")
	public WebElement ResourceNameFirstName ;

	public WebElement getResourceNameFirstName() {
		return ResourceNameFirstName;
	}
	@FindBy(xpath = "//input[@id='tweStDT']")
	public WebElement TWEStartDatePlan ;

	public WebElement getTWEStartDatePlan() {
		return TWEStartDatePlan;
	}
	@FindBy(xpath = "//input[@id='tweEndDt']")
	public WebElement TWEEndDatePlan ;

	public WebElement getTWEEndDatePlan() {
		return TWEEndDatePlan;
	}
	@FindBy(xpath = "//input[@id='tweStDT']//parent::span/span/span")
	public WebElement TWEStartDatePlanDatePicker ;

	public WebElement getTWEStartDatePlanDatePicker() {
		return TWEStartDatePlanDatePicker;
	}
	@FindBy(xpath = "//input[@id='tweEndDt']//parent::span/span/span")
	public WebElement TWEEndDatePlanDatePicker;

	public WebElement getTWEEndDatePlanDatePicker() {
		return TWEEndDatePlanDatePicker;
	}
	@FindBy(xpath = "//h6")
	public WebElement TWEAccessTrackerDateHeading;

	public WebElement getTWEAccessTrackerDateHeading() {
		return TWEAccessTrackerDateHeading;
	}

	@FindBy(xpath = "//span[@ng-if='selectedWave.length<=20']")
	public WebElement TWETackerWaveName;

	public WebElement getTWETackerWaveName() {
		return TWETackerWaveName;
	}
	@FindBy(xpath = "//span[@class='dropdown-icon transIcon-dropdown']")
	public WebElement TWETackerWaveNameDropDown;

	public WebElement getTWETackerWaveNameDropDown() {
		return TWETackerWaveNameDropDown;
	}
	@FindBy(xpath = "//a[@ng-click='openWorkStream()']")
	public WebElement TWETackerModuleHeading;

	public WebElement getTWETackerModuleHeading() {
		return TWETackerModuleHeading;
	}
	@FindBy(xpath = "//a[@ng-click='openWorkStream()']//parent::a/span")
	public WebElement TWETackerModuleHeadingDropDown;

	public WebElement getTWETackerModuleHeadingDropDown() {
		return TWETackerModuleHeadingDropDown;
	}
	@FindBy(xpath = "//button[@id='overRideSave']")
	public WebElement TWESaveRAGButton;

	public WebElement getTWESaveRAGButton() {
		return TWESaveRAGButton;
	}
	@FindBy(xpath = "//a[@title='Bookmark Tech & Work Environment']//span[@class='transIcon-bookmarked']")
	public WebElement TWETackerBookmark;

	public WebElement getTWETackerBookmark() {
		return TWETackerBookmark;
	}
	@FindBy(xpath = "//a[@title='Column Settings']/span")
	public WebElement TWETackerGridSetting;

	public WebElement getTWETackerGridSetting() {
		return TWETackerGridSetting;
	}
	@FindBy(xpath = "//span[text()='Columns']//span[2]")
	public WebElement TWETackerGridSettingColoum;

	public WebElement getTWETackerGridSettingColoum() {
		return TWETackerGridSettingColoum;
	}
	@FindBy(xpath = "//span[text()='No of seats/Quantity']/input")
	public WebElement TWETackerGridSettingColoumFirstData1;

	public WebElement getTWETackerGridSettingColoumFirstData1() {
		return TWETackerGridSettingColoumFirstData1;
	}
	@FindBy(xpath = "//span[text()='No of seats/Quantity']/input")
	public WebElement TWETackerGridSettingColoumFirstData;

	public WebElement getTWETackerGridSettingColoumFirstData() {
		return TWETackerGridSettingColoumFirstData;
	}
	@FindBy(xpath = "//a[text()='Item/Description *']")
	public WebElement TWETrackerSort;

	public WebElement getTWETrackerSort() {
		return TWETrackerSort;
	}

	@FindBy(xpath = "//th[@data-title='Category *']//span")
	public WebElement TWECategoryFilter;

	public WebElement getTWECategoryFilter() {
		return TWECategoryFilter;
	}

	@FindBy(xpath = "//th[@data-title='Type *']//span")
	public WebElement TWETypeFilter;

	public WebElement getTWETypeFilter() {
		return TWETypeFilter;
	}

	@FindBy(xpath = "//label[@class='k-label']//span")
	public WebElement TWECateFirstDataFilter;

	public WebElement getTWECateFirstDataFilter() {
		return TWECateFirstDataFilter;
	}
	@FindAll(@FindBy(xpath = "//span[@ng-bind='dataItem.CategoryNm']"))
	public java.util.List<WebElement> TWECategoryDataList;

	public java.util.List<WebElement> getTWECategoryDataList() {
		return TWECategoryDataList;
	}

	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement TWECategoryfilterSearchBox;

	public WebElement getTWECategoryfilterSearchBox() {
		return TWECategoryfilterSearchBox;
	}

	@FindAll(@FindBy(xpath = "//span[@ng-bind='dataItem.Items']"))
	public java.util.List<WebElement> TWEItemList;

	public java.util.List<WebElement> getTWEItemList() {
		return TWEItemList;
	}
	@FindBy(xpath = "//*[@id='transErrGeneral']")
	public WebElement TWEMandryFilledError;

	public WebElement getTWEMandryFilledError() {
		return TWEMandryFilledError;
	}
	@FindBy(xpath = "//tbody[@role='rowgroup']//td[7]")
	public WebElement TWEDateFirstField;

	public WebElement getTWEDateFirstField() {
		return TWEDateFirstField;
	}
	@FindBy(xpath = "//span[@id='transErrDate']")
	public WebElement TWEErrorDate;

	public WebElement getTWEErrorDate() {
		return TWEErrorDate;
	}








}



