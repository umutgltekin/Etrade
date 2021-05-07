package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class ConfirmationUserDao implements UserDao {
	public void add(User user) {
		System.out.println("doðrulama ile giriþ yapýldý "+user.getName());
	}

}
