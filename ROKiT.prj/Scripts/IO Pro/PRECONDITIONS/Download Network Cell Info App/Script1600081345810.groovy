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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Add Google Account'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

'Three stacked bar (Settings)'
Mobile.verifyElementVisible(findTestObject('Android Market/Browse/android.widget.ImageView0'), 3)

Mobile.verifyElementVisible(findTestObject('Android Market/Browse/android.widget.TextView0 - Search for apps  games'), 3)

Mobile.tap(findTestObject('Android Market/Browse/android.widget.TextView0 - Search for apps  games'), 3)

Mobile.tap(findTestObject('Android Market/Download App/android.widget.EditText0 - Search for apps  games'), 0)

Mobile.setText(findTestObject('Android Market/Download App/android.widget.EditText0 - Search for apps  games'), 'network cell info lite', 
    0)

Mobile.tap(findTestObject('Android Market/Download App/android.widget.TextView0 - network cell info lite'), 0)

Mobile.verifyElementVisible(findTestObject('Android Market/Download App/android.widget.TextView0 - Network Cell Info Lite - Mobile  WiFi Signal'), 
    3)

Mobile.verifyElementVisible(findTestObject('Android Market/Download App/android.widget.TextView0 - In-app purchases'), 0)

if (Mobile.verifyElementVisible(findTestObject('Android Market/Download App/android.widget.Button0 - Open'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Android Market/Download App/android.widget.Button0 - Open'), 0)

    Mobile.tap(findTestObject('Android Market/Download App/android.widget.Button0 - Open'), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Android Market/Download App/android.widget.TextView0 - Detailed Network Monitoring'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Android Market/Download App/android.widget.Button0 - Install'), 0)

    Mobile.tap(findTestObject('Android Market/Download App/android.widget.Button0 - Install'), 0)

    Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Android Market/Download App/android.widget.TextView0 - Installed'), 3)

    Mobile.tap(findTestObject('Android Market/Download App/android.widget.Button0 - Open'), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Android Market/Download App/android.widget.TextView0 - Detailed Network Monitoring'), 
        3)
}

Mobile.closeApplication()

