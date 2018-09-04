package pagefactory;
import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class ArtifactUI {
	

		@FindBy(xpath = "//*[@class='card-header']")
		public WebElement cardHeader;

		public WebElement getCardHeader() {
			return cardHeader;
		}
		
		@FindBy(xpath = "//*[text()='9thMar2018']")
		public WebElement cardHeader2;

		public WebElement getCardHeader2() {
			return cardHeader2;
		}
		
		@FindBy(xpath = "//*[text()='shubham']")
		public WebElement cardHeader3;

		public WebElement getCardHeader3() {
			return cardHeader3;
		}
		
		@FindBy(xpath = "//h1[@title='shubham']/span[text()='shubham']")
		public WebElement cardHeaderShubham;

		public WebElement getCardHeaderShubham() {
			return cardHeaderShubham;
		}

		@FindBy(xpath = "//div//ul//li//a//span[@class='transIcon-plan icon']")
		public WebElement transIco_planIcon;

		public WebElement getTransIco_PlanIcon() {
			return transIco_planIcon;
		}
		
		@FindBy(xpath = "//li//a[text()='MEC Checklist']")
		public WebElement MEC_Checklist;

		public WebElement getMEC_Checklist() {
			return MEC_Checklist;
		}
				
		@FindBy(xpath = "//*[@id='DocumentUploadBtn']")
		public WebElement ArtifactDocumentUploadbtn;

		public WebElement getArtifactDocumentUploadbtn() {
			return ArtifactDocumentUploadbtn;
		}
		
		
		@FindBy(xpath = "//div[@class='container-fluid internal-page-content']/div[1]/div/ul/li[1]")
		public WebElement addArtifactButton;

		public WebElement getADDArtifactBUtton() {
			return addArtifactButton;
		}
		
		@FindAll(@FindBy(xpath = "//*[@class='k-grid-header']//th"))
		java.util.List<WebElement> listNameofcolums;

		public java.util.List<WebElement> getListNameofcolums() {
			return listNameofcolums;
		}


		@FindBy(xpath = "//a[contains(text(),'FILE NAME')]//ancestor::th//a//span")
		public WebElement nameFilterButton;

		public WebElement getNameFilterButton() {
			return nameFilterButton;
		}
		

		@FindBy(xpath = "//a[contains(text(),'FILE TYPE')]//ancestor::th/a[1]/span")
		public WebElement typeFilterButton;

		public WebElement gettypeFilterButton() {
			return typeFilterButton;
		}
		
		@FindBy(xpath = "//button[@type='submit']//ancestor::div/form/ul/li//input")
		public WebElement firstCheckBox;

		public WebElement getFirstCheckBox() {
			return firstCheckBox;
		}
		
		@FindBy(xpath = "//button[@type='submit']//ancestor::div/form//button[1]")
		public WebElement filterSubmitButton;

		public WebElement getFilterSubmitButton() {
			return filterSubmitButton;
		}
		
		@FindAll(@FindBy(xpath = "//td[5]"))
		java.util.List<WebElement> listAfterfilter;

		public java.util.List<WebElement> getlistAfterfilter() {
			return listAfterfilter;
		}
		
		@FindBy(xpath = "//button[@type='submit']//ancestor::div/form/ul/li[2]//span")
		public WebElement secondCheckBox ;

		public WebElement getSecondCheckBox(){
			return secondCheckBox;
		}
   /////////////////////fourthTestDemo

		@FindAll(@FindBy(xpath = "//a[contains(text(),'FILE NAME ')]//ancestor::thead/following-sibling::tbody//tr//td[5]"))
	   java.util.List<WebElement> listOfFileNameValues;

		public  java.util.List<WebElement> getListOfFileNameValues() {
			return listOfFileNameValues;
		}
		

		@FindBy(xpath = "//a[contains(text(),'FILE NAME')]")
		public WebElement fileNameColum ;

		public WebElement getFileNameColum(){
			return fileNameColum;
		}
		
		@FindBy(xpath = "//a[contains(text(),'FILE NAME')]/span")
		public WebElement fileNameSortButton ;

		public WebElement getFileNameSortButton(){
			return fileNameSortButton;
		}//a[contains(text(),'FILE TYPE')]/span

		@FindBy(xpath = "//a[contains(text(),'FILE TYPE')]")
		public WebElement fileTypeColum ;

		public WebElement getFileTypeColum(){
			return fileTypeColum;
		}

		@FindBy(xpath = "//a[contains(text(),'FILE TYPE')]/span")
		public WebElement fileTypeSortButton ;

		public WebElement getFileTypeSortButton(){
			return fileTypeSortButton;
		}
		////////////First Script WebElement
		
		@FindBy(xpath = "//div[contains(@class,'internal-page-title')]/h1")
		public WebElement MEC_CheckListPageTitle ;

		public WebElement getMEC_CheckListPageTitle(){
			return MEC_CheckListPageTitle;
		}
		
		@FindBy(xpath = "//div[contains(@class,'internal-page-title')]/div[@class='bookmark-this']")
		public WebElement MEC_ChecklistBookMark ;

		public WebElement getMEC_ChecklistBookMark(){
			return MEC_ChecklistBookMark;
		}
		
		@FindBy(xpath = "//div//ul//li//a//span[@class='transIcon-plan icon']")
		public WebElement expander_ICon ;

		public WebElement getExpander_ICon(){
			return expander_ICon;
		}
		
		@FindBy(xpath = "//*[@id='mecartifacts_header']/h1")
		public WebElement addArtifactTitle;

		public WebElement getADDArtifactTitle() {
			return addArtifactTitle;
		}

		@FindBy(xpath = "//*[@id='txtSharePointLoaction']")
		public WebElement txtSharePointLoaction;

		public WebElement getTxtSharePointLoaction() {
			return txtSharePointLoaction;
		}

		@FindBy(xpath = "//*[@id='txtFileName']")
		public WebElement txtFileName;

		public WebElement getTxtFileName() {
			return txtFileName;
		}

		@FindBy(xpath = "//div[@class='k-edit-form-container']/div[3]/a[1]")
		public WebElement addArtifactSaveButton;

		public WebElement getADDArtifactSaveButton() {
			return addArtifactSaveButton;
		}

		@FindBy(xpath = "//*[@id='btnMessageOK']")
		public WebElement addArtifactSaveSuccessfullButton;

		public WebElement getAddArtifactSaveSuccessfullButton() {
			return addArtifactSaveSuccessfullButton;
		}
		
		@FindBy(xpath = "//button[@type='submit']//ancestor::div/form/div/input")
		public WebElement fileNameFilterTextField;

		public WebElement getFileNameFilterTextField() {
			return fileNameFilterTextField;
		}

		@FindBy(xpath = "//button[@type='submit']//ancestor::div/form/div/span")
		public WebElement fileFilterSearchBar;

		public WebElement getFileFilterSearchBar() {
			return fileFilterSearchBar;
		}
		
		@FindAll(@FindBy(xpath = "//button[@type='submit']//ancestor::div/form/ul//li[@style='display: none;']//label//input"))
		java.util.List<WebElement> listOfNotSelectedItem;

		public java.util.List<WebElement> getListOfNotSelectedItem() {
			return listOfNotSelectedItem;
		}
		
		@FindBy(xpath = "//button[@type='submit']//ancestor::div/form//div[@class='k-filter-selected-items']")
		public WebElement numberOFselectedCheckBox;

		public WebElement getNumberOFselectedCheckBox() {
			return numberOFselectedCheckBox;
		}
		
		@FindBy(xpath = "//button[@type='reset']")
		public WebElement resetFilterButton;

		public WebElement getResetFilterButton() {
			return resetFilterButton;
		}

		@FindBy(xpath = "//button[@type='submit']//ancestor::div/form/ul/li/label/span")
		public WebElement firstFilterNameCheckbox;

		public WebElement getFirstFilterNameCheckbox() {
			return firstFilterNameCheckbox;
		}
		
		@FindBy(xpath = "//button[@type='submit']//ancestor::div/form/ul/li/label/input")
		public WebElement firstFilterNameCheckBoxText;

		public WebElement getFirstFilterNameCheckboxText() {
			return firstFilterNameCheckBoxText;
		}
		///////////////////////////   BOOKMARK   ////////////////////////////////////////
		
		
		
		@FindBy(xpath = "//div//ul//li//following-sibling::a[text()='Deal Information']//following::a/span[@class='transIcon-bookmarked']")
		public WebElement bookMarkonDealInformation;

		public WebElement getBookMarkonDealInformation() {
			return bookMarkonDealInformation;
		}
		
		@FindBy(xpath = "//div//ul//li//following-sibling::a[text()='MEC Checklist']//following::a/span[@class='transIcon-bookmarked']")
		public WebElement bookMarkMECchecklist;

		public WebElement getBookMarkMECchecklist() {
			return bookMarkMECchecklist;
		}
		@FindBy(xpath = "//div//ul//li//following-sibling::a[text()='MEC Checklist']//following::a")
		public WebElement bookMarkMECchecklistCheck;

		public WebElement getBookMarkMECchecklistCheck() {
			return bookMarkMECchecklistCheck;
		}
		
		@FindBy(xpath = "//div//ul//li//following-sibling::a[text()='Transition Plan']//following::a/span[@class='transIcon-bookmarked']")
		public WebElement bookMarkTransition_Plan;

		public WebElement getBookMarkTransition_Plan() {
			return bookMarkTransition_Plan;
		}
		
		@FindBy(xpath = "//div//ul//li//following-sibling::a[text()='Project Staffing']//following::a")
		public WebElement bookMarkProject_staffing;

		public WebElement getBookMarkProject_staffing() {
			return bookMarkProject_staffing;
		}
		
		@FindBy(xpath = "//div//ul//li//following-sibling::a[text()='Project Artifacts']//following::a")
		public WebElement bookMarkProject_Artifacts;

		public WebElement getBookMarkProject_Artifacts() {
			return bookMarkProject_Artifacts;
		}
		

		@FindBy(xpath = "//div//ul//li//following-sibling::a[text()='Project Plan Setup']//following::a")
		public WebElement bookMarkProject_planSetup;

		public WebElement getBookMarkProject_planSetup() {
			return bookMarkProject_planSetup;
		}
		
		@FindBy(xpath = "//button[@type='button'][@class='close'][@data-dismiss='modal']/span[@class='acn-cross']")
		public WebElement croosButtonInPlanMenu;

		public WebElement getCroosButtonInPlanMenu() {
			return croosButtonInPlanMenu;
		}
		
		@FindBy(xpath = "//div//ul//li//following-sibling::a[text()='Deal Information']")
		public WebElement dealInformation;

		public WebElement getDealInformation() {
			return dealInformation;
		}
		@FindBy(xpath = "//a[@title='Bookmark Deal Execution']")
		public WebElement DealExecutionPageBookMark;

		public WebElement getDealExecutionPageBookMark() {
			return DealExecutionPageBookMark;
		}
		
		@FindBy(xpath = "//div//following::h1[text()='Deal Information']//following::div/a")
		public WebElement dealPlanPageBookMark;

		public WebElement getDealPlanPageBookMark() {
			return dealPlanPageBookMark;
		}
		
		@FindBy(xpath = "//div//ul//li//a//span[@class='transIcon-execution icon']")
		public WebElement transIconExecutionIcon;

		public WebElement getTransIconExecutionIcon() {
			return transIconExecutionIcon;
		}

		@FindBy(xpath = "//div//ul//li//following-sibling::a[text()='Deal Execution']//following::a")
		public WebElement bookmarkonDealExecution;

		public WebElement getBookmarkonDealExecution() {
			return bookmarkonDealExecution;
		}
		

		@FindBy(xpath = "//div//ul//li//following-sibling::a[text()='Project Plan']//following::a")
		public WebElement bookMarkprojectplan;

		public WebElement getBookMarkprojectplan() {
			return bookMarkprojectplan;
		}
		

		@FindBy(xpath = "//div//ul//li[3]//following-sibling::a[text()='Project Staffing']//following::a")
		public WebElement bookMarkProjectStaffing;

		public WebElement getBookMarkProjectStaffing() {
			return bookMarkProjectStaffing;
		}
		

		@FindBy(xpath = "//div//ul//li[4]//following-sibling::a[text()='Execution Summary']//following::span[1]")
		public WebElement bookMarkExecutionSummary;

		public WebElement getBookMarkExecutionSummary() {
			return bookMarkExecutionSummary;
		}
		

		@FindBy(xpath = "//div//ul//li[5]//following-sibling::a[text()='Wave Details']//following::span[@class='transIcon-bookmarked']")
		public WebElement bookMarkWaveDetails;

		public WebElement getBookMarkWaveDetails() {
			return bookMarkWaveDetails;
		}
		

		@FindBy(xpath = "//div//ul//li[6]//following-sibling::a[text()='Enable People']//following::span[@class='transIcon-bookmarked']")
		public WebElement bookMarkEnablePeople;

		public WebElement getBookMarkEnablePeople() {
			return bookMarkEnablePeople;
		}
		

		@FindBy(xpath = "//div//ul//li[7]//following-sibling::a[text()='Train the Trainer']//following::span[@class='transIcon-bookmarked']")
		public WebElement bookMarkTrainthetrainer;

		public WebElement getBookMarkTrainthetrainer() {
			return bookMarkTrainthetrainer;
		}
		

		@FindBy(xpath = "//div//ul[2]//li[1]//following-sibling::a[text()='Delivery Team Training']//following::span[@class='transIcon-bookmarked']")
		public WebElement bookMarkDeltrain;

		public WebElement getBookMarkDeltrain() {
			return bookMarkDeltrain;
		}
		

		@FindBy(xpath = "//div//ul[2]//li[2]//following-sibling::a[text()='Service Readiness']//following::span[@class='transIcon-bookmarked']")
		public WebElement bookMarkServreadiness;

		public WebElement getBookMarkServreadiness() {
			return bookMarkServreadiness;
		}
		

		@FindBy(xpath = "//div//ul[2]//li[3]//following-sibling::a[text()='Tech & Work Environment']//following::span[@class='transIcon-bookmarked']")
		public WebElement bookMarkTechandWork;

		public WebElement getBookMarkTechandWork() {
			return bookMarkTechandWork;
		}
		
		@FindBy(xpath = "//ul[@role='menu']/li[2]/div/button/span[@class='acn-cross']")
		public WebElement croosButtonInExecutionMenu;

		public WebElement getCroosButtonInExecutionMenu() {
			return croosButtonInExecutionMenu;
		}
		
		@FindBy(xpath = "//a[@href='/ProjectExecution/DealExecution/DealExecution/']")
		public WebElement dealExecution;

		public WebElement getDealExecution() {
			return dealExecution;
		}

		@FindBy(xpath = "//div//following::h1[text()='Deal Execution']//following::div/a/span[@class='transIcon-bookmarked']")
		public WebElement dealExecutionBookMark;

		public WebElement getDealExecutionBookMark() {
			return dealExecutionBookMark;
		}
		//////////////////////////   MEC_CheckList     ////////////////////////
		
		@FindBy(xpath = "*//div//h1[text()='MEC Checklist']")
		public WebElement titleOfMEC_ChecklistPage;

		public WebElement getTitleOfMEC_ChecklistPage() {
			return titleOfMEC_ChecklistPage;
		}
		
		@FindBy(xpath = "*//div//h1[text()='MEC Checklist']//following::span")
		public WebElement versionOfTheMEC_ChecklistPage;

		public WebElement getVersionOfTheMEC_ChecklistPage() {
			return versionOfTheMEC_ChecklistPage;
		}
		
		@FindBy(xpath = "*//button[text()='RACI Details']")
		public WebElement RACIbutton;

		public WebElement getRACIbutton() {
			return RACIbutton;
		}

		@FindBy(xpath = "//table//tbody//tr//td[5]//div//a/span[@class='transIcon-accordian_dropdown']")
		public WebElement MEC_ChecklistStatusDropDown;

		public WebElement getMEC_ChecklistStatusDropDown() {
			return MEC_ChecklistStatusDropDown;
		}
		
		@FindAll(@FindBy(xpath = "//div[1][@class='checklist-status']//following::tr//td[@class='k-detail-cell']//table//thead//tr//following::th"))
		java.util.List<WebElement>  solutioncateg;

		public java.util.List<WebElement>  getSolutioncateg() {
			return solutioncateg;
		}
		
		@FindAll(@FindBy(xpath = "//table//tbody//tr[2]//div[2]//table//tbody//tr//td[3]"))
		java.util.List<WebElement>  solutionCriteriacategList;

		public java.util.List<WebElement>  getSolutionCriteriacategList() {
			return solutionCriteriacategList;
		}
		@FindBy(xpath = "//table//tbody//tr//td[5]//div//a/span[@class='transIcon-accordian_dropdown']")
		public WebElement crossTransIconAccordianDropdown;

		public WebElement getCrossTransIconAccordianDropdown() {
			return crossTransIconAccordianDropdown;
		}
		
		@FindBy(xpath = "//tr//td[@role='gridcell'][8]//div[1][@class='openHere']//span[@id='49685'][1]")
		public WebElement openHereInMEC_CheckList;
		
		public WebElement getOpenHereInMEC_CheckList() {
			return openHereInMEC_CheckList;
		}
		
		@FindBy(xpath = "/html/body/div[31]/div[2]/div/div[1]/h1")
		public WebElement criteriaArtifacts;

		public WebElement getCriteriaArtifacts() {
			return criteriaArtifacts;
		}
		
		@FindBy(xpath = "//div[@class='comments']//following::textarea[4]")
		public WebElement criteriaArtifactsTextField;

		public WebElement getCriteriaArtifactsTextField() {
			return criteriaArtifactsTextField;
		}
		

		@FindBy(xpath = "//div[@class='popover-inner']//following::div//div//button//i[@class='acn-cross']")
		public WebElement crossButtonInCriteriaArtifacts;

		public WebElement getCrossButtonInCriteriaArtifacts() {
			return crossButtonInCriteriaArtifacts;
		}
		
		@FindBy(xpath = "//div//ul//li[3]//a//span[@class='expand-grid-icon']")
		public WebElement mec_ChecklistExpand;

		public WebElement getMEC_ChecklistExpand() {
			return mec_ChecklistExpand;
		}
		@FindBy(xpath = "//a[text()='ESCAPE ']//span[@class='acn-shrink']")
		public WebElement acnShrink;

		public WebElement getAcnShrink() {
			return acnShrink;
		}
		@FindBy(xpath = "//span[@class='transIcon-PMO_and_governance icon']")
		public WebElement PMOAndGovernance;

		public WebElement getPMOAndGovernance() {
			return PMOAndGovernance;
		}
		@FindBy(xpath = "//div//ul//li//following-sibling::a[text()='PCT Kit']")
		public WebElement PCTKit;

		public WebElement getPCTKit() {
			return PCTKit;
		}
		@FindBy(xpath = "//table//tbody//tr[4]//td[5]//div//a/span[@class='transIcon-accordian_dropdown']")
		public WebElement transIconDropDown;

		public WebElement getTransIconDropDown() {
			return transIconDropDown;
		}
		@FindAll(@FindBy(xpath = "//div[1][@class='checklist-status']//following::tr//td[@class='k-detail-cell']//table//thead//tr//following::th"))
		java.util.List<WebElement> transSolutioncateg;

		public java.util.List<WebElement> getTransSolutioncateg() {
			return transSolutioncateg;
		}
		@FindBy(xpath = "//nav//div//div//ul//li//a[@class='ng-binding active']")
		public WebElement bookMarkInMEC_CheckListInBAR;

		public WebElement getBookMarkInMEC_CheckListInBAR() {
			return bookMarkInMEC_CheckListInBAR;
		}
		@FindBy(xpath = "//div/a/span[@class='transIcon-bookmarked']")
		public WebElement MECCheckListBookMarked;

		public WebElement getMECCheckListBookMarked() {
			return MECCheckListBookMarked;
		}
		@FindBy(xpath = "//h2[text()='Overall Rating']")
		public WebElement OverAllRating;

		public WebElement getOverAllRating() {
			return OverAllRating;
		}
		
		@FindAll(@FindBy(xpath = "//div//ul[@class='legend-list']//li"))
		java.util.List<WebElement>  OverAllRatingList;

		public java.util.List<WebElement>  getOverAllRatingList() {
			return OverAllRatingList;
		}
		
		@FindBy(xpath = "//table//thead//tr//th//input[@class='k-checkbox']")
		public WebElement MEC_ChecklistCheckBox;

		public WebElement getMEC_ChecklistCheckBox() {
			return MEC_ChecklistCheckBox;
		}
		
		@FindAll(@FindBy(xpath = "//table[@role='treegrid']/tbody/tr/td[2]//input"))
		java.util.List<WebElement>  MEC_ChecklistItemCheckBox;

		public java.util.List<WebElement>  getMEC_ChecklistItemCheckBox() {
			return MEC_ChecklistItemCheckBox;
		}

		@FindBy(xpath = "//footer//div//button[@type='submit']")
		public WebElement MEC_ChecklistSaveButton;

		public WebElement getMEC_CheckListSaveButton() {
			return MEC_ChecklistSaveButton;
		}
		@FindAll(@FindBy(xpath = "//nav//div//div//ul//li//a[@class='ng-binding']"))
		java.util.List<WebElement> ProjectArtifactsBar;

		public java.util.List<WebElement> getProjectArtifactsBar() {
			return ProjectArtifactsBar;
		}
		
		@FindBy(xpath = "//li//a[@class='transIcon-manage_bookmarks more-icon']")
		public WebElement ProjectShowMore;

		public WebElement getProjectShowMore() {
			return ProjectShowMore;
		}
		
		@FindBy(xpath = "//ul//a[@class='links-manage ng-scope']")
		public WebElement MoreManageList;

		public WebElement getMoreManageList() {
			return MoreManageList;
		}

		@FindAll(@FindBy(xpath = "//div//ul[@class='manage-links ng-scope']//li"))
		java.util.List<WebElement> ManageListIteams;

		public java.util.List<WebElement> getManageListIteams() {
			return ManageListIteams;
		}
		
		@FindBy(xpath = "//li[@class='more']/a[@class='transIcon-manage_bookmarks more-icon']")
		public WebElement MoreItemBar;

		public WebElement getMoreItemBar() {
			return MoreItemBar;
		}
		
		@FindBy(xpath = "//div[1][@class='openHere']//span[@id='49677']")
		public WebElement MECCheckListPopUp;

		public WebElement getMECCheckListPopUp() {
			return MECCheckListPopUp;
		}

		@FindBy(xpath = "//table/tbody//tr[2]//td[2]//div[2]//tr[3]/td[10]/div/span")
		public WebElement MEC_ChatBox;

		public WebElement getMEC_ChatBox() {
			return MEC_ChatBox;
		}
		
		@FindBy(xpath = "//div[@class='popover-content']/div[@class='modal-header']/h1")
		public WebElement MEC_ChatBoxTitle;

		public WebElement getMEC_ChatBoxTitle() {
			return MEC_ChatBoxTitle;
		}
	////////////////// Project User Access ///////////////////////////////////////////////
		
		@FindBy(xpath = "//a[@href='/ProjectSetup/ProjUserAccess/ProjUserAccess']")
		public WebElement ProjectUserAccessLink;

		public WebElement getProjectUserAccessLink() {
			return ProjectUserAccessLink;
		}
		
		
		@FindBy(xpath = "//button[@id='AddProjUserAccessbtn']")
		public WebElement ADDROLEButton;

		public WebElement getADDROLEButton() {
			return ADDROLEButton;
		}
		
		@FindBy(xpath = "//*[label='Status*']//select[@id='action']")
		public WebElement StatusDropDown;

		public WebElement getStatusDropDown() {
			return StatusDropDown;
		}
		@FindBy(xpath = "//*[label='Status*']//span")
		public WebElement StatusDropDownMenu;

		public WebElement getStatusDropDownMenu() {
			return StatusDropDownMenu;
		}
		
		@FindBy(xpath = "//*[label='Status*']//select/option[2]")
		public WebElement StatusInActive;

		public WebElement getStatusInActive() {
			return StatusInActive;
		}

		@FindBy(xpath = "//input[@id='emailId']")
		public WebElement EmailIDInput;

		public WebElement getEmailIDInput() {
			return EmailIDInput;
		}
		@FindBy(xpath = "//input[@id='contactNbr']")
		public WebElement ContactNumberInput;

		public WebElement getContactNumberInput() {
			return ContactNumberInput;
		}
		

		@FindBy(xpath = "//a[text()=' Go To External Personnel ID Request Tool ']")
		public WebElement ExternalLink;

		public WebElement getExternalLink() {
			return ExternalLink;
		}
		
		@FindAll(@FindBy(xpath = "//div[@class='k-grid-header']//div[2]//tr//th"))
		java.util.List<WebElement>  ProjectUserAccessList;

		public java.util.List<WebElement>  getProjectUserAccessList() {
			return ProjectUserAccessList;
		}
		
		@FindBy(xpath = "//th[@data-field='userName']/a/span']")
		public WebElement UserNameFilter;

		public WebElement getUserNameFilter() {
			return UserNameFilter;
		}
		
		
		@FindBy(xpath = "//th[@data-field='userProfile']/a/span")
		public WebElement UserProfileFilter;

		public WebElement getUserProfileFilter() {
			return UserProfileFilter;
		}
		
		@FindBy(xpath = "//th[@data-field='role']/a/span")
		public WebElement RoleFilter;

		public WebElement getRole() {
			return RoleFilter;
		}
		
		
		@FindBy(xpath = "//th[@data-field='level']/a/span")
		public WebElement LevelFilter;

		public WebElement getLevelFilter() {
			return LevelFilter;
		}
		
		@FindBy(xpath = "//th[@data-field='location']/a/span")
		public WebElement LocationFilter;

		public WebElement getLocationFilter() {
			return LocationFilter;
		}
		
		@FindAll(@FindBy(xpath = "//div[@class='k-grid-content-locked']//tbody//tr"))
		java.util.List<WebElement> AccessUserDatalist;

		public java.util.List<WebElement> getAccessUserDatalist() {
			return AccessUserDatalist;
		}
		
		
		@FindBy(xpath = "//li[@class='k-item']//input[@value='Governance Lead']")
		public WebElement GovernanceCheckbox;

		public WebElement getGovernanceCheckbox() {
			return GovernanceCheckbox;
		}
		
		@FindBy(xpath = "//button[@type='submit']")
		public WebElement RoleCheckboxFilter;

		public WebElement getRoleCheckboxFilter() {
			return RoleCheckboxFilter;
		}
		
		@FindAll(@FindBy(xpath = "//div[@class='k-grid-content-locked']//tbody//tr/td/a/span"))
		public java.util.List<WebElement> GovernanceEditButton;

		public java.util.List<WebElement> getGovernanceEditButton() {
			return GovernanceEditButton;
		}
		
		@FindBy(xpath = "//a[text()='Save']")
		public WebElement AddRoleSaveButton;

		public WebElement getAddRoleSaveButton() {
			return AddRoleSaveButton;
		}
		

		@FindBy(xpath = "//span[@id='transErrGeneral']")
		public WebElement ErrorONStatus;

		public WebElement getErrorONStatus() {
			return ErrorONStatus;
		}
		
		@FindBy(xpath = "*//div[label='Status*']//span")
		public WebElement StatusDropDownBar;

		public WebElement getStatusDropDownBar() {
			return StatusDropDownBar;
		}
		
		@FindAll(@FindBy(xpath = "//tbody[@role='rowgroup']/tr[1]//td"))
		public java.util.List<WebElement> FirstDetailsOfProjectUser;

		public java.util.List<WebElement> getFirstDetailsOfProjectUser() {
			return FirstDetailsOfProjectUser;
		}
		
		@FindBy(xpath = "//input[@id='projUserName']")
		public WebElement ProjectUserName;

		public WebElement getProjectUserName() {
			return ProjectUserName;
		}
		
		@FindBy(xpath = "//div[@class='row ng-scope']/div[4]/span/span")
		public WebElement RoleDropDownBar;

		public WebElement getRoleDropDownBar() {
			return RoleDropDownBar;
		}
		
		@FindBy(xpath = "//div[@class='row ng-scope']/div[5]/span/span")
		public WebElement CareerlevelDropDownBar;

		public WebElement getCareerlevelDropDownBar() {
			return CareerlevelDropDownBar;
		}
		
		@FindBy(xpath = "//div[@class='row ng-scope']/div[6]/span/span/span")
		public WebElement LocationDropDownBar;

		public WebElement getLocationDropDownBar() {
			return LocationDropDownBar;
		}
		
		@FindBy(xpath = "//div[@class='row ng-scope']/div[7]/span/span")
		public WebElement Deal_WaveDropDownBar;

		public WebElement getDeal_WaveDropDownBar() {
			return Deal_WaveDropDownBar;
		}
		
		@FindBy(xpath = "//div[@class='row ng-scope']/div[8]/span/span")
		public WebElement SourcingDropDownBar;

		public WebElement getSourcingDropDownBar() {
			return SourcingDropDownBar;
		}

  
		@FindAll(@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//tbody//tr//td[2]//span"))
		public java.util.List<WebElement> ProjectAccessUserName;

		public java.util.List<WebElement> getProjectAccessUserName() {
			return ProjectAccessUserName;
		}
		

    @FindBy(xpath = "//li[2][@role='menuitem']//a//span[@class='transIcon-execution icon']")
    public WebElement ExecutionIcon;

    public WebElement getExecutionIcon() {
           return ExecutionIcon;
    }


    @FindBy(xpath = "//div//ul//li[2]//following-sibling::a[text()='Project Staffing']")
    public WebElement ProjectStaffingdashboardIcon;

    public WebElement getProjectStaffingdashboardIcon() {
           return ProjectStaffingdashboardIcon;
    }
    

    @FindAll(@FindBy(xpath = "//table[@role='grid']//thead//tr//th"))
    java.util.List<WebElement> ProjectStaffingColumns;

    public java.util.List<WebElement> getProjectStaffingColumns() {
           return ProjectStaffingColumns;
    }
    @FindBy(xpath = "*//i[@class='transIcon-user_access icon']")
    public WebElement ProjectUserAccessIcon;

    public WebElement getProjectUserAccessIcon() {
           return ProjectUserAccessIcon;
    }

    @FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr[1]//td"))
    java.util.List<WebElement> ProjectAccessRow1Elements;

    public java.util.List<WebElement> getProjectAccessRow1Elements() {
           return ProjectAccessRow1Elements;
    }


    @FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr[1]//td"))
    java.util.List<WebElement> ProjectStaffingrow1elements;

    public java.util.List<WebElement> getProjectStaffingrow1elements() {
           return ProjectStaffingrow1elements;
    }
    @FindAll(@FindBy(xpath = "*//table[@role='grid']//tr/th"))
    public java.util.List<WebElement> ProjectAccesstableColumns;

    public java.util.List<WebElement> getProjectAccesstableColumns() {
           return ProjectAccesstableColumns;
    }

    @FindAll(@FindBy(xpath = "//tbody[@role='rowgroup']//td[2]"))
    public java.util.List<WebElement> ProjectAccesstableUserName;

    public java.util.List<WebElement> getProjectAccesstableUserName() {
           return ProjectAccesstableUserName;
    }
		
    @FindAll(@FindBy(xpath = "//tbody[@role='rowgroup']//td[7]"))
    public java.util.List<WebElement> ProjectAccesstableUserRole;

    public java.util.List<WebElement> getProjectAccesstableUserole() {
           return ProjectAccesstableUserRole;
    }

    @FindAll(@FindBy(xpath = "//tbody[@role='rowgroup']//tr/td[13]/span"))
    public java.util.List<WebElement> ProjectAcutalStaffingUserName;

    public java.util.List<WebElement> getProjectAcutalStaffingUserName() {
           return ProjectAcutalStaffingUserName;
    }
    @FindAll(@FindBy(xpath = "//tbody[@role='rowgroup']//tr/td[14]/span"))
    public java.util.List<WebElement> ProjectAcutalStaffingUserRole;

    public java.util.List<WebElement> getProjectAcutalStaffingUserRole() {
           return ProjectAcutalStaffingUserRole;
    }//label[text()='Project Supervisor']/ancestor::div[1]/span
	
    @FindBy(xpath = "//input[@id='projSupervisor']")
    public WebElement ProjectSupervisorinputfield;

    public WebElement getProjectSupervisorinputfield() {
           return ProjectSupervisorinputfield;
    }
    
    
    @FindBy(xpath = "//label[text()='Project Supervisor']/ancestor::div[1]//label[2]")
    public WebElement ProjectSupervisorErrorText;

    public WebElement getProjectSupervisorErrorText() {
           return ProjectSupervisorErrorText;
    }
     
    ////////////////     SET 2     ////////////////////     Execution Dashboard         ////////////////////////////////////////////////////////////////////////
    
    
    
    @FindBy(xpath = "//*[@class='navbar navbar-inverse navbar-fixed-top transIT-inner']/a")
    public WebElement ProjectNameBackArrow;

    public WebElement getProjectNameBackArrow() {
           return ProjectNameBackArrow;
    }
    
    @FindBy(xpath = "//*[@class='navbar navbar-inverse navbar-fixed-top transIT-inner']/div/div/div[@class='proj-code ng-binding']")
    public WebElement ProjectIDName;

    public WebElement getProjectIDName() {
           return ProjectIDName;
    }
    
    @FindBy(xpath = "//*[@class='navbar navbar-inverse navbar-fixed-top transIT-inner']/div/div/h1")
    public WebElement ProjectCardName;

    public WebElement getProjectCardName() {
           return ProjectCardName;
    }
    
    @FindAll(@FindBy(xpath = "html/body/div[1]/section/header/div/ul[1]/li/a"))
	private java.util.List<WebElement> menuheadericonslist;

	public java.util.List<WebElement>getmenuheadericonslist() {
		return menuheadericonslist;
	}
    
    @FindAll(@FindBy(xpath = "//div[@class='information-wrapper']//label"))
    public java.util.List<WebElement> DealInformationlist;

    public java.util.List<WebElement> getDealInformationlist() {
           return DealInformationlist;
    }
    
    
    
    @FindBy(xpath = "//div[@class='container-fluid internal-page-content noPaddingTop']//h2")
    public WebElement ProjectLevelWorkStreamStatus;

    public WebElement getProjectLevelWorkStreamStatus() {
           return ProjectLevelWorkStreamStatus;
    } 
    

    @FindBy(xpath = "//h2[text()='Wave Level Workstream Status']")
    public WebElement WaveLevelWorkStreamStatus;

    public WebElement getWaveLevelWorkStreamStatus() {
           return WaveLevelWorkStreamStatus;
    }
    
    @FindBy(xpath = "//h2[text()='Wave Level SRAT Status']")
    public WebElement WaveLevelWorkSRATStatus;

    public WebElement getWaveLevelWorkSRATStatus() {
           return WaveLevelWorkSRATStatus;
    }
    
    @FindBy(xpath = "//div[@id='exportOPEX']//h2")
    public WebElement WaveLevelBeAssessmentStatus;

    public WebElement getWaveLevelBeAssessmentStatus() {
           return WaveLevelBeAssessmentStatus;
    } 
    
    @FindBy(xpath = "//div[@class='execution-summary']//h2[1]")
    public WebElement ProjectPlanStatus;

    public WebElement getProjectPlanStatus() {
           return ProjectPlanStatus;
    } 
    
    @FindBy(xpath = "//div[@id='exportfinance']//h2")
    public WebElement ProjectFinance;

    public WebElement getProjectFinance() {
           return ProjectFinance;
    } 
    
    @FindBy(xpath = "//div[@class='container-fluid internal-page-content']//h2")
    public WebElement ProjectOverAllStatus;

    public WebElement getProjectOverAllStatus() {
           return ProjectOverAllStatus;
    } 

    
    @FindBy(xpath = "//div[@class='col-sm-12 paddingBttm20']/ul//a[@id='overdueActivity']/div")
    public WebElement ProjectOverDUEActivity;

    public WebElement getProjectOverDUEActivity() {
           return ProjectOverDUEActivity;
    }
    
    @FindBy(xpath = "//div[@class='col-sm-12 paddingBttm20']/ul//a[@id='thisWeekActivity']/div")
    public WebElement ProjectThisWeekActivity;

    public WebElement getProjectThisWeekActivity() {
           return ProjectThisWeekActivity;
    }
    @FindBy(xpath = "//div[@class='col-sm-12 paddingBttm20']/ul//a[@id='nextWeekActivity']/div")
    public WebElement ProjectNextWeekActivity;

    public WebElement getProjectNextWeekActivity() {
           return ProjectNextWeekActivity;
    }
    
    @FindBy(xpath = "//div[@class='col-sm-12 paddingBttm20']/h2")
    public WebElement ProjectDealInformation;

    public WebElement getProjectDealInformation() {
           return ProjectDealInformation;
    }
    
    
    @FindAll(@FindBy(xpath = "//div[@class='information-wrapper']//span"))
    public java.util.List<WebElement> DealInformationContentlist;

    public java.util.List<WebElement> getDealInformationContentlist() {
           return DealInformationContentlist;
    }
    
  
    
    
    @FindBy(xpath = "//div[@class='container-fluid internal-page-content noPaddingTop']//button")
    public WebElement ProjectLevelWorkStreamExportButton;

    public WebElement getProjectLevelWorkStreamExportButton() {
           return ProjectLevelWorkStreamExportButton;
    }
  
    
    @FindAll(@FindBy(xpath = "//div[@id='exportSnap']/div[@class='container-fluid internal-page-content noPaddingTop']/div[1]/div[2]//li"))
    public java.util.List<WebElement> ProjectLevelWorkSteamLegends;

    public java.util.List<WebElement> getProjectLevelWorkSteamLegends() {
           return ProjectLevelWorkSteamLegends;
    }
    
    @FindAll(@FindBy(xpath = "//div[@id='exportSnap']/div[@class='container-fluid internal-page-content noPaddingTop']/div[1]/div[2]//li/span"))
    public java.util.List<WebElement> ProjectLevelWorkSteamLegendsColor;

    public java.util.List<WebElement> getProjectLevelWorkSteamLegendsColor() {
           return ProjectLevelWorkSteamLegendsColor;
    }
    
    @FindAll(@FindBy(xpath = "//div[@id='exportActivity']//ul[@class='rag-indicator pull-right']//li"))
    public java.util.List<WebElement> WorkLevelWorkSteamLegends;

    public java.util.List<WebElement> getWorkLevelWorkSteamLegends() {
           return WorkLevelWorkSteamLegends;
    }
   
    
    @FindAll(@FindBy(xpath = "//div[@id='exportActivity']//ul[@class='rag-indicator pull-right']//li/span"))
    public java.util.List<WebElement> WorkLevelWorkSteamLegendsColor;

    public java.util.List<WebElement> getWorkLevelWorkSteamLegendsColor() {
           return WorkLevelWorkSteamLegendsColor;
    }
    
    @FindAll(@FindBy(xpath = "//table[@class='transItTable']//th"))
    public java.util.List<WebElement> ProjectLevelWorkSteamTableStream;

    public java.util.List<WebElement> getProjectLevelWorkSteamTableStream() {
           return ProjectLevelWorkSteamTableStream;
    }
    
    
    
    @FindAll(@FindBy(xpath = "//table[@class='transItTable']//tr[3]/td/span"))
    public java.util.List<WebElement> ProjectLevelWorkSteamColorUnderHeader;

    public java.util.List<WebElement> getProjectLevelWorkSteamColorUnderHeader() {
           return ProjectLevelWorkSteamColorUnderHeader;
    }
    
    @FindAll(@FindBy(xpath = "//div[@id='grid_activity']//thead[@class='k-grid-header']//th"))
    public java.util.List<WebElement> WorkLevelWorkSteamColoumList;

    public java.util.List<WebElement> getWorkLevelWorkSteamColoumList() {
           return WorkLevelWorkSteamColoumList;
    }
    
    @FindBy(xpath = "//div[@id='grid_activity']//thead[@class='k-grid-header']//th[15]")
    public WebElement WorkLevelWorkSteamColoumListServiceRediness;

    public WebElement getWorkLevelWorkSteamColoumListServiceRediness() {
           return WorkLevelWorkSteamColoumListServiceRediness;
    }
    
    @FindBy(xpath = "//div[@id='grid_activity']//tbody/tr[1]//td[10]//span")
    public WebElement OverAllActivityRAG;

    public WebElement getOverAllActivityRAG() {
           return OverAllActivityRAG;
    }
    
    @FindBy(xpath = "//div[@id='grid_activity']//tbody/tr//td[15]//span[@class='rag-status ']")
    public WebElement ServieRedinessRAG;

    public WebElement getServieRedinessRAG() {
           return ServieRedinessRAG;
    }
    @FindBy(xpath = "//div[@id='grid_activity']//tbody/tr[1]//td[11]//span")
    public WebElement EnablePeopleRAG;

    public WebElement getEnablePeopleRAG() {
           return EnablePeopleRAG;
    }
    @FindBy(xpath = "//div[@id='grid_activity']//tbody/tr//td[12]//span[@class='rag-status ']")
    public WebElement TTTRAG;

    public WebElement getTTTRAG() {
           return TTTRAG;
    }
    @FindBy(xpath = "//div[@id='grid_activity']//tbody/tr//td[13]//span[@class='rag-status ']")
    public WebElement DTTRAG;

    public WebElement getDTTRAG() {
           return DTTRAG;
    }
    @FindBy(xpath = "//div[@id='grid_activity']//tbody/tr//td[14]//span[@class='rag-status ']")
    public WebElement TWERAG;

    public WebElement getTWERAG() {
           return TWERAG;
    }
    
    @FindBy(xpath = "//table[@class='transItTable']//td[1]/a")
    public WebElement ManageMobilization;

    public WebElement getManageMobilization() {
           return ManageMobilization;
    }
    
    @FindBy(xpath = "//div[@class='container-fluid internal-page-title']//h1/a")
    public WebElement ManageMobilizationPageTitle;

    public WebElement getManageMobilizationPageTitle() {
           return ManageMobilizationPageTitle;
    }
    
    @FindBy(xpath = "//div[@id='Project_Workstream']//div[@class='workstream-list']/h1")
    public WebElement ManageMobilizationPopUpPageTitle;

    public WebElement getManageMobilizationPopUpPageTitle() {
           return ManageMobilizationPopUpPageTitle;
    }
    
    @FindAll(@FindBy(xpath = "//div[@id='Project_Workstream']//div[@class='workstream-list']//li"))
    public java.util.List<WebElement> ManageMobilizationPopUpSubContent;

    public java.util.List<WebElement> getManageMobilizationPopUpSubContent() {
           return ManageMobilizationPopUpSubContent;
    }
    
    @FindBy(xpath = "//div[@id='Project_Workstream']/button[@class='close dismiss']")
    public WebElement ManageMobilizationPopUpPageCrossButton;

    public WebElement getManageMobilizationPopUpPageCrossButton() {
           return ManageMobilizationPopUpPageCrossButton;
    }
    
    @FindBy(xpath = "//a[text()='Engagement Management']")
    public WebElement PopupEngagementManagement;

    public WebElement getPopupEngagementManagement() {
           return PopupEngagementManagement;
    }
    
    @FindBy(xpath = "//h1[@class='d-md-inline-block ']/a")
    public WebElement WavePageStatusTitle;

    public WebElement getWavePageStatusTitle() {
           return WavePageStatusTitle;
    }
    
    
    @FindBy(xpath = "//a[text()='Service Management']")
    public WebElement PopupServiceManagement;

    public WebElement getPopupServiceManagement() {
           return  PopupServiceManagement;
    }
    
    
    @FindBy(xpath = "//a[text()='Journey Management']")
    public WebElement PopupJourneyManagement;

    public WebElement getPopupJourneyManagement() {
           return  PopupJourneyManagement;
    }
    
    @FindBy(xpath = "//a[text()='UserAddedWorksream_1']")
    public WebElement PopupUserAddedWorksream_1;

    public WebElement getPopupUserAddedWorksream_1() {
           return  PopupUserAddedWorksream_1;
    }
    
    @FindBy(xpath = "//h2[text()='Project Level Workstream Status']/parent::div//button")
    public WebElement ProjectLevelStreamStatusExportButton;

    public WebElement getProjectLevelStreamStatusExportButton() {
           return  ProjectLevelStreamStatusExportButton;
    }
    
	@FindBy(xpath = "//i[contains(@class,'transIcon-user')]")
	public WebElement userlogobutton;

	public WebElement getuserlogobutton() {
		return userlogobutton;
	}
    
    @FindAll(@FindBy(xpath = "//table[@class='transItTable']//tr[3]/td"))
	public java.util.List<WebElement> RGAProjectLevelWorkStreamStatus;

	public java.util.List<WebElement> getRGAProjectLevelWorkStreamStatus() {
	   return RGAProjectLevelWorkStreamStatus;
	}
	    
	@FindBy(xpath = "//table[@class='transItTable']//tr[3]/td[1]/span[1]")
	public WebElement ProjectLevelManageMobilizationRAGColor;

	public WebElement getProjectLevelManageMobilizationRAGColor() {
	return ProjectLevelManageMobilizationRAGColor;
	}
	
	@FindBy(xpath = "//table[@class='transItTable']//tr[2]/td[1]/a")
	public WebElement ProjectLevelManageMobilizationValueLink;

	public WebElement getProjectLevelManageMobilizationValueLink() {
	return ProjectLevelManageMobilizationValueLink;
	}//span[@class='k-icon k-i-arrow-60-down']
	
	@FindBy(xpath = "//span[@class='k-icon k-i-arrow-60-down']")
	public WebElement RAGStatusDropDown;

	public WebElement getRAGStatusDropDown() {
	return RAGStatusDropDown;
	}
	
	@FindBy(xpath = "//div[@class='k-animation-container']//td[3]")
	public WebElement RAGStatusDropDownGreenColor;

	public WebElement getRAGStatusDropDownGreenColor() {
	return RAGStatusDropDownGreenColor;
	}
	
	@FindBy(xpath = "//div[@class='k-animation-container']//td[2]")
	public WebElement RAGStatusDropDownBlueColor;

	public WebElement getRAGStatusDropDownBlueColor() {
	return RAGStatusDropDownBlueColor;
	}
	
	@FindBy(xpath = "//a[@id='overRideSave']")
	public WebElement SaveRAG;

	public WebElement getSaveRAG() {
	return SaveRAG;
	}
	@FindBy(xpath = "//button[@id='overRideSave']")
	public WebElement SaveRAGButton;

	public WebElement getSaveRAGButton() {
	return SaveRAGButton;
	}
	
	@FindBy(xpath = "//span[@class='k-picker-wrap k-state-default']/span")
	public WebElement RAGStatusSelectedColor;

	public WebElement getRAGStatusSelectedColor() {
	return RAGStatusSelectedColor;
	}

	@FindBy(xpath = "//div[@id='divpopupMessage']")
	public WebElement RAGStatusPopUPMsg;

	public WebElement getRAGStatusPopUPMsg() {
	   return RAGStatusPopUPMsg;
	}
	
	
	@FindBy(xpath = "//button[@id='btnMessageOK']")
	public WebElement RAGStatusPopUPOKButton;

	public WebElement getRAGStatusPopUPOKButton() {
	   return RAGStatusPopUPOKButton;
	}
	

    @FindAll(@FindBy(xpath = "//div[@id='snapShotId']//h2"))
    public java.util.List<WebElement> ExecutionDashboarHeaderNames;

    public java.util.List<WebElement> getExecutionDashboarHeaderNames() {
           return ExecutionDashboarHeaderNames;
    }
    
	@FindBy(xpath = "//div[@id='grid_activity']//tbody/tr//td/a[@href='/waveExecution/SubWaveHome/SubWaveHome/?SubWaveId=1672']")
	public WebElement WaveOverAllActivityValueLink;

	public WebElement getWaveOverAllActivityValueLink() {
	   return WaveOverAllActivityValueLink;
	}
	
	@FindBy(xpath = "//div[@class='container-fluid internal-page-title']//h2/a")
	public WebElement TitleAfterWaveStreamWorkLevelLinkCliked;

	public WebElement getTitleAfterWaveStreamWorkLevelLinkCliked() {
	   return TitleAfterWaveStreamWorkLevelLinkCliked;
	}
	@FindBy(xpath = "//div[@class='container-fluid internal-page-title']//h2/a/span")
	public WebElement DropDownAfterWaveStreamWorkLevelLinkCliked;

	public WebElement getDropDownAfterWaveStreamWorkLevelLinkCliked() {
	   return DropDownAfterWaveStreamWorkLevelLinkCliked;
	}
	
	@FindBy(xpath = "//div[@class='container-fluid internal-page-title']//div/h1/a")
	public WebElement WaveName;

	public WebElement getWaveName() {
	   return WaveName;
	}

	@FindBy(xpath = "//div[@class='container-fluid internal-page-title']//div/h1//span")
	public WebElement WaveNameDropDown;

	public WebElement getWaveNameDropDown() {
	   return WaveNameDropDown;
	}
	
	@FindAll(@FindBy(xpath = "//div[@id='workstream_selector']//div[@class='workstream-list']/h1"))
	public java.util.List<WebElement> PopUPWaveHeadings;

	public java.util.List<WebElement> getPopUPWaveHeadings() {
	   return PopUPWaveHeadings;
	}
	
	@FindAll(@FindBy(xpath = "//div[@id='workstream_selector']//div[@class='workstream-list']//li"))
	public  java.util.List<WebElement> PopUPWavelistName;

	public  java.util.List<WebElement> getPopUPWavelistName() {
	   return PopUPWavelistName;
	}
	
	@FindBy(xpath = "//div[@id='workstream_selector']//i[@class='acn-cross']")
	public WebElement WavePopUpCrossButton;

	public WebElement getWavePopUpCrossButton() {
	   return WavePopUpCrossButton;
	}
	
	@FindBy(xpath = "//div[@class='workstream-list']//a[text()='Wave Details']")
	public WebElement WavePopUpWaveDetails;

	public WebElement getWavePopUpWaveDetails() {
	   return WavePopUpWaveDetails;
	}
	@FindBy(xpath = "//div[@class='workstream-list']//a[text()='Enable People']")
	public WebElement WavePopUpEnablePeople;

	public WebElement getWavePopUpEnablePeople() {
	   return WavePopUpEnablePeople;
	}
	@FindBy(xpath = "//div[@class='workstream-list']//a[text()='Train The Trainer']")
	public WebElement WavePopUpTTT;

	public WebElement getWavePopUpTTT() {
	   return WavePopUpTTT;
	}
	@FindBy(xpath = "//div[@class='workstream-list']//a[text()='Delivery Team Training']")
	public WebElement WavePopUpDTT;

	public WebElement getWavePopUpDTT() {
	   return WavePopUpDTT;
	}
	@FindBy(xpath = "//div[@class='workstream-list']//a[text()='Technology and Work Environment']")
	public WebElement WavePopUpTechWork;

	public WebElement getWavePopUpTechWork() {
	   return WavePopUpTechWork;
	}
	@FindBy(xpath = "//div[@class='workstream-list']//a[text()='Service Rehearsal Test (SRT)']")
	public WebElement WavePopUpServiceRediness;

	public WebElement getWavePopUpServiceRediness() {
	   return WavePopUpServiceRediness;
	}
	@FindBy(xpath = "//h2[text()='Wave Level Workstream Status']/parent::div//button")
    public WebElement WaveLevelStreamStatusExportButton;

    public WebElement getWaveLevelStreamStatusExportButton() {
           return  WaveLevelStreamStatusExportButton;
    }
	@FindBy(xpath = "//h2[text()='OVERALL PROJECT IN-PROGRESS ACTIVITY STATUS']/parent::div//button")
    public WebElement OverAllProjectInProgressExportButton;

    public WebElement getOverAllProjectInProgressExportButton() {
           return  OverAllProjectInProgressExportButton;
    }
    @FindBy(xpath = "//span[@class='k-numeric-wrap k-state-default']/input")
    public WebElement WaveLevelStreamValueInput;

    public WebElement getWaveLevelStreamValueInput() {
           return  WaveLevelStreamValueInput;
    }
	 
    @FindBy(xpath = "//span[@class='k-picker-wrap k-state-default']//span[@class='k-icon k-i-arrow-60-down']")
    public WebElement WaveDetailsRAGDropDown;

    public WebElement getWaveDetailsRAGDropDown() {
           return  WaveDetailsRAGDropDown;
    }

    @FindBy(xpath = "//button[@id='overRideSave']")
    public WebElement RAGSaveButton;

    public WebElement getRAGSaveButton() {
           return  RAGSaveButton;
    }
	
    @FindBy(xpath = "//h2[text()='Wave Level SRAT Status']//parent::div//button")
    public WebElement WaveSRATExportButton;

    public WebElement getWaveSRATExportButton() {
           return  WaveSRATExportButton;
    }
    
    @FindAll(@FindBy(xpath = "//h2[text()='Wave Level SRAT Status']//parent::div/parent::div//div[2]//li"))
    public java.util.List<WebElement> WaveLevelSratlegends;

    public java.util.List<WebElement> getWaveLevelSratlegends() {
           return  WaveLevelSratlegends;
    }
    @FindAll(@FindBy(xpath = "//h2[text()='Wave Level SRAT Status']//parent::div/parent::div//div[2]//li/span"))
    public java.util.List<WebElement> WaveLevelSratlegendsColor;

    public java.util.List<WebElement> getWaveLevelSratlegendsColor() {
           return  WaveLevelSratlegendsColor;
    }
	
    @FindAll(@FindBy(xpath = "//div[@id='grid_SRAT']//th"))
    public java.util.List<WebElement>  WaveSRATColumList;

    public java.util.List<WebElement>  getWaveSRATColumList() {
           return  WaveSRATColumList;
    }
    
    @FindAll(@FindBy(xpath = "//div[@id='grid_opex']//th"))
    public java.util.List<WebElement>  WaveLevelBeAssessmentColoumList;

    public java.util.List<WebElement>  getWaveLevelBeAssessmentColoumList() {
           return  WaveLevelBeAssessmentColoumList;
    }

    @FindBy(xpath = "//h2[text()='Wave Level BE Assessment Status']//parent::div//button")
    public WebElement WaveBeAssessmentExportButton;

    public WebElement getWaveBeAssessmentExportButton() {
           return  WaveBeAssessmentExportButton;
    }

    @FindBy(xpath = "//h2[text()='Project Plan Status']//parent::div//button")
    public WebElement ProjectPlanStatusExportButton;

    public WebElement getProjectPlanStatusExportButton() {
           return  ProjectPlanStatusExportButton;
    }
    
    @FindBy(xpath = "//h2[text()='Project Plan Status']//parent::div//parent::div//div[2]")
    public WebElement ProjectPlanStatusSubHeading;

    public WebElement getProjectPlanStatusSubHeading() {
           return  ProjectPlanStatusSubHeading;
    }
    
    @FindBy(xpath = "//span[@class='status planned']//parent::li")
    public WebElement ProjectPlanPlanned;

    public WebElement getProjectPlanPlanned() {
           return  ProjectPlanPlanned;
    }
    
    @FindBy(xpath = "//span[@class='status actual']//parent::li")
    public WebElement ProjectPlanActuals;

    public WebElement getProjectPlanActuals() {
           return  ProjectPlanActuals;
    }
    @FindBy(xpath = "//span[@class='status planned']//parent::li/span")
    public WebElement ProjectPlanPlannedcolor;

    public WebElement getProjectPlanPlannedcolor() {
           return  ProjectPlanPlannedcolor;
    }   
    
    @FindBy(xpath = "//span[@class='status actual']//parent::li/span")
    public WebElement ProjectPlanActualscolor;

    public WebElement getProjectPlanActualscolor() {
           return  ProjectPlanActualscolor;
    }
	
    @FindBy(xpath = "//h2[text()='Deal Financials']")
    public WebElement FinancialsTitle;

    public WebElement getFinancialsTitle() {
           return  FinancialsTitle;
    }
 
    @FindBy(xpath = "//b[text()='No Financial Information are available']")
    public WebElement NOFinancialsInfo;

    public WebElement getNOFinancialsInfo() {
           return  NOFinancialsInfo;
    }
    @FindAll(@FindBy(xpath = "//b[text()='No Financial Information are available']"))
    public java.util.List<WebElement> NOFinancialsInfoList;

    public java.util.List<WebElement> getNOFinancialsInfoList() {
           return  NOFinancialsInfoList;
    }
    
    @FindAll(@FindBy(xpath = "//tbody//a[@role='button']"))
    public java.util.List<WebElement>  ProjectPlanEditbuttonInColum;

    public java.util.List<WebElement>  getProjectPlanEditbuttonInColum() {
           return  ProjectPlanEditbuttonInColum;
    }

    @FindBy(xpath = "html/body/div[1]/section/header/div/ul[1]/li[2]/a/span")
    public WebElement ExecutionMenuButton;

    public WebElement getExecutionMenuButton() {
           return  ExecutionMenuButton;
    }
	
    @FindBy(xpath = "//a[text()='Project Plan']")
    public WebElement ExecutionProjectPlanButton;

    public WebElement getExecutionProjectPlanButton() {
           return  ExecutionProjectPlanButton;
    }
    @FindBy(xpath = "//span[@class='k-picker-wrap k-state-default']/input[@id='ActualStartDt']")
    public WebElement ActualStartDate;

    public WebElement getActualStartDate() {
           return  ActualStartDate;
    }
    @FindBy(xpath = "//tbody/tr[2]/td[22]")
    public WebElement CompleteStatusValue;

    public WebElement getCompleteStatusValue() {
           return  CompleteStatusValue;
    }
    
    @FindBy(xpath = "//label[text()='Complete %']//parent::div/input")
    public WebElement CompleteStatusInput;

    public WebElement getCompleteStatusInput() {
           return  CompleteStatusInput;
    }
    @FindBy(xpath = "//span[@class='k-icon k-i-check']//parent::a")
    public WebElement EditActivitySaveButton;

    public WebElement getEditActivitySaveButton() {
           return  EditActivitySaveButton;
    }
    @FindBy(xpath = "//tbody/tr[2]/td[16]")
    public WebElement ActivityFieldData;

    public WebElement getActivityFieldData() {
           return  ActivityFieldData;
    }
    @FindBy(xpath = "//div[@id='bookmarkedItem']//a[text()='Execution Summary']")
    public WebElement ExecutionDashboardSummry;

    public WebElement getExecutionDashboardSummry() {
           return  ExecutionDashboardSummry;
    }
    @FindAll(@FindBy(xpath = "//table//tbody[@role='rowgroup']//tr//td[5]/span"))
    public java.util.List<WebElement>  ManageMobilizationActivity;

    public java.util.List<WebElement>  getManageMobilizationActivity() {
           return  ManageMobilizationActivity;
    }
   
    @FindBy(xpath = "//label[text()='Actual Start Date']//parent::div/span/span/span/span")
    public WebElement  ActualDateDatePicker;

    public WebElement getActualDateDatePicker() {
           return  ActualDateDatePicker;
    }
    @FindBy(xpath = "//table[@class='k-content k-month']/tbody")
    public WebElement  ActualDateTab;

    public WebElement getActualDateTab() {
           return  ActualDateTab;
    }
    @FindBy(xpath = "//button[@id='btnMessageOK']")
    public WebElement  PopUPButton;

    public WebElement getPopUPButton() {
           return  PopUPButton;
    }
    
    @FindBy(xpath = "//a[text()='Finance Management']")
    public WebElement  FinanceManagementPMO;

    public WebElement getFinanceManagementPMO() {
           return  FinanceManagementPMO;
    }
    @FindBy(xpath = "//div[@id='financeManagement']//li[2]/a")
    public WebElement  FinanceManagementBPOButton;

    public WebElement getFinanceManagementBPOButton() {
           return  FinanceManagementBPOButton;
    }
    @FindBy(xpath = "//a[@id='downloadbtn']")
    public WebElement  FinanceManagementBPOExport;

    public WebElement getFinanceManagementBPOExport() {
           return  FinanceManagementBPOExport;
    }
    @FindBy(xpath = "//span[text()='Select files...']")
    public WebElement  SelectFileToImport;

    public WebElement getSelectFileToImport() {
           return  SelectFileToImport;
    }
    @FindBy(xpath = "//input[@id='upload_file']")
    public WebElement  SelectFileToImportfile;

    public WebElement getSelectFileToImportfile() {
           return  SelectFileToImportfile;
    }
    
    @FindBy(xpath = "//button[text()='Import']")
    public WebElement  ImportButton;

    public WebElement getImportButton() {
           return  ImportButton;
    }
  
    @FindBy(xpath = "//*[@id='BudgetGridPMOId']/div[2]/table/tbody/tr[1]/td[2]")
    public WebElement  TotalODEProhramCost;

    public WebElement getTotalODEProhramCost() {
           return  TotalODEProhramCost;
    }
  
    @FindBy(xpath = "//td[@id='bpoOriginalDealEco']")
    public WebElement  TotalODECostinLandingPage;

    public WebElement getTotalODECostinLandingPage() {
           return  TotalODECostinLandingPage;
    }
    
    @FindAll(@FindBy(xpath = "//div[@class='k-grid-header-wrap k-auto-scrollable']//th"))
    public java.util.List<WebElement>  OverAllProjectINProgressColoumn;

    public java.util.List<WebElement>  getOverAllProjectINProgressColoumn() {
           return  OverAllProjectINProgressColoumn;
    }
    
    
    @FindBy(xpath = "//table/tbody/tr[2]/td[5]/a")
    public WebElement  ActivityLinkColoumn;

    public WebElement getActivityLinkColoumn() {
           return  ActivityLinkColoumn;
    }
    @FindBy(xpath = "//tbody[@role='rowgroup']//tr/td[3]/a")
    public WebElement  ActivityPageEditButton;

    public WebElement getActivityPageEditButton() {
           return  ActivityPageEditButton;
    }
    @FindBy(xpath = "//tbody[@role='rowgroup']//tr/td[5]/span")
    public WebElement  ActivityPageFirstActivityName;

    public WebElement getActivityPageFirstActivityName() {
           return  ActivityPageFirstActivityName;
    }
    
    @FindBy(xpath = "//input[@id='txtComplete']")
    public WebElement  CompletePersentage;

    public WebElement getCompletePersentage() {
           return  CompletePersentage;
    }
    @FindBy(xpath = "//table/tbody/tr[1]/td[11]/span")
    public WebElement  CompletePersentagevalue;

    public WebElement getCompletePersentagevalue() {
           return  CompletePersentagevalue;
    }
    
    @FindBy(xpath = "//*[text()='JD for each role']//parent::td//parent::tr//td[6]")
    public WebElement  CompletePersentagevalueAfterUpdate;

    public WebElement getCompletePersentagevalueAfterUpdate() {
           return  CompletePersentagevalueAfterUpdate;
    }
    
    @FindBy(xpath = "//h2[text()='Project Plan Status']//parent::div//button")
    public WebElement  ProjectPlanExportButton;

    public WebElement getProjectPlanExportButton() {
           return  ProjectPlanExportButton;
    }
    @FindBy(xpath = "//h2[text()='Deal Financials']//parent::div//button")
    public WebElement  FinancialsExportButton;

    public WebElement getFinancialsExportButton() {
           return  FinancialsExportButton;
    }
    @FindBy(xpath = "//h2[text()='OVERALL PROJECT IN-PROGRESS ACTIVITY STATUS']//parent::div//button")
    public WebElement  OverAllProjectINProgressExportButton;

    public WebElement getOverAllProjectINProgressExportButton() {
           return  OverAllProjectINProgressExportButton;
    }
    
    @FindBy(xpath = "//li[@id='srtassessmentExport']/a")
    public WebElement  ExcecutionSummaryExportButton;

    public WebElement getExcecutionSummaryExportButton() {
           return  ExcecutionSummaryExportButton;
    }
    @FindBy(xpath = "//a[text()='Enable People']")
    public WebElement  ExecutoionMenu;

    public WebElement getExecutoionMenu() {
           return  ExecutoionMenu;
    }
    @FindAll(@FindBy(xpath = "//ul[@class='menu-links col-sm-6 ng-scope']/li/a[1]"))
    public java.util.List<WebElement>  ExecutoionHeadings;

    public java.util.List<WebElement> getExecutoionHeadings() {
           return  ExecutoionHeadings;
    }
    @FindAll(@FindBy(xpath = "//li[@class='sub-item']//li/a"))
    public java.util.List<WebElement>  ExecutoionSubItems;

    public java.util.List<WebElement> getExecutoionSubItems() {
           return  ExecutoionSubItems;
    }
    @FindBy(xpath = "//div[text()='Execution']")
    public WebElement  ExecutoionTitle;

    public WebElement getExecutoiontTitle() {
           return  ExecutoionTitle;
    } 
    @FindBy(xpath = "//div[text()='Execution']//parent::div/p")
    public WebElement  ExecutoionPara;

    public WebElement getExecutoionPara() {
           return  ExecutoionPara;
    }
	
	    @FindBy(xpath = "//a[text()='Project Plan']")
	    public WebElement  ProjectPlan;
	
	    public WebElement getProjectPlan() {
	           return  ProjectPlan;
	    }

	    @FindBy(xpath = "//a[@title='Bookmark Project Plan Actuals']")
	    public WebElement  ProjectPlanPageBooKMark;
	
	    public WebElement getProjectPlanPageBooKMark() {
	           return  ProjectPlanPageBooKMark;
	    }
	  
	    @FindBy(xpath = "//a[@title='Bookmark Project Staffing(Actuals)']")
	    public WebElement  ProjectStaffingBookMark;
	
	    public WebElement getProjectStaffingBookMark() {
	           return  ProjectStaffingBookMark;
	    }
	    
	    @FindBy(xpath = "//ul[@class='menu-links col-sm-6 ng-scope']//a[text()='Project Staffing']")	    
	    public WebElement  ProjectStaffing;
	
	    public WebElement getProjectStaffing() {
	           return  ProjectStaffing;
	    }
	 
	    
	    @FindBy(xpath = "//a[text()='Execution Summary']")
	    public WebElement  ExecutionSummary;
	
	    public WebElement getExecutionSummary() {
	           return  ExecutionSummary;
	    }
	    @FindBy(xpath = "//nav[@class='sub-menu']/span[@class='transIcon-default_bookmark dock-icon']")
	    public WebElement  ExecutionSummaryPageBookMark;
	
	    public WebElement getExecutionSummaryPageBookMark() {
	           return  ExecutionSummaryPageBookMark;
	    }
	    @FindBy(xpath = "//following-sibling::a[text()='Wave Details']//following::span[@class='transIcon-bookmarked']//parent::a")
	    public WebElement  WaveDetailsBookMark;
	
	    public WebElement getWaveDetailsBookMark() {
	           return  WaveDetailsBookMark;
	    }
	    @FindBy(xpath = "//a[text()='Wave Details']")
	    public WebElement  WaveDetails;
	
	    public WebElement getWaveDetails() {
	           return  WaveDetails;
	    }
	    @FindBy(xpath = "//div[@class='bookmark-this']/a[@aria-label='Bookmark Wave Details']")
	    public WebElement  WaveDetailsPageBookMark;
	
	    public WebElement getWaveDetailsPageBookMark() {
	           return  WaveDetailsPageBookMark;
	    }
	    
	    @FindBy(xpath = "//a[text()='Enable People']")
	    public WebElement  EnablePeople;	
	    public WebElement getEnablePeople() {
	           return  EnablePeople;
	    }
	    @FindBy(xpath = "//following-sibling::a[text()='Enable People']//following::span[@class='transIcon-bookmarked']//parent::a")
	    public WebElement  EnablePeopleBookMark;	
	    public WebElement getEnablePeopleBookMark() {
	           return  EnablePeopleBookMark;
	    }
	    @FindBy(xpath = "//div[@class='bookmark-this']/a[@aria-label='Bookmark Enable People']")
	    public WebElement  EnablePeoplePageBookMark;	
	    public WebElement getEnablePeoplePageBookMark() {
	           return EnablePeoplePageBookMark;
	    }
	    @FindBy(xpath = "//a[text()='Train the Trainer']")
	    public WebElement  TTT;	
	    public WebElement getTTT() {
	           return  TTT;
	    }
	    @FindBy(xpath = "//following-sibling::a[text()='Train the Trainer']//following::span[@class='transIcon-bookmarked']//parent::a")
	    public WebElement  TTTBookMark;	
	    public WebElement getTTTBookMark() {
	           return  TTTBookMark;
	    }
	    @FindBy(xpath = "//div[@class='bookmark-this']/a[@title='Bookmark Train The Trainer']")
	    public WebElement  TTTPageBookMark;	
	    public WebElement getTTTPageBookMark() {
	           return TTTPageBookMark;
	    }
	    @FindBy(xpath = "//a[@id='clientTeam']")
	    public WebElement  TTT_Tracker;	
	    public WebElement getTTT_Tracker() {
	           return TTT_Tracker;
	    }
	    
	    @FindBy(xpath = "//a[text()='Delivery Team Training']")
	    public WebElement  DTT;	
	    public WebElement getDTT() {
	           return  DTT;
	    }
	    @FindBy(xpath = "//following-sibling::a[text()='Delivery Team Training']//following::span[@class='transIcon-bookmarked']//parent::a")
	    public WebElement  DTTBookMark;	
	    public WebElement getDTTBookMark() {
	           return  DTTBookMark;
	    }
	    @FindBy(xpath = "//div[@class='bookmark-this']/a[@title='Bookmark Delivery Team Training']")
	    public WebElement  DTTPageBookMark;	
	    public WebElement getDTTPageBookMark() {
	           return DTTPageBookMark;
	    }
	    @FindBy(xpath = "//a[@id='spend']")
	    public WebElement  DTT_Tracker;	
	    public WebElement getDTT_Tracker() {
	           return DTT_Tracker;
	    }
	    
	    @FindBy(xpath = "//a[text()='Tech & Work Environment']")
	    public WebElement  TechWork;	
	    public WebElement getTechWork() {
	           return  TechWork;
	    }
	    @FindBy(xpath = "//following-sibling::a[text()='Tech & Work Environment']//following::span[@class='transIcon-bookmarked']//parent::a")
	    public WebElement  TechWorkBookMark;	
	    public WebElement getTechWorkBookMark() {
	           return TechWorkBookMark;
	    }
	    
	    
	    
	    @FindBy(xpath = "//div[@class='bookmark-this']/a[@title='Bookmark Tech & Work Environment']")
	    public WebElement  TechWorkPageBookMark;	
	    public WebElement getTechWorkPageBookMark() {
	           return TechWorkPageBookMark;
	    }
	    @FindBy(xpath = "//a[@id='tweSetup']")
	    public WebElement  TWE_Tracker;	
	    public WebElement getTWE_Tracker() {
	           return TWE_Tracker;
	    }
	    
	    
	    @FindBy(xpath = "//a[text()='Service Rehearsal Test (SRT)']")
	    public WebElement  SRT;	
	    public WebElement getSRT() {
	           return  SRT;
	    }
	    @FindBy(xpath = "//following-sibling::a[text()='Service Rehearsal Test (SRT)']//following::span[@class='transIcon-bookmarked']//parent::a")
	    public WebElement  SRTBookMark;	
	    public WebElement getSRTBookMark() {
	           return SRTBookMark;
	    }
	    @FindBy(xpath = "//div[@class='bookmark-this']/a[@title='Bookmark Service Rehearsal Test (SRT)']")
	    public WebElement  SRTPageBookMark;	
	    public WebElement getSRTPageBookMark() {
	           return SRTPageBookMark;
	    }
	    @FindBy(xpath = "//a[@id='coreteam']")
	    public WebElement  SRT_Assessment;	
	    public WebElement getSRT_Assessment() {
	           return SRT_Assessment;
	    }
	    
	    @FindBy(xpath = "//a[text()='Wave Workstream Setup']")
	    public WebElement  WaveWorkStreamSetup;	
	    public WebElement getWaveWorkStreamSetup() {
	           return WaveWorkStreamSetup;
	    }
	    @FindBy(xpath = "//span[@class='k-icon k-i-edit']//parent::a")
	    public WebElement  WaveWorkStreamSetupEditButton;	
	    public WebElement getWaveWorkStreamSetupEditButton() {
	           return WaveWorkStreamSetupEditButton;
	    }
	    @FindAll(@FindBy(xpath = "//select[@id='TWEapp_']/option"))
	    public  java.util.List<WebElement>   TWE_Application;	
	    public  java.util.List<WebElement>  getTWE_Application() {
	           return TWE_Application;
	    }
	    @FindBy(xpath = "//a[text()='Save']")
	    public WebElement  SaveButton;	
	    public WebElement getSaveButton() {
	           return SaveButton;
	    }
	    @FindBy(xpath = "//ul[@role='tablist']//div")
	    public WebElement  TechWorkNotApplicable;	
	    public WebElement getTechWorkNotApplicable() {
	           return TechWorkNotApplicable;
	    }
	    @FindBy(xpath = "//span[@aria-owns='EPapp__listbox']/span/span")
	    public WebElement  EnablePeopleApplicationTextDropBox;	
	    public WebElement getEnablePeopleApplicationTextDropBox() {
	           return EnablePeopleApplicationTextDropBox;
	    }
	    
	    
	    
	    
	    
	    @FindBy(xpath = "//label[text()='TWE Applicable*']//parent::div/span/span/span[2]/span")
	    public WebElement TWEDropDownButton;	
	    public WebElement getTWEDropDownButton() {
	           return TWEDropDownButton;
	    }
	    
	    @FindAll(@FindBy(xpath = "//label[text()='TWE Applicable*']//parent::div//select//option"))
	    public java.util.List<WebElement> TWEDropDownValue;	
	    public java.util.List<WebElement> getTWEDropDownValue() {
	           return TWEDropDownValue;
	    }
	    @FindBy(xpath = "//label[text()='Enable People Applicable*']//parent::div/span/span/span[2]/span")
	    public WebElement  EnablePeopleDropButton;	
	    public WebElement getEnablePeopleDropButton() {
	           return EnablePeopleDropButton;
	    }
	    @FindAll(@FindBy(xpath = "//label[text()='Enable People Applicable*']//parent::div//select//option"))
	    public java.util.List<WebElement>  EnablePeopleDropValue;	
	    public java.util.List<WebElement> getEnablePeopleDropValue() {
	           return EnablePeopleDropValue;
	    }
	    
	    @FindBy(xpath = "//label[text()='TTT Applicable*']//parent::div/span/span/span[2]/span")
	    public WebElement  TTTDropDownButton;	
	    public WebElement getTTTDropDownButton() {
	           return TTTDropDownButton;
	    }
	    @FindAll(@FindBy(xpath = "//label[text()='TTT Applicable*']//parent::div//select//option"))
	    public java.util.List<WebElement>  TTTDropValue;	
	    public java.util.List<WebElement> getTTTDropValue() {
	           return TTTDropValue;
	    }
	    
	    @FindBy(xpath = "//label[text()='DTT Applicable*']//parent::div/span/span/span[2]/span")
	    public WebElement  DTTDropDownButton;	
	    public WebElement getDTTDropDownButton() {
	           return DTTDropDownButton;
	    }
	    @FindAll(@FindBy(xpath = "//label[text()='DTT Applicable*']//parent::div//select//option"))
	    public java.util.List<WebElement>  DTTDropValue;	
	    public java.util.List<WebElement> getDTTDropValue() {
	           return DTTDropValue;
	    }
	    
	    @FindBy(xpath = "//label[text()='Service Rehearsal Test (SRT) Applicable*']//parent::div/span/span/span[2]/span")
	    public WebElement  SRTDropDownButton;	
	    public WebElement getSRTDropDownButton() {
	           return DTTDropDownButton;
	    }
	    @FindAll(@FindBy(xpath = "//label[text()='Service Rehearsal Test (SRT) Applicable*']//parent::div//select//option"))
	    public java.util.List<WebElement>  SRTDropValue;	
	    public java.util.List<WebElement> getSRTDropValue() {
	           return SRTDropValue;
	    }
	    @FindBy(xpath = "//div[@id='FBModal']//i")
	    public WebElement  FeedbackCross;	
	    public WebElement getFeedbackCross() {
	           return FeedbackCross;
	    }
	    
	    @FindBy(xpath = "//div[@id='exportSRT']//div//a[text()='One']")
	    public WebElement  SRATStatusWaveLink;	
	    public WebElement getSRATStatusWaveLink() {
	           return SRATStatusWaveLink;
	    }
	    @FindBy(xpath = "//div[@id='exportSRT']//div//a[text()='One']//parent::td//parent::tr/td[2]/span")
	    public WebElement  SRATStatusWaveLinkOverAllRAGStatusColor;	
	    public WebElement getSRATStatusWaveLinkOverAllRAGStatusColor() {
	           return SRATStatusWaveLinkOverAllRAGStatusColor;
	    }
	    
	    @FindBy(xpath = "//table[@class='k-palette k-reset']/tbody/tr[1]/td")
	    public WebElement  SRATRAGGrayColor;	
	    public WebElement getSRATRAGGrayColor() {
	           return SRATRAGGrayColor;
	    }
	    
	    @FindBy(xpath = "//table[@class='k-palette k-reset']/tbody/tr[2]/td")
	    public WebElement  SRATRAGBlueColor;	
	    public WebElement getSRATRAGBlueColor() {
	           return SRATRAGBlueColor;
	    }
	    @FindBy(xpath = "//label[text()='RAG Status:']//parent::div//span[@class='k-select']/span")
	    public WebElement  SRATRAGColorDropDownButton;	
	    public WebElement getSRATRAGColorDropDownButton() {
	           return SRATRAGColorDropDownButton;
	    }
	  
	    @FindBy(xpath = "//button[@title='Action : Send for Approval']")
	    public WebElement  SRATSendSaveButton;	
	    public WebElement getSRATSendSaveButton() {
	           return SRATSendSaveButton;
	    }
	    
	    @FindBy(xpath = "//div[@id='grid_opex']//a[text()='One']")
	    public WebElement  WaveLevelBEAssessmentLinkONE;	
	    public WebElement getWaveLevelBEAssessmentLinkONE() {
	           return WaveLevelBEAssessmentLinkONE;
	    }
	    @FindBy(xpath = "//input[@id='transcomplprc']")
	    public WebElement  CompletedPersentageInEditSARTBE;	
	    public WebElement getCompletedPersentageInEditSARTBE() {
	           return CompletedPersentageInEditSARTBE;
	    }
	    @FindBy(xpath = "//span[@ng-bind='dataItem.completedPct']")
	    public WebElement  CompleteParsent;	
	    public WebElement getCompleteParsent() {
	           return CompleteParsent;
	    }
	    @FindBy(xpath = "//span[@class='transIcon-default_bookmark dock-icon']")
	    public WebElement  BookMarkSymbole;	
	    public WebElement getBookMarkSymbole() {
	           return BookMarkSymbole;
	    }
	    @FindBy(xpath = "//h1[text()='Execution Summary']")
	    public WebElement  ExecutionSummaryLandingPageTitle;	
	    public WebElement getExecutionSummaryLandingPageTitle() {
	           return ExecutionSummaryLandingPageTitle;
	    }
	    
	    @FindBy(xpath = "*//div[@class='bookmark-this']//a[@class='bookmark docked']")
		public WebElement MecChecklistbokkmarkedicon;

		public WebElement getMecChecklistbokkmarkedicon() {
			return MecChecklistbokkmarkedicon;
		} 
		@FindBy(xpath = "*//div[@class='bookmark-this']//a[@class='bookmark']")
		public WebElement MecChecklistNotbokkmarkedicon;

		public WebElement getMecChecklistNotbokkmarkedicon() {
			return MecChecklistNotbokkmarkedicon;
		}
		@FindBy(xpath = "//div//ul//li//following-sibling::a[text()='MEC Checklist']//following::a")
		public WebElement bookMarkMECchecklistcheck;

		public WebElement getbookMarkMECchecklistcheck() {
			return bookMarkMECchecklistcheck;
		}

	    
	    
	    
}




