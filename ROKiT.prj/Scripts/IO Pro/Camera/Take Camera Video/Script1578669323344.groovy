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

'Video Mode button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView4'), 0)

'Video Mode button'
Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageView4'), 0)

'Shutter button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView3'), 0)

'Shutter button'
Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageView3'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Shutter button'
Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageView3'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Gallery button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView1'), 0)

'Gallery button'
Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageView1'), 0)

'Info button'
Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera Resolution/android.widget.TextView1'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'("Take a video", "", TestLinkAPIResults.TEST_PASSED)