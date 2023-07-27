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

Mobile.pressHome()

'Search section on search bar'
Mobile.verifyElementVisible(findTestObject('Apps/Search bar/android.widget.ViewFlipper0'), 0)

'Google icon next to search bar'
Mobile.verifyElementVisible(findTestObject('Apps/Search bar/android.widget.ImageView2'), 0)

'Mic icon next to search bar'
Mobile.verifyElementVisible(findTestObject('Apps/Search bar/android.widget.ImageButton0'), 0)

'Search section on search bar'
Mobile.tap(findTestObject('Apps/Search bar/android.widget.ViewFlipper0'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Search bar/android.widget.EditText0 - Search'), 5)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    'Search...'
    if (Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Search bar App Pre-Installed/android.widget.EditText0 - Search'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Apps/Mandatory Apps/Search bar App Pre-Installed/android.widget.EditText0 - Search'), 
            0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.TextView0 - TRY SEARCHING FOR'), 0, FailureHandling.OPTIONAL)) {
        'Try Searching for'
        Mobile.verifyElementVisible(findTestObject('Apps/Chrome/android.widget.TextView0 - TRY SEARCHING FOR'), 0)
    }
} else {
    not_run: Mobile.verifyElementVisible(findTestObject('Apps/Search bar/android.widget.TextView0 - TRENDING SEARCHES'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Search Bar App Pre-Installed', '', TestLinkAPIResults.TEST_PASSED)

