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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView8 - Apps  notifications'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView8 - Apps  notifications'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView2 - Recently opened apps'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView18 - See all 42 apps'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView18 - See all 42 apps'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView0 - App info'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView1 - All apps'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView2 - 3D Camera'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView4 - 3D Gallery'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView6 - 3DFV'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView1 - All apps'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.CheckedTextView1 - Installed apps'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.CheckedTextView1 - Installed apps'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView1 - Installed apps'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView2 - 3D Camera'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView3 - Installed'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.Button0 - DISABLE'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.Button0 - DISABLE'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView0 - If you disable this app Android and other apps may no longer function as intended.'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.Button0 - CANCEL'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.Button1 - DISABLE APP'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.Button0 - ENABLE'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView3 - Disabled'), 
    0)

Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView3 - Installed'), 
    0)

'Back Button'
Mobile.tap(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.ImageButton0'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView1 - Installed apps'), 
    0)

Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView2 - 3D Camera'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView4 - 3D Gallery'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView4 - 3D Gallery'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView3 - Installed'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.Button0 - DISABLE'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.Button0 - DISABLE'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView0 - If you disable this app Android and other apps may no longer function as intended.'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.Button0 - CANCEL'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.Button1 - DISABLE APP'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.Button0 - ENABLE'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView3 - Disabled'), 
    0)

Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView3 - Installed'), 
    0)

'Back Button'
Mobile.tap(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.ImageButton0'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView1 - Installed apps'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView6 - 3DFV'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView6 - 3DFV'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView3 - Installed'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.Button0 - DISABLE'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.Button0 - DISABLE'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView0 - If you disable this app Android and other apps may no longer function as intended.'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.Button0 - CANCEL'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.Button1 - DISABLE APP'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.Button0 - ENABLE'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView3 - Disabled'), 
    0)

Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView3 - Installed'), 
    0)

'Back Button'
Mobile.tap(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.ImageButton0'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView1 - Installed apps'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView1 - Installed apps'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.CheckedTextView2 - Disabled apps'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.CheckedTextView2 - Disabled apps'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView1 - Disabled apps'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView2 - 3D Camera'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView5 - 3D Gallery'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView8 - 3DFV'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView4 - Disabled'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView7 - Disabled'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView10 - Disabled'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView2 - 3D Camera'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.Button0 - ENABLE'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.Button0 - ENABLE'), 0)

Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView3 - Disabled'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView3 - Installed'), 
    0)

'Back Button'
Mobile.tap(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView4 - 3D Gallery'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.Button0 - ENABLE'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.Button0 - ENABLE'), 0)

Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView3 - Disabled'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView3 - Installed'), 
    0)

'Back Button'
Mobile.tap(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView6 - 3DFV'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.Button0 - ENABLE'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.Button0 - ENABLE'), 0)

Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView3 - Disabled'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView3 - Installed'), 
    0)

'Back Button'
Mobile.tap(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.ImageButton0'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Disable App View/android.widget.TextView2 - No apps.'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Disable app view', '', TestLinkAPIResults.TEST_PASSED)

