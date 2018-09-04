package pagefactory;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransItUIMap {
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
	
	@FindBy(xpath = "//*[@title='Create Project']")
	public WebElement createProject;

	public WebElement getCreateProject() {
		return createProject;
	}
	
	@FindBy(xpath = "//div[@class='cards']//div//h1[@title='9thMar2018']")
	public WebElement projectCard;

	public WebElement getProjectCard1() {
		return projectCard;
	}
	
	@FindBy(id = "moreAction")
	public WebElement moreAction;

	public WebElement getMoreAction() {
		return moreAction;
	}

	@FindBy(xpath = "//*[@class = 'transIcon-plan icon']")
	public WebElement planTab;

	public WebElement getPlanTab() {
		return planTab;
	}
	
	@FindBy(xpath = "//*[@class = 'transIcon-execution icon']")
	public WebElement executionTab;

	public WebElement getExecutionTab() {
		return executionTab;
	}
	
	@FindBy(xpath = "//*[@class = 'transIcon-PMO_and_governance icon']")
	public WebElement pMOnGTab;

	public WebElement getPMOnGTab() {
		return pMOnGTab;
	}
	
	@FindBy(xpath = "//*[@class = 'transIcon-quick-link icon']")
	public WebElement quickLinksTab;

	public WebElement getQuickLinksTab() {
		return quickLinksTab;
	}
	
	@FindBy(xpath = "//*[@class = 'transIcon-stabilization icon']")
	public WebElement stabalizationTab;

	public WebElement getStabalizationTab() {
		return stabalizationTab;
	}
	
	@FindBy(xpath = "//*[@class = 'transIcon-reports icon']")
	public WebElement reportTab;

	public WebElement getReportTab() {
		return reportTab;
	}
	
	@FindBy(xpath = "//*[text()='Deal Information']")
	public WebElement plan_DealInfo;

	public WebElement getPlan_DealInfo() {
		return plan_DealInfo;
	}
	
	@FindBy(xpath = "//*[text()='MEC Checklist']")
	public WebElement plan_MEC;

	public WebElement getPlan_MEC() {
		return plan_MEC;
	}
	
	@FindBy(xpath = "//*[text()='Transition Plan']")
	public WebElement plan_TransPlan;

	public WebElement getPlan_TransPlan() {
		return plan_TransPlan;
	}
	
	@FindBy(xpath = "//*[text()='Project Staffing']")
	public WebElement plan_Staffing;

	public WebElement getPlan_Staffing() {
		return plan_Staffing;
	}
	
	@FindBy(xpath = "//*[text()='Project Artifacts']")
	public WebElement plan_Artifact;

	public WebElement getPlan_Artifact() {
		return plan_Artifact;
	}
	
	@FindBy(xpath = "//*[text()='Project Plan Setup']")
	public WebElement plan_Setup;

	public WebElement getPlan_Setup() {
		return plan_Setup;
	}
	
	@FindBy(xpath = "//*[@class= 'module-title'][contains(text(),'Plan')]//parent::div//p")
	public WebElement plan_Description;

	public WebElement getPlan_Description() {
		return plan_Description;
	}
	
	@FindBy(xpath = "//*[@class= 'module-title'][contains(text(),'Execution')]//parent::div//p")
	public WebElement execution_Description;

	public WebElement getExecution_Description() {
		return execution_Description;
	}
	
	@FindBy(xpath = "*//div[@class= 'module-title' and text()='Stabilization']//following::p[1]")
	public WebElement stablization_Description;

	public WebElement getStablization_Description() {
		return stablization_Description;
	}
	
	@FindBy(xpath = "//*[@class= 'module-title'][contains(text(),'PMO & Governance')]//parent::div//p")
	public WebElement pMOnG_Description;

	public WebElement getPMOnG_Description() {
		return plan_Description;
	}
	//h1[text()='Deal Information']
	
	@FindBy(xpath = "//h1[text()='Deal Information']")
	public WebElement dealInfoHeader;

	public WebElement getDealInfoHeader() {
		return dealInfoHeader;
	}

	@FindBy(xpath = "//*[@class='navbar navbar-inverse navbar-fixed-top transIT-inner']")
	public WebElement headerBar;

	public WebElement getHeaderBar() {
		return headerBar;
	}
	
	@FindBy(xpath = "//*[@ng-click='ReturntoDmatHome()']")
	public WebElement backHome;

	public WebElement getBackHome() {
		return backHome;
	}
	
	@FindBy(xpath = "//*[@class='transIcon-user_access icon']")
	public WebElement userAccessButton;

	public WebElement getUserAccessButton() {
		return userAccessButton;
	}
	
	@FindBy(xpath = "//*[@ng-click='redirectToLogout()']")
	public WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
	
	@FindBy(xpath = "//*[contains(text(),'View History')]")
	public WebElement viewHistory;

	public WebElement getViewHistory() {
		return viewHistory;
	}
	
	@FindBy(xpath = "//h1[contains(text(),'VIEW HISTORY')]")
	public WebElement viewHistoryHeader;

	public WebElement getViewHistoryHeader() {
		return viewHistoryHeader;
	}
	
	@FindBy(id = "DealInformation_TotalBPOFTE")
	public WebElement dealInfo_totalBPOFTE;

	public WebElement getTotalBPOFTE() {
		return dealInfo_totalBPOFTE;
	}
	
	@FindBy(xpath = "//button[@type='submit'][text()='Save']")
	public WebElement dealInfo_Save;

	public WebElement getSave() {
		return dealInfo_Save;
	}
	
	@FindBy(xpath = "//*[@class= 'transIcon-close']")
	public WebElement close_HistoryView;

	public WebElement getClose_HistoryView() {
		return close_HistoryView;
	}
	
	@FindBy(xpath = "//h2[contains(text(),'Set up the mandatory fields')]")
	public WebElement setupMandatoryFeilds;

	public WebElement getSetupMandatoryFeilds() {
		return setupMandatoryFeilds;
	}
	
	@FindBy(xpath = "//*[contains(text(),'Redirect to Summary')]")
	public WebElement redirectToSummary;

	public WebElement getRedirectToSummary() {
		return redirectToSummary;
	}
	
	@FindBy(xpath = "//tbody[@role='rowgroup']/tr")
	public WebElement rowNumbers;

	public WebElement getRowNumbers() {
		return rowNumbers;
	}
	
	//Bookmarks
	
	@FindBy(xpath = "//a[@aria-label='Bookmark Project Staffing']")
	public WebElement bookmark1;

	public WebElement getBookmark1() {
		return bookmark1;
	}

	@FindBy(xpath = "//a[@aria-label='Bookmark Transition Plan']")
	public WebElement bookmark2;

	public WebElement getBookmark2() {
		return bookmark2;
	}

	@FindBy(xpath = "//a[@aria-label='Bookmark Project Plan']")
	public WebElement bookmark3;

	public WebElement getBookmark3() {
		return bookmark3;
	}

	@FindBy(xpath = "//a[@aria-label='Bookmark Project Artifacts']")
	public WebElement bookmark4;

	public WebElement getBookmark4() {
		return bookmark4;
	}

	@FindBy(xpath = "//a[@aria-label='Bookmark MEC Checklist']")
	public WebElement bookmark5;

	public WebElement getBookmark5() {
		return bookmark5;
	}

	@FindBy(xpath = "//a[@aria-label='Bookmark Deal Info']")
	public WebElement bookmark6;

	public WebElement getBookmark6() {
		return bookmark6;
	}

	@FindBy(xpath = "//a[@aria-label='Bookmark Project Staffing(Actuals)']")
	public WebElement bookmark7;

	public WebElement getBookmark7() {
		return bookmark7;
	}

	@FindBy(xpath = "//a[@aria-label='Bookmark Deal Execution']")
	public WebElement bookmark8;

	public WebElement getBookmark8() {
		return bookmark8;
	}

	@FindBy(xpath = "//a[@aria-label='Bookmark Train the Trainer']")
	public WebElement bookmark9;

	public WebElement getBookmark9() {
		return bookmark9;
	}

	@FindBy(xpath = "//a[@aria-label='Bookmark Delivery Team Training']")
	public WebElement bookmark10;

	public WebElement getBookmark10() {
		return bookmark10;
	}

	@FindBy(xpath = "//a[@aria-label='Show more items']")
	public WebElement showMoreItems;

	public WebElement getshowMoreItems() {
		return showMoreItems;
	}
	
	@FindBy(xpath = "//*[@ng-click='manageDock()']")
	public WebElement manageDock;

	public WebElement getManageDock() {
		return manageDock;
	}
	
	@FindBy(xpath = "//*[@ng-click='redirectToUrl(item.pageName)'][text()='Delivery Team Training']")
	public WebElement BookmarkDock_DeliveryTT;

	public WebElement getBookmarkDock_DeliveryTT() {
		return BookmarkDock_DeliveryTT;
	}
	
	@FindBy(xpath = "//*[@ng-click='redirectToUrl(item.pageName)'][text()='Transition Plan']")
	public WebElement BookmarkDock_TransitionPlan;

	public WebElement getBookmarkDock_TransitionPlan() {
		return BookmarkDock_TransitionPlan;
	}
	
	//Manage link popup
	
	@FindBy(xpath = "//*[@ng-click='closeManageWindow()']")
	public WebElement mL_Cross;

	public WebElement getML_Cross() {
		return mL_Cross;
	}
	
	@FindBy(xpath = "//*[@class='transIcon-default_bookmark dock-icon']")
	public WebElement mL_BMSymbol;

	public WebElement getmL_BMSymbol() {
		return mL_BMSymbol;
	}
	
	@FindBy(xpath = "*//div[@class='k-widget k-window k-window-titleless']//h1")
	public WebElement mL_Text;

	public WebElement getmL_Text() {
		return mL_Text;
	}
	
	@FindBy(xpath = "//*[@ng-click='saveManageLinks()']")
	public WebElement mL_Save;

	public WebElement getmL_Save() {
		return mL_Save;
	}
//	(//*[@class='ng-binding ng-scope']/a/span)[1]
			
	@FindBy(xpath = "(//*[@class='ng-binding ng-scope']/a/span)[1]")
	public WebElement mL_BMClick;

	public WebElement getmL_BMClick() {
		return mL_BMClick;
	}
	
	@FindBy(xpath = "//*[contains(text(),'Link to MEC Artifacts')]")
	public WebElement mEC_Art;

	public WebElement getMEC_Art() {
		return mEC_Art;
	}
	
	@FindBy(xpath = "//h1[text()='MEC Artifacts']")
	public WebElement mECArt_Header;

	public WebElement getMECArt_Header() {
		return mECArt_Header;
	}
	
	@FindBy(xpath = "//*[@title='Bookmark MEC Checklist']")
	public WebElement mECArt_BM;

	public WebElement getMECArt_BM() {
		return mECArt_BM;
	}
	
	@FindBy(xpath = "//*[@ng-click='addmecArtifacts()']")
	public WebElement mECArt_AddArtBttn;

	public WebElement getMECArt_AddArtBttn() {
		return mECArt_AddArtBttn;
	}
	//*[@ng-click='epandGrid('#artifactsGrid')']
	
	@FindBy(xpath = "//*[@class='expand-grid-icon']")
	public WebElement mECArt_exp;

	public WebElement getMECArt_exp() {
		return mECArt_exp;
	}
	
	@FindBy(xpath = "//button[@ng-click='SaveRow()'][text()='SAVE']")
	public WebElement saveSetUpMan;

	public WebElement getSaveSetUpMan() {
		return saveSetUpMan;
	}
	
	@FindBy(xpath = "(//*[text()='Current Project Plan'])[2]")
	public WebElement currProjPlan_Header;

	public WebElement getcurrProjPlan_Header() {
		return currProjPlan_Header;
	}
	
	@FindBy(xpath = "//*[contains(text(),'EXPORT')]")
	public WebElement currProjPlan_Export;

	public WebElement getcurrProjPlan_Export() {
		return currProjPlan_Export;
	}
	
	@FindBy(xpath = "//*[contains(text(),'IMPORT')]")
	public WebElement currProjPlan_Import;

	public WebElement getcurrProjPlan_Import() {
		return currProjPlan_Export;
	}
	//*[@role='tab'][@class='active']
	
	@FindBy(xpath = "//*[@role='tab'][@class='active']")
	public WebElement activeTab;

	public WebElement getactiveTab() {
		return activeTab;
	}
	//li[@class='dropdown open']/ul/li/a[text()="Excel"]
	
	@FindBy(xpath = "//li[@class='dropdown open']/ul/li/a[text()=\"Excel\"]")
	public WebElement dropdownExcel;

	public WebElement getdropdownExcel() {
		return dropdownExcel;
	}
	
	@FindBy(xpath = "//li[@class='dropdown open']/ul/li/a[text()=\"MPP\"]")
	public WebElement dropdownMPP;

	public WebElement getdropdownMPP() {
		return dropdownMPP;
	}
	//*[@ng-click='downloadMPPGuideline()']
	
	@FindBy(xpath = "//*[@ng-click='downloadMPPGuideline()']")
	public WebElement projPlanGuidelines;

	public WebElement getprojPlanGuidelines() {
		return projPlanGuidelines;
	}
	
	@FindBy(id = "info_lnk")
	public WebElement infoLnk;

	public WebElement getinfoLnk() {
		return infoLnk;
	}
	
	@FindBy(xpath = "//*[@aria-describedby='info_lnk_tt_active']")
	public WebElement infoLnktext;

	public WebElement getinfoLnkText() {
		return infoLnktext;
	}
	
	@FindBy(xpath = "//*[@class='expand-grid-icon']")
	public WebElement expanderIcon;

	public WebElement getExpanderIcon() {
		return expanderIcon;
	}
	
	@FindBy(xpath = "//*[@title='Column Settings']/span")
	public WebElement settingsIcon;

	public WebElement getSettingsIcon() {
		return settingsIcon;
	}
	
	@FindBy(xpath = "//*[@role='button' and not(@style)]/span[@class='k-icon k-i-edit']")
	public WebElement rowEditIcon;

	public WebElement getRowEditIcon() {
		return rowEditIcon;
	}
	
	@FindBy(id = "AddRow")
	public WebElement addIcon;

	public WebElement getAddIcon() {
		return addIcon;
	}
	
	@FindBy(xpath = "//*[contains(text(),'ESCAPE')]")
	public WebElement escapeBttn;

	public WebElement getEscapeBttn() {
		return escapeBttn;
	}
	
	@FindBy(xpath = "//*[@aria-owns='OwnerCategory_listbox']//span[@class= 'k-select']")
	public WebElement ownCatDrop;

	public WebElement getOwnCatDrop() {
		return ownCatDrop;
	}
	
	@FindBy(xpath = "//*[@id= 'OwnerCategory_listbox']/li[contains(text(),'Accenture')]")
	public WebElement ownCatList_Acc;

	public WebElement getOwnCatList_Acc() {
		return ownCatList_Acc;
	}
	
	@FindBy(id = "OwnerNm")
	public WebElement ownName;

	public WebElement getOwnName() {
		return ownName;
	}
	
	@FindBy(xpath = "//*[contains(text(),'Save') and @role='button']")
	public WebElement saveBttn;

	public WebElement getSaveBttn() {
		return saveBttn;
	}
	
	@FindBy(id = "btnMessageOK")
	public WebElement okBttn;

	public WebElement getOKBttn() {
		return okBttn;
	}
	
	@FindBy(xpath = "//*[contains(text(),'Accenture')]//parent::td[@role='gridcell']")
	public WebElement displayAcc;

	public WebElement getDisplayAcc() {
		return displayAcc;
	}
	
	@FindBy(xpath = "//*[contains(text(),'Columns')]")
	public WebElement gridSettingsColumn;

	public WebElement getGridSettingsColumn() {
		return gridSettingsColumn;
	}
	
	@FindBy(id = "btnAddRole")
	public WebElement addRole;

	public WebElement getAddRole() {
		return addRole;
	}
	
	@FindBy(xpath = "//*[contains(text(),'ADD ROLE')]")
	public WebElement addRoleHeader;

	public WebElement getAddRoleHeader() {
		return addRoleHeader;
	}
	
	@FindBy(xpath = "//button[@ng-click='SaveRole()']")
	public WebElement addRole_Save;

	public WebElement getAddRole_Save() {
		return addRole_Save;
	}
	
	@FindBy(xpath = "(//*[contains(text(),'is mandatory')])[1]")
	public WebElement addRole_ErrMsg;

	public WebElement getAddRole_ErrMsg() {
		return addRole_ErrMsg;
	}
	
	@FindBy(xpath = "(//*[@class='text-center'])[1]")
	public WebElement firstRow;

	public WebElement getFirstRow() {
		return firstRow;
	}
	
	
	@FindBy(xpath = "//*[@aria-label= 'Close']/span[@class='k-icon k-i-close']")
	public WebElement addActivity_Close;

	public WebElement getAddActivity_Close() {
		return addActivity_Close;
	}
	
	@FindBy(xpath = "//*[contains(text(),'Save')][@role='button']")
	public WebElement addActivity_Save;

	public WebElement getAddActivity_Save() {
		return addActivity_Save;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Level')]//parent::div/input")
	public WebElement addActivity_level;
	
	@FindBy(xpath = "//label[contains(text(),'Wave')]//parent::div/input")
	public WebElement addActivity_Wave;
	
	@FindBy(xpath = "//label[contains(text(),'Workstream')]//parent::div/input")
	public WebElement addActivity_WorkS;
	
	@FindBy(xpath = "//label[contains(text(),'Activity')]//parent::div/input")
	public WebElement addActivity_Activity;
	
	@FindBy(xpath = "//label[contains(text(),'Owner')]//parent::div/span/input")
	public WebElement addActivity_Owner;
	
	@FindBy(xpath = "//label[contains(text(),'Planned Start Date')]//parent::div/span/span/input")
	public WebElement addActivity_Startdate;
	
	@FindBy(xpath = "//label[contains(text(),'Planned End Date')]//parent::div/span/span/input")
	public WebElement addActivity_Enddate;
	
	@FindBy(xpath = "//*[contains(text(),'Automation Testing')]")
	public WebElement addActivity_ValidateRow;
	
	@FindBy(xpath = "//*[@ng-click='ReturntoDmatHome()']")
	public WebElement back;
	
	public WebElement getBack() {
		return back;
	}
	
	@FindBy(xpath = "//*[contains(text(),'Accenture 07th July 2017')][@ng-click='callMEC(dataItem)']")
	public WebElement ProjectCard2;
	
	public WebElement getProjectCard2() {
		return ProjectCard2;
	}
	
	
	@FindBy(xpath = "//a[contains(text(),'EXPORT')]")
	public WebElement exportbutton;
	
	public WebElement getexportbutton() {
		return exportbutton;
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
	
	
	
	
	
}
