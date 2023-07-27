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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

'Google Calendar Logo'
Mobile.verifyElementVisible(findTestObject('Apps/Calendar/android.widget.ImageView0'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Calendar/android.widget.TextView0 - Google Calendar'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Calendar/android.widget.TextView1 - Make the most of every day.'), 0)

'Next button'
Mobile.verifyElementVisible(findTestObject('Apps/Calendar/android.widget.ImageButton0'), 0)

'Next button'
Mobile.tap(findTestObject('Apps/Calendar/android.widget.ImageButton0'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Calendar/android.widget.TextView0 - Easy to scan and lovely to look at'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/Calendar/android.widget.TextView1 - Schedule view puts images and maps on your calendar.'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/Calendar/android.widget.TextView2 - Uses device location.'), 0)

'Next button'
Mobile.verifyElementVisible(findTestObject('Apps/Calendar/android.widget.ImageButton0'), 0)

'Next button'
Mobile.tap(findTestObject('Apps/Calendar/android.widget.ImageButton0'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Calendar/android.widget.TextView0 - Events from Gmail'), 0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Apps/Calendar/android.widget.TextView0 - Reservations for flights restaurants and more automatically added from emails.'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/Calendar/android.widget.TextView1 - Bookings for flights restaurants and more automatically added from emails.'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Apps/Calendar/android.widget.TextView2 - You can change this in Settings.'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/Calendar/android.widget.Button0 - Got it (1)'), 0)

Mobile.tap(findTestObject('Apps/Calendar/android.widget.Button0 - Got it (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Calendar App Pre-Installed', '', TestLinkAPIResults.TEST_PASSED)

