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

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'0 on Dial pad'
Mobile.verifyElementVisible(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.TextView18 - 0'), 3)

'Tap at Position because sometimes the call button was being pressed instead of 0'
not_run: Mobile.tapAtPosition(545, 1645)

'Press \'*\''
Mobile.tapAtPosition(195, 1663)

Mobile.tap(findTestObject('About Phone/MEID (US CDMA via USSD Code)/android.widget.TextView0 - '), 0)

Mobile.tap(findTestObject('About Phone/MEID (US CDMA via USSD Code)/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('About Phone/MEID (US CDMA via USSD Code)/android.widget.TextView0 - 6'), 0)

Mobile.tap(findTestObject('About Phone/MEID (US CDMA via USSD Code)/android.widget.TextView0 - '), 0)

'Header'
Mobile.verifyElementVisible(findTestObject('About Phone/MEID (US CDMA via USSD Code)/android.widget.TextView0 - IMEI'), 
    3)

Mobile.verifyElementVisible(findTestObject('About Phone/MEID (US CDMA via USSD Code)/android.widget.TextView0 - MEID35232210089888'), 
    3)

Mobile.tap(findTestObject('About Phone/MEID (US CDMA via USSD Code)/android.widget.Button0 - OK'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('MEID (US CDMA only via USSD code)', '', 
    TestLinkAPIResults.TEST_PASSED)

