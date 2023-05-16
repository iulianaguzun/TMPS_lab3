package state;

public class UsernamePasswordState implements AuthenticationState{

    public UsernamePasswordState() {
        System.out.println("Processing username and password...");
    }

    @Override
    public void nextPage(AuthenticationPage page) {
        if (page.getUsername().length() > 5 && page.getPassword().length() > 6){
            System.out.println("Username and password accepted!");
            page.setState(new EmailState());
        }else {
            System.out.println("Invalid username or password!");
        }
    }
}
