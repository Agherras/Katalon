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

WebUI.navigateToUrl('https://www.teleslide.com/usergroup3/us_userprofile.php?Action=Login&ProtocolId=0&SectorId=0')

WebUI.setText(findTestObject('Object Repository/OR_TestCase02/Page_Teleslide Cloud 41 - UserGroup - UserEdit/input_Identifiant_MyFormLoginCtrl'), 
    'agherras')

WebUI.setEncryptedText(findTestObject('Object Repository/OR_TestCase02/Page_Teleslide Cloud 41 - UserGroup - UserEdit/input_Mot de passe_MyFormPwdCtrl'), 
    'iEozV8xnpv0D6Bo6fFYyUg==')

WebUI.click(findTestObject('Object Repository/OR_TestCase02/Page_Teleslide Cloud 41 - Collaborative tool for diagnostic imaging/div'))

WebUI.click(findTestObject('Object Repository/OR_TestCase02/Page_Teleslide Cloud 41 - Forum - Menu/a_MES DOSSIERS_MenuLeftHelp'))

WebUI.click(findTestObject('Object Repository/OR_TestCase02/Page_Teleslide Cloud 41 - Publication - Subjects/img'))

WebUI.click(findTestObject('Object Repository/OR_TestCase02/Page_Teleslide Cloud 41 - Publication - Subjects/a_MES DOSSIERS_MenuLeftAbout'))

WebUI.click(findTestObject('Object Repository/OR_TestCase02/Page_Teleslide Cloud 41 - Publication - Subjects/span_ Visites  39_v312_CloseBox25'))

WebUI.click(findTestObject('Object Repository/OR_TestCase02/Page_Teleslide Cloud 41 - Publication - Subjects/a_SE DECONNECTER'))

WebUI.closeBrowser()

