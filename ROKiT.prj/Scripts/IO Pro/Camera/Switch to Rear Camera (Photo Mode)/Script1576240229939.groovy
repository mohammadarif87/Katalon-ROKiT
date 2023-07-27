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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

'Swipe in Settings'
device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startX = device_Width * 0.5 //starts from left of the screen

int endX = device_Width * 0.85 //end towards the right of the screen

int startY = device_Height / 2

int endY = startY

'Flash button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageButton0'), 3)

'Beauty Mode button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView0'), 0)

'Switch Camera button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageButton1'), 0)

'Gallery button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView1'), 0)

'Shutter button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView3'), 3)

'Video Mode button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView4'), 0)

'Switch Camera button'
Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageButton1'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

startX = (device_Width * 0.5 //starts from left of the screen
)

endX = (device_Width * 0.85 //end towards the right of the screen
)

Mobile.swipe(startX, startY, endX, endY)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Camera/android.widget.TextView0 - Capture Mode'), 3)

Mobile.verifyElementVisible(findTestObject('Camera/android.widget.TextView1 - Normal'), 0)

Mobile.verifyElementNotVisible(findTestObject('Camera/android.widget.TextView2 - Panorama'), 0)

Mobile.verifyElementNotVisible(findTestObject('Camera/android.widget.TextView3 - HDR'), 4)

Mobile.verifyElementNotVisible(findTestObject('Camera/android.widget.TextView4 - Night'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/android.widget.TextView5 - Beauty'), 0)

Mobile.verifyElementNotVisible(findTestObject('Camera/android.widget.TextView6 - SLR'), 0)

Mobile.verifyElementNotVisible(findTestObject('Camera/android.widget.TextView7 - Super Night'), 0)

Mobile.verifyElementNotVisible(findTestObject('Camera/android.widget.TextView8 - Pose'), 4)

Mobile.verifyElementVisible(findTestObject('Camera/android.widget.TextView9 - Child'), 0)

Mobile.verifyElementNotVisible(findTestObject('Camera/android.widget.TextView10 - FilmMode'), 0)

Mobile.verifyElementNotVisible(findTestObject('Camera/android.widget.TextView11 - QRCodeScanMode'), 0)

startX = (device_Width * 0.85 //starts from left of the screen
)

endX = (device_Width * 0.5 //end towards the right of the screen
)

Mobile.swipe(startX, startY, endX, endY)

'Switch Camera button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageButton1'), 3)

'Switch Camera button'
Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageButton1'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

startX = (device_Width * 0.5 //starts from left of the screen
)

endX = (device_Width * 0.85 //end towards the right of the screen
)

Mobile.swipe(startX, startY, endX, endY)

Mobile.verifyElementVisible(findTestObject('Camera/android.widget.TextView0 - Capture Mode'), 3)

Mobile.verifyElementVisible(findTestObject('Camera/android.widget.TextView1 - Normal'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/android.widget.TextView2 - Panorama'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/android.widget.TextView3 - HDR'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/android.widget.TextView4 - Night'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/android.widget.TextView5 - Beauty'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/android.widget.TextView6 - SLR'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/android.widget.TextView7 - Super Night'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/android.widget.TextView8 - Pose'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/android.widget.TextView9 - Child'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/android.widget.TextView10 - FilmMode'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/android.widget.TextView11 - QRCodeScanMode'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Switch to Rear Camera (Photo Mode)', '', 
    TestLinkAPIResults.TEST_PASSED)

