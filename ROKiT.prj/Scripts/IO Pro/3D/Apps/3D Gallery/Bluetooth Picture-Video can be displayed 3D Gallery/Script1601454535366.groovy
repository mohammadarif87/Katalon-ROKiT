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

'IO Pro'
WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Clear All Notifications'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

'IO 3D'
WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Clear All Notifications'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
            , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete All Albums From Gallery'), [('appPackage') : 'com.freeme.gallery'
        , ('appActivity') : 'com.cooliris.media.Gallery', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO 3D/Gallery/Send Camera Video via Bluetooth'), [('appPackage') : 'com.mediatek.camera'
        , ('appActivity') : '.CameraActivity', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
            , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.TextView0 - Reminder'), 3)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/3D Gallery Version/android.widget.Button0 - Cancel'), 3)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/3D Gallery Version/android.widget.Button1 - Accept'), 3)

Mobile.tap(findTestObject('3D/Apps/3D Gallery/3D Gallery Version/android.widget.Button1 - Accept'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.TextView0 - Allow 3D Gallery to take pictures and record video'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.Button0 - DENY'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.Button1 - ALLOW'), 3)

Mobile.tap(findTestObject('Apps/3D Gallery/android.widget.Button1 - ALLOW'), 0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/3D Gallery Version/android.widget.TextView0 - Allow 3D Gallery to access photos media and files on your device'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.TextView0 - Allow 3D Gallery to access photos media and files on your device'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.Button0 - DENY'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.Button1 - ALLOW'), 0)

Mobile.tap(findTestObject('Apps/3D Gallery/android.widget.Button1 - ALLOW'), 0)

'Back button'
Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.Button0'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.Button1 - Start the journey of 3D'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.TextView0 - NO sunglasses'), 3)

'Back button'
Mobile.tap(findTestObject('Apps/3D Gallery/android.widget.Button0'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.TextView0 - Album'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.TextView1 - Time'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.TextView3 - Image'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.TextView4 - Video'), 0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Gallery edit/android.widget.TextView0 - Image'), 3)

Mobile.tap(findTestObject('Apps/3D Gallery/android.widget.TextView4 - Video'), 0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Bluetooth Picture-Video can be displayed/android.widget.TextView0 - Today'), 
    3)

'The video received from Bluetooth'
Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Bluetooth Picture-Video can be displayed/android.widget.RelativeLayout7'), 
    3)

'The video received from Bluetooth'
Mobile.tap(findTestObject('3D/Apps/3D Gallery/Bluetooth Picture-Video can be displayed/android.widget.RelativeLayout7'), 
    0)

if (Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Bluetooth Picture-Video can be displayed/android.widget.TextView0 - Watch the 3D effect by turning the phone in landscape mode'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Bluetooth Picture-Video can be displayed/android.widget.TextView0 - Watch the 3D effect by turning the phone in landscape mode'), 
        3)

    Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Bluetooth Picture-Video can be displayed/android.widget.TextView0 - No prompt'), 
        3)

    'Check box'
    Mobile.tap(findTestObject('3D/Apps/3D Gallery/Bluetooth Picture-Video can be displayed/android.widget.ImageView0'), 
        0)

    not_run: Mobile.tap(findTestObject('3D/Apps/3D Gallery/Bluetooth Picture-Video can be displayed/android.widget.TextView0 - No prompt'), 
        3)

    'Tap on screen to close popup'
    Mobile.tapAtPosition(450, 450)
}

if (Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Bluetooth Picture-Video can be displayed/android.widget.Button0 - UNDERSTOOD'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('3D/Apps/3D Gallery/Bluetooth Picture-Video can be displayed/android.widget.Button0 - UNDERSTOOD'), 
        0)
}

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Video Timer'
Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Bluetooth Picture-Video can be displayed/android.widget.TextView0 - 000000'), 
    3)

'Info button'
Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Bluetooth Picture-Video can be displayed/android.widget.ImageView1'), 
    0)

'Info button'
Mobile.tap(findTestObject('3D/Apps/3D Gallery/Bluetooth Picture-Video can be displayed/android.widget.ImageView1'), 0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Bluetooth Picture-Video can be displayed/android.widget.TextView0 - Details'), 
    3)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Bluetooth Picture-Video can be displayed/android.widget.TextView1 - Name'), 
    0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Bluetooth Picture-Video can be displayed/android.widget.TextView3 - Time'), 
    3)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Bluetooth Picture-Video can be displayed/android.widget.TextView5 - Dimension'), 
    0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Bluetooth Picture-Video can be displayed/android.widget.TextView7 - Size'), 
    3)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Bluetooth Picture-Video can be displayed/android.widget.TextView9 - Duration'), 
    0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Bluetooth Picture-Video can be displayed/android.widget.TextView11 - Path'), 
    3)

'Path contains bluetooth'
Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Bluetooth Picture-Video can be displayed/android.widget.TextView12 - bluetooth'), 
    3)

'Back button'
Mobile.tap(findTestObject('3D/Apps/3D Gallery/Bluetooth Picture-Video can be displayed/android.widget.ImageButton0'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Bluetooth picture/video can be displayed 3D Gallery', 
    '', TestLinkAPIResults.TEST_PASSED)

