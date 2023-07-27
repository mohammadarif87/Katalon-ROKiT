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

Mobile.verifyElementVisible(findTestObject('Apps/Gallery/android.widget.Button1 - ALLOW'), 0)

Mobile.tap(findTestObject('Apps/Gallery/android.widget.Button1 - ALLOW'), 0)

'Tap "shoot immediately" button to open camera'
not_run: Mobile.tapAtPosition(540, 1100)

'Shutter button'
not_run: Mobile.verifyElementVisible(findTestObject('Gallery/View Images/android.widget.ImageView3'), 0)

not_run: Mobile.tap(findTestObject('Gallery/View Images/android.widget.ImageView3'), 0)

not_run: Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.pressBack()

not_run: Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(120, 500)

'Back button'
not_run: Mobile.verifyElementVisible(findTestObject('Gallery/View Images/android.widget.ImageView0 (1)'), 2)

'Info button'
not_run: Mobile.tap(findTestObject('Gallery/View Images/android.widget.ImageView1'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

'Info button'
Mobile.tapAtPosition(974, 92)

Mobile.verifyElementVisible(findTestObject('Gallery/View Images/android.widget.TextView0 - Details'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Gallery/Details/android.widget.TextView0 - Title'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Gallery/Details/android.widget.TextView0 - Time'), 
    0)

Mobile.verifyElementVisible(findTestObject('Gallery/View Details/android.widget.TextView3 - Width 3120'), 0)

Mobile.verifyElementVisible(findTestObject('Gallery/View Details/android.widget.TextView4 - Height 4208'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Gallery/Details/android.widget.TextView0 - Maker ROKiT'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Gallery/Details/android.widget.TextView0 - Model IO Pro'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Gallery/Details/android.widget.TextView0 - ISO'), 
    0)

Mobile.verifyElementVisible(findTestObject('Gallery/View Details/android.widget.TextView8 - Flash'), 0)

Mobile.verifyElementVisible(findTestObject('Gallery/View Details/android.widget.TextView9 - Focal Length 3.46 mm'), 0)

Mobile.verifyElementVisible(findTestObject('Gallery/View Details/android.widget.TextView10 - White balance Auto'), 0)

Mobile.verifyElementVisible(findTestObject('Gallery/View Details/android.widget.TextView11 - Aperture 2.2'), 0)

Mobile.verifyElementVisible(findTestObject('Gallery/View Details/android.widget.TextView12 - Exposure time'), 0)

Mobile.tap(findTestObject('Gallery/View Images/android.widget.Button0 - CLOSE'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(120, 500)

Mobile.tap(findTestObject('Gallery/View Images/android.widget.RadioButton2 - Delete'), 0)

Mobile.verifyElementVisible(findTestObject('Gallery/View Images/android.widget.TextView0 - Delete selected item'), 0)

Mobile.tap(findTestObject('Gallery/View Images/android.widget.Button1 - OK'), 0)

Mobile.pressBack()

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Details', '', TestLinkAPIResults.TEST_PASSED)

