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

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView0 - ALARM'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView1 - CLOCK'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView2 - TIMER'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView3 - STOPWATCH'), 3)

Mobile.tap(findTestObject('Apps/Clock/android.widget.TextView2 - TIMER'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.TextView4 - 00h 00m 00s'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.Button0 - 1'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.Button1 - 2'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.Button2 - 3'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.Button3 - 4'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.Button4 - 5'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.Button5 - 6'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.Button6 - 7'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.Button7 - 8'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.Button8 - 9'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.Button9 - 0'), 3)

Mobile.tap(findTestObject('Apps/Clock/Add Timer/android.widget.Button0 - 1'), 3)

Mobile.tap(findTestObject('Apps/Clock/Add Timer/android.widget.Button1 - 2'), 3)

Mobile.tap(findTestObject('Apps/Clock/Add Timer/android.widget.Button2 - 3'), 3)

Mobile.tap(findTestObject('Apps/Clock/Add Timer/android.widget.Button3 - 4'), 3)

Mobile.tap(findTestObject('Apps/Clock/Add Timer/android.widget.Button4 - 5'), 3)

Mobile.tap(findTestObject('Apps/Clock/Add Timer/android.widget.Button5 - 6'), 3)

'Backspace button'
Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.ImageButton0'), 3)

'Play button'
Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.ImageButton1'), 3)

'Play button'
Mobile.tap(findTestObject('Apps/Clock/Add Timer/android.widget.ImageButton1'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.Button1 -  100'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.Button3 - ADD TIMER'), 3)

not_run: Mobile.tap(findTestObject('Apps/Clock/Add Timer/android.widget.Button1 - RESET'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.Button2 - DELETE'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.Button0 - Label'), 3)

Mobile.tap(findTestObject('Apps/Clock/Add Timer/android.widget.Button0 - Label'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.TextView0 - Label'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.EditText0'), 3)

Mobile.setText(findTestObject('Apps/Clock/Add Timer/android.widget.EditText0'), 'Timer 1', 3)

Mobile.tap(findTestObject('Apps/Clock/Add Timer/android.widget.Button1 - OK'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.Button0 - Timer 1'), 3)

Mobile.tap(findTestObject('Apps/Clock/Add Timer/android.widget.Button3 - ADD TIMER'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.Button10 - CANCEL'), 3)

Mobile.tap(findTestObject('Apps/Clock/Add Timer/android.widget.Button5 - 6'), 3)

Mobile.tap(findTestObject('Apps/Clock/Add Timer/android.widget.Button4 - 5'), 3)

Mobile.tap(findTestObject('Apps/Clock/Add Timer/android.widget.Button3 - 4'), 3)

Mobile.tap(findTestObject('Apps/Clock/Add Timer/android.widget.Button2 - 3'), 3)

Mobile.tap(findTestObject('Apps/Clock/Add Timer/android.widget.Button1 - 2'), 3)

Mobile.tap(findTestObject('Apps/Clock/Add Timer/android.widget.Button0 - 1'), 3)

'Play button'
Mobile.tap(findTestObject('Apps/Clock/Add Timer/android.widget.ImageButton1 (1)'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.Button2 - DELETE'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.Button0 - Label'), 3)

Mobile.tap(findTestObject('Apps/Clock/Add Timer/android.widget.Button0 - Label'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.TextView0 - Label'), 3)

Mobile.setText(findTestObject('Apps/Clock/Add Timer/android.widget.EditText0'), 'Timer 2', 3)

Mobile.tap(findTestObject('Apps/Clock/Add Timer/android.widget.Button1 - OK'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.Button0 - Timer 2'), 3)

Mobile.verifyElementNotVisible(findTestObject('Apps/Clock/Add Timer/android.widget.Button0 - Timer 1'), 3)

Mobile.swipe(512, 1700, 512, 200)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementNotVisible(findTestObject('Apps/Clock/Add Timer/android.widget.Button0 - Timer 2'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.Button0 - Timer 1'), 3)

Mobile.tap(findTestObject('Apps/Clock/Add Timer/android.widget.Button2 - DELETE'), 3)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Apps/Clock/Add Timer/android.widget.Button2 - DELETE'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add Timer/android.widget.TextView4 - 00h 00m 00s'), 3)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Add Timer', '', TestLinkAPIResults.TEST_PASSED)

