import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://srv-test2012r2/Pocket/login.jsp')

WebUI.setText(findTestObject('Page_CaloPix Pocket login/input_concat(id(  userName  ))_j_username (1)'), 'agherras')

WebUI.setEncryptedText(findTestObject('Page_CaloPix Pocket login/input_concat(id(  userName  ))_j_password (1)'), 'iEozV8xnpv0D6Bo6fFYyUg==')

WebUI.setEncryptedText(findTestObject('Page_CaloPix Pocket login/input_j_password (1)'), 'iEozV8xnpv0D6Bo6fFYyUg==')

WebUI.click(findTestObject('Page_CaloPix Pocket login/input_connexion_input connexion_btn (1)'))

WebUI.click(findTestObject('Object Repository/Page_PocketReact/div_Test_1 Test_1 DiagnosticPatient'))

WebUI.click(findTestObject('Object Repository/Page_PocketReact/img_Codification_documentPanelImg'))
WebUI.closeWindowIndex(1) 
WebUI.delay(1) 
WebUI.switchToWindowIndex(0) 
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Page_PocketReact/img_Bienvenuetribvnagherras_deconnectUser'))

WebUI.click(findTestObject('Object Repository/Page_PocketReact/button_Yes'))

WebUI.closeBrowser()

