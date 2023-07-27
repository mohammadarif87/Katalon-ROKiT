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

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.TextView0 - Do Not Disturb access'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.TextView0 - Do Not Disturb access'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.TextView0 - Android Accessibility Suite'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.TextView0 - Android Accessibility Suite'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - DENY'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - ALLOW'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - ALLOW'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Switch0 - ON'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Switch0 - ON'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - CANCEL'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - OK'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - OK'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Switch0 - ON (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.TextView0 - Digital Wellbeing'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.TextView0 - Digital Wellbeing'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - CANCEL (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - OK (1)'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - OK (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Switch0 - OFF'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.TextView3 - Digital Wellbeing'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - DENY (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - ALLOW (1)'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - ALLOW (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.TextView0 - Google'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.TextView0 - Google'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - DENY (2)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - ALLOW (2)'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - DENY (2)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.TextView0 - Google Backup Transport'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.TextView0 - Google Backup Transport'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - DENY (2)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - ALLOW (2)'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - DENY (2)'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.TextView5 - Google'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - DENY (2)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - ALLOW (2)'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - DENY (2)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.TextView0 - Google Play services'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.TextView0 - Google Play services'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - DENY (2)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - ALLOW (2)'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - DENY (2)'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.TextView6 - Google Backup Transport'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - DENY (2)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - ALLOW (2)'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - DENY (2)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.TextView0 - Google Services Framework'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.TextView0 - Google Services Framework'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - DENY (2)'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - ALLOW (2)'), 
    0)

Mobile.tap(findTestObject('System Settings/Apps And Notifications/Special App Access/Do Not Disturb access/android.widget.Button0 - DENY (2)'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Do Not Disturb access', '', TestLinkAPIResults.TEST_PASSED)

