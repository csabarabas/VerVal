import org.junit.*;
import org.mockito.Mockito;

/**
 * @author <a href="mailto:annacs94@gmail.com">Kiss Anna</a>
 * @since 11.03.2016
 */
public class LogAnalyzerTest {

    private static final String validLogFileName = "something.slr";
    private static final String invalidLogFileName = "something.slrr";
    private LogAnalyzer logAnalyzer;
    private FileExtensionManagerStub fileExtensionManager;
    private WebService webService;

    @Before
    public void setUp() {
        fileExtensionManager = new FileExtensionManagerStub();
        logAnalyzer = new TestableLogAnalyzer(fileExtensionManager);
        FileExtensionManagerFactory.getInstance().setFileExtensionManager(fileExtensionManager);
        webService = new ManualWebService();
    }

    @After
    public void tearDown() {
        // nothing to do
    }

    @Test
    public void isValidLogFileName_ValidLogFileName_ReturnsTrue() {
        fileExtensionManager.setWillReturn(true);
        Assert.assertEquals(validLogFileName + " should be valid",
                logAnalyzer.isValidLogFileName(validLogFileName), true);
    }

    @Test
    public void isValidLogFileName_InvalidLogFileName_ReturnsFalse() {
        fileExtensionManager.setWillReturn(false);
        Assert.assertEquals(invalidLogFileName + " should be invalid",
                logAnalyzer.isValidLogFileName(invalidLogFileName), false);

    }

//    @Test(expected = IllegalArgumentException.class)
//    public void isValidLogFileName_Empty_ExceptionThrow() {
//        logAnalyzer.isValidLogFileName("");
//    }


    @Test
    public void IsValidLogFileNameTestable_NotValid_ReturnFalse() {
        fileExtensionManager.setWillReturn(false);
        Assert.assertEquals("should be invalid", logAnalyzer.isValidLogFileName(""), false);
    }

    @Test
    public void IsValidLogFileNameTestable_Valid_ReturnTrue() {
        fileExtensionManager.setWillReturn(true);
        Assert.assertEquals("should be valid", logAnalyzer.isValidLogFileName(""), true);
    }

    @Test
    public void isValiedLogFileName_FileNameTooShort_CallsWebService() {
        logAnalyzer.isValidLogFileName("12");
        Assert.assertEquals("should be too short", webService.getLastError(), "12 too short");
    }

    @Test
    public void isValiedLogFileNameMock_FileNameTooShort_CallsWebService() {
        WebService mockedWebService = Mockito.mock(WebService.class);
        logAnalyzer.setWebService(mockedWebService);
        logAnalyzer.isValidLogFileName("12");
        Mockito.verify(mockedWebService, Mockito.times(2)).logError("12 too short");

    }
}
