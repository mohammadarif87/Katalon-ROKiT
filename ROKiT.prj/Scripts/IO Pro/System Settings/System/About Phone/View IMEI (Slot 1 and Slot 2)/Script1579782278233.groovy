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

Mobile.scrollToText('Android version')

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView2 - IMEI (sim slot 1)'), 
        0)

    'IMEI 1'
    Mobile.verifyElementVisible(findTestObject('About Phone/IMEI (via Settings)/android.widget.TextView0 - 352322100863861'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView4 - IMEI (sim slot 2)'), 
        0)

    'IMEI 2'
    Mobile.verifyElementVisible(findTestObject('About Phone/IMEI (via Settings)/android.widget.TextView0 - 352322100863879'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView2 - IMEI (sim slot 1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView0 - IMEI (sim slot 1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView1 - IMEI'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView0 - 352322100863861'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView3 - IMEI SV'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView4 - 78'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.Button0 - OK'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView4 - IMEI (sim slot 2)'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView4 - IMEI (sim slot 2)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView0 - IMEI (sim slot 2)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView1 - IMEI'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView0 - 352322100863879'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView3 - IMEI SV'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView4 - 78'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.Button0 - OK'), 
        0)
} else if (userName == 'Ovi') {
    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView2 - IMEI (sim slot 1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView0 - 353591100091595'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView4 - IMEI (sim slot 2)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView0 - 353591100091603'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView2 - IMEI (sim slot 1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView0 - IMEI (sim slot 1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView1 - IMEI'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView0 - 353591100091595 (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView3 - IMEI SV'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView4 - 78'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.Button0 - OK'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView4 - IMEI (sim slot 2)'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView4 - IMEI (sim slot 2)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView0 - IMEI (sim slot 2)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView1 - IMEI'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView0 - 353591100091603 (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView3 - IMEI SV'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView4 - 78'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.Button0 - OK'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView2 - IMEI (sim slot 1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView3 - 353591100010074'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView4 - IMEI (sim slot 2)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView5 - 353591100010082'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView2 - IMEI (sim slot 1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView0 - IMEI (sim slot 1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView1 - IMEI'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView2 - 353591100010074'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView3 - IMEI SV'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView4 - 78'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.Button0 - OK'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView4 - IMEI (sim slot 2)'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView4 - IMEI (sim slot 2)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView0 - IMEI (sim slot 2)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView1 - IMEI'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView2 - 353591100010082'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView3 - IMEI SV'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.TextView4 - 78'), 
        0)

    Mobile.tap(findTestObject('Settings/System/About Phone/View IMEI (Slot 1 and Slot 2)/android.widget.Button0 - OK'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('View IMEI', '', TestLinkAPIResults.TEST_PASSED)

