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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://simon.inder.gov.co/registro')

WebUI.click(findTestObject('Page_1545953698408/ComoBoxTipoPersona'))

WebUI.click(findTestObject('Page_1545953698408/SelectTipoPersona'))

WebUI.click(findTestObject('Page_1545953698408/ComboBoxTipoIdentificacion'))

WebUI.click(findTestObject('Page_1545953698408/SelectTipoIdentificacion'))

WebUI.click(findTestObject('Page_1545953698408/TextFieldNumeroDocumento'))

WebUI.setText(findTestObject('Page_1545953698408/TextFieldNumeroDocumento'), '1111222888')

WebUI.click(findTestObject('Page_1545953698408/TextFieldNombres'))

WebUI.setText(findTestObject('Page_1545953698408/TextFieldNombres'), 'Alvaro')

WebUI.click(findTestObject('Page_1545953698408/TextFieldApellidos'))

WebUI.setText(findTestObject('Page_1545953698408/TextFieldApellidos'), 'Loaiza')

WebUI.click(findTestObject('Page_1545953698408/ComboBoxGenero'))

WebUI.click(findTestObject('Page_1545953698408/SelectGenero'))

WebUI.click(findTestObject('Page_1545953698408/FieldNacimiento'))

WebUI.setText(findTestObject('Page_1545953698408/FieldNacimiento'), '15061988')

WebUI.click(findTestObject('Page_1545953698408/TextFieldClaveUno'))

WebUI.setText(findTestObject('Page_1545953698408/TextFieldClaveUno'), 'TGrf3ed')

WebUI.click(findTestObject('Page_1545953698408/TextFieldClaveDos'))

WebUI.setText(findTestObject('Page_1545953698408/TextFieldClaveDos'), 'TGrf3ed')

//WebUI.click(findTestObject('Page_1545953698408/ComoBoxMunicipio'))
//
//WebUI.click(findTestObject('Page_1545953698408/SelectMunicipio'))
//
//WebUI.click(findTestObject('Page_1545953698408/ComboBoxTipoVia'))
//
//WebUI.click(findTestObject('Page_1545953698408/SelectTipoVia'))
//
//WebUI.click(findTestObject('Page_1545953698408/TextFieldNumeroVia'))
//
//WebUI.setText(findTestObject('Page_1545953698408/TextFieldNumeroVia'), '34')
//
//WebUI.click(findTestObject('Page_1545953698408/SelectLetraPrefijo'))
//
//WebUI.click(findTestObject('Page_1545953698408/TextFieldPrimerNumero'))
//
//WebUI.setText(findTestObject('Page_1545953698408/TextFieldPrimerNumero'), '33')
//
//WebUI.click(findTestObject('Page_1545953698408/TextFieldSegundoNumero'))
//
//WebUI.setText(findTestObject('Page_1545953698408/TextFieldSegundoNumero'), '23')

WebUI.click(findTestObject('Page_1545953698408/ComboBoxEstrato'))

WebUI.click(findTestObject('Page_1545953698408/SelectEstrato'))

WebUI.click(findTestObject('Page_1545953698408/TextFieldEmail'))

WebUI.setText(findTestObject('Page_1545953698408/TextFieldEmail'), 'allo@micorreo.com')

WebUI.check(findTestObject('Page_1545953698408/CheckHabeasData'))

WebUI.check(findTestObject('Page_1545953698408/CheckTerminosYCondiciones'))

//WebUI.click(findTestObject('Page_1545953698408/ButtonGuardar'))



