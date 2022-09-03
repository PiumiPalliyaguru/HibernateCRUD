package com.oneSoftBytes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Song {

    //songId, SongName, singer
    @Id
    @Column(name = "songId")
    private int id;

    @Column(name = "SongName")
    private String songName;

    @Column(name = "singer")
    private String artist;

    public Song() {
    }

    public Song(int id, String songName, String artist) {
        this.id = id;
        this.songName = songName;
        this.artist = artist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", songName='" + songName + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}