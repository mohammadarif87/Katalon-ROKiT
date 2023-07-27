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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Bluetooth/android.widget.TextView6 - Connected devices'), 
    4)

Mobile.tap(findTestObject('Preconditions/Turn on Bluetooth/android.widget.TextView6 - Connected devices'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Bluetooth/android.widget.TextView2 - Bluetooth'), 0)

Mobile.tap(findTestObject('Preconditions/Turn on Bluetooth/android.widget.TextView2 - Bluetooth'), 0)

if (Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Bluetooth/android.widget.TextView2 - On'), 0, FailureHandling.OPTIONAL)) {
    Mobile.comment('If Bluetooth is ON, then check it displays ON')

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Bluetooth/android.widget.TextView2 - On'), 0)
} else {
    Mobile.comment('Else if Bluetooth is OFF then turn it on')

    Mobile.tap(findTestObject('Preconditions/Turn on Bluetooth/android.widget.TextView2 - Off'), 0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Bluetooth/android.widget.TextView2 - On'), 0)
}

