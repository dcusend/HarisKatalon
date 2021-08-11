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

WebUI.setText(findTestObject('sales_creditorvoid_Repository/Page_Velocity Payment System/input_Username_user'), 
    'iahmed')

WebUI.setEncryptedText(findTestObject('sales_creditorvoid_Repository/Page_Velocity Payment System/input_Password_password'), 
    'ReH0Zrvn+OVqGz5NDrNXZg==')

WebUI.click(findTestObject('sales_creditorvoid_Repository/Page_Velocity Payment System/input_Password_button2'))

WebUI.click(findTestObject('sales_creditorvoid_Repository/Page_Velocity Payment System/a_Access No Convenience Fees'))

WebUI.click(findTestObject('sales_creditorvoid_Repository/Page_V-POS - Transactions Menu/a_Credit or Void'))

WebUI.selectOptionByValue(findTestObject('sales_creditorvoid_Repository/Page_V-POS - Search Transactions/select_Remittance IDPayment IDCC last 4 dig_46f0cd'), 
    '7', true)

WebUI.setText(findTestObject('sales_creditorvoid_Repository/Page_V-POS - Search Transactions/input_Search Value_searchValue'), 
    '100')

WebUI.click(findTestObject('sales_creditorvoid_Repository/Page_V-POS - Search Transactions/input_AdvancedSearch_sbutton'))

WebUI.click(findTestObject('sales_creditorvoid_Repository/Page_Transaction Search Results/a_2703717'))

WebUI.click(findTestObject('sales_creditorvoid_Repository/Page_V-POS - Transaction Detail/a_Credit this transaction'))

WebUI.setText(findTestObject('sales_creditorvoid_Repository/Page_V-POS - V-POS - On-Line Personal Check Debit/input__accountNumberPrefix'), 
    '325678')

WebUI.click(findTestObject('sales_creditorvoid_Repository/Page_V-POS - V-POS - On-Line Personal Check Debit/input_UDF2_submit'))

WebUI.verifyTextPresent('Transaction Failed', false)

