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

    Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera Video Resolution/android.widget.TextView3 - HD 1080p'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Camera/Camera Settings/android.widget.TextView0 - Location Tag'), 0)
} else {
    Mobile.verifyElementVisible(findTestObject('Camera/Camera Settings/android.widget.TextView2 - Resolution  quality'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera Video Resolution/android.widget.TextView3 - HD 1080p'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Camera/Camera Settings/android.widget.TextView4 - Save location'), 0)
}

Mobile.verifyElementVisible(findTestObject('Camera/Camera Settings/android.widget.TextView5 - Exit after 2 minutes without action'), 
    0)

Mobile.verifyElementVisible(findTestObject('Camera/Camera Settings/android.widget.TextView6 - About camera'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/Camera Settings/android.widget.TextView7 - Capture'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/Camera Settings/android.widget.TextView8 - Use Volume Buttons to take pictures'), 
    0)

Mobile.verifyElementNotVisible(findTestObject('Camera/Camera Settings/android.widget.TextView9 - Touch to capture'), 0)

Mobile.verifyElementNotVisible(findTestObject('Camera/Camera Settings/android.widget.TextView10 - Panorama mode is not supported'), 
    0)

Mobile.verifyElementNotVisible(findTestObject('Camera/Camera Settings/android.widget.TextView11 - Face Recognition'), 0)

Mobile.verifyElementNotVisible(findTestObject('Camera/Camera Settings/android.widget.TextView12 - Front mirror'), 0)

Mobile.verifyElementNotVisible(findTestObject('Camera/Camera Settings/android.widget.TextView13 - Funny face or Portrait no support'), 
    0)

Mobile.verifyElementVisible(findTestObject('Camera/Camera Settings/android.widget.TextView8 - Grid'), 0)

Mobile.verifyElementNotVisible(findTestObject('Camera/Camera Settings/android.widget.TextView9 - ZSD'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/Camera Settings/android.widget.TextView10 - Shutter sound'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/Camera Settings/android.widget.TextView11 - Focus sound'), 0)

Mobile.verifyElementNotVisible(findTestObject('Camera/Camera Settings/android.widget.TextView12 - Countdown Capture'), 0)

Mobile.verifyElementVisible(findTestObject('Camera/Camera Settings/android.widget.TextView14 - Restore Defaults'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Automation: Camera Video Options Settings', 
    '', TestLinkAPIResults.TEST_PASSED)

