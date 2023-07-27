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

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Delete All Albums From Gallery'), [('appPackage') : 'com.freeme.gallery'
        , ('appActivity') : 'com.cooliris.media.Gallery', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)'
            , ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Preconditions/Delete All Albums From Gallery - US/android.widget.TextView0 - Allow Gallery to access photos media and files on your device'), 
        0)
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/Gallery/android.widget.TextView0 - Allow Gallery to access photos media and files on your device'), 
        0)
}

Mobile.verifyElementVisible(findTestObject('Apps/Gallery/android.widget.Button1 - ALLOW'), 0)

Mobile.tap(findTestObject('Apps/Gallery/android.widget.Button1 - ALLOW'), 0)

Mobile.tapAtPosition(540, 1100)

Mobile.comment('Camera app opens')

'Flash button'
Mobile.verifyElementVisible(findTestObject('Gallery/View Images/android.widget.ImageButton0'), 0)

'Beauty button'
Mobile.verifyElementVisible(findTestObject('Gallery/View Images/android.widget.ImageView0'), 0)

'Switch camera button'
Mobile.verifyElementVisible(findTestObject('Gallery/View Images/android.widget.ImageButton1'), 0)

'Gallery button'
Mobile.verifyElementVisible(findTestObject('Gallery/View Images/android.widget.ImageView2'), 0)

'Video mode button'
Mobile.verifyElementVisible(findTestObject('Gallery/View Images/android.widget.ImageView4'), 0)

'Video mode button'
Mobile.tap(findTestObject('Gallery/View Images/android.widget.ImageView4'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Shutter button'
Mobile.verifyElementVisible(findTestObject('Gallery/View Images/android.widget.ImageView3'), 0)

'Shutter button'
Mobile.tap(findTestObject('Gallery/View Images/android.widget.ImageView3'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Shutter button'
Mobile.tap(findTestObject('Gallery/View Images/android.widget.ImageView3'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(120, 500)

if (Mobile.verifyElementVisible(findTestObject('Gallery/View Videos/android.widget.TextView2 - Photos'), 0, FailureHandling.OPTIONAL)) {
    not_run: Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Open with 3D Gallery'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Gallery/View Videos/android.widget.TextView2 - Photos'), 0)

    Mobile.tap(findTestObject('Gallery/View Videos/android.widget.TextView2 - Photos'), 0)

    Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.Button0 - JUST ONCE'), 
        0)
}

if (Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Open with 3D Gallery'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.TextView0 - Open with 3D Gallery'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Gallery/View Videos/android.widget.TextView2 - Photos'), 0)

    Mobile.tap(findTestObject('Gallery/View Videos/android.widget.TextView2 - Photos'), 0)
}

if (Mobile.verifyElementVisible(findTestObject('Gallery/View Videos/android.widget.TextView0 - Open with Photos'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Gallery/View Videos/android.widget.TextView0 - Open with Photos'), 0)

    Mobile.tap(findTestObject('3D/Apps/3D Gallery/View Photo Video in MMS on 3D Gallery/android.widget.Button0 - JUST ONCE'), 
        0)
}

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(120, 500)

'Rewind button'
Mobile.verifyElementVisible(findTestObject('Gallery/View Videos/android.widget.ImageButton0'), 0)

'Play/Pause button'
Mobile.verifyElementVisible(findTestObject('Gallery/View Videos/android.widget.ImageButton1'), 0)

'Forward button'
Mobile.verifyElementVisible(findTestObject('Gallery/View Videos/android.widget.ImageButton2'), 0)

'Share button'
Mobile.verifyElementVisible(findTestObject('Gallery/View Videos/android.widget.ImageView1'), 0)

'Edit button'
Mobile.verifyElementVisible(findTestObject('Gallery/View Videos/android.widget.ImageView2'), 0)

'Delete button'
Mobile.verifyElementVisible(findTestObject('Gallery/View Videos/android.widget.ImageView4'), 0)

Mobile.pressBack()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(120, 500, 2)

Mobile.verifyElementVisible(findTestObject('Gallery/View Videos/android.widget.RadioButton1 - Delete'), 0)

Mobile.tap(findTestObject('Gallery/View Videos/android.widget.RadioButton1 - Delete'), 0)

Mobile.verifyElementVisible(findTestObject('Gallery/View Videos/android.widget.TextView0 - Delete selected item'), 0)

Mobile.verifyElementVisible(findTestObject('Gallery/View Videos/android.widget.Button0 - CANCEL'), 0)

Mobile.tap(findTestObject('Gallery/View Videos/android.widget.Button1 - OK'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('View Videos', '', TestLinkAPIResults.TEST_PASSED)

