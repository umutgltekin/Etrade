package business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userdao;
	public UserManager(UserDao userdao) {
		super();
		this.userdao = userdao;
	}

	@Override
	public void add(User user, List<User> users) {
		String regex="^(.+)@(.+)$";
		boolean isEmail=Pattern.matches(regex, user.getEmail());
		if(user.getEmail()==null||user.getLastName()==null||user.getName()==null||user.getPassword()==null) {
			System.out.println("bu alanlarýn hepsini doldurmak zorundasýnýz");
			return;
		}
		else if(user.getPassword().length()<=5) {
			System.out.println("þifre 6 karakterden küçük olamaz");
			return;
	}
		else if(user.getName().length()<2 || user.getLastName().length()<2) {
			System.out.println("ad veya soyad 2 karakterden küçük olamaz");
			return;
	}	
		else if(!isEmail) {
			System.out.println("formata uygun olmayan mail formatý");
			return;
		}
	
		boolean istrue=true;
	
      	for(int i=0;i<users.size();i++) {
      		if(users.get(i).getEmail()==user.getEmail()) {
      			System.out.println("bu email adresi daha önce kullanýldý");
      			istrue=false;
      			break;
	}		
}		if(istrue) {
	users.add(user);
	this.userdao.add(user);
		System.out.println("üyelik eklendi "+user.getName());
		}
	    	
	
	

	}
	
	


}
