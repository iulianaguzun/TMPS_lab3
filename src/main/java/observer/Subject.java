package observer;

import java.util.List;

public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyAllObservers();

    void postVideo(String videoName);

    List<String> getPosts();
}
