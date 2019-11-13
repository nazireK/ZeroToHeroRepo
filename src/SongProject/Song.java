package SongProject;

import ArrayListPractice.Car;

import java.util.ArrayList;

public class Song {
    // Create one Song class having Title,
    // Duration(as a minute) and Singer and Writer name for songs. Create three argument constructor
    // to initialize the instance variables of the Song class. Create getters and setters for
    // intance variables of the Song class. Using Song class create 10 instance(object) of the song class.
    String title;
    String writer;
    String singer;
    double duration;


    public Song() {
    }

    public Song(String singer) {
        this.singer = singer;
    }

    public Song(String title, String writer, String singer, double duration) {
        this(singer);
        this.title = title;
        this.writer = writer;
        this.duration = duration;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }




}











