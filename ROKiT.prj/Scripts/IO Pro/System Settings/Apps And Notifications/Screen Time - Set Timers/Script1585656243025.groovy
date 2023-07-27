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

'This will open 3D Camera app first'
CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage3DCamera, 
    appActivity3DCamera)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Camera/About/3D Camera version/android.widget.TextView0 - Reminder'), 
    3)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView8 - Apps  notifications'), 
        3)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView8 - Apps  notifications'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView2 - Recently opened apps'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView19 - Screen time'), 
        3)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView19 - Screen time'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView4 - Set timers for your apps'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView5 - You can set daily timers for most apps. When the app timer ends the app is paused for the rest of the day.'), 
        3)

    Mobile.swipe(512, 900, 512, 200)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView4 - Settings'), 
        3)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView4 - Settings'), 
        3)

    Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView5 - App Timer'), 
        3)

    Mobile.pressBack()

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 37 apps'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.scrollToText('Show all 37 apps', FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 37 apps'), 
            3)

        Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 37 apps'), 
            3)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 38 apps'), 
        0, FailureHandling.OPTIONAL)) {
        not_run: Mobile.scrollToText('Show all 38 apps', FailureHandling.STOP_ON_FAILURE)

        not_run: Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 38 apps'), 
            0)

        not_run: Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 38 apps'), 
            0)

        Mobile.scrollToText('Show all 38 apps', FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.TextView0 - Show all 38 apps'), 
            3)

        Mobile.tap(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.TextView0 - Show all 38 apps'), 
            3)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 39 apps'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.scrollToText('Show all 39 apps', FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 39 apps'), 
            3)

        Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 39 apps'), 
            3)
    }
    
    not_run: if (Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.ImageView0'), 
        0, FailureHandling.OPTIONAL)) {
        'Arrow icon to see all apps'
        Mobile.tap(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.ImageView0'), 
            3)

        not_run: Mobile.tap(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.RelativeLayout0'), 
            3)
    }
    
    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.scrollToText('Settings', FailureHandling.STOP_ON_FAILURE)

    while (Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView5 - 3D Camera'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.swipe(512, 1700, 512, 1000)
    }
    
    Mobile.scrollToText('3D Camera', FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView5 - 3D Camera'), 
        3)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView5 - 3D Camera'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView6 - No timer'), 
        3)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView6 - No timer'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView0 - Set app timer'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView1 - This app timer for 3D Camera will reset at midnight'), 
        5)

    if (Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.EditText1 - 30 mins'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.EditText1 - 30 mins'), 
            3)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.EditText0 - 30 min'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.EditText0 - 30 min'), 
            3)
    }
    
    Mobile.swipe(650, 930, 650, 1100)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(650, 930, 650, 1100)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(650, 930, 650, 1100)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(650, 930, 650, 1100)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(650, 930, 650, 1100)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(650, 930, 650, 1100)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.EditText0 - 0 min'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.EditText0 - 0 min'), 
            3)

        Mobile.tap(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.Button0 - OK'), 
            3)

        Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.TextView0 - 0 minutes'), 
            3)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.EditText1 - 0 mins'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.EditText1 - 0 mins'), 
            3)

        Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.Button4 - OK'), 
            3)

        Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView6 - 0 minutes'), 
            3)
    }
    
    Mobile.pressHome()

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(512, 1000, 512, 300)

    Mobile.scrollToText('3D Camera', FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView0 - 3D Camera'), 
        3)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView0 - 3D Camera'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView0 - App isnt available'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.TextView0 - 3D Camera is paused since your app timer ran out. To change settings tap Learn more.'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.Button1 - OK'), 
        3)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.Button1 - OK'), 3)

    Mobile.swipe(512, 1000, 512, 300)

    Mobile.swipe(512, 1000, 512, 300)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView19 - Settings'), 
        3)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView19 - Settings'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView8 - Apps  notifications'), 
        3)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView8 - Apps  notifications'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView19 - Screen time'), 
        3)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView19 - Screen time'), 
        3)

    if (Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 37 apps'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.scrollToText('Show all 37 apps', FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 37 apps'), 
            3)

        Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 37 apps'), 
            3)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 38 apps'), 
        0, FailureHandling.OPTIONAL)) {
        not_run: Mobile.scrollToText('Show all 38 apps', FailureHandling.STOP_ON_FAILURE)

        not_run: Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 38 apps'), 
            0)

        not_run: Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 38 apps'), 
            0)

        Mobile.scrollToText('Show all 38 apps', FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.TextView0 - Show all 38 apps'), 
            3)

        Mobile.tap(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.TextView0 - Show all 38 apps'), 
            3)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 39 apps'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.scrollToText('Show all 39 apps', FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 39 apps'), 
            3)

        Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 39 apps'), 
            3)
    }
    
    not_run: Mobile.scrollToText('Show all 37 apps', FailureHandling.STOP_ON_FAILURE)

    not_run: Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 37 apps'), 
        0)

    not_run: Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 37 apps'), 
        0)

    Mobile.scrollToText('Settings', FailureHandling.STOP_ON_FAILURE)

    while (Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView5 - 3D Camera'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.swipe(512, 1700, 512, 1000)
    }
    
    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView5 - 3D Camera'), 
        3)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView5 - 3D Camera'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView6 - 0 minutes'), 
        3)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView6 - 0 minutes'), 
        3)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.Button3 - Delete timer'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView6 - No timer'), 
        5)

    Mobile.pressHome()

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(512, 1000, 512, 300)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView0 - 3D Camera'), 
        3)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView0 - 3D Camera'), 
        3)

    Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView0 - App isnt available'), 
        3)

    Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView1 - 3D Camera is paused as your app timer ran out. To change settings tap Learn more.'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView8 - Apps  notifications'), 
        0)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView8 - Apps  notifications'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView2 - Recently opened apps'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView19 - Screen time'), 
        0)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView19 - Screen time'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView4 - Set timers for your apps'), 
        10)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView5 - You can set daily timers for most apps. When the app timer ends the app is paused for the rest of the day.'), 
        0)

    Mobile.swipe(512, 900, 512, 200)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView4 - Settings'), 
        0)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView4 - Settings'), 
        0)

    Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView5 - App Timer'), 
        0)

    Mobile.pressBack()

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 37 apps'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.scrollToText('Show all 37 apps', FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 37 apps'), 
            0)

        Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 37 apps'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 38 apps'), 
        0, FailureHandling.OPTIONAL)) {
        not_run: Mobile.scrollToText('Show all 38 apps', FailureHandling.STOP_ON_FAILURE)

        not_run: Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 38 apps'), 
            0)

        not_run: Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 38 apps'), 
            0)

        Mobile.scrollToText('Show all 38 apps', FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.TextView0 - Show all 38 apps'), 
            0)

        Mobile.tap(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.TextView0 - Show all 38 apps'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 39 apps'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.scrollToText('Show all 39 apps', FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 39 apps'), 
            0)

        Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 39 apps'), 
            0)
    }
    
    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.scrollToText('Settings', FailureHandling.STOP_ON_FAILURE)

    while (Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView5 - 3D Camera'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.swipe(512, 1700, 512, 1000)
    }
    
    Mobile.scrollToText('3D Camera', FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView5 - 3D Camera'), 
        0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView5 - 3D Camera'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView6 - No timer'), 
        3)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView6 - No timer'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView0 - Set app timer'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView1 - This app timer for 3D Camera will reset at midnight'), 
        0)

    if (Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.EditText1 - 30 mins'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.EditText1 - 30 mins'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.EditText0 - 30 min'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.EditText0 - 30 min'), 
            0)
    }
    
    Mobile.swipe(650, 930, 650, 1100)

    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(650, 930, 650, 1100)

    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(650, 930, 650, 1100)

    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(650, 930, 650, 1100)

    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(650, 930, 650, 1100)

    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(650, 930, 650, 1100)

    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.EditText0 - 0 min'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.EditText0 - 0 min'), 
            0)

        Mobile.tap(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.Button0 - OK'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.TextView0 - 0 minutes'), 
            3)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.EditText1 - 0 mins'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.EditText1 - 0 mins'), 
            0)

        Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.Button4 - OK'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView6 - 0 minutes'), 
            0)
    }
    
    Mobile.pressHome()

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(512, 1000, 512, 300)

    Mobile.scrollToText('3D Camera', FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView0 - 3D Camera'), 
        0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView0 - 3D Camera'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView0 - App isnt available'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView1 - 3D Camera is paused as your app timer ran out. To change settings tap Learn more.'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.Button1 - OK'), 
        0)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.Button1 - OK'), 0)

    Mobile.swipe(512, 1000, 512, 300)

    Mobile.swipe(512, 1000, 512, 300)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView19 - Settings'), 
        0)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView19 - Settings'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView8 - Apps  notifications'), 
        0)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView8 - Apps  notifications'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView19 - Screen time'), 
        0)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView19 - Screen time'), 
        0)

    if (Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 37 apps'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.scrollToText('Show all 37 apps', FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 37 apps'), 
            0)

        Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 37 apps'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 38 apps'), 
        0, FailureHandling.OPTIONAL)) {
        not_run: Mobile.scrollToText('Show all 38 apps', FailureHandling.STOP_ON_FAILURE)

        not_run: Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 38 apps'), 
            0)

        not_run: Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 38 apps'), 
            0)

        Mobile.scrollToText('Show all 38 apps', FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.TextView0 - Show all 38 apps'), 
            0)

        Mobile.tap(findTestObject('System Settings/Apps And Notifications/Screen Time - Set Timers/android.widget.TextView0 - Show all 38 apps'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 39 apps'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.scrollToText('Show all 39 apps', FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 39 apps'), 
            0)

        Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 39 apps'), 
            0)
    }
    
    not_run: Mobile.scrollToText('Show all 37 apps', FailureHandling.STOP_ON_FAILURE)

    not_run: Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 37 apps'), 
        0)

    not_run: Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView10 - Show all 37 apps'), 
        0)

    Mobile.scrollToText('Settings', FailureHandling.STOP_ON_FAILURE)

    while (Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView5 - 3D Camera'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.swipe(512, 1700, 512, 1000)
    }
    
    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView5 - 3D Camera'), 
        0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView5 - 3D Camera'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView6 - 0 minutes'), 
        0)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView6 - 0 minutes'), 
        0)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.Button3 - Delete timer'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView6 - No timer'), 
        5)

    Mobile.pressHome()

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(512, 1000, 512, 300)

    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView0 - 3D Camera'), 
        0)

    Mobile.tap(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView0 - 3D Camera'), 
        0)

    Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView0 - App isnt available'), 
        0)

    Mobile.verifyElementNotVisible(findTestObject('Settings/Apps and Notifications/Screen Time - Set Timers/android.widget.TextView1 - 3D Camera is paused as your app timer ran out. To change settings tap Learn more.'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Screen time - Set timers', '', TestLinkAPIResults.TEST_PASSED)

