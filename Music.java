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
        else{
            System.out.println("Playlist is full!");
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
        System.out.print("Enter the number of songs you want to add: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        Playlist myPlaylist = new Playlist(n);
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for song " + (i + 1) + ":");
            System.out.print("Enter title: ");
            String title = sc.nextLine();
            System.out.print("Enter artist: ");
            String artist = sc.nextLine();
            myPlaylist.addsong(new Song(title, artist));
        }
        System.out.println("\nOriginal Playlist:");
        myPlaylist.display();
        myPlaylist.shuffle();
        System.out.println("\nShuffled Playlist:");
        myPlaylist.display();
    }
}