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

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Add Google Account'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], 
        FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.scrollToText('Google')

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Google'), 
        3)

    Mobile.tap(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Google'), 3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Data management/android.widget.TextView0 - Rokit Phones'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Data management/android.widget.TextView0 - rokitphones715gmail.com'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Google (1)'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.Button0 - Manage your Google Account'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Account services'), 
        3)

    Mobile.swipe(512, 1700, 512, 900)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Ads'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Backup'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Chromebook'), 
        3)

    Mobile.swipe(512, 1700, 512, 1400)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Data management/android.widget.TextView0 - Data  messaging'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Device connections'), 
        3)

    Mobile.scrollToText('Ads', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Ads'), 3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.TextView0 - Reset advertising ID'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.TextView0 - Opt out of Ads Personalization'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.Switch0 - OFF'), 3)

    Mobile.tap(findTestObject('System Settings/Google/Service - Ads/android.widget.Switch0 - OFF'), 3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.TextView0 - Opt out of interest-based ads'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.Button0 - CANCEL'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.Button0 - OK'), 3)

    Mobile.tap(findTestObject('System Settings/Google/Service - Ads/android.widget.Button0 - OK'), 3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.Switch0 - ON'), 3)

    Mobile.tap(findTestObject('System Settings/Google/Service - Ads/android.widget.Switch0 - ON'), 3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.TextView0 - Ads by Google'), 
        3)

    Mobile.tap(findTestObject('System Settings/Google/Service - Ads/android.widget.TextView0 - Ads by Google'), 3)

    'Google support web page\r\n'
    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.view.View0'), 3)

    Mobile.pressBack()

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.TextView0 - Your advertising ID'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.TextView0 - Reset advertising ID'), 
        3)

    Mobile.tap(findTestObject('System Settings/Google/Service - Ads/android.widget.TextView0 - Reset advertising ID'), 3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.TextView0 - Reset advertising ID (1)'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.TextView0 - This will replace your advertising ID with a new random number.'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.Button0 - CANCEL (1)'), 
        3)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.Button0 - OK (1)'), 
        3)

    Mobile.tap(findTestObject('System Settings/Google/Service - Ads/android.widget.Button0 - OK (1)'), 0)
} else {
    WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Add Google Account'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
                , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.scrollToText('Google')

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Google'), 
        0)

    Mobile.tap(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Google'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - ROKiT Test'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - rokittest1gmail.com'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Google (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.Button0 - Manage your Google Account'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Account services'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Ads'), 
        0)

    Mobile.swipe(512, 1700, 512, 1400)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Backup'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Chromebook'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Data management/android.widget.TextView0 - Data and messaging'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Device connections'), 
        0)

    Mobile.scrollToText('Ads', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('System Settings/Google/View Account info/android.widget.TextView0 - Ads'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.TextView0 - Reset advertising ID'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.TextView0 - Opt out of Ads Personalisation'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.Switch0 - OFF'), 0)

    Mobile.tap(findTestObject('System Settings/Google/Service - Ads/android.widget.Switch0 - OFF'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.TextView0 - Opt out of interest-based ads'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.Button0 - CANCEL'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.Button0 - OK'), 0)

    Mobile.tap(findTestObject('System Settings/Google/Service - Ads/android.widget.Button0 - OK'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.Switch0 - ON'), 0)

    Mobile.tap(findTestObject('System Settings/Google/Service - Ads/android.widget.Switch0 - ON'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.TextView0 - Ads by Google'), 
        0)

    Mobile.tap(findTestObject('System Settings/Google/Service - Ads/android.widget.TextView0 - Ads by Google'), 0)

    'Google support web page\r\n'
    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.view.View0'), 0)

    Mobile.pressBack()

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.TextView0 - Your advertising ID'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.TextView0 - Reset advertising ID'), 
        0)

    Mobile.tap(findTestObject('System Settings/Google/Service - Ads/android.widget.TextView0 - Reset advertising ID'), 0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.TextView0 - Reset advertising ID (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.TextView0 - This will replace your advertising ID with a new random number.'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.Button0 - CANCEL (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/Google/Service - Ads/android.widget.Button0 - OK (1)'), 
        0)

    Mobile.tap(findTestObject('System Settings/Google/Service - Ads/android.widget.Button0 - OK (1)'), 0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Service - Ads', '', TestLinkAPIResults.TEST_PASSED)

