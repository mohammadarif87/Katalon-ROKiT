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

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    'Before log-in'
    if (Mobile.verifyElementVisible(findTestObject('Apps/ROKFLiX/android.widget.TextView0 - Select Account'), 
    0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Apps/ROKFLiX/android.widget.TextView0 - Select Account'), 0)

        Mobile.verifyElementVisible(findTestObject('Apps/ROKFLiX/android.widget.TextView1 - Add Account'), 0)

        Mobile.verifyElementVisible(findTestObject('Apps/ROKFLiX/android.widget.TextView2 - Exit'), 0)
    }
    
    'After log-in'
    if (Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKFLiX App Pre-Installed/android.widget.ImageView0'), 
    0, FailureHandling.OPTIONAL)) {
        'Head image'
        Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKFLiX App Pre-Installed/android.widget.ImageView0'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKFLiX App Pre-Installed/android.widget.TextView0 - Exclusives'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKFLiX App Pre-Installed/android.widget.TextView0 - Home'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKFLiX App Pre-Installed/android.widget.TextView0 - Store'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKFLiX App Pre-Installed/android.widget.TextView0 - Downloads'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKFLiX App Pre-Installed/android.widget.TextView0 - Settings'), 
            0)
    }
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/ROKFLiX/android.widget.TextView0 - Select Account'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKFLiX/android.widget.TextView1 - Add Account'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROKFLiX/android.widget.TextView2 - Exit'), 0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('ROKFLiX App Pre-Installed', '', TestLinkAPIResults.TEST_PASSED)

