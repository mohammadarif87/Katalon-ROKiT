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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Remove Google Account'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

if (Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Watch the 3D effect by turning the phone in landscape mode'), 
    0, FailureHandling.OPTIONAL)) {
    'Google Play Icon'
    Mobile.verifyElementVisible(findTestObject('Apps/Play Store/android.widget.ImageView1'), 3)
} else {
    'Google Play Icon'
    Mobile.verifyElementVisible(findTestObject('Apps/Play Store/android.widget.ImageView0'), 3)
}

not_run: Mobile.tap(findTestObject('Apps/Play Store/android.widget.ImageView0 (1)'), 0)

'Google Play text'
Mobile.verifyElementVisible(findTestObject('Apps/Play Store/android.widget.ImageView2'), 0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    not_run: Mobile.verifyElementVisible(findTestObject('Apps/Play Store/android.widget.TextView0 - Sign in to find the latest Android apps games movies music more US'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/Play Store/android.widget.TextView0 - Sign in to find the latest Android apps games movies music  more (1)'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Play Store App Pre-Installed/android.widget.TextView0 - Sign in to find the latest Android apps games movies music  more'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Play Store App Pre-Installed/android.widget.Button0 - Sign in (1)'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Play Store App Pre-Installed', '', TestLinkAPIResults.TEST_PASSED)

