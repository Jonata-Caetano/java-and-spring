package org.example.abstractfactory.apple.factory;

import org.example.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import org.example.abstractfactory.apple.model.iphone.IPhone;
import org.example.abstractfactory.apple.model.iphone.IPhoneX;
import org.example.abstractfactory.apple.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhoneXFactory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX(rules);
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax(rules);
		} else return null;
	}

}
