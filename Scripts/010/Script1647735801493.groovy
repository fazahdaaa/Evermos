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

WebUI.callTestCase(findTestCase('001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page_Evermos - Katalog/img'), 0)

WebUI.click(findTestObject('Object Repository/Page_Evermos - Katalog/span_Daftar Produk'))

WebUI.click(findTestObject('Object Repository/Page_Evermos/a_Krenies Makanan Ringan Krekers Brownies'))

WebUI.click(findTestObject('Object Repository/Page_Evermos/a_Beli Sekarang'))

WebUI.click(findTestObject('Object Repository/Page_Evermos/input_Rumah Fina Rizky_pickedAddressId'))

WebUI.click(findTestObject('Object Repository/Page_Evermos/button_Pilih Alamat'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Evermos/button_Lihat Keranjang'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Evermos/a_Lanjut ke Checkout'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Page_Evermos - Katalog/bayar'), 0)

WebUI.click(findTestObject('Object Repository/Page_Evermos/a_Layanan Pengiriman JNE - CTC (1-2 hari) R_d28f79'))

WebUI.click(findTestObject('Object Repository/Page_Evermos/span'))

WebUI.click(findTestObject('Object Repository/Page_Evermos/button_Terapkan'))

WebUI.click(findTestObject('Object Repository/Page_Evermos/a_Proses Sekarang'))

WebUI.click(findTestObject('Object Repository/Page_Evermos/button_Bayar'))

WebUI.click(findTestObject('Object Repository/Page_Evermos/div_ATMBank Transfer'))

WebUI.click(findTestObject('Object Repository/Page_Evermos/div_BCA'))

WebUI.click(findTestObject('Object Repository/Page_Evermos/a_Lihat Nomor Rekening'))

WebUI.click(findTestObject('Object Repository/Page_Evermos/a_Mohon Selesaikan Pembayaran'))

WebUI.click(findTestObject('Object Repository/Page_Evermos/span_Lihat Daftar Pesanan'))

WebUI.closeBrowser()

