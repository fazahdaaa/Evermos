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

WebUI.click(findTestObject('Object Repository/Page_Masuk Sebagai Reseller Evermos/a_Daftar'))

WebUI.setText(findTestObject('Object Repository/Page_Registration Evermos Daftar Menjadi Re_4cd5b5/input_land Islands_telephone'), 
    '8112259106')

WebUI.click(findTestObject('Object Repository/Page_Registration Evermos Daftar Menjadi Re_4cd5b5/div_Tunggu, ya.      Daftar Menjadi Reselle_65ae82'))

WebUI.setText(findTestObject('Object Repository/Page_Registration Evermos Daftar Menjadi Re_4cd5b5/input'), 'Test Faza QA')

WebUI.setText(findTestObject('Page_Registration Evermos Daftar Menjadi Re_4cd5b5/input_1'), 'password')

WebUI.click(findTestObject('Object Repository/Page_Registration Evermos Daftar Menjadi Re_4cd5b5/a__registration__block'))

WebUI.setText(findTestObject('Object Repository/Page_Registration Evermos Daftar Menjadi Re_4cd5b5/input_Cari Kecamatan_searchBox__input'), 
    'kebayoran')

WebUI.click(findTestObject('Object Repository/Page_Registration Evermos Daftar Menjadi Re_4cd5b5/span_DKI Jakarta, Jakarta Selatan, Kec.Keba_8e3b6e'))

WebUI.click(findTestObject('Object Repository/Page_Registration Evermos Daftar Menjadi Re_4cd5b5/button_Lanjutkan Pendaftaran'))

WebUI.closeBrowser()

