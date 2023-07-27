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

'Show Keypad button'
Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Call button'
Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2 (1)'), 0)

'* Key'
Mobile.tapAtPosition(190, 1654)

'# Key'
Mobile.tapAtPosition(880, 1654)

'0 Key'
Mobile.tapAtPosition(540, 1654)

Mobile.tap(findTestObject('About Phone/IMEI (via USSD code)/android.widget.TextView9 - 6'), 0)

'# Key'
Mobile.tapAtPosition(880, 1654)

Mobile.verifyElementVisible(findTestObject('About Phone/IMEI (via USSD code)/android.widget.TextView0 - IMEI'), 0)

userName = System.getProperty('user.name')

if ((userName == 'User') || (userName == 'ROKiT')) {
    Mobile.verifyElementVisible(findTestObject('About Phone/IMEI (via USSD code)/android.widget.TextView1 - IMEI1353591100010074'), 
        0)

    Mobile.verifyElementVisible(findTestObject('About Phone/IMEI (via USSD code)/android.widget.TextView2 - IMEI2353591100010082'), 
        0)

    Mobile.tap(findTestObject('About Phone/IMEI (via USSD code)/android.widget.Button0 - OK'), 0)

    Mobile.closeApplication()
} else if (userName == 'Ovi') {
    Mobile.verifyElementVisible(findTestObject('About Phone/IMEI (via USSD code)/android.widget.TextView0 - IMEI1353591100091595'), 
        0)

    Mobile.verifyElementVisible(findTestObject('About Phone/IMEI (via USSD code)/android.widget.TextView0 - IMEI2353591100091603'), 
        0)

    Mobile.tap(findTestObject('About Phone/IMEI (via USSD code)/android.widget.Button0 - OK (1)'), 0)

    Mobile.closeApplication()
} else if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('About Phone/IMEI (via USSD code)/android.widget.TextView0 - IMEI1352322100863861'), 
        0)

    Mobile.verifyElementVisible(findTestObject('About Phone/IMEI (via USSD code)/android.widget.TextView0 - IMEI2352322100863879'), 
        0)

    Mobile.tap(findTestObject('About Phone/IMEI (via USSD code)/android.widget.Button0 - OK (2)'), 0)

    Mobile.closeApplication()
}

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('IMEIs (via USSD code)', '', TestLinkAPIResults.TEST_PASSED)

