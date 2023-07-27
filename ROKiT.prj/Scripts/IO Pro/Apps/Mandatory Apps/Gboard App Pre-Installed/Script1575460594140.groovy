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

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('Apps/Gboard/android.widget.TextView15 - System'), 0)

Mobile.tap(findTestObject('Apps/Gboard/android.widget.TextView15 - System'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Gboard/android.widget.TextView2 - Languages input'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Gboard/android.widget.TextView3 - Gboard'), 0)

Mobile.tap(findTestObject('Apps/Gboard/android.widget.TextView2 - Languages input'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Gboard/android.widget.TextView5 - Virtual keyboard'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Gboard/android.widget.TextView6 - Gboard Google voice typing'), 0)

Mobile.tap(findTestObject('Apps/Gboard/android.widget.TextView5 - Virtual keyboard'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Gboard/android.widget.TextView2 - Gboard'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Gboard/android.widget.TextView3 - Multilingual typing'), 0)

Mobile.tap(findTestObject('Apps/Gboard/android.widget.TextView2 - Gboard'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Gboard/android.widget.TextView0 - Settings'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Gboard App Pre-Installed', '', TestLinkAPIResults.TEST_PASSED)

