package mgw;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class LunchBrowser {

	public static void main(String[] args) {
		

	ChromeDriver muthu =new ChromeDriver();
	muthu.get("http://leaftaps.com/opentaps/control/main");

	muthu.manage().window().maximize();
    muthu.findElement(By.id("username")).sendKeys("DemoCsr");
    muthu.findElement(By.id("password")).sendKeys("crmsfa");
    muthu.findElement(By.className("decorativeSubmit")).click();
    muthu.findElement(By.linkText("CRM/SFA")).click();
    muthu.findElement(By.linkText("Leads")).click();
    muthu.findElement(By.linkText("Create Lead")).click();
    muthu.findElement(By.id("createLeadForm_companyName")).sendKeys("IBM");
    muthu.findElement(By.id("createLeadForm_firstName")).sendKeys("Muthu");
    muthu.findElement(By.id("createLeadForm_lastName")).sendKeys("Gowreswaran");
    muthu.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Donmuthu");
    muthu.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Theni");
    muthu.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Na");
    muthu.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Assignment");
    muthu.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
    muthu.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("4.5LPA");
    muthu.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("8"); 
    muthu.findElement(By.id("createLeadForm_sicCode")).sendKeys("6969");
    muthu.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("nothing");
    muthu.findElement(By.id("createLeadForm_description")).sendKeys("i am a Software Tester");
    muthu.findElement(By.id("createLeadForm_importantNote")).sendKeys("Tester is power of IT");
    muthu.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
    muthu.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("#$#");
    muthu.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
    muthu.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("donmuthu");
    muthu.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("%%%");
    muthu.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("muthu@gmail.com");
    muthu.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/crmsfa/control/createLeadForm");
    muthu.findElement(By.id("createLeadForm_generalToName")).sendKeys("muthu");
    muthu.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("manager of IBM");
    muthu.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("ns college oppsite");
    muthu.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("unjampatti");
    muthu.findElement(By.id("createLeadForm_generalCity")).sendKeys("Theni");
    muthu.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("625531");
    muthu.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("625531");
   muthu.findElement(By.name("submitButton")).click();
    
    
    
	}
	

}
