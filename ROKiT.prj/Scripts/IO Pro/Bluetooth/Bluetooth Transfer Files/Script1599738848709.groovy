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

'IO Pro'
Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Bluetooth'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

'IO 3D'
Mobile.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Turn on Bluetooth'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)', ('deviceId') : '0123456789ABCDEF'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Add Google Account'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Clear All Notifications'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

'IO 3D'
WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Clear All Notifications'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)', ('udid') : '0123456789ABCDEF', ('platformName') : 'Android']], 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

'Burger Menu icon'
Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.ImageButton0'), 0)

'Burger Menu icon'
Mobile.tap(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.ImageButton0'), 0)

Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.TextView14 - Drive'), 0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.TextView0 - rokitphones715gmail.com'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.TextView17 - rokittest1gmail.com'), 
        0)
}

Mobile.tap(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.TextView14 - Drive'), 0)

Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.TextView6 - Starred'), 0)

Mobile.tap(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.TextView6 - Starred'), 0)

Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.TextView4 - Bluetooth Test Files'), 
    0)

Mobile.tap(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.TextView4 - Bluetooth Test Files'), 0)

'.jpg file'
Mobile.tapAndHold(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.LinearLayout6'), 0, 0)

Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.TextView16 - 1 selected'), 
    0)

'.apk file'
Mobile.tapAndHold(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.LinearLayout7'), 0, 0)

'.mp3 file'
Mobile.tapAndHold(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.LinearLayout8'), 0, 0)

'.mkv file'
Mobile.tapAndHold(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.LinearLayout9'), 0, 0)

'.mp4 file'
Mobile.tapAndHold(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.LinearLayout10'), 0, 0)

Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.TextView16 - 5 selected'), 
    5)

'Share icon'
Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.TextView17'), 5)

'Share icon'
Mobile.tap(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.TextView17'), 5)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.TextView0 - Share via'), 3)

Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.TextView1 - Bluetooth'), 3)

Mobile.tap(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.TextView1 - Bluetooth'), 3)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementNotVisible(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.TextView0 - Choose Bluetooth device'), 
    20, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.TextView1 - Bluetooth'), 
        0)

    Mobile.tap(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.TextView1 - Bluetooth'), 0)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)
}

Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.TextView0 - Choose Bluetooth device'), 
    20)

Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.TextView2 - IO 3D Automation'), 
    0)

Mobile.tap(findTestObject('Bluetooth/Bluetooth Transfer Files/android.widget.TextView2 - IO 3D Automation'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Accept 5 incoming Bluetooth file'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
            , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.openNotifications()

Mobile.verifyElementVisible(findTestObject('Preconditions/Accept incoming Bluetooth file/android.widget.TextView5 - 5 successful 0 unsuccessful'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Bluetooth Transfer Files', '', TestLinkAPIResults.TEST_PASSED)

