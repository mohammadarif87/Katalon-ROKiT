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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Mobile Data SIM 1 (O2 - UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
        3)

    Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView4 - Mobile network'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView4 - Mobile network'), 
        0)

    Mobile.tap(findTestObject('Network/Mobile Network/android.widget.TextView0 - T-MOBILE'), 3)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Advanced'), 0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView0 - Preferred network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.Button0 - CANCEL'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView0 - 4G (recommended)'), 
        3)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView0 - 4G (recommended)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 4G (recommended)'), 
        0)

    Mobile.openNotifications()

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(540, 450, 540, 1800)

    if (Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 4G'), 
        10, FailureHandling.OPTIONAL)) {
        Mobile.closeNotifications()
    } else if (Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - H'), 
        5, FailureHandling.OPTIONAL)) {
        Mobile.closeNotifications()
    }
    
    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        3)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView0 - Preferred network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView1 - 3G'), 
        3)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView1 - 3G'), 0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 3G'), 
        3)

    Mobile.openNotifications()

    Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(540, 450, 540, 1800)

    Mobile.verifyElementNotVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 4G'), 
        3)

    if (Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - H'), 
        10, FailureHandling.OPTIONAL)) {
        Mobile.closeNotifications()
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - EDGE'), 
        10, FailureHandling.OPTIONAL)) {
        Mobile.closeNotifications()
    }
    
    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        3)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView0 - Preferred network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView2 - 2G'), 
        3)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView2 - 2G'), 0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 2G'), 
        3)

    Mobile.openNotifications()

    Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(540, 450, 540, 1800)

    Mobile.verifyElementNotVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 4G'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - EDGE'), 
        60)

    Mobile.closeNotifications()

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView0 - 4G (recommended)'), 
        0)

    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Mobile Data SIM 2 (EE)(ATT)'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
        3)

    Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView4 - Mobile network'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView4 - Mobile network'), 
        0)

    Mobile.tap(findTestObject('Network/Mobile Network/android.widget.TextView0 - ATT'), 0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Advanced'), 0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        3)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView0 - Preferred network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.Button0 - CANCEL'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView0 - 4G (recommended)'), 
        3)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView0 - 4G (recommended)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 4G (recommended)'), 
        3)

    Mobile.openNotifications()

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(540, 450, 540, 1800)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 4G'), 
        10)

    Mobile.closeNotifications()

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        3)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView0 - Preferred network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView1 - 3G'), 
        3)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView1 - 3G'), 0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 3G'), 
        3)

    Mobile.openNotifications()

    Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(540, 450, 540, 1800)

    if (Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - H'), 
        10, FailureHandling.OPTIONAL)) {
        Mobile.closeNotifications()
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - EDGE'), 
        10, FailureHandling.OPTIONAL)) {
        Mobile.closeNotifications()
    }
    
    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        3)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView0 - 4G (recommended)'), 
        0)

    Mobile.closeApplication()

    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Mobile Data SIM 1 (O2 - UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

    Mobile.closeApplication()
} else {
    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView4 - Mobile network'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView4 - Mobile network'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView1 - O2 - UK'), 0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Advanced'), 0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView0 - Preferred network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.Button0 - CANCEL'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView0 - 4G (recommended)'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView0 - 4G (recommended)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 4G (recommended)'), 
        0)

    Mobile.openNotifications()

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(540, 450, 540, 1800)

    if (Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 4G'), 
        10, FailureHandling.OPTIONAL)) {
        Mobile.closeNotifications()
    } else if (Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - H'), 
        5, FailureHandling.OPTIONAL)) {
        Mobile.closeNotifications()
    }
    
    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView0 - Preferred network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView1 - 3G'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView1 - 3G'), 0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 3G'), 
        0)

    Mobile.openNotifications()

    Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(540, 450, 540, 1800)

    Mobile.verifyElementNotVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 4G'), 
        0)

    if (Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - H'), 
        10, FailureHandling.OPTIONAL)) {
        Mobile.closeNotifications()
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - EDGE'), 
        10, FailureHandling.OPTIONAL)) {
        Mobile.closeNotifications()
    }
    
    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView0 - Preferred network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView2 - 2G'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView2 - 2G'), 0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 2G'), 
        0)

    Mobile.openNotifications()

    Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(540, 450, 540, 1800)

    Mobile.verifyElementNotVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 4G'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - EDGE'), 
        60)

    Mobile.closeNotifications()

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView0 - 4G (recommended)'), 
        0)

    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Mobile Data SIM 2 (EE)(ATT)'), [('appPackage') : 'com.android.settings'
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

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView0 - Preferred network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.Button0 - CANCEL'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView0 - 4G (recommended)'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView0 - 4G (recommended)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 4G (recommended)'), 
        0)

    Mobile.openNotifications()

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(540, 450, 540, 1800)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 4G'), 
        10)

    Mobile.closeNotifications()

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView0 - Preferred network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView1 - 3G'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView1 - 3G'), 0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 3G'), 
        0)

    Mobile.openNotifications()

    Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(540, 450, 540, 1800)

    if (Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - H'), 
        10, FailureHandling.OPTIONAL)) {
        Mobile.closeNotifications()
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - EDGE'), 
        10, FailureHandling.OPTIONAL)) {
        Mobile.closeNotifications()
    }
    
    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView0 - Preferred network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView2 - 2G'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView2 - 2G'), 0)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 2G'), 
        0)

    Mobile.openNotifications()

    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(540, 450, 540, 1800)

    Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - EDGE'), 
        5)

    Mobile.closeNotifications()

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView9 - Preferred network type'), 
        0)

    Mobile.tap(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.CheckedTextView0 - 4G (recommended)'), 
        0)

    Mobile.closeApplication()

    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Mobile Data SIM 1 (O2 - UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)
}

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Preffered Network Type (Both SIM)', '', 
    TestLinkAPIResults.TEST_PASSED)

