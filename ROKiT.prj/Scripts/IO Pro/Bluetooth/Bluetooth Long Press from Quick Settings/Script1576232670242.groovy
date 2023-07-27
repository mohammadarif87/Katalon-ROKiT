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

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn off Bluetooth'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.pressHome()

Mobile.openNotifications()

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    not_run: Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Long Press from Quick Settings/android.widget.Switch0 - Off'), 
        0)

    Mobile.tapAndHold(findTestObject('Bluetooth/Bluetooth Long Press from Quick Settings/android.widget.ImageView0'), 0, 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Enable-Disable from Quick Settings/android.widget.Switch1 - Off'), 
        0)

    Mobile.tapAndHold(findTestObject('Bluetooth/Bluetooth Enable-Disable from Quick Settings/android.widget.FrameLayout13'), 
        0, 0)
}

Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Long Press from Quick Settings/android.widget.TextView0 - Connected devices'), 
    0)

Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Long Press from Quick Settings/android.widget.TextView5 - Pair new device'), 
    0)

Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Long Press from Quick Settings/android.widget.TextView6 - Bluetooth will turn on to pair'), 
    0)

Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Long Press from Quick Settings/android.widget.TextView8 - Connection preferences'), 
    0)

Mobile.verifyElementVisible(findTestObject('Bluetooth/Bluetooth Long Press from Quick Settings/android.widget.TextView9 - Bluetooth'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Bluetooth Long Press', '', TestLinkAPIResults.TEST_PASSED)

