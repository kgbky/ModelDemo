package com.smile.modeldemo.iterator;

/**
 * Created by Administrator on 2018/2/2    10:43
 */

public class Bookshelf implements Aggregate {

    private Book[] books;
    private int index;

    public Bookshelf() {
        this.books = new Book[4];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        books[index++] = book;
    }

    public int getLength() {
        return books.length;
    }

    @Override
    public Iterator iterator() {
        return new BookshelfIterator(this);
    }

    public StrongIterator strongIterator() {
        return new StrongBookshelfIterator(this);
    }

}
