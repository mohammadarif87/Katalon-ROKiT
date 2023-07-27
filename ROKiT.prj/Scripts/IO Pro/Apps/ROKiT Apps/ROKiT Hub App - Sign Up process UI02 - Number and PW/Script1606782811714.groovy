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

WebUI.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('udid') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.TextView0 - Allow ROKiT Hub to access this devices location'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button0 - DENY'), 3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 3)

    Mobile.tap(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.TextView0 - Allow ROKiT Hub to make and manage phone calls'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button0 - DENY'), 3)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 3)

    Mobile.tap(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 3)
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.TextView0 - Allow ROKiT Hub to access this devices location'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button0 - DENY'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 0)

    Mobile.tap(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.TextView0 - Allow ROKiT Hub to make and manage phone calls'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button0 - DENY'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 0)

    Mobile.tap(findTestObject('Apps/ROK Launch Control/android.widget.Button1 - ALLOW'), 0)
}

AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

'Check ROKiT Hub logo on Home page'
driver.findElementById('com.missioncontrol.rokaccount:id/iv_login_logo').isDisplayed()

Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App launch from App drawer/android.widget.TextView0 - Access your ROKiT services'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App launch from App drawer/android.widget.Button0 - Sign Up'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App launch from App drawer/android.widget.Button0 - Login'), 
    3)

'Check version display on the bottom of page'
driver.findElementById('com.missioncontrol.rokaccount:id/splashVersion').isDisplayed()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Apps/ROKiT Apps/ROKiT Hub App launch from App drawer/android.widget.Button0 - Sign Up'), 3)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'URL'
Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App-Sign Up process UI01-Personal info/android.widget.TextView0 - lcreg.rokitmc.app'), 
    3)

'Logo'
Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App-Sign Up process UI01-Personal info/android.widget.Image0 - ROKiT Phones'), 
    3)

'Header'
Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App-Sign Up process UI01-Personal info/android.view.View0 - Enter your information below and tap continue.'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App-Sign Up process UI01-Personal info/android.view.View0 - First name'), 
    3)

//driver.findElementByXPath('//android.widget.EditText[@resource-id = \'acpi_first_name\')]').sendkeys('Test')
'Enter First name'
driver.findElementById('acpi_first_name').click()

driver.findElementById('acpi_first_name').sendKeys('Test')

Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App-Sign Up process UI01-Personal info/android.view.View0 - Last Name'), 
    3)

'Enter Last name'
driver.findElementById('acpi_last_name').click()

driver.findElementById('acpi_last_name').sendKeys('Hub')

Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App-Sign Up process UI01-Personal info/android.view.View0 - Email address'), 
    3)

'Enter Last name'
driver.findElementById('acpi_email').click()

driver.findElementById('acpi_email').sendKeys('rokitphones715@gmail.com')

Mobile.hideKeyboard()

Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App-Sign Up process UI01-Personal info/android.widget.CheckBox0 - Keep me informed about ROKiT discounts exclusive offers and giveaways'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App-Sign Up process UI01-Personal info/android.widget.CheckBox0 - I have read and accept the terms and conditions'), 
    3)

Mobile.tap(findTestObject('Apps/ROKiT Apps/ROKiT Hub App-Sign Up process UI01-Personal info/android.widget.CheckBox0 - I have read and accept the terms and conditions'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App-Sign Up process UI01-Personal info/android.widget.Button0 - Continue'), 
    3)

Mobile.tap(findTestObject('Apps/ROKiT Apps/ROKiT Hub App-Sign Up process UI01-Personal info/android.widget.Button0 - Continue'), 
    3)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App-Sign Up process UI01-Personal info/android.widget.TextView0 - sso.rokservice.com'), 
    3)

'ROKiT logo'
Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App-SignUp Process UI02-Number and PW/android.widget.Image0'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App-SignUp Process UI02-Number and PW/android.view.View0 - Enter your phone number and create a password.'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App-SignUp Process UI02-Number and PW/android.widget.Spinner0 - US (1)'), 
    3)

'Mobile number'
Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App-SignUp Process UI02-Number and PW/android.widget.EditText0'), 
    3)

'Mobile number'
Mobile.tap(findTestObject('Apps/ROKiT Apps/ROKiT Hub App-SignUp Process UI02-Number and PW/android.widget.EditText0'), 3)

Mobile.sendKeys(findTestObject('Apps/ROKiT Apps/ROKiT Hub App-SignUp Process UI02-Number and PW/android.widget.EditText0'), '2345678900')

Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App-SignUp Process UI02-Number and PW/android.widget.EditText0 - Password'), 
    3)

'Enter Password'
driver.findElementById('password').click()

driver.findElementById('password').sendKeys('Test1234')

Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App-SignUp Process UI02-Number and PW/android.widget.EditText0 - Confirm password'), 
    3)

'Enter Confirm Password'
driver.findElementById('confirmPassword').click()

driver.findElementById('confirmPassword').sendKeys('Test1234')

Mobile.hideKeyboard()

Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App-SignUp Process UI02-Number and PW/android.widget.Button0 - Continue'), 
    3)

Mobile.verifyElementVisible(findTestObject('Apps/ROKiT Apps/ROKiT Hub App-SignUp Process UI02-Number and PW/android.widget.Spinner0 - English'), 
    3)

'Click Continue'
driver.findElementById('btnSubmit').click()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Header'
driver.findElementByXPath('//android.view.View[contains(@text, \'Please Confirm Your Phone Number\')][@resource-id = \'confirmModalLabel\']').isDisplayed()

driver.findElementByXPath('//android.view.View[contains(@text, \'You will use this number to sign in.\')]').isDisplayed()

'Mobile number'
driver.findElementByXPath('//android.widget.EditText[contains(@text, \'2345678900\')][@resource-id = \'modalPhoneNumber\']').isDisplayed()

'Button Yes'
driver.findElementByXPath('//android.widget.Button[contains(@text, \'Yes\')]').isDisplayed()

'Button No'
driver.findElementByXPath('//android.widget.Button[contains(@text, \'No\')]').isDisplayed()

driver.findElementByXPath('//android.widget.Button[contains(@text, \'No\')]').click()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Verify Sign Up process UI - Number and PW page ', 
    '', TestLinkAPIResults.TEST_PASSED)

