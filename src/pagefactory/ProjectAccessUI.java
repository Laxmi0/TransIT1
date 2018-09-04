package pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class ProjectAccessUI {
	
	@FindBy(xpath = "*//button[@id='AddProjUserAccessbtn']")
	public WebElement AddRoleButton;

	public WebElement getAddRoleButton() {
		return AddRoleButton;
	}
	@FindBy(xpath = "//li[2][@role='menuitem']//a//span[@class='transIcon-execution icon']")
	public WebElement ExecutionIcon;

	public WebElement getExecutionIcon() {
		return ExecutionIcon;
	}
	

	@FindBy(xpath = "//h1//a//span[text()='AutomationMay2018']")
	public WebElement ProjectCard;

	public WebElement getProjectCard() {
		return ProjectCard;
	}
	
	@FindBy(xpath = "*//a[@class='transIcon-manage_bookmarks more-icon']")
	public WebElement ManagebookmarkIcon;

	public WebElement getManagebookmarkIcon() {
		return ManagebookmarkIcon;
	}
	
	@FindBy(xpath = "*//i[@class='transIcon-user_access icon']")
	public WebElement ProjectUserAccessIcon;

	public WebElement getProjectUserAccessIcon() {
		return ProjectUserAccessIcon;
	}
	
	@FindBy(xpath = "*//table//tbody//tr[2]//td[8]")
	public WebElement CareerLevelfieldatRowLevel;

	public WebElement getCareerLevelfieldatRowLevel() {
		return CareerLevelfieldatRowLevel;
	}
	
	@FindBy(xpath = "*//table//tbody//tr[2]//td[6]")
	public WebElement ServiceGroupatRowLevel;

	public WebElement getServiceGroupatRowLevel() {
		return ServiceGroupatRowLevel;
	}
	
	@FindBy(xpath = "*//table//tbody//tr[2]//td[9]")
	public WebElement LocationatRowLevel;

	public WebElement getLocationatRowLevel() {
		return LocationatRowLevel;
	}
	
	@FindBy(xpath = "*//table//tbody//tr[2]//td[11]")
	public WebElement SourcingRowLevel;

	public WebElement getSourcingRowLevel() {
		return SourcingRowLevel;
	}
	
	@FindBy(xpath = "*//table//tbody//tr[2]//td[10]")
	public WebElement DealWaveatRowLevel;

	public WebElement getDealWaveatRowLevel() {
		return DealWaveatRowLevel;
	}
	@FindBy(xpath = "*//table//tbody//tr[2]//td[18]")
	public WebElement ProjectsupvsrRowLevel;

	public WebElement getProjectsupvsrRowLevel() {
		return ProjectsupvsrRowLevel;
	}
	@FindBy(xpath = "*//input[@id='projUserName']")
	public WebElement AddRoleUserName;

	public WebElement getAddRoleUserName() {
		return AddRoleUserName;
	}

	@FindBy(xpath = "*//div[label='User Profile']")
	public WebElement projUserProfile;

	public WebElement getprojUserProfile() {
		return projUserProfile;
	}
	
	
	@FindBy(xpath = "*//div[label='Role*']//span//span[1]")
	public WebElement AddRoletouser;
  
	public WebElement getAddRoletouser() {
		return AddRoletouser;
	}
	
	@FindBy(xpath = "*//div[label='Location*']//span/span[1]")
	public WebElement AddLocation;

	public WebElement getAddLocation() {
		return AddLocation;
	}
	
	
	
	@FindBy(xpath = "*//div[label='Deal/ Wave*']//span/span[1]")
	public WebElement AddDealWave1;

	public WebElement getAddDealWave1() {
		return AddDealWave1;
	}
	
	
	@FindBy(xpath = "*//div[label='Sourcing*']//span/span[1]")
	public WebElement AddSourcing1;

	public WebElement getAddSourcing1() {
		return AddSourcing1;
	}
	
	@FindBy(xpath = "*//div[label='Status*']//span/span[1]")
	public WebElement AddStatus1;

	public WebElement getAddStatus1() {
		return AddStatus1;
	}
	
	@FindBy(xpath = "*//div[label='Career Level*']")
	public WebElement AddRoleCareerLevel;

	public WebElement getAddRoleCareerLevel() {
		return AddRoleCareerLevel;
	}
	
	@FindBy(xpath = "*//div[label='Location*']")
	public WebElement AddRoleLocation;

	public WebElement getAddRoleLocation() {
		return AddRoleLocation;
	}
	
	@FindBy(xpath = "*//div[label='Deal/ Wave*']")
	public WebElement AddDealWave;

	public WebElement getAddDealWave() {
		return AddDealWave;
	}
	
	@FindBy(xpath = "*//div[label='Sourcing*']")
	public WebElement AddSourcing;

	public WebElement getAddSourcing() {
		return AddSourcing;
	}
	
	@FindBy(xpath = "*//div[label='Status*']")
	public WebElement AddStatus;

	public WebElement getAddStatus() {
		return AddSourcing;
	}
	
	@FindBy(xpath = "*//div[text()='Data Saved successfully']//following::div//button[@type='button']")
	public WebElement AddRolePopupClosebutton;

	public WebElement getAddRolePopupClosebutton() {
		return AddRolePopupClosebutton;
	}
	
	@FindBy(xpath = "//div//a[text()='Save']")
	public WebElement AddRoleSavebutton;

	public WebElement getAddRoleSavebutton() {
		return AddRoleSavebutton;
	}
	//@FindBy(xpath = "//div[@class='k-grid-content-locked']//tr[15]//td//a//span")
	@FindBy(xpath = "//div[@class='k-grid-content-locked']//tbody/tr[1]//span[@class='k-icon k-i-edit']")
	public WebElement EditButtonProjectAccess;

	public WebElement getEditButtonProjectAccess() {
		return EditButtonProjectAccess;
	}
	
	@FindBy(xpath = "//input[@id='emailId']")
	public WebElement EmailIdProjectAccess;

	public WebElement getEmailIdProjectAccess() {
		return EmailIdProjectAccess;
	}
	
	@FindBy(xpath = "//input[@id='contactNbr']")
	public WebElement ContactNumberProjectAccess;

	public WebElement getContactNumberProjectAccess() {
		return ContactNumberProjectAccess;
	}
	
	@FindBy(xpath = "//input[@id='projSupervisor']")
	public WebElement PrjctSupervisor;

	public WebElement getPrjctSupervisor() {
		return PrjctSupervisor;
	}
	
	@FindBy(xpath = "*//div[@class='k-grid-content k-auto-scrollable']//table//tbody//tr[1]//td[10]")
	public WebElement updatedcolumn;

	public WebElement getupdatedcolumn() {
		return updatedcolumn;
	}
	
	
	@FindBy(xpath = "*//span[@class='expand-grid-icon']")
	public WebElement ExpanderIcon;

	public WebElement getExpanderIcon() {
		return ExpanderIcon;
	}
	
	@FindBy(xpath = "*//div[@class='grid-with-columnMenu']//following-sibling::div[2]//a//span[@class='acn-shrink']")
	public WebElement ShrinkExpanderIcon;

	public WebElement getShrinkExpanderIcon() {
		return ShrinkExpanderIcon;
	}
	
	@FindBy(xpath = "//div[@class='k-grid-header-wrap k-auto-scrollable']//tr//th[2]")
	public WebElement UserNameHeader;

	public WebElement getUserNameHeader() {
		return UserNameHeader;
	}
	
	@FindBy(xpath = "//a[text()='User Name*']//span[@class='k-icon k-i-sort-asc-sm']")
	public WebElement AscSortSymbolforUserNameHeader;

	public WebElement getAscSortSymbolforUserNameHeader() {
		return AscSortSymbolforUserNameHeader;
	}
	
	@FindBy(xpath = "//a[text()='User Name*']//span[@class='k-icon k-i-sort-desc-sm']")
	public WebElement DescSortSymbolforUserNameHeader;

	public WebElement getDescSortSymbolforUserNameHeader() {
		return DescSortSymbolforUserNameHeader;
	}
	
	@FindBy(xpath = "//div[@class='k-grid-header-wrap k-auto-scrollable']//tr//th[5]")
	public WebElement UserProfileHeader;

	public WebElement getUserProfileHeader() {
		return UserProfileHeader;
	}
	
	@FindBy(xpath = "//a[text()='User Profile']//span[@class='k-icon k-i-sort-asc-sm']")
	public WebElement AscSortSymbolforUserProfileHeader;

	public WebElement getAscSortSymbolforUserProfileHeader() {
		return AscSortSymbolforUserProfileHeader;
	}
	
	@FindBy(xpath = "//a[text()='User Profile']//span[@class='k-icon k-i-sort-desc-sm']")
	public WebElement DescSortSymbolforUserProfileHeader;

	public WebElement getDescSortSymbolforUserProfileHeader() {
		return DescSortSymbolforUserProfileHeader;
	}
	
	
	@FindBy(xpath = "//div[@class='k-grid-header-wrap k-auto-scrollable']//tr//th[7]")
	public WebElement RoleHeader;

	public WebElement getRoleHeader() {
		return RoleHeader;
	}
	
	@FindBy(xpath = "//a[text()='Role*']//span[@class='k-icon k-i-sort-asc-sm']")
	public WebElement AscSortSymbolforRoleHeader;

	public WebElement getAscSortSymbolforRoleHeader() {
		return AscSortSymbolforRoleHeader;
	}
	
	@FindBy(xpath = "//a[text()='Role*']//span[@class='k-icon k-i-sort-desc-sm']")
	public WebElement DescSortSymbolforRoleHeader;

	public WebElement getDescSortSymbolforRoleHeader() {
		return DescSortSymbolforRoleHeader;
	}
	
	@FindAll(@FindBy(xpath="//div[@class='k-grid-content k-auto-scrollable']//table//tbody//tr//td[2]"))
	public java.util.List<WebElement> LisofUsernames;

	public java.util.List<WebElement> getLisofUsernames() {
		return LisofUsernames;
	}
	
	
	
	@FindBy(xpath = "//div[@class='k-grid-header-wrap k-auto-scrollable']//tr//th[8]")
	public WebElement CareerLevelHeader;

	public WebElement getCareerLevelHeader() {
		return CareerLevelHeader;
	}
	@FindBy(xpath = "//a[text()='Career Level*']//span[@class='k-icon k-i-sort-asc-sm']")
	public WebElement AscSortSymbolforCareerLevelHeader;

	public WebElement getAscSortSymbolforCareerLevelHeader() {
		return AscSortSymbolforCareerLevelHeader;
	}
	
	@FindBy(xpath = "//a[text()='Career Level*']//span[@class='k-icon k-i-sort-desc-sm']")
	public WebElement DescSortSymbolforCareerLevelHeader;

	public WebElement getDescSortSymbolforCareerLevelHeader() {
		return DescSortSymbolforCareerLevelHeader;
	}

	@FindBy(xpath = "//div[@class='k-grid-header-wrap k-auto-scrollable']//tr//th[9]")
	public WebElement LocationHeader;

	public WebElement getLocationHeader() {
		return LocationHeader;
	}
	
	@FindBy(xpath = "//a[text()='Location*']//span[@class='k-icon k-i-sort-asc-sm']")
	public WebElement AscSortSymbolforLocationHeader;

	public WebElement getAscSortSymbolforLocationHeader() {
		return AscSortSymbolforLocationHeader;
	}
	
	@FindBy(xpath = "//a[text()='Location*']//span[@class='k-icon k-i-sort-desc-sm']")
	public WebElement DescSortSymbolforLocationHeader;

	public WebElement getDescSortSymbolforLocationHeader() {
		return DescSortSymbolforLocationHeader;
	}
	
	
	@FindBy(xpath = "//input[@type='checkbox']//following-sibling::span")
	public WebElement UserNameBhagyalaxmi;

	public WebElement getUserNameBhagyalaxmi() {
		return UserNameBhagyalaxmi;
	}
	
	@FindBy(xpath = "//li//input[@signedoffacc]//following::button[text()='Filter']")
	public WebElement Filterbutton;

	public WebElement getFilterbutton() {
		return Filterbutton;
	}
	
	
	@FindBy(xpath = "//th[@data-field='userProfile']/a/span")
	public WebElement UserProfileFilter;

	public WebElement getUserProfileFilter() {
		return UserProfileFilter;
	}
	
	@FindBy(xpath = "//th[@data-field='role']//a//span")
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
	
	
	@FindAll(@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//tbody//tr"))
	java.util.List<WebElement> AccessUserDatalist;

	public java.util.List<WebElement> getAccessUserDatalist() {
		return AccessUserDatalist;
	} 
	
	@FindBy(xpath = "//div[@id='columnMenuButton']//a//span")
	public WebElement CustomIcon;

	public WebElement getCustomIcon() {
		return CustomIcon;
	}
	
	@FindBy(xpath = "//ul[@role='menubar']//li//span")
	public WebElement CustomIconLink;

	public WebElement getCustomIconLink() {
		return CustomIconLink;
	}
	
	@FindBy(xpath = "//div//h1[text()='Project User Access']//following-sibling::div/a")
	public WebElement ProjectAccessIconbookmark;

	public WebElement getProjectAccessIconbookmark() {
		return ProjectAccessIconbookmark;
	}
	
	@FindBy(xpath = "//div//h1[text()='Project User Access']//following-sibling::div//a[@class='bookmark docked']")
	public WebElement ProjectAccessIconbookmarkdocked;

	public WebElement getProjectAccessIconbookmarkdocked() {
		return ProjectAccessIconbookmarkdocked;
	}
	@FindBy(xpath = "//div//h1[text()='Project User Access']//following-sibling::div//a[@class='bookmark']")
	public WebElement ProjectAccessIconNotbookmarkdocked;

	public WebElement getProjectAccessIconNotbookmarkdocked() {
		return ProjectAccessIconNotbookmarkdocked;
	}
	
	@FindAll(@FindBy(xpath = "*//table[@role='grid']//tr/th"))
	public java.util.List<WebElement>ProjectAccesstableColumns;

	public List<WebElement> getProjectAccesstableColumns() {
		return ProjectAccesstableColumns;
	}
	
	@FindAll(@FindBy(xpath = "//div[@id='bookmarkedItem']//ul//li"))
	public java.util.List<WebElement>BookamrkTabitems;

	public List<WebElement> getBookamrkTabitems() {
		return BookamrkTabitems;
	}
	
	@FindBy(xpath = "//div//ul//li[@role='menuitemcheckbox']//span[text()='Email Id']/input[@type='checkbox']")
	public WebElement SubEmaiIdCustomIconLink;

	public WebElement getSubEmaiIdCustomIconLink() {
		return SubEmaiIdCustomIconLink;
	}
	
	@FindBy(xpath = "//div//ul//li[@role='menuitemcheckbox']//span[text()='Project Supervisor']/input[@type='checkbox']")
	public WebElement SubProjSupCustomIconLink;

	public WebElement getSubProjSupCustomIconLink() {
		return SubProjSupCustomIconLink;
	}
	
	@FindBy(xpath = "//div//ul//li[@role='menuitemcheckbox']//span[text()='Contact Number']/input[@type='checkbox']")
	public WebElement SubContactNbrCustomIconLink;

	public WebElement getSubContactNbrCustomIconLink() {
		return SubContactNbrCustomIconLink;
	}
	
	@FindAll(@FindBy(xpath = "//div//ul//li[@role='menuitemcheckbox']"))
	java.util.List<WebElement> CustomIconList;

	public java.util.List<WebElement> getCustomIconList() {
		return CustomIconList;
	}
	
	@FindBy(xpath = "//div[@id='bookmarkedItem']//ul//li[1]")
	public WebElement ExecutionSumarybookmark;

	public WebElement getExecutionSumarybookmark() {
		return ExecutionSumarybookmark;
	}
	
	@FindBy(xpath = "//div[@id='bookmarkedItem']//ul//li[2]")
	public WebElement 	PCTKitbookmark;

	public WebElement getPCTKitbookmark() {
		return PCTKitbookmark;
	}
	
	@FindBy(xpath = "//div[@id='bookmarkedItem']//ul//li[3]")
	public WebElement 	DealInfobookmark;

	public WebElement getDealInfobookmark() {
		return DealInfobookmark;
	}
	
	@FindBy(xpath = "//div[@id='bookmarkedItem']//ul//li[4]//a[text()='Project User Access']")
	public WebElement 	ProjectAceesbookmarkTab;

	   
	public WebElement getProjectAceesbookmarkTab() {
		return ProjectAceesbookmarkTab;
	}
	
	@FindAll(@FindBy(xpath = "//div[@id='bookmarkedItem']//ul//li"))
	public java.util.List<WebElement> 	ProjectAceesnotpresentbookmarkTab;

	   
	public List<WebElement> getProjectAceesnotpresentbookmarkTab() {
		return ProjectAceesnotpresentbookmarkTab;
	}
	
	@FindBy(xpath = "//div[@class='bookmark-this']//a[@class='bookmark docked']")
	public WebElement 	ProjectAceesbookmarkIconbookmarkcheck;

	public WebElement getProjectAceesbookmarkIconbookmarkcheck() {
		return ProjectAceesbookmarkIconbookmarkcheck;
	}
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement 	FilterSearchTextbox;

	public WebElement getFilterSearchTextbox() {
		return FilterSearchTextbox;
	}
	
	//@FindAll(@FindBy(xpath = "//button[@type='submit']//ancestor::div/form/ul//li[@style='display: none;']//label/span"))
	@FindAll(@FindBy(xpath = "//form//ul//li[@style='display: none;']"))
	public java.util.List<WebElement>	NotDisplayedElements;

	public List<WebElement> getNotDisplayedElements() {
		return NotDisplayedElements;
	}
	
	@FindAll(@FindBy(xpath = "//div[@class='k-grid-content k-auto-scrollable']//table[@role='grid']//tbody//tr"))
	public java.util.List<WebElement>	FilteredElements;

	public List<WebElement> getFilteredElements() {
		return FilteredElements;
	}
	
	@FindBy(xpath = "*//table//tbody//tr//td[2]//span[text()='bhagyalaxmi.sahu']")
	public WebElement UserthroughCreatebutton;

	public WebElement getUserthroughCreatebutton() {
		return UserthroughCreatebutton;
	}
	
	@FindBy(xpath = "*//table//tbody//tr//td[19]//span[text()='Active']")
	public WebElement UserthroughCreatebuttonStatus;

	public WebElement getUserthroughCreatebuttonStatus() {
		return UserthroughCreatebuttonStatus;
	}
	
	
	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr[1]//td[@class]"))
	java.util.List<WebElement> ProjectStaffingrow1elements;

	public java.util.List<WebElement> getProjectStaffingrow1elements() {
		return ProjectStaffingrow1elements;
	}

	@FindBy(xpath = "*//div[@class='k-grid-content-locked']//table[@tabindex='0']//tbody//tr[1]//td//a[@role='button']//span[@class='k-icon k-i-edit']")
	public WebElement UpdatebuttonStatus;

	public WebElement getUpdatebuttonStatus() {
		return UpdatebuttonStatus;
	}
	
	@FindAll(@FindBy(xpath = "*//table[@role='grid']//tbody//tr//td[1]"))
	public java.util.List<WebElement> SerialNumbers;

	public List<WebElement> getSerialNumbers() {
		return SerialNumbers;
	}
	
	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr//td[7]"))
	public java.util.List<WebElement>	ProjaccessGovernceLeadRole;

	public List<WebElement> getProjaccessGovernceLeadRole() {
		return ProjaccessGovernceLeadRole;
	}
	
	@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr//td[19]"))
	public java.util.List<WebElement>	ProjaccessStatusInactive;

	public List<WebElement> getProjaccessStatusInactive() {
		return ProjaccessStatusInactive;
	}
	
	@FindAll(@FindBy(xpath = "*//div[@class='k-grid-content-locked']//table[@tabindex='-1']//tbody//tr"))
	public java.util.List<WebElement>	ProjaccessEditbutton;

	public List<WebElement> getProjaccessEditbutton() {
		return ProjaccessEditbutton;
	}
	
	///////////////////////////////////////////////////////////////////
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
    
    @FindBy(xpath = "//th[@data-field='userName']//a//span")
    public WebElement UserNameFilter;

    public WebElement getUserNameFilter() {
           return UserNameFilter;
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
    
    @FindBy(xpath = "//label[text()='Location*']//following::span[2]")
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


@FindAll(@FindBy(xpath = "//table[@role='grid']//tbody//tr[1]//td"))
java.util.List<WebElement> ProjectAccessRow1Elements;

public java.util.List<WebElement> getProjectAccessRow1Elements() {
  return ProjectAccessRow1Elements;
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
@FindBy(xpath = "//*[@class='card-header']")
public WebElement cardHeader;

public WebElement getCardHeader() {
	return cardHeader;
}
}

