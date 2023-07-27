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

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Camera/About/3D Camera version/android.widget.TextView0 - Reminder'), 
    0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Camera/About/3D Camera version/android.widget.TextView0 - Welcome to 3D Camera'), 
    0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Camera/About/3D Camera version/android.widget.TextView0 - Dont ask again'), 
    0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Camera/About/3D Camera version/android.widget.Button0 - Cancel'), 
    0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Camera/About/3D Camera version/android.widget.Button0 - Accept'), 
    0)

Mobile.tap(findTestObject('3D/Apps/3D Camera/About/3D Camera version/android.widget.Button0 - Accept'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Camera/android.widget.TextView0 - Allow 3D Camera to record audio'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Camera/android.widget.Button0 - DENY'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Camera/android.widget.Button1 - ALLOW'), 0)

Mobile.tap(findTestObject('Apps/3D Camera/android.widget.Button1 - ALLOW'), 0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Apps/3D Camera/android.widget.TextView0 - Allow 3D Camera to access photos media and files on your device - US'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/3D Camera/android.widget.TextView0 - Allow 3D Camera to access photos media and files on your device'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Apps/3D Camera/android.widget.Button0 - DENY'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Camera/android.widget.Button1 - ALLOW'), 0)

Mobile.tap(findTestObject('Apps/3D Camera/android.widget.Button1 - ALLOW'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Camera/android.widget.TextView0 - Allow 3D Camera to take pictures and record video'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Camera/android.widget.Button0 - DENY'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/3D Camera/android.widget.Button1 - ALLOW'), 0)

Mobile.tap(findTestObject('Apps/3D Camera/android.widget.Button1 - ALLOW'), 0)

Mobile.pressHome()

Mobile.swipe(550, 1650, 550, 300)

Mobile.swipe(550, 1650, 550, 300)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Camera/About/3D Camera version/android.widget.TextView0 - Settings'), 
    0)

Mobile.tap(findTestObject('3D/Apps/3D Camera/About/3D Camera version/android.widget.TextView0 - Settings'), 0)

Mobile.scrollToText('Apps & notifications', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Camera/About/3D Camera version/android.widget.TextView0 - Apps  notifications'), 
    0)

Mobile.tap(findTestObject('3D/Apps/3D Camera/About/3D Camera version/android.widget.TextView0 - Apps  notifications'), 0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Camera/About/3D Camera version/android.widget.TextView0 - 3D Camera'), 
    0)

Mobile.tap(findTestObject('3D/Apps/3D Camera/About/3D Camera version/android.widget.TextView0 - 3D Camera'), 0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Camera/About/3D Camera version/android.widget.TextView0 - Advanced'), 
    0)

Mobile.tap(findTestObject('3D/Apps/3D Camera/About/3D Camera version/android.widget.TextView0 - Advanced'), 0)

Mobile.swipe(550, 1650, 550, 300)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Camera/About/3D Camera version/android.widget.TextView0 - Version ' + 
        version), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('3D Camera version', '', TestLinkAPIResults.TEST_PASSED)

