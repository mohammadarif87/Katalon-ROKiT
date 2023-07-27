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

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView0 - ALARM'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView1 - CLOCK'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView2 - TIMER'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView3 - STOPWATCH'), 0)

Mobile.tap(findTestObject('Apps/Clock/android.widget.TextView0 - ALARM'), 0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Apps/Clock/Default Alarm/android.widget.TextView0 - 830AM'), 3)

    Mobile.verifyElementVisible(findTestObject('Apps/Clock/Default Alarm/android.widget.TextView5 - Mon Tue Wed Thu Fri'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/Clock/Default Alarm/android.widget.TextView0 - 900AM'), 3)

    Mobile.verifyElementVisible(findTestObject('Apps/Clock/Default Alarm/android.widget.TextView0 - Sun Sat'), 3)
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/Clock/Default Alarm/android.widget.TextView4 - 0830'), 3)

    Mobile.verifyElementVisible(findTestObject('Apps/Clock/Default Alarm/android.widget.TextView5 - Mon Tue Wed Thu Fri'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/Clock/Default Alarm/android.widget.TextView6 - 0900'), 3)

    Mobile.verifyElementVisible(findTestObject('Apps/Clock/Default Alarm/android.widget.TextView7 - Sat Sun'), 0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Default Alarm', '', TestLinkAPIResults.TEST_PASSED)

