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

not_run: WebUI.callTestCase(findTestCase('IO Pro/ROKFLiX/ROKFLiX Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.startApplication('C:\\Users\\User\\Downloads\\rf_live_1.0.55.apk', false)

Mobile.tap(findTestObject('ROKFLiX/android.widget.ImageView1'), 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ROKFLiX/android.widget.ImageView2'), 0)

not_run: Mobile.tapAtPosition(159, 1952)

Mobile.comment('Video to start downloading')

Mobile.verifyElementVisible(findTestObject('ROKFLiX/android.widget.ImageView3'), 30)

