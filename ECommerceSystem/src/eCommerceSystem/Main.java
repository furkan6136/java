package eCommerceSystem;

import eCommerceSystem.business.abstracts.UserService;
import eCommerceSystem.business.concretes.UserManager;
import eCommerceSystem.core.abstracts.RegisterService;
import eCommerceSystem.core.concretes.GoogleRegisterManagerAdapter;
import eCommerceSystem.dataAccess.abstracts.UserDao;
import eCommerceSystem.dataAccess.concretes.InFileUserDao;
import eCommerceSystem.entities.concretes.User;
import eCommerceSystem.googleLogin.GoogleRegisterManager;

public class Main {

	public static void main(String[] args) {
		UserService service=new UserManager(new InFileUserDao(), new GoogleRegisterManagerAdapter());

		User user1 = new User(1, "Furkan", "Sarmýsak", "furkansarmisak@gmail.com", "123456");
		User user2 = new User(2, "Asdf", "asdfg", "asdfgh", "65432");
		User user3 = new User(3,"A","ad","furkansarmisa@gmail.com","123456");
		User user4 = new User(3,"Furkan","Sarmýsak","furkansarmisakgmailcom","123456");
		service.register(user1);
		service.register(user2);
		service.register(user3);
		service.register(user4);
		service.logIn(user1.geteMail(),user1.getPassword());
		service.logIn(user2.geteMail(),user2.getPassword());

	}

}
