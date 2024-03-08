package org.example.factory.apple.after.factory;

import org.example.factory.apple.after.model.IPhone;
import org.example.factory.apple.after.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory{
    @Override
    protected IPhone createIPhone() {
        return new IPhone11();
    }
}
