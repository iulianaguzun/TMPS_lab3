package iterator;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer implements PlayList {

    private List<Song> songs;

    public MusicPlayer() {
        this.songs = new ArrayList<>();
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    @Override
    public void addSong(Song song) {
        songs.add(song);
    }


    @Override
    public Iterator getIterator() {
        return new MusicPlayerIterator(songs);
    }
}
