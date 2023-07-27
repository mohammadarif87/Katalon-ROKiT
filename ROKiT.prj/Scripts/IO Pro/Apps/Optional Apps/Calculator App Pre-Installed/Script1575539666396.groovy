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

import testlink.api.java.client.TestLinkAPIResults

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Apps/Calculator/android.widget.Button0 - 7'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Calculator/android.widget.Button1 - 8'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Calculator/android.widget.Button2 - 9'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Calculator/android.widget.Button3 - 4'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Calculator/android.widget.Button4 - 5'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Calculator/android.widget.Button5 - 6'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Calculator/android.widget.Button6 - 1'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Calculator/android.widget.Button7 - 2'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Calculator/android.widget.Button8 - 3'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Calculator/android.widget.Button9 - .'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Calculator/android.widget.Button10 - 0'), 0)

'Equals Icon'
Mobile.verifyElementVisible(findTestObject('Apps/Calculator/android.widget.Button11 - '), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Calculator/android.widget.Button12 - DEL'), 0)

'Divide Icon'
Mobile.verifyElementVisible(findTestObject('Apps/Calculator/android.widget.Button13 - '), 0)

'Multiply Icon'
Mobile.verifyElementVisible(findTestObject('Apps/Calculator/android.widget.Button14 - '), 0)

'Subtract Icon'
Mobile.verifyElementVisible(findTestObject('Apps/Calculator/android.widget.Button15 - '), 0)

'Add Icon'
Mobile.verifyElementVisible(findTestObject('Apps/Calculator/android.widget.Button16 - '), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'("Calculator App Pre-Installed", "", TestLinkAPIResults.TEST_PASSED)