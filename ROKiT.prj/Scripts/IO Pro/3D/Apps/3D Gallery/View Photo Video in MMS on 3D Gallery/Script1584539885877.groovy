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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Set SMS to SIM 1 (O2-UK)(TMO-US)'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

'IO Pro'
WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete Messages'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete Camera Photo and Video'), [('appPackage') : 'com.freeme.camera'
        , ('appActivity') : '.CameraActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete All Albums From Gallery'), [('appPackage') : 'com.freeme.gallery'
        , ('appActivity') : 'com.cooliris.media.Gallery', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - New Spam protection'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.Button2 - OK'), 0)
}

if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView0 - Messages just got better'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - Use Messages without chat features'), 
        0)
}

if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0)

    Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Use Messages without chat features (1)'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Use Messages without chat features (1)'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.Button0 - Start chat'), 0)

Mobile.tap(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.Button0 - Start chat'), 0)

Mobile.hideKeyboard()

Mobile.verifyElementVisible(findTestObject('Messages/Call Contact via Messages/android.widget.TextView5 - Auto O2 Fav'), 
    0)

Mobile.tap(findTestObject('Messages/Call Contact via Messages/android.widget.TextView5 - Auto O2 Fav'), 0)

'View Gallery in Messages'
Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.ImageView1'), 0)

Mobile.tap(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.ImageView1'), 0)

'Capture picture button'
Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.ImageView8'), 0)

'Full screen mode button'
Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.ImageView7'), 
    0)

'Full screen mode button'
Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.ImageView7'), 0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Photo'), 
    0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView1 - Video'), 
    0)

Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView1 - Video'), 
    0)

'Record Button'
Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.ImageView7 (1)'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

'Stop Record Button'
Mobile.tapAtPosition(550, 1780)

'Stop Record Button'
not_run: Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.ImageButton0'), 
    0)

