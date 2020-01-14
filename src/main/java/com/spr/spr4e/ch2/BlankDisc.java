package com.spr.spr4e.ch2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

//    public BlankDisc(String title, String artist) {
////    public BlankDisc(String title, String artist) {
////            @Value("${disc.title}") String title,
////            @Value("${disc.artist}") String artist) {
////    public BlankDisc(
////            @Value("#{systemProperties['disc.title']}") String title,
////            @Value("#{systemProperties['disc.artist']}") String artist) {
//        this.title = title;
//        this.artist = artist;
//    }


//    public BlankDisc(String title, String artist, List<String> tracks) {
//        this.title = title;
//        this.artist = artist;
//        this.tracks = tracks;
//    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }

    @Override
    public void playTrack(int trackNumber) {
        System.out.println("playing");
    }
}
