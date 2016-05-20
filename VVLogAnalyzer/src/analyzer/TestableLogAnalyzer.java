package analyzer;

public class TestableLogAnalyzer extends LogAnalyzer {
	private FileExtMgr fem;


	public TestableLogAnalyzer(FakeFileExtentioManager fake) {
		// fake = new FakeFileExtentioManager();
		fem = fake;
	}

	public FileExtMgr getFileExtentionManager() {
		return fem;
	}
}
