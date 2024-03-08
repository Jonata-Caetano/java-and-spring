package org.example.factory.apple.halfsimple;


import org.example.factory.apple.halfsimple.model.IPhone;
import org.example.factory.apple.halfsimple.factory.IPhone11Factory;
import org.example.factory.apple.halfsimple.factory.IPhoneFactory;
import org.example.factory.apple.halfsimple.factory.IPhoneXFactory;



public class Client {
	public static void main(String[] args) {
		IPhoneFactory genXFactory = new IPhoneXFactory();
		IPhoneFactory gen11Factory = new IPhone11Factory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
