package abstractfactoryimpl.factories;

import abstractfactoryimpl.SmartPhone;
import abstractfactoryimpl.smarphones.IPhone;
import abstractfactoryimpl.smarphones.Nokia;
import abstractfactoryimpl.smarphones.Samsung;

/**
 * Created by misko on 19.1.2015.
 */
public class SmartPhoneFactory implements PhoneFactory {

    public SmartPhone create(String manufacturer) {
        switch(manufacturer) {
            case "APPLE":
                return new IPhone(4, true);
            case "SAMSUNG":
                return new Samsung(5, true);
            case "NOKIA":
                return new Nokia(4, false);
            default:
                return null;
        }
    }
}
