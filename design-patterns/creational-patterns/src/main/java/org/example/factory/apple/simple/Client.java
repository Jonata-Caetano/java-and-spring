package org.example.factory.apple.simple;


import org.example.factory.apple.simple.factory.IPhoneSimpleFactory;
import org.example.factory.apple.simple.model.IPhone;

public class Client {
	public static void main(String[] args) {
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = IPhoneSimpleFactory.orderIPhone("X", "standard");
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = IPhoneSimpleFactory.orderIPhone("11", "highEnd");
		System.out.println(iphone2);
	}
}
