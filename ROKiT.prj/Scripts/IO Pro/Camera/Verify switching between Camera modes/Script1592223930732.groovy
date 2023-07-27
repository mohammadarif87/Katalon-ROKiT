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

'Flash button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageButton0'), 0)

'Beauty Mode button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView0'), 0)

'Switch Camera button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageButton1'), 0)

'Gallery button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView1'), 0)

'Shutter button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView3'), 0)

'Video Mode button'
Mobile.verifyElementVisible(findTestObject('Apps/Camera/android.widget.ImageView4'), 0)

Mobile.swipe(200, 512, 800, 512)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Camera/Verify switching between Camera modes/android.widget.TextView1 - Normal'), 
    0)

Mobile.verifyElementVisible(findTestObject('Camera/Verify switching between Camera modes/android.widget.TextView2 - Panorama'), 
    0)

'Panorama'
Mobile.tapAtPosition(550, 400)

Mobile.verifyElementVisible(findTestObject('Camera/Verify switching between Camera modes/android.widget.TextView0 - Close Panorama'), 
    0)

Mobile.swipe(200, 512, 800, 512)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Camera/Verify switching between Camera modes/android.widget.TextView3 - HDR'), 
    0)

'HDR'
Mobile.tapAtPosition(900, 400)

Mobile.verifyElementVisible(findTestObject('Camera/Verify switching between Camera modes/android.widget.TextView0 - Close HDR'), 
    0)

Mobile.swipe(200, 512, 800, 512)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Camera/Verify switching between Camera modes/android.widget.TextView4 - Night'), 
    0)

'Night'
Mobile.tapAtPosition(200, 800)

Mobile.verifyElementVisible(findTestObject('Camera/Verify switching between Camera modes/android.widget.TextView0 - Close Night'), 
    0)

Mobile.swipe(200, 512, 800, 512)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Camera/Verify switching between Camera modes/android.widget.TextView5 - Beauty'), 
    0)

'Beauty'
Mobile.tapAtPosition(550, 800)

Mobile.verifyElementVisible(findTestObject('Camera/Verify switching between Camera modes/android.widget.TextView1 - Close Beauty'), 
    0)

Mobile.swipe(200, 512, 800, 512)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Camera/Verify switching between Camera modes/android.widget.TextView6 - SLR'), 
    0)

'SLR'
Mobile.tapAtPosition(900, 800)

Mobile.verifyElementVisible(findTestObject('Camera/Verify switching between Camera modes/android.widget.TextView0 - Close SLR'), 
    0)

Mobile.swipe(200, 512, 800, 512)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Camera/Verify switching between Camera modes/android.widget.TextView7 - Super Night'), 
    0)

'Super Night'
Mobile.tapAtPosition(200, 1200)

Mobile.verifyElementVisible(findTestObject('Camera/Verify switching between Camera modes/android.widget.TextView0 - Close Super Night'), 
    0)

Mobile.swipe(200, 512, 800, 512)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Camera/Verify switching between Camera modes/android.widget.TextView8 - Pose'), 
    0)

'Pose'
Mobile.tapAtPosition(550, 1200)

Mobile.verifyElementVisible(findTestObject('Camera/Verify switching between Camera modes/android.widget.TextView1 - Close Pose mode'), 
    0)

Mobile.swipe(200, 512, 800, 512)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Camera/Verify switching between Camera modes/android.widget.TextView9 - Child'), 
    0)

'Child'
Mobile.tapAtPosition(900, 1200)

Mobile.verifyElementVisible(findTestObject('Camera/Verify switching between Camera modes/android.widget.TextView1 - Close Child mode'), 
    0)

Mobile.swipe(200, 512, 800, 512)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Camera/Verify switching between Camera modes/android.widget.TextView10 - FilmMode'), 
    0)

'Film Mode'
Mobile.tapAtPosition(200, 1600)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(200, 512, 800, 512)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Camera/Verify switching between Camera modes/android.widget.TextView11 - QRCodeScanMode'), 
    0)

'QR Code Scan Mode'
Mobile.tapAtPosition(550, 1600)

Mobile.verifyElementVisible(findTestObject('Camera/Verify switching between Camera modes/android.widget.TextView0 - Align QR code in box to scan'), 
    0)

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Verify switching between Camera modes', 
    '', TestLinkAPIResults.TEST_PASSED)

