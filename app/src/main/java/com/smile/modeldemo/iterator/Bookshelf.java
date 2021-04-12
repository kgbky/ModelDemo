package com.smile.modeldemo.iterator;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/2/2    10:43
 * <p>
 * 书架，实现了Aggregate接口，表示可迭代
 */

public class Bookshelf implements Aggregate {

    private ArrayList<Book> books;

    public Bookshelf() {
        this.books = new ArrayList<>(1);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookshelfIterator(this);
    }

    public StrongIterator strongIterator() {
        return new StrongBookshelfIterator(this);
    }

}
