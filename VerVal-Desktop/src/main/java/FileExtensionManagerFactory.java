/**
 * @author <a href="mailto:annacs94@gmail.com">Kiss Anna</a>
 * @since 12.04.2016
 */
public class FileExtensionManagerFactory {

    private static FileExtensionManagerFactory INSTANCE;
    private FileExtensionManager fileExtensionManager;

    private FileExtensionManagerFactory() {

    }

    public static FileExtensionManagerFactory getInstance() {
        if(INSTANCE == null)
            INSTANCE= new FileExtensionManagerFactory();
        return INSTANCE;
    }

    public FileExtensionManager getFileExtensionManager() {
        return fileExtensionManager != null ? fileExtensionManager : new FakeFileExtensionManager();
    }

    public void setFileExtensionManager(FileExtensionManager fileExtensionManager) {
        this.fileExtensionManager = fileExtensionManager;
    }
}
