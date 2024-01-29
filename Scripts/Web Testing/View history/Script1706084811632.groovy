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

WebUI.callTestCase(findTestCase('Web Testing/Reused Test Cases/Book Appointment'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/i_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_History'))

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/history.php#history')

def currentwindow = WebUI.getUrl()

WebUI.verifyMatch(currentwindow, 'https://katalon-demo-cura.herokuapp.com/history.php#history', false)

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_History'), 'History')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Seoul CURA Healthcare Center'), 
    'Seoul CURA Healthcare Center')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/p_No'), 'No')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Medicaid'), 'Medicaid')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/p_No comment'), 'No comment')

