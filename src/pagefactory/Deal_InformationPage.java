package pagefactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;


public class Deal_InformationPage {
	@FindBy(xpath = "//*[@class='card-header']")            
	public WebElement cardHeader; 

	public WebElement getCardHeader() {
		return cardHeader;
	}
	
	@FindBy(xpath = "//span[text()='9thMar2018']")
	public WebElement ProjectCard;

	public WebElement getProjectCard() {
		return ProjectCard;
	}

	@FindBy(xpath = "//li[2][@role='menuitem']//a//span[@class='transIcon-execution icon']")
	public WebElement ExecutionIcon;

	public WebElement getExecutionIcon() {
		return ExecutionIcon;
	}
	@FindBy(xpath = "//div//ul//li//following-sibling::a[text()='Deal Execution']")
	public WebElement DealExecutiondashboardIcon;

	public WebElement getDealExecutiondashboardIcon() {
		return DealExecutiondashboardIcon;
	}
	
	
	@FindBy(xpath = "*//div[@class='deal-information-wrapper']//div[1]//label[1]")
	public WebElement DealRAG;

	public WebElement getDealRAG() {
		return DealRAG;
	}
	@FindBy(xpath = "*//div[@class='deal-information-wrapper']//div[2]//label[1]")
	public WebElement DealComments;

	public WebElement getDealComments() {
		return DealComments;
	}
	
	@FindBy(xpath = "*//div[@id='divpopupMessage' and text()='Deal comments is mandatory if deal rag status is red or amber.']")
	public WebElement PopupMessageMandatoryComments;

	public WebElement getPopupMessageMandatoryComments() {
		return PopupMessageMandatoryComments;
	}
	
	@FindBy(xpath = "//*[@id='btnMessageOK']")
	public WebElement MandatoryOkButton;

	public WebElement getMandatoryOkButton() {
		return MandatoryOkButton;
	}
	
	@FindBy(xpath = "*//div[@class='deal-information-wrapper']//div[3]//label[1]")
	public WebElement ClientPerceptionRAG;

	public WebElement getClientPerceptionRAG() {
		return ClientPerceptionRAG;
	}
	@FindBy(xpath = "*//div[@class='deal-information-wrapper']//div[4]//label[1]")
	public WebElement GovernenaceAttentionLevel;

	public WebElement getGovernenaceAttentionLevel() {
		return GovernenaceAttentionLevel;
	}
	
	@FindBy(xpath = "*//div[@class='deal-information-wrapper']//div[5]//label[1]")
	public WebElement ContractLegalRAGStatus;

	public WebElement getContractLegalRAGStatus() {
		return ContractLegalRAGStatus;
	}
	
	@FindBy(xpath = "*//div[@class='deal-information-wrapper']//div[6]//label[1]")
	public WebElement CoommercialRAGStatus;

	public WebElement getCoommercialRAGStatus() {
		return CoommercialRAGStatus;
	}
	
	@FindBy(xpath = "*//div[@class='deal-information-wrapper']//div[7]//label[1]")
	public WebElement ExternalHires;

	public WebElement getExternalHires() {
		return ExternalHires;
	}
	
	@FindBy(xpath = "*//div[@class='deal-information-wrapper']//div[8]//label[1]")
	public WebElement Seeding;

	public WebElement getSeeding() {
		return Seeding;
	}
	
	
	@FindBy(xpath = "*//div[@id='divpopupMessageCtl']//div[@class='modal-dialog']//div[@class='modal-content']//div[@id='divpopupMessage']")
	public WebElement DealCommentsMandatoryText;

	public WebElement getDealCommentsMandatoryText() {
		return DealCommentsMandatoryText;
	}
	@FindBy(xpath = "//*[contains(text(),'Watch List Details')]")
	public WebElement WatchListDetails;

	public WebElement getWatchListDetails() {
		return WatchListDetails;
	}
	
	@FindBy(xpath = "//div[@role='menuitem']/span[1]/span[2]")
	public WebElement WatchListDetailsExpandIcon;

	public WebElement getWatchListDetailsExpandIcon() {
		return WatchListDetailsExpandIcon;
	}
	
