package org.example.abstractfactory.apple.model.iphone;


import org.example.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;

public abstract class IPhone {
	CountryRulesAbstractFactory rules;

	public IPhone(CountryRulesAbstractFactory rules) {
		this.rules = rules;
	}

	public abstract void getHardware();
	
	public void assemble() {
		System.out.println("Assembling all the hardwares");
	}

	public void certificates() {
		System.out.println("Testing all the certificates");
	}

	public void pack() {
		System.out.println("Packing the device");
	}
}
