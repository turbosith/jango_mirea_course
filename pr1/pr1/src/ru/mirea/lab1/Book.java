package ru.mirea.lab1;


public class Book {
    private String name;
    private String author;
    private String category;
    private int number_of_pages;
    public Book(String n, String a){
        name = n;
        author= a;
        category="Default";
        number_of_pages=0;
    }
    public Book( String cat, int n){
        category=cat;
        number_of_pages=n;
        name = "Default";
        author=  "Default";
    }
    public Book(){
        name =  "Default";
        author=  "Default";
        name =  "Default";
        author=  "Default";
    }
    public void setNumberOfPages(int n) {
        this.number_of_pages = n;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String a) {
        this.author = a;
    }
    public String getName(String name){
        return name;
    }
    public int getNumberOfPages() {
        return number_of_pages;
    }
    public String toString(){
        return this.name+", author "+this.author+", number of pages "+this.number_of_pages+", category "+this.category;
    }
    public void HowMuchIsRead(){
        System.out.println(" You will read "+name+" "+number_of_pages*2.5+" minutes");
    }

}