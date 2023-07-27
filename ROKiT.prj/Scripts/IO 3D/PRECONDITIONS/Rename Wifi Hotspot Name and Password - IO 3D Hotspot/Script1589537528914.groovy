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

Mobile.verifyElementVisible(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.tap(findTestObject('Customisation/Wi-Fi Hotspot Name/android.widget.TextView4 - Network  Internet'), 0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/Rename Wifi Hotspot - IO 3D Hotspot/android.widget.TextView7 - Hotspot  tethering'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/Rename Wifi Hotspot - IO 3D Hotspot/android.widget.TextView7 - Hotspot  tethering'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/Rename Wifi Hotspot - IO 3D Hotspot/android.widget.TextView5 - Wi-Fi hotspot'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/Rename Wifi Hotspot - IO 3D Hotspot/android.widget.TextView5 - Wi-Fi hotspot'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/Rename Wifi Hotspot - IO 3D Hotspot/android.widget.TextView0 - Wi-Fi hotspot'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/Rename Wifi Hotspot - IO 3D Hotspot/android.widget.TextView4 - Set up WiFi hotspot'), 
    0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/Rename Wifi Hotspot - IO 3D Hotspot/android.widget.TextView4 - Set up WiFi hotspot'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/Rename Wifi Hotspot - IO 3D Hotspot/android.widget.TextView0 - Set up WiFi hotspot'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/Rename Wifi Hotspot - IO 3D Hotspot/android.widget.TextView1 - Network name'), 
    3)

if (Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/Rename Wifi Hotspot - IO 3D Hotspot/android.widget.EditText0 - IO 3D Hotspot'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/Rename Wifi Hotspot - IO 3D Hotspot/android.widget.EditText0 - IO 3D Hotspot'), 
        0)
} else {
    Mobile.tapAtPosition(580, 290)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tapAndHoldAtPosition(670, 1190, 3)

    Mobile.setText(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/Rename Wifi Hotspot - IO 3D Hotspot/android.widget.EditText0 - Enter the SSID'), 
        'IO 3D Hotspot', 0)
}

Mobile.comment('Change Hotspot Password')

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/Rename Wifi Hotspot - IO 3D Hotspot/android.widget.TextView4 - Password'), 
    0)

Mobile.tapAtPosition(580, 550)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(670, 1190, 4)

Mobile.setText(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/Rename Wifi Hotspot - IO 3D Hotspot/android.widget.EditText1'), 
    '12345678', 0)

Mobile.tap(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/Rename Wifi Hotspot - IO 3D Hotspot/android.widget.Button1 - SAVE'), 
    0)

Mobile.verifyElementVisible(findTestObject('Settings/Network and Internet/Hotspot And Tethering/Wi-Fi hotspot tethering function/Rename Wifi Hotspot - IO 3D Hotspot/android.widget.TextView5 - IO 3D Hotspot WPA2 PSK hotspot'), 
    0)

Mobile.closeApplication()

