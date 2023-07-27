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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn On Now/android.widget.TextView0 - Apps  notifications'), 
    3)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn On Now/android.widget.TextView0 - Apps  notifications'), 
    3)

Mobile.swipe(550, 1750, 550, 300)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Battery Optimization/android.widget.TextView0 - Advanced'), 
    3)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Battery Optimization/android.widget.TextView0 - Advanced'), 
    3)

Mobile.swipe(550, 1750, 550, 300)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Battery Optimization/android.widget.TextView0 - Special app access'), 
    3)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Battery Optimization/android.widget.TextView0 - Special app access'), 
    3)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Picture-in-picture'), 
    3)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Picture-in-picture'), 
    3)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Chrome'), 
    3)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Chrome'), 
    3)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.Switch0 - ON'), 
    3)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.Switch0 - ON'), 
    3)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Allow picture-in-picture'), 
    3)

Mobile.pressBack()

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Maps'), 
    3)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Maps'), 
    3)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.Switch0 - ON'), 
    3)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.Switch0 - ON'), 
    3)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Allow picture-in-picture'), 
    3)

Mobile.pressBack()

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - YouTube'), 
    3)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - YouTube'), 
    3)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.Switch0 - ON'), 
    3)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.Switch0 - ON'), 
    3)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Allow picture-in-picture'), 
    3)

Mobile.pressHome()

Mobile.delay(3)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Google'), 
    3)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Google'), 
    3)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Maps (1)'), 
    3)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Maps (1)'), 
    3)

Mobile.delay(15)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.tapAtPosition(500, 165, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.EditText0 - Search here'), 
        'Santa monica pier', 0)

    Mobile.delay(15)

    Mobile.tapAtPosition(980, 1940, FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(15)

    'Bristol'
    Mobile.tapAtPosition(250, 1900)

    Mobile.delay(15)

    'Start'
    Mobile.tapAtPosition(190, 1940, FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(3)

    if (Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Welcome to Google Maps Navigation'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Welcome to Google Maps Navigation'), 
            3)

        Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.Button0 - GOT IT (1)'), 
            3)

        Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.Button0 - GOT IT (1)'), 
            3)
    }
    
    Mobile.delay(15)
} else {
    Mobile.tapAtPosition(500, 165, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Choose starting point'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Choose starting point'), 
            0)

        Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Choose starting point'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Your location'), 
            0)

        Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Your location'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Choose starting point'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Your location'), 
            0)

        Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Your location'), 
            0)
    }
    
    Mobile.setText(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.EditText0 - Search here'), 
        'Bristol', 0)

    Mobile.delay(15)

    Mobile.tapAtPosition(980, 1940, FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(15)

    'Directions'
    Mobile.tapAtPosition(250, 1900)

    Mobile.delay(3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Your location'), 
        0)

    Mobile.delay(15)

    Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.Button0 - Start'), 
        0)

    Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.Button0 - Start'), 
        0)

    Mobile.delay(1)

    if (Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Welcome to Google Maps Navigation (1)'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.TextView0 - Welcome to Google Maps Navigation (1)'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.Button0 - GOT IT (2)'), 
            0)

        Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.Button0 - GOT IT (2)'), 
            0)
    }
    
    Mobile.delay(10)
}

Mobile.pressHome(FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'Maps widget'
Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.FrameLayout0'), 
    5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Stop Navigation')

'Google Folder'
not_run: Mobile.tapAtPosition(160, 1390)

'Google Folder'
Mobile.tapAtPosition(830, 1280)

'X on Navigation'
Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.ImageView2'), 
    3)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.openNotifications()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'Navigation on Notification'
Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Picture-in-picture/android.widget.LinearLayout0'), 
    3)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Picture-in-picture', '', TestLinkAPIResults.TEST_PASSED)

