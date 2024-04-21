package com.demoWebShop.data;


import com.demoWebShop.models.User;

import java.util.Random;

public class UserData {
public static final String FIRSTNAME = "Viktor";
public static final String SURNAME = "Shmidt";
public static final String EMAIL = "shmidt@gmail.com";
public static final String PASSWORD = "$64$Shmidt!!";
public static final String CONFIRMPASSWORD = "$64$Shmidt!!";
public static final String CREATE_EMAIL = createEmail();

public static String createEmail() {
	Random random = new Random ();
	int i = random.nextInt(1000)+1000;
	return "olesia" + i + "@yahoo.com";
}

}