	@FindBy(xpath = "*//div[@class='deal-information-wrapper-opportunity']//div[9]//label[1]")
	public WebElement Issue;

	public WebElement getIssue() {
		return Issue;
	}
	
	@FindBy(xpath = "*//div[@class='deal-information-wrapper-opportunity']//div[1]//label[1]")
	public WebElement DealonWatchList;

	public WebElement getDealonWatchList() {
		return DealonWatchList;
	}
	
	@FindBy(xpath = "*//div[@class='deal-information-wrapper-opportunity']//div[2]//label[1]")
	public WebElement WatchListLevel;

	public WebElement getWatchListLevel() {
		return WatchListLevel;
	}
	@FindBy(xpath = "//div//input[@id='WatchListDetails_WatchListLevel']//following::span//select[@id='watchLevelId']")
	public WebElement WatchListLevelDisabled;

	public WebElement getWatchListLevelDisabled() {
		return WatchListLevelDisabled;
	}
	@FindBy(xpath = "*//div[@class='deal-information-wrapper-opportunity']//div[3]//label[1]")
	public WebElement IssueType;

	public WebElement getIssueType() {
		return IssueType;
	}
	@FindBy(xpath = "*//div[@class='deal-information-wrapper-opportunity']//div[4]//label[1]")
	public WebElement GoLiveDate;

	public WebElement getGoLiveDate() {
		return GoLiveDate;
	}
	
	@FindBy(xpath = " *//input[@id='WatchListDetails_ActualGoLiveDt']")
	public WebElement GoLiveDateReadOnly;

	public WebElement getGoLiveDateReadOnly() {
		return GoLiveDateReadOnly;
	}
	@FindBy(xpath = "*//div[@class='deal-information-wrapper-opportunity']//div[5]//label[1]")
	public WebElement StatusUpdate;

	public WebElement getStatusUpdate() {
		return StatusUpdate;
	}
	@FindBy(xpath = "*//div[@class='deal-information-wrapper-opportunity']//div[6]//label[1]")
	public WebElement TargetMonth;

	public WebElement getTargetMonth() {
		return TargetMonth;
	}
	@FindBy(xpath = "*//div[@class='deal-information-wrapper-opportunity']//div[7]//label[1]")
	public WebElement WatchListExitCriteria;

	public WebElement getWatchListExitCriteria() {
		return WatchListExitCriteria;
	}
	@FindBy(xpath = "*//div[@class='deal-information-wrapper-opportunity']//div[8]//label[1]")
	public WebElement Notes;

	public WebElement getNotes() {
		return Notes;
	}
	
	@FindBy(xpath = "*//div[@class='deal-information-wrapper-opportunity']//div[10]//label[1]")
	public WebElement Action;

	public WebElement getAction() {
		return Action;
	}
	
	@FindAll(@FindBy(xpath = "//*[@class='k-grid-header']//th"))
	java.util.List<WebElement> listNameofcolums;

	public java.util.List<WebElement> getListNameofcolums() {
		return listNameofcolums;
	}
	@FindBy(xpath = "//label[contains(text(),'Deal Comments')]//following::textarea[@id='DealExecutionDetails_DealComments']")
	public WebElement DealCommentsTextArea;

	public WebElement getDealCommentsTextArea() {
		return DealCommentsTextArea;
	}
	
	@FindBy(xpath = "*//label[contains(text(),'Deal RAG')]//following-sibling::span")
	public WebElement DealRAGDropdown;

	public WebElement getDealRAGDropdown() {
		return DealRAGDropdown;
	}
	
	@FindBy(xpath = "//button[@ng-click='ValidateDealSetup()']")
	public WebElement DealExecutionSaveButton;

	public WebElement getDealExecutionSaveButton() {
		return DealExecutionSaveButton;
	}
	
	@FindBy(xpath = "//div[text()='Deal comments is mandatory if deal rag status is red or amber.']")
	public WebElement DealCommentsMndtryPopup;

	public WebElement getDealCommentsMndtryPopup() {
		return DealCommentsMndtryPopup;
	}
	
	
}
