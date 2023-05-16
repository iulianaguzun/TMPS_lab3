package state;

public class EmailState implements AuthenticationState {

    public EmailState() {
        System.out.println("Processing email...");
    }

    @Override
    public void nextPage(AuthenticationPage page) {
        if (page.getEmail().length() > 10){
            System.out.println("Account was successfully created!");
        }else {
            System.out.println("Invalid email provided!");
        }
    }
}
