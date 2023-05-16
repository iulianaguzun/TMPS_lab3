package observer;

public class MainObs {

    public static void main(String[] args) {
        Subject instagramAccount = new InstagramAccount();
        Observer follower1 = new Follower("Follower1");
        Observer follower2 = new Follower("Follower2");
        Observer follower3 = new Follower("Follower3");

        instagramAccount.addObserver(follower1);
        instagramAccount.addObserver(follower2);
        instagramAccount.addObserver(follower3);

        follower1.subscribe(instagramAccount);
        follower2.subscribe(instagramAccount);
        follower3.subscribe(instagramAccount);

        instagramAccount.postVideo("New video1");
    }
}
