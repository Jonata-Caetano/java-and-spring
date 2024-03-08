package org.example.factory.apple.halfsimple.factory;

import org.example.factory.apple.halfsimple.model.IPhone;
import org.example.factory.apple.halfsimple.model.IPhoneX;
import org.example.factory.apple.halfsimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    public IPhone createIPhone(String level) {
        if(level.equals("standard")) {
            return new IPhoneX();
        } else if(level.equals("highEnd")) {
            return new IPhoneXSMax();
        } else return null;
    }

}
