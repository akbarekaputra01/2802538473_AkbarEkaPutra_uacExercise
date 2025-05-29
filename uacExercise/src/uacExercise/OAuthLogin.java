package uacExercise;

public class OAuthLogin implements ILogin{
	String token;

	public OAuthLogin(String token) {
		super();
		this.token = token;
	}

	@Override
	public int authenticate(Credential credential) {
		if(credential.key != this.token) return 0;
		return 1;
	}



}