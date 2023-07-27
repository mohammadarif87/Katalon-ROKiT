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

Mobile.pressHome()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.openNotifications()

Mobile.verifyElementVisible(findTestObject('Preconditions/Accept incoming Bluetooth file/android.widget.TextView3 - Bluetooth'), 
    10)

Mobile.verifyElementVisible(findTestObject('Preconditions/Accept incoming Bluetooth file/android.widget.TextView4 - Incoming file'), 
    3)

Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView6 - IO Pro Automation is ready to send ROKiT Bluetooth.vcf'), 
    3)

Mobile.verifyElementVisible(findTestObject('Preconditions/Accept incoming Bluetooth file/android.widget.Button2 - ACCEPT'), 
    3)

Mobile.tap(findTestObject('Preconditions/Accept incoming Bluetooth file/android.widget.Button2 - ACCEPT'), 3)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Preconditions/Accept incoming Bluetooth file/android.widget.TextView4 - Bluetooth share Received files'), 
    3)

Mobile.tap(findTestObject('Preconditions/Accept incoming Bluetooth file/android.widget.TextView4 - Bluetooth share Received files'), 
    3)

'Header'
Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView0 - Inbound transfers'), 
    3)

'First file received'
Mobile.tap(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.RelativeLayout0'), 3)

if (Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView0 - Allow Contacts to access photos media and files on your device'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView0 - Allow Contacts to access photos media and files on your device'), 
        3)

    Mobile.tap(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.Button0 - ALLOW'), 0)
}

if (Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView0 - Save imported contacts to'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView0 - Save imported contacts to'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView3 - Phone'), 
        3)

    Mobile.tap(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView3 - Phone'), 3)
} else {
    Mobile.verifyElementVisible(findTestObject('Preconditions/Accept Bluetooth Contact/android.widget.TextView0 - Import contacts from vCard'), 
        3)

    Mobile.tap(findTestObject('Preconditions/Accept Bluetooth Contact/android.widget.Button0 - OK'), 3)
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.openNotifications()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView10 - Finished importing vCard ROKiT Bluetooth.vcf'), 
    3)

Mobile.tap(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView10 - Finished importing vCard ROKiT Bluetooth.vcf'), 
    3)

Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView9 - ROKiT Bluetooth'), 
    3)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView0 - 747 3447370'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView2 - 07912 244108'), 
        3)
}

Mobile.comment('Delete contact from phone')

'3 dots'
Mobile.tap(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.ImageButton0'), 3)

Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView1 - Delete'), 
    3)

Mobile.tap(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView1 - Delete'), 3)

Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView0 - Delete this contact'), 
    3)

Mobile.tap(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.Button1 - DELETE'), 3)

Mobile.pressHome()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(512, 1000, 512, 200)

Mobile.comment('Delete from Files app')

Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView13 - Files'), 
    3)

Mobile.tap(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView13 - Files'), 3)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'3 dots'
Mobile.tap(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.ImageButton1'), 3)

if (Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView3 - Show internal storage'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView3 - Show internal storage'), 
        3)

    Mobile.tap(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView3 - Show internal storage'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView3 - Hide internal storage'), 
        3)
}

Mobile.tapAtPosition(512, 512)

'Burger Menu'
Mobile.tap(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.ImageButton0 (1)'), 3)

Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView19 - IO 3D'), 
    3)

Mobile.tap(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView19 - IO 3D'), 3)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView6 - bluetooth'), 
    3)

Mobile.tap(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView6 - bluetooth'), 3)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHold(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.LinearLayout7'), 0, 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'3 dots'
Mobile.tap(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.ImageButton3'), 3)

Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView1 - Select all'), 
    3)

Mobile.tap(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView1 - Select all'), 3)

'Delete button'
Mobile.tap(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.TextView18'), 3)

Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.Button1 - OK'), 3)

Mobile.tap(findTestObject('Contact List/Contact Shared via Bluetooth/android.widget.Button1 - OK'), 3)

Mobile.closeApplication()

