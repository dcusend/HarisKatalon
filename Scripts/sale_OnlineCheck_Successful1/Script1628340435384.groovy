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

WebUI.setText(findTestObject('Object Repository/new_Repositroy/Page_Velocity Payment System/input_Username_user'), 'iahmed')

WebUI.setEncryptedText(findTestObject('Object Repository/new_Repositroy/Page_Velocity Payment System/input_Password_password'), 
    'ReH0Zrvn+OVqGz5NDrNXZg==')

WebUI.click(findTestObject('Page_Velocity Payment System2/input_Password_button2'))

WebUI.click(findTestObject('new_Repositroy/Page_Velocity Payment System/a_Access No Convenience Fees'))

WebUI.click(findTestObject('Object Repository/new_Repositroy/Page_V-POS - Transactions Menu/a_Debit'))

WebUI.click(findTestObject('Object Repository/new_Repositroy/Page_V-POS - On-Line Check Debit/input_Personal_achtype'))

WebUI.click(findTestObject('Object Repository/new_Repositroy/Page_V-POS - On-Line Check Debit/input'))

WebUI.setText(findTestObject('Object Repository/new_Repositroy/Page_V-POS - On-Line Personal Check Debit/input__firstName'), 
    'naddo')

WebUI.setText(findTestObject('Object Repository/new_Repositroy/Page_V-POS - On-Line Personal Check Debit/input__lastName'), 
    'paddo')

WebUI.setText(findTestObject('Object Repository/new_Repositroy/Page_V-POS - On-Line Personal Check Debit/input__address'), 
    '33 lane drive')

WebUI.setText(findTestObject('Object Repository/new_Repositroy/Page_V-POS - On-Line Personal Check Debit/input__zip'), '214898')

WebUI.setText(findTestObject('Object Repository/new_Repositroy/Page_V-POS - On-Line Personal Check Debit/input__city'), 
    'hillside')

WebUI.selectOptionByValue(findTestObject('Object Repository/new_Repositroy/Page_V-POS - On-Line Personal Check Debit/select_Select OneArmed Forces AmericasArmed_3dceb0'), 
    'Delaware', true)

WebUI.setText(findTestObject('Object Repository/new_Repositroy/Page_V-POS - On-Line Personal Check Debit/input__routingNumber'), 
    '256072691')

WebUI.setText(findTestObject('Object Repository/new_Repositroy/Page_V-POS - On-Line Personal Check Debit/input__accountNumber'), 
    '3256789456')

WebUI.setText(findTestObject('Object Repository/new_Repositroy/Page_V-POS - On-Line Personal Check Debit/input__amount'), 
    '100')

WebUI.setText(findTestObject('Object Repository/new_Repositroy/Page_V-POS - On-Line Personal Check Debit/input__userDefined1'), 
    'naddo')

WebUI.setText(findTestObject('Object Repository/new_Repositroy/Page_V-POS - On-Line Personal Check Debit/input_UDF2_userDefined2'), 
    'paddo')

WebUI.click(findTestObject('Object Repository/new_Repositroy/Page_V-POS - On-Line Personal Check Debit/input_UDF2_submit'))

WebUI.verifyTextPresent('Transaction Successful', false)

WebUI.closeBrowser()
//This is a Comment


