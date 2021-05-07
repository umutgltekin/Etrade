package business.concretes;

import business.abstracts.UserServiceIn;
import entities.concretes.User;

public class UserManagerIn implements UserServiceIn{
	@Override
	public void signIn(User user) {	
		if(user.getEmail()==user.getEmail()&& user.getPassword()==user.getPassword()) {
			System.out.println("sisteme giriþ yapýldý hoþ geldiniz");
			return;
			
		}
		System.out.println("hatalý þifre veya kullanýcý adý");
	
	}
	
	

}
