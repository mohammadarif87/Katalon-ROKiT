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
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey

Mobile.comment('If Messages app fails to load with this test, it needs to be updated via Play Store')

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementNotVisible(findTestObject('Messages/Launch Messages App/android.widget.Button0 - Start chat'), 0, 
    FailureHandling.OPTIONAL)) {
    AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

    driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
}

'Three dots'
Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.ImageView0'), 0)

'Start chat button'
Mobile.verifyElementVisible(findTestObject('Messages/Launch Messages App/android.widget.Button0 - Start chat'), 0)

not_run: Mobile.delay(10)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    while (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.FrameLayout0 (1)'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.comment('If there is a message then tap into it and delete it')

        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.FrameLayout0 (1)'), 0)

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        '3 dots in the top right'
        Mobile.tapAtPosition(680, 100)

        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - Delete'), 0)

        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - Delete'), 0)

        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView0 - Delete this conversation'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView1 - This action cannot be undone.'), 
            0)

        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.Button1 - Delete'), 0)

        WebUI.delay(3)
    }
} else {
    while (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.FrameLayout4'), 0, FailureHandling.OPTIONAL)) {
        Mobile.comment('If there is a message then tap into it and delete it')

        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.FrameLayout4'), 0)

        Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

        '3 dots in the top right'
        Mobile.tapAtPosition(680, 100)

        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - Delete'), 0)

        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.TextView3 - Delete'), 0)

        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView0 - Delete this conversation'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Messages/android.widget.TextView1 - This action cannot be undone.'), 
            0)

        Mobile.tap(findTestObject('Preconditions/Delete Messages/android.widget.Button1 - Delete'), 0)

        WebUI.delay(3)
    }
}

Mobile.closeApplication()

