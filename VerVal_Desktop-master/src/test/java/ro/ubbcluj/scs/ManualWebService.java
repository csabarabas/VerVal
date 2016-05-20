package ro.ubbcluj.scs;

public class ManualWebService implements WebService {
	
    private String lastError;

    @Override
    public void logError(String error) {
        lastError = error;
    }

    @Override
    public String getLastError() {
        return lastError;
    }
    
}
