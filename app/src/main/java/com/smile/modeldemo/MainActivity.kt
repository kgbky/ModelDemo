package com.smile.modeldemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.smile.modeldemo.adapter.m1.PrintBanner
import com.smile.modeldemo.factory.IDCardFactory
import com.smile.modeldemo.iterator.Book
import com.smile.modeldemo.iterator.Bookshelf
import com.smile.modeldemo.singleton.Singleton
import com.smile.modeldemo.templateMethod.AbstractDisplay
import com.smile.modeldemo.templateMethod.CharDisplay
import com.smile.modeldemo.templateMethod.StringDisplay

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val imageLoader = ImageLoader.getInstance()
//        imageLoader.setImageCache(DoubleCache())
//        imageLoader.displayImage("http://pic4.nipic.com/20091217/3885730_124701000519_2.jpg", imageView)

        testIterator()
//        testStrongIterator()
//        testAdapter()
//        testAdapter2()
//        testSingleton()
//        testTemplate()
//        testFactory()

//        imageView.setOnClickListener { testIterator() }

        //dispatchPointerEvent  dispatchTouchEvent  onTouch() onTouchEvent() perfimClick()
    }

    private fun testIterator() {
        val bookShelf = Bookshelf()
        bookShelf.appendBook(Book("first book"))
        bookShelf.appendBook(Book("second book"))
        bookShelf.appendBook(Book("third book"))
        bookShelf.appendBook(Book("forth book"))
        val it = bookShelf.iterator()

        while (it.hasNext()) {
            val book: Book = it.next() as Book
            Log.d("book", book.name)
        }
    }

    private fun testStrongIterator() {
        val bookShelf = Bookshelf()
        bookShelf.appendBook(Book("first book"))
        bookShelf.appendBook(Book("second book"))
        bookShelf.appendBook(Book("third book"))
        bookShelf.appendBook(Book("forth book"))
        val it = bookShelf.strongIterator()
        while (it.hasPrevious()) {
            val book = it.previous() as Book
            Log.d("book", book.name)
        }
    }

    fun testAdapter() {
        val printBanner = PrintBanner("hello")
        printBanner.printWeak()
        printBanner.printStrong()
    }

    fun testAdapter2() {
        val print: com.smile.modeldemo.adapter.m2.PrintBanner =
                com.smile.modeldemo.adapter.m2.PrintBanner("world")
        print.printWeak()
        print.printStrong()
    }

    fun testSingleton(): Unit {
        Singleton.getInstance()
        Singleton.getInstance()
        Singleton.getInstance()
    }

    private fun testTemplate() {
        val d1: AbstractDisplay = CharDisplay('H')
        val d2: AbstractDisplay = StringDisplay("Hello world")
        val d3: AbstractDisplay = StringDisplay("你好 世界")
        d1.display()
        d2.display()
        d3.display()
    }

    private fun testFactory() {
        val idCardFactory = IDCardFactory()
        val id1 = idCardFactory.create("小明")
        val id2 = idCardFactory.create("小红")
        val id3 = idCardFactory.create("小刚")
        id1.use()
        id2.use()
        id3.use()

//        val tvFactory = TvFactory()
//        val tv1 = tvFactory.create("小明")
//        val tv2 = tvFactory.create("小红")
//        val tv3 = tvFactory.create("小刚")
//        tv1.use()
//        tv2.use()
//        tv3.use()
    }

    private fun testHandler(){
        Thread(Runnable {
          kotlin.run {
              Thread.sleep(1000);

          }
        }).start()
    }

}
