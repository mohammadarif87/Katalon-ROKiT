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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.pressHome()

Mobile.openNotifications()

Mobile.swipe(540, 450, 540, 1800)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Enable-Disable from Quick Settings/android.widget.TextView9 - Mobile data'), 
    3)

Mobile.comment('Verify it says 4G or H+ then Disable Mobile Data')

'4G Icon'
if (Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Enable-Disable from Quick Settings/android.widget.TextView10 - 4G'), 
    10, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Network/Mobile Network/Mobile Data Enable-Disable from Quick Settings/android.widget.TextView9 - Mobile data'), 
        0)
} else if (Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - H'), 
    5, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Network/Mobile Network/Mobile Data Enable-Disable from Quick Settings/android.widget.TextView9 - Mobile data'), 
        0)
}

if (Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Enable-Disable from Quick Settings/android.widget.TextView0 - Turn off mobile data (1)'), 
    5, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Enable-Disable from Quick Settings/android.widget.TextView0 - Turn off mobile data (1)'), 
        3)

    userName = System.getProperty('user.name')

    if (userName == 'Aiden') {
        Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Enable-Disable from Quick Settings/android.widget.TextView0 - You wont have access to data or the internet through T-Mobile. Internet will only be available via Wi-Fi.'), 
            3)
    }
    
    Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Enable-Disable from Quick Settings/android.widget.Button0 - CANCEL (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Enable-Disable from Quick Settings/android.widget.Button0 - TURN OFF'), 
        3)

    Mobile.tap(findTestObject('Network/Mobile Network/Mobile Data Enable-Disable from Quick Settings/android.widget.Button0 - TURN OFF'), 
        3)
}

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Network/Mobile Network/Mobile Data Enable-Disable from Quick Settings/android.widget.TextView10 - Off'), 
    5)

Mobile.comment('Enable Mobile Data')

Mobile.tap(findTestObject('Network/Mobile Network/Mobile Data Enable-Disable from Quick Settings/android.widget.TextView9 - Mobile data'), 
    0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'4G Icon'
if (Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - 4G'), 
    10, FailureHandling.OPTIONAL)) {
    Mobile.closeNotifications()
}

'H+ Icon'
if (Mobile.verifyElementVisible(findTestObject('Network/Preferred Network Type (SIM 1 - O2-UK)/android.widget.TextView10 - H'), 
    5, FailureHandling.OPTIONAL)) {
    Mobile.closeNotifications()
}

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Mobile Data Enable/Disable from Quick Settings (Both SIM)', 
    '', TestLinkAPIResults.TEST_PASSED)

