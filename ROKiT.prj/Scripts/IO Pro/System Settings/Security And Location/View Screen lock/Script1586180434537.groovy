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

Mobile.swipe(550, 1700, 550, 400)

Mobile.verifyElementVisible(findTestObject('System Settings/Security And Location/View Security status/android.widget.TextView0 - Security  location'), 
    0)

Mobile.tap(findTestObject('System Settings/Security And Location/View Security status/android.widget.TextView0 - Security  location'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Security And Location/View Screen lock/android.widget.TextView0 - Screen lock'), 
    0)

Mobile.tap(findTestObject('System Settings/Security And Location/View Screen lock/android.widget.TextView0 - Screen lock'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Security And Location/View Screen lock/android.widget.TextView0 - Choose screen lock'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Security And Location/View Screen lock/android.widget.TextView0 - None'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Security And Location/View Screen lock/android.widget.TextView0 - Swipe'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Security And Location/View Screen lock/android.widget.TextView0 - Pattern'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Security And Location/View Screen lock/android.widget.TextView0 - PIN'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Security And Location/View Screen lock/android.widget.TextView0 - Password'), 
    0)

Mobile.pressHome()

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('View Screen lock', '', TestLinkAPIResults.TEST_PASSED)

