package uacExercise;

public class BasicLogin implements ILogin{
	String name;
	String pass;
 	
	public BasicLogin(String userName, String password) {
		name = userName;
		pass = password;
	}

	@Override
	public int authenticate(Credential credential) {
		if(credential.name != this.name) return 0;
		if(credential.key != this.pass) return 0;
		return 1;
	}
}