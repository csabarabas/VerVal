/**
 * @author <a href="mailto:annacs94@gmail.com">Kiss Anna</a>
 * @since 11.03.2016
 */
public class LogAnalyzer {
    private WebService webService;

    public boolean isValidLogFileName(String s) {
//        if (s.isEmpty()) {
//            throw new IllegalArgumentException("Filename is empty");
//        }

        if (webService != null && s.length() < 3) {
            webService.logError(s + " too short");
            webService.logError(s + " too short");
        }

        return getFileExtensionManager().isValid(s);

    }

    public void setWebService(WebService webService) {
        this.webService = webService;
    }

    public FileExtensionManager getFileExtensionManager() {
        return FileExtensionManagerFactory.getInstance().getFileExtensionManager();
    }
}
