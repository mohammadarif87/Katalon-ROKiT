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

Mobile.callTestCase(findTestCase('IO Pro/PRECONDITIONS/Turn on Wi-Fi'), [('appPackage') : 'com.android.settings', ('appActivity') : '.Settings'
        , ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO Pro (Android 9)', ('deviceId') : 'IOPRO0123456789A'
            , ('platformName') : 'Android']], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.TextView0 - Chrome with Karma'), 3)

    Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App on Home Screen/android.widget.TextView0 - Weve removed all the trackers and data harvesters leaving just the good bits.'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App on Home Screen/android.widget.Button0 - Yes please'), 
        3)

    Mobile.tap(findTestObject('Apps/Internet/android.widget.Button0 - Yes please'), 3)

    Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.TextView1 - Welcome to Liberty'), 3)

    AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

    'Internet Icon'
    driver.findElementByXPath('//android.widget.ImageView[@resource-id = \'com.libertyvaults.rokit:id/image\'][@package = \'com.libertyvaults.rokit\']').isDisplayed()

    Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.TextView2 - By using this application you agree to Libertys Terms of Service and Privacy Notice.'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.Button0 - Accept'), 3)

    Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.Button1 - Reject'), 3)

    Mobile.tap(findTestObject('Apps/Internet/android.widget.Button0 - Accept'), 3)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    'Google Logo'
    driver.findElementByXPath('//android.widget.ImageView[@resource-id = \'com.libertyvaults.rokit:id/item_search_logo\'][@package = \'com.libertyvaults.rokit\']').isDisplayed()

    Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.TextView0 - Search or type web address (1)'), 
        3)

    Mobile.tap(findTestObject('Apps/Extra Apps and Content/Internet App/Search/android.widget.TextView0 - Search or type web address'), 
        3)

    Mobile.setText(findTestObject('Apps/Extra Apps and Content/Internet App/Youtube/android.widget.EditText0 - Search or type web address'), 
        'Youtube', 3)

    Mobile.tapAtPosition(990, 1930)

    if (Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Youtube/android.widget.Button0 - I agree'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Youtube/android.widget.Button0 - I agree'), 
            3)

        Mobile.tap(findTestObject('Apps/Extra Apps and Content/Internet App/Youtube/android.widget.Button0 - I agree'), 
            3)
    }
    
    Mobile.tap(findTestObject('Apps/Extra Apps and Content/Internet App/Youtube/android.view.View0 - YouTube  home Web Result with Site Links YouTube'), 
        3)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    'Youtube app logo'
    driver.findElementByXPath('//android.widget.ImageView[@resource-id = \'com.google.android.youtube:id/youtube_logo\'][@package = \'com.google.android.youtube\']').isDisplayed()

    Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Youtube/android.widget.TextView0 - Home'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Youtube/android.widget.TextView0 - Explore'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Youtube/android.widget.TextView0 - Subscriptions'), 
        3)

    not_run: Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Youtube/android.widget.TextView0 - Notifications'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Youtube/android.widget.TextView0 - Library'), 
        3)

    Mobile.pressHome()

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.tapAndHold(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.TextView0 - Internet (1)'), 
        1, 0)

    'Open Internet settings'
    driver.findElementByXPath('//android.widget.ImageView[@package = \'com.android.launcher3\'][@content-desc = \'App info\']').isDisplayed()

    driver.findElementByXPath('//android.widget.ImageView[@package = \'com.android.launcher3\'][@content-desc = \'App info\']').click()

    'Verify Internet strings'
    driver.findElementByXPath('//android.widget.TextView[contains(@text, \'Internet\')][@resource-id = \'com.android.settings:id/entity_header_title\']').isDisplayed()

    Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.TextView0 - Storage'), 
        3)

    Mobile.tap(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.TextView0 - Storage'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.Button0 - CLEAR STORAGE'), 
        3)

    Mobile.tap(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.Button0 - CLEAR STORAGE'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.Button0 - CLEAR ALL DATA'), 
        3)

    Mobile.tap(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.Button0 - CLEAR ALL DATA'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.TextView0 - Delete app data'), 
        3)

    Mobile.tap(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.TextView0 - Delete app data'), 
        3)

    Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.Button0 - OK'), 
        3)

    Mobile.tap(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.Button0 - OK'), 
        3)
} else {
    Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.TextView0 - Chromium with Karma'), 0)

    not_run: Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.TextView0 - Chrome with Karma'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.TextView1 - Weve removed all the trackers and data harvesters leaving just the good bits.'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.Button0 - Yes please'), 0)

    Mobile.tap(findTestObject('Apps/Internet/android.widget.Button0 - Yes please'), 0)

    Mobile.tap(findTestObject('Apps/Internet/android.widget.TextView1 - Welcome to Karma'), 0)

    not_run: Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.TextView1 - Welcome to Liberty'), 
        0)

    'Internet Icon'
    Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.ImageView0'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.TextView2 - By using this application you agree to Terms of Service and Privacy Notice.'), 
        0)

    not_run: Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.TextView2 - By using this application you agree to Libertys Terms of Service and Privacy Notice.'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.Button0 - Accept'), 0)

    Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.Button1 - Reject'), 0)

    Mobile.tap(findTestObject('Apps/Internet/android.widget.Button0 - Accept'), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    'Google logo'
    Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.FrameLayout7'), 0)

    'Google Logo'
    not_run: Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.ImageView0'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.EditText0 - Search or type web address (1)'), 
        0)

    Mobile.tap(findTestObject('Apps/Internet/android.widget.EditText0 - Search or type web address (1)'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.TextView0 - Whats new'), 0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.TextView0 - Whats new'), 0)

        Mobile.verifyElementVisible(findTestObject('Apps/Internet/android.widget.TextView2 - GOT IT THANKS'), 0)

        Mobile.tap(findTestObject('Apps/Internet/android.widget.TextView2 - GOT IT THANKS'), 0)
    }
    
    Mobile.setText(findTestObject('Apps/Extra Apps and Content/Internet App/Youtube/android.widget.EditText0 - Search or type web address'), 
        'Youtube', 0)

    Mobile.tapAtPosition(990, 1930)

    Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Youtube/android.widget.Button0 - I agree'), 
        0)

    Mobile.tap(findTestObject('Apps/Extra Apps and Content/Internet App/Youtube/android.widget.Button0 - I agree'), 0)

    Mobile.tap(findTestObject('Apps/Extra Apps and Content/Internet App/Youtube/android.view.View0 - m.youtube.com Web result with site links YouTube (2)'), 
        0)

    'Youtube app logo'
    Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Youtube/android.widget.ImageView0'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Youtube/android.widget.TextView0 - Home'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Youtube/android.widget.TextView0 - Explore'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Youtube/android.widget.TextView0 - Subscriptions'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Youtube/android.widget.TextView0 - Library'), 
        0)

    not_run: Mobile.pressHome()

    not_run: Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    not_run: Mobile.tapAndHold(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.TextView0 - Internet (1)'), 
        0, 0)

    not_run: Mobile.tapAtPosition(777, 820)

    not_run: Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.TextView0 - Internet (2)'), 
        0)

    not_run: Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.TextView0 - Storage'), 
        0)

    not_run: Mobile.tap(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.TextView0 - Storage'), 
        0)

    not_run: Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.Button0 - CLEAR STORAGE'), 
        0)

    not_run: Mobile.tap(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.Button0 - CLEAR STORAGE'), 
        0)

    not_run: Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.Button0 - CLEAR ALL DATA'), 
        0)

    not_run: Mobile.tap(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.Button0 - CLEAR ALL DATA'), 
        0)

    not_run: Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.TextView0 - Delete app data'), 
        0)

    not_run: Mobile.tap(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.TextView0 - Delete app data'), 
        0)

    not_run: Mobile.verifyElementVisible(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.Button0 - OK'), 
        0)

    not_run: Mobile.tap(findTestObject('Apps/Extra Apps and Content/Internet App/Accept Terms And Privacy/android.widget.Button0 - OK'), 
        0)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Youtube', '', TestLinkAPIResults.TEST_PASSED)

