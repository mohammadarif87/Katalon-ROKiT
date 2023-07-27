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

WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Turn on Bluetooth'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)', ('deviceId') : '0123456789ABCDEF'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Turn On Bluetooth Tethering IO 3D/android.widget.TextView2 - Network  Internet'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/Turn On Bluetooth Tethering IO 3D/android.widget.TextView7 - Hotspot  tethering'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView6 - Bluetooth tethering'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView7 - Share phones Internet connection via Bluetooth'), 
    0)

if (Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.Switch1 - ON'), 
        0, FailureHandling.OPTIONAL)) {
	Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.Switch1 - ON'),
		0)
	
} else {
    
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.Switch1 - OFF'), 
        0)

    Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.TextView6 - Bluetooth tethering'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Bluetooth Tethering/android.widget.Switch1 - ON'), 
        0)
}

