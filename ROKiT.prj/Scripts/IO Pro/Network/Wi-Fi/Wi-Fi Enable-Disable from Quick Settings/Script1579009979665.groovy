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

Mobile.pressHome()

Mobile.openNotifications()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(540, 450, 540, 1800)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Enable-Disable from Quick Settings/android.widget.TextView0 - MySpectrumWiFi20-2G'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Enable-Disable from Quick Settings/android.widget.Switch0 - On'), 
        0)

    Mobile.tap(findTestObject('Network/Wi-Fi/Wi-Fi Enable-Disable from Quick Settings/android.widget.TextView0 - MySpectrumWiFi20-2G'), 
        0)
} else if (userName == 'User') {
    Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Enable-Disable from Quick Settings/android.widget.TextView3 - TALKTALKAA45DA'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Enable-Disable from Quick Settings/android.widget.Switch0 - On'), 
        0)

    Mobile.tap(findTestObject('Network/Wi-Fi/Wi-Fi Enable-Disable from Quick Settings/android.widget.TextView3 - TALKTALKAA45DA'), 
        0)
} else if (userName == 'ROKiT') {
    Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Enable-Disable from Quick Settings/android.widget.TextView3 - ROKiT Test 5G'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Enable-Disable from Quick Settings/android.widget.Switch0 - On'), 
        0)

    Mobile.tap(findTestObject('Network/Wi-Fi/Wi-Fi Enable-Disable from Quick Settings/android.widget.TextView3 - ROKiT Test 5G'), 
        0)
}

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Enable-Disable from Quick Settings/android.widget.TextView3 - Wi-Fi'), 
    0)

Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Enable-Disable from Quick Settings/android.widget.Switch0 - Off'), 
    0)

Mobile.tap(findTestObject('Network/Wi-Fi/Wi-Fi Enable-Disable from Quick Settings/android.widget.Switch0 - Off'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Enable-Disable from Quick Settings/android.widget.TextView0 - MySpectrumWiFi20-2G'), 
        0)
} else if (userName == 'User') {
    Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Enable-Disable from Quick Settings/android.widget.TextView3 - TALKTALKAA45DA'), 
        0)

} else if (userName == 'ROKiT') {
    Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Enable-Disable from Quick Settings/android.widget.TextView3 - ROKiT Test 5G'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Enable-Disable from Quick Settings/android.widget.Switch0 - On'), 
    0)

Mobile.verifyElementNotVisible(findTestObject('Network/Wi-Fi/Wi-Fi Enable-Disable from Quick Settings/android.widget.TextView3 - Wi-Fi'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Wi-Fi Enable/Disable from Quick Settings', 
    '', TestLinkAPIResults.TEST_PASSED)

