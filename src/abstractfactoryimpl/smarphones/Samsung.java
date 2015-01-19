package abstractfactoryimpl.smarphones;

import abstractfactoryimpl.SmartPhone;

/**
 * Created by misko on 19.1.2015.
 */
public class Samsung extends SmartPhone {

    public Samsung(int screenSize, boolean NFC) {
        super(screenSize, NFC);
        manufacturer = "SAMSUNG";
        OS = "android";
    }
}
