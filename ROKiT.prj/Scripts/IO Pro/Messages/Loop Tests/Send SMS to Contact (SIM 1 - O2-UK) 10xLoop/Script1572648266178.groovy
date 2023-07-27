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

for (def index : (0..10)) {
    WebUI.callTestCase(findTestCase('IO Pro/Messages/Send SMS (Both SIMs - SIM 1 - O2-UK)'), [('appPackage') : 'com.google.android.apps.messaging'
            , ('appActivity') : '.home.HomeActivity', ('deviceInformation') : [('platformVersion') : '9', ('deviceName') : 'ROKiT IO PRO (Android 9)', ('deviceId') : 'IOPRO0123456789A', ('platformName') : 'Android']], 
        FailureHandling.STOP_ON_FAILURE)
}

