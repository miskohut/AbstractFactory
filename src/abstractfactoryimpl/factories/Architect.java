package abstractfactoryimpl.factories;

/**
 * Created by misko on 19.1.2015.
 */
public class Architect {

    public PhoneFactory create(String type) {
        switch(type) {
            case "smart":
                return new SmartPhoneFactory();
            case "classic":
                return new ClassicPhoneFactory();
            default:
                return null;
        }
    }
}
