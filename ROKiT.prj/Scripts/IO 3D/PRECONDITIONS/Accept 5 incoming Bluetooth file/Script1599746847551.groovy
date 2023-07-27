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

Mobile.pressHome()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.openNotifications()

Mobile.verifyElementVisible(findTestObject('Preconditions/Accept incoming Bluetooth file/android.widget.TextView3 - Bluetooth'), 
    10)

Mobile.verifyElementVisible(findTestObject('Preconditions/Accept incoming Bluetooth file/android.widget.TextView4 - Incoming file'), 
    0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Accept incoming Bluetooth file/android.widget.Button2 - ACCEPT'), 
    0)

Mobile.tap(findTestObject('Preconditions/Accept incoming Bluetooth file/android.widget.Button2 - ACCEPT'), 0)

Mobile.delay(90, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Preconditions/Accept incoming Bluetooth file/android.widget.TextView4 - Bluetooth share Received files'), 
    90)

while (Mobile.verifyElementNotVisible(findTestObject('Preconditions/Accept incoming Bluetooth file/android.widget.TextView5 - 5 successful 0 unsuccessful'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.closeNotifications()

    Mobile.openNotifications()

    Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)
}

Mobile.verifyElementVisible(findTestObject('Preconditions/Accept incoming Bluetooth file/android.widget.TextView5 - 5 successful 0 unsuccessful'), 
    0)

Mobile.closeApplication()

