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

WebUI.navigateToUrl('https://demo.velocitypayment.com/admin/imtiazdemo')

def myname = 'iahmed'

WebUI.setText(findTestObject('Page_Velocity Payment System2/input_Username_user'), myname)

WebUI.setEncryptedText(findTestObject('Page_Velocity Payment System2/input_Password_password'), 'ReH0Zrvn+OVqGz5NDrNXZg==')

WebUI.click(findTestObject('Page_Velocity Payment System2/input_Password_button2'))

WebUI.click(findTestObject('Page_Velocity Payment System2/a_Access No Convenience Fees2'))

WebUI.click(findTestObject('Object Repository/Page_V-POS - Transactions Menu/a_Authorization  Capture (Sale) - Keyboard Entry'))

WebUI.setText(findTestObject('Object Repository/Page_V-POS - Credit Card Authorization  Cap_44e99e/input__cardName'), 'Sonu')

WebUI.setText(findTestObject('Object Repository/Page_V-POS - Credit Card Authorization  Cap_44e99e/input__address'), '1515 Highland Ave')

WebUI.setText(findTestObject('Object Repository/Page_V-POS - Credit Card Authorization  Cap_44e99e/input_Address Line 2_address2'), 
    'hillside')

WebUI.setText(findTestObject('Object Repository/Page_V-POS - Credit Card Authorization  Cap_44e99e/input__zip'), '32443')

WebUI.setText(findTestObject('Object Repository/Page_V-POS - Credit Card Authorization  Cap_44e99e/input__cardNumber'), 
    '4111111111111111')

WebUI.selectOptionByValue(findTestObject('Page_V-POS - Credit Card Authorization  Cap_44e99e/select_MM'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_V-POS - Credit Card Authorization  Cap_44e99e/select_YYYY'), '2022', true)

WebUI.selectOptionByValue(findTestObject('Page_V-POS - Credit Card Authorization  Cap_44e99e/select_TransactionCategory'), 
    'ECOM', true)

WebUI.setText(findTestObject('Object Repository/Page_V-POS - Credit Card Authorization  Cap_44e99e/input_SignaturePanelCode_cvv'), 
    'sn')

WebUI.setText(findTestObject('Object Repository/Page_V-POS - Credit Card Authorization  Cap_44e99e/input__amount'), '12.00')

WebUI.setText(findTestObject('Object Repository/Page_V-POS - Credit Card Authorization  Cap_44e99e/input_Email Address_emailAddress'), 
    'sonu@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_V-POS - Credit Card Authorization  Cap_44e99e/input__userDefined1'), 
    'sonu')

WebUI.click(findTestObject('Object Repository/Page_V-POS - Credit Card Authorization  Cap_44e99e/input_UDF2_submit'))

WebUI.verifyTextPresent('Transaction Successful', false)

WebUI.closeBrowser()

