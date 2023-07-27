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

WebUI.callTestCase(findTestCase('IO Pro/ROKFLiX/ROKFLiX Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ROKFLiX/android.widget.ImageView1'), 0)

if (Mobile.verifyElementVisible(findTestObject('ROKFLiX/android.widget.ImageView3'), 0, FailureHandling.OPTIONAL)) {
    Mobile.comment('Video to start playing')

    Mobile.verifyElementVisible(findTestObject('ROKFLiX/android.widget.ImageView3'), 0)

    Mobile.tap(findTestObject('ROKFLiX/android.widget.ImageView3'), 0)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    Mobile.pressBack()

    Mobile.verifyElementVisible(findTestObject('ROKFLiX/android.widget.ImageView3'), 5)

    Mobile.closeApplication()
} else {
    Mobile.tap(findTestObject('ROKFLiX/android.widget.ImageView2'), 30)

    Mobile.comment('Video to start downloading')

    Mobile.verifyElementVisible(findTestObject('ROKFLiX/android.widget.ImageView3'), 0)

    Mobile.tap(findTestObject('ROKFLiX/android.widget.ImageView3'), 0)

    Mobile.comment('Video to start playing')

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    Mobile.pressBack()

    Mobile.verifyElementVisible(findTestObject('ROKFLiX/android.widget.ImageView3'), 5)

    Mobile.closeApplication()
}

