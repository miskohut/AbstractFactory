package abstractfactoryimpl.classicphone;

import abstractfactoryimpl.ClassicPhone;

/**
 * Created by misko on 19.1.2015.
 */
public class Siemens extends ClassicPhone {

    public Siemens(int screenSize) {
        super(screenSize);
        manufacturer = "SIEMENS";
    }
}
