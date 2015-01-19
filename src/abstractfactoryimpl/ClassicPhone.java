package abstractfactoryimpl;

/**
 * Created by misko on 19.1.2015.
 */
public abstract class ClassicPhone implements Phone {

    protected String manufacturer;
    protected int screenSize;

    public ClassicPhone(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public int getScreenSize() {
        return screenSize;
    }

    @Override
    public boolean hasNFC() {
        return false;
    }

    @Override
    public String getOS() {
        return null;
    }
}
