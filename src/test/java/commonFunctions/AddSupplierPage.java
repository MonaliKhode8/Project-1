package commonFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddSupplierPage {

	@FindBy(xpath = "//li[@id='mi_a_suppliers']//a[@href='a_supplierslist.php'][normalize-space()='Suppliers']")
	WebElement ObjSupplerLink;
	@FindBy(xpath = "//div[@class='panel-heading ewGridUpperPanel']//span[@class='glyphicon glyphicon-plus ewIcon']")
	WebElement ObjSupplierPlusbtn;
	@FindBy(id = "x_Supplier_Number")
	WebElement ObjSupplierNumber;
	@FindBy(xpath = "//input[@id='x_Supplier_Name']")
	WebElement ObjSupplierName;
	@FindBy(xpath = "//textarea[@id='x_Address']")
	WebElement ObjSupplierAddress;
	@FindBy(xpath = "//input[@id='x_City']")
	WebElement ObjSupplierCity;
	@FindBy(xpath = "//input[@id='x_Country']")
	WebElement ObjSupplierCountry;
	@FindBy(xpath = "//input[@id='x_Contact_Person']")
	WebElement ObjSupplierContactP;
	@FindBy(xpath = "//input[@id='x_Phone_Number']")
	WebElement ObjSuppPhoneNo;
	@FindBy(xpath = "//input[@id='x__Email']")
	WebElement ObjSuppEmail;
	@FindBy(xpath = "//input[@id='x_Mobile_Number']")
	WebElement ObjSuppMobNo;
	@FindBy(xpath = "//textarea[@id='x_Notes']")
	WebElement ObjSuppNotes;
	@FindBy(xpath = "//button[@id='btnAction']")
	WebElement ObjSuppAddbtn;
	@FindBy(xpath = "//button[@class='ajs-button btn btn-primary']")
	WebElement ObjSuppAlertbtn;
	@FindBy(xpath = "/html/body/div[17]/div[2]/div/div[4]/div[2]/button")
	WebElement ObjSuppFinalAlertbtn;
	@FindBy(xpath = "//*[@id=\"ewContentColumn\"]/div[2]/div[2]/div/button")
	WebElement ObjSuppSearchIcon;
	@FindBy(id = "psearch")
	WebElement ObjSuppSearchTextbox;
	@FindBy(xpath = "(//button[@id='btnsubmit'])[1]")
	WebElement ObjSuppSeachbtn;
	@FindBy(xpath = "//table[@class='table ewTable']/tbody/tr[1]/td[6]/div/span/span")
	WebElement ObjSuppWebTable;
	
	public boolean addsupplier(String Sname, String Saddress,String Scity, String Scountry, 
			String Scontactp, String Sphoneno, String SEmail, String SMobno, String Snotes ) throws Throwable
	{
		ObjSupplerLink.click();
		ObjSupplierPlusbtn.click();
		String Exp_SData = ObjSupplierNumber.getAttribute("Value");
		ObjSupplierName.sendKeys(Sname);
		ObjSupplierAddress.sendKeys(Saddress);
		ObjSupplierCity.sendKeys(Scity);
		ObjSupplierCountry.sendKeys(Scountry);
		ObjSupplierContactP.sendKeys(Scontactp);
		ObjSuppPhoneNo.sendKeys(Sphoneno);
		ObjSuppEmail.sendKeys(SEmail);
		ObjSuppMobNo.sendKeys(SMobno);
		ObjSuppNotes.sendKeys(Snotes);
		ObjSuppAddbtn.click();
		Thread.sleep(3000);
		ObjSuppAlertbtn.click();
		ObjSuppFinalAlertbtn.click();
		Thread.sleep(3000);
		if(!ObjSuppSearchTextbox.isDisplayed())
			ObjSuppSearchIcon.click();
		ObjSuppSearchTextbox.clear();
		ObjSuppSearchTextbox.sendKeys(Exp_SData);
		Thread.sleep(3000);
		ObjSuppSeachbtn.click();
		Thread.sleep(3000);
		String Act_Sdata = ObjSuppWebTable.getText();
		Reporter.log(Exp_SData+"--------------"+Act_Sdata,true);
		if(Exp_SData.equals(Act_Sdata)) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	  }
	}