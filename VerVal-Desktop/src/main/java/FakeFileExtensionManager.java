/**
 * @author <a href="mailto:annacs94@gmail.com">Kiss Anna</a>
 * @since 12.04.2016
 */
public class FakeFileExtensionManager implements FileExtensionManager{
    public boolean isValid(String fileName) {
        return false;
    }
}
