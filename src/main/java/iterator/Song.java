package iterator;

public class Song {
    private String title;
    private String artist;
    private String source;

    public Song(String title, String artist, String source) {
        this.title = title;
        this.artist = artist;
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getSource() {
        return source;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
