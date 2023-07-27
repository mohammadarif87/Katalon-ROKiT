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

WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Delete All Albums From Gallery'), [('appPackage') : 'com.android.gallery3d'
        , ('appActivity') : '.app.GalleryActivity', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)'
            , ('deviceId') : '0123456789ABCDEF', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Clear All Notifications'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Rename Bluetooth - IO Pro Automation'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Take Camera Video'), [('appPackage') : 'com.mediatek.camera', ('appActivity') : '.CameraActivity'
        , ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)', ('deviceId') : '0123456789ABCDEF'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Close All Recent Apps'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)', ('deviceId') : '012345689ABCDEF'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete All Albums From Gallery - US/android.widget.TextView0 - Allow Gallery to access photos media and files on your device'), 
        4, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete All Albums From Gallery - US/android.widget.TextView0 - Allow Gallery to access photos media and files on your device'), 
            4)

        Mobile.verifyElementVisible(findTestObject('Apps/Gallery/android.widget.Button1 - ALLOW'), 0)

        Mobile.tap(findTestObject('Apps/Gallery/android.widget.Button1 - ALLOW'), 0)

        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        'Folder in Gallery'
        Mobile.tapAtPosition(190, 480, FailureHandling.STOP_ON_FAILURE)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.tapAtPosition(150, 500)

        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        'Share button location'
        Mobile.tapAtPosition(600, 100)
    } else {
        not_run: Mobile.delay(3)

        'Gallery icon in bottom left of camera'
        Mobile.verifyElementVisible(findTestObject('Gallery/Send Camera Video via Bluetooth/android.widget.ImageView5 (1)'), 
            0)

        Mobile.tap(findTestObject('Gallery/Send Camera Video via Bluetooth/android.widget.ImageView5 (1)'), 0)

        Mobile.verifyElementVisible(findTestObject('Gallery/Send Camera Video via Bluetooth/android.widget.TextView0 - Complete action using Gallery (1)'), 
            0)

        Mobile.tap(findTestObject('Gallery/Send Camera Video via Bluetooth/android.widget.Button0 - JUST ONCE (1)'), 0)

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        'Share button location'
        Mobile.tapAtPosition(600, 100)
    }
} else {
    if (Mobile.verifyElementVisible(findTestObject('Apps/Gallery/android.widget.TextView0 - Allow Gallery to access photos media and files on your device (1)'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Apps/Gallery/android.widget.TextView0 - Allow Gallery to access photos media and files on your device (1)'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Apps/Gallery/android.widget.Button1 - ALLOW'), 0)

        Mobile.tap(findTestObject('Apps/Gallery/android.widget.Button1 - ALLOW'), 0)

        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        'Folder in Gallery'
        Mobile.tapAtPosition(190, 480, FailureHandling.STOP_ON_FAILURE)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.tapAtPosition(150, 500)

        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        'Share button location'
        Mobile.tapAtPosition(600, 100)
    } else {
        'Gallery icon in bottom left of camera'
        Mobile.verifyElementVisible(findTestObject('Gallery/Send Camera Video via Bluetooth/android.widget.ImageView5 (1)'), 
            0)

        Mobile.tap(findTestObject('Gallery/Send Camera Video via Bluetooth/android.widget.ImageView5 (1)'), 0)

        Mobile.verifyElementVisible(findTestObject('Gallery/Send Camera Video via Bluetooth/android.widget.TextView0 - Complete action using Gallery (1)'), 
            0)

        Mobile.tap(findTestObject('Gallery/Send Camera Video via Bluetooth/android.widget.Button0 - JUST ONCE (1)'), 0)

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        'Share button location'
        Mobile.tapAtPosition(600, 100)
    }
}

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Gallery/Send Camera Video via Bluetooth/android.widget.TextView0 - Bluetooth'), 
    5)

Mobile.tap(findTestObject('Gallery/Send Camera Video via Bluetooth/android.widget.TextView0 - Bluetooth'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Gallery/Send Camera Video via Bluetooth/android.widget.TextView0 - Choose Bluetooth device'), 
    0)

Mobile.verifyElementVisible(findTestObject('Gallery/Send Camera Video via Bluetooth/android.widget.TextView1 - IO Pro Automation'), 
    0)

Mobile.tap(findTestObject('Gallery/Send Camera Video via Bluetooth/android.widget.TextView1 - IO Pro Automation'), 0)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Accept incoming Bluetooth file'), [('appPackage') : 'com.android.settings'
        , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

