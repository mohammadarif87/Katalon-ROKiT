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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - System'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Languages and input/Add language/android.widget.TextView0 - System'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Multiple Users/Guest User/android.widget.TextView9 - Advanced'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Multiple Users/Guest User/android.widget.TextView9 - Advanced'), 0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Multiple Users/Guest User/android.widget.TextView11 - Multiple users'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Multiple Users/Guest User/android.widget.TextView11 - Multiple users'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Multiple Users/Guest User/android.widget.TextView0 - Multiple users'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Multiple Users/Add User/android.widget.TextView0 - You (Rokit)'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Multiple Users/Guest User/android.widget.TextView2 - You (Owner)'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('System Settings/System/Multiple Users/Guest User/android.widget.TextView3 - Admin'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Multiple Users/Guest User/android.widget.TextView4 - Guest'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Multiple Users/Add User/android.widget.TextView5 - Add user'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Multiple Users/Add User/android.widget.TextView5 - Add user'), 0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Multiple Users/Add User/android.widget.TextView0 - Add new user'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Multiple Users/Add User/android.widget.Button0 - CANCEL'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Multiple Users/Add User/android.widget.Button1 - OK'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Multiple Users/Add User/android.widget.Button1 - OK'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Multiple Users/Add User/android.widget.TextView0 - Set up user now'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Multiple Users/Add User/android.widget.Button1 - SET UP NOW'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Multiple Users/Add User/android.widget.Button1 - SET UP NOW'), 0)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

while (Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Multiple Users/Add User/android.widget.TextView0 - Remove user'), 
    0, FailureHandling.OPTIONAL)) {
    'Swipe up on lock screen'
    Mobile.swipe(512, 1700, 512, 200)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    'Cancel button'
    Mobile.tapAtPosition(130, 1920)
}

Mobile.verifyElementVisible(findTestObject('System Settings/System/Multiple Users/Add User/android.widget.TextView0 - Remove user'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Multiple Users/Add User/android.widget.Button0 - KEEP USER'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Multiple Users/Add User/android.widget.Button1 - REMOVE USER'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Multiple Users/Add User/android.widget.Button1 - REMOVE USER'), 0)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

'Swipe down from the top'
Mobile.swipe(512, 20, 512, 600)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

while (Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Multiple Users/Guest User/android.widget.TextView11 - Multiple users'), 
    0, FailureHandling.OPTIONAL)) {
    'Swipe up on lockscreen'
    Mobile.swipe(512, 1700, 512, 200)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.pressBack()
}

Mobile.verifyElementVisible(findTestObject('System Settings/System/Multiple Users/Guest User/android.widget.TextView11 - Multiple users'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Multiple Users/Guest User/android.widget.TextView11 - Multiple users'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Multiple Users/Guest User/android.widget.TextView0 - Multiple users'), 
    0)

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Multiple Users/Add User/android.widget.TextView0 - You (Rokit)'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Multiple Users/Guest User/android.widget.TextView2 - You (Owner)'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('System Settings/System/Multiple Users/Guest User/android.widget.TextView3 - Admin'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Multiple Users/Guest User/android.widget.TextView4 - Guest'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Add User', '', TestLinkAPIResults.TEST_PASSED)

