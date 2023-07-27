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

Mobile.comment('Device must be flat (not on stand)')

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete Camera Photo and Video'), [('appPackage') : 'com.freeme.camera'
        , ('appActivity') : '.CameraActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete All Albums From Gallery'), [('appPackage') : 'com.freeme.gallery'
        , ('appActivity') : 'com.cooliris.media.Gallery', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Take Camera Photo'), [('appPackage') : 'com.freeme.camera', ('appActivity') : '.CameraActivity'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.TextView0 - Reminder'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.Button0 - Refuse'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.Button1 - Agree'), 0)

Mobile.tap(findTestObject('Apps/3D Gallery/android.widget.Button1 - Agree'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.TextView0 - Allow 3D Gallery to take pictures and record video'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.Button0 - DENY'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.Button1 - ALLOW'), 0)

Mobile.tap(findTestObject('Apps/3D Gallery/android.widget.Button1 - ALLOW'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.TextView0 - Allow 3D Gallery to access photos media and files on your device'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.Button0 - DENY'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.Button1 - ALLOW'), 0)

Mobile.tap(findTestObject('Apps/3D Gallery/android.widget.Button1 - ALLOW'), 0)

'Back button'
Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.Button0'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.Button1 - Start the journey of 3D'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.TextView0 - NO sunglasses'), 0)

'Back button'
Mobile.tap(findTestObject('Apps/3D Gallery/android.widget.Button0'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.TextView0 - Album'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.TextView1 - Time'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.TextView3 - Image'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.TextView4 - Video'), 0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.TextView0 - Image'), 0)

Mobile.tap(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.TextView0 - Image'), 0)

Mobile.switchToLandscape()

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.ImageView0'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Watch the 3D effect by turning the phone in landscape mode'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Watch the 3D effect by turning the phone in landscape mode'), 
        0)

    Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Watch the 3D effect by turning the phone in landscape mode'), 
        0)
}

Mobile.tapAtPosition(512, 512)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.TextView0 - Edit'), 0)

Mobile.tap(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.TextView0 - Edit'), 0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.ImageButton0'), 0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.RadioButton0 - 43'), 0)

Mobile.tap(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.RadioButton0 - 43'), 0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.Button0 - Complete'), 0)

Mobile.tap(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.Button0 - Complete'), 0)

Mobile.swipe(870, 1050, 100, 1050)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(512, 512)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.TextView0 - Edit (1)'), 0)

Mobile.tap(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.TextView0 - Edit (1)'), 0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.ImageButton0 (1)'), 0)

Mobile.tap(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.ImageButton0 (1)'), 0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.TextView0 - nostalgia'), 0)

Mobile.tap(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.TextView0 - nostalgia'), 0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.TextView0 - anaglyph'), 0)

Mobile.tap(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.TextView0 - anaglyph'), 0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.TextView0 - pixel'), 0)

Mobile.tap(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.TextView0 - pixel'), 0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.TextView0 - gray'), 0)

Mobile.tap(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.TextView0 - gray'), 0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.TextView0 - sketch'), 0)

Mobile.tap(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.TextView0 - sketch'), 0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.Button0 - Complete (1)'), 0)

Mobile.tap(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.Button0 - Complete (1)'), 0)

Mobile.swipe(870, 1050, 100, 1050)

Mobile.pressBack()

'Original Image'
Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.ImageView4'), 0)

'Edited Image 1'
Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.ImageView5'), 0)

'Edited Image 2'
Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.ImageView6'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Gallery edit', '', TestLinkAPIResults.TEST_PASSED)

