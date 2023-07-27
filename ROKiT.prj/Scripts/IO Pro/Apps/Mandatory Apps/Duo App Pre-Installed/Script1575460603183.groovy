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

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Apps/Duo/android.widget.TextView0 - Make high-quality video calls 1-on-1 or with up to 32 people'), 
    3)

Mobile.tap(findTestObject('Apps/Duo/android.widget.Button0 - Next'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Duo/android.widget.TextView0 - Video call friends and family on Android iOS  web'), 
    3)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.tap(findTestObject('Apps/Duo/android.widget.Button0 - Got it'), 3)
} else {
    Mobile.tap(findTestObject('Apps/Duo/android.widget.Button0 - OK'), 3)
}

Mobile.verifyElementVisible(findTestObject('Apps/Duo/android.widget.Button0 - I agree'), 0)

Mobile.tap(findTestObject('Apps/Duo/android.widget.Button0 - I agree'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Duo/android.widget.TextView0 - Get started'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Duo/android.widget.Button0 - Give access'), 0)

Mobile.tap(findTestObject('Apps/Duo/android.widget.Button0 - Give access'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Duo/android.widget.TextView0 - Allow Duo to access your contacts'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Duo/android.widget.Button0 - DENY'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Duo/android.widget.Button1 - ALLOW'), 0)

Mobile.tap(findTestObject('Apps/Duo/android.widget.Button1 - ALLOW'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Duo/android.widget.TextView0 - Allow Duo to make and manage phone calls'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/Duo/android.widget.Button0 - DENY'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Duo/android.widget.Button1 - ALLOW'), 0)

Mobile.tap(findTestObject('Apps/Duo/android.widget.Button1 - ALLOW'), 0)

Mobile.waitForElementPresent(findTestObject('Apps/Duo/android.widget.TextView0 - Set up Duo with your phone number'), 3)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Duo App Pre-Installed', '', TestLinkAPIResults.TEST_PASSED)

