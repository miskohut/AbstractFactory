package abstractfactoryimpl.smarphones;

import abstractfactoryimpl.SmartPhone;

/**
 * Created by misko on 19.1.2015.
 */
public class IPhone extends SmartPhone {

    public IPhone(int screenSize, boolean NFC) {
        super(screenSize, NFC);
        manufacturer = "APPLE";
        OS = "iOS";
    }
}
