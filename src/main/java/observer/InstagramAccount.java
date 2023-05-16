package observer;

import java.util.ArrayList;
import java.util.List;

public class InstagramAccount implements Subject {

    private List<Observer> followers = new ArrayList<>();

    private List<String> posts = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        followers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        followers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer follower : followers) {
            follower.update();
        }
    }

    @Override
    public void postVideo(String videoName) {
        posts.add(videoName);
        System.out.println("A new video was posted");
        notifyAllObservers();
    }

    @Override
    public List<String> getPosts() {
        return this.posts;
    }
}
