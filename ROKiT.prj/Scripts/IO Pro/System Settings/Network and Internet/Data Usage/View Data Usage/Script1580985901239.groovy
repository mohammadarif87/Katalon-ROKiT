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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import testlink.api.java.client.TestLinkAPIResults as TestLinkAPIResults

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Mobile Data SIM 1 (O2 - UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Data Usage/android.widget.TextView5 - Data usage'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Data Usage/android.widget.TextView5 - Data usage'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Data Usage/android.widget.TextView7 - Data Saver'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Data Usage/android.widget.TextView8 - Off'), 0)

Mobile.tap(findTestObject('Settings/Network and Internet/Data Usage/android.widget.TextView7 - Data Saver'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Data Usage/android.widget.TextView0 - Data Saver'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Data Usage/android.widget.TextView2 - Use Data Saver'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Data Usage/android.widget.Switch0 - OFF'), 0)

Mobile.pressBack()

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Data Usage/android.widget.TextView10 - Mobile data'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Data Usage/android.widget.TextView11 - App data usage'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Data Usage/android.widget.TextView12 - Data warning  limit'), 
    0)

Mobile.swipe(512, 900, 512, 200)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Data Usage/android.widget.TextView10 - Temporary data service'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Data Usage/android.widget.TextView13 - WiFi data usage'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Data Usage/android.widget.TextView12 - Data warning  limit'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Data Usage/android.widget.TextView0 - Data warning  limit'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Data Usage/android.widget.TextView2 - App data usage cycle'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Data Usage/android.widget.TextView3 - Set data warning'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Data Usage/android.widget.TextView4 - Data warning'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Data Usage/android.widget.TextView6 - Set data limit'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Data Usage/android.widget.TextView7 - Data limit'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('View Data usage', '', TestLinkAPIResults.TEST_PASSED)

