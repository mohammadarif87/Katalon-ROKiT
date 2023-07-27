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

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn On Now/android.widget.TextView0 - Apps  notifications'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Do Not Disturb/Do Not Disturb - Turn On Now/android.widget.TextView0 - Apps  notifications'), 
    0)

Mobile.swipe(550, 1750, 550, 300)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Battery Optimization/android.widget.TextView0 - Advanced'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Battery Optimization/android.widget.TextView0 - Advanced'), 
    0)

Mobile.swipe(550, 1750, 550, 300)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Battery Optimization/android.widget.TextView0 - Special app access'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Battery Optimization/android.widget.TextView0 - Special app access'), 
    0)

Mobile.swipe(550, 1750, 550, 300)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.TextView0 - Wi-Fi control'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.TextView0 - Wi-Fi control'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.TextView0 - Camera'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.TextView0 - Camera'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.Switch0 - ON'), 
    0)

Mobile.pressBack()

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.TextView0 - Google'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.TextView0 - Google'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.Switch0 - ON'), 
    0)

Mobile.pressBack()

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.TextView0 - Google Play services'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.TextView0 - Google Play services'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.Switch0 - ON'), 
    0)

Mobile.pressBack()

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.TextView0 - Maps'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.TextView0 - Maps'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.Switch0 - ON'), 
    0)

Mobile.pressBack()

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.TextView0 - Photos'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.TextView0 - Photos'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.Switch0 - ON'), 
    0)

Mobile.pressBack()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(512, 1700, 512, 200)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.TextView0 - ROKiT FLiX 3D'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.TextView0 - ROKiT FLiX 3D'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.Switch0 - ON'), 
    0)

'Back button'
Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.ImageButton0 (1)'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(1015, 150)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.TextView0 - Show system'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.TextView0 - Show system'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.TextView0 - Certificate Installer'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.TextView0 - Certificate Installer'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Wi-Fi control/android.widget.Switch0 - ON'), 
    0)

Mobile.pressHome()

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Wi-Fi control', '', TestLinkAPIResults.TEST_PASSED)

