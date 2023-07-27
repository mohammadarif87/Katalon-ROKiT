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

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('About Phone/Baseband Version/android.widget.TextView15 - System'), 0)

Mobile.tap(findTestObject('About Phone/Baseband Version/android.widget.TextView15 - System'), 0)

Mobile.verifyElementVisible(findTestObject('About Phone/Baseband Version/android.widget.TextView9 - Advanced'), 0)

Mobile.tap(findTestObject('About Phone/Baseband Version/android.widget.TextView9 - Advanced'), 0)

Mobile.verifyElementVisible(findTestObject('About Phone/Baseband Version/android.widget.TextView16 - About phone'), 0)

Mobile.tap(findTestObject('About Phone/Baseband Version/android.widget.TextView16 - About phone'), 0)

Mobile.scrollToText('IMEI (sim slot 1)', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('About Phone/IMEI (via Settings)/android.widget.TextView2 - IMEI (sim slot 1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('About Phone/IMEI (via Settings)/android.widget.TextView4 - IMEI (sim slot 2)'), 
    0)

userName = System.getProperty('user.name')

if ((userName == 'User') || (userName == 'ROKiT')) {
    'IMEI 1'
    Mobile.verifyElementVisible(findTestObject('About Phone/IMEI (via Settings)/android.widget.TextView3 - 353591100010074'), 
        0)

    'IMEI 2'
    Mobile.verifyElementVisible(findTestObject('About Phone/IMEI (via Settings)/android.widget.TextView5 - 353591100010082'), 
        0)

    Mobile.closeApplication()
} else if (userName == 'Ovi') {
    'IMEI 1'
    Mobile.verifyElementVisible(findTestObject('About Phone/IMEI (via Settings)/android.widget.TextView0 - 353591100091595'), 
        0)

    'IMEI 2\r\n'
    Mobile.verifyElementVisible(findTestObject('About Phone/IMEI (via Settings)/android.widget.TextView0 - 353591100091603'), 
        0)

    Mobile.closeApplication()
} else if (userName == 'Aiden') {
    'IMEI 1'
    Mobile.verifyElementVisible(findTestObject('About Phone/IMEI (via Settings)/android.widget.TextView0 - 352322100863861'), 
        0)

    'IMEI 2'
    Mobile.verifyElementVisible(findTestObject('About Phone/IMEI (via Settings)/android.widget.TextView0 - 352322100863879'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('IMEIs (via Settings menu)', '', TestLinkAPIResults.TEST_PASSED)

