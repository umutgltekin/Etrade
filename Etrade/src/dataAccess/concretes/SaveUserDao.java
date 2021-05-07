package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class SaveUserDao implements UserDao{
	public void add(User user) {
		System.out.println("kullanýcý sistemden kayýt oldu "+user.getEmail()+" adresine mail gönderildi");
	}

}
