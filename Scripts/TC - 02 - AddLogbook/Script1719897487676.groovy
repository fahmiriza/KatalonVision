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

//Add Logbook
WebUI.click(findTestObject('Object Repository/Addlogbook/klik_addLogbook'))

WebUI.setText(findTestObject('Object Repository/Addlogbook/Klik_tanggal'), '28062024')

WebUI.click(findTestObject('Object Repository/Addlogbook/klik_jammulai'))

WebUI.click(findTestObject('Object Repository/Addlogbook/jam_mulai'))

WebUI.click(findTestObject('Object Repository/Addlogbook/klik_jamselesai'))

WebUI.click(findTestObject('Object Repository/Addlogbook/jam_selesai'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Addlogbook/mode_kerja'), 'WFO', false)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Addlogbook/project'), 'Project Bersama')

WebUI.setText(findTestObject('Object Repository/Addlogbook/nama_tim'), 'Tim Satu')

WebUI.setText(findTestObject('Object Repository/Addlogbook/use_case'), 'Use case bersama')

WebUI.selectOptionByValue(findTestObject('Object Repository/Addlogbook/kegiatan'), 'Belajar Materi', false)

WebUI.setText(findTestObject('Object Repository/Addlogbook/hasil'), '100')

WebUI.setText(findTestObject('Object Repository/Addlogbook/capaian'), '80')

WebUI.selectOptionByValue(findTestObject('Object Repository/Addlogbook/next_step'), 'Wait Approval', false)

WebUI.setText(findTestObject('Object Repository/Addlogbook/file_name'), 'Folder Download')

WebUI.setText(findTestObject('Object Repository/Addlogbook/detail_kerja'), 'Detail Kerja bersama')

WebUI.selectOptionByValue(findTestObject('Object Repository/Addlogbook/waktu_kerja'), 'Jam Lembur', false)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Addlogbook/button_submit'))

if(type =='positif') {
	
	WebUI.verifyElementText(findTestObject('Object Repository/Addlogbook/notif_sukses'), 'Success')
	
	WebUI.takeFullPageScreenshot()
	
	WebUI.click(findTestObject('Object Repository/Addlogbook/OK_berhasil'))
	
	WebUI.closeBrowser()
	
} else {
	WebUI.comment('ERROR')
	WebUI.takeFullPageScreenshot()
}
















