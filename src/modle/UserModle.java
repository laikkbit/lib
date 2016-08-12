package modle;

public class UserModle {
	
private String username;
private String password;
private String sex;
private String phonenumber;
private String position;
private String email;

public UserModle(){}

public UserModle(String username,String password,String sex,String phonenumber,
		String position,String email){
	this.username=username;
	this.password=password;
	this.sex=sex;
	this.phonenumber=phonenumber;
	this.position=position;
	this.email=email;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPhonenumber() {
	return phonenumber;
}

public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}

public String getPosition() {
	return position;
}

public void setPosition(String position) {
	this.position = position;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getSex() {
	return sex;
}

public void setSex(String sex) {
	this.sex = sex;
}


}



