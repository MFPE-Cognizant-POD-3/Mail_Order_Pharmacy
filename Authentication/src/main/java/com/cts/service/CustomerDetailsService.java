package com.cts.service;
import java.util.ArrayList;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.UserDAO;


// Service class
@Service
public class CustomerDetailsService implements UserDetailsService {
	@Autowired
	private UserDAO userdao;

	/*
	 * @param String
	 * @return User 
	 * @throws UsernameNotFoundException
	 */
	@Override
	public UserDetails loadUserByUsername(String uid) {
		
		try
		{
			UserData custuser = userdao.findById(uid).orElse(null);
			if(custuser != null) {
				custuser.getUname();
			}
			return new User(custuser.getUserid(), custuser.getUpassword(), new ArrayList<>());
		}
		catch (Exception e) {
			throw new UsernameNotFoundException("UsernameNotFoundException");
		}
			
		
		
	}

}