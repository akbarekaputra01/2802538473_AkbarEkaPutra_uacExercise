package uacExercise;

public class OAuthLogin implements ILogin {
    private String token;

    public OAuthLogin(String token) {
        this.token = token;
    }

    @Override
//	asumsikan password = token
//	asumsikan OAuthLogin tidak peduli username selama token benar
    public boolean authenticate(String username, String password) {
        return this.token.equals(password);
    }
}
