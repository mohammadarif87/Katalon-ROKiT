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

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete All Albums From Gallery'), [('appPackage') : 'com.freeme.gallery'
        , ('appActivity') : 'com.cooliris.media.Gallery', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(200, 512, 900, 512)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Camera/Camera SLR Mode Edit/android.widget.TextView6 - SLR'), 5)

'SLR button'
Mobile.tapAtPosition(900, 800)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Camera/Camera SLR Mode Edit/android.widget.TextView0 - Close SLR'), 5)

'Shutter button'
Mobile.verifyElementVisible(findTestObject('Camera/Camera SLR Mode Edit/android.widget.ImageView3'), 3)

'Shutter button'
Mobile.tap(findTestObject('Camera/Camera SLR Mode Edit/android.widget.ImageView3'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

'Gallery in Camera icon'
Mobile.verifyElementVisible(findTestObject('Camera/Camera SLR Mode Edit/android.widget.ImageView2'), 3)

'Gallery in Camera icon'
Mobile.tap(findTestObject('Camera/Camera SLR Mode Edit/android.widget.ImageView2'), 0)

'Share button'
Mobile.verifyElementVisible(findTestObject('Camera/Camera SLR Mode Edit/android.widget.ImageView1'), 3)

'Delete button'
Mobile.verifyElementVisible(findTestObject('Camera/Camera SLR Mode Edit/android.widget.ImageView2 (1)'), 3)

'View in Gallery icon'
Mobile.verifyElementVisible(findTestObject('Camera/Camera SLR Mode Edit/android.widget.TextView2'), 0)

'View in Gallery icon'
Mobile.tap(findTestObject('Camera/Camera SLR Mode Edit/android.widget.TextView2'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/Camera SLR Mode Edit/android.widget.TextView0 - PHOTOS'), 10)

Mobile.tapAtPosition(160, 500)

Mobile.verifyElementVisible(findTestObject('Camera/Camera SLR Mode Edit/android.widget.RadioButton0 - Edit'), 3)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(512, 512)

'Aperature button'
Mobile.tap(findTestObject('Camera/Camera SLR Mode Edit/android.widget.ImageView2 (2)'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/Camera SLR Mode Edit/android.widget.TextView1 - F0.0'), 3)

Mobile.tapAtPosition(1015, 1930)

Mobile.verifyElementVisible(findTestObject('Camera/Camera SLR Mode Edit/android.widget.TextView1 - F1.2'), 3)

'Save button'
Mobile.tap(findTestObject('Camera/Camera SLR Mode Edit/android.widget.ImageView1 (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'Back button'
Mobile.tap(findTestObject('Camera/Camera SLR Mode Edit/android.widget.ImageView0'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Back button'
Mobile.tap(findTestObject('Camera/Camera SLR Mode Edit/android.widget.ImageView0 (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(160, 500)

Mobile.verifyElementVisible(findTestObject('Camera/Camera SLR Mode Edit/android.widget.RadioButton0 - Edit'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(512, 512)

'Aperature button'
Mobile.tap(findTestObject('Camera/Camera SLR Mode Edit/android.widget.ImageView2 (2)'), 0)

Mobile.verifyElementNotVisible(findTestObject('Camera/Camera SLR Mode Edit/android.widget.TextView1 - F0.0'), 3)

Mobile.verifyElementVisible(findTestObject('Camera/Camera SLR Mode Edit/android.widget.TextView1 - F1.2'), 3)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Camera SLR Mode Edit', '', TestLinkAPIResults.TEST_PASSED)

