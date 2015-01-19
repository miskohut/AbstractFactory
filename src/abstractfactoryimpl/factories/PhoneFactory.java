package abstractfactoryimpl.factories;

import abstractfactoryimpl.Phone;

/**
 * Created by misko on 19.1.2015.
 */
public interface PhoneFactory {
    public Phone create(String type);
}
