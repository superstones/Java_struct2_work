package Action;

import Bean.Book;
import Services.BookService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/27.
 */
public class BookAction extends ActionSupport implements ModelDriven<Book> {


    private Book b = new Book();
    private BookService bService = new BookService();
    private List<Book> books=new ArrayList <Book>();

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public Book getModel() {
        return b;
    }
    //添加书籍
    public String addBook(){

    bService.addBook(b);
    return "addOK";
    }
    //查询书籍
    public String findAllBook(){

        //引入值栈的概念
        books=bService.findAllBook();
        return "findOK";

    }

}
