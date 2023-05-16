package iterator;

import java.util.List;

public class MusicPlayerIterator implements Iterator{

    private List<Song> songs;
    private int index;

    public MusicPlayerIterator(List<Song> songs) {
        this.songs = songs;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < songs.size();
    }

    @Override
    public Song next() {
        Song song = songs.get(index);
        index++;
        return song;
    }
}
