package pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class ProjectPlanActuals {
	@FindBy(xpath = "//span[text()='AutomationMay2018']")
	public WebElement ProjectCard;

	public WebElement getProjectCard() {
		return ProjectCard;
	}
	
	
	
	@FindBy(xpath = "//a//span[contains(@class,'execution')]")
	public WebElement planheader;

	public WebElement getplanheader() {
		return planheader;
	}
	
	@FindBy(xpath = "//a//span[contains(@class,'execution')]")
	public WebElement executionheader;

	public WebElement getexecutionheader() {
		return executionheader;
	}
	@FindBy(xpath = "*//a[text()='Project Plan' and @href='/projectexecution/projectplan/projectplan']")
	public WebElement plansetup;

	public WebElement getplansetup() {
		return plansetup;
	}
	
	@FindBy(xpath = "*//li[2]/a[text()='Project Plan' and @href='/projectexecution/projectplan/projectplan']")
	public WebElement executionplansetup;

	public WebElement getexecutionplansetup() {
		return executionplansetup;
	}
	
	@FindBy(xpath = "*//div[@class='bookmark-this']//span[@class='transIcon-bookmarked']")
	public WebElement plansetupbookmark;

	public WebElement getplansetupbookmark() {
		return plansetupbookmark;
	}
	
	
	@FindBy(xpath = "*//a[text()='EXPORT ']/span[@class='transIcon-export']")
	public WebElement plansetupexportIcon;

	public WebElement getplansetupexportIcon() {
		return plansetupexportIcon;
	}
	
	@FindBy(xpath = "//ul//li//a[@ng-click='projectPlanExcel()']")
	public WebElement plansetupexportExcelMenu;

	public WebElement getplansetupexportExcelMenu() {
		return plansetupexportExcelMenu;
	}
	
	@FindBy(xpath = "//ul//li//a[@ng-click='projectPlanMPP()']")
	public WebElement plansetupexportMPPMenu;

	public WebElement getplansetupexportMPPMenu() {
		return plansetupexportMPPMenu;
	}
	
	@FindBy(xpath = "*//div[@class='k-grid-content-locked']//table//tbody//tr[2]//td//a[@role='button']//span[@class='k-icon k-i-edit']")
	public WebElement EditButtonProjectAccess;

	public WebElement getEditButtonProjectAccess() {
		return EditButtonProjectAccess;
	}
	
	@FindBy(xpath = "*//a[text()='IMPORT ']/span[@class='transIcon-import']")
	public WebElement plansetupimportIcon;

	public WebElement getplansetupimportIcon() {
		return plansetupimportIcon;
	}
	
	
	@FindBy(xpath = "*//a[text()='Project Plan-Guidelines ']/span[@class='transIcon-export']")
	public WebElement plansetupguidelineIcon;

	public WebElement getplansetupguidelineIcon() {
		return plansetupguidelineIcon;
	}
	@FindBy(xpath = "//a[@class='active']")
	public WebElement ProjectPlanhomepageactivetab;

	public WebElement getProjectPlanhomepageactivetab() {
		return ProjectPlanhomepageactivetab;
	}
	
	@FindBy(xpath = "//a[@class='active']")
	public WebElement ExecutionProjPlanhomepageactivetab;

	public WebElement getExecutionProjPlanhomepageactivetab() {
		return ExecutionProjPlanhomepageactivetab;
	}
	

	@FindBy(xpath = "//span[@class='acn-shrink']")
	public WebElement ExecutionProjPlanExapnderShrinkIcon;

	public WebElement getExecutionProjPlanExapnderShrinkIcon() {
		return ExecutionProjPlanExapnderShrinkIcon;
	}
	
	@FindBy(xpath = "//span[@class='expand-grid-icon']")
	public WebElement ExecutionProjPlanExapnderIcon;

	public WebElement getExecutionProjPlanExapnderIcon() {
		return ExecutionProjPlanExapnderIcon;
	}
	@FindAll(@FindBy(xpath = "*//ul[@role='tablist']//li//a"))
	public List<WebElement> plansubmenuheaderlist;

	public List<WebElement> getplansubmenuheaderlist() {
		return plansubmenuheaderlist;
	}
	
	@FindAll(@FindBy(xpath = "//table[@role='grid']//thead//tr//th"))
	public List<WebElement> projectplancolumnheaders;

	public List<WebElement> getprojectplancolumnheaders() {
		return projectplancolumnheaders;
	}
	
	@FindAll(@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//table//tbody//tr//td[@role='gridcell']//span[@ng-bind='dataItem.OwnerNm']"))
	public List<WebElement> ProjPlanOwnerNames;

	public List<WebElement> getProjPlanOwnerNames() {
		return ProjPlanOwnerNames;
	}
	
	@FindAll(@FindBy(xpath = "*//div[@class='k-grid-content-locked']//table//tbody//tr/td"))
	public java.util.List<WebElement>	ProjaccessEditbutton;

	public List<WebElement> getProjaccessEditbutton() {
		return ProjaccessEditbutton;
	}
	
	@FindBy(xpath = "//ul[@role='menubar']//li//span")
	public WebElement CustomIconLink;

	public WebElement getCustomIconLink() {
		return CustomIconLink;
	}
	
	@FindBy(xpath = "//div[@id='columnMenuButton']//a//span")
	public WebElement CustomIcon;

	public WebElement getCustomIcon() {
		return CustomIcon;
	}
	
	@FindBy(xpath = "*//th[text()='CRITICAL PATH']//a[@class='k-grid-filter']/span")
	public WebElement CriticalPathFilter;

	public WebElement getCriticalPathFilter() {
		return CriticalPathFilter;
	}
	
	@FindBy(xpath = "*//th[text()='MILESTONE']//a//span[@class='k-icon k-i-filter']")
	public WebElement MilestoneFilter;

	public WebElement getMilestoneFilter() {
		return MilestoneFilter;
	}
	
	@FindBy(xpath = "*//th[text()='LEVEL']//a//span[@class='k-icon k-i-filter']")
	public WebElement LevelFilter;

	public WebElement getLevelFilter() {
		return LevelFilter;
	}
	
	@FindBy(xpath = "*//th[text()='WAVE']//a//span[@class='k-icon k-i-filter']")
	public WebElement WaveFilter;

	public WebElement getWaveFilter() {
		return WaveFilter;
	}
	
	@FindBy(xpath = "*//th[text()='WORKSTREAM*']//a//span[@class='k-icon k-i-filter']")
	public WebElement WorkstreamFilter;

	public WebElement getWorkstreamFilter() {
		return WorkstreamFilter;
	}
	
	@FindBy(xpath = "*//th[text()='ACTIVITY*']//a//span[@class='k-icon k-i-filter']")
	public WebElement ActivityFilter;

	public WebElement getActivityFilter() {
		return ActivityFilter;
	}
	
	@FindBy(xpath = "//input[@title='Value']")
	public WebElement ActivitySearchBox;

	public WebElement getActivitySearchBox() {
		return ActivitySearchBox;
	}
	
	@FindBy(xpath = "//input[@title='Value']//following::div//button[1]")
	public WebElement ActivityFilterButton;

	public WebElement getActivityFilterButton() {
		return ActivityFilterButton;
	}
	
	
	
	@FindBy(xpath = "*//th[text()='OWNER (Enterprise Id)*']//a//span[@class='k-icon k-i-filter']")
	public WebElement OwnerFilter;

	public WebElement getOwnerFilter() {
		return OwnerFilter;
	}
	
	@FindBy(xpath = "*//div[@class='col-sm-12 overall-links']//ul//li//button[@id='AddRow']")
	public WebElement AddActivitybutton;

	public WebElement getAddActivitybutton() {
		return AddActivitybutton;
	}
	
	@FindBy(xpath = "*//div[@class='k-window-actions']//a[@role='button']//span[@class='k-icon k-i-close']")
	public WebElement AddActivityClosebutton;

	public WebElement getAddActivityClosebutton() {
		return AddActivityClosebutton;
	}
	
	@FindBy(xpath = "//*[contains(text(),'Save')][@role='button']")
	public WebElement AddActivitySavebutton;

	public WebElement getAddActivitySavebutton() {
		return AddActivitySavebutton;
	}
	@FindBy(id = "btnMessageOK")
	public WebElement okBttn;

	public WebElement getOKBttn() {
		return okBttn;
	}
	
	@FindBy(xpath = "//*[contains(text(),'demosd5')]")
	public WebElement addActivity_ValidateRow;
	
	public WebElement getValidateRow() {
		return  addActivity_ValidateRow;
	}
	
	@FindBy(xpath = "//td[text()='Engagement Management']")
	public WebElement EngmntWrkstrm;
	
	public WebElement getEngmntWrkstrm() {
		return EngmntWrkstrm;
	}
	
	@FindBy(xpath = "//*[contains(text(),'UpdateD')]")
	public WebElement addActivity_UpdateRow;
	
	public WebElement getUpdatedRow() {
		return  addActivity_UpdateRow;
	}
	
	@FindBy(xpath = "*//div[label='Milestone']")
	public WebElement AddActivityMilestoneField;

	public WebElement getAddActivityMilestoneField() {
		return AddActivityMilestoneField;
	}
	
	@FindBy(xpath = "*//div[label='Critical Path']")
	public WebElement AddActivityCriticalPathField;

	public WebElement getAddActivityCriticalPathField() {
		return AddActivityCriticalPathField;
	}
	
	@FindBy(xpath = "*//div[label='Owner Category']")
	public WebElement AddActivityOwnerCategoryField;

	public WebElement getAddActivityOwnerCategoryField() {
		return AddActivityOwnerCategoryField;
	}
	
	@FindBy(xpath = "*//div[label='Level']")
	public WebElement AddActivityLevelField;

	public WebElement getAddActivityLevelField() {
		return AddActivityLevelField;
	}
	
	@FindBy(xpath = "*//div[label='Wave']")
	public WebElement AddActivityWaveField;

	public WebElement getAddActivityWaveField() {
		return AddActivityWaveField;
	}
	
	@FindBy(xpath = "*//div[label='Workstream']")
	public WebElement AddActivityWorkstreamField;

	public WebElement getAddActivityWorkstreamField() {
		return AddActivityWorkstreamField;
	}
	
	@FindBy(xpath = "*//div[label='Category']")
	public WebElement AddActivityCategoryField;

	public WebElement getAddActivityCategoryField() {
		return AddActivityCategoryField;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Activity')]//parent::div/input")
	public WebElement AddActivitywthActivityField;

	public WebElement getAddActivitywthActivityField() {
		return AddActivitywthActivityField;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Planned Start Date')]//parent::div/span/span/input")
	public WebElement AddActivityPalnStrtDteField;

	public WebElement getAddActivityPalnStrtDteField() {
		return AddActivityPalnStrtDteField;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Planned End Date')]//parent::div/span/span/input")
	public WebElement AddActivityPalnEndDteField;

	public WebElement getAddActivityPalnEndDteField() {
		return AddActivityPalnEndDteField;
	}
	
	@FindBy(xpath = "*//div[label='Duration']")
	public WebElement AddActivityDurationField;

	public WebElement getAddActivityDurationField() {
		return AddActivityDurationField;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Owner')]//parent::div/span/input")
	public WebElement AddActivityOwnerField;

	public WebElement getAddActivityOwnerField() {
		return AddActivityOwnerField;
	}
	
	@FindBy(xpath = "*//div[label='Activity']//i[@class='mandatory' and text()='*']")
	public WebElement AddActivityMandtryActivityField;

	public WebElement getAddActivityMandtryActivityField() {
		return AddActivityMandtryActivityField;
	}
	
	@FindBy(xpath = "*//div[label='Planned Start Date']//i[@class='mandatory' and text()='*']")
	public WebElement AddActivityMandtryPlndstrtDateField;

	public WebElement getAddActivityMandtryPlndstrtDateField() {
		return AddActivityMandtryPlndstrtDateField;
	}
	
	@FindBy(xpath = "*//div[label='Planned End Date']//i[@class='mandatory' and text()='*']")
	public WebElement AddActivityMandtryPlndendDateField;

	public WebElement getAddActivityMandtryPlndendDateField() {
		return AddActivityMandtryPlndendDateField;
	}
	@FindBy(xpath = "*//span[@class='expand-grid-icon']")
	public WebElement Expandericon;

	public WebElement getExpandericon() {
		return Expandericon;
	}
	
	@FindBy(xpath = "*//a[@id='info_lnk']")
	public WebElement InformationTooltip;

	public WebElement getInformationTooltip() {
		return InformationTooltip;
	}
	
	@FindBy(xpath = "*//table[@role='grid']//tbody//tr[1]")
	public WebElement ProjectPlanHeaderRow;

	public WebElement getProjectPlanHeaderRow() {
		return ProjectPlanHeaderRow;
	}
	
	@FindBy(xpath = "//ul[@class='nav nav-tabs tabs']//li//a[text()='Gantt Chart']")
	public WebElement GanttChartTab;

	public WebElement getGanttChartTab() {
		return GanttChartTab;
	}
	
	@FindBy(xpath = "//span[@class='rag-status onTrack']")
	public WebElement GanttChartTabCompletecolor;

	public WebElement getGanttChartTabCompletecolor() {
		return GanttChartTabCompletecolor;
	}
	
	
	@FindBy(xpath = "//span[@class='rag-status atRisk']")
	public WebElement GanttChartTabInCompletecolor;

	public WebElement getGanttChartTabInCompletecolor() {
		return GanttChartTabInCompletecolor;
	}
	
	
	
	@FindBy(xpath = "//ul[@class='nav nav-tabs tabs']//li//a[text()='Overall Project Plan']")
	public WebElement OverallPlanTab;

	public WebElement getOverallPlanTab() {
		return OverallPlanTab;
	}
	
	@FindBy(xpath = "//span[@class='expand-grid-icon']")
	public WebElement GanttChartExpandericon;

	public WebElement getGanttChartExpandericon() {
		return GanttChartExpandericon;
	}
	
	
	@FindAll(@FindBy(xpath = "//ul[@class='quick-links ng-scope']/li[2]/ul/li/a"))
	public List<WebElement> Exportdropdownoptions;

	public List<WebElement> getExportdropdownoptions() {
		return Exportdropdownoptions;
	}
	
	@FindAll(@FindBy(xpath = "//table[@role='grid']//thead//tr//th"))
	public List<WebElement> GanttChartColumns;

	public List<WebElement> getGanttChartColumns() {
		return GanttChartColumns;
	}
	
	@FindAll(@FindBy(xpath = "//li[contains(@class,\"k-state-default k-view\")]"))
	public List<WebElement> getGanttChartHeader;

	public List<WebElement> getGanttChartHeader() {
		return getGanttChartHeader;
	}
	
	@FindAll(@FindBy(xpath = "//tr//td[3]"))
	public List<WebElement> plannedstartdatefield;

	public List<WebElement> getplannedstartdatefield() {
		return plannedstartdatefield;
	}
	
	
	@FindAll(@FindBy(xpath = "//tr//td[4]"))
	public List<WebElement> plannedenddatefield;

	public List<WebElement> getplannedenddatefield() {
		return plannedenddatefield;
	}
	
	@FindAll(@FindBy(xpath = "//table//tbody//tr//td[span='Manage Mobilization']//following::tr[@data-level='1']//td[2]//span[@aria-label]"))
	public List<WebElement> GanttManageMobilisationitems;

	public List<WebElement> getGanttManageMobilisationitems() {
		return GanttManageMobilisationitems;
	}
	
	@FindAll(@FindBy(xpath = "//table//tbody//tr//td[span='Stabilization']//following::tr[@data-level='1']//td[2]//span[@aria-label]"))
	public List<WebElement> GanttManageStabilisationitems;

	public List<WebElement> getGanttManageStabilisationitems() {
		return GanttManageStabilisationitems;
	}
	
	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr//td[16][text()]"))
	public List<WebElement> WorkstreamStabActivityitems;

	public List<WebElement> getWorkstreamStabActivityitems() {
		return WorkstreamStabActivityitems;
	}
	
	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr//td[16][text()]"))
	public List<WebElement> WorkstreamMobilActivityitems;

	public List<WebElement> getWorkstreamMobilActivityitems() {
		return WorkstreamMobilActivityitems;
	}
	
	@FindAll(@FindBy(xpath = "//ul[@class='quick-links ng-scope']/li[3]/ul/li/a"))
	public List<WebElement> Importdropdownoptions;

	public List<WebElement> getImportdropdownoptions() {
		return Importdropdownoptions;
	}
	
	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr//td[16]"))
	public List<WebElement> ActivityFiltersearchedlist;

	public List<WebElement> getActivityFiltersearchedlist() {
		return ActivityFiltersearchedlist;
	}
	
	@FindAll(@FindBy(xpath = "*//div[@class='k-grid-content k-auto-scrollable']//table//tbody//tr"))
	public List<WebElement> ProjectplanTablerowdata;

	public List<WebElement> getProjectplanTablerowdata() {
		return ProjectplanTablerowdata;
	}
	
	@FindAll(@FindBy(xpath = "*//div[@class='k-grid-content-locked']/table/tbody/tr"))
	public List<WebElement> TableEditbuttonabsence;

	public List<WebElement> getTableEditbuttonabsence() {
		return TableEditbuttonabsence;
	}
	
	@FindBy(xpath = "//div[@class='proj-code ng-binding']")
	public WebElement cardnumber;
	
	public WebElement getcardnumber() {
		return cardnumber;
	}
	
	@FindBy(xpath = "//div[@class='proj-code ng-binding']//following-sibling::h1")
	public WebElement carddate;
	
	public WebElement getcarddate() {
		return carddate;
	}
	
	@FindBy(xpath = "//input[@type='checkbox' and @name='MilestoneInd' and @value='N']")
	public WebElement MilestoneSelectionforNocheckbox;
	
	public WebElement getMilestoneSelectionforNocheckbox() {
		return MilestoneSelectionforNocheckbox;
	}
	
	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr"))
	public List<WebElement> NumberofRowsOnMilestoneSelection;

	public List<WebElement> getNumberofRowsOnMilestoneSelection() {
		return NumberofRowsOnMilestoneSelection;
	}
	
	
	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr//td[9]//span[text()='No']"))
	public List<WebElement> NumberofRowsbeforeMilestoneSelection;

	public List<WebElement> getNumberofRowsbeforeMilestoneSelection() {
		return NumberofRowsbeforeMilestoneSelection;
	}
	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr//td[9]"))
	public List<WebElement> TextPresentOnMilestoneSelectionfield;

	public List<WebElement> getTextPresentOnMilestoneSelectionfield() {
		return TextPresentOnMilestoneSelectionfield;
	}
	
	
	@FindBy(xpath = "//ul//li//label//input[@name='MilestoneInd']//following-sibling::span//following::button[1]")
	public WebElement MileStoneFilterbutton;
	
	public WebElement getMileStoneFilterbutton() {
		return MileStoneFilterbutton;
	}
	
	@FindBy(xpath = "//ul//li[2]//label//input[@name='TaskLevel']")
	public WebElement LevelSelectionforWavecheckbox;
	
	public WebElement getLevelSelectionforWavecheckbox() {
		return LevelSelectionforWavecheckbox;
	}
	
	@FindBy(xpath = "//ul//li//label//input[@name='TaskLevel']//following-sibling::span//following::button[1]")
	public WebElement LevelFilterbutton;
	
	public WebElement getLevelFilterbutton() {
		return LevelFilterbutton;
	}
	

	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr//td[12]"))
	public List<WebElement> TextPresentOnLevelSelectionfield;

	public List<WebElement> getTextPresentOnLevelSelectionfield() {
		return TextPresentOnLevelSelectionfield;
	}
	
	@FindBy(xpath = "//input[@name='WorkStreamName' and @value='Engagement Management']")
	public WebElement WorkstmSelectionforcheckbox;
	
	public WebElement getWorkstmSelectionforcheckbox() {
		return WorkstmSelectionforcheckbox;
	}
	
	@FindBy(xpath = "//form[@class='k-filter-menu k-popup k-group k-reset k-state-border-up']//ul//li[1]//label//input[@name='WorkStreamName']")
	public WebElement WorkstmSelectionforMobilcheckbox;
	
	public WebElement getWorkstmSelectionforMobilcheckbox() {
		return WorkstmSelectionforMobilcheckbox;
	}
	
	@FindBy(xpath = "//form[@class='k-filter-menu k-popup k-group k-reset k-state-border-up']//ul//li//label//input[@name='WorkStreamName']//following-sibling::span//following::button[1]")
	public WebElement WorkStreamFilterbutton;
	
	public WebElement getWorkStreamFilterbutton() {
		return WorkStreamFilterbutton;
	}
	

	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr//td[14]"))
	public List<WebElement> TextPresentOnWorkstreamSelectionfield;

	public List<WebElement> getTextPresentOnWorkstreamSelectionfield() {
		return TextPresentOnWorkstreamSelectionfield;
	}
	
	@FindBy(xpath = "//a[@class='transIcon-manage_bookmarks more-icon']")
	public WebElement Managebookamrkicon;
	
	public WebElement getManagebookamrkicon() {
		return Managebookamrkicon;
	}
	
	@FindBy(xpath = "//a[@class='bookmark' and @title='Bookmark Project Plan Actuals']//span[@class='transIcon-bookmarked']")
	public WebElement PlanActualbookamrknotchecked;
	
	public WebElement getPlanActualbookamrknotchecked() {
		return PlanActualbookamrknotchecked;
	}
	@FindBy(xpath = "//ul//a[@class='links-manage ng-scope']")
	public WebElement MoreManageList;

	public WebElement getMoreManageList() {
		return MoreManageList;
	}
	
	@FindBy(xpath = "//li[@ng-repeat='item in docks']//a[text()='Project Plan(Actuals)']")
	public WebElement ProjPlanBookmarktab;

	public WebElement getProjPlanBookmarktab() {
		return ProjPlanBookmarktab;
	}
	
	
	@FindBy(xpath = "//a[@class='bookmark docked' and @title='Bookmark Project Plan Actuals']//span[@class='transIcon-bookmarked']")
	public WebElement PlanActualbookamrkchecked;
	
	public WebElement getPlanActualbookamrkchecked() {
		return PlanActualbookamrkchecked;
	}
	
	
	
	@FindBy(xpath = "//li[@ng-repeat='item in docks']//a[text()='Project Plan(Actuals)']")
	public WebElement PlanActualinbookmarktab;
	
	public WebElement getPlanActualinbookmarktab() {
		return PlanActualinbookmarktab;
	}
	
	@FindBy(xpath = "//li[1]//a[text()='Execution Summary']")
	public WebElement ExecutionSummaryTab;
	
	public WebElement getExecutionSummaryTab() {
		return ExecutionSummaryTab;
	}
	

	@FindBy(xpath = "//li[@ng-repeat='item in docks']//a[text()='Deal Execution']")
	public WebElement DealExecutionTab;
	
	public WebElement getDealExecutionTab() {
		return DealExecutionTab;
	}
	
	@FindBy(xpath = "//li[@ng-repeat='item in docks']//a[text()='Project Staffing']")
	public WebElement ProjectStaffingTab;
	
	public WebElement getProjectStaffingTab() {
		return ProjectStaffingTab;
	}
	
	
	
	
	@FindBy(xpath = "//li//a[@class='bookmark docked' and @aria-label='Bookmark Deal Execution']")
	public WebElement DasbdDealExecutionchecked;
	
	public WebElement getDasbdDealExecutionchecked() {
		return DasbdDealExecutionchecked;
	}
	
	@FindBy(xpath = "//li//a[@href='/ProjectExecution/DealExecution/DealExecution/']")
	public WebElement DealExecutionHomelink;
	
	public WebElement getDealExecutionHomelink() {
		return DealExecutionHomelink;
	}
	
	@FindBy(xpath = "//a[@class='bookmark docked' and @title='Bookmark Deal Info']//span[@class='transIcon-bookmarked']")
	public WebElement DealExecutionbookamekedinHomepage;
	
	public WebElement getDealExecutionbookamekedinHomepage() {
		return DealExecutionbookamekedinHomepage;
	}
	
	@FindBy(xpath = "//li//a[@class='bookmark' and @aria-label='Bookmark Deal Execution']")
	public WebElement DasbdDealExecutionNotchecked;
	
	public WebElement getDasbdDealExecutionNotchecked() {
		return DasbdDealExecutionNotchecked;
	}
	
	@FindBy(xpath = "//a[@aria-label='Bookmark Deal Execution']//span[@class='transIcon-bookmarked']")
	public WebElement DasbdDealExecutionBookmark;
	
	public WebElement getDasbdDealExecutionBookmark() {
		return DasbdDealExecutionBookmark;
	}
	
	@FindBy(xpath = "//a[@class='bookmark' and @title='Bookmark Deal Info']//span[@class='transIcon-bookmarked']")
	public WebElement DealExecutionbookamekedNotinHomepage;
	
	public WebElement getDealExecutionbookamekedNotinHomepage() {
		return DealExecutionbookamekedNotinHomepage;
	}
	
	
}
