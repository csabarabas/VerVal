package Test;

import org.junit.Before;
import org.junit.Test;

import analyzer.FileExtMgrFactory;
import analyzer.FakeFileExtentioManager;
import analyzer.LogAnalyzer;
import junit.framework.Assert;

public class LogAnalyzerFakeTest {

	private FakeFileExtentioManager fake = new FakeFileExtentioManager();
	private LogAnalyzer log = new LogAnalyzer();
	private FileExtMgrFactory fileManager;

	/**
	 * Set vagy constructorral juttatjuk be a fake-et
	 */
	public LogAnalyzerFakeTest() {
	}
	
	@Before
	public void setUp() {
	}
	
//	@Test
//	public void FakeFEM_withConstructor_returnTrue() {
//		fake = new FakeFileExtentioManager();
//		fake.setWillReturn(true);
//		log = new LogAnalyzer(fake);
//		Assert.assertEquals(log.isValidLogFileName(".slr"), true);
//	}
//
//	@Test
//	public void FakeFEM_withSetter_returnsFalse() {
//		fake.setWillReturn(false);
//		log.setFileExtentioManager(fake);
//		Assert.assertEquals(log.isValidLogFileName(".slr"), false);
//	}

}
