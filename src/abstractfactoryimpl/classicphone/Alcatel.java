package abstractfactoryimpl.classicphone;

import abstractfactoryimpl.ClassicPhone;

/**
 * Created by misko on 19.1.2015.
 */
public class Alcatel extends ClassicPhone{

    public Alcatel(int screenSize) {
        super(screenSize);
        manufacturer = "ALCATEL";
    }
}
