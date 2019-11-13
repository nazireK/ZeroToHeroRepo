package SongProject;

import ArrayListPractice.Car;

import java.util.ArrayList;

public class Playlist {

    public static void main(String[] args) {

        Song song1 = new Song("My heart will go on", "James Cameron", "Celine Dion", 3.22);
        Song song2 = new Song("Circle", "Johnny", "Post Malone", 3.09);
        Song song3 = new Song("The Heart breaker", "Cameron Dias", "Mariah Carey", 3.35);
        Song song4 = new Song("Apeshit", "Michael Kors", "Beyonce", 4.02);
        Song song5 = new Song("Mirrors", "Jack Milligan", "Justin Timberlake", 3.10);
        Song song6 = new Song("Butterflies", "Billy Milligan", "Mariah Carey", 3.55);
        Song song7 = new Song("Genny in the bottle", "James Chmura", "Kristina Aguilera", 2.52);
        Song song8 = new Song("Beautiful people", "Ed Sheeran", "Ed Sheeran", 3.33);
        Song song9 = new Song("Baby", "James Biber", "Justin Biber", 3.29);
        Song song10 = new Song("You got it bad", "James Bill", "Usher", 3.49);

        ArrayList<Song> playlist = new ArrayList();
        playlist.add(song1);
        playlist.add(song2);
        playlist.add(song3);
        playlist.add(song4);
        playlist.add(song5);
        playlist.add(song6);
        playlist.add(song7);
        playlist.add(song8);
        playlist.add(song9);
        playlist.add(song10);

    }

}
