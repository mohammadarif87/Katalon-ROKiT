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

not_run: WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Turn on Mobile Data SIM 2 (EE)(ATT) IO 3D'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
            , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Run in parallel execution with Place Call (SIM 2 EE)')

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.openNotifications()

    'Waiting for Answer Call button'
    Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.Button2 - ANSWER'), 300)

    'Tap Answer Call button'
    Mobile.tap(findTestObject('Phone App/Receive a call/android.widget.Button2 - ANSWER'), 0)

    Mobile.closeNotifications()

    'Mute'
    Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.ImageView2'), 0)

    'Keypad'
    Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.ImageView3'), 0)

    'Speaker'
    Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.ImageView4'), 0)

    'Add call'
    Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.ImageView5'), 0)

    'Hold'
    Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.ImageView6'), 0)

    Mobile.waitForElementPresent(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 3)

    Mobile.closeApplication()
} else {
    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.openNotifications()

    'Waiting for Answer Call button'
    Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.Button2 - ANSWER'), 300)

    'Tap Answer Call button'
    Mobile.tap(findTestObject('Phone App/Receive a call/android.widget.Button2 - ANSWER'), 0)

    Mobile.closeNotifications()

    'Mute'
    Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.ImageView2'), 0)

    'Keypad'
    Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.ImageView3'), 0)

    'Speaker'
    Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.ImageView4'), 0)

    'Add call'
    Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.ImageView5'), 0)

    'Hold'
    Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.ImageView6'), 0)

    Mobile.waitForElementPresent(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

    Mobile.closeApplication()
}

not_run: Mobile.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Turn on Mobile Data SIM 1 (O2 - UK)(TMO-US) IO 3D'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
            , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Automation: Place Call from SIM 2 (Both SIMs)', 
    'SIM 1 = O2-UK\nSIM 2 = EE', TestLinkAPIResults.TEST_PASSED)

