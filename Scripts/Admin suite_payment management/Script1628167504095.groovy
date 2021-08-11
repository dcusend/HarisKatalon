import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.velocitypayment.com/vsecurity/login.jsp')

WebUI.setText(findTestObject('Page_Velocity Payment System2/payment management/Page_Velocity Payment System/input_Username_user'), 
    'iahmed')

WebUI.setEncryptedText(findTestObject('Page_Velocity Payment System2/payment management/Page_Velocity Payment System/input_Password_password'), 
    'ReH0Zrvn+OVqGz5NDrNXZg==')

WebUI.click(findTestObject('Page_Velocity Payment System2/payment management/Page_Velocity Payment System/input_Password_button2'))

WebUI.click(findTestObject('Page_Velocity Payment System2/payment management/Page_Velocity Payment System/a_Access Camel License Fees'))

WebUI.click(findTestObject('Page_Velocity Payment System2/payment management/Page_V-POS - Transactions Menu/a_Authorization  Capture (Sale) - Keyboard Entry'))

WebUI.setText(findTestObject('Page_Velocity Payment System2/payment management/Page_V-POS - Credit Card Authorization  Cap_44e99e/input_Client Account Number_clientAccountNumber'), 
    '41122334422')

WebUI.setText(findTestObject('Page_Velocity Payment System2/payment management/Page_V-POS - Credit Card Authorization  Cap_44e99e/input__cardName'), 
    'sonu')

WebUI.setText(findTestObject('Page_Velocity Payment System2/payment management/Page_V-POS - Credit Card Authorization  Cap_44e99e/input__address'), 
    '123 anywhere street')

WebUI.sendKeys(findTestObject('Page_Velocity Payment System2/payment management/Page_V-POS - Credit Card Authorization  Cap_44e99e/input__address'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Page_Velocity Payment System2/payment management/Page_V-POS - Credit Card Authorization  Cap_44e99e/input__zip'), 
    '23543')

WebUI.setText(findTestObject('Page_Velocity Payment System2/payment management/Page_V-POS - Credit Card Authorization  Cap_44e99e/input_City_city'), 
    'highland')

WebUI.selectOptionByValue(findTestObject('Page_Velocity Payment System2/payment management/Page_V-POS - Credit Card Authorization  Cap_44e99e/select_Select oneArmed Forces AmericasArmed_1f7d7f'), 
    'Georgia', true)

WebUI.setText(findTestObject('Page_Velocity Payment System2/payment management/Page_V-POS - Credit Card Authorization  Cap_44e99e/input__cardNumber'), 
    '4111111111111111')

WebUI.selectOptionByValue(findTestObject('Page_Velocity Payment System2/payment management/Page_V-POS - Credit Card Authorization  Cap_44e99e/select_MMyear01year02year03year04year05year_e9f300'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Velocity Payment System2/payment management/Page_V-POS - Credit Card Authorization  Cap_44e99e/select_YYYY20212022202320242025202620272028_8c4dd4'), 
    '2022', true)

WebUI.selectOptionByValue(findTestObject('Page_Velocity Payment System2/payment management/Page_V-POS - Credit Card Authorization  Cap_44e99e/select_Select One         Mail OrderTelepho_81ab5d'), 
    'MOTO', true)

WebUI.selectOptionByValue(findTestObject('Page_Velocity Payment System2/payment management/Page_V-POS - Credit Card Authorization  Cap_44e99e/select_Select One         Mail OrderTelepho_81ab5d'), 
    'RETL', true)

WebUI.setText(findTestObject('Page_Velocity Payment System2/payment management/Page_V-POS - Credit Card Authorization  Cap_44e99e/input_SignaturePanelCode_cvv'), 
    'sn')

WebUI.setText(findTestObject('Page_Velocity Payment System2/payment management/Page_V-POS - Credit Card Authorization  Cap_44e99e/input__amount'), 
    '123.00')

WebUI.setText(findTestObject('Page_Velocity Payment System2/payment management/Page_V-POS - Credit Card Authorization  Cap_44e99e/input_Email Address_emailAddress'), 
    'sonu@gmail.com')

WebUI.setText(findTestObject('Page_Velocity Payment System2/payment management/Page_V-POS - Credit Card Authorization  Cap_44e99e/input_Camel Name_userDefined1'), 
    'sonu')

WebUI.setText(findTestObject('Page_Velocity Payment System2/payment management/Page_V-POS - Credit Card Authorization  Cap_44e99e/input_Camel Species_userDefined2'), 
    'sonu')

WebUI.click(findTestObject('Page_Velocity Payment System2/payment management/Page_V-POS - Credit Card Authorization  Cap_44e99e/input_Camel Species_submit'))

WebUI.click(findTestObject('Page_Velocity Payment System2/payment management/Page_V-POS - Transaction Successfully Processed/a_click here'))

assert true

WebUI.closeBrowser()

