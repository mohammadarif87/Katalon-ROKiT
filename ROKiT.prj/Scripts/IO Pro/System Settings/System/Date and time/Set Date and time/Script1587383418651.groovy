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
import java.text.SimpleDateFormat as SimpleDateFormat

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView15 - System'), 
    3)

Mobile.tap(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView15 - System'), 0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView5 - Date  time'), 
    3)

Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView5 - Date  time'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - Automatic date  time'), 
    3)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - Use network-provided time'), 
    3)

Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - Automatic date  time'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - Automatic date  time (1)'), 
    3)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.CheckedTextView0 - Use network-provided time'), 
    3)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.CheckedTextView0 - Use GPS-provided time'), 
    3)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.CheckedTextView0 - Off (1)'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.CheckedTextView0 - Off (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - Set date'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - Set time'), 
        0)

    dateLocal = new Date()

    dateFormat = new SimpleDateFormat('MMMM d, yyyy')

    timeFormat = new SimpleDateFormat('h:mm aa')

    presentDate = dateFormat.format(dateLocal)

    presentTime = timeFormat.format(dateLocal)

    Mobile.scrollToText(presentDate, FailureHandling.STOP_ON_FAILURE)

    Mobile.scrollToText(presentTime, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - Set date'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.view.View0 - 1'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.view.View0 - 1'), 0)

    while (Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - Wed Jan 1'), 
        0, FailureHandling.OPTIONAL)) {
        'Left arrow button (previous month)'
        Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.ImageButton0'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.view.View0 - 1'), 0)
    }
    
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - Wed Jan 1'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.Button0 - OK'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.Button0 - OK'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - January 1 2020'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - Set time'), 
        0)

    'Keyboard Icon'
    Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.ImageButton0 (1)'), 
        0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    'Hour position'
    Mobile.tapAtPosition(300, 1170)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    'Delete on Keypad'
    Mobile.tapAndHoldAtPosition(950, 1800, 0)

    Mobile.setText(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.EditText0'), '12', 
        0)

    'Minute position'
    Mobile.tapAtPosition(430, 830)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    'Delete on Keypad'
    Mobile.tapAndHoldAtPosition(950, 1800, 0)

    Mobile.setText(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.EditText0 (1)'), 
        '00', 0)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.Spinner0'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.CheckedTextView1 - PM'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.CheckedTextView1 - PM'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.Button0 - OK (1)'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.Button0 - OK (1)'), 
        0)

    if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - 1200 PM (1)'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - 1200 PM (1)'), 
            0)
    } else {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - 1200'), 
            0)
    }
    
    Mobile.comment('Reset to network based')

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - Automatic date  time'), 
        3)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - Automatic date  time'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - Automatic date  time (1)'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.CheckedTextView0 - Use network-provided time'), 
        3)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.CheckedTextView0 - Use network-provided time'), 
        0)

    dateLocal = new Date()

    presentDate = dateFormat.format(dateLocal)

    presentTime = timeFormat.format(dateLocal)

    Mobile.scrollToText(presentDate, FailureHandling.STOP_ON_FAILURE)

    Mobile.scrollToText(presentTime, FailureHandling.STOP_ON_FAILURE)
} else {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.CheckedTextView0 - off'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.CheckedTextView0 - off'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - Set date'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - Set time'), 
        0)

    dateLocal = new Date()

    dateFormat = new SimpleDateFormat('d MMMM yyyy')

    timeFormat = new SimpleDateFormat('HH:mm')

    presentDate = dateFormat.format(dateLocal)

    presentTime = timeFormat.format(dateLocal)

    Mobile.scrollToText(presentDate, FailureHandling.STOP_ON_FAILURE)

    Mobile.scrollToText(presentTime, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - Set date'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.view.View0 - 1'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.view.View0 - 1'), 0)

    while (Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - Wed 1 Jan'), 
        0, FailureHandling.OPTIONAL)) {
        'Left arrow button (previous month)'
        Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.ImageButton0'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.view.View0 - 1'), 0)
    }
    
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - Wed 1 Jan'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.Button0 - OK'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.Button0 - OK'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - 1 January 2020'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - Set time'), 
        0)

    'Keyboard Icon'
    Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.ImageButton0 (1)'), 
        0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    'Hour position'
    Mobile.tapAtPosition(300, 1170)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    'Delete on Keypad'
    Mobile.tapAndHoldAtPosition(950, 1800, 0)

    Mobile.setText(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.EditText0'), '12', 
        0)

    'Minute position'
    Mobile.tapAtPosition(430, 830)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    'Delete on Keypad'
    Mobile.tapAndHoldAtPosition(950, 1800, 0)

    Mobile.setText(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.EditText0 (1)'), 
        '00', 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.Button0 - OK (1)'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.Button0 - OK (1)'), 
        0)

    if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - 1200 pm'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - 1200 pm'), 
            0)
    } else {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - 1200'), 
            0)
    }
    
    Mobile.comment('Reset to network based')

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - Automatic date  time'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - Automatic date  time'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView0 - Automatic date  time (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.CheckedTextView0 - Use network-provided time'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.CheckedTextView0 - Use network-provided time'), 
        0)

    dateLocal = new Date()

    presentDate = dateFormat.format(dateLocal)

    presentTime = timeFormat.format(dateLocal)

    Mobile.scrollToText(presentDate, FailureHandling.STOP_ON_FAILURE)

    Mobile.scrollToText(presentTime, FailureHandling.STOP_ON_FAILURE)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Set Date & time', '', TestLinkAPIResults.TEST_PASSED)

