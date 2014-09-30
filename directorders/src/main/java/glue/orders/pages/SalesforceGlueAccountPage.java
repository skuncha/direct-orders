package glue.orders.pages;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;

import net.thucydides.core.csv.CSVTestDataSource;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Srinivasa.Kuncha
 *
 */
public class SalesforceGlueAccountPage  extends PageObject {
//example 	yyMMddHHmmss = 010704120856 
	DateFormat dateFormat = new SimpleDateFormat("HHMMSS");
	Calendar cal = Calendar.getInstance();
	String s = dateFormat.format(cal.getTime());
	int i=0;
	int j=0;
	String financeID;
	ArrayList<String> arraylist = new ArrayList<String>(); 

	/***********************************************************************WEB ELEMENTS************************************************************************************/
	
	private WebElementFacade salutation() 		 { return element(By.id("00ND0000005jggD"));							}
	private WebElementFacade firstname() 		 { return element(By.id("00ND0000005jgg9"));							}
	private WebElementFacade parentAccount()     { return element(By.cssSelector("#acc3"));								}
	private WebElementFacade phoneNumber()       { return element(By.cssSelector("#acc10"));							}
	private WebElementFacade accountName()       { return element(By.cssSelector("#acc2"));								}
	private WebElementFacade selectAccountType() { return element(By.id("p3")); 										}
	private WebElementFacade selectTypeOfAccount() { return element(By.id("acc6")); 									}
	private WebElementFacade billingStreet()     { return element(By.cssSelector("#acc17street"));       				}
	private WebElementFacade billingPostCode()   { return element(By.cssSelector("#acc17zip"));							}
	private WebElementFacade newButton() 		 { return element(By.cssSelector("input[value=' New ']"));				}
	private WebElementFacade readAccountName()   { return element(By.xpath(".//*[@id='contactHeaderRow']/div[2]/h2"));  }
	private WebElementFacade mainCate()           { return element(By.name("j_id0:j_id1:j_id27:j_id36"));				}
	private WebElementFacade subCate()            { return element(By.name("j_id0:j_id1:j_id27:subcategory"));			}
	private WebElementFacade minorCate()          { return element(By.name("j_id0:j_id1:j_id27:minor"));				}
	private WebElementFacade saveIndCate()        { return element(By.name("j_id0:j_id1:j_id27:j_id28:j_id29"));		}
	private WebElementFacade newAccountButtonChild() { return element(By.cssSelector("input[value='New Account']"));	}
	private WebElementFacade continueButt()          { return element(By.cssSelector("input[value='Continue']")); 		}
	private WebElementFacade type() 				{ return element(By.xpath("//div[@id='ep']/div[2]/div[3]/table/tbody/tr/td[4]/div/span/select/option[2]"));  }
	private WebElementFacade searchCustomerName() 	{ return element(By.xpath("//td[contains(label,'Customer Name or Aliases')]/input"));		}
	private WebElementFacade createDirectOrder() 	{ return element(By.cssSelector("input[value='Create Direct Order']"));						}
	private WebElementFacade billingSelection() 	{ return element(By.id("j_id0:j_id1:i:f:pb:d:Billing_Selection.input"));					}
	private WebElementFacade billingOption() 	    { return element(By.id("j_id0:j_id1:i:f:pb:d:Billing_Options.input"));						}
	private WebElementFacade billingSelectionNext() { return element(By.id("j_id0:j_id1:i:f:pb:pbb:bottom:next"));								}
	private WebElementFacade finish() 				{ return element(By.cssSelector("input[value='Finish']"));									}
	private WebElementFacade CCICustomerMail()      { return element(By.cssSelector("input[value='Create CCI Customer-Mail']"));				}
	private WebElementFacade accountType() 			{ return element(By.id("j_id0:j_id1:i:f:pb:d:Account4Contact.input"));		}
	private WebElementFacade emailAddress() 		{ return element(By.id("j_id0:j_id1:i:f:pb:d:EmailAddress.input"));			}
	private WebElementFacade contactNext() 			{ return element(By.id("j_id0:j_id1:i:f:pb:pbb:bottom:next"));				}
	private WebElementFacade conSalutation() 		{ return element(By.id("j_id0:j_id1:i:f:pb:d:Salutation.input"));			}
	private WebElementFacade conFirstName() 		{ return element(By.id("j_id0:j_id1:i:f:pb:d:FirstName.input"));			}
	private WebElementFacade conLastName() 			{ return element(By.id("j_id0:j_id1:i:f:pb:d:LastName.input"));				}
	private WebElementFacade conPhonenumebr() 		{ return element(By.id("j_id0:j_id1:i:f:pb:d:Phone.input"));				}
	private WebElementFacade orderId() 				{ return element(By.xpath("//*[@id='salesforce-plugin']/article/aside[1]/div/div/pre"));		}
	
