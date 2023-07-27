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

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.verifyElementVisible(findTestObject('Apps/Earth and Moon/android.widget.TextView0 - Done'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Earth and Moon/android.widget.TextView0 - Earth  Moon 2.9'), 3)

not_run: Mobile.verifyElementVisible(findTestObject('Apps/Earth and Moon/android.widget.TextView2 - Copyright  2019 CodeKonditor UG (haftungsbeschrnkt)'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/Earth and Moon/android.widget.TextView3 - brought to you by'), 3)

Mobile.verifyElementVisible(findTestObject('Apps/Earth and Moon/android.widget.TextView4 - Credits'), 3)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Earth & Moon App Pre-Installed', '', TestLinkAPIResults.TEST_PASSED)

