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

Mobile.verifyElementVisible(findTestObject('Settings/Battery/Adaptive Battery/android.widget.TextView10 - Adaptive Battery'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/Battery/android.widget.TextView0 - On  Detecting when apps drain battery'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Settings/Battery/Adaptive Battery/android.widget.TextView11 - Ondetecting when apps drain battery'), 
        0)
}

Mobile.tap(findTestObject('Settings/Battery/Adaptive Battery/android.widget.TextView10 - Adaptive Battery'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Battery/Adaptive Battery/android.widget.TextView2 - Use Adaptive Battery'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Battery/Adaptive Battery/android.widget.TextView3 - Limit battery for apps that you dont use often'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Battery/Adaptive Battery/android.widget.Switch0 - ON'), 0)

Mobile.tap(findTestObject('Settings/Battery/Adaptive Battery/android.widget.TextView2 - Use Adaptive Battery'), 0)

Mobile.verifyElementNotVisible(findTestObject('Settings/Battery/Adaptive Battery/android.widget.Switch0 - ON'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Battery/Adaptive Battery/android.widget.Switch0 - OFF'), 0)

Mobile.tap(findTestObject('Settings/Battery/Adaptive Battery/android.widget.TextView2 - Use Adaptive Battery'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Battery/Adaptive Battery/android.widget.Switch0 - ON'), 0)

Mobile.verifyElementNotVisible(findTestObject('Settings/Battery/Adaptive Battery/android.widget.Switch0 - OFF'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Settings Adaptive Battery', '', TestLinkAPIResults.TEST_PASSED)

