import java.util.*;
class Song{
    private String title;
    private String artist;
    Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }
    String getTitle(){
        return title;
    }
    String getArtist(){
        return artist;
    }
}
class Playlist{
    private Song[] songs;
    private int count;
    Playlist(int size){
        this.songs = new Song[size];
        this.count = 0;
    }
    void addsong(Song s){
        
    }
}
public class Music{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
    }
}