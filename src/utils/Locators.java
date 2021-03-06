package utils;

import org.openqa.selenium.By;

public class Locators {
	
	//selenium1	
	public By loginButton = By.xpath("//a[text()= 'Login/Register']");
	public By airtelLink = By.partialLinkText("airtel-prepaid");
	public By mobileRechargeLink = By.xpath("//a[text()='mobile recharge']/parent::li/following-sibling::li");
	public By numberField = By.name("number");
	public By invalidNumberMsg = By.xpath("//input[@name = 'number']/following-sibling::span[@class = 'error-msg']");
	public By prepaidRadioBtn = By.xpath("//span[text()='Prepaid']/preceding-sibling::input[@type='radio']");
	public By operator_dropDown = By.xpath("//select[@name = 'operator']");
	public By operator_dropDown_options = By.xpath("//select[@name = 'operator']/option");
	public By proceed_button = By.xpath("//button[text()='Proceed']");
	
	public By amountField = By.name("amount");
	public By viewAllPlan = By.xpath("//button[text()='View all plans']");
	public By recommendedTab = By.xpath("//span[text()='RECOMMENDED']");
	public By allRecomendedPlans = By.xpath("//ul[@data-reactid='.0.2.1.0.2.0.2.0']/li");
	public By circleDropdown = By.name("circle");
	public By fullTalkTimeTab = By.xpath("//span[text() ='FULL TT']");
	public By allFullTalkTimePlans = By.xpath("//ul[@data-reactid ='.0.2.1.0.2.0.2.0']/li/p");
	
	
	//selenium2
	public By dragElement = By.id("draggable");
	public By newBrowserWindow = By.id("button1");
	public By timingAlert = By.id("timingAlert");
	public By messageBox = By.id("avia_message_1");
	
	//seleniumm 3
	
	public By numberFieldCss = By.cssSelector("input[name = 'number']");
	public By operator = By.cssSelector("select[name = 'operator']");
	public By proceedbtn = By.cssSelector("button.btn._2eaVn");
	public By viewAllButton = By.cssSelector("button._3G6A5");
	public By recommendedPlans = By.cssSelector("p._264pV");
	public By fullTab = By.cssSelector("span[data-reactid = '.0.3.1.0.2.0.1.$1']");
	public By topUp =  By.cssSelector("span[data-reactid = '.0.3.1.0.2.0.1.$2']");
	
}
