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

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Battery/Adaptive Battery/android.widget.TextView9 - Battery'), 0)

Mobile.tap(findTestObject('Settings/Battery/Adaptive Battery/android.widget.TextView9 - Battery'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Battery/Adaptive Battery/android.widget.TextView0 - Battery'), 0)

'Battery Icon'
Mobile.verifyElementVisible(findTestObject('Settings/Battery/View Battery Info/android.widget.ImageView0'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Battery/View Battery Info/android.widget.TextView2 - 100'), 0, FailureHandling.OPTIONAL)

Mobile.verifyElementVisible(findTestObject('Settings/Battery/View Battery Info/android.widget.TextView3 - Charging'), 0, 
    FailureHandling.OPTIONAL)

Mobile.verifyElementVisible(findTestObject('Settings/Battery/View Battery Info/android.widget.TextView3 - Full'), 0, FailureHandling.OPTIONAL)

Mobile.verifyElementVisible(findTestObject('Settings/Battery/Battery Percentage/android.widget.TextView12 - Battery percentage'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Battery/Battery Percentage/android.widget.TextView13 - Show battery percentage in status bar'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Battery/Battery Percentage/android.widget.Switch1 - OFF'), 0)

Mobile.tap(findTestObject('Settings/Battery/Battery Percentage/android.widget.TextView12 - Battery percentage'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Battery/Battery Percentage/android.widget.Switch1 - ON'), 0)

Mobile.verifyElementNotVisible(findTestObject('Settings/Battery/Battery Percentage/android.widget.Switch1 - OFF'), 0)

Mobile.openNotifications()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Settings/Battery/Battery Percentage/android.widget.TextView1 - 100'), 0)

Mobile.closeNotifications()

Mobile.tap(findTestObject('Settings/Battery/Battery Percentage/android.widget.TextView12 - Battery percentage'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Battery/Battery Percentage/android.widget.Switch1 - OFF'), 0)

Mobile.openNotifications()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementNotVisible(findTestObject('Settings/Battery/Battery Percentage/android.widget.TextView1 - 100'), 0)

Mobile.closeNotifications()

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Battery Percentage', '', TestLinkAPIResults.TEST_PASSED)

