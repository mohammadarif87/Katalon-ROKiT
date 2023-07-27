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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete Camera Photo and Video'), [('appPackage') : 'com.freeme.camera'
        , ('appActivity') : '.CameraActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    'Flash button'
    Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageButton0'), 0)

    'Beauty Mode button'
    Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView0'), 0)

    'Switch Camera button'
    Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageButton1'), 0)

    'Gallery button'
    Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView1'), 0)

    'Shutter button'
    Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView3'), 0)

    'Video Mode button'
    Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView4'), 0)

    Mobile.swipe(900, 512, 300, 512)

    not_run: Mobile.verifyElementVisible(findTestObject('Camera Location/android.widget.TextView4 - Save location'), 0)

    Mobile.verifyElementVisible(findTestObject('Camera/Camera Location/android.widget.TextView0 - Location Tag'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Camera Location/android.widget.Switch0 - OFF'), 0, FailureHandling.OPTIONAL)) {
        not_run: Mobile.tap(findTestObject('Camera Location/android.widget.TextView4 - Save location'), 0)

        Mobile.tap(findTestObject('Camera/Camera Location/android.widget.TextView0 - Location Tag'), 0)

        if (Mobile.verifyElementVisible(findTestObject('Camera Location/android.widget.TextView0 - Allow Camera to access this devices location'), 
            0, FailureHandling.OPTIONAL)) {
            Mobile.verifyElementVisible(findTestObject('Camera Location/android.widget.Button0 - DENY'), 0)

            Mobile.verifyElementVisible(findTestObject('Camera Location/android.widget.Button1 - ALLOW'), 0)

            Mobile.tap(findTestObject('Camera Location/android.widget.Button1 - ALLOW'), 0)
        } else {
            Mobile.verifyElementVisible(findTestObject('Camera Location/android.widget.Switch0 - ON'), 0)
        }
    }
    
    Mobile.swipe(200, 512, 900, 512)

    'Shutter button'
    Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView3'), 0)

    'Shutter button'
    Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageView3'), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    'View Pictures'
    Mobile.verifyElementVisible(findTestObject('Camera Location/android.widget.ImageView1'), 0)

    'View Pictures'
    Mobile.tap(findTestObject('Camera Location/android.widget.ImageView1'), 0)

    'Info button'
    Mobile.verifyElementVisible(findTestObject('Camera Location/android.widget.TextView1'), 3)

    'Info button'
    Mobile.tap(findTestObject('Camera Location/android.widget.TextView1'), 0)

    Mobile.comment('ADD LOCATION HERE')

    if (Mobile.verifyElementVisible(findTestObject('Camera/Camera Location/android.widget.TextView0 - Location Pacific Coast Highway Los Angeles California United States'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Camera/Camera Location/android.widget.TextView0 - Location Pacific Coast Highway Los Angeles California United States'), 
            3)
    } else if (true) {
        'Same latitude and longitude but different location tag'
        Mobile.verifyElementVisible(findTestObject('Camera/Camera Location/android.widget.TextView0 - Location Porto Marina Way Castellammare Drive Los Angeles California United States'), 
            3)
    } else {
    }
} else {
    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    'Flash button'
    Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageButton0'), 0)

    'Beauty Mode button'
    Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView0'), 0)

    'Switch Camera button'
    Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageButton1'), 0)

    'Gallery button'
    Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView1'), 0)

    'Shutter button'
    Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView3'), 0)

    'Video Mode button'
    Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView4'), 0)

    Mobile.swipe(900, 512, 300, 512)

    Mobile.verifyElementVisible(findTestObject('Camera Location/android.widget.TextView4 - Save location'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Camera Location/android.widget.Switch0 - OFF'), 0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Camera Location/android.widget.TextView4 - Save location'), 0)

        if (Mobile.verifyElementVisible(findTestObject('Camera Location/android.widget.TextView0 - Allow Camera to access this devices location'), 
            0, FailureHandling.OPTIONAL)) {
            Mobile.verifyElementVisible(findTestObject('Camera Location/android.widget.Button0 - DENY'), 0)

            Mobile.verifyElementVisible(findTestObject('Camera Location/android.widget.Button1 - ALLOW'), 0)

            Mobile.tap(findTestObject('Camera Location/android.widget.Button1 - ALLOW'), 0)
        } else {
            Mobile.verifyElementVisible(findTestObject('Camera Location/android.widget.Switch0 - ON'), 0)
        }
    }
    
    Mobile.swipe(200, 512, 900, 512)

    'Shutter button'
    Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView3'), 0)

    'Shutter button'
    Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageView3'), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    'View Pictures'
    Mobile.verifyElementVisible(findTestObject('Camera Location/android.widget.ImageView1'), 0)

    'View Pictures'
    Mobile.tap(findTestObject('Camera Location/android.widget.ImageView1'), 0)

    'Info button'
    Mobile.verifyElementVisible(findTestObject('Camera Location/android.widget.TextView1'), 0)

    'Info button'
    Mobile.tap(findTestObject('Camera Location/android.widget.TextView1'), 0)

    Mobile.comment('ADD LOCATION HERE')
}

Mobile.closeApplication()

