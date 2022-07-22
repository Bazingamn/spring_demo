package org.example.testJDBC.entity;

public class Book {

    private Integer book_id;
    private String bookname;
    private String status;

    public Book() {
    }

    public Book(Integer book_id, String bookname, String status) {
        this.book_id = book_id;
        this.bookname = bookname;
        this.status = status;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", bookname='" + bookname + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
