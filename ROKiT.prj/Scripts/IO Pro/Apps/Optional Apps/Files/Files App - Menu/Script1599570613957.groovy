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

Mobile.verifyElementVisible(findTestObject('Apps/Files/android.widget.TextView0 - Downloads'), 3)

'3 lines menu on top left'
Mobile.verifyElementVisible(findTestObject('Apps/Optional Apps/Files/Files App - Menu/android.widget.ImageButton0'), 3)

'3 lines menu on top left'
Mobile.tap(findTestObject('Apps/Optional Apps/Files/Files App - Menu/android.widget.ImageButton0'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Optional Apps/Files/Files App - Menu/android.widget.TextView0 - Images'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/Optional Apps/Files/Files App - Menu/android.widget.TextView0 - Videos'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/Optional Apps/Files/Files App - Menu/android.widget.TextView0 - Audio'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/Optional Apps/Files/Files App - Menu/android.widget.TextView0 - Recent'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/Optional Apps/Files/Files App - Menu/android.widget.TextView0 - Downloads'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/Optional Apps/Files/Files App - Menu/android.widget.TextView0 - IO Pro'), 
    0)

Mobile.tap(findTestObject('Apps/Optional Apps/Files/Files App - Menu/android.widget.TextView0 - IO Pro'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Optional Apps/Files/Files App - Menu/android.widget.TextView0 - Android'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/Optional Apps/Files/Files App - Menu/android.widget.TextView0 - Pictures'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/Optional Apps/Files/Files App - Menu/android.widget.TextView0 - DCIM'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/Optional Apps/Files/Files App - Menu/android.widget.TextView0 - Download'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/Optional Apps/Files/Files App - Menu/android.widget.TextView0 - Movies'), 
    3)

'\r\n'
Mobile.verifyElementVisible(findTestObject('Apps/Optional Apps/Files/Files App - Menu/android.widget.TextView0 - Music'), 
    3)

'3 lines menu top left'
Mobile.tap(findTestObject('Apps/Optional Apps/Files/Files App - Menu/android.widget.ImageButton0 (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Optional Apps/Files/Files App - Menu/android.widget.TextView0 - Bug reports'), 
    3)

'Drive only present when google account is added.'
not_run: Mobile.verifyElementVisible(findTestObject('Apps/Optional Apps/Files/Files App - Menu/android.widget.TextView0 - Drive'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Files App - Menu', '', TestLinkAPIResults.TEST_PASSED)

