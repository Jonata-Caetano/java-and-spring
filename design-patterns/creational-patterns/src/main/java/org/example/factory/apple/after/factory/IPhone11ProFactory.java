package org.example.factory.apple.after.factory;

import org.example.factory.apple.after.model.IPhone;
import org.example.factory.apple.after.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory{
    @Override
    protected IPhone createIPhone() {
        return new IPhone11Pro();
    }
}
