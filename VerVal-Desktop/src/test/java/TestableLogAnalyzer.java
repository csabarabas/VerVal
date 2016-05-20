/**
 * @author <a href="mailto:annacs94@gmail.com">Kiss Anna</a>
 * @since 12.04.2016
 */
public class TestableLogAnalyzer extends LogAnalyzer {
    private FileExtensionManager fileExtensionManager;

    public TestableLogAnalyzer(FileExtensionManager fileExtensionManager) {
        this.fileExtensionManager = fileExtensionManager;
    }

    @Override
    public FileExtensionManager getFileExtensionManager() {
        return fileExtensionManager;
    }
}
