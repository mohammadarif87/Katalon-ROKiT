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
import testlink.api.java.client.TestLinkAPIResults as TestLinkAPIResults
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Android Market/Browse/android.widget.TextView0 - Search for apps  games'), 3)

Mobile.tap(findTestObject('Android Market/Download App/android.widget.EditText0 - Search for apps  games'), 0)

Mobile.setText(findTestObject('Android Market/Download App/android.widget.EditText0 - Search for apps  games'), 'dev netcomps android', 
    0)

'Tick on keyboard'
Mobile.tapAtPosition(1000, 1945)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'Top App'
Mobile.tapAtPosition(600, 400)

Mobile.verifyElementVisible(findTestObject('Preconditions/Download Wi-Fi Direct Plus App/android.widget.TextView0 - WiFi Direct '), 
    0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Download Wi-Fi Direct Plus App/android.widget.TextView1 - Dev Netcomps Android'), 
    0)

Mobile.verifyElementVisible(findTestObject('Android Market/Download App/android.widget.Button0 - Uninstall'), 0)

Mobile.tap(findTestObject('Android Market/Download App/android.widget.Button0 - Uninstall'), 0)

Mobile.tap(findTestObject('Android Market/Download App/android.widget.Button1 - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Android Market/Download App/android.widget.Button0 - Install (1)'), 30)

Mobile.pressHome()

