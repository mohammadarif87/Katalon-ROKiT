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

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView8 - Apps  notifications'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView8 - Apps  notifications'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/View Recently Opened Apps/android.widget.TextView2 - Recently opened apps'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView18 - See all 42 apps'), 
    0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView18 - See all 42 apps'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView0 - App info'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView1 - All apps'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView2 - 3D Camera'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView4 - 3D Gallery'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView6 - 3DFV'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView12 - Calculator'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView14 - Calendar'), 
    0)

'Three dots'
Mobile.tap(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.ImageButton1'), 0)

Mobile.tap(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView0 - Show system'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView8 - Android Accessibility Suite'), 
    5)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView10 - Android Easter Egg'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView12 - Android Services Library'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView14 - Android Setup'), 
    0)

Mobile.swipe(512, 900, 512, 200)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView8 - Android Shared Library'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.getText(findTestObject('System Settings/Apps And Notifications/See All Apps/android.widget.TextView0 - Android System'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView10 - Android system'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView12 - Android System WebView'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Apps and Notifications/See All Apps/android.widget.TextView15 - android.auto_generated_rro__'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('See all apps', '', TestLinkAPIResults.TEST_PASSED)

