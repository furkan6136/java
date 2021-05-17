package eCommerceSystem.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceSystem.business.abstracts.UserService;
import eCommerceSystem.core.abstracts.RegisterService;
import eCommerceSystem.dataAccess.abstracts.UserDao;
import eCommerceSystem.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private RegisterService registerService;

	public UserManager(UserDao userDao, RegisterService registerService) {
		super();
		this.userDao = userDao;
		this.registerService = registerService;
	}

	private List<String> eMailList = new ArrayList<String>();
	private List<String> passwordList = new ArrayList<String>();

	public static boolean isEmailValid(String email) {
		String regex = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
		final Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public static boolean isEmailValidOnClick(String eMail) {

		return true;
	}

	@Override
	public void register(User user) {
		if (user.getPassword().length() < 6) {
			System.out.println("Þifre geçerli deðil. En az 6 karakter olmalý.");
			return;
		}
		if (eMailList.contains(user.geteMail())) {
			System.out.println("Girilen mail adresi sistemde zaten kayýtlý.Lütfen yeni bir email adresi giriniz.");
		}
		if (isEmailValid(user.geteMail()) != true) {
			System.out.println("Gecersiz mail adresi girdiniz.Lütfen yeniden deneyiniz..");
			return;
		}

		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Ad ve soyad haneleri en az 2 karakterden oluþmalýdýr");
			return;
		} else {
			System.out.println("Ilgili" + " " + user.geteMail() + " mail adresinize dogrulama maili gönderilmistir.");
		}

		if (isEmailValidOnClick(user.geteMail()) != true) {
			System.out.println("Lütfen mail adresinizi doðrulayin");
		} else {
			System.out.println("Sisteme basariyla kayit oldunuz.");
			eMailList.add(user.geteMail());
			passwordList.add(user.getPassword());
		}

	}

	@Override
	public void logIn(String eMail, String password) {
		if(eMailList.contains(eMail) && passwordList.contains(password)) {
			System.out.println("Basariyla giris yapildi.");
			return;
		}
		else {
			System.out.println("Email veya sifreniz yanlis lütfen tekrar deneyiniz");
		}
	}

}
