import java.util.*;
class Song{
    private String title;
    private String artist;
    Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
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
    public void addsong(Song s){
        if (count < songs.length){
            songs[count] = s;
            count++;
        }
    }
    public void shuffle(){
        Random rand = new Random();
        for (int i= count-1; i>0; i--){
            int j = rand.nextInt(i+1);
            Song temp = songs[i];
            songs[i] = songs[j];
            songs[j] = temp;
        }
    }
    public void display(){
        for (Song s : songs){
            if (s!=null){
                System.out.println(s.getTitle() + " - " + s.getArtist());
            }
        }
    }
}
public class Music{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        Playlist myPlaylist = new Playlist(5);
        myPlaylist.addsong(new Song("Believer", "Imagine Dragons"));
        myPlaylist.addsong(new Song("Shape of You", "Ed Sheeran"));
        System.out.println("Original:");
        myPlaylist.display();
        myPlaylist.shuffle();
        System.out.println("Shuffled:");
        myPlaylist.display();
    }
}