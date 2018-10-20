package com.smile.modeldemo.iterator;

/**
 * Created by lenovo on 2018/10/20    21:09
 */
public class StrongBookshelfIterator implements StrongIterator {

    private Bookshelf bookshelf;
    private int index;

    StrongBookshelfIterator(Bookshelf bookshelf) {
        this.bookshelf = bookshelf;
        index = bookshelf.getLength() - 1;
    }

    @Override
    public boolean hasPrevious() {
        return index >= 0;
    }

    @Override
    public Object previous() {
        return bookshelf.getBookAt(index--);
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
