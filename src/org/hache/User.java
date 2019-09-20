package org.hache;

public class User {
	
	public String userName;
	public String age;
	public String foot;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

	@Override
	public String toString() {
		return "User [userName=" + userName + ", age=" + age + "]";
	}
	
	

}
