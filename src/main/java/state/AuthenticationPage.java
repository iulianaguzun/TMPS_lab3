package state;

public class AuthenticationPage {
    private AuthenticationState state;
    private final String username;
    private final String password;
    private final String email;
    public AuthenticationPage(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.state = new UsernamePasswordState();
    }
    public void next(){
        state.nextPage(this);
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public void setState(AuthenticationState state) {
        this.state = state;
    }
}
