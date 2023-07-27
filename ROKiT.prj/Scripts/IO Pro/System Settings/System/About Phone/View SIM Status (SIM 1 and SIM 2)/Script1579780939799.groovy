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

Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView15 - System'), 
    0)

Mobile.tap(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView15 - System'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView9 - Advanced'), 
    0)

Mobile.tap(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView9 - Advanced'), 0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView16 - About phone'), 
    0)

Mobile.tap(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView16 - About phone'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView12 - SIM status (sim slot 1)'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView0 - T-Mobile'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView12 - SIM status (sim slot 1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView0 - SIM status (sim slot 1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView1 - Network'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView0 - T-Mobile (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView0 - 1-478-777-7307'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView5 - Mobile network state'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView0 - Service state'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView9 - Signal strength'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView11 - Mobile voice network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView13 - Mobile data network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView15 - Roaming'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView0 - Not Roaming'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.Button0 - OK'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView14 - SIM status (sim slot 2)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView0 - ATT'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView14 - SIM status (sim slot 2)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView0 - SIM status (sim slot 2)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView1 - Network'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView0 - ATT (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView0 - 1-424-416-9828'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView5 - Mobile network state'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView0 - Service state'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView9 - Signal strength'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView11 - Mobile voice network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView13 - Mobile data network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView15 - Roaming'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView0 - Not Roaming'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.Button0 - OK'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView13 - O2 - UK'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView12 - SIM status (sim slot 1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView0 - SIM status (sim slot 1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView1 - Network'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView2 - O2 - UK'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView5 - Mobile network state'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView7 - Service status'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView9 - Signal strength'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView11 - Mobile voice network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView13 - Mobile data network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView15 - Roaming'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView16 - Not roaming'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.Button0 - OK'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView14 - SIM status (sim slot 2)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView15 - EE'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView14 - SIM status (sim slot 2)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView0 - SIM status (sim slot 2)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView1 - Network'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView2 - EE'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView4 - 07985363224'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView5 - Mobile network state'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView7 - Service status'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView9 - Signal strength'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView11 - Mobile voice network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView13 - Mobile data network type'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView15 - Roaming'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.TextView16 - Not roaming'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View SIM Status (SIM 1 and SIM 2)/android.widget.Button0 - OK'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('View SIM status', 'SIM 1 = O2-UK\nSIM 2 = EE', 
    TestLinkAPIResults.TEST_PASSED)

