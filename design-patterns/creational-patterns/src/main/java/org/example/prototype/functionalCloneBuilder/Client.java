package org.example.prototype.functionalCloneBuilder;

import org.example.prototype.deepShallow.model.Address;
import org.example.prototype.deepShallow.model.User;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User("ToClone", 25, new Address("ABC Street", 1000));
		System.out.println(user);
	}
}