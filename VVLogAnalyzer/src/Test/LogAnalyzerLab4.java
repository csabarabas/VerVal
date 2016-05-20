package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import analyzer.FakeFileExtentioManager;
import analyzer.FileExtMgrFactory;
import analyzer.LogAnalyzer;
import analyzer.TestableLogAnalyzer;

/**
 * Stub haszalata
 * 
 * 	-	Nem a stub donti el, hogy sikeres - e a teszt
 * 
 * @author Csaba
 *
 */
public class LogAnalyzerLab4 {

	
	private LogAnalyzer logAnalyzerTestable;
	private FakeFileExtentioManager fakeExtMgr;
	
	public LogAnalyzerLab4() {
	}

	@Before
	public void setUp() {
		fakeExtMgr = new FakeFileExtentioManager();
		logAnalyzerTestable = new TestableLogAnalyzer(fakeExtMgr);
		FileExtMgrFactory.getInstance().setFileExtMgr(fakeExtMgr);
	}
	
	@After
	public void tearDown() throws Exception {
		// nothing to do
	}
	
	@Test
	public void isValidLogFileNameTestable_NotValid_ReturnFalse() {
		fakeExtMgr.setWillReturn(false);
		assertEquals("should be invalid", logAnalyzerTestable.isValidLogFileName(""), false);
	}
	
	@Test
	public void isValidLogFileNameTestable_Valid_ReturnTrue() {
		fakeExtMgr.setWillReturn(true);
		assertEquals("should be valid", logAnalyzerTestable.isValidLogFileName(""), true);
	}
}
	
	
