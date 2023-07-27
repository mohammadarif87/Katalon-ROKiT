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

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    WebUI.callTestCase(findTestCase('IO 3D/PRECONDITIONS/Reset options/Reset app preferences - IO 3D'), [('appPackage') : 'com.android.settings'
            , ('appActivity') : '.Settings', ('deviceInformation') : [('platformVersion') : '8.1.0', ('deviceName') : 'ROKiT IO 3D (Android 8.1.0)', ('udid') : '0123456789ABCDEF', ('platformName') : 'Android']], 
        FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.TextView1 - Video'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.TextView1 - Video'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    'Record button'
    Mobile.verifyElementVisible(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.ImageView2'), 0)

    'Record button'
    Mobile.tap(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.ImageView2'), 0)

    Mobile.delay(6, FailureHandling.STOP_ON_FAILURE)

    'Stop Recording'
    Mobile.tap(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.ImageView2 (1)'), 0)

    Mobile.delay(6, FailureHandling.STOP_ON_FAILURE)

    'Gallery button'
    Mobile.verifyElementVisible(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.ImageView3'), 0)

    'Gallery button'
    Mobile.tap(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.ImageView3'), 0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.TextView0 - Complete action using'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.TextView0 - Gallery'), 0)

    Mobile.tap(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.Button0 - JUST ONCE (3)'), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.TextView0 - Allow Gallery to access photos media and files on your device'), 
        3)

    Mobile.tap(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.Button0 - ALLOW'), 0)

    'Play icon'
    Mobile.tapAtPosition(365, 675)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.TextView0 - Open with'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.TextView0 - Video player'), 
        3)

    Mobile.tap(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.TextView0 - Video player (1)'), 4)

    Mobile.tap(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.Button0 - JUST ONCE (2)'), 4)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)
} else {
    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.TextView1 - Video'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.TextView1 - Video'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    'Record button'
    Mobile.verifyElementVisible(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.ImageView2'), 0)

    'Record button'
    Mobile.tap(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.ImageView2'), 0)

    Mobile.delay(6, FailureHandling.STOP_ON_FAILURE)

    'Stop Recording'
    Mobile.tap(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.ImageView2 (1)'), 0)

    Mobile.delay(6, FailureHandling.STOP_ON_FAILURE)

    'Gallery button'
    Mobile.verifyElementVisible(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.ImageView3'), 0)

    'Gallery button'
    Mobile.tap(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.ImageView3'), 0)

    'Gallery button'
    Mobile.verifyElementVisible(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.TextView0 - Complete action using Gallery'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.Button0 - JUST ONCE'), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    'Play icon'
    Mobile.tapAtPosition(365, 675)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.TextView0 - Open with Video player'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Take Camera Video - IO 3D/android.widget.Button0 - JUST ONCE (1)'), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
}

Mobile.closeApplication()

