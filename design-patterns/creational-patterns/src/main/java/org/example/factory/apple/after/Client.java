package org.example.factory.apple.after;


import org.example.factory.apple.after.factory.IPhone11ProFactory;
import org.example.factory.apple.after.factory.IPhoneFactory;
import org.example.factory.apple.after.factory.IPhoneXFactory;
import org.example.factory.apple.after.model.IPhone;


public class Client {
	public static void main(String[] args) {
		IPhoneFactory iPhoneXFactory = new IPhoneXFactory();
		IPhoneFactory iPhone11ProFactory = new IPhone11ProFactory();


		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iPhoneXFactory.orderIPhone();
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iPhone11ProFactory.orderIPhone();
		System.out.println(iphone2);
	}
}
