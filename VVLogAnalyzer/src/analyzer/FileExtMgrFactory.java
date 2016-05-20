package analyzer;

/**
 * 
 * @author Tamas
 *
 */
public class FileExtMgrFactory {


	private static FileExtMgrFactory INSTANCE;
	private FileExtMgr fileMgr;
	
	private FileExtMgrFactory() {}
	
	public static FileExtMgrFactory getInstance() {
		if(INSTANCE == null) 
			INSTANCE = new FileExtMgrFactory();
		return INSTANCE;
	}
	
	public FileExtMgr getFileExtMgr() {
		if (fileMgr != null)
			return fileMgr;
		else
			return new FakeFileExtentioManager();
	}
	
	public void setFileExtMgr(FileExtMgr fileMgr) {
		this.fileMgr = fileMgr;
	}
	
}
