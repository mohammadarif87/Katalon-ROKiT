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

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Add Google Account - US'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Add Google Account'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)
}

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

'Search bar'
Mobile.verifyElementVisible(findTestObject('Android Market/My apps and games/android.widget.TextView0 - Search for apps  games'), 
    3)

'Three stacked bar'
not_run: Mobile.tap(findTestObject('Android Market/My apps and games/android.widget.ImageView0'), 0)

'Three stacked bar'
Mobile.tapAtPosition(162, 166)

Mobile.verifyElementVisible(findTestObject('Android Market/My apps and games/android.widget.TextView0 - My apps  games'), 
    3)

Mobile.tap(findTestObject('Android Market/My apps and games/android.widget.TextView0 - My apps  games'), 0)

'Header'
Mobile.verifyElementVisible(findTestObject('Android Market/My apps and games/android.widget.TextView0 - My apps  games (1)'), 
    3)

Mobile.verifyElementVisible(findTestObject('Android Market/My apps and games/android.widget.TextView0 - Updates'), 0)

Mobile.verifyElementVisible(findTestObject('Android Market/My apps and games/android.widget.TextView0 - Installed'), 3)

Mobile.tap(findTestObject('Android Market/My apps and games/android.widget.TextView0 - Installed'), 0)

Mobile.verifyElementVisible(findTestObject('Android Market/My apps and games/android.widget.TextView0 - Carrier Services'), 
    3)

Mobile.verifyElementVisible(findTestObject('Android Market/My apps and games/android.widget.TextView0 - Digital Wellbeing'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Android Market/My apps and games/android.widget.TextView0 - Earth  Moon in HD Gyro 3D Parallax Live Wallpaper'), 
    3)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('My apps & games', '', TestLinkAPIResults.TEST_PASSED)

