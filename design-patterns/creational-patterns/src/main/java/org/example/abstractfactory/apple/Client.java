package org.example.abstractfactory.apple;

import org.example.abstractfactory.apple.factory.IPhoneFactory;
import org.example.abstractfactory.apple.factory.abstractfactory.BrazilianRulesAbstractFactory;
import org.example.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import org.example.abstractfactory.apple.factory.IPhone11Factory;
import org.example.abstractfactory.apple.factory.IPhoneXFactory;
import org.example.abstractfactory.apple.model.iphone.IPhone;

public class Client {

	public static void main(String[] args) {
		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		IPhoneFactory genXFactory = new IPhoneXFactory(rules);
		IPhoneFactory gen11Factory = new IPhone11Factory(rules);

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
