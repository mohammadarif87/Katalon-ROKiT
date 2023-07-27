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

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Set SMS to SIM 1 (O2-UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete Messages'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Send SMS to IO 3D SIM 1'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Send SMS to IO 3D SIM 2'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    not_run: Mobile.waitForElementPresent(findTestObject('Messages/Delete individual Thread/android.widget.TextView0 - Search images  videos'), 
        3)

    not_run: Mobile.verifyElementVisible(findTestObject('Messages/Delete individual Thread/android.widget.TextView0 - Search images  videos'), 
        3)

    if (Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView0 - Messages just got better'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView3 - Use Messages without chat features'), 
            0)

        Mobile.tap(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView3 - Use Messages without chat features'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - New Spam protection'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.Button2 - OK'), 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.TextView0 - Messages'), 
        0, FailureHandling.OPTIONAL)) {
        'Messages header'
        Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.TextView0 - Messages'), 
            3)
    } else if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView0 - Search'), 
        3, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView0 - Search'), 3)
    } else {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView0 - Search images and videos'), 
            3)
    }
} else {
    if (Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView0 - Messages just got better'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView3 - Use Messages without chat features'), 
            0)

        Mobile.tap(findTestObject('Messages/Send SMS to Contact (SIM 1 - O2-UK)/android.widget.TextView3 - Use Messages without chat features'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - New Spam protection'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.Button2 - OK'), 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.TextView0 - Messages'), 
        0, FailureHandling.OPTIONAL)) {
        'Messages header'
        Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.TextView0 - Messages'), 
            3)
    } else if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView0 - Search'), 
        3, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView0 - Search'), 3)
    } else {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView0 - Search images and videos'), 
            3)
    }
}

'Three dots'
Mobile.verifyElementVisible(findTestObject('Messages/Delete Multiple Threads/android.widget.ImageView0'), 3)

'Start chat button'
Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.Button0 - Start chat'), 3)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'1st SMS'
Mobile.tapAndHold(findTestObject('Preconditions/Delete Messages/android.widget.FrameLayout4'), 1, 0)

'Cancel selection button'
Mobile.verifyElementVisible(findTestObject('Messages/Delete Multiple Threads/android.widget.ImageButton0'), 3)

'Archive button'
Mobile.verifyElementVisible(findTestObject('Messages/Delete Multiple Threads/android.widget.TextView7'), 3)

'Delete button'
Mobile.verifyElementVisible(findTestObject('Messages/Delete Multiple Threads/android.widget.TextView8'), 3)

'2nd SMS'
Mobile.tapAndHold(findTestObject('Messages/Delete Multiple Threads/android.widget.FrameLayout6'), 1, 0)

'Delete button'
Mobile.tap(findTestObject('Messages/Delete Multiple Threads/android.widget.TextView8 (2)'), 3)

Mobile.verifyElementVisible(findTestObject('Messages/Delete Multiple Threads/android.widget.TextView0 - Delete 2 conversations'), 
    3)

Mobile.verifyElementVisible(findTestObject('Messages/Delete Multiple Threads/android.widget.TextView1 - This action cannot be undone.'), 
    3)

Mobile.verifyElementVisible(findTestObject('Messages/Delete Multiple Threads/android.widget.Button0 - Cancel'), 3)

Mobile.tap(findTestObject('Messages/Delete Multiple Threads/android.widget.Button1 - Delete'), 3)

'1st SMS'
Mobile.verifyElementNotVisible(findTestObject('Preconditions/Delete Messages/android.widget.FrameLayout4'), 3, FailureHandling.STOP_ON_FAILURE)

'2nd SMS'
Mobile.verifyElementNotVisible(findTestObject('Messages/Delete Multiple Threads/android.widget.FrameLayout6'), 3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Delete Multiple Threads', '', TestLinkAPIResults.TEST_PASSED)

