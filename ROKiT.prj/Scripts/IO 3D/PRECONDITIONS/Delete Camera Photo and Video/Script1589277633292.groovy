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

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Gallery button'
Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Camera Photo and Video IO 3D/android.widget.ImageView5'), 
    0)

'Gallery button'
Mobile.tap(findTestObject('Preconditions/Delete Camera Photo and Video IO 3D/android.widget.ImageView5'), 0)

if (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Camera Photo and Video IO 3D/android.widget.TextView0 - Complete action using Gallery'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Camera Photo and Video IO 3D/android.widget.TextView0 - Complete action using Gallery'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Camera Photo and Video IO 3D/android.widget.Button1 - ALWAYS'), 
        0)

    Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Camera Photo and Video IO 3D/android.widget.Button0 - JUST ONCE'), 
        0)

    Mobile.tap(findTestObject('Preconditions/Delete Camera Photo and Video IO 3D/android.widget.Button0 - JUST ONCE'), 0)

    Mobile.delay(6, FailureHandling.STOP_ON_FAILURE)

    Mobile.tapAtPosition(512, 512)

    while (Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Camera Photo and Video IO 3D/android.widget.ImageButton2'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.comment('If picture/video is present, delete it')

        '3 dots'
        Mobile.tap(findTestObject('Preconditions/Delete Camera Photo and Video IO 3D/android.widget.ImageButton2'), 0)

        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Camera Photo and Video IO 3D/android.widget.TextView0 - Delete'), 
            0)

        Mobile.tap(findTestObject('Preconditions/Delete Camera Photo and Video IO 3D/android.widget.TextView0 - Delete'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Camera Photo and Video IO 3D/android.widget.TextView0 - Delete selected item'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Camera Photo and Video IO 3D/android.widget.Button0 - CANCEL'), 
            0)

        Mobile.verifyElementVisible(findTestObject('Preconditions/Delete Camera Photo and Video IO 3D/android.widget.Button1 - OK'), 
            0)

        Mobile.tap(findTestObject('Preconditions/Delete Camera Photo and Video IO 3D/android.widget.Button1 - OK'), 0)

        Mobile.delay(6, FailureHandling.STOP_ON_FAILURE)

        Mobile.tapAtPosition(512, 512)
    }
}

Mobile.closeApplication()

