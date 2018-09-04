package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBys;


public class UserAccessPage {
	
	
	@FindBy(xpath = "//span[text()='9thMar2018']")
	public WebElement ProjectCard;

	public WebElement getProjectCard() {
		return ProjectCard;
	}
	
	// Project Logs Risk Icon

		

	
	@FindBy(xpath = "*//i[@class='transIcon-user_access icon']")
	public WebElement ProjectUserAccessIcon;

	public WebElement getProjectUserAccessIcon() {
		return ProjectUserAccessIcon;
	}
	
	@FindBy(xpath = "//span[@class='transIcon-plan icon']")
	public WebElement PlanMenuIcon;

	public WebElement getPlanMenuIcon() {
		return PlanMenuIcon;
	}
	
	@FindBy(xpath = "//span[@class='transIcon-execution icon']")
	public WebElement ExecutionMenuIcon;

	public WebElement getExecutionMenuIcon() {
		return ExecutionMenuIcon;
	}

	
	
	
	@FindBy(xpath = "//a[@href='/ProjectSetup/Deal/Index/?id=1']")
	public WebElement DealInformationDsbrdbtn;

	public WebElement getDealInformationDsbrdbtn() {
		return DealInformationDsbrdbtn;
	}
	
	
	@FindBy(xpath = "//a[@href='/ProjectSetup/ProjectSetup/MECPage/?id=4']")
	public WebElement MecChecklistDsbrdbtn;

	public WebElement getMecChecklistDsbrdbtn() {
		return MecChecklistDsbrdbtn;
	}
	
	@FindBy(xpath = "//a[@href='/ProjectSetup/ProjectSetup/ProjectSetup/?id=2']")
	public WebElement TransitionPlanDsbrdbtn;

	public WebElement getTransitionPlanDsbrdbtn() {
		return TransitionPlanDsbrdbtn;
	}

	@FindBy(xpath = "//a[@href='/projectexecution/projectplan/projectplan']")
	public WebElement ProjectPlanDsbrdbtn;

	public WebElement getProjectPlanDsbrdbtn() {
		return ProjectPlanDsbrdbtn;
	}
	
	
	@FindBy(xpath = "//a[@ng-click='RedirectDTT()']")
	public WebElement DTTDsbrdbtn;

	public WebElement getDTTDsbrdbtn() {
		return DTTDsbrdbtn;
	}
	
	@FindBy(xpath = "//a[@ng-click='RedirectTWE()']")
	public WebElement TWEDsbrdbtn;

	public WebElement getTWEDsbrdbtn() {
		return TWEDsbrdbtn;
	}
	
	
	@FindBy(xpath = "//a[@ng-click='RedirectToProjectStaffing()']")
	public WebElement ProjectStaffDsbrdbtn;

	public WebElement getProjectStaffDsbrdbtn() {
		return ProjectStaffDsbrdbtn;
	}
	
	@FindBy(xpath = "//a[@href='/ProjectSetup/Staffing/Staffing/?id=3']")
	public WebElement PlanProjectStaffDsbrdbtn;

	public WebElement getPlanProjectStaffDsbrdbtn() {
		return PlanProjectStaffDsbrdbtn;
	}

	
	
	@FindBy(xpath = "//li[4]//a[@ng-click='RedirecTExecutionDash()']")
	public WebElement ExecutionSummaryDsbrdbtn;

	public WebElement getExecutionSummaryDsbrdbtn() {
		return ExecutionSummaryDsbrdbtn;
	}

	@FindBy(xpath = "//a[@ng-click='RedirectWaveDetails()']")
	public WebElement WaveDetailsDsbrdbtn;

	public WebElement getWaveDetailsDsbrdbtn() {
		return WaveDetailsDsbrdbtn;
	}

	@FindBy(xpath = "//a[@ng-click='RedirectEP()']")
	public WebElement EPDsbrdbtn;

	public WebElement getEPDsbrdbtn() {
		return EPDsbrdbtn;
	}
	
	
	@FindBy(xpath = "//a[@ng-click='RedirectTTT()']")
	public WebElement TTTDsbrdbtn;

	public WebElement getTTTDsbrdbtn() {
		return TTTDsbrdbtn;
	}
	

	
	@FindBy(xpath = "//a[@href='/ProjectSetup/Staffing/Staffing/?id=3']")
	public WebElement ProjectSatffingDsbrdbtn;

	public WebElement getProjectSatffingDsbrdbtn() {
		return ProjectSatffingDsbrdbtn;
	}

	@FindBy(xpath = "//a[@href='/ProjectSetup/RisksandAssumptions/UploadDocuments/?id=7']")
	public WebElement ProjectArtifactsDsbrdbtn;

	public WebElement getProjectArtifactsDsbrdbtn() {
		return ProjectArtifactsDsbrdbtn;
	}

	@FindBy(xpath = "//a[@href='/ProjectSetup/DetailedPlan/Index/']")
	public WebElement ProjectPlanSetUpDsbrdbtn;

	public WebElement getProjectPlanSetUpDsbrdbtn() {
		return ProjectPlanSetUpDsbrdbtn;
	}
	
	@FindBy(xpath = "//a[@href='/ProjectSetup/Deal/Index/?id=1']")
	public WebElement DealInformationDsbd;

	public WebElement getDealInformationDsbd() {
		return DealInformationDsbd;
	}

	
	@FindBy(xpath = "//a[@href='/ProjectExecution/DealExecution/DealExecution/']")
	public WebElement DealExecutionDsbd;

	public WebElement getDealExecutionDsbd() {
		return DealExecutionDsbd;
	}

	
	@FindBy(xpath = "//label[contains(text(),'Deal RAG')]//following::span/span[1]")
	public WebElement DealRAGfield;

	public WebElement getDealRAGfield() {
		return DealRAGfield;
	}

	@FindBy(xpath = "//label[contains(text(),'Client Perception RAG')]//following::span/span[1]")
	public WebElement ClientPercpRAG;

	public WebElement getClientPercpRAG() {
		return ClientPercpRAG;
	}

	@FindBy(xpath = "//label[contains(text(),'Governance Attention Level')]//following::span/span[1]")
	public WebElement GovAttntLevel;

	public WebElement getGovAttntLevel() {
		return GovAttntLevel;
	}

	@FindBy(xpath = "//label[contains(text(),'Contract')]//following::span/span[1]")
	public WebElement ContractRAG;

	public WebElement getContractRAG() {
		return ContractRAG;
	}

	@FindBy(xpath = "//label[contains(text(),'Commercial')]//following::span/span[1]")
	public WebElement CoomercialRAG;

	public WebElement getCoomercialRAG() {
		return CoomercialRAG;
	}

	@FindBy(xpath = "//label[contains(text(),'Watch')]//following::span/span[1]")
	public WebElement Watchlistdrpdown;

	public WebElement getWatchlistdrpdown() {
		return Watchlistdrpdown;
	}

	@FindBy(xpath = "//label[contains(text(),'Issue')]//following::span/span[1]")
	public WebElement IssueType;

	public WebElement getIssueType() {
		return IssueType;
	}

	
	@FindBy(xpath = "//label[contains(text(),'MMS ID')]//following::input")
	public WebElement MMSId;

