package abstractfactoryimpl.classicphone;

import abstractfactoryimpl.ClassicPhone;

/**
 * Created by misko on 19.1.2015.
 */
public class Motorola extends ClassicPhone {

    public Motorola(int screenSize) {
        super(screenSize);
        manufacturer = "MOTOROLA";
    }
}
