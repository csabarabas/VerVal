/**
 * @author <a href="mailto:annacs94@gmail.com">Kiss Anna</a>
 * @since 22.04.2016
 */
public class ManualWebService implements WebService {
    private String lastError;

    public void logError(String error) {
        lastError = error;
    }

    public String getLastError() {
        return lastError;
    }
}