	@FindBy(how = How.LINK_TEXT, using = "Accounts")
	private WebElement accounts;
	@FindBy(how = How.XPATH, using = "//div[@class='pbBottomButtons']//input[@value='Search']")
	private WebElement customerSearchButton;
	@FindBy(how = How.CSS, using = "input[value=' Save ']")
	private WebElement saveButton;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "AM-")
	private WebElement accountMapping;
	private WebElementFacade customerRef()        { return element(By.xpath("//*[@id='00ND0000005WVcQ_ileinner']"));		}
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "-Mail Advertising")
	private WebElement financeAccount;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "W8 5TT")
	private WebElement privateAdvFinanceAccount;
	private WebElementFacade FinanceAccNum()     { return element(By.xpath(".//*[@id='ep']/div[2]/div[2]/table/tbody/tr[3]/td[2]"));}
	private WebElementFacade CCIMailCustomerID() { return element(By.xpath(".//*[@id='ep']/div[2]/div[2]/table/tbody/tr[5]/td[4]"));}
	private WebElementFacade SOPID() 			 { return element(By.xpath(".//*[@id='ep']/div[2]/div[2]/table/tbody/tr[9]/td[2]"));}
	@FindBy(how = How.XPATH, using = "//input[@title='New Relationship']")
	private WebElement newRelationship;
	private WebElementFacade accountB_Name() 	  { return element(By.id("CF00ND0000003g0n9"));							}
	private WebElementFacade billing() 			  { return element(By.id("00ND0000003g0nB"));							}
	@FindBy(how = How.XPATH, using = "//td[@id='bottomButtonRow']/input[@title='Save']")
	private WebElement saveRelationship;
	private WebElementFacade billingRef()        { return element(By.xpath("//*[@id='j_id0:j_id1:i:f:pb:d:Billing_AgenciesList.input']/option[1]")); }
	private WebElementFacade selectBillingRef()  { return element(By.xpath("//*[@id='j_id0:j_id1:i:f:pb:d:Account4Contact.input']/option[1]"));		 }
	private WebElementFacade syncNext() 		 { return element(By.id("j_id0:j_id1:i:f:pb:pbb:bottom:next"));				                         }
	private WebElementFacade searchGlue() 		 { return element(By.id("phSearchButton"));				                         	 				 }
	private WebElementFacade orderlink() 		 { return element(By.xpath("//*[@id='Order_body']/table/tbody/tr[2]/th/a"));						 }
	private WebElementFacade orderID() 			 { return element(By.xpath("//*[@id='ep']/div[2]/div[2]/table/tbody/tr[10]/td[2]"));                 }
    @FindBy(xpath="//div/input")
    private WebElementFacade searchTerms;
	
    /***********************************************************************WEB ELEMENTS************************************************************************************/
	public void type(String mytype) {
    	Select droplist = new Select(find(By.id("acc6")));   
    	droplist.selectByVisibleText(mytype);
    }
    
    public void newAccount() {
    	newButton().click();
    	
    }
     
    public void newAccountChild(String keyword) {
    	
    	waitFor(8).second();
    	searchCustomerName().type(keyword);
    	customerSearchButton.click();
    }
    
    public void newAccountButtonFromSearchResultsSection() {
    	waitFor(6).second();
    	newAccountButtonChild().click();
    }
    
    public void accountMapping(){
    	
    	accountMapping.click();
    	waitFor(3).seconds();
    	String ref = customerRef().getText();
    	getDriver().navigate().back();
    	waitFor(8).seconds();
    }
    
    public void accountCreation(){
    		waitFor(6).seconds();
    		accounts.click();
    		waitFor(6).seconds();
			newButton().click();
			waitFor(4).seconds();
			searchCustomerName().type("xyz");
	    	customerSearchButton.click();
	    	waitFor(4).seconds();
	    	newAccountButtonChild().click();
	    	waitFor(3).seconds();
    }
    
