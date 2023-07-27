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

Mobile.pressHome()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(512, 1700, 512, 400)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(512, 1700, 512, 400)

Mobile.verifyElementVisible(findTestObject('Apps/Sound Recorder/android.widget.TextView21 - Sound Recorder'), 0)

Mobile.tap(findTestObject('Apps/Sound Recorder/android.widget.TextView21 - Sound Recorder'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Sound Recorder/android.widget.TextView0 - Sound Recorder (1)'), 0)

'Record button'
Mobile.verifyElementVisible(findTestObject('Apps/Sound Recorder/android.widget.ImageButton1 (1)'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Launch Sound Recorder', '', TestLinkAPIResults.TEST_PASSED)

