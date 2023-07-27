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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Wi-Fi - Forget Connection'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView2 - WiFi'), 0)

Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView2 - WiFi'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView2 - Use WiFi'), 0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    if (Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Long Press from Quick Settings/android.widget.TextView0 - MySpectrumWiFi20-2G'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi Long Press from Quick Settings/android.widget.TextView0 - MySpectrumWiFi20-2G'), 
            5)

        Mobile.tap(findTestObject('Network/Wi-Fi/Wi-Fi Long Press from Quick Settings/android.widget.TextView0 - MySpectrumWiFi20-2G'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView0 - MySpectrumWiFi20-2G'), 
            3)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.CheckBox0 - Show password'), 
            3)

        Mobile.setText(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.EditText0'), 
            '12345678', 0)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button1 - CONNECT'), 
            3)

        Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button1 - CONNECT'), 
            0)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView6 - Check password and try again'), 
            10)

        Mobile.tap(findTestObject('Network/Wi-Fi/Wi-Fi Long Press from Quick Settings/android.widget.TextView0 - MySpectrumWiFi20-2G'), 
            5)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView0 - MySpectrumWiFi20-2G'), 
            3)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.EditText0 - (unchanged)'), 
            3)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button0 - CANCEL'), 
            3)

        Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button0 - CANCEL'), 
            0)

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        Mobile.scrollToText('Saved networks')

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView14 - Saved networks'), 
            3)

        Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView14 - Saved networks'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView0 - Saved networks'), 
            3)

        Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView0 - MySpectrumWiFi20-2G (1)'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView0 - MySpectrumWiFi20-2G'), 
            3)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button0 - FORGET'), 
            0)

        Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button0 - FORGET'), 
            0)

        Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.ImageButton0'), 
            0)

        Mobile.verifyElementNotVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView6 - Check password and try again'), 
            10)
    } else {
        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Forget Network/android.widget.TextView0 - ROK - Wireless WiFi'), 
            5)

        Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Forget Network/android.widget.TextView0 - ROK - Wireless WiFi'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView0 - ROK - Wireless WiFi (1)'), 
            3)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.CheckBox0 - Show password'), 
            3)

        Mobile.setText(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.EditText0'), 
            '12345678', 0)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button1 - CONNECT'), 
            3)

        Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button1 - CONNECT'), 
            0)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView6 - Check password and try again'), 
            10)

        Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Forget Network/android.widget.TextView0 - ROK - Wireless WiFi'), 
            5)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView0 - ROK - Wireless WiFi (1)'), 
            3)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.EditText0 - (unchanged)'), 
            3)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button0 - CANCEL'), 
            3)

        Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button0 - CANCEL'), 
            0)

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        Mobile.scrollToText('Saved networks')

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView14 - Saved networks'), 
            3)

        Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView14 - Saved networks'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView0 - Saved networks'), 
            3)

        Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Forget Network/android.widget.TextView0 - ROK - Wireless WiFi'), 
            5)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView0 - ROK - Wireless WiFi (1)'), 
            3)

        Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button0 - FORGET'), 
            0)

        Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button0 - FORGET'), 
            0)

        Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.ImageButton0'), 
            0)

        Mobile.verifyElementNotVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView6 - Check password and try again'), 
            10)
    }
} else if (userName == 'User') {
    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView5 - TALKTALKAA45DA2G'), 
        20)

    Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView5 - TALKTALKAA45DA2G'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView0 - TALKTALKAA45DA2G'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.CheckBox0 - Show password'), 
        0)

    Mobile.setText(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.EditText0'), 
        '12345678', 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button1 - CONNECT'), 
        0)

    Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button1 - CONNECT'), 
        0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView6 - Check password and try again'), 
        30)

    Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView5 - TALKTALKAA45DA2G'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView0 - TALKTALKAA45DA2G'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.EditText0 - (unchanged)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button0 - CANCEL'), 
        0)

    Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button0 - CANCEL'), 
        0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.scrollToText('Saved networks')

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView14 - Saved networks'), 
        0)

    Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView14 - Saved networks'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView0 - Saved networks'), 
        0)

    Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView4 - TALKTALKAA45DA2G'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView0 - TALKTALKAA45DA2G (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button0 - FORGET'), 
        0)

    Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button0 - FORGET'), 
        0)

    Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.ImageButton0'), 
        0)

    Mobile.verifyElementNotVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView6 - Check password and try again'), 
        10)
} else if (userName == 'ROKiT') {
    Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi List/android.widget.TextView6 - ROKiT Test 2G'), 0)

    Mobile.tap(findTestObject('Network/Wi-Fi/Wi-Fi List/android.widget.TextView6 - ROKiT Test 2G'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.CheckBox0 - Show password'), 
        0)

    Mobile.setText(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.EditText0'), 
        '12345678', 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button1 - CONNECT'), 
        0)

    Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button1 - CONNECT'), 
        0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView6 - Check password and try again'), 
        10)

    Mobile.tap(findTestObject('Network/Wi-Fi/Wi-Fi List/android.widget.TextView6 - ROKiT Test 2G'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.EditText0 - (unchanged)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button0 - CANCEL'), 
        0)

    Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button0 - CANCEL'), 
        0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.scrollToText('Saved networks')

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView14 - Saved networks'), 
        0)

    Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView14 - Saved networks'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView0 - Saved networks'), 
        0)

    Mobile.tap(findTestObject('Network/Wi-Fi/Wi-Fi List/android.widget.TextView6 - ROKiT Test 2G'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button0 - FORGET'), 
        0)

    Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button0 - FORGET'), 
        0)

    Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.ImageButton0'), 
        0)

    Mobile.verifyElementNotVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView6 - Check password and try again'), 
        10)
} else if (userName == 'Ovi') {
    Mobile.verifyElementVisible(findTestObject('Network/Wi-Fi/Wi-Fi List/android.widget.TextView6 - ROKiT Test 2G'), 0)

    Mobile.tap(findTestObject('Network/Wi-Fi/Wi-Fi List/android.widget.TextView6 - ROKiT Test 2G'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.CheckBox0 - Show password'), 
        0)

    Mobile.setText(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.EditText0'), 
        '12345678', 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button1 - CONNECT'), 
        0)

    Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button1 - CONNECT'), 
        0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView6 - Check password and try again'), 
        10)

    Mobile.tap(findTestObject('Network/Wi-Fi/Wi-Fi List/android.widget.TextView6 - ROKiT Test 2G'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.EditText0 - (unchanged)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button0 - CANCEL'), 
        0)

    Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button0 - CANCEL'), 
        0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.scrollToText('Saved networks')

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView14 - Saved networks'), 
        0)

    Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView14 - Saved networks'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView0 - Saved networks'), 
        0)

    Mobile.tap(findTestObject('Network/Wi-Fi/Wi-Fi List/android.widget.TextView6 - ROKiT Test 2G'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button0 - FORGET'), 
        0)

    Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.Button0 - FORGET'), 
        0)

    Mobile.tap(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.ImageButton0'), 
        0)

    Mobile.verifyElementNotVisible(findTestObject('System Settings/Network and internet/Wi-Fi/Incorrect Password Wi-Fi/android.widget.TextView6 - Check password and try again'), 
        10)
}

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Wi-Fi - Add Connection'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Incorrect Password Wi-Fi', '', TestLinkAPIResults.TEST_PASSED)

