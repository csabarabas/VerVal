package ro.ubbcluj.scs;

public class FileExtensionManagerFactory {
	
	private static FileExtensionManagerFactory INSTANCE;
    private FileExtensionManager fileExtensionManager;

    private FileExtensionManagerFactory() {

    }

    public static FileExtensionManagerFactory getInstance() {
        if(INSTANCE == null)
            INSTANCE = new FileExtensionManagerFactory();
        return INSTANCE;
    }

    public FileExtensionManager getFileExtensionManager() {
        if (fileExtensionManager != null) {
        	return fileExtensionManager;
        }
    	return  new FakeFileExtensionManager();
    }

    public void setFileExtensionManager(FileExtensionManager fileExtensionManager) {
        this.fileExtensionManager = fileExtensionManager;
    }
    
}
