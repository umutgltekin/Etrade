package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class GmailUserDao implements UserDao {
	public void add(User user) {
		System.out.println("kullanýcý gmail yoluyla kayýt oldu "+user.getName());
	}

}
