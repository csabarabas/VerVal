package analyzer;

public class LogAnalyzer extends IllegalArgumentException {

	private Webservice service;

	public LogAnalyzer() {
		service = new Webservice();
	}

	public boolean isValidLogFileName(String fileName) {

		if (fileName.length() < ".slr".length()) {
			service.logError(fileName + " Too short");
		}
		return fileName.endsWith(".slr") ? true : false;
	}
	
	

	public Webservice getService() {
		return service;
	}

	public void setWebService(Webservice service) {
		this.service = service;
	}

	public FileExtMgr getFileExtentionManager() {
		return new FileExtMgrImp();

	}

}
