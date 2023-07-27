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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete All Albums From Gallery'), [('appPackage') : 'com.freeme.gallery'
        , ('appActivity') : 'com.cooliris.media.Gallery', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Apps/Gallery/android.widget.Button1 - ALLOW'), 0)

Mobile.tap(findTestObject('Apps/Gallery/android.widget.Button1 - ALLOW'), 0)

'Tap "shoot immediately" button to open camera'
Mobile.tapAtPosition(540, 1100)

'Shutter button'
Mobile.verifyElementVisible(findTestObject('Gallery/View Images/android.widget.ImageView3'), 0)

Mobile.tap(findTestObject('Gallery/View Images/android.widget.ImageView3'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Shutter button'
Mobile.tap(findTestObject('Gallery/View Images/android.widget.ImageView3'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Gallery/Selection/android.widget.TextView0 - PHOTOS'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Gallery/Selection/android.widget.TextView0 - ALBUMS'), 
    0)

Mobile.tap(findTestObject('Apps/Extra Apps and Content/Gallery/Selection/android.widget.TextView0 - ALBUMS'), 0)

'Tap and hold to select folder'
Mobile.tapAndHoldAtPosition(270, 430, 1)

Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Gallery/Selection/android.widget.TextView0 - 1 selected'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Gallery/Selection/android.widget.RadioButton0 - Deselect all'), 
    0)

Mobile.tap(findTestObject('Apps/Extra Apps and Content/Gallery/Selection/android.widget.RadioButton0 - Deselect all'), 0)

Mobile.pressBack()

Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Gallery/Selection/android.widget.TextView0 - PHOTOS (1)'), 
    0)

Mobile.tap(findTestObject('Apps/Extra Apps and Content/Gallery/Selection/android.widget.TextView0 - PHOTOS (1)'), 0)

'Tap and hold to select photos'
Mobile.tapAndHoldAtPosition(120, 500, 1)

Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Gallery/Selection/android.widget.RadioButton0 - Select all'), 
    0)

Mobile.tap(findTestObject('Apps/Extra Apps and Content/Gallery/Selection/android.widget.RadioButton0 - Select all'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Gallery/Selection/android.widget.TextView0 - 2 selected'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Gallery/Selection/android.widget.RadioButton0 - Delete'), 
    0)

Mobile.tap(findTestObject('Apps/Extra Apps and Content/Gallery/Selection/android.widget.RadioButton0 - Delete'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Gallery/Selection/android.widget.Button0 - OK'), 
    0)

Mobile.tap(findTestObject('Apps/Extra Apps and Content/Gallery/Selection/android.widget.Button0 - OK'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Selection', '', TestLinkAPIResults.TEST_PASSED)

