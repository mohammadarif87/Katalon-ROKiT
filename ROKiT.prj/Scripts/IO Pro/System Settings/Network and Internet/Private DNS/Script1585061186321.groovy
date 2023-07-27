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

Mobile.tap(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView2 - WiFi'), 0)

Mobile.verifyElementVisible(findTestObject('Network/Aeroplane Mode/android.widget.TextView10 - Advanced'), 0)

Mobile.tap(findTestObject('Network/Aeroplane Mode/android.widget.TextView10 - Advanced'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Private DNS/android.widget.TextView13 - Private DNS'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Private DNS/android.widget.TextView14 - Automatic'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Private DNS/android.widget.TextView13 - Private DNS'), 0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/Network and internet/Private DNS/android.widget.TextView0 - Select Private DNS Mode'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Private DNS/android.widget.TextView0 - Select private DNS mode'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Private DNS/android.widget.RadioButton0 - Off'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Private DNS/android.widget.RadioButton1 - Automatic'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Private DNS/android.widget.RadioButton2 - Private DNS provider hostname'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Private DNS/android.widget.EditText0 - Enter hostname of DNS provider'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Private DNS/android.widget.Button0 - CANCEL'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Private DNS/android.widget.Button1 - SAVE'), 0)

Mobile.tap(findTestObject('Settings/Network and Internet/Private DNS/android.widget.Button1 - SAVE'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Private DNS', '', TestLinkAPIResults.TEST_PASSED)

