package Services;
import Bean.Book;
import Dao.BookDao;

import java.util.List;

/**
 * Created by Administrator on 2017/9/27.
 */
public class BookService {
    private BookDao bDao=new BookDao();
    public void addBook(Book b){
        bDao.addBook(b);
    }
    public List<Book> findAllBook(){

        return bDao.findAllBook();

    }
}

