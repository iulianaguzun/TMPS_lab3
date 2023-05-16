package state;

public class MainSt {

    public static void main(String[] args) {
        AuthenticationPage authenticationPage = new AuthenticationPage("username", "password", "email@gmail.com");
        authenticationPage.next();
        authenticationPage.next();
    }
}
