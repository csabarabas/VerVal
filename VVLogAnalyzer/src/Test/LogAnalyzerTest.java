package Test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.Test;
import org.junit.runner.RunWith;

import analyzer.LogAnalyzer;
import junit.framework.Assert;

@RunWith(Parameterized.class)
public class LogAnalyzerTest {

	private LogAnalyzer logAnalyzer;

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { 
			{ "asd.slr ", false }, { "asdclr", false }, { ".slr", true } });
	}

	@Parameterized.Parameter
	public String fInput;

	@Parameterized.Parameter(value = 1)
	public boolean fexpected;


	@Before
	public void setUp() {
		logAnalyzer = new LogAnalyzer();
	}

	@After
	public void tearDown() {
		// Nothing to do ...
	}

	@Test(expected = IllegalArgumentException.class)
	public void isValidLogFileNameToShortExceptionThrow() {
		logAnalyzer.isValidLogFileName("");
	}

	@Test
	public void isValidLogFileNameValidNameReturnsTrue() {
		Assert.assertEquals(fexpected, logAnalyzer.isValidLogFileName(fInput));
	}
	
	
}
