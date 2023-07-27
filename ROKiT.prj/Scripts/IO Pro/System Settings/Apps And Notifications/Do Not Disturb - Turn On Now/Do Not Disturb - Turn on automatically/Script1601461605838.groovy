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
import java.text.SimpleDateFormat as SimpleDateFormat

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn On Now/android.widget.TextView0 - Apps  notifications'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn On Now/android.widget.TextView0 - Apps  notifications'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn On Now/android.widget.TextView0 - Notifications'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn On Now/android.widget.TextView0 - Notifications'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/android.widget.TextView0 - Do Not Disturb'), 
        0)

    Mobile.tap(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/android.widget.TextView0 - Do Not Disturb'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn On Now/android.widget.TextView7 - Do not disturb'), 
        0)

    Mobile.tap(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn On Now/android.widget.TextView7 - Do not disturb'), 
        0)
}

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(550, 1750, 550, 300)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn On Now/android.widget.Button0 - TURN ON NOW'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView13 - Turn on automatically'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView14 - Never'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView13 - Turn on automatically'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView0 - Automatic rules'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView2 - Sleeping'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView3 - Off'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView4 - Event'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView5 - Off'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView6 - Add rule'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView6 - Add rule'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView0 - Choose rule type'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView1 - Event'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView2 - Time'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView2 - Time'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView0 - Add time rule'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.EditText0 - Enter rule name'), 
    0)

Mobile.setText(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.EditText0 - Enter rule name'), 
    'Automation Rule', 0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.Button1 - ADD'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView0 - Automatic rule'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView2 - Automation Rule'), 
    0)

'Edit name icon'
Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.ImageButton1'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView3 - Use rule'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView4 - Days'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView5 - Mon Tue Wed Thu Fri Sat Sun'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView6 - Start time'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView8 - End time'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView10 - Alarm can override end time'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView6 - Start time'), 
    0)

'Keyboard icon'
Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.ImageButton0'), 
    0)

'Keyboard icon'
Mobile.tap(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.ImageButton0'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView0 - Set time'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.EditText0 - 22'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.EditText1 - 00'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.EditText0 - 22'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Delete button on keyboard'
Mobile.tapAndHoldAtPosition(900, 1800, 2)

dateLocal = new Date()

hours = new SimpleDateFormat('HH')

presentHour = hours.format(dateLocal)

println(presentHour)

Mobile.setText(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.EditText0'), 
    presentHour, 0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.EditText1 - 00'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Delete button on keyboard'
Mobile.tapAndHoldAtPosition(900, 1800, 2)

mins = new SimpleDateFormat('mm')

presentMin = mins.format(dateLocal)

minsInt = Integer.parseInt(presentMin)

mins1 = (minsInt + 2)

minsFinal = mins1.toString()

println(minsFinal)

Mobile.setText(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.EditText1'), 
    minsFinal, 0)

Mobile.tap(findTestObject('Apps/Clock/Snooze the alarm/android.widget.Button1 - OK'), 0)

Mobile.scrollToText(minsFinal, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView8 - End time'), 
    0)

'Keyboard icon'
Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.ImageButton0'), 
    0)

'Keyboard icon'
Mobile.tap(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.ImageButton0'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView0 - Set time'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.EditText0 - 7'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.EditText1 - 00'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.EditText0 - 7'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Delete button on keyboard'
Mobile.tapAndHoldAtPosition(900, 1800, 2)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.EditText0'), 
    presentHour, 0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.EditText1 - 00'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Delete button on keyboard'
Mobile.tapAndHoldAtPosition(900, 1800, 2)

mins = new SimpleDateFormat('mm')

presentMin = mins.format(dateLocal)

minsInt = Integer.parseInt(presentMin)

mins1 = (minsInt + 3)

minsFinal = mins1.toString()

println(minsFinal)

Mobile.setText(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.EditText1'), 
    minsFinal, 0)

Mobile.tap(findTestObject('Apps/Clock/Snooze the alarm/android.widget.Button1 - OK'), 0)

Mobile.scrollToText(minsFinal, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView6 - Automation Rule (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView7 - On'), 
    0)

Mobile.pressBack()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView13 - Turn on automatically (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView14 - 1 rule'), 
    0)

'DND has automatically been enabled if Turn Off Now appears'
Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.Button0 - TURN OFF NOW'), 
    90)

Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

'DND has automatically turned OFF'
Mobile.verifyElementNotVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.Button0 - TURN OFF NOW'), 
    20)

Mobile.comment('Delete Rule')

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView13 - Turn on automatically (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView6 - Automation Rule (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView7 - On'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.ImageView0'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.ImageView0'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView0 - Delete Automation rule rule'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.Button0 - CANCEL'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.Button1 - DELETE'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.Button1 - DELETE'), 
    0)

Mobile.verifyElementNotVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn on automatically/android.widget.TextView6 - Automation Rule (1)'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Do Not Disturb - Turn on automatically', 
    '', TestLinkAPIResults.TEST_PASSED)

