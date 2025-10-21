package Cap_11;
import java.util.*;

class SongV4 implements Comparable<SongV4> {
    private String title;
    private String artist;
    private int bpm;

    public boolean equals(Object aSong) {
        if (!(aSong instanceof SongV4)) return false;
        SongV4 other = (SongV4) aSong;
        return title.equals(other.getTitle());
    }

    public int hashCode() { return title.hashCode(); }
    public int compareTo(SongV4 s) { return title.compareTo(s.getTitle()); }

    SongV4(String title, String artist, int bpm) {
        this.artist = artist;
        this.title = title;
        this.bpm = bpm;
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public int getBpm() { return bpm; }
    public String toString() { return title; }
}

public class Jukebox10 {
    public static void main(String[] args) {
        new Jukebox10().go();
    }

    public void go() {
        List<SongV4> songList = MockMoreSongs.getSongsV4();
        System.out.println(songList);

        // Ordenação por título com lambda
        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        // TreeSet (elimina duplicados com base em compareTo/equals/hashCode)
        Set<SongV4> songSet = new TreeSet<>(songList);
        System.out.println(songSet);
    }
}
