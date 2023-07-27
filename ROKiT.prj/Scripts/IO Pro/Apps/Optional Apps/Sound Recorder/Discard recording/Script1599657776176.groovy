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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Apps/Sound Recorder/android.widget.TextView0 - Sound Recorder'), 3)

'Timer'
Mobile.verifyElementVisible(findTestObject('Apps/Sound Recorder/android.widget.TextView1 - 0000'), 0)

'Record button'
Mobile.verifyElementVisible(findTestObject('Apps/Sound Recorder/android.widget.ImageButton1'), 3)

'List of recordings button'
Mobile.verifyElementVisible(findTestObject('Apps/Sound Recorder/android.widget.ImageButton2'), 0)

'Record button'
Mobile.tap(findTestObject('Apps/Sound Recorder/android.widget.ImageButton1'), 3)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Apps/Sound Recorder/Recording file list/android.widget.TextView0 - Allow Sound Recorder to access photos media and files on your device'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/Sound Recorder/Recording file list/android.widget.Button0 - ALLOW'), 
        3)

    Mobile.tap(findTestObject('Apps/Sound Recorder/Recording file list/android.widget.Button0 - ALLOW'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/Sound Recorder/Recording file list/android.widget.TextView0 - Allow Sound Recorder to record audio'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/Sound Recorder/Recording file list/android.widget.Button0 - ALLOW'), 
        0)

    Mobile.tap(findTestObject('Apps/Sound Recorder/Recording file list/android.widget.Button0 - ALLOW'), 0)
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/Sound Recorder/android.widget.TextView0 - Allow Sound Recorder to access photos media and files on your device'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/Sound Recorder/android.widget.Button1 - ALLOW'), 0)

    Mobile.tap(findTestObject('Apps/Sound Recorder/android.widget.Button1 - ALLOW'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/Sound Recorder/android.widget.TextView0 - Allow Sound Recorder to record audio'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/Sound Recorder/android.widget.Button1 - ALLOW'), 0)

    Mobile.tap(findTestObject('Apps/Sound Recorder/android.widget.Button1 - ALLOW'), 0)
}

'PAUSE'
Mobile.verifyElementVisible(findTestObject('Apps/Sound Recorder/android.widget.ImageButton0'), 0)

'STOP'
Mobile.verifyElementVisible(findTestObject('Apps/Sound Recorder/android.widget.ImageButton1 (2)'), 0)

'STOP'
Mobile.tap(findTestObject('Apps/Sound Recorder/android.widget.ImageButton1 (2)'), 0)

'PLAY'
Mobile.verifyElementVisible(findTestObject('Apps/Sound Recorder/android.widget.ImageButton2 (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Sound Recorder/android.widget.Button1 - SAVE'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Sound Recorder/android.widget.Button0 - DISCARD'), 0)

Mobile.tap(findTestObject('Apps/Sound Recorder/android.widget.Button0 - DISCARD'), 0)

'Record button'
Mobile.verifyElementVisible(findTestObject('Apps/Sound Recorder/android.widget.ImageButton1'), 3)

'List of recordings button'
Mobile.verifyElementVisible(findTestObject('Apps/Sound Recorder/android.widget.ImageButton2'), 0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Discard recording', '', TestLinkAPIResults.TEST_PASSED)

