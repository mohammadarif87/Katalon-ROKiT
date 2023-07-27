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
import java.text.SimpleDateFormat as SimpleDateFormat

CustomKeywords.'com.mobile.keywords.ApplicationBehavior.startInstalledApplication'('Android', deviceInformation, appPackage, 
    appActivity)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.verifyElementVisible(findTestObject('Preconditions/Turn on Wi-Fi/android.widget.TextView4 - Network  Internet'), 
    0)

Mobile.swipe(512, 1400, 512, 200)

Mobile.swipe(512, 1400, 512, 200)

Mobile.verifyElementVisible(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView15 - System'), 
    0)

Mobile.tap(findTestObject('Settings/System/About Phone/View Legal Information/android.widget.TextView15 - System'), 0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView5 - Date  time'), 
    0)

Mobile.tap(findTestObject('System Settings/System/Date And Time/Set Date And Time/android.widget.TextView5 - Date  time'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Automatic time zone'), 
    0)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Use network-provided time zone'), 
    3)

'Toggle button'
Mobile.tapAtPosition(985, 1000)

Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Select time zone'), 
    0)

userName = System.getProperty('user.name')

if (userName == 'Aiden') {
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Automatic time zone'), 
        3)

    if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - GMT-0700 Pacific Daylight Time (1)'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - GMT-0700 Pacific Daylight Time (1)'), 
            3)

        Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - GMT-0700 Pacific Daylight Time (1)'), 
            5)
    } else {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - GMT-0800 Pacific Standard Time'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - GMT-0800 Pacific Standard Time'), 
            0)
    }
    
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Region'), 
        5)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - United States'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Time zone'), 
        0)

    if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Los Angeles (GMT-0700)'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Los Angeles (GMT-0700)'), 
            0)
    } else {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Los Angeles (GMT-0800)'), 
            0)
    }
    
    Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Region'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Albania (1)'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Albania (1)'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Time zone'), 
        0)

    if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Tirane (GMT0200)'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Tirane (GMT0200)'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Tirane (GMT0200)'), 
            0)
    } else {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Tirane (GMT0100)'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Tirane (GMT0100)'), 
            0)
    }
    
    Mobile.pressBack()

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Select time zone'), 
        0)

    if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - GMT0200 Central European Summer Time'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - GMT0200 Central European Summer Time'), 
            0)
    } else {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - GMT0100 Central European Standard Time'), 
            0)
    }
    
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Automatic 24hour format'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Use locale default'), 
        0)

    'Toggle button to OFF - Automatic 24-hour format '
    Mobile.tapAtPosition(985, 1450)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Use 24-hour format'), 
        0)

    if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 PM (1)'), 
        0, FailureHandling.OPTIONAL)) {
        'UK default\r\n'
        not_run: Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
            0)

        'US default'
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 PM (1)'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Automatic 24hour format'), 
            0)

        if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
            0, FailureHandling.OPTIONAL)) {
            Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
                0)

            Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Use 24-hour format'), 
                0)

            if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Automatic 24hour format'), 
                0, FailureHandling.OPTIONAL)) {
                Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Automatic 24hour format'), 
                    0)

                Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Use 24-hour format'), 
                    0)
            }
            
            Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 PM (1)'), 
                0)

            Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
                0)
        } else {
            Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 PM (1)'), 
                0)

            Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
                0)
        }
    } else if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 PM (1)'), 
        0, FailureHandling.OPTIONAL)) {
        not_run: Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 pm'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 PM (1)'), 
            0)

        not_run: Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300 (1)'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Automatic 24hour format'), 
            0)

        if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 PM (1)'), 
            0, FailureHandling.OPTIONAL)) {
            not_run: Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 pm'), 
                0)

            Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 PM (1)'), 
                0)

            Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Use 24-hour format'), 
                0)

            not_run: Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
                0)

            Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300 (1)'), 
                0)

            not_run: Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 pm'), 
                0)

            Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 PM (1)'), 
                0)
        } else {
            not_run: Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
                0)

            Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300 (1)'), 
                0)

            not_run: Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 pm'), 
                0)

            Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 PM (1)'), 
                0)
        }
        
        not_run: Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300 (1)'), 
            0)

        not_run: Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 pm'), 
            0)

        Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 PM (1)'), 
            0)
    }
    
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 PM (1)'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Automatic 24hour format'), 
        0)

    if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300 (1)'), 
        0, FailureHandling.OPTIONAL)) {
        not_run: Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300 (1)'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Use 24-hour format'), 
            0)

        if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Automatic 24hour format'), 
            0, FailureHandling.OPTIONAL)) {
            Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Automatic 24hour format'), 
                0)

            Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Use 24-hour format'), 
                0)
        }
        
        not_run: Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 pm'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 PM (1)'), 
            0)

        not_run: Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
            0)

        Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300 (1)'), 
            0)
    } else {
        not_run: Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 pm'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 PM (1)'), 
            0)

        not_run: Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
            0)

        Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300 (1)'), 
            0)
    }
    
    Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Automatic 24hour format'), 
        0)

    if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - GMT0200 Central European Summer Time'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - GMT0200 Central European Summer Time'), 
            0)
    } else {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - GMT0100 Central European Standard Time'), 
            0)
    }
    
    //dateLocal2 = new Date()
    //rawTime = new SimpleDateFormat('HHmm')
    //timeFormat2 = new SimpleDateFormat('HH:mm')
    //presentRawTime = rawTime.format(dateLocal2)
    //println(presentRawTime)
    //intTime = presentRawTime.toInteger()
    //timeTirane = intTime + 100
    //println(timeTirane)
    //presentRawTime = timeFormat2.format(timeTirane)
    //stringTirane = Integer.toString(timeTirane)
    //presentStringTirane = timeFormat2.format(timeTirane)
    //println(presentStringTirane)
    //println(timeTirane)
    //println(stringTirane)
    //println(presentRawTime)
    //char ch = ':'
    //position = 1
    //public String addChar(String stringTirane, ch, int position) {
    //	StringBuilder sb = new StringBuilder(stringTirane);
    //	sb.insert(position, ':');
    //	return sb.toString();
    //}
    //println(stringTirane)
    //Mobile.scrollToText(stringTirane, FailureHandling.STOP_ON_FAILURE)
    Mobile.comment('Reset Automatic time zone')

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Automatic time zone'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Automatic time zone'), 
        0)

    dateLocal = new Date()

    dateFormat = new SimpleDateFormat('mm/dd/yy')

    timeFormat = new SimpleDateFormat('hh:mm a')

    presentDate = dateFormat.format(dateLocal)

    presentTime = timeFormat.format(dateLocal)

    not_run: Mobile.scrollToText(presentDate, FailureHandling.STOP_ON_FAILURE)

    not_run: Mobile.scrollToText(presentTime, FailureHandling.STOP_ON_FAILURE)
} else {
    if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView11 - GMT0000 Greenwich Mean Time'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView11 - GMT0000 Greenwich Mean Time'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView11 - GMT0000 Greenwich Mean Time'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Region'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - United Kingdom'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Time zone'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView5 - London (GMT0000)'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Region'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Albania (1)'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Albania (1)'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Time zone'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView5 - Tirane (GMT0100)'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView5 - Tirane (GMT0100)'), 
            0)

        Mobile.pressBack()

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Select time zone'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView11 - GMT0100 Central European Standard Time'), 
            0)
    } else {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - GMT0100 British Summer Time'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - GMT0100 British Summer Time'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Region'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - United Kingdom'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Time zone'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - London (GMT0100)'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Region'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Albania (1)'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Albania (1)'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Time zone'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Tirane (GMT0200)'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Tirane (GMT0200)'), 
            0)

        Mobile.pressBack()

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Select time zone'), 
            0)

        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - GMT0200 Central European Summer Time'), 
            0)
    }
    
    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Automatic 24hour format'), 
        0)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Use locale default'), 
        0)

    'Toggle button'
    Mobile.tapAtPosition(985, 1450)

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Use 24-hour format'), 
        0)

    if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Automatic 24hour format'), 
            0)

        if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
            0, FailureHandling.OPTIONAL)) {
            Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
                0)

            Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Use 24-hour format'), 
                0)

            if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
                0, FailureHandling.OPTIONAL)) {
                Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Automatic 24hour format'), 
                    0)

                Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Use 24-hour format'), 
                    0)
            }
            
            Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 pm'), 
                0)

            Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
                0)
        } else {
            Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 pm'), 
                0)

            Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
                0)
        }
    } else if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 pm'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 pm'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Automatic 24hour format'), 
            0)

        if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 pm'), 
            0, FailureHandling.OPTIONAL)) {
            Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 pm'), 
                0)

            Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Use 24-hour format'), 
                0)

            Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
                0)

            Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 pm'), 
                0)
        } else {
            Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
                0)

            Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 pm'), 
                0)
        }
        
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
            0)

        Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 pm'), 
            0)
    }
    
    not_run: Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Automatic 24hour format'), 
        0)

    if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
            0)

        Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Use 24-hour format'), 
            0)

        if (Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
            0, FailureHandling.OPTIONAL)) {
            Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Automatic 24hour format'), 
                0)

            Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Use 24-hour format'), 
                0)
        }
        
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 pm'), 
            0)

        Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
            0)
    } else {
        Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 100 pm'), 
            0)

        Mobile.verifyElementNotVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - 1300'), 
            0)
    }
    
    Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Automatic 24hour format'), 
        0)

    Mobile.comment('Reset Automatic time zone')

    Mobile.verifyElementVisible(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Automatic time zone'), 
        0)

    Mobile.tap(findTestObject('System Settings/System/Date And Time/Adjust Date And Time Preferences/android.widget.TextView0 - Automatic time zone'), 
        0)

    dateLocal = new Date()

    timeFormat = new SimpleDateFormat('HH:mm')

    dateFormat = new SimpleDateFormat('d MMMM yyyy')

    timeFormat = new SimpleDateFormat('HH:mm')

    presentDate = dateFormat.format(dateLocal)

    presentTime = timeFormat.format(dateLocal)

    Mobile.scrollToText(presentDate, FailureHandling.STOP_ON_FAILURE)

    Mobile.scrollToText(presentTime, FailureHandling.STOP_ON_FAILURE)
}

Mobile.closeApplication()

not_run: CustomKeywords.'com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults'('Adjust Date & time preferences', '', TestLinkAPIResults.TEST_PASSED)

