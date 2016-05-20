/**
 * @author <a href="mailto:annacs94@gmail.com">Kiss Anna</a>
 * @since 25.03.2016
 */
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
