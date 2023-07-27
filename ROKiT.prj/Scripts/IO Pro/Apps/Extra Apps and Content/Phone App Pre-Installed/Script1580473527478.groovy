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

//Mobile.startApplication('appPath', false)
CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

'Search Contacts'
Mobile.verifyElementVisible(findTestObject('Phone App/Launch Phone App/android.widget.TextView4 - Search contacts'), 0)

'Favourites'
Mobile.verifyElementVisible(findTestObject('Phone App/Launch Phone App/android.widget.RelativeLayout0'), 0)

'Recent'
Mobile.verifyElementVisible(findTestObject('Phone App/Launch Phone App/android.widget.RelativeLayout1'), 0)

'Contacts'
Mobile.verifyElementVisible(findTestObject('Phone App/Launch Phone App/android.widget.RelativeLayout2'), 0)

'Keypad button'
Mobile.verifyElementVisible(findTestObject('Phone App/Launch Phone App/android.widget.ImageButton2'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'("Phone/Dialer App Pre-Installed", "", TestLinkAPIResults.TEST_PASSED)