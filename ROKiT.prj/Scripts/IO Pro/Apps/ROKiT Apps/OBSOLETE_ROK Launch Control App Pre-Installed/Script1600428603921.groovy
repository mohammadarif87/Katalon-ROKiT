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

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.TextView0 - Allow ROK Launch Control to access this devices location'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button0 - DENY'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 0)

Mobile.tap(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.TextView0 - Allow ROK Launch Control to make and manage phone calls'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button0 - DENY'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 0)

Mobile.tap(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Apps/ROK Launch Control/android.widget.Button0 - LOGIN TO ROKIT LAUNCH CONTROL'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('ROKiT Launch Control App Pre-Installed', 
    '', TestLinkAPIResults.TEST_PASSED)

