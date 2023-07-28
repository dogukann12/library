/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarywtable;

/**
 *
 * @author Doğukann
 */
public class Book {private int  bookNumber;

    public int getBookNumber(int b) {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }
    private String name;
    private int page;
    private String author;
    private String publisher;
    private String borrewer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage(int p) {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBorrewer() {
        return borrewer;
    }

    public void setBorrewer(String borrewer) {
        this.borrewer = borrewer;
        }
    
}
