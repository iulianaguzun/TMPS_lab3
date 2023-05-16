package iterator;

public interface PlayList {
    Iterator getIterator();

    void addSong(Song song);
}
