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
import org.openqa.selenium.Keys as Keys

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementNotVisible(findTestObject('Android Market/Browse/android.widget.TextView0 - Search for apps  games'), 
    3, FailureHandling.OPTIONAL)) {
    Mobile.pressBack()
}

Mobile.tap(findTestObject('Android Market/Browse/android.widget.TextView0 - Search for apps  games'), 3)

not_run: Mobile.tap(findTestObject('Android Market/Download App/android.widget.EditText0 - Search for apps  games'), 3)

not_run: Mobile.setText(findTestObject('Android Market/Download App/android.widget.EditText0 - Search for apps  games'), 
    'network cell info lite', 3)

not_run: Mobile.tap(findTestObject('Android Market/Download App/android.widget.TextView0 - network cell info lite'), 3)

AndroidDriver<MobileElement> driver = MobileDriverFactory.getDriver()

'Search network cell info lite'
driver.findElementById('com.android.vending:id/0_resource_name_obfuscated').sendKeys('network cell info lite')

//Mobile.hideKeyboard()
driver.findElementByXPath('//android.widget.TextView[@text = \'network cell info lite\']').click()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

driver.findElementByXPath('//android.widget.TextView[@text = \'Network Cell Info Lite - Mobile & WiFi Signal\']').click();

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.verifyElementVisible(findTestObject('Android Market/Download App/android.widget.TextView0 - Network Cell Info Lite - Mobile  WiFi Signal'), 
    3)

not_run: Mobile.tap(findTestObject('Android Market/Download App/android.widget.TextView1 - Network Cell Info Lite - Mobile  WiFi Signal'), 
    3)

driver.findElementByXPath('//android.widget.TextView[@text = \'Network Cell Info Lite - Mobile & WiFi Signal\']').isDisplayed()

not_run: Mobile.verifyElementVisible(findTestObject('Android Market/Download App/android.widget.Button0 - Uninstall'), 4)

not_run: Mobile.tap(findTestObject('Android Market/Download App/android.widget.Button0 - Uninstall'), 3)

driver.findElementByXPath('//android.widget.Button[@text = \'Uninstall\']').isDisplayed()

driver.findElementByXPath('//android.widget.Button[@text = \'Uninstall\']').click()

not_run: Mobile.verifyElementVisible(findTestObject('Preconditions/Uninstall Network Cell Info App/android.widget.TextView0 - Uninstall this app'), 
    3)

Mobile.tap(findTestObject('Preconditions/Uninstall Network Cell Info App/android.widget.Button1 - Uninstall'), 3)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Android Market/Download App/android.widget.Button0 - Install (1)'), 30)

Mobile.pressHome()

