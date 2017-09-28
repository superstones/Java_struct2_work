package Dao;

import Bean.Book;
import DB.BookDB;

import java.util.List;

/**
 * Created by Administrator on 2017/9/27.
 */
public class BookDao {
    public void addBook(Book b){
        BookDB.books.add(b);

    }
    public List<Book> findAllBook(){

        return BookDB.books;


    }
}

