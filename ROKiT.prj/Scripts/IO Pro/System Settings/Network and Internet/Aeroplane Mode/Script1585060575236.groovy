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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Mobile Data SIM 1 (O2 - UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView2 - WiFi'), 0)

Mobile.verifyElementVisible(findTestObject('Network/Aeroplane Mode/android.widget.TextView10 - Advanced'), 0)

Mobile.tap(findTestObject('Network/Aeroplane Mode/android.widget.TextView10 - Advanced'), 0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Network/Aeroplane Mode/android.widget.TextView0 - Airplane mode'), 0)
} else {
    Mobile.verifyElementVisible(findTestObject('Network/Aeroplane Mode/android.widget.TextView10 - Aeroplane mode'), 0)
}

Mobile.verifyElementVisible(findTestObject('Network/Aeroplane Mode/android.widget.Switch1 - OFF'), 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Network/Aeroplane Mode/android.widget.Switch1 - OFF'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Network/Aeroplane Mode/android.widget.Switch1 - ON'), 0)

Mobile.openNotifications()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(540, 450, 540, 1800)

'4G Icon'
Mobile.verifyElementNotVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 4G'), 
    10, FailureHandling.OPTIONAL)

'H+ Icon'
Mobile.verifyElementNotVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - H'), 
    5, FailureHandling.OPTIONAL)

if (userName == 'Aiden') {
    'Aeroplane mode under mobile data'
    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Aeroplane Mode/android.widget.TextView0 - Airplane mode'), 
        0)

    Mobile.verifyElementNotVisible(findTestObject('Network/Wi-Fi/Wi-Fi Enable-Disable from Quick Settings/android.widget.TextView3 - ROKiT Test 5G'), 
        0)

    'Not connected to O2 or EE'
    Mobile.verifyElementNotVisible(findTestObject('Network/Aeroplane Mode/android.widget.TextView13 - O2 - UK  EE'), 0)

    'SPN changed to Aeroplane mode'
    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Aeroplane Mode/android.widget.TextView0 - Airplane mode (1)'), 
        0)

    Mobile.closeNotifications()

    Mobile.verifyElementVisible(findTestObject('Network/Aeroplane Mode/android.widget.TextView0 - Airplane mode'), 3)
} else {
    'Aeroplane mode under mobile data'
    Mobile.verifyElementVisible(findTestObject('Network/Aeroplane Mode/android.widget.TextView10 - Aeroplane mode (1)'), 
        0)

    Mobile.verifyElementNotVisible(findTestObject('Network/Wi-Fi/Wi-Fi Enable-Disable from Quick Settings/android.widget.TextView3 - ROKiT Test 5G'), 
        0)

    'Not connected to O2 or EE'
    Mobile.verifyElementNotVisible(findTestObject('Network/Aeroplane Mode/android.widget.TextView13 - O2 - UK  EE'), 0)

    'SPN changed to Aeroplane mode'
    Mobile.verifyElementVisible(findTestObject('Network/Aeroplane Mode/android.widget.TextView13 - Aeroplane mode'), 0)

    Mobile.closeNotifications()

    Mobile.verifyElementVisible(findTestObject('Network/Aeroplane Mode/android.widget.TextView10 - Aeroplane mode'), 0)
}

not_run: Mobile.closeNotifications()

Mobile.comment('Turn Off Aeroplane Mode as leaving it on may affect other test cases')

Mobile.verifyElementVisible(findTestObject('Network/Aeroplane Mode/android.widget.Switch1 - ON'), 3)

Mobile.tap(findTestObject('Network/Aeroplane Mode/android.widget.Switch1 - ON'), 0)

Mobile.verifyElementVisible(findTestObject('Network/Aeroplane Mode/android.widget.Switch1 - OFF'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Aeroplane Mode', '', TestLinkAPIResults.TEST_PASSED)

