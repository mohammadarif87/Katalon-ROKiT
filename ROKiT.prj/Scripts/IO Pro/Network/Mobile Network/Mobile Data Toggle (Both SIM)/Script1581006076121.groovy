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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off Mobile Data SIM 1 (O2 - UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off Mobile Data SIM 2 (EE)(ATT)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

'Swipe in Settings'
device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startX = device_Width / 2

int endX = startX

int startY = device_Height * 0.85 // starts almost at the bottom of the screen

int endY = device_Height * 0.5 // stops scrolling almost at the top of the screen

Mobile.pressHome()

Mobile.openNotifications()

Mobile.swipe(540, 450, 540, 1800)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Enable-Disable from Quick Settings/android.widget.TextView9 - Mobile data'), 
    0)

Mobile.tapAndHold(findTestObject('Network/Mobile Network/Mobile Data Enable-Disable from Quick Settings/android.widget.TextView9 - Mobile data'), 
    2, 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Long Press from Quick Settings/android.widget.TextView10 - Mobile data'), 
    3)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Long Press from Quick Settings/android.widget.Switch0 - OFF'), 
    0)

Mobile.tap(findTestObject('Network/Mobile Network/Mobile Data Long Press from Quick Settings/android.widget.TextView10 - Mobile data'), 
    0)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Long Press from Quick Settings/android.widget.Switch0 - ON'), 
    0)

Mobile.tap(findTestObject('Network/Mobile Network/Mobile Data Long Press from Quick Settings/android.widget.TextView10 - Mobile data'), 
    0)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Long Press from Quick Settings/android.widget.Switch0 - OFF'), 
    0)

Mobile.comment('Change Mobile Data to EE')

'Back button'
Mobile.tap(findTestObject('Network/Mobile Network/Mobile Data Toggle/android.widget.ImageButton0'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 0)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Toggle/android.widget.TextView9 - SIM cards'), 
    0)

Mobile.tap(findTestObject('Network/Mobile Network/Mobile Data Toggle/android.widget.TextView9 - SIM cards'), 0)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Toggle/android.widget.TextView7 - Mobile data'), 
    3)

Mobile.tap(findTestObject('Network/Mobile Network/Mobile Data Toggle/android.widget.TextView7 - Mobile data'), 0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Toggle/android.widget.TextView0 - ATT'), 
        0)

    Mobile.tap(findTestObject('Network/Mobile Network/Mobile Data Toggle/android.widget.TextView0 - ATT'), 0)
} else {
    Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Toggle/android.widget.TextView3 - EE'), 
        0)

    Mobile.tap(findTestObject('Network/Mobile Network/Mobile Data Toggle/android.widget.TextView3 - EE'), 0)
}

'Back button'
Mobile.tap(findTestObject('Network/Mobile Network/Mobile Data Toggle/android.widget.ImageButton0'), 0)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Toggle/android.widget.TextView5 - Data usage'), 
    3)

Mobile.tap(findTestObject('Network/Mobile Network/Mobile Data Toggle/android.widget.TextView5 - Data usage'), 0)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Long Press from Quick Settings/android.widget.TextView10 - Mobile data'), 
    0)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Long Press from Quick Settings/android.widget.Switch0 - OFF'), 
    0)

Mobile.tap(findTestObject('Network/Mobile Network/Mobile Data Long Press from Quick Settings/android.widget.TextView10 - Mobile data'), 
    0)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Long Press from Quick Settings/android.widget.Switch0 - ON'), 
    3)

Mobile.tap(findTestObject('Network/Mobile Network/Mobile Data Long Press from Quick Settings/android.widget.TextView10 - Mobile data'), 
    0)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Long Press from Quick Settings/android.widget.Switch0 - OFF'), 
    0)

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Mobile Data SIM 2 (EE)(ATT)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Mobile Data SIM 1 (O2 - UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Mobile DataToggle (Both SIM)', 'SIM 1 = O2-UK\nSIM2 = EE', 
    TestLinkAPIResults.TEST_PASSED)

