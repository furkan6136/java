package eCommerceSystem.dataAccess.concretes;

import java.util.List;

import eCommerceSystem.dataAccess.abstracts.UserDao;
import eCommerceSystem.entities.concretes.User;

public class InFileUserDao implements UserDao {
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " : Veritabanı'na başarıyla eklendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " : Veritabanı'ndan başarıyla silindi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " : Veritabanı'nda başarıyla güncellendi.");		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
