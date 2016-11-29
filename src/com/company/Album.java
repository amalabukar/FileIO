package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import java.io.FileNotFoundException;
import java.io.File;

import jodd.json.JsonSerializer;
import jodd.json.JsonParser;

/**
 * Created by amalabukar on 11/23/16.
 */
public class Album {

    String genre;
    int year;
    String title;
    String author;
    int singles;


    public void enterGenre() {
        System.out.println("What is the genre?");
        genre = Main.scanner.nextLine();
        System.out.println("Awesome!");
    }

    public void enterYear() {
        System.out.println("What is the year?");
        year = Integer.parseInt (Main.scanner.nextLine());
        System.out.println("Thank you");
    }
    public void enterTitle() {
        System.out.println("What is the title?");
        genre = Main.scanner.nextLine();
        System.out.println("Awesome!");
    }
    public void enterAuthor() {
        System.out.println("Who is the author?");
        genre = Main.scanner.nextLine();
        System.out.println("Great");
    }

    public void enterSingles() {
        System.out.println("How many singles are on the album?");
        year = Integer.parseInt(Main.scanner.nextLine());
        System.out.println("Groovy!");
    }

    public static void saveInfo (Album album) throws IOException {
        JsonSerializer s = new JsonSerializer();
        String json = s.include("*").serialize(album);
        File f = new File("album.json");
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();
    }

    public static Album loadInfo() throws Exception {
        File f = new File ("album.json");
        Scanner s = new Scanner (f);
        s.useDelimiter("\\Z");
        String contents= s.next();

        JsonParser p = new JsonParser();
        return p.parse(contents, Album.class);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getSingles() {
        return singles;
    }

    public void setSingles(int singles) {
        this.singles = singles;
    }


}