	public WebElement getMMSId() {
		return MMSId;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Name of Deal')]//following::input")
	public WebElement DealName;

	public WebElement getDealName() {
		return DealName;
	}

	
	@FindBy(xpath = "//label[contains(text(),'Client Name')]//following::input")
	public WebElement ClientName;

	public WebElement getClientName() {
		return ClientName;
	}

	
	
	@FindBy(xpath = "//label[contains(text(),'Service Group')]//following::input")
	public WebElement ServGRp;

	public WebElement getServGRp() {
		return ServGRp;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Deal Stage')]//following::input")
	public WebElement DealStage;

	public WebElement getDealStage() {
		return DealStage;
	}
	
	
	
	@FindBy(xpath = "//label[contains(text(),'Offerings')]//following::textarea")
	public WebElement Offerings;

	public WebElement getOfferings() {
		return Offerings;
	}
	
	
	@FindBy(xpath = "//label[contains(text(),'Operating Group')]//following::input")
	public WebElement OperatingGrp;

	public WebElement getOperatingGrp() {
		return OperatingGrp;
	}
	
	
	@FindBy(xpath = "//label[contains(text(),'GEO Region')]//following::input")
	public WebElement Georegion;

	public WebElement getGeoregion() {
		return Georegion;
	}
	
	
	@FindBy(xpath = "//label[contains(text(),'GEO Unit')]//following::input")
	public WebElement GeoUnit;

	public WebElement getGeoUnit() {
		return GeoUnit;
	}
	
	
	@FindBy(xpath = "//label[contains(text(),'Total BPO')]//following::input")
	public WebElement TotalBPO;

	public WebElement getTotalBPO() {
		return TotalBPO;
	}
	
	
	@FindBy(xpath = "//label[contains(text(),'Total IO')]//following::input")
	public WebElement TotalIO;

	public WebElement getTotalIO() {
		return TotalIO;
	}
	
	
	@FindBy(xpath = "//label[contains(text(),'Reporting Status')]//following::input")
	public WebElement REportStatus;

	public WebElement getREportStatus() {
		return REportStatus;
	}


	
	@FindBy(xpath = "//label[contains(text(),'Watch List Level')]//following::span/span[1]")
	public WebElement WatchListLevel;

	public WebElement getWatchListLevel() {
		return WatchListLevel;
	}

	@FindBy(xpath = "//label[contains(text(),'Go Live date')]//following::input")
	public WebElement GOLiveDate;

	public WebElement getGOLiveDate() {
		return GOLiveDate;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Status Update')]//following::input[@id='statusId']")
	public WebElement StatusUpdate;

	public WebElement getStatusUpdate() {
		return StatusUpdate;
	}
	
	@FindBy(xpath = "//label[contains(text(),'External Hires')]//following::input")
	public WebElement ExternalHires;

	public WebElement getExternalHires() {
		return ExternalHires;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Seeding')]//following::input")
	public WebElement Seeding;

	public WebElement getSeeding() {
		return Seeding;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Deal Comments')]//following::textarea")
	public WebElement DealCOMMENTS;

	public WebElement getDealCOMMENTS() {
		return DealCOMMENTS;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Client Perception Comments')]//following::textarea")
	public WebElement CientPercepComments;

	public WebElement getCientPercepComments() {
		return CientPercepComments;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Target Month')]//following::textarea")
	public WebElement TArgetMonth;

	public WebElement getTArgetMonth() {
		return TArgetMonth;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Exit Criteria')]//following::textarea")
	public WebElement WAtchListExitCriteria;

	public WebElement getWAtchListExitCriteria() {
		return WAtchListExitCriteria;
	}
	
	@FindBy(xpath = "//label[contains(text(),'comparison')]//following::textarea")
	public WebElement Notes;

	public WebElement getNotes() {
		return Notes;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Issue')]//following::textarea[4]")
	public WebElement Issue;

	public WebElement getIssue() {
		return Issue;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Action')]//following::textarea")
	public WebElement Action;

	public WebElement getAction() {
		return Action;
	}
	
		
	@FindAll(@FindBy(xpath = "//form[@name='dealForm']//following::div[@class='deal-information-wrapper']//following::div[@class='form-group deal-setup']//input[@id]//ancestor::div//label"))
	java.util.List<WebElement> DealInfoFields;

	public List<WebElement> getDealInfoFields() {
		return DealInfoFields;
	}
	

	@FindAll(@FindBy(xpath = "//form[@name='dealForm']//following::div[@class='deal-information-wrapper']//following::div[@class='form-group deal-setup']//input[@id]"))
	java.util.List<WebElement> DealInfoFieldsAttrib;

	public List<WebElement> getDealInfoFieldsAttrib() {
		return DealInfoFieldsAttrib;
	}
	
	@FindAll(@FindBy(xpath = "//form[@class='ng-pristine ng-valid']//following::div[@class='deal-information-wrapper']//following::div[@class='form-group deal-setup']//textarea"))
	java.util.List<WebElement> DealExecTextareaFieldsAttrib;

	public List<WebElement> getDealExecTextareaFieldsAttrib() {
		return DealExecTextareaFieldsAttrib;
	}
	
	
	
	@FindBy(xpath = "//a[text()='WAVE SETUP']")
	public WebElement TransitionPlanWaveSetUpTab;

	public WebElement getTransitionPlanWaveSetUpTab() {
		return TransitionPlanWaveSetUpTab;
	}
	
	@FindBy(xpath = "//a[text()='WAVE WORKSTREAM Setup']")
	public WebElement TransitionPlanWaveWrkstrmSetUpTab;

	public WebElement getTransitionPlanWaveWrkstrmSetUpTab() {
		return TransitionPlanWaveWrkstrmSetUpTab;
	}
	
	@FindBy(xpath = "//a[@ng-click='AppendGanttChart()']")
	public WebElement TransitionPlanGanttChartTab;

	public WebElement getTransitionPlanGanttChartTab() {
		return TransitionPlanGanttChartTab;
	}
	

	

	@FindBy(xpath = "//a[@ng-click ='ReturntoDmatHome()']")
	public WebElement ProjectCardBack;

	public WebElement geProjectCardBack() {
		return ProjectCardBack;
	}
	
	@FindBy(xpath ="//span[@class='k-icon k-i-edit']")
	public WebElement UserAccessEdit;

	public WebElement getUserAccessEdit() {
		return UserAccessEdit;
	}
	
	
	@FindBy(xpath ="//*[contains(text(),'Add')]")
	public WebElement Addbutton;

	public WebElement getAddbutton() {
		return Addbutton;
	}
	
	
	
	
	
	@FindBy(xpath ="//*[contains(text(),'ADD')]")
	public WebElement Addbutton1;

	public WebElement getAddbutton1() {
		return Addbutton1;
	}
	
	
	@FindBy(xpath ="//tr[2]//td//a//span[@class='k-icon k-i-edit']")
	public WebElement CurrPUserAccessEdit;

	public WebElement getCurrPUserAccessEdit() {
		return CurrPUserAccessEdit;
	}

	
	@FindBy(xpath ="//tr[2]//td//a//span[@class='k-icon k-i-edit']")
	public WebElement OverAllPUserAccessEdit;

	public WebElement getOverAllPUserAccessEdit() {
		return OverAllPUserAccessEdit;
	}
	


	
	
	
	@FindBy(xpath ="//a[@ng-click='AssessmentExport()']//span[@class='transIcon-export']")
	public WebElement DTTExportButton;

	public WebElement getDTTExportButton() {
		return DTTExportButton;
	}

	
	@FindBy(xpath ="//a[@ng-click='AssessmentImport()']//span[@class='transIcon-import']")
	public WebElement DTTImportButton;

	public WebElement getDTTImportButton() {
		return DTTImportButton;
	}

	@FindBy(xpath ="//a[@ng-click='ExportAppAccessData()']//span[@class='transIcon-export']")
	public WebElement TWEExportButton;

	public WebElement getTWEExportButton() {
		return TWEExportButton;
	}

	
	@FindBy(xpath ="//a[@ng-click='ImportAppAccessData()']//span[@class='transIcon-import']")
	public WebElement TWEImportButton;

	public WebElement getTWEImportButton() {
		return TWEImportButton;
	}

	@FindBy(xpath ="//a[text()='EXPORT ']//span[@class='transIcon-export']")
	public WebElement exportButton;

	public WebElement getexportButton() {
		return exportButton;
	}
	
	@FindBy(xpath ="//li//a[@ng-click='TravelTrackerExport()']//span[@class='transIcon-export']")
	public WebElement TTExportButton;

	public WebElement getTTExportButton() {
		return TTExportButton;
	}

	
	
	@FindBy(xpath ="//ul[@class='nav nav-tabs tabs']//a[text()='Current Project Plan']")
	public WebElement CurrentProjectPlanTab;

	public WebElement getCurrentProjectPlanTab() {
		return CurrentProjectPlanTab;
	}
	
	@FindBy(xpath ="//span[text()='Add Activity']")
	public WebElement AddActivity;

	public WebElement getAddActivity() {
		return AddActivity;
	}
	
	@FindBy(xpath ="//button[text()='Add Activity']")
	public WebElement AddActivity3;

	public WebElement getAddActivity3() {
		return AddActivity3;
	}
	
	@FindBy(xpath ="//button[text()='Add Artifacts']")
	public WebElement AddArtifacts;

	public WebElement getAddArtifacts() {
		return AddArtifacts;
	}
	
	@FindBy(xpath ="//input[@id ='txtSharePointLoaction']")
	public WebElement SharepointLocatn;

	public WebElement getSharepointLocatn() {
		return SharepointLocatn;
	}
	
	@FindBy(xpath ="//input[@id='txtProjlevelWrkSt']")
	public WebElement ProjLvlWrkstrm;

	public WebElement getProjLvlWrkstrm() {
		return ProjLvlWrkstrm;
	}
	
	
	
	@FindBy(xpath ="//input[@id ='txtFileName']")
	public WebElement FileName;

	public WebElement getFileName() {
		return FileName;
	}
	
	@FindBy(xpath ="//input[@id ='txtFileCategory']")
	public WebElement FileCategory;

	public WebElement getFileCategory() {
		return FileCategory;
	}
	
	
	
	@FindBy(xpath ="//a[@class='k-button k-button-icontext k-primary k-grid-update']")
	public WebElement Savebtn;

	public WebElement getSavebtn() {
		return Savebtn;
	}
	
	@FindBy(xpath ="//button[@type='submit' and @class='btn btn-primary' and text()='Save']")
	public WebElement SaveButton;

	public WebElement getSaveButton() {
		return SaveButton;
	}
	
	@FindBy(xpath ="//button[@type='button' and @class='btn btn-primary pull-right modal-footer']")
	public WebElement SaveButton1;

	public WebElement getSaveButton1() {
		return SaveButton1;
	}
	
	@FindBy(xpath ="//button[@id='saveOtherTypebtn']")
	public WebElement ProjStaffSavebtn;

	public WebElement getProjStaffSavebtn() {
		return ProjStaffSavebtn;
	}
	
	@FindBy(xpath ="//table[@class='transItTable']//tr[2]/td[1]/a ")
	public WebElement ManageMobExecSumary;

	public WebElement getManageMobExecSumary() {
		return ManageMobExecSumary;
	}
	

	@FindBy(xpath ="//table[@data-role='selectable']//tbody//tr[1]//td[1]")
	public WebElement FirstRow;

	public WebElement getFirstRow() {
		return FirstRow;
	}
	
	
	@FindBy(xpath ="//span[@class='k-icon k-i-close']")
	public WebElement Deletebutton;

	public WebElement getDeletebutton() {
		return Deletebutton;
	}

	@FindBy(xpath ="//button[text()='Link to MEC Artifacts']")
	public WebElement LinkArtifacts;

	public WebElement getLinkArtifacts() {
		return LinkArtifacts;
	}
	
	@FindBy(xpath ="//a[@ng-click='WaveExport()']")
	public WebElement WaveExportButton;

	public WebElement getWaveExportButton() {
		return WaveExportButton;
	}
	
	
	
	@FindBy(xpath ="//a[@ng-click='WaveImport()']")
	public WebElement WaveImportButton;

	public WebElement getWaveImportButton() {
		return WaveImportButton;
	}

	
	@FindBy(xpath ="//a[@ng-click='ImportWaveWrkstrm()']")
	public WebElement WaveWrkstrmImportButton;

	public WebElement getWaveWrkstrmImportButton() {
		return WaveWrkstrmImportButton;
	}
	
	@FindBy(xpath ="//a[@ng-click='ExportWaveWrkstrm()']")
	public WebElement WaveWrkstrmExportButton;

	public WebElement getWaveWrkstrmExportButton() {
		return WaveWrkstrmExportButton;
	}

	
	@FindBy(xpath ="//li[@id='ganttchartid']//a[text()='EXPORT ']")
	public WebElement TransPlanGanttchartExportButton;

	public WebElement getTransPlanGanttchartExportButton() {
		return TransPlanGanttchartExportButton;
	}
	
	@FindBy(xpath ="//button[@id='addWaveId']")
	public WebElement AddWaveBtn;

	public WebElement getAddWaveBtn() {
		return AddWaveBtn;
	}
	
	@FindBy(xpath ="//button[@ng-click='addArtifacts()']")
	public WebElement AddProjectArtifactsBtn;

	public WebElement getAddProjectArtifactsBtn() {
		return AddProjectArtifactsBtn;
	}

	
	
	@FindBy(xpath ="//button[@id='btnAddRole']")
	public WebElement ProjectStaffAddRole;

	public WebElement getProjectStaffAddRole() {
		return ProjectStaffAddRole;
	}

	
	
	
	@FindBy(xpath ="//a[@ng-click='AssessmentImport()']//span[@class='transIcon-import']")
	public WebElement TTTImportButton;

	public WebElement getTTTImportButton() {
		return TTTImportButton;
	}
	
	
	@FindBy(xpath ="//li//a[@ng-click='FileUploadTravel()']//span[@class='transIcon-import']")
	public WebElement TTImportButton;

	public WebElement getTTImportButton() {
		return TTImportButton;
	}
	
	
	@FindBy(xpath ="//button[@id='AddProjUserAccessbtn']")
	public WebElement AddButton;

	public WebElement getAddButton() {
		return AddButton;
	}
	
	
	
	@FindBy(xpath = "//button[@id='btnMessageOK']")
	public WebElement SaveOkbtn;

	public WebElement getSaveOkbtn() {
		return SaveOkbtn;
	}
	
	
	@FindBy(xpath ="//button[text()='ADD PROJECT WORKSTREAM']")
	public WebElement AddProjWrkstrm;

	public WebElement getAddProjWrkstrm() {
		return AddProjWrkstrm;
	}
	
	
	@FindBy(xpath = "//input[@class='k-checkbox']")
	public WebElement TableLevelCheckboxes;

	public WebElement getTableLevelCheckboxes() {
		return TableLevelCheckboxes;
	}
	
	@FindBy(xpath = "//button[text()='Get Approved']")
	public WebElement TableLevelApprovalbtn;

	public WebElement getTableLevelApprovalbtn() {
		return TableLevelApprovalbtn;
	}
	
	@FindBy(xpath ="//ul[@class='nav nav-tabs tabs']//li//a[text()='Gantt Chart']")
	public WebElement ProjectPlanActGanttTab;

	public WebElement getProjectPlanActGanttTab() {
		return ProjectPlanActGanttTab;
	}
	

	@FindBy(xpath ="//ul[@class='nav nav-tabs tabs']//li//a[text()='SERVICE DELIVERY WAVE STAFFING TRACKER']")
	public WebElement EPSDWTab;

	public WebElement getEPSDWTab() {
		return EPSDWTab;
	}
	
	@FindBy(xpath ="//ul[@class='nav nav-tabs tabs']//li//a[text()='TTT Tracker']")
	public WebElement TTTTab;

	public WebElement getTTTTab() {
		return TTTTab;
	}
	
	
	@FindBy(xpath ="//ul[@class='nav nav-tabs tabs']//li//a[text()='TTT ASSESSMENTS']")
	public WebElement TTTAssessmentsTab;

	public WebElement getTTTAssessmentsTab() {
		return TTTAssessmentsTab;
	}
	
	@FindBy(xpath ="//ul[@class='nav nav-tabs tabs']//li//a[text()='DTP/Runbooks Tracker']")
	public WebElement TTTDTPTab;

	public WebElement getTTTDTPTab() {
		return TTTDTPTab;
	}
	
	@FindBy(xpath ="//ul[@class='nav nav-tabs tabs']//li//a[text()='APPROVALS']")
	public WebElement TTTApprovalsTab;

	public WebElement getTTTApprovalsTab() {
		return TTTApprovalsTab;
	}
	
	
	
	@FindBy(xpath ="//ul[@class='nav nav-tabs tabs']//li//a[text()='DTT Tracker']")
	public WebElement DelTimeTrainTab;

	public WebElement getDelTimeTrainTab() {
		return DelTimeTrainTab;
	}

	
	@FindBy(xpath ="//ul[@class='nav nav-tabs tabs']//li//a[text()='DTT Assessments']")
	public WebElement DTTAssesmentsTab;

	public WebElement getDTTAssesmentsTab() {
		return DTTAssesmentsTab;
	}
	
	
	@FindBy(xpath ="//ul[@class='nav nav-tabs tabs']//li//a[text()='TRAVEL TRACKER']	")
	public WebElement EPTTTab;

	public WebElement getEPTTTab() {
		return EPTTTab;
	}
	
	
	@FindBy(xpath ="//button[text()='Add Activity']")
	public WebElement EPAddActivity;

	public WebElement getEPAddActivity() {
		return EPAddActivity;
	}

	@FindBy(xpath ="//button[text()='Add Activity']")
	public WebElement TTTAddActivity;

	public WebElement getTTTAddActivity() {
		return TTTAddActivity;
	}

	
	@FindBy(xpath ="//button[text()='Add ITEM']")
	public WebElement TTTAddItem;

	public WebElement getTTTAddItem() {
		return TTTAddItem;
	}

	

	@FindBy(xpath = "//label[contains(text(),'Category *')]//following::span/span[1]")
	public WebElement TWECategory;

	public WebElement getTWECategory() {
		return TWECategory;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Type *')]//following::span/span[1]")
	public WebElement TWEType;

	public WebElement getTWEType() {
		return TWEType;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Item/Description *')]//following::span/span[1]")
	public WebElement TWEItemdrpdwn;

	public WebElement getTWEItemdrpdwn() {
		return TWEItemdrpdwn;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Receiving Location (*)')]//following::span/span[1]")
	public WebElement TWERecvngLocation;

	public WebElement getTWERecvngLocation() {
		return TWERecvngLocation;
	}
	
	

	@FindBy(xpath = "//table[@role='grid']//tbody//tr[5]//td[7]")
	public WebElement TWETrackerEditCheck;

	public WebElement getTWETrackerEditCheck() {
		return TWETrackerEditCheck;
	}
	
	
	@FindBy(xpath = "//table[@role='grid']//tbody//tr[1]//td[6]")
	public WebElement TWEAccTrackerEditCheck;

	public WebElement getTWEAccTrackerEditCheck() {
		return TWEAccTrackerEditCheck;
	}
	
	
	@FindBy(xpath = "//input[@id='dateReq']")
	public WebElement TWEDate;

	public WebElement getTWEDate() {
		return TWEDate;
	}
	
	
	@FindBy(xpath = "//input[@id='clientdomain']")
	public WebElement TWEClientdomId;

	public WebElement getTWEClientdomId() {
		return TWEClientdomId;
	}
	
	
	
	
	
	@FindBy(xpath ="//button[text()='Add Activity']")
	public WebElement TWEAddActivity;

	public WebElement getTWEAddActivity() {
		return TWEAddActivity;
	}
	
	@FindBy(xpath ="//ul//li//a[text()='TWE TRACKER']")
	public WebElement TWETrackertab;

	public WebElement getTWETrackertab() {
		return TWETrackertab;
	}
	
	@FindBy(xpath ="//ul//li//a[text()='TWE ACCESS TRACKER']")
	public WebElement TWEAccessTrackertab;

	public WebElement getTWEAccessTrackertab() {
		return TWEAccessTrackertab;
	}

	
	@FindBy(xpath ="//button[text()='Add Resource']")
	public WebElement DTTAddResource;

	public WebElement getDTTAddResource() {
		return DTTAddResource;
	}
	
	
	
	
	@FindBy(xpath ="//button[text()='ADD TOPIC']")
	public WebElement DTTAddTopic;

	public WebElement getDTTAddTopic() {
		return DTTAddTopic;
	}

	
	
	@FindBy(xpath ="//button[text()='ADD TOPIC']")
	public WebElement TTTAddTopic;

	public WebElement getTTTAddTopic() {
		return TTTAddTopic;
	}
	
	
	@FindBy(xpath ="//button[text()='Add Resource']")
	public WebElement TTTAddResource;

	public WebElement getTTTAddResource() {
		return TTTAddResource;
	}
	
	@FindBy(xpath ="//button[text()='Add Resource']")
	public WebElement EPAddResource;

	public WebElement getEPAddResource() {
		return EPAddResource;
	}
	
/////////////////////////////////////////////////////////////EXPORT ICONS/////////////////////////////////
	@FindBy(xpath ="//span[@class='transIcon-export']")
	public WebElement ExportButton;

	public WebElement getExportButton() {
		return ExportButton;
	}
	
	@FindBy(xpath ="//a[text()='EXPORT ']//span[@class='transIcon-export']")
	public WebElement PlanSetUpExportButton;

	public WebElement getPlanSetUpExportButton() {
		return PlanSetUpExportButton;
	}
	
	@FindBy(xpath ="//a[text()='Excel']")
	public WebElement PlanSetUpExcelButton;

	public WebElement getPlanSetUpExcelButton() {
		return PlanSetUpExcelButton;
	}
	
	@FindBy(xpath ="//ul[@aria-expanded='true']//a[text()='Excel']")
	public WebElement PlanSetUpImpExcelButton;

	public WebElement getPlanSetUpImpExcelButton() {
		return PlanSetUpImpExcelButton;
	}
	
	@FindBy(xpath ="//span[@class='transIcon-import']//following::a[text()='Excel']")
	public WebElement PlanActualsExceldropdwon;

	public WebElement getPlanActualsExceldropdwon() {
		return PlanActualsExceldropdwon;
	}
	
	
	@FindBy(xpath ="//li//a[@ng-click='TravelTrackerExport()']//span[@class='transIcon-export']")
	public WebElement ExportButton1;

	public WebElement getExportButton1() {
		return ExportButton1;
	}
	
	@FindBy(xpath ="//li//a[@ng-click='AssessmentExport()']//span[@class='transIcon-export']")
	public WebElement AssessmentExportButton;

	public WebElement getAssessmentExportButton() {
		return AssessmentExportButton;
	}

	@FindBy(xpath ="//li//a[@ng-click='ExportAppAccessData()']//span[@class='transIcon-export']")
	public WebElement ExportButton4;

	public WebElement getAssessmentExportButton4() {
		return ExportButton4;
	}
	
	@FindBy(xpath ="//li//a[@ng-click='SRTLogExcel()']//span[@class='transIcon-export']")
	public WebElement ExportButton5;

	public WebElement getAssessmentExportButton5() {
		return ExportButton5;
	}
	
	@FindBy(xpath ="//li//a[@ng-click='SRTLogExcel()']//span[@class='transIcon-export']")
	public WebElement ExportButton6;

	public WebElement getAssessmentExportButton6() {
		return ExportButton6;
	}
	
	@FindBy(xpath ="//li//a[@ng-click='Export()']//span[@class='transIcon-export']")
	public WebElement ExportButton7;

	public WebElement getAssessmentExportButton7() {
		return ExportButton7;
	}
	
	//////////////////////////////////Import Buttons/////////////////////////////////////////////////
	@FindBy(xpath ="//span[@class='transIcon-import']")
	public WebElement ImportButton;

	public WebElement getImportButton() {
		return ImportButton;
	}
	
	@FindBy(xpath ="//li//a[@ng-click='Import()']//span[@class='transIcon-import']")
	public WebElement TTTrackerImportButton;

	public WebElement getTTTrackerImportButton() {
		return TTTrackerImportButton;
	}
	
	
	
	@FindBy(xpath ="//li//a[@ng-click='FileUploadTravel()']//span[@class='transIcon-import']")
	public WebElement ImportButton1;

	public WebElement getImportButton1() {
		return ImportButton1;
	}
	
	@FindBy(xpath ="//li//a[@ng-click='AssessmentImport()']//span[@class='transIcon-import']")
	public WebElement AssessmentImportButton;

	public WebElement getAssessmentImportButton() {
		return AssessmentImportButton;
	}

	
	@FindBy(xpath = "//button[@ng-click='Upload()']")
	public WebElement TTTLinkArtfacts;

	public WebElement getTTTLinkArtfacts() {
		return TTTLinkArtfacts;
	}
	
	
	
	
	@FindBy(xpath ="//li//a[@ng-click='TweImport()']//span[@class='transIcon-import']")
	public WebElement ImportButton2;

	public WebElement getImportButton2() {
		return ImportButton2;
	}
	
	@FindBy(xpath ="//li//a[@ng-click='ImportAppAccessData()']//span[@class='transIcon-import']")
	public WebElement ImportButton3;

	public WebElement getImportButton3() {
		return ImportButton3;
	}
	
	@FindBy(xpath ="//li//a[@ng-click='ImportSRT()']//span[@class='transIcon-import']")
	public WebElement ImportButton4;

	public WebElement getImportButton4() {
		return ImportButton4;
	}
	
	@FindBy(xpath ="//li//a[@ng-click='FileUpload()']//span[@class='transIcon-import']")
	public WebElement ImportButton5;

	public WebElement getImportButton5() {
		return ImportButton5	;
	}
	
	@FindBy(xpath ="//input[@id='txtStartDate']")
	public WebElement Plannedstrtdt;

	public WebElement getPlannedstrtdt() {
		return Plannedstrtdt;
	}
	
	@FindBy(xpath ="//input[@id='PlannedStartDt']")
	public WebElement Plannedstrtdt1;

	public WebElement getPlannedstrtdt1() {
		return Plannedstrtdt1;
	}

	@FindBy(xpath ="//input[@id='txtPlannedStartDate']")
	public WebElement PlanStrtdtExecSumm;

	public WebElement getPlanStrtdtExecSumm() {
		return PlanStrtdtExecSumm;
	}
	
	@FindBy(xpath ="//input[@id='txtPlannedEndDate']")
	public WebElement PlanEnddtExecSumm;

	public WebElement getPlanEnddtExecSumm() {
		return PlanEnddtExecSumm;
	}
	
	@FindBy(xpath ="//ul[@id='nav']//li//a[text()='Execution Summary']")
	public WebElement ExecSummaryBookamrk;

	public WebElement getExecSummaryBookamrk() {
		return ExecSummaryBookamrk;
	}
	
	
	@FindBy(xpath ="//input[@id='txtEndDate']")
	public WebElement Plannedenddt;

	public WebElement getPlannedenddt() {
		return Plannedenddt	;
	}
	
	@FindBy(xpath ="//input[@id='PlannedEndDt']")
	public WebElement Plannedenddt1;

	public WebElement getPlannedenddt1() {
		return Plannedenddt1;
	}
	
	@FindBy(xpath ="//input[@id='OwnerNm']")
	public WebElement OwnerName;

	public WebElement getOwnerName() {
		return OwnerName;
	}
	
	@FindBy(xpath ="//input[@id='txtOwner']")
	public WebElement OwnNmExecSumm;

	public WebElement getOwnNmExecSumm() {
		return OwnNmExecSumm;
	}
	
	
	
	@FindBy(xpath ="//input[@id='TaskDesc']")
	public WebElement ActvityTxtbox;

	public WebElement getActvityTxtbox() {
		return ActvityTxtbox;
	}
	
	@FindBy(xpath ="//input[@id='txtActivity']")
	public WebElement ActvityExecSumm;

	public WebElement getActvityExecSumm() {
		return ActvityExecSumm;
	}
	
	
	
	
	@FindBy(xpath ="*//div[label='Transition Type*']//span//span[1]")
	public WebElement TransitionType;

	public WebElement getTransitionType() {
		return TransitionType	;
	}
	
	@FindBy(xpath ="//div[@class='k-edit-form-container']//div[label='Deal/ Wave*']//span//span[1]")
	public WebElement ProjectStaffingDealWave;

	public WebElement getProjectStaffingDealWave() {
		return ProjectStaffingDealWave	;
	}
	
	@FindBy(xpath ="//div[label='Deal/ Wave*']//span//span[1]")
	public WebElement ProjectStaffingDealWaveAdd;

	public WebElement getProjectStaffingDealWaveAdd() {
		return ProjectStaffingDealWaveAdd	;
	}
	
	@FindBy(xpath ="//input[@id='UserName']")
	public WebElement ProjectStaffingRsrceName;

	public WebElement getProjectStaffingRsrceName() {
		return ProjectStaffingRsrceName	;
	}
	
	
	
	@FindBy(xpath ="*//div[label='Receiving Location*']//span//span[1]")
	public WebElement RecevngLocation;

	public WebElement getRecevngLocation() {
		return RecevngLocation;
	}
	
	
	
	
	@FindBy(xpath ="//input[@id='txtWaveName']")
	public WebElement Wavename;

	public WebElement getWavename() {
		return Wavename	;
	}
	
	@FindBy(xpath ="//*[@id='transOffName_taglist']//following::input[1]")
	public WebElement Offering;

	public WebElement getOffering() {
		return Offering	;
	}
	
	@FindBy(xpath ="//*[@id='transServiceName_taglist']//following::input[1]")
	public WebElement Function;

	public WebElement getFunction() {
		return Function	;
	}
	
	@FindBy(xpath ="//*[@id='transCompName_taglist']//following::input[1]")
	public WebElement Technology;

	public WebElement getTechnology() {
		return Technology;
	}
	
	@FindBy(xpath ="//*[@id='transGantt_taglist']//following::input[1]")
	public WebElement SendingLocatn;

	public WebElement getSendingLocatn() {
		return SendingLocatn;
	}
	
	@FindBy(xpath ="//input[@id='goliveDate']")
	public WebElement GoLiveDate;

	public WebElement getGoLiveDate() {
		return GoLiveDate;
	}
	
	@FindBy(xpath ="//input[@id='OnDt']")
	public WebElement OnBoardDate;

	public WebElement getOnBoardDate() {
		return OnBoardDate	;
	}
	
	@FindBy(xpath ="//input[@id='basefte']")
	public WebElement BaseFte;

	public WebElement getBaseFte() {
		return BaseFte	;
	}
	
	@FindBy(xpath ="//input[@id='bufferfte']")
	public WebElement BufferFte;

	public WebElement getBufferFte() {
		return BufferFte	;
	}
	
	@FindBy(xpath ="//textarea[@id='component']")
	public WebElement Othearea;

	public WebElement getOthearea() {
		return Othearea	;
	}
	
	@FindBy(xpath ="//table//tbody//tr[1]//td[8]//span")
	public WebElement WaveWrkstrmeditcheck;

	public WebElement getWaveWrkstrmeditcheck() {
		return WaveWrkstrmeditcheck	;
	}
	
	
	@FindBy(xpath ="//table//tbody//tr[1]//td[5]")
	public WebElement ProjwrkstrmLeveleditcheck;

	public WebElement getProjwrkstrmLeveleditcheck() {
		return ProjwrkstrmLeveleditcheck;
	}
	
	
	
	@FindBy(xpath ="//table//tbody//tr[1]//td[7]")
	public WebElement WaveSetUpeditcheck;

	public WebElement getWaveSetUpeditcheck() {
		return WaveSetUpeditcheck	;
	}
	
	@FindBy(xpath ="//table//tbody//tr[1]//td[14]")
	public WebElement ProjectStaffingeditcheck;

	public WebElement getProjectStaffingeditcheck() {
		return ProjectStaffingeditcheck	;
	}
	
	@FindBy(xpath ="*//div[label='Level*']//span//span[1]")
	public WebElement ProjStaffAddLevel;

	public WebElement getProjStaffAddLevel() {
		return ProjStaffAddLevel;
	}
	
	
	@FindBy(xpath ="*//div[label='Location*']//span//span[1]")
	public WebElement AddLocation;

	public WebElement getAddLocation() {
		return AddLocation;
	}
	
	@FindBy(xpath ="*//div[label='Sourcing*']//span//span[1]")
	public WebElement AddSourcing;

	public WebElement getAddSourcing() {
		return AddSourcing;
	}
	
	@FindBy(xpath ="//table//tbody//tr[1]//td[11]")
	public WebElement ProjctUserAccessEditCheck;

	public WebElement getProjctUserAccessEditCheck() {
		return ProjctUserAccessEditCheck;
	}

	
	@FindAll(@FindBy(xpath ="//table[@role='grid']//tbody//tr//td[2]"))
	public java.util.List<WebElement> AddedRoleinPrjUserAccess;

	public List<WebElement> getAddedRoleinPrjUserAccess() {
		return AddedRoleinPrjUserAccess;
	}
	
	
	@FindAll(@FindBy(xpath ="//table[@role='grid']//tbody//tr//td[5]"))
	public java.util.List<WebElement> AddedArtifact;

	public List<WebElement> getAddedArtifact() {
		return AddedArtifact;
	}
	
	@FindBy(xpath ="//table[@role='grid']//tbody//tr[1]//td[5]")
	public WebElement EditedProjectStaffArtifactCheck;

	public WebElement getEditedProjectStaffArtifactCheck() {
		return EditedProjectStaffArtifactCheck;
	}
	
	@FindBy(xpath ="//table[@role='grid']//tbody//tr[1]//td[5]")
	public WebElement EditedArtifactCheck;

	public WebElement getEditedArtifactCheck() {
		return EditedArtifactCheck;
	}
	
	@FindBy(xpath ="//span[@class='toolTip-space ng-binding ng-scope ng-isolate-scope']")
	public WebElement Tooltipname;

	public WebElement getTooltipname() {
		return Tooltipname;
	}
	
	
	
	
	@FindAll(@FindBy(xpath ="//table[@role='grid']//tbody//tr//td[3]"))
	public java.util.List<WebElement> AddedWrkStrm;

	public List<WebElement> getAddedWrkStrm() {
		return AddedWrkStrm;
	}
	
	@FindAll(@FindBy(xpath ="//table[@role='grid']//tbody//tr//td[16]"))
	public java.util.List<WebElement> AddedActivity;

	public List<WebElement> getAddedActivity() {
		return AddedActivity;
	}
	
	@FindAll(@FindBy(xpath ="//table[@role='grid']//tbody//tr//td[5]"))
	public java.util.List<WebElement> AddedActivityMobilisation;

	public List<WebElement> getAddedActivityMobilisation() {
		return AddedActivityMobilisation;
	}
	
	
	@FindAll(@FindBy(xpath ="//span[@ng-bind='dataItem.name']"))
	public java.util.List<WebElement> AddedWave;

	public List<WebElement> getAddedWave() {
		return AddedWave;
	}
	
	@FindAll(@FindBy(xpath ="//table//tbody//tr//td"))
	public java.util.List<WebElement> Artifactstable;

	public List<WebElement> getArtifactstable() {
		return Artifactstable;
	}
	
	@FindAll(@FindBy(xpath ="//tr//td//span[@class='k-icon k-i-edit']"))
	public java.util.List<WebElement> ProjStaffActUserAccessEdit;

	public List<WebElement> getProjStaffActUserAccessEdit() {
		return ProjStaffActUserAccessEdit;
	}
	
	// Tracker Menu Icon
		@FindBy(xpath = "//ul/li/a[contains(text(),'30/60/90 Day(Tracking)')]")
		public WebElement TrackerMenuIcon;

		public WebElement getTrackerMenuIcon() {
			return TrackerMenuIcon;
		}
		
		// Add button in Risk screen
		@FindBy(xpath = "//button[@id='btnAddRisk']")
		public WebElement AddRiskButton;

		public WebElement getAddRiskButton() {
			return AddRiskButton;
		}
		
		// Close button in Risk Screen

		@FindBy(xpath = "//span[@class='k-icon k-i-close']")
		public WebElement RiskCloseButton;

		public WebElement getRiskCloseButton() {
			return RiskCloseButton;
		}

		
		// Add button in Issue screen
		@FindBy(xpath = "//button[@id='btnAddNewRow']")
		public WebElement AddIssueButton;

		public WebElement getAddIssueButton() {
			return AddIssueButton;
		}

		// Add button in Action screen
		@FindBy(xpath = "//button[@id='addRowBtn']")
		public WebElement AddActionButton;

		public WebElement getAddActionButton() {
			return AddActionButton;
		}
		
		// Add button in Assumption screen
		@FindBy(xpath = "//button[@id='btnAddAssumptions']")
		public WebElement AddAssumptionButton;

		public WebElement getAddAssumptionButton() {
			return AddAssumptionButton;
		}
		// PMO LINK TO ARTIFACTS in Change Management Screen
		@FindBy(xpath = "//ul[@class='quick-links']//li/a[@ng-click='RedirectToArtifact()']")
		public WebElement ChangeLinkToArtifacts;

		public WebElement getChangeLinkToArtifacts() {
			return ChangeLinkToArtifacts;
		}

		// Add button in Decision screen
		@FindBy(xpath = "//button[@id='decisionaddid']")
		public WebElement AddDecisionButton;

		public WebElement getAddDecisionButton() {
			return AddDecisionButton;
		}


		// Tracker Header Icon
		@FindBy(xpath="//div[@class='mpop_hd']")
		public WebElement TrackerHeaderIcon;

		public WebElement getTrackerHeaderIcon() {
			return TrackerHeaderIcon;
		}
		
		//WaveName in Tracker Screen
		
		@FindBy(xpath="//div[@class='mpop_ct']/div/ul/li/a[contains(text(),' test(BPO)')]")
		public WebElement WaveName;

		public WebElement getWaveName() {
			return WaveName;
		}
		

		// Add Tracker Button in 30/60/90 Tracker

		@FindBy(xpath = "//ul/li/button[@id='AddProjUserAccessbtn']")
		public WebElement AddTrackerButton;

		public WebElement getAddTrackerButton() {
			return AddTrackerButton;
		}

		// Import and Export Button in 30/60/90 Tracker Screen

		@FindBy(xpath = "//ul/li/a[@ng-click='ImportData()']")
		public WebElement ImportTrackerButton;

		public WebElement getImportTrackerButton() {
			return ImportTrackerButton;
		}

		@FindBy(xpath = "//ul[@class='quick-links']/li[2]/a[@ ng-click='ExportData()']")
		public WebElement ExportTrackerButton;

		public WebElement getExportTrackerButton() {
			return ExportTrackerButton;
		}

		// Close Icon in add Tracker Screen

		@FindBy(xpath = "//div[@class='k-window-actions']/a[@role='button']")
		public WebElement TrackerCloseIcon;

		public WebElement getTrackerCloseIcon() {
			return TrackerCloseIcon;
		}

		// Approval Buttons in 30/60/90 Tracker Screen
		@FindBy(xpath = "//div/button[@id='btnsendGLapproval']")
		public WebElement GlobalSDOApprovalbutton;

		public WebElement getGlobalSDOApprovalbutton() {
			return GlobalSDOApprovalbutton;
		}

		@FindBy(xpath = "//div/button[@id='btnsendSDOapproval']")
		public WebElement GLApprovalbutton;

		public WebElement getGLApprovalbutton() {
			return GLApprovalbutton;
		}

		//SRT Screen
		@FindBy(xpath = "//a[@ng-click='RedirectSR()']")
		public WebElement SRTDsbrdbtn;

		public WebElement getSRTsbrdbtn() {
			return SRTDsbrdbtn;
		}

		// PCT Screen

		@FindBy(xpath = "//button[@id='btnSendforApproval']")
		public WebElement TableLevelApprovalbtn1;

		public WebElement getTableLevelApprovalbtn1() {
			return TableLevelApprovalbtn1;
		}

		
		// SRT in Execution Screen
		@FindBy(xpath = "//ul/li/button[@id='activitySaveBtn']")
		public WebElement SRTAddActivity;

		public WebElement getSRTAddActivity() {
			return SRTAddActivity;
		}
		
		@FindBy(xpath="//td/a [@class='k-button k-button-icontext k-grid-edit']/span[@class='k-icon k-i-edit']")
		public WebElement SRTEditActivity;
		
		public WebElement getSRTEditActivity() {
			return SRTEditActivity;
		}
		
		@FindBy(xpath="//div[@class='k-window-actions']/a/span")
		public WebElement SRTCloseIcon;
		
		public WebElement getSRTCloseIcon() {
			return SRTCloseIcon;
		}
		
		// Project Logs Risk Screen

		@FindBy(xpath = "//li//a[@ng-click='OverAllExcel()']//span[@class='transIcon-export']")
		public WebElement ExportAllButton1;

		public WebElement getExportAllButton1() {
			return ExportAllButton1;
		}

		// Project Logs Issue Screen

		@FindBy(xpath = "//li//a[@ng-click='OverAllExcel()']//span[@class='transIcon-export']")
		public WebElement ExportAllButton2;

		public WebElement getExportAllButton2() {
			return ExportAllButton2;
		}

		// Project Logs Action Screen

		@FindBy(xpath = "//li//a[@ng-click='OverAllExcel()']//span[@class='transIcon-export']")
		public WebElement ExportAllButton3;

		public WebElement getExportAllButton3() {
			return ExportAllButton3;
		}
		// Project Logs Decision Screen

		@FindBy(xpath = "//li//a[@ng-click='OverAllExcel()']//span[@class='transIcon-export']")
		public WebElement ExportAllButton4;

		public WebElement getExportAllButton4() {
			return ExportAllButton4;
		}
		// Project Logs Assumption Screen

		@FindBy(xpath = "//li//a[@ng-click='OverAllExcel()']//span[@class='transIcon-export']")
		public WebElement ExportAllButton5;

		public WebElement getExportAllButton5() {
			return ExportAllButton5;
		}

		// Project Logs Risk Icon

		@FindBy(xpath = "//span[@class='transIcon-PMO_and_governance icon']")
		public WebElement PMOGovernanceMenuIcon;

		public WebElement getPMOGovernanceMenuIcon() {
			return PMOGovernanceMenuIcon;
		}

		@FindBy(xpath = "//a[@ng-click='RedirectProjectlogs()']")

		public WebElement ProjectLogsRiskIcon;

		public WebElement getProjectLogsRiskIcon() {
			return ProjectLogsRiskIcon;
		}

		// Project Logs Issue Icon

		@FindBy(xpath = "//a[@href='/PMO/PMOLogs/PMO?pagename=1&fromSnapshot=false']")

		public WebElement ProjectLogsIssueIcon;

		public WebElement getProjectLogsIssueIcon() {
			return ProjectLogsIssueIcon;
		}

		// Project Logs Action Icon

		@FindBy(xpath = "//a[@href='/PMO/PMOLogs/PMO?pagename=2&fromSnapshot=false']")

		public WebElement ProjectLogsActionIcon;

		public WebElement getProjectLogsActionIcon() {
			return ProjectLogsActionIcon;
		}

		// Project Logs Decision Icon

		@FindBy(xpath = "//a[@href='/PMO/PMOLogs/PMO?pagename=3&fromSnapshot=false']")

		public WebElement ProjectLogsDecisionIcon;

		public WebElement getProjectLogsDecisionIcon() {
			return ProjectLogsDecisionIcon;
		}

		// Project Logs Assumption Icon

		@FindBy(xpath = "//a[@href='/PMO/PMOLogs/PMO?pagename=4&fromSnapshot=false']")

		public WebElement ProjectLogsAssumptionIcon;

		public WebElement getProjectLogsAssumptionIcon() {
			return ProjectLogsAssumptionIcon;
		}

		// PCT Screen Icon

		@FindBy(xpath = "//a[@href='/ControlFramework/ControlFramework/ControlFramework']")

		public WebElement PCTIcon;

		public WebElement getPCTIcon() {
			return PCTIcon;
		}
		// @FindBy(xpath ="//div[@class='k-grid-content-locked']//span class")
		@FindBy(xpath = "//span[@class='k-icon k-i-edit']")
		public WebElement EditPCTIcon;

		public WebElement getEditPCTIcon() {
			return EditPCTIcon;
		}

		// Meetings Screen
		@FindBy(xpath = "//li/a[@ng-click='RedirectPMOmeeting()']")
		public WebElement MeetingsIcon;

		public WebElement getMeetingsIcon() {
			return MeetingsIcon;
		}

		@FindBy(xpath = "//ul/li/button[@ng-click='AddMinutesPage()()']")
		public WebElement AddAdhocMeetingMinutesButton;

		public WebElement getAddAdhocMeetingMinutesButton() {
			return AddAdhocMeetingMinutesButton;
		}

		@FindBy(xpath = "//button[@ng-click='SaveMeetingLog()']")
		public WebElement SaveMeetingsButton;

		public WebElement getSaveMeetingsButton() {
			return SaveMeetingsButton;
		}

		@FindBy(xpath = "//button[@ng-click='EmailMOM()']")
		public WebElement EmailMOMButton;

		public WebElement getEmailMomButton() {
			return EmailMOMButton;
		}

		@FindBy(xpath = "//button[@ng-click='MeetingExcel()']")
		public WebElement MeetingExportButton;

		public WebElement getMeetingExportButton() {
			return MeetingExportButton;
		}

		// RAID sections in Meetings Screen

		@FindBy(xpath = "//ul/li/a[@id='risksA']")

		public WebElement RiskIcon;

		public WebElement getRiskIcon() {
			return RiskIcon;
		}

		@FindBy(xpath = "//div[@class='form-group col-xs-12']/descendant::button[@ng-click='AddriskinGrid()']")

		public WebElement RiskFetchButton;

		public WebElement getRiskFetchButton() {
			return RiskFetchButton;
		}

		@FindBy(xpath = "//ul/li/button[@id='btnAddRisk']")

		public WebElement RiskADDButton;

		public WebElement getRiskADDButton() {
			return RiskADDButton;
		}

		@FindBy(xpath = "//ul/li/a[@id='issuesA']")
		public WebElement IssueIcon;

		public WebElement getIssueIcon() {
			return IssueIcon;
		}

		@FindBy(xpath = "//div[@class='form-group col-xs-12']/descendant::button[@ng-click='AddIssueinGrid()']")
		public WebElement IssueFetchButton;

		public WebElement getIssueFetchButton() {
			return IssueFetchButton;
		}

		@FindBy(xpath = "//ul/li/button[@id='btnAddIssue']")

		public WebElement IssueADDButton;

		public WebElement getIssueADDButton() {
			return IssueADDButton;
		}

		@FindBy(xpath = "//ul/li/a[@id='actionsA']")
		public WebElement ActionIcon;

		public WebElement getActionIcon() {
			return ActionIcon;
		}

		@FindBy(xpath = "//div[@class='form-group col-xs-12']/descendant::button[@ng-click='AddActioninGrid()']")
		public WebElement ActionFetchButton;

		public WebElement getActionFetchButton() {
			return ActionFetchButton;
		}

		@FindBy(xpath = "//ul/li/button[@id='addRowBtn']")
		public WebElement ActionADDButton;

		public WebElement getActionADDButton() {
			return ActionADDButton;
		}

		@FindBy(xpath = "//ul/li/a[@id='decisionsA']")
		public WebElement DecisionIcon;

		public WebElement getDecisionIcon() {
			return DecisionIcon;
		}

		@FindBy(xpath = "//div[@class='form-group col-xs-12']/descendant::button[@ng-click='AddDecisioninGrid()']")
		public WebElement DecisionFetchButton;

		public WebElement getDecisionFetchButton() {
			return DecisionFetchButton;
		}

		@FindBy(xpath = "//ul/li/button[@id='btnAddDecision']")
		public WebElement DecisionADDButton;

		public WebElement getDecisionADDButton() {
			return DecisionADDButton;
		}

		@FindBy(xpath = "//ul/li/a[@id='assumpA']")
		public WebElement AssumptionIcon;

		public WebElement getAssumptionIcon() {
			return AssumptionIcon;
		}

		@FindBy(xpath = "//div[@class='form-group col-xs-12']/descendant::button[@ng-click='AddAssumpinGrid()']")
		public WebElement AssumptionFetchButton;

		public WebElement getAssumptionFetchButton() {
			return AssumptionFetchButton;
		}

		@FindBy(xpath = "//ul/li/button[@id='btnAddAssumptions']")
		public WebElement AssumptionADDButton;

		public WebElement getAssumptionADDButton() {
			return AssumptionADDButton;
		}

		// Handled USM on ADDMETTINGSCHEDULE Button in Management Operating System
		// Screen

		@FindBy(xpath = "//li/button[@ng-click='addMeeting()']")
		public WebElement AddMeetingScheduleButton;

		public WebElement getAddMeetingScheduleButton() {
			return AddMeetingScheduleButton;
		}

		@FindBy(xpath = "//tr/td/button[@ng-click='ValidateAttandance()']")
		public WebElement Add1Button;

		public WebElement getAdd1Button() {
			return Add1Button;
		}

		@FindBy(xpath = "//tr/td/button[@ng-click='ValidateClientAttandance()']")
		public WebElement Add2Button;

		public WebElement getAdd2Button() {
			return Add2Button;
		}

		@FindBy(xpath = "//ul/li[1]/a[@ng-click='selectRecurrence(item)']")
		public WebElement OccuranceIcon1;

		public WebElement getOccuranceIcon1() {
			return OccuranceIcon1;
		}

		@FindBy(xpath = "//ul/li[2]/a[@ng-click='selectRecurrence(item)']")
		public WebElement OccuranceIcon2;

		public WebElement getOccuranceIcon2() {
			return OccuranceIcon2;
		}

		@FindBy(xpath = "//ul/li[3]/a[@ng-click='selectRecurrence(item)']")
		public WebElement OccuranceIcon3;

		public WebElement getOccuranceIcon3() {
			return OccuranceIcon3;
		}

		@FindBy(xpath = "//ul/li[4]/a[@ng-click='selectRecurrence(item)']")
		public WebElement OccuranceIcon4;

		public WebElement getOccuranceIcon4() {
			return OccuranceIcon4;
		}

		@FindBy(xpath = "//ul/li[5]/a[@ng-click='selectRecurrence(item)']")
		public WebElement OccuranceIcon5;

		public WebElement getOccuranceIcon5() {
			return OccuranceIcon5;
		}

		@FindBy(xpath = "//div/a[@role='button']")
		public WebElement OccuranceClosebutton;

		public WebElement getOccuranceClosebutton() {
			return OccuranceClosebutton;
		}

		@FindBy(xpath = "//div/button[@ng-click='SaveMeetingStatement()']")
		public WebElement SaveMeetingbutton;

		public WebElement getSaveMeetingbutton() {
			return SaveMeetingbutton;
		}

		// close button in Meetings Screen
		@FindBy(xpath = "//li/button[@ng-click='RedrtPMOMeetings()']")
		public WebElement MOMCloseButton;

		public WebElement getMOMCloseButton() {
			return MOMCloseButton;
		}

		// Add Meetings button in Meetings Screen

		@FindBy(xpath = "//li/button[@ng-click='GOTOADDMEETINGPAGE()']")
		public WebElement AddMOMButton;

		public WebElement getAddMOMButton() {
			return AddMOMButton;
		}

		// Change Management Screen
		@FindBy(xpath = "//a[@href='/PMO/ChangeLog/Change/']")
		public WebElement CmgtIcon;

		public WebElement getCmgtIcon() {
			return CmgtIcon;
		}

		// Add button in Change Management screen
		@FindBy(xpath = "//li/button[@ng-click='addChangeRow()']")
		public WebElement AddChangeButton;

		public WebElement getAddChangeButton() {
			return AddChangeButton;
		}

		// Governance Dashboard Screen

		@FindBy(xpath = "//ul/li/a[@href=\"/StageGate/StageGate/Dashboard\"]")
		public WebElement GovernanceIcon;

		public WebElement getGovernanceIcon() {
			return GovernanceIcon;
		}

		// Stabilization Screen
		@FindBy(xpath = "//ul/li/a/span[@class='transIcon-stabilization icon']")
		public WebElement StabilizationMenuIcon;

		public WebElement getStabilizationMenuIcon() {
			return StabilizationMenuIcon;
		}

		// Stabilization Summary Icon
		@FindBy(xpath = "//ul/li/a[@ng-click='RedirectStabilizationSummary()']")
		public WebElement StabilizationSummaryIcon;

		public WebElement getStabilizationSummaryIcon() {
			return StabilizationSummaryIcon;
		}

		// Checking WaveID in 30/60/90 Tracker
		@FindBy(xpath = "//tr/td/a[@href='/HandoverToOperation/OpenItem/OpenItems?subwaveId=1966']")

		public WebElement WaveId;

		public WebElement getWaveId() {
			return WaveId;
		}


	
	
	
}
