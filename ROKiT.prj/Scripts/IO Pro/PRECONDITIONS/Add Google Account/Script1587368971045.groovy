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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import org.openqa.selenium.Keys as Keys

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.scrollToText('Accounts', FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView7 - Accounts'), 3)

    Mobile.tap(findTestObject('Settings/Accounts/Add Account/android.widget.TextView7 - Accounts'), 3)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView0 - Accounts'), 3)

    if (Mobile.verifyElementVisible(findTestObject('Preconditions/Add Google Account - US/android.widget.TextView0 - rokitphones715gmail.com'), 
        5, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Preconditions/Add Google Account - US/android.widget.TextView0 - rokitphones715gmail.com'), 
            3)
    } else {
        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView3 - Add account'), 
            3)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView4 - Automatically sync data'), 
            3)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView5 - Let apps refresh data automatically'), 
            3)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.Switch0 - ON'), 3)

        Mobile.tap(findTestObject('Settings/Accounts/Add Account/android.widget.TextView3 - Add account'), 3)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView0 - Add an account'), 
            3)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView5 - Google'), 10)

        Mobile.verifyElementVisible(findTestObject('Preconditions/Add Google Account - US/android.widget.TextView0 - ROKiT Hub'), 
            3)

        Mobile.tap(findTestObject('Settings/Accounts/Add Account/android.widget.TextView5 - Google'), 3)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.view.View1 - Sign in'), 10)

        AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

        'Sign-in; Email field'
        driver.findElementById('identifierId').sendKeys('rokitphones715@gmail.com')

        Mobile.hideKeyboard()

        driver.findElementByXPath('//android.widget.Button[@text = \'Next\']').click()

        Mobile.verifyElementVisible(findTestObject('Preconditions/Add Google Account - US/android.view.View0 - rokitphones715gmail.com'), 
            3)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.Button2 - Forgot password'), 
            3)

        'Sign-in; Password field'
        driver.findElementById('password').sendKeys('$rokitmobile')

        Mobile.hideKeyboard()

        driver.findElementById('passwordNext').click()

        'Verify I agree  buttoon'
        driver.findElementById('signinconsentNext').isDisplayed()

        'Click I agree button'
        driver.findElementById('signinconsentNext').click()

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView0 - Google Services'), 
            10)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.Button0 - MORE'), 3)

        Mobile.tap(findTestObject('Settings/Accounts/Add Account/android.widget.Button0 - MORE'), 3)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.Button0 - ACCEPT'), 3)

        Mobile.tap(findTestObject('Settings/Accounts/Add Account/android.widget.Button0 - ACCEPT'), 3)

        Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

        if (Mobile.verifyElementVisible(findTestObject('Preconditions/Add Google Account - US/android.widget.TextView0 - rokitphones715gmail.com'), 
            5, FailureHandling.OPTIONAL)) {
            Mobile.verifyElementVisible(findTestObject('Preconditions/Add Google Account - US/android.widget.TextView0 - rokitphones715gmail.com'), 
                3)

            Mobile.verifyElementVisible(findTestObject('Preconditions/Add Google Account - US/android.widget.TextView0 - Google'), 
                3)
        } else {
            Mobile.closeApplication()

            CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, 
                appPackage, appActivity)

            Mobile.scrollToText('Accounts', FailureHandling.STOP_ON_FAILURE)

            Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView7 - Accounts'), 
                3)

            Mobile.tap(findTestObject('Settings/Accounts/Add Account/android.widget.TextView7 - Accounts'), 3)

            Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView0 - Accounts'), 
                3)

            Mobile.verifyElementVisible(findTestObject('Preconditions/Add Google Account - US/android.widget.TextView0 - rokitphones715gmail.com'), 
                5)

            Mobile.verifyElementVisible(findTestObject('Preconditions/Add Google Account - US/android.widget.TextView0 - Google'), 
                3)
        }
    }
    
    Mobile.closeApplication()
} else {
    CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
        appActivity)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
        0)

    Mobile.scrollToText('Accounts', FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView7 - Accounts'), 0)

    Mobile.tap(findTestObject('Settings/Accounts/Add Account/android.widget.TextView7 - Accounts'), 0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView0 - Accounts'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView2 - Accounts for Owner'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView2 - Accounts for Owner'), 
            3)
    } else {
        'US Gmail account info'
        Mobile.verifyElementVisible(findTestObject('System Settings/Account/Add Account/android.widget.TextView0 - Accounts for Rokit'), 
            3)
    }
    
    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView3 - Add account'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView4 - Automatically sync data'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView5 - Let apps refresh data automatically'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.Switch0 - ON'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView3 - rokittest1gmail.com'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView3 - rokittest1gmail.com'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView4 - Google'), 0)

        Mobile.closeApplication()
    } else {
        Mobile.tap(findTestObject('Settings/Accounts/Add Account/android.widget.TextView3 - Add account'), 0)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView0 - Add an account'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView5 - Google'), 10)

        Mobile.tap(findTestObject('Settings/Accounts/Add Account/android.widget.TextView5 - Google'), 0)

        Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.view.View1 - Sign in'), 10)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.EditText0'), 0)

        Mobile.setText(findTestObject('Settings/Accounts/Add Account/android.widget.EditText0'), 'rokittest1@gmail.com', 
            0)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.Button2 - Next'), 0)

        Mobile.hideKeyboard()

        Mobile.tap(findTestObject('Settings/Accounts/Add Account/android.widget.Button2 - Next'), 0)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.view.View3 - rokittest1gmail.com'), 
            10)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.Button2 - Forgot password'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.EditText0 (1)'), 0)

        Mobile.setText(findTestObject('Settings/Accounts/Add Account/android.widget.EditText0 (1)'), 'qetuotuo', 0)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.Button1 - Next'), 0)

        Mobile.hideKeyboard()

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        not_run: Mobile.tap(findTestObject('Settings/Accounts/Add Account/android.widget.Button1 - Next'), 0)

        'Next button'
        Mobile.tap(findTestObject('Settings/Accounts/Add Account/android.view.View16'), 0)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.Button0 - I agree'), 0)

        not_run: Mobile.tap(findTestObject('Settings/Accounts/Add Account/android.widget.Button0 - I agree'), 0)

        'I agree button'
        Mobile.tap(findTestObject('Settings/Accounts/Add Account/android.view.View11'), 0)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView0 - Google Services'), 
            10)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.Button0 - MORE'), 0)

        Mobile.tap(findTestObject('Settings/Accounts/Add Account/android.widget.Button0 - MORE'), 0)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.Button0 - ACCEPT'), 0)

        Mobile.tap(findTestObject('Settings/Accounts/Add Account/android.widget.Button0 - ACCEPT'), 0)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        if (Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.view.View1 - Sign in'), 10, 
            FailureHandling.OPTIONAL)) {
            Mobile.pressBack()

            if (Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.view.View1 - Sign in'), 
                10, FailureHandling.OPTIONAL)) {
                Mobile.pressBack()
            }
        }
        
        if (Mobile.verifyElementNotVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView3 - rokittest1gmail.com'), 
            0, FailureHandling.OPTIONAL)) {
            Mobile.pressBack()
        }
        
        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView3 - rokittest1gmail.com'), 
            10)

        Mobile.verifyElementVisible(findTestObject('Settings/Accounts/Add Account/android.widget.TextView4 - Google'), 0)

        Mobile.closeApplication()
    }
}

