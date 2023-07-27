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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.tap(findTestObject('Phone App/3G Fallback (SIM 1 O2-UK)/android.widget.TextView3 - Network  Internet'), 0)

Mobile.tap(findTestObject('Phone App/3G Fallback (SIM 1 O2-UK)/android.widget.TextView9 - SIM cards'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Set SMS to O2/android.widget.TextView11 - SMS messages'), 0)

Mobile.tap(findTestObject('Preconditions/Set SMS to O2/android.widget.TextView11 - SMS messages'), 0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Set SMS to O2/android.widget.TextView0 - Select SIM card'), 0)

'SIM 1 O2-UK Icon'
Mobile.tap(findTestObject('Phone App/3G Fallback (SIM 1 O2-UK)/android.widget.ImageView0'), 0)

Mobile.pressHome()

