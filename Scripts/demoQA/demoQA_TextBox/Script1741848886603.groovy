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

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Page_DEMOQA/h5_Elements'), 0)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/h5_Elements'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/li_Text Box'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Full Name_userName'), 'Vande Fransiskus Butar Butar')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Email_userEmail'), 'fransiskusvande007@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/textarea_Current Address_currentAddress'), 'Bogor')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/textarea_Permanent Address_permanentAddress'), 'Cibubur')

WebUI.scrollToElement(findTestObject('Page_DEMOQA/button_Submit'), 0)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Submit'))

WebUI.getText(findTestObject('Page_DEMOQA/p_NameVande Fransiskus Butar Butar'), FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Page_DEMOQA/p_Emailfransiskusvande007gmail.com'))

WebUI.getText(findTestObject('Page_DEMOQA/p_Current Address Bogor'))

WebUI.getText(findTestObject('Page_DEMOQA/p_Permananet Address Cibubur'))

WebUI.closeBrowser()

