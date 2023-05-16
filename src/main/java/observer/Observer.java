package observer;

public interface Observer {

    void update();

    void subscribe(Subject subject);
}
