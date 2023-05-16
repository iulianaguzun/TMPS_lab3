package observer;

import java.util.ArrayList;
import java.util.List;

public class Follower implements Observer{

    private Subject subject;

    private List<String> posts = new ArrayList<>();

    private final String name;

    public Follower(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        posts = List.copyOf(subject.getPosts());
        System.out.println("User: " + name + " is up to date...");
    }

    @Override
    public void subscribe(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public List<String> getPosts() {
        return posts;
    }

    public String getName() {
        return name;
    }
}
