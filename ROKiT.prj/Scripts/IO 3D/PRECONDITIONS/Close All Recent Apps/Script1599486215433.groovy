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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.pressHome()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.TextView1 - Extras'), 0)

AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementNotVisible(findTestObject('Apps/Extras Bookmarks/android.widget.TextView1 - Extras'), 0)

while (Mobile.verifyElementNotVisible(findTestObject('Preconditions/Close All Recent Apps/android.widget.TextView3 - CLEAR ALL'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.swipe(512, 200, 512, 1200)
}

Mobile.verifyElementVisible(findTestObject('Preconditions/Close All Recent Apps/android.widget.TextView3 - CLEAR ALL'), 
    0)

Mobile.tap(findTestObject('Preconditions/Close All Recent Apps/android.widget.TextView3 - CLEAR ALL'), 0)

Mobile.verifyElementVisible(findTestObject('Apps/Extras Bookmarks/android.widget.TextView1 - Extras'), 3)

driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH))

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementNotVisible(findTestObject('Preconditions/Close All Recent Apps/android.widget.TextView3 - CLEAR ALL'), 
    0)

Mobile.closeApplication()

