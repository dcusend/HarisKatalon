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

WebUI.setText(findTestObject('sales_Debit_Corporate_Repository/Page_Velocity Payment System/input_Username_user'), 
    'iahmed')

WebUI.setEncryptedText(findTestObject('sales_Debit_Corporate_Repository/Page_Velocity Payment System/input_Password_password'), 
    'ReH0Zrvn+OVqGz5NDrNXZg==')

WebUI.click(findTestObject('sales_Debit_Corporate_Repository/Page_Velocity Payment System/input_Password_button2'))

WebUI.click(findTestObject('sales_Debit_Corporate_Repository/Page_Velocity Payment System/a_Access No Convenience Fees'))

WebUI.click(findTestObject('sales_Debit_Corporate_Repository/Page_V-POS - Transactions Menu/a_Debit'))

WebUI.click(findTestObject('sales_Debit_Corporate_Repository/Page_V-POS - On-Line Check Debit/input_Corporate_achtype'))

WebUI.click(findTestObject('sales_Debit_Corporate_Repository/Page_V-POS - On-Line Check Debit/input'))

WebUI.setText(findTestObject('sales_Debit_Corporate_Repository/Page_V-POS - On-Line Business Check Debit/input__companyName'), 
    'faltu')

WebUI.setText(findTestObject('sales_Debit_Corporate_Repository/Page_V-POS - On-Line Business Check Debit/input__address'), 
    '34 broad street')

WebUI.setText(findTestObject('sales_Debit_Corporate_Repository/Page_V-POS - On-Line Business Check Debit/input__zip'), 
    '234156')

WebUI.setText(findTestObject('sales_Debit_Corporate_Repository/Page_V-POS - On-Line Business Check Debit/input__city'), 
    'NEW CHURCH')

WebUI.setText(findTestObject('sales_Debit_Corporate_Repository/Page_V-POS - On-Line Business Check Debit/input__routingNumber'), 
    '256072691')

WebUI.setText(findTestObject('sales_Debit_Corporate_Repository/Page_V-POS - On-Line Business Check Debit/input__accountNumber'), 
    '9876543210')

WebUI.setText(findTestObject('sales_Debit_Corporate_Repository/Page_V-POS - On-Line Business Check Debit/input__amount'), 
    '999')

WebUI.setText(findTestObject('sales_Debit_Corporate_Repository/Page_V-POS - On-Line Business Check Debit/input__userDefined1'), 
    'Faltu')

WebUI.click(findTestObject('sales_Debit_Corporate_Repository/Page_V-POS - On-Line Business Check Debit/input_UDF2_submit'))

WebUI.verifyTextPresent('Transaction Successful', false)

