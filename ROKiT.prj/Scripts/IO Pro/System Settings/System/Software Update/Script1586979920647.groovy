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

Mobile.verifyElementVisible(findTestObject('System Settings/System/Backup/android.widget.TextView0 - System'), 0)

Mobile.tap(findTestObject('System Settings/System/Backup/android.widget.TextView0 - System'), 0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Software Update/android.widget.TextView0 - Advanced'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Software Update/android.widget.TextView0 - Advanced'), 0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Software Update/android.widget.TextView0 - Software Update'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Software Update/android.widget.TextView0 - Software Update'), 0)

Mobile.tap(findTestObject('System Settings/System/Software Update/android.widget.Button0 - CHECK FOR UPDATES'), 0)

Mobile.verifyElementText(findTestObject('System Settings/System/Software Update/android.widget.TextView0 - You are already on the latest version'), 
    'You are already on the latest version')

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Software Update', '', TestLinkAPIResults.TEST_PASSED)

