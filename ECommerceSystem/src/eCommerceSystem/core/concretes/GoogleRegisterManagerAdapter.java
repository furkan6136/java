package eCommerceSystem.core.concretes;

import eCommerceSystem.core.abstracts.RegisterService;
import eCommerceSystem.googleLogin.GoogleRegisterManager;

public class GoogleRegisterManagerAdapter implements RegisterService {

	@Override
	public void registerToSystem(String message) {
		GoogleRegisterManager googleRegisterManager=new GoogleRegisterManager();
		googleRegisterManager.login(message+"Google ile kayýt oldun");
		
	}

}
