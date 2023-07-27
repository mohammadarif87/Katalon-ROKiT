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

'Shutter button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView3'), 0)

'Shutter button'
Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageView3'), 0)

'Gallery button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView1'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Gallery button'
Mobile.tap(findTestObject('Apps/Camera/android.widget.ImageView1'), 0)

'Info button'
Mobile.verifyElementVisible(findTestObject('Camera/Rear Camera Resolution/android.widget.TextView1'), 2)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Take a photo', '', TestLinkAPIResults.TEST_PASSED)

