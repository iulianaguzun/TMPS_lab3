package iterator;

public class Main {

    public static void main(String[] args) {
        PlayList playList = new MusicPlayer();
        playList.addSong(new Song("Blinding Lights", "The Weeknd", "Spotify"));
        playList.addSong(new Song("Die for you", "The Weeknd", "Apple Music"));
        playList.addSong(new Song("Save your tears", "The Weeknd", "YouTube"));

        Iterator playListIterator = playList.getIterator();
        while (playListIterator.hasNext()) {
            Song song = playListIterator.next();
            System.out.println("Now Playing: " + song);
        }
    }
}
