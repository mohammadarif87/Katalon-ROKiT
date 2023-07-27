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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.openNotifications()

if (Mobile.verifyElementVisible(findTestObject('Preconditions/Clear All Notifications/android.widget.Button2 - CLEAR ALL'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.comment('If Clear All button is present')

    Mobile.tap(findTestObject('Preconditions/Clear All Notifications/android.widget.Button2 - CLEAR ALL'), 0)

    Mobile.openNotifications()

    Mobile.verifyElementNotVisible(findTestObject('Preconditions/Clear All Notifications/android.widget.Button2 - CLEAR ALL'), 
        0)

    Mobile.closeNotifications()
} else if (Mobile.verifyElementNotVisible(findTestObject('Preconditions/Clear All Notifications/android.widget.Button2 - CLEAR ALL'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.swipe(512, 600, 512, 100, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Clear All Notifications/android.widget.Button2 - CLEAR ALL'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Clear All Notifications/android.widget.Button2 - CLEAR ALL'), 
            0, FailureHandling.OPTIONAL)

        Mobile.tap(findTestObject('Preconditions/Clear All Notifications/android.widget.Button2 - CLEAR ALL'), 0)

        Mobile.openNotifications()

        Mobile.verifyElementNotVisible(findTestObject('Preconditions/Clear All Notifications/android.widget.Button2 - CLEAR ALL'), 
            0)

        Mobile.closeNotifications()
    }
} else {
    Mobile.closeNotifications()
}

