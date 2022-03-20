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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://evermos.com/home/')

WebUI.click(findTestObject('Object Repository/Page_Evermos - Reseller Online Dropship Buk_aa0623/a_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Masuk Sebagai Reseller Evermos/input_Nomor Telepon_inputText__input'))

WebUI.setText(findTestObject('Object Repository/Page_Masuk Sebagai Reseller Evermos/input_Nomor Telepon_inputText__input'), 
    '6281223335555')

WebUI.setText(findTestObject('Page_Masuk Sebagai Reseller Evermos/input_Kata Sandi_inputText__input'), 'password')

WebUI.click(findTestObject('Object Repository/Page_Masuk Sebagai Reseller Evermos/button_Masuk'))

WebUI.closeBrowser()