/**************************************************************CSVFile*****************************************************/
    public void read_input(String fileLoc) {

		File filePath = new File(fileLoc);
		if (filePath.isFile()) {
			String file = filePath.getAbsolutePath();
			try {
				CSVTestDataSource testDataSrc = new CSVTestDataSource(file);
				for (Map<String, String> record : testDataSrc.getData()) {
				
/************** Select Agency Type ******************************************/  
					
				    selectAccountType().selectByVisibleText(record.get("type"));
				    continueButt().click();
				    waitABit(1000);
					
/************** Supply User Account details ********************************/  
				  
				    waitFor(5).seconds();
				    String str = record.get("accountType");
				    selectTypeOfAccount().selectByVisibleText(record.get("accountType"));
			    	accountName().type(record.get("lastName") + s);
			    	phoneNumber().type(record.get("phone"));
			    	billingStreet().type(record.get("billingStreet"));
			    	billingPostCode().type(record.get("postalCode"));

					    	if (type().getText().equals("Brand")) {
								parentAccount().type(record.get("parentAccount"));
								waitABit(1000);
							}
			    	 
					    	if (str.equals("Private Advertiser")) {
					    		 salutation().selectByVisibleText(record.get("salutation"));
				    		     firstname().type(record.get("firstName"));
					    	}
			    	
					    	if (str.equals("Direct Advertiser") || str.equals("Charity") || str.equals("Brand")|| str.equals("Client") || str.equals("DMGT Group")) 
					    	{
					    		waitABit(1000);
								saveButton.click();
								String Name = readAccountName().getText();
						    	arraylist.add(Name);
						    	waitABit(6000);
	/**************************************************************************/ 
									    	if (str.equals("Client") || str.equals("DMGT Group")) 
									    	{
										    		String readClientAccountName = readAccountName().getText();
										    		String clientURL = getDriver().getCurrentUrl();
		//								    		System.out.println("Client URL is --->"+clientURL); 
										    		accountCreation();
										    		selectAccountType().selectByVisibleText("Agency"); //Create Billing a/c
										    		continueButt().click();
													waitABit(3000);
													accountName().type(record.get("lastName") + s);
										    		phoneNumber().type(record.get("phone"));
											    	billingStreet().type(record.get("billingStreet"));
											    	billingPostCode().type(record.get("postalCode"));
											    	waitABit(1000);
													saveButton.click();
													waitABit(5000);
													newRelationship.click(); 
													waitABit(3000);
													accountB_Name().type(readClientAccountName);
											    	billing().selectByVisibleText("Billing");
											    	saveRelationship.click();
											    	waitABit(6000);	
											    	getDriver().get(clientURL); // come back to client a/c page
											    	waitABit(6000);	
									    	}
									    	 /************** Select Industry Category **********************************/
							    	getDriver().switchTo().frame("066D0000000kh27");
							    	WebElement editable = getDriver().switchTo().activeElement();
							    	editable.findElement(By.cssSelector("input[name='j_id0:j_id1:j_id27:j_id28:j_id31']")).click();
							    	waitFor(4).seconds();
						    	   	mainCate().selectByVisibleText(record.get("mainCategory"));
						    	   	waitFor(4).seconds();
							 	    subCate().selectByVisibleText(record.get("subCategory"));
							 	    waitFor(4).seconds();
							 	    minorCate().selectByVisibleText(record.get("minorCategory"));
							 	    waitFor(5).seconds();
							 	    saveIndCate().sendKeys(Keys.RETURN);
							 	    waitFor(4).seconds();
								    getDriver().switchTo().defaultContent();
					    	}
						    	else 
						    	{
						    	saveButton.click();
						    	String Name = readAccountName().getText();
						    	arraylist.add(Name);
						    	waitABit(6000);
						    	}

/**************  CCI Integration  *******************************************/  				    	
				    	
				    	CCICustomerMail().click();
				    	waitFor(8).seconds();
						getDriver().switchTo().alert().accept();  
						waitFor(15).seconds();
						getDriver().switchTo().alert().accept(); 
						waitFor(8).seconds();
						
									if (str.equals("Direct Advertiser") || str.equals("Charity") || str.equals("Brand")|| str.equals("Private Advertiser")){
												
												waitFor(8).seconds();
												accountMapping();  /**************  Account Mapping  *******************************************/
												
												if (str.equals("Private Advertiser")){
													privateAdvFinanceAccount.click();   /***** DEPENDENDT ON POSTCODE SUPPLIED*************/
													waitFor(5).seconds();
													String id = SOPID().getText();
													while(id.equals(" ")) {
															waitFor(2).seconds();
															getDriver().navigate().back();
															waitFor(10).seconds();
															privateAdvFinanceAccount.click();
															waitFor(5).seconds();
															id = SOPID().getText();
															/*System.out
																	.println("Private Advertiser-->"+id);*/
													}
												} 
												else 
													{ 
														financeAccount.click(); 
													}	
												
												waitFor(5).seconds();
												String id = SOPID().getText();
												while(id.equals(" ")) {
														waitFor(2).seconds();
														getDriver().navigate().back();
														waitFor(10).seconds();
														financeAccount.click();
														waitFor(5).seconds();
														id = SOPID().getText();
														/*System.out
														.println("Other Advertisers---->"+id);*/
													}
										 financeID = id;
										System.out.println("          **************** Customer Account Name : "+arraylist.get(i) + " +  Account ID : " +CCIMailCustomerID().getText() + " +   SOPID : " +SOPID().getText() + "  ****************");
										getDriver().navigate().back();
									}
						waitFor(5).seconds();
						createDirectOrder().click();
								
/**************  Select Order Type *************************************************************/
				    	
						if (str.equals("Direct Advertiser") || str.equals("Charity") || str.equals("Client") || str.equals("DMGT Group")) 
				    	{
							waitFor(6).seconds();
							
							    	if (str.equals("Client") || str.equals("DMGT Group"))
							    	{
							    		billingRef().click();
							    		billingSelectionNext().click();
							    		waitFor(2).seconds();
								    		try {
								    			 while (syncNext().isVisible()) {
								    				 waitFor(30).seconds();
								    				 syncNext().click();
								    			 }
								    			 
								    		} catch (Exception e) { e.printStackTrace();}
							    	}
							    	else {
							    		
							    		billingSelection().selectByVisibleText("Direct");
									 	billingSelectionNext().click();  
							    	}
				    	}	
					if (str.equals("Brand"))
					{
						waitFor(3).seconds();
			    		billingOption().selectByVisibleText("Direct");
			    		billingSelectionNext().click(); 
			    	}
/**************  Create Contact ******************************************************************/
					 	
					 	waitFor(4).seconds();
						conSalutation().selectByVisibleText(record.get("salutation"));
		    		    conFirstName().type(record.get("firstName"));
		    		    conLastName().type(s + record.get("lastName"));
				    	emailAddress().type(record.get("email"));
					   	conPhonenumebr().type(record.get("phone"));
					   	
/**************  Associate Account*****************************************************************/				    	
				    	
					   	if (str.equals("Client") || str.equals("DMGT Group")) 
					   	{
				    		selectBillingRef().click();
				    		waitFor(1).seconds();
				    		i++;
				    	}
						   	else 
						   	{
//						    	System.out.println("Customer Account Name is : -----------------> "+arraylist.get(i));
						   		String endUseraccount = arraylist.get(i);
								accountType().selectByVisibleText(endUseraccount);
								waitFor(1).seconds();
								i++;
						   	}
						contactNext().click();
						waitFor(1).seconds();
						finish().click();
						
/************** Launch OrderPlugin and Create Order*************************************************/
						
						 waitFor(20).seconds();
				    	 getDriver().switchTo().frame(getDriver().findElement(By.tagName("iframe")));
				     	 WebElement element = getDriver().switchTo().activeElement();
				     	 waitFor(2).seconds();
				     	 element.findElement(By.xpath("//td[div='DM Display']")).click();
				     	 waitFor(5).seconds();
				    	 element.findElement(By.id("Order.Identification:order.purchaseOrderNo")).sendKeys(record.get("PONumber"));
				    	 element.findElement(By.id("Order.Identification:order.note")).sendKeys(record.get("orderNote"));
				    	 element.findElement(By.id("Order.Identification:order.message")).sendKeys(record.get("urgentNote"));
				    	 element.findElement(By.id("Order.SalesTerritory:order.primarySalesRep.id")).sendKeys("Tom Leader");
				    	 waitFor(1).seconds();
				    	 
/************************************ Package Details* **********************************************/
				    	 element.findElement(By.xpath("//h4/a/span/input")).click();  	
				    	 waitFor(5).seconds();
				    	 element.findElement(By.xpath("//h4/a/span/input")).click(); 
				    	 waitFor(5).seconds();
				    	 Select droplist = new Select(element.findElement(By.id("Order.Schedule:sched.publicationCode")));
				    	 droplist.selectByVisibleText(record.get("publication"));
				    	 waitFor(3).seconds();
				    	 droplist = new Select(element.findElement(By.id("Order.Schedule:sched.sectionCode")));
				    	 droplist.selectByVisibleText(record.get("section"));
				    	 waitFor(4).seconds();
				    	 /*droplist = new Select(element.findElement(By.id("Order.Schedule:sched.subSectionCode")));
				    	 droplist.selectByVisibleText(record.get(record.get("subsection"))); // subsection
				    	 waitFor(4).seconds();*/
				    	 droplist = new Select(element.findElement(By.id("Order.Schedule:")));
				    	 droplist.selectByVisibleText(record.get("zones"));
				    	 waitFor(5).seconds();
				    	 element.findElement(By.xpath("//tbody/tr[6]/td[3]")).click(); // date field
				    	 waitFor(5).seconds();
				    	 element.findElement(By.xpath("//nav[button='Save']/button[2]")).click();
/*				    	 String orid = (String) element.findElement(By.xpath("//*[@id='salesforce-plugin']/article/aside[1]/div/div/pre")).getText();
				    	 System.out.println("Order id is   --->"+orid);*/
				    	 waitFor(12).seconds();
				    	 droplist = new Select(element.findElement(By.id("Order.Schedule.Material:material.moduleCode")));
				    	 droplist.selectByVisibleText(record.get("module"));
				    	 waitFor(5).seconds();
				    	 
 /************************************ Price Details ***********************************************/
				    	 element.findElement(By.xpath(".//*[@id='SchedulingAccordion']/div/div[3]/div[1]/h4/a/span")).click();
				    	 waitFor(5).seconds();
				    	 element.findElement(By.id("Order.Price:UserRevenue")).sendKeys(record.get("revenue"));
				    	 waitFor(3).seconds();
				    	 element.findElement(By.xpath("//fieldset/div/div[2]/div/div/span/button")).click(); 
				    	 waitFor(3).seconds();
/************************************ Accept Order *************************************************/	 
				    	 element.findElement(By.xpath("//nav[button='Accept']/button[3]")).click();
				    	 if(str.equals("Private Advertiser") || str.equals("Direct Advertiser")|| str.equals("Brand")) {
				    	 waitFor(3).seconds();
				    	 WebElement prepaymentwindow1 = getDriver().switchTo().activeElement();
				    	 waitFor(1).seconds();
				    	 prepaymentwindow1.findElement(By.xpath("//input[@value='Prepay']")).click();
				    	 waitFor(3).seconds();
				    	 WebElement prepaymentwindow2 = getDriver().switchTo().activeElement();
				    	 waitFor(1).seconds();
				    	 prepaymentwindow2.findElement(By.xpath("//input[@value='OK']")).click();
				    	 }
/*************************************************************************************************/
				    	 try {
					    	 WebDriverWait wait1 = new WebDriverWait(getDriver(), 5);
					    	 if(wait1.until(ExpectedConditions.alertIsPresent())!=null)
					    	      getDriver().switchTo().alert().accept();
					    	 }
					    	 catch (Exception e) {}
				    	 
				    	 getDriver().switchTo().defaultContent();
/************************************************************************************************/						
				    	 						waitFor(15).seconds();
				    	 				    	if (readAccountName().isVisible()) {
				    	 				    		waitFor(1).minutes();
				    	 				    		searchTerms.type(financeID);
				    	 				    		searchGlue().click();
				    	 				    		waitFor(3).seconds();
				    	 				    		try {
				    	 				    		if (orderlink().isVisible())
				    	 				    		{ 
				    	 				    			clickOn(orderlink());
				    	 				    			System.out.println("          **************** Customer Order ID is  :                                                       :" + orderID().getText() + "  ****************");
				    	 				    		}
				    	 				    		}catch (Exception e) { System.out
															.println("order id didn't sync yet"); }
				    	 				    		accountCreation();
				    	 				    		j++;
				    	 				    	}
/**********************************************************************************************/	
			}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			waitABit(1000);
		}
	}
}