'Save to device icon'
Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.ImageView2'), 
    30)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.TextView0 - Attach'), 30)

    Mobile.tap(findTestObject('Apps/3D Gallery/android.widget.TextView0 - Attach'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    'Picture thumbnail in the message'
    Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.LinearLayout5'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.TextView2 - MMS'), 
        0, FailureHandling.OPTIONAL)) {
        'SMS has changed to MMS'
        Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.TextView2 - MMS'), 
            0)

        'SMS has changed to MMS'
        Mobile.tap(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.TextView2 - MMS'), 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.ImageView0 (2)'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.ImageView0 (2)'), 
            0)

        Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.ImageView0 (2)'), 
            0)
    }
    
    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Sending'), 
        30)

    Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 -   via T-Mobile'), 
        0)

    'Video in the Message'
    Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.ImageView0'), 
        0)

    Mobile.pressHome()

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(512, 1700, 512, 200)

    Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView1 - 3D Gallery'), 
        0)

    Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView1 - 3D Gallery'), 
        0)

    if (Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Reminder'), 
        0, FailureHandling.OPTIONAL)) {
        'Reminder\r\n'
        Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Reminder'), 
            3)

        Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.Button1 - Accept'), 
            0)

        if (Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.TextView0 - Allow 3D Gallery to take pictures and record video'), 
            0, FailureHandling.OPTIONAL)) {
            Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.TextView0 - Allow 3D Gallery to take pictures and record video'), 
                0)

            Mobile.tap(findTestObject('Apps/3D Gallery/android.widget.Button1 - ALLOW'), 0)

            Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/3D Gallery Version/android.widget.TextView0 - Allow 3D Gallery to access photos media and files on your device'), 
                0)

            Mobile.tap(findTestObject('Apps/3D Gallery/android.widget.Button1 - ALLOW'), 0)
        }
    }
    
    Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView4 - Video'), 
        0)

    Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView4 - Video'), 
        0)

    Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.LinearLayout7'), 
        0)

    Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.LinearLayout7'), 
        0)

    if (Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Watch the 3D effect by turning the phone in landscape mode'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Watch the 3D effect by turning the phone in landscape mode'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.Button0 - UNDERSTOOD'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.Button0 - UNDERSTOOD'), 
            0)

        Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.Button0 - UNDERSTOOD'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.Button0 - UNDERSTOOD (2)'), 
        0, FailureHandling.OPTIONAL)) {
        not_run: Mobile.tapAtPosition(665, 1350)

        not_run: Mobile.verifyElementText(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Click here if the watch effect is not good'), 
            'Click here if the watch effect is not good')

        Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.Button0 - UNDERSTOOD (2)'), 
            3)

        Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.Button0 - UNDERSTOOD (2)'), 
            0)
    }
    
    Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

    'Video Timer'
    Mobile.waitForElementPresent(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.SeekBar0 - 0.0'), 
        0)

    'Play Button location'
    Mobile.tapAtPosition(540, 2015)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    'Back Button Location'
    Mobile.tapAtPosition(50, 150)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.LinearLayout7'), 
        0)

    Mobile.pressHome()

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Messages just got better'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Messages just got better'), 
            3)

        Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.Button0 - Agree'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Auto O2 Fav'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Auto O2 Fav'), 
            3)

        Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Auto O2 Fav'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - ROKiT Automation'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - ROKiT Automation'), 
            3)

        Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - ROKiT Automation'), 
            0)

        not_run: Mobile.getText(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - You Video'), 
            0)
    }
    
    Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - 10 min  MMS'), 
        5)
} else {
    Mobile.delay(10)

    Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView1 - Attach'), 
        30)

    Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView1 - Attach'), 
        0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    'Picture thumbnail in the message'
    Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.LinearLayout5'), 0)

    'SMS has changed to MMS'
    Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.TextView2 - MMS'), 0)

    'SMS has changed to MMS'
    Mobile.tap(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.TextView2 - MMS'), 0)

    Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.TextView0 - Now  MMS'), 
        45)

    Mobile.verifyElementVisible(findTestObject('Messages/Send MMS (SIM 1 - O2-UK)/android.widget.TextView2 -   via O2 - UK'), 
        0)

    'Video in the Message'
    Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.ImageView0'), 
        0)

    'Video in the Message'
    not_run: Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.ImageView0'), 
        0)

    not_run: if (Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Open with 3D Gallery'), 
        0, FailureHandling.OPTIONAL)) {
        not_run: Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Open with 3D Gallery'), 
            0)

        not_run: Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.Button0 - JUST ONCE'), 
            0)
    } else {
        not_run: Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView2 - 3D Gallery'), 
            0)

        not_run: Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView2 - 3D Gallery'), 
            0)
    }
    
    Mobile.pressHome()

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(512, 1700, 512, 200)

    Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView1 - 3D Gallery'), 
        0)

    Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView1 - 3D Gallery'), 
        0)

    if (Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Reminder'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Reminder'), 
            0)

        Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.Button1 - Accept'), 
            0)
    }
    
    Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView4 - Video'), 
        0)

    Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView4 - Video'), 
        0)

    Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.LinearLayout7'), 
        0)

    Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.LinearLayout7'), 
        0)

    if (Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Watch the 3D effect by turning the phone in landscape mode'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Watch the 3D effect by turning the phone in landscape mode'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.Button0 - UNDERSTOOD'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.Button0 - UNDERSTOOD'), 
            0)

        Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.Button0 - UNDERSTOOD'), 
            0)
    }
    
    Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

    'Video Timer'
    Mobile.waitForElementPresent(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.SeekBar0 - 0.0'), 
        0)

    'Play Button location'
    Mobile.tapAtPosition(540, 2015)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    'Back Button Location'
    Mobile.tapAtPosition(50, 150)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.LinearLayout7'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('View photo/video in MMS', 'SIM 1 = O2-UK', 
    TestLinkAPIResults.TEST_PASSED)

