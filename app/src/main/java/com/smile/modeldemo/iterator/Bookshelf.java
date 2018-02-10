package com.smile.modeldemo.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/2/2    10:43
 */

public class Bookshelf implements Aggregate {

    private List<Book> books;

    public Bookshelf() {
        this.books = new ArrayList<>();
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

}
