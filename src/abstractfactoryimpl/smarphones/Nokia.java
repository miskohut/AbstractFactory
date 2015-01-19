package abstractfactoryimpl.smarphones;

import abstractfactoryimpl.SmartPhone;

/**
 * Created by misko on 19.1.2015.
 */
public class Nokia extends SmartPhone {

    public Nokia(int screenSize, boolean NFC) {
        super(screenSize, NFC);
        manufacturer = "NOKIA";
        OS = "WindowsPhone";
    }
}
