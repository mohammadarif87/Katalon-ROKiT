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

Mobile.callTestCase(findTestCase('IO Pro/Camera/Delete Camera Photo and Video'), [('appPackage') : 'com.freeme.camera', ('appActivity') : '.CameraActivity'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

'Swipe in Settings'
device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startX = device_Width * 0.85 //starts from left of the screen

int endX = device_Width * 0.5 //end towards the right of the screen

int startY = device_Height / 2

int endY = startY

'Video Mode button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView4'), 0)

'Video Mode button'
Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageView4'), 0)

Mobile.swipe(startX, startY, endX, endY)

Mobile.verifyElementVisible(findTestObject('Camera/Camera Settings/android.widget.TextView0 - Settings'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/Camera Settings/android.widget.TextView1 - General'), 0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Camera/Camera Settings/android.widget.TextView0 - Resolution'), 0)
} else {
    Mobile.verifyElementVisible(findTestObject('Camera/Camera Settings/android.widget.TextView2 - Resolution  quality'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera Video Resolution/android.widget.TextView3 - HD 1080p'), 0)

startX = (device_Width * 0.5 //starts from right of the screen
)

endX = (device_Width * 0.85 //end towards the left of the screen
)

Mobile.swipe(startX, startY, endX, endY)

'Shutter button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView3'), 0)

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

'Info button'
Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera Resolution/android.widget.TextView1'), 0)

'Info button'
Mobile.tap(findTestObject('Camera/Rear Camera Resolution/android.widget.TextView1'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera Resolution/android.widget.TextView0 - Details'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera Video Resolution/android.widget.TextView3 - Width 1920'), 
    0)

Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera Video Resolution/android.widget.TextView4 - Height 1080'), 
    0)

Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera Resolution/android.widget.Button0 - CLOSE'), 0)

Mobile.tap(findTestObject('Camera/Rear Camera Resolution/android.widget.Button0 - CLOSE'), 0)

Mobile.comment('Delete the video taken via Camera app')

'Delete button'
Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera Resolution/android.widget.ImageView2'), 0)

'Delete button'
Mobile.tap(findTestObject('Camera/Rear Camera Resolution/android.widget.ImageView2'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera Resolution/android.widget.TextView0 - Delete selected item'), 
    0)

Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera Resolution/android.widget.Button0 - CANCEL'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera Resolution/android.widget.Button1 - OK'), 0)

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

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Automation: Rear Video Resolution (1080p)', 
    '', TestLinkAPIResults.TEST_PASSED)

