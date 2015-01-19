package abstractfactoryimpl;

/**
 * Created by misko on 19.1.2015.
 */
public abstract class SmartPhone implements Phone {

    protected String manufacturer;
    protected int screenSize;
    protected boolean NFC;
    protected String OS;

    public SmartPhone(int screenSize, boolean NFC) {
        this.screenSize = screenSize;
        this.NFC = NFC;
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
        return NFC;
    }

    @Override
    public String getOS() {
        return OS;
    }
}
