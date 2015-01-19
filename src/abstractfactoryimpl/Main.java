package abstractfactoryimpl;

import abstractfactoryimpl.factories.Architect;
import abstractfactoryimpl.factories.PhoneFactory;

/**
 * Created by misko on 19.1.2015.
 */
public class Main {

    public static void main(String[] args) {
        Architect architect = new Architect();
        PhoneFactory classicFactory = architect.create("classic");
        PhoneFactory smartFactory = architect.create("smart");

        Phone motorolaV = classicFactory.create("MOTOROLA");
        Phone samsungS4 = smartFactory.create("SAMSUNG");


        System.out.println(motorolaV.getManufacturer() + ", Screen size: " + motorolaV.getScreenSize());
        System.out.println(samsungS4.getManufacturer() + ", NFC: " + samsungS4.hasNFC());
    }
}
