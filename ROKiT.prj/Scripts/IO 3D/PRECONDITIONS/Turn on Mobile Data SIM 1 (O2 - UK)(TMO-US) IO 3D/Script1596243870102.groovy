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

WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Set Mobile Data to SIM 1 (O2-UK) IO 3D'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1)'
            , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.tap(findTestObject('Phone App/3G Fallback (SIM 1 O2-UK)/android.widget.TextView3 - Network  Internet'), 0)

Mobile.tap(findTestObject('Preconditions/Turn on Mobile Data (O2 - UK)/android.widget.TextView4 - Mobile network'), 0)

not_run: Mobile.tap(findTestObject('Preconditions/Turn on Mobile Data (O2 - UK)/android.widget.TextView1 - O2 - UK'), 0)

'SIM 1'
Mobile.tap(findTestObject('Preconditions/Turn on Mobile Data (O2 - UK)/android.widget.LinearLayout1'), 0)

not_run: Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Mobile Data (O2 - UK)/android.widget.TextView3 - Mobile data'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Mobile Data (O2 - UK)/android.widget.TextView4 - Access data using mobile network'), 
    0)

not_run: if (Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Mobile Data (O2 - UK)/android.widget.Switch0 - ON'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.comment('If Mobile data is off then tap off to turn on')

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Mobile Data (O2 - UK)/android.widget.Switch0 - ON'), 
        0)
} else {
    Mobile.comment('Else if Mobile data is on then verify it')

    Mobile.tap(findTestObject('Preconditions/Turn on Mobile Data (O2 - UK)/android.widget.Switch0 - OFF'), 0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Mobile Data (O2 - UK)/android.widget.Switch0 - ON'), 
        0)
}

