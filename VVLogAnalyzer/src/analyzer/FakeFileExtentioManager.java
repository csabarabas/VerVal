package analyzer;

public class FakeFileExtentioManager implements FileExtMgr{

	private boolean willReturn;

	public void setWillReturn(boolean willReturn) {
		this.willReturn = willReturn;
	}
	
	@Override
	public boolean isValid(String str) {
		return willReturn;
	}

}
