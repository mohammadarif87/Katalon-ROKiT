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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete All Albums From Gallery'), [('appPackage') : 'com.freeme.gallery'
        , ('appActivity') : 'com.cooliris.media.Gallery', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'1 second'
Mobile.tapAndHold(findTestObject('Camera/Camera Functionality/Burst Shot Mode/android.widget.ImageView0'), 0.7, 1)

'Preview '
Mobile.verifyElementVisible(findTestObject('Camera/Camera Functionality/Burst Shot Mode/android.widget.ImageView0 (1)'), 
    3)

Mobile.tap(findTestObject('Camera/Camera Functionality/Burst Shot Mode/android.widget.ImageView0 (1)'), 3)

if (Mobile.verifyElementVisible(findTestObject('Camera/Camera Functionality/Burst Shot Mode/android.widget.TextView0 - 17'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Camera/Camera Functionality/Burst Shot Mode/android.widget.TextView0 - 17'), 
        3)
} else if (Mobile.verifyElementVisible(findTestObject('Camera/Camera Functionality/Burst Shot Mode/android.widget.TextView0 - 18'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Camera/Camera Functionality/Burst Shot Mode/android.widget.TextView0 - 18'), 
        3)
} else if (Mobile.verifyElementVisible(findTestObject('Camera/Camera Functionality/Burst Shot Mode/android.widget.TextView0 - 19'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Camera/Camera Functionality/Burst Shot Mode/android.widget.TextView0 - 19'), 
        3)
} else if (Mobile.verifyElementVisible(findTestObject('Camera/Camera Functionality/Burst Shot Mode/android.widget.TextView0 - 110'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Camera/Camera Functionality/Burst Shot Mode/android.widget.TextView0 - 110'), 
        3)
} else if (Mobile.verifyElementVisible(findTestObject('Camera/Camera Functionality/Burst Shot Mode/android.widget.TextView0 - 111'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Camera/Camera Functionality/Burst Shot Mode/android.widget.TextView0 - 111'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Camera/Camera Functionality/Burst Shot Mode/android.widget.TextView0 - 112'), 
        3)
}

'Open Gallery Icon'
Mobile.verifyElementVisible(findTestObject('Camera/Camera Functionality/Burst Shot Mode/android.widget.TextView0'), 3)

Mobile.tap(findTestObject('Camera/Camera Functionality/Burst Shot Mode/android.widget.TextView0'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Burst shot Mode', '', TestLinkAPIResults.TEST_PASSED)

