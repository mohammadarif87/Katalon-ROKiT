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
import org.junit.After as After

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView0 - ALARM'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView1 - CLOCK'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView2 - TIMER'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView3 - STOPWATCH'), 3)

Mobile.verifyElementVisible(findTestObject('Preconditions/Set Snooze Alarm 1 minute/android.widget.ImageView0'), 3)

Mobile.tap(findTestObject('Preconditions/Set Snooze Alarm 1 minute/android.widget.ImageView0'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Set Snooze Alarm 1 minute/android.widget.TextView1 - Settings'), 
    3)

Mobile.tap(findTestObject('Preconditions/Set Snooze Alarm 1 minute/android.widget.TextView1 - Settings'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Set Snooze Alarm 1 minute/android.widget.TextView12 - Snooze length'), 
    3)

Mobile.tap(findTestObject('Preconditions/Set Snooze Alarm 1 minute/android.widget.TextView12 - Snooze length'), 0)

Mobile.swipe(512, 400, 512, 1800)

Mobile.tap(findTestObject('Preconditions/Set Snooze Alarm 1 minute/android.widget.CheckedTextView0 - 1 minute'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Set Snooze Alarm 1 minute/android.widget.TextView13 - 1 minute'), 
    3)

Mobile.pressBack()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView0 - ALARM'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView1 - CLOCK'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView2 - TIMER'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView3 - STOPWATCH'), 3)

Mobile.tap(findTestObject('Apps/Clock/android.widget.TextView0 - ALARM'), 0)

'Add alarm button'
Mobile.verifyElementVisible(findTestObject('Apps/Clock/Snooze the alarm/android.widget.ImageButton2'), 3)

'Add alarm button'
Mobile.tap(findTestObject('Apps/Clock/Snooze the alarm/android.widget.ImageButton2'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Switch the keyboard time entry'
Mobile.tap(findTestObject('Apps/Clock/Snooze the alarm/android.widget.ImageButton0'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Snooze the alarm/android.widget.TextView0 - Set time'), 3)

Mobile.tap(findTestObject('Apps/Clock/Snooze the alarm/android.widget.EditText1'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Delete button on keyboard'
Mobile.tapAndHoldAtPosition(900, 1800, 2)

dateLocal = new Date()

mins = new SimpleDateFormat('mm')

presentMin = mins.format(dateLocal)

minsInt = Integer.parseInt(presentMin)

mins1 = (minsInt + 1)

minsFinal = mins1.toString()

println(minsFinal)

Mobile.setText(findTestObject('Apps/Clock/Snooze the alarm/android.widget.EditText1'), minsFinal, 0)

Mobile.tap(findTestObject('Apps/Clock/Snooze the alarm/android.widget.Button1 - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Snooze the alarm/android.widget.Switch1 - ON'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Snooze the alarm/android.widget.TextView8 - Default (Disguises Ringtone)'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Snooze the alarm/android.widget.CheckBox1 - Vibrate'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Snooze the alarm/android.widget.Button0 - Dismiss'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Snooze the alarm/android.widget.Button1 - Delete'), 3)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.openNotifications()

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Snooze the alarm/android.widget.Button0 - SNOOZE'), 63)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Snooze the alarm/android.widget.Button1 - DISMISS'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Snooze the alarm/android.widget.TextView3 - Clock'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Snooze the alarm/android.widget.TextView4 - Alarm'), 3)

Mobile.tap(findTestObject('Apps/Clock/Snooze the alarm/android.widget.Button0 - SNOOZE'), 0)

Mobile.pressHome()

Mobile.swipe(512, 1700, 512, 400)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Snooze the alarm/android.widget.TextView9 - Clock'), 3)

Mobile.tap(findTestObject('Apps/Clock/Snooze the alarm/android.widget.TextView9 - Clock'), 0)

Mobile.openNotifications()

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Snooze the alarm/android.widget.Button0 - SNOOZE'), 63)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Snooze the alarm/android.widget.Button1 - DISMISS'), 3)

Mobile.closeNotifications()

'Alarm details'
Mobile.tap(findTestObject('Apps/Clock/Snooze the alarm/android.widget.ImageButton2 (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Snooze the alarm/android.widget.Button1 - Delete (1)'), 3)

Mobile.tap(findTestObject('Apps/Clock/Snooze the alarm/android.widget.Button1 - Delete (1)'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Snooze the alarm', '', TestLinkAPIResults.TEST_PASSED)

