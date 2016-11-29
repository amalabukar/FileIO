package com.company;

import java.io.IOException;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Album album = new Album();

    public static void main(String[] args) throws IOException {
        System.out.println("Hello, let's talk about this album");

        try {
            album = Album.loadInfo();
            System.out.println("Save Loaded Information");
        } catch (Exception e) {
            System.out.println("Tell us more about the album");
        }
        if (album.getGenre() == null) {
            album.enterGenre();
        }
        if (album.getYear() == 0) {
            album.enterYear();
        }
        if (album.getTitle() == null) {
            album.enterTitle();

        }
        if (album.getAuthor() == null) {
            album.enterAuthor();
        }
        if (album.getSingles() == 0) {
            album.enterSingles();
        }
        {

        Album.saveInfo(album);
//            System.out.println("Saved Info")
            System.out.println("Genre:  " + album.genre);
            System.out.println("Year:  " + album.year);
            System.out.println("Title:  " + album.title);
            System.out.println("Author:  " + album.author);
            System.out.println("Singles:  " + album.singles);
            System.out.println("Do you want to make any changes? [y/n]");
            String answer = scanner.nextLine();

            if(answer.equalsIgnoreCase("y")) {
                System.out.println("choose one [genre/year/title/author/singles]");
                String change = scanner.nextLine();
                if (change.equalsIgnoreCase("genre")) {
                    System.out.println("Enter new genre");
                    album.enterGenre();
                }if (change.equalsIgnoreCase("year")) {
                    System.out.println("Enter new year");
                    album.enterYear();
                }if (change.equalsIgnoreCase("title")) {
                    System.out.println("Enter new title");
                    album.enterTitle();
                }if (change.equalsIgnoreCase("author")) {
                    System.out.println("Enter new author");
                    album.enterAuthor();

                }if (change.equalsIgnoreCase("singles")) {
                    System.out.println("Enter new singles");
                    album.enterSingles();
                }

                album.saveInfo(album);
            }
            album.enterGenre();
            album.enterYear();
            album.enterTitle();
            album.enterAuthor();
            album.enterSingles();






        }
    }}