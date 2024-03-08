package org.example.factory.apple.after.factory;

import org.example.factory.apple.after.model.IPhone;
import org.example.factory.apple.after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {
    @Override
    protected IPhone createIPhone() {
        return new IPhoneX();
    }
}
