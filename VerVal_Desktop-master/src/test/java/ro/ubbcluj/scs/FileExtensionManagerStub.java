package ro.ubbcluj.scs;

public class FileExtensionManagerStub implements FileExtensionManager {
	
    private boolean willReturn;

    @Override
    public boolean isValid(final String fileName) {
        return willReturn;
    }

    public void setWillReturn(final boolean willReturn) {
        this.willReturn = willReturn;
    }
    
}