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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, appActivity)

Mobile.openNotifications()

'Waiting for Answer Call button'
Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.Button2 - ANSWER'), 300)

'Tap Answer Call button'
Mobile.tap(findTestObject('Phone App/Receive a call/android.widget.Button2 - ANSWER'), 0)

Mobile.closeNotifications()

'Mute'
Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.ImageView2'), 0)

'Keypad'
Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.ImageView3'), 0)

'Speaker'
Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.ImageView4'), 0)

'Add call'
Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.ImageView5'), 0)

'Hold'
Mobile.verifyElementVisible(findTestObject('Phone App/Receive a call/android.widget.ImageView6'), 0)

Mobile.waitForElementPresent(findTestObject('Phone App/Place Call (SIM 1 - O2-UK)/android.widget.ImageButton2'), 0)

