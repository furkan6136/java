package eCommerceSystem.business.abstracts;

import eCommerceSystem.entities.concretes.User;

public interface UserService {
	void register(User user);
	void logIn(String eMail, String password);
}
