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

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Remove Google Account'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete Messages'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('IO 3D/Messages/Send Contact to IO Pro SIM 1'), [('appPackage') : 'com.google.android.apps.messaging'
        , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
            , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    not_run: Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView0 - Search images  videos'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView0 - Auto O2 Fav (1)'), 
        5)

    not_run: Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView1 - Contact card'), 
        4)

    if (Mobile.verifyElementVisible(findTestObject('Messages/Send Audio MMS to IO Pro/android.widget.TextView1 - Audio clip'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Messages/Send Audio MMS to IO Pro/android.widget.TextView1 - Audio clip'), 
            0)

        Mobile.tap(findTestObject('Messages/Receive Picture MMS (Both SIMs - Wi-Fi On)/android.widget.TextView0 - Auto O2 Fav'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Messages/Receive Picture MMS (Both SIMs - Wi-Fi On)/android.widget.TextView3 - Auto O2 Fav'), 
            0)

        'Audio in message'
        not_run: Mobile.verifyElementVisible(findTestObject('Messages/Receive Audio MMS from IO Pro/android.widget.ImageView1 (1)'), 
            10)

        not_run: Mobile.closeApplication()
    } else {
        Mobile.tap(findTestObject('Messages/Receive Picture MMS (Both SIMs - Wi-Fi On)/android.widget.TextView0 - Auto O2 Fav'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Messages/Receive Picture MMS (Both SIMs - Wi-Fi On)/android.widget.TextView3 - Auto O2 Fav'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Messages/Receive Picture MMS (Both SIMs - Wi-Fi On)/android.widget.TextView1 - Tap to download'), 
            0)

        'Download icon'
        Mobile.verifyElementVisible(findTestObject('Messages/Receive Picture MMS (Both SIMs - Wi-Fi On)/android.widget.FrameLayout6'), 
            0)

        'Download icon'
        Mobile.tap(findTestObject('Messages/Receive Picture MMS (Both SIMs - Wi-Fi On)/android.widget.FrameLayout6'), 0)

        Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

        'Audio in message'
        not_run: Mobile.verifyElementVisible(findTestObject('Messages/Receive Audio MMS from IO Pro/android.widget.ImageView1 (1)'), 
            10)

        not_run: Mobile.pressBack()

        not_run: Mobile.verifyElementVisible(findTestObject('Messages/Send Audio MMS to IO Pro/android.widget.TextView1 - Audio clip'), 
            0)

        not_run: Mobile.closeApplication()
    }
    
    not_run: Mobile.tap(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView0 - Auto O2 Fav (1)'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView3 - ROKiT Automation'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView4 - View contact'), 
        3)

    Mobile.tap(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView3 - ROKiT Automation'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView0 - Contact info'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView2 - ROKiT Automation'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView0 - 478-777-7307'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView4 - Mobile'), 
        3)

    'Add contact button'
    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView1'), 
        0)

    'Add contact button'
    Mobile.tap(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView1'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView0 - Allow Contacts to access photos media and files on your device (1)'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView0 - Allow Contacts to access photos media and files on your device (1)'), 
            0)

        Mobile.tap(findTestObject('Contact List/Contact Shared via Messages app/android.widget.Button0 - ALLOW'), 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView0 - Import contacts from vCard'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView0 - Import contacts from vCard'), 
            3)

        Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.Button0 - CANCEL'), 
            3)

        Mobile.tap(findTestObject('Contact List/Contact Shared via Messages app/android.widget.Button1 - OK'), 3)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView0 - Save imported contacts to (1)'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView0 - Save imported contacts to (1)'), 
            3)

        Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView0 - rokitphones715gmail.com'), 
            3)

        Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView0 - Phone'), 
            3)

        Mobile.tap(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView0 - Phone'), 3)
    }
    
    Mobile.pressHome()

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    'Dialler icon'
    Mobile.tapAtPosition(150, 1850)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    'Contacts icon'
    Mobile.tapAtPosition(900, 350)

    if (Mobile.verifyElementNotVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView6 - Search contacts'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.pressBack()
    }
    
    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView6 - Search contacts'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView4 - ROKiT Automation'), 
        0)

    Mobile.comment('Delete the contact just added')

    Mobile.tap(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView4 - ROKiT Automation'), 
        3)

    '3 dots in the top right'
    Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.ImageButton0'), 3)

    '3 dots in the top right'
    Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.ImageButton0'), 0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView1 - Delete'), 3)

    Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.TextView1 - Delete'), 0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView0 - Delete this contact'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.Button0 - CANCEL'), 3)

    Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.Button1 - DELETE'), 3)

    Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.Button1 - DELETE'), 0)
} else {
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView0 - Messages just got better'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - Use Messages without chat features'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0)

        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0)

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Next'), 0)

        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Use Messages without chat features (1)'), 
            0)

        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView - Use Messages without chat features (1)'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - New Spam protection'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.Button2 - OK'), 0)
    }
    
    Mobile.comment('Check Header')

    userName = System.getProperty('user.name')

    'Messaging app Header'
    if (Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.TextView0 - Messages'), 
        0, FailureHandling.OPTIONAL)) {
        'Messages header'
        Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.TextView0 - Messages'), 
            3)
    } else if (userName == 'Aiden') {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView0 - Search images  videos'), 
            3)
    } else {
        if (Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.TextView0 - Messages'), 
            0, FailureHandling.OPTIONAL)) {
            'Messages header'
            Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.TextView0 - Messages'), 
                3)
        } else if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView0 - Search'), 
            3, FailureHandling.OPTIONAL)) {
            Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView0 - Search'), 
                3)
        } else {
            Mobile.verifyElementVisible(findTestObject('System Settings/System/Languages and input/Personal dictionary/android.widget.TextView0 - Search images and videos'), 
                3)
        }
    }
    
    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView0 - Auto O2 Fav'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView1 - Contact card'), 
        0)

    Mobile.tap(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView0 - Auto O2 Fav'), 0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView3 - ROKiT Automation'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView4 - View contact'), 
        0)

    Mobile.tap(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView3 - ROKiT Automation'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView0 - Contact info'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView2 - ROKiT Automation'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView3 - 079-111-11111'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView4 - Mobile'), 
        0)

    'Add contact button'
    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView1'), 
        0)

    'Add contact button'
    Mobile.tap(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView1'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView0 - Allow Contacts to access photos media and files on your device'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView0 - Allow Contacts to access photos media and files on your device'), 
            0)

        Mobile.tap(findTestObject('Contact List/Contact Shared via Messages app/android.widget.Button1 - ALLOW'), 0)
    }
    
    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView0 - Import contacts from vCard'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.Button0 - CANCEL'), 
        0)

    Mobile.tap(findTestObject('Contact List/Contact Shared via Messages app/android.widget.Button1 - OK'), 0)

    Mobile.pressHome()

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    'Dialler icon'
    Mobile.tapAtPosition(150, 1850)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    'Contacts icon'
    Mobile.tapAtPosition(900, 350)

    if (Mobile.verifyElementNotVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView6 - Search contacts'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.pressBack()
    }
    
    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView6 - Search contacts'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView4 - ROKiT Automation'), 
        0)

    Mobile.comment('Delete the contact just added')

    Mobile.tap(findTestObject('Contact List/Contact Shared via Messages app/android.widget.TextView4 - ROKiT Automation'), 
        0)

    '3 dots in the top right'
    Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.ImageButton0'), 0)

    '3 dots in the top right'
    Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.ImageButton0'), 0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView1 - Delete'), 0)

    Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.TextView1 - Delete'), 0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.TextView0 - Delete this contact'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.Button0 - CANCEL'), 0)

    Mobile.verifyElementVisible(findTestObject('Contact List/Add Phone Contact/android.widget.Button1 - DELETE'), 0)

    Mobile.tap(findTestObject('Contact List/Add Phone Contact/android.widget.Button1 - DELETE'), 0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Contact Shared via Messages app', 
    '', TestLinkAPIResults.TEST_PASSED)

