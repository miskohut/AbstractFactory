package abstractfactoryimpl;

/**
 * Created by misko on 19.1.2015.
 */
public interface Phone {
    public String getManufacturer();
    public int getScreenSize();
    public boolean hasNFC();
    public String getOS();
}
