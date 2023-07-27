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

Mobile.verifyElementVisible(findTestObject('Customisation/My ROK-Kit Folder/android.widget.TextView4 - My ROK-Kit'), 0)

Mobile.tap(findTestObject('Customisation/My ROK-Kit Folder/android.widget.TextView4 - My ROK-Kit'), 0)

Mobile.verifyElementVisible(findTestObject('Customisation/My ROK-Kit Folder/android.widget.EditText0 - My ROK-Kit'), 0)

Mobile.waitForElementPresent(findTestObject('Customisation/My ROK-Kit Folder/android.widget.TextView1 - ROKFLiX 3D'), 0)

if (Mobile.verifyElementVisible(findTestObject('Customisation/My ROK-Kit Folder/android.widget.TextView0 - ROK Launch Control'), 
    0, FailureHandling.OPTIONAL)) {
    'ROKFLiX 3D'
    Mobile.verifyElementVisible(findTestObject('Customisation/My ROK-Kit Folder/android.view.ViewGroup0'), 0)
} else {
    Mobile.verifyElementVisible(findTestObject('Customisation/My ROK-Kit Folder/android.widget.TextView0 - ROKiT Launch Control'), 
        0)
}

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('ROK-Kit Folder', '', TestLinkAPIResults.TEST_PASSED)

