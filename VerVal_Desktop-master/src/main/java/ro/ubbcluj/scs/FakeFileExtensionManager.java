package ro.ubbcluj.scs;

public class FakeFileExtensionManager implements FileExtensionManager {
	
    public boolean isValid(String fileName) {
        return false;
    }
    
}
