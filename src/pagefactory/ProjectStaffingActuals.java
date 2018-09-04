package pagefactory;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class ProjectStaffingActuals {
	@FindBy(xpath = "//span[text()='AutomationMay2018']")
	public WebElement ProjectCard;

	public WebElement getProjectCard() {
		return ProjectCard;
	}
	
	@FindBy(xpath = "//div[@class='proj-code ng-binding']")
	public WebElement cardnumber;
	
	public WebElement getcardnumber() {
		return cardnumber;
	}
	
	@FindBy(xpath = "//a//span[contains(@class,'execution')]")
	public WebElement executionheader;

	public WebElement getexecutionheader() {
		return executionheader;
	}
	
	@FindBy(xpath = "*//ul//li[3]//a[text()='Project Staffing']")
	public WebElement projstaff;

	public WebElement getprojstaff() {
		return projstaff;
	}
	
	@FindBy(xpath = "//a[@class='transIcon-manage_bookmarks more-icon']")
	public WebElement Managebookamrkicon;
	
	public WebElement getManagebookamrkicon() {
		return Managebookamrkicon;
	}
	
	@FindBy(xpath = "//div[@class='container-fluid internal-page-title']//h1[text()]")
	public WebElement ProjectStaffHeading;
	
	public WebElement getProjectStaffHeading() {
		return ProjectStaffHeading;
	}
	@FindBy(xpath = "//div[@class='container-fluid internal-page-title']//span[@class='transIcon-bookmarked']")
	public WebElement ProjectStaffBookamrkicon;
	
	public WebElement getProjectStaffBookamrkicon() {
		return ProjectStaffBookamrkicon;
	}
	
	@FindBy(xpath = "//i[@class='transIcon-user_access icon']")
	public WebElement ProjUseraccesskicon;
	
	public WebElement getProjUseraccesskicon() {
		return ProjUseraccesskicon;
	}
	
	@FindBy(xpath = "//i[@class='transIcon-logout']")
	public WebElement Logoutbutton;
	
	public WebElement getLogoutbutton() {
		return Logoutbutton;
	}
	
	@FindBy(xpath = "*//button[@id='btnAddRole']")
	public WebElement AddRoleButton;

	public WebElement getAddRoleButton() {
		return AddRoleButton;
	}
	
	@FindBy(xpath = "//div[@class='form-group col-sm-6']//label[text()='Resource Name*']")
	public WebElement AddRoleResourceNameText;

	public WebElement getAddRoleResourceNameText() {
		return AddRoleResourceNameText;
	}
	
	@FindBy(xpath = "//div[@class='form-group col-sm-6']//label[text()='Role*']")
	public WebElement AddRolewthRoleText;

	public WebElement getAddRolewthRoleText() {
		return AddRolewthRoleText;
	}
	
	@FindBy(xpath = "//div[@id='SourcingName-list']//following::div[@rebuild-on='rebuildAddRoleActualStaffing']//div[@class='form-group col-sm-6']//label[text()='Career Level']")
	public WebElement AddRoleCareerLevelText;

	public WebElement getAddRoleCareerLevelText() {
		return AddRoleCareerLevelText;
	}
	
	@FindBy(xpath = "//div[@class='form-group col-sm-6']//label[text()='Location*']")
	public WebElement AddRoleLocationText;

	public WebElement getAddRoleLocationText() {
		return AddRoleLocationText;
	}
	
	@FindBy(xpath = "//div[@class='form-group col-sm-6']//label[text()='Deal/ Wave*']")
	public WebElement AddRoleDealWaveText;

	public WebElement getAddRoleDealWaveText() {
		return AddRoleDealWaveText;
	}
	
	@FindBy(xpath = "//div[@class='form-group col-sm-6']//label[text()='Sourcing*']")
	public WebElement AddRoleSourcingText;

	public WebElement getAddRoleSourcingText() {
		return AddRoleSourcingText;
	}
	
	
	
	@FindBy(xpath = "//div[@class='form-group col-sm-6']//span//input[@id='UserName']")
	public WebElement AddRoleResourceNameField;

	public WebElement getAddRoleResourceNameField() {
		return AddRoleResourceNameField;
	}
	
	@FindBy(xpath = "//div[@class='form-group col-sm-6']//label[text()='Role*']//following::span[@aria-owns='RoleName_listbox']")
	public WebElement AddRoleField;

	public WebElement getAddRoleField() {
		return AddRoleField;
	}
	
	@FindBy(xpath = "//div[@class='form-group col-sm-6']//span[@aria-owns='LevelName_listbox']")
	public WebElement AddRoleCareerLevelField;

	public WebElement getAddRoleCareerLevelField() {
		return AddRoleCareerLevelField;
	}
	
	@FindBy(xpath = "//div[@class='form-group col-sm-6']//span[@aria-owns='LocationName_listbox']")
	public WebElement AddRoleLocationField;

	public WebElement getAddRoleLocationField() {
		return AddRoleLocationField;
	}
	
	@FindBy(xpath = "//div[@class='form-group col-sm-6']//span[@aria-owns='roleFor_listbox']")
	public WebElement AddRoleDealWaveField;

	public WebElement getAddRoleDealWaveField() {
		return AddRoleDealWaveField;
	}
	
	@FindBy(xpath = "//div[@class='form-group col-sm-6']//span[@aria-owns='SourcingName_listbox']")
	public WebElement AddRoleSourcingField;

	public WebElement getAddRoleSourcingField() {
		return AddRoleSourcingField;
	}
	
	
	@FindBys(@FindBy(xpath = "//ul[@role='menu']//li[@role='menuitem']"))
	private List<WebElement> menuheadericonslist;

	public List<WebElement> getmenuheadericonslist() {
		return menuheadericonslist;
	}
	@FindBys(@FindBy(xpath = "//div[@class='k-grid-header-wrap k-auto-scrollable']//table//thead//tr//th"))
	private List<WebElement> projectstaffingheaderlist;

	public List<WebElement> getprojectstaffingheaderlist() {
		return projectstaffingheaderlist;
	}
	
	@FindBy(xpath = "//div[@id='AddStaffingActual']//div[@class='modal-header']//button[@aria-label='Close']")
	public WebElement AddRolePopupClosebutton;

	public WebElement getAddRolePopupClosebutton() {
		return AddRolePopupClosebutton;
	}
	
	@FindBy(xpath = "//div//button[text()='Save']")
	public WebElement AddRoleSavebutton;

	public WebElement getAddRoleSavebutton() {
		return AddRoleSavebutton;
	}
	
	@FindBy(xpath = "//span[@id='transErrPersonText' and text()]")
	public WebElement AddRoleMandaoryErrorMessage;

	public WebElement getAddRoleMandaoryErrorMessage() {
		return AddRoleMandaoryErrorMessage;
	}
	
	@FindBy(xpath = "//div[@class='k-grid-content-locked']//table[@tabindex='0']//tbody//tr[1]//td//a[@role='button']//span[@class='k-icon k-i-edit']")
	public WebElement EditbuttonClick;

	public WebElement getEditbuttonClick() {
		return EditbuttonClick;
	}
	
	@FindAll(@FindBy(xpath = "//span[@class='k-icon k-i-edit']"))
	public  List<WebElement> EditbuttonClick1;

	public List<WebElement> getEditbuttonClick1() {
		return EditbuttonClick1;
	}
	
	@FindBy(xpath = "//div[@id='SourcingName-list']//following::div[@rebuild-on='rebuildAddRoleActualStaffing']//div[@class='form-group col-sm-6']//label[text()='Career Level']//following::input[@id='LevelName']")
	public WebElement EditProjstaffCareerLevelField;

	public WebElement getEditProjstaffCareerLevelField() {
		return EditProjstaffCareerLevelField;
	}
	@FindBy(xpath = "//a[@role='button']//span[@class='k-icon k-i-close']")
	public WebElement EditProjstaffClosebutton;

	public WebElement getEditProjstaffClosebutton() {
		return EditProjstaffClosebutton;
	}
	
	@FindBy(xpath = "//div[1][@class='form-group col-sm-6']//label[text()='Location*']//following::span[1]")
	public WebElement EditProjstaffLocationField;

	public WebElement getEditProjstaffLocationField() {
		return EditProjstaffLocationField;
	}
	
	@FindBy(xpath = "//span[@class='expand-grid-icon']")
	public WebElement projectstaffexpandericon;

	public WebElement getprojectstaffexpandericon() {
		return projectstaffexpandericon;
	}
	
	@FindBy(xpath = "//span[@class='acn-shrink']")
	public WebElement projectstaffexpandershrinkicon;

	public WebElement getprojectstaffexpandershrinkicon() {
		return projectstaffexpandershrinkicon;
	}
	
	
	
	@FindBy(xpath = "//div[1][@class='form-group col-sm-6']//label[text()='Sourcing*']//following::span[1]")
	public WebElement EditProjstaffSourcingField;

	public WebElement getEditProjstaffSourcingField() {
		return EditProjstaffSourcingField;
	}
	
	@FindBy(xpath = "//div[@class='form-group col-sm-6']//input[@type='number' and @data-bind='value:  gstId']")
	public WebElement EditProjstaffGSTIDField;

	public WebElement getEditProjstaffGSTIDField() {
		return EditProjstaffGSTIDField;
	}
	
	@FindBy(xpath = "//a[@class='k-link' and text()='Resource Name*']")
	public WebElement SortOptionforResource;

	public WebElement getSortOptionforResource() {
		return SortOptionforResource;
	}
	
	@FindBy(xpath = "//a[@class='k-link' and text()='Resource Name*']//span[@class='k-icon k-i-sort-asc-sm']")
	public WebElement AscSortOptionforResource;

	public WebElement getAscSortOptionforResource() {
		return AscSortOptionforResource;
	}
	
	@FindBy(xpath = "//a[text()='Resource Name*']//span[@class='k-icon k-i-sort-desc-sm']")
	public WebElement DescSortOptionforResource;

	public WebElement getDescSortOptionforResource() {
		return DescSortOptionforResource;
	}
	
		@FindBy(xpath = "*//th[text()='Status']//span[@class='k-icon k-i-filter']")
		public WebElement StatusFilter;
	
		public WebElement getStatusFilter() {
			return StatusFilter;
		}
		
		@FindBy(xpath = "//input[@type='checkbox' and @value='InActive']")
		public WebElement StatusFilterforInActive;
	
		public WebElement getStatusFilterforInActive() {
			return StatusFilterforInActive;
		}
	
		@FindBy(xpath = "//ul[@class='k-reset k-multicheck-wrap']//following-sibling::button[1]")
		public WebElement StatusFilterbutton;
		
		public WebElement getStatusFilterbutton() {
			return StatusFilterbutton;
		}
		
		@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr"))
		public List<WebElement> NumberofRowsOnStatusSelection;

		public List<WebElement> getNumberofRowsOnStatusSelection() {
			return NumberofRowsOnStatusSelection;
		}
		
		
		
		@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr//td[12]//span[text()='InActive']"))
		public List<WebElement> NoOfRowsBeforeFilter;

		public List<WebElement> getNoOfRowsBeforeFilter() {
			return NoOfRowsBeforeFilter;
		}
		
		@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr//td[14]//span[text()='Transition Lead']"))
		public List<WebElement> NoOfRowsBeforeFilter1;

		public List<WebElement> getNoOfRowsBeforeFilter1() {
			return NoOfRowsBeforeFilter1;
		}
		
		@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr//td[12]"))
		public List<WebElement> TextPresentOnStatusSelectionfield;

		public List<WebElement> getTextPresentOnStatusSelectionfield() {
			return TextPresentOnStatusSelectionfield;
		}
		
		@FindBy(xpath = "//input[@type='checkbox' and @value='Transition Lead']")
		public WebElement RoleFilterforTransitionLead;
	
		public WebElement getRoleFilterforTransitionLead() {
			return RoleFilterforTransitionLead;
		}
	
		@FindBy(xpath = "//ul[@class='k-reset k-multicheck-wrap']//li//label//input[@name='role']//following::button[1]")
		public WebElement RoleFilterbutton;
		
		public WebElement getRoleFilterbutton() {
			return RoleFilterbutton;
		}
		@FindBy(xpath = "*//th[text()='Role*']//span[@class='k-icon k-i-filter']")
		public WebElement RoleFilter;
	
		public WebElement getRoleFilter() {
			return RoleFilter;
		}
		
		@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr//td[14]"))
		public List<WebElement> TextPresentOnRoleSelectionfield;

		public List<WebElement> getTextPresentOnRoleSelectionfield() {
			return TextPresentOnRoleSelectionfield;
		}
		
		@FindBy(xpath = "*//th[@data-field='actuallevel']//a[@class='k-grid-filter']//span")
		public WebElement CareerLevelFilter;
	
		public WebElement getCareerLevelFilter() {
			return CareerLevelFilter;
		}
		
		@FindBy(xpath = "*//th[text()='Location*']//a[@class='k-grid-filter']//span")
		public WebElement LocationFilter;
	
		public WebElement getLocationFilter() {
			return LocationFilter;
		}
		
		@FindBy(xpath = "*//th[text()='Deal/ Wave*']//a[@class='k-grid-filter']//span")
		public WebElement DealWaveFilter;
	
		public WebElement getDealWaveFilter() {
			return DealWaveFilter;
		}
		
		@FindBy(xpath = "*//th[text()='Sourcing*']//a[@class='k-grid-filter']//span")
		public WebElement SourcingFilter;
	
		public WebElement getSourcingFilter() {
			return SourcingFilter;
		}
		
		@FindBy(xpath = "//ul//li//input[@name='role']//ancestor::div//form//input[@placeholder='Search']")
		public WebElement RoleFilterSearchbutton;
	
		public WebElement getRoleFilterSearchbutton() {
			return RoleFilterSearchbutton;
		}
		
		@FindBys(@FindBy(xpath = "//div[@id='SourcingName-list']//div[text()]//following::div//form//div//input[1]//following::ul//li//input[@name='role']"))
		public List<WebElement> ListOfFileNameValues;
	
		public List<WebElement> getListOfFileNameValues() {
			return ListOfFileNameValues;
		}
		
		@FindBys(@FindBy(xpath = "//div[@id='SourcingName-list']//div[text()]//following::div//form//div//input[1]//following::ul//li[@style='display: none;']//input[@name='role']"))
		public List<WebElement> RoleFilterlistnotcontainingSearch;
	
		public List<WebElement> getRoleFilterlistnotcontainingSearch() {
			return RoleFilterlistnotcontainingSearch;
		}
		
		@FindBy(xpath = "//ul//li//input[@name='actuallevel']//ancestor::div//form//input[@placeholder='Search']")
		public WebElement CareerlevelFilterSearchbutton;
	
		public WebElement getCareerlevelFilterSearchbutton() {
			return CareerlevelFilterSearchbutton;
		}
		
		@FindBy(xpath = "//ul//li//input[@name='action']//ancestor::div//form//input[@placeholder='Search']")
		public WebElement StatusFilterSearchbutton;
	
		public WebElement getStatusFilterSearchbutton() {
			return StatusFilterSearchbutton;
		}
		
		@FindBy(xpath = "//ul//li//input[@name='actualsourcing']//ancestor::div//form//input[@placeholder='Search']")
		public WebElement SourcingFilterSearchbutton;
	
		public WebElement getSourcingFilterSearchbutton() {
			return SourcingFilterSearchbutton;
		}
	
	@FindBys(@FindBy(xpath = "//div[@class='form-group col-sm-6 ng-scope']//input"))
	public List<WebElement> EditProjstaffMonthFields;

	public List<WebElement> getEditProjstaffMonthFields() {
		return EditProjstaffMonthFields;
	}
	
	@FindBy(xpath = "//div//a[@role='button' and @class='k-button k-button-icontext k-primary k-grid-update']")
	public WebElement EditScreenSavebutton;

	public WebElement getEditScreenSavebutton() {
		return EditScreenSavebutton;
	}
	
	@FindBy(xpath = "//span[@class='transIcon-export']")
	public WebElement ExportIcon;

	public WebElement getExportIcon() {
		return ExportIcon;
	}
	

	@FindBy(xpath = "//span[@class='transIcon-export']")
	public WebElement GSTIdColumn;

	public WebElement getGSTIdColumn() {
		return GSTIdColumn;
	}
	

	@FindBy(xpath = "//span[@class='transIcon-export']")
	public WebElement AddedRole;

	public WebElement getAddedRole() {
		return AddedRole;
	}	
	
	@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//table//tbody//tr[5]//td[16]")
	public WebElement updatedrow;

	public WebElement getupdatedrow() {
		return updatedrow;
	}	
	
	
	@FindBys(@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//table//tbody//tr//td[13]"))
	public List<WebElement> ResourcenameAtRowLevel;

	public List<WebElement> getResourcenameAtRowLevel() {
		return ResourcenameAtRowLevel;
	}
	
	@FindBys(@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//table//tbody//tr//td[14]"))
	public List<WebElement> ResourceRoleAtRowLevel;

	public List<WebElement> getResourceRoleAtRowLevel() {
		return ResourceRoleAtRowLevel;
	}
	
	@FindBys(@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//table//tbody//tr"))
	public List<WebElement> TotalRows;

	public List<WebElement> getTotalRows() {
		return TotalRows;
	}
	
	@FindBy(xpath = "//div[@class='k-grid-header-wrap k-auto-scrollable']//table//thead//tr//th[text()]")
	public WebElement headercolumns;

	public WebElement getheadercolumns() {
		return headercolumns;
	}	
	
}
