package org.example.factory.apple.halfsimple.factory;

import org.example.factory.apple.halfsimple.model.IPhone;
import org.example.factory.apple.halfsimple.model.IPhone11;
import org.example.factory.apple.halfsimple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

    public IPhone createIPhone(String level) {
        if(level.equals("standard")) {
            return new IPhone11();
        } else if(level.equals("highEnd")) {
            return new IPhone11Pro();
        } else return null;
    }

}