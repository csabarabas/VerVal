package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import analyzer.LogAnalyzer;
import analyzer.Webservice;

public class LogAnalyzerLab5 {
	
	private LogAnalyzer logAnalyzer;
	private Webservice service;
	
	@Before
	public void setUp() {
		service = new Webservice();
		logAnalyzer = new LogAnalyzer();
		service = logAnalyzer.getService();
	}
	
	@After
	public void tearDown() throws Exception {
		// nothing to do
	}
	
	@Test
	public void idValidLogFileName_FileNameTooShort_CallsWebService(){
		logAnalyzer.isValidLogFileName("1s");
		logAnalyzer.setWebService(service);
		assertEquals("1s Too short", service.getLastError());
	}
	
	@Test
	public void idValidLogFileNameMock_FileNameTooShort_CallsWebService(){
		Webservice mockedService = Mockito.mock(Webservice.class);
		logAnalyzer.setWebService(mockedService);
		logAnalyzer.isValidLogFileName("12");
		Mockito.verify(mockedService, Mockito.times(1)).logError("12 Too short");

		
	}

}
