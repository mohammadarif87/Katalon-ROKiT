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

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView0 - ALARM'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView1 - CLOCK'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView2 - TIMER'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/android.widget.TextView3 - STOPWATCH'), 0)

'World clock button '
Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add world clock/android.widget.ImageButton0'), 0)

'World clock button '
Mobile.tap(findTestObject('Apps/Clock/Add world clock/android.widget.ImageButton0'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add world clock/android.widget.TextView0 - Abidjan'), 0)

Mobile.tap(findTestObject('Apps/Clock/Add world clock/android.widget.TextView0 - Abidjan'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add world clock/android.widget.TextView0 - Accra'), 0)

Mobile.tap(findTestObject('Apps/Clock/Add world clock/android.widget.TextView0 - Accra'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add world clock/android.widget.TextView0 - Addis Ababa'), 0)

Mobile.tap(findTestObject('Apps/Clock/Add world clock/android.widget.TextView0 - Addis Ababa'), 0)

Mobile.pressBack()

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add world clock/android.widget.TextView0 - Abidjan (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add world clock/android.widget.TextView0 - Accra (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add world clock/android.widget.TextView0 - Addis Ababa (1)'), 0)

'World clock button'
Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add world clock/android.widget.ImageButton0'), 0)

'World clock button'
Mobile.tap(findTestObject('Apps/Clock/Add world clock/android.widget.ImageButton0'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add world clock/android.widget.TextView0 - Abidjan (2)'), 0)

Mobile.tap(findTestObject('Apps/Clock/Add world clock/android.widget.TextView0 - Abidjan (2)'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add world clock/android.widget.TextView0 - Accra (2)'), 0)

Mobile.tap(findTestObject('Apps/Clock/Add world clock/android.widget.TextView0 - Accra (2)'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Clock/Add world clock/android.widget.TextView0 - Addis Ababa (2)'), 0)

Mobile.tap(findTestObject('Apps/Clock/Add world clock/android.widget.TextView0 - Addis Ababa (2)'), 0)

Mobile.pressBack(FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Add world clock', '', TestLinkAPIResults.TEST_PASSED)

