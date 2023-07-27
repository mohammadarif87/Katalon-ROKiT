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
import testlink.api.java.client.TestLinkAPIResults as TestLinkAPIResults
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete Messages'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Clear All Notifications'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('IO 3D/Messages/Send SMS to IO Pro SIM 1'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
            , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.pressHome()

    Mobile.openNotifications()

    'Messaging app Header'
    if (Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS (Both SIMs)/android.widget.TextView0 - Messages'), 
        0, FailureHandling.OPTIONAL)) {
        'Messages header'
        not_run: Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.TextView0 - Messages'), 
            3)

        'Messages header'
        Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS (Both SIMs)/android.widget.TextView0 - Messages'), 
            3)
    } else {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView0 - Search images  videos'), 
            3)
    }
    
    'Messages header'
    not_run: Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.TextView0 - Messages'), 
        3)

    not_run: Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView0 - Search images  videos'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.TextView9 - This is an automated test SMS'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.Button1 - MARK AS READ'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.Button2 - REPLY'), 
        3)

    Mobile.tap(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.TextView9 - This is an automated test SMS'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.TextView4 - Auto O2 Fav'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.TextView1 - This is an automated test SMS'), 
        3)
} else {
    Mobile.pressHome()

    Mobile.openNotifications()

    Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.TextView9 - This is an automated test SMS'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.Button1 - MARK AS READ'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.Button2 - REPLY'), 
        0)

    Mobile.tap(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.TextView9 - This is an automated test SMS'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.TextView4 - Auto O2 Fav'), 
        10)

    Mobile.verifyElementVisible(findTestObject('Messages/Receive SMS (from SIM 1 - O2-UK)/android.widget.TextView1 - This is an automated test SMS'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Receive SMS (Both SIMs)', '', TestLinkAPIResults.TEST_PASSED)

