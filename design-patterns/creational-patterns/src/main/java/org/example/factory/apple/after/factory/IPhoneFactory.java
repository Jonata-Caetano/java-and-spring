package org.example.factory.apple.after.factory;

import org.example.factory.apple.after.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIPhone() {
        IPhone device = null;
        device = createIPhone();
        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIPhone();
}
