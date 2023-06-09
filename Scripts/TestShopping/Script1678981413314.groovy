import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/span_ToolsQA Demo Site (1)'))

WebUI.scrollToElement(findTestObject('Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_Select options_noo-thumbnail-product hove_5f1801'), 
    1)

WebUI.click(findTestObject('BlackTshirt'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_black lux graphic t-shirt  ToolsQA Demo Site/select_Choose an optionBlack'), 
    'black', true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_black lux graphic t-shirt  ToolsQA Demo Site/select_Choose an option323436'), 
    '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_black lux graphic t-shirt  ToolsQA Demo Site/button_Add to cart'))

WebUI.verifyElementText(findTestObject('AddedToCart'), 'View cart')

WebUI.closeBrowser()

