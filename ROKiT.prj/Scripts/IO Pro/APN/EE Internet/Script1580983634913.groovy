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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

'Swipe in Settings'
device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startX = device_Width / 2

int endX = startX

int startY = device_Height * 0.85 // starts almost at the bottom of the screen

int endY = device_Height * 0.5 // stops scrolling almost at the top of the screen

Mobile.tap(findTestObject('APN/IO Pro/O2-UK APN/android.widget.TextView4 - Network  Internet'), 0)

Mobile.tap(findTestObject('APN/IO Pro/O2-UK APN/android.widget.TextView4 - Mobile network'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView2 - EE'), 0)

Mobile.tap(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView2 - EE'), 0)

Mobile.tap(findTestObject('APN/IO Pro/O2-UK APN/android.widget.TextView9 - Advanced'), 0)

Mobile.swipe(startX, startY, endX, endY)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/O2-UK APN/android.widget.TextView14 - Access point names'), 0)

Mobile.tap(findTestObject('APN/IO Pro/O2-UK APN/android.widget.TextView14 - Access point names'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView3 - ' + carrier_EEInternet), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView4 - ' + apn_everywhere), 0)

Mobile.tap(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView3 - ' + carrier_EEInternet), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView2 - Name'), 0)

Mobile.verifyElementVisible(findTestObject(('APN/IO Pro/EE UK APN/android.widget.TextView3 - ' + carrier_EEInternet) + ' (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView4 - APN'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView5 - ' + apn_everywhere), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView6 - Proxy'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView7 - Not set'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView8 - Port'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView9 - Not set'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView10 - Username'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView11 - ' + user_eesecure), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView12 - Password'), 0)

Mobile.tap(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView12 - Password'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView0 - Password'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.Button1 - OK'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.Button0 - CANCEL'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.EditText0 - ' + password_secure), 0)

Mobile.tap(findTestObject('APN/IO Pro/EE UK APN/android.widget.Button0 - CANCEL'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView14 - Server'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView15 - Not set'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView16 - MMSC'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView17 - Not set'), 0)

Mobile.swipe(startX, startY, endX, endY)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView2 - MMS proxy'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView3 - Not set'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView4 - MMS port'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView5 - Not set'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView6 - MCC'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView7 - ' + mcc_234), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView8 - MNC'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView9 - ' + mnc_30), 0)

Mobile.swipe(startX, startY, endX, endY)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView10 - Authentication type'), 0)

if (authtype == '0') {
    authtype = 'None'
}

if (authtype == '1') {
    authtype = 'PAP'
}

if (authtype == '2') {
    authtype = 'CHAP'
}

if (authtype == '3') {
    authtype = 'PAP or CHAP'
}

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView11 - ' + authtype), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView12 - APN type'), 0)

if (type_defaultsupl == 'default,supl') {
    Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView13 - defaultsupl'), 0)
}

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView14 - APN protocol'), 0)

if (protocol_IPV4V6 == 'IPV4V6') {
    Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView15 - IPv4IPv6'), 0)
}

Mobile.swipe(startX, startY, endX, endY)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView16 - APN roaming protocol'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView17 - IPv4'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView10 - APN enabledisable'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView11 - APN enabled'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView12 - Bearer'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView13 - Unspecified'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView14 - MVNO type'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView15 - None'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView16 - MVNO value'), 0)

Mobile.verifyElementVisible(findTestObject('APN/IO Pro/EE UK APN/android.widget.TextView17 - Not set'), 0)

Mobile.closeApplication()

