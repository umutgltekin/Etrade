import java.util.ArrayList;
import java.util.List;

import javax.crypto.AEADBadTagException;

import business.abstracts.UserService;
import business.abstracts.UserServiceIn;
import business.concretes.UserManager;
import business.concretes.UserManagerIn;
import dataAccess.concretes.GmailUserDao;
import dataAccess.concretes.SaveUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		List<User> users=new ArrayList<User>();
		User user=new User(1, "Umut","gültekin","1656565", "gltkn116@gmail.com");
		User ali= new User(2, "ali","veli", "123654","gltkn116gmail.com");
		UserService usermanger=new UserManager(new GmailUserDao());
		usermanger.add(user, users);
		usermanger.add(ali, users);
		
		UserServiceIn usermanagerin=new UserManagerIn();
		
		usermanagerin.signIn(ali);
		
		
		
		

	}

}
