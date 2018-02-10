package com.smile.modeldemo.iterator;

/**
 * Created by Administrator on 2018/2/2    14:02
 */

public class BookshelfIterator implements Iterator {

    private Bookshelf bookshelf;
    private int index;

    public BookshelfIterator(Bookshelf bookshelf) {
        this.bookshelf = bookshelf;
    }

    @Override
    public boolean hasNext() {
        return index < bookshelf.getLength();
    }

    @Override
    public Object next() {
        return bookshelf.getBookAt(index++);
    }

}
