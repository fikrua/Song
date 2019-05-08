package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Song> songs = new ArrayList<>();
        for (int i = 0; i< 10;i++){
            System.out.print("enter artist : ");
            String artist = scanner.nextLine();
            System.out.print("enter title : ");
            String title = scanner.nextLine();
            Song s = new Song();
            s.setArtist(artist);
            s.setTitle(title);
            songs.add(s);
        }

        //print all the songs in the array list
        for(Song s: songs){
            System.out.println(s.display());
        }

        //look for blue and print if found
        String titleToFind = "Purple Rain";
        for (Song song: songs){
            if (song.getTitle().equals(titleToFind)){
                System.out.printf("I found %s \r\n",song.display());
            }
        }
    }
}