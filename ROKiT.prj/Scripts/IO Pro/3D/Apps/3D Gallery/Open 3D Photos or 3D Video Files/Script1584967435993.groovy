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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete All Albums From Gallery'), [('appPackage') : 'com.freeme.gallery'
        , ('appActivity') : 'com.cooliris.media.Gallery', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Take Camera Photo'), [('appPackage') : 'com.freeme.camera', ('appActivity') : '.CameraActivity'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Apps/Files/android.widget.TextView0 - Downloads'), 3)

'Menu button'
Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Open 3D Photos or 3D Video Files/android.widget.ImageButton0'), 
    0)

'Menu button'
Mobile.tap(findTestObject('3D/Apps/3D Gallery/Open 3D Photos or 3D Video Files/android.widget.ImageButton0'), 0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Open 3D Photos or 3D Video Files/android.widget.TextView6 - Images'), 
    0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Open 3D Photos or 3D Video Files/android.widget.TextView7 - Videos'), 
    0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Open 3D Photos or 3D Video Files/android.widget.TextView8 - Audio'), 
    0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Open 3D Photos or 3D Video Files/android.widget.TextView9 - Recent'), 
    0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Open 3D Photos or 3D Video Files/android.widget.TextView11 - Downloads'), 
    0)

Mobile.tap(findTestObject('3D/Apps/3D Gallery/Open 3D Photos or 3D Video Files/android.widget.TextView6 - Images'), 0)

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Open 3D Photos or 3D Video Files/android.widget.TextView4 - Camera'), 
    0)

Mobile.tap(findTestObject('3D/Apps/3D Gallery/Open 3D Photos or 3D Video Files/android.widget.TextView4 - Camera'), 0)

'Image taken from Camera'
Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Open 3D Photos or 3D Video Files/android.widget.ImageView1'), 
    0)

'Image taken from Camera'
Mobile.tap(findTestObject('3D/Apps/3D Gallery/Open 3D Photos or 3D Video Files/android.widget.ImageView1'), 0)

if (Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Open with 3D Gallery'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Open with 3D Gallery'), 
        0)

    Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.Button0 - JUST ONCE'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView2 - 3D Gallery'), 
        0)

    Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView2 - 3D Gallery'), 
        0)

    Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.Button0 - JUST ONCE'), 
        0)
}

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    if (Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/3D Gallery Version/android.widget.TextView0 - Allow 3D Gallery to access photos media and files on your device'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/3D Gallery Version/android.widget.TextView0 - Allow 3D Gallery to access photos media and files on your device'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.Button1 - ALLOW'), 0)

        Mobile.tap(findTestObject('Apps/3D Gallery/android.widget.Button1 - ALLOW'), 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.TextView0 - Allow 3D Gallery to take pictures and record video'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.TextView0 - Allow 3D Gallery to take pictures and record video'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Apps/3D Gallery/android.widget.Button1 - ALLOW'), 0)

        Mobile.tap(findTestObject('Apps/3D Gallery/android.widget.Button1 - ALLOW'), 0)
    }
    
    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.tapAtPosition(512, 512)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    'Info Button(!)'
    Mobile.tapAtPosition(1025, 145)
} else {
    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.tapAtPosition(512, 512)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    'Tap on screen'
    Mobile.tapAtPosition(550, 1100)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    'Info Button'
    Mobile.tapAtPosition(990, 140)

    'Info Button'
    not_run: Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Open 3D Photos or 3D Video Files/android.widget.ImageButton1'), 
        2)

    'Info Button'
    not_run: Mobile.tap(findTestObject('3D/Apps/3D Gallery/Open 3D Photos or 3D Video Files/android.widget.ImageButton1'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Open 3D Photos or 3D Video Files/android.widget.TextView0 - Details'), 
    5)

'Back button'
Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/Open 3D Photos or 3D Video Files/android.widget.ImageButton0 (1)'), 
    0)

'Back button'
Mobile.tap(findTestObject('3D/Apps/3D Gallery/Open 3D Photos or 3D Video Files/android.widget.ImageButton0 (1)'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Open 3D photos or 3D Video files', '', 
    TestLinkAPIResults.TEST_PASSED)

