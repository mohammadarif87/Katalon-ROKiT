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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Apps/Gallery/android.widget.TextView0 - Allow Gallery to access photos media and files on your device (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('Apps/Gallery/android.widget.Button1 - ALLOW'), 0)

Mobile.tap(findTestObject('Apps/Gallery/android.widget.Button1 - ALLOW'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Folder in Gallery'
Mobile.tapAndHoldAtPosition(190, 480, 2)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Delete button'
Mobile.tapAtPosition(600, 100)

while (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete All Albums From Gallery - IO 3D/android.widget.TextView0 - Delete selected item'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Preconditions/Delete All Albums From Gallery - IO 3D/android.widget.TextView0 - Delete selected item'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Delete All Albums From Gallery - IO 3D/android.widget.Button1 - OK'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Delete All Albums From Gallery - IO 3D/android.widget.Button1 - OK'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tapAndHoldAtPosition(190, 480, 2)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    'Delete button'
    Mobile.tapAtPosition(600, 100)
}

Mobile.closeApplication()

