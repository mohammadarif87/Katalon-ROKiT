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

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete Camera Photo and Video'), [('appPackage') : 'com.freeme.camera'
        , ('appActivity') : '.CameraActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

'Video Mode button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView4'), 0)

'Video Mode button'
Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageView4'), 0)

'Switch Camera button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageButton1'), 0)

'Switch Camera button'
Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageButton1'), 0)

'Shutter button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView3'), 0)

'Shutter button - start recording'
Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageView3'), 0)

Mobile.delay(6, FailureHandling.STOP_ON_FAILURE)

'Shutter button - stop recording'
Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageView3'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Shutter button - start recording'
Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageView3'), 0)

Mobile.delay(6, FailureHandling.STOP_ON_FAILURE)

'Shutter button - stop recording'
Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageView3'), 0)

'Gallery button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView1'), 0)

'Gallery button'
Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageView1'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'1/2'
Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera View Video/android.widget.TextView0 - 12'), 0)

Mobile.swipe(900, 512, 200, 512)

'2/2'
Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera View Video/android.widget.TextView0 - 22'), 0)

'Info button'
Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera Resolution/android.widget.TextView1'), 0)

'Info button'
Mobile.tap(findTestObject('Camera/Rear Camera Resolution/android.widget.TextView1'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera Resolution/android.widget.TextView0 - Details'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera Resolution/android.widget.Button0 - CLOSE'), 0)

Mobile.tap(findTestObject('Camera/Rear Camera Resolution/android.widget.Button0 - CLOSE'), 0)

'Play button'
Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera View Video/android.widget.ImageView1'), 0)

'Play button'
Mobile.tap(findTestObject('Camera/Rear Camera View Video/android.widget.ImageView1'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/Front Camera View and Delete Video/android.widget.Button0 - JUST ONCE'), 
    0)

Mobile.verifyElementVisible(findTestObject('Camera/Front Camera View and Delete Video/android.widget.Button1 - ALWAYS'), 
    0)

if (Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera View and Delete Video/android.widget.TextView0 - Open with'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera View and Delete Video/android.widget.TextView0 - Open with'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera View and Delete Video/android.widget.Button0 - JUST ONCE'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera View and Delete Video/android.widget.Button0 - ALWAYS'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera View and Delete Video/android.widget.TextView0 - 3D Gallery'), 
        0)
} else if (Mobile.verifyElementVisible(findTestObject('Camera/Front Camera View and Delete Video/android.widget.TextView0 - Open with Photos'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Camera/Front Camera View and Delete Video/android.widget.TextView0 - Open with Photos'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Camera/Front Camera View and Delete Video/android.widget.TextView2 - 3D Gallery'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera View and Delete Video/android.widget.TextView0 - Open with 3D Gallery'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera View and Delete Video/android.widget.TextView2 - Photos'), 
        0)
}

Mobile.pressBack()

Mobile.comment('Delete the picture taken via Camera app')

'Delete button'
Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera Resolution/android.widget.ImageView2'), 0)

'Delete button'
Mobile.tap(findTestObject('Camera/Rear Camera Resolution/android.widget.ImageView2'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera Resolution/android.widget.TextView0 - Delete selected item'), 
    0)

Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera Resolution/android.widget.Button0 - CANCEL'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera Resolution/android.widget.Button1 - OK'), 0)

Mobile.tap(findTestObject('Camera/Rear Camera Resolution/android.widget.Button1 - OK'), 0)

'1/1'
Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera View Video/android.widget.TextView0 - 11'), 0)

'Delete button'
Mobile.tap(findTestObject('Camera/Rear Camera Resolution/android.widget.ImageView2'), 0)

Mobile.tap(findTestObject('Camera/Rear Camera Resolution/android.widget.Button1 - OK'), 0)

'Switch Camera button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageButton1'), 0)

'Gallery button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView1'), 0)

'Shutter button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView3'), 0)

'Video Mode button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView4'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Front Video View Photos/Videos', '', TestLinkAPIResults.TEST_PASSED)

