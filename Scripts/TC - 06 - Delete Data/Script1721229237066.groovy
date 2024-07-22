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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.BaseURL)

WebUI.setText(findTestObject('Object Repository/Login/username'), username)

WebUI.setText(findTestObject('Object Repository/Login/password'), password)

WebUI.click(findTestObject('Object Repository/Login/button_login'))


if (username == 'TestAccountKaryawan11') {
	WebUI.comment('Gagal Login')
}else {

WebUI.verifyElementVisible(findTestObject('Object Repository/Addlogbook/klik_addLogbook'))
 }

 //Search Data
 WebUI.setText(findTestObject('Object Repository/edit search delete/text_serching'), cari_data)
 
 WebUI.takeFullPageScreenshot()
 
 //Delete Data
 WebUI.click(findTestObject('Object Repository/edit search delete/click_deletedata'))
 
  
 //verify
 if(type == 'positif') {
	 
	 WebUI.verifyElementText(findTestObject('Object Repository/edit search delete/alert_delete'), 'Are you sure?')
	 
	 WebUI.takeFullPageScreenshot()
	 
	 WebUI.click(findTestObject('Object Repository/edit search delete/OK_berhasil'))
	 
	 WebUI.takeFullPageScreenshot()
	 
	 WebUI.verifyElementText(findTestObject('Object Repository/edit search delete/verify_sukses'), 'Success')
	 
	 WebUI.takeFullPageScreenshot()
	 
	 WebUI.click(findTestObject('Object Repository/edit search delete/OK_berhasil'))
	 
	 WebUI.closeBrowser()
	 
 }
 
