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

Mobile.pressHome()

Mobile.openNotifications()

Mobile.swipe(540, 200, 540, 800)

Mobile.verifyElementVisible(findTestObject('Preconditions/IO 3D Mobile Data Disable from Quick Settings/android.widget.TextView5 - Mobile data'), 
    0)

Mobile.tap(findTestObject('Preconditions/IO 3D Mobile Data Disable from Quick Settings/android.widget.TextView5 - Mobile data'), 
    0)

if (Mobile.verifyElementVisible(findTestObject('Preconditions/IO 3D Mobile Data Disable from Quick Settings/android.widget.TextView5 - Mobile data'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Preconditions/IO 3D Mobile Data Disable from Quick Settings/android.widget.TextView5 - Mobile data'), 
        0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    'Turn Off Mobile Data'
    Mobile.tapAtPosition(540, 750)
} else {
    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    'Turn Off Mobile Data'
    Mobile.tapAtPosition(540, 750)
}

