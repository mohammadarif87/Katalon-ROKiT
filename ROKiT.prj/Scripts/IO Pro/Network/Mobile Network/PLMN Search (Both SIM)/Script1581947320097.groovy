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

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Set Preferred Network Type 4G SIM 1 (O2-UK)'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.comment('PLMN Search O2-UK')

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView4 - Mobile network'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView4 - Mobile network'), 
        0)

    Mobile.tap(findTestObject('Network/Mobile Network/android.widget.TextView0 - T-MOBILE'), 0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Advanced'), 0)

    Mobile.swipe(540, 1800, 540, 450)

    Mobile.scrollToText('Automatically select network', FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.TextView11 - Automatically select network'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.Switch1 - ON'), 0)

    Mobile.tap(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.TextView11 - Automatically select network'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.TextView0 - Searching'), 
        0)

    Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

    Mobile.waitForElementPresent(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.TextView0 - Network'), 
        100)

    Mobile.verifyElementVisible(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.TextView0 - Network'), 
        10)

    Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/android.widget.CheckedTextView0 - T-Mobile 4G'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/android.widget.CheckedTextView0 - T-Mobile 3G'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/android.widget.CheckedTextView0 - T-Mobile 2G'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.Button0 - CANCEL'), 0)

    Mobile.tap(findTestObject('Network/Mobile Network/android.widget.CheckedTextView0 - T-Mobile 4G'), 0)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    Mobile.comment('Turn automatically select network back on')

    Mobile.pressBack()

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView4 - Mobile network'), 
        0)

    Mobile.tap(findTestObject('Network/Mobile Network/android.widget.TextView0 - T-MOBILE'), 0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Advanced'), 0)

    Mobile.swipe(540, 1800, 540, 450)

    Mobile.scrollToText('Automatically select network', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.TextView11 - Automatically select network'), 
        0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Set Preferred Network Type 4G SIM 1 (O2-UK)'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.comment('PLMN Search O2-UK')

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView4 - Mobile network'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView4 - Mobile network'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView1 - O2 - UK'), 0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Advanced'), 0)

    Mobile.swipe(540, 1800, 540, 450)

    Mobile.scrollToText('Automatically select network', FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.TextView11 - Automatically select network'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.Switch1 - ON'), 0)

    Mobile.tap(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.TextView11 - Automatically select network'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.TextView0 - Searching'), 
        0)

    while (Mobile.verifyElementVisible(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.TextView0 - Searching'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)
    }
    
    Mobile.waitForElementPresent(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.TextView0 - Network'), 
        100)

    Mobile.verifyElementVisible(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.TextView0 - Network'), 
        10)

    Mobile.verifyElementVisible(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.CheckedTextView0 - O2 - UK 4G'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.CheckedTextView1 - O2 - UK 2G'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.Button0 - CANCEL'), 0)

    Mobile.tap(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.CheckedTextView0 - O2 - UK 4G'), 0)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    Mobile.comment('Turn automatically select network back on')

    Mobile.pressBack()

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView4 - Mobile network'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView1 - O2 - UK'), 0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Advanced'), 0)

    Mobile.swipe(540, 1800, 540, 450)

    Mobile.scrollToText('Automatically select network', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.TextView11 - Automatically select network'), 
        0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.closeApplication()

    Mobile.comment('PLMN Search EE')

    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Set Preferred Network Type 4G SIM 2 (EE)'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView4 - Mobile network'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView4 - Mobile network'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView2 - EE'), 0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Advanced'), 0)

    Mobile.swipe(540, 1800, 540, 450)

    Mobile.verifyElementVisible(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.TextView11 - Automatically select network'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.Switch1 - ON'), 0)

    Mobile.tap(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.TextView11 - Automatically select network'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.TextView0 - Searching'), 
        0)

    while (Mobile.verifyElementVisible(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.TextView0 - Searching'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)
    }

    Mobile.waitForElementPresent(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.TextView0 - Network'), 
        100)

    Mobile.verifyElementVisible(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.TextView0 - Network'), 
        10)

    Mobile.verifyElementVisible(findTestObject('Network/PLMN Search (SIM 2 - EE)/android.widget.CheckedTextView0 - EE 4G'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/PLMN Search (SIM 2 - EE)/android.widget.CheckedTextView1 - EE 2G'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.Button0 - CANCEL'), 0)

    Mobile.tap(findTestObject('Network/PLMN Search (SIM 2 - EE)/android.widget.CheckedTextView1 - EE 2G'), 0)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    Mobile.comment('Turn automatically select network back on')

    Mobile.pressBack()

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView4 - Mobile network'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView2 - EE'), 0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Advanced'), 0)

    Mobile.swipe(540, 1800, 540, 450)

    Mobile.tap(findTestObject('Network/PLMN Search (SIM 1 - O2-UK)/android.widget.TextView11 - Automatically select network'), 
        0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('PLMN Search (Both SIM)', '', TestLinkAPIResults.TEST_PASSED)

