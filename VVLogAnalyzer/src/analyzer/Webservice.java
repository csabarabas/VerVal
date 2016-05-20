package analyzer;

public class Webservice implements IWebService{

	private String lastError;


	@Override
	public void logError(String str) {
		lastError = str;
	}
	
	@Override
	public String getLastError() {
		return lastError;
	}



}
