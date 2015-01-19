package abstractfactoryimpl.factories;

import abstractfactoryimpl.ClassicPhone;
import abstractfactoryimpl.classicphone.Alcatel;
import abstractfactoryimpl.classicphone.Motorola;
import abstractfactoryimpl.classicphone.Siemens;

/**
 * Created by misko on 19.1.2015.
 */
public class ClassicPhoneFactory implements PhoneFactory{

    public ClassicPhone create(String manufacturer) {
        switch(manufacturer) {
            case "ALCATEL":
                return new Alcatel(2);
            case "MOTOROLA":
                return new Motorola(1);
            case "SIEMENS":
                return new Siemens(1);
            default:
                return null;
        }
    }
}
