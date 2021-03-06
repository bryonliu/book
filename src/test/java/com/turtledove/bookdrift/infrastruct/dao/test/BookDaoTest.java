package com.turtledove.bookdrift.infrastruct.dao.test;

import java.util.Date;

import junit.framework.Assert;
import junit.runner.Version;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.turtledove.bookdrift.common.AbstractClass.AbstractTestCase;
import com.turtledove.bookdrift.domain.entity.Book;
import com.turtledove.bookdrift.domain.entity.DomainObjectBuilder;
import com.turtledove.bookdrift.infrastruct.dao.BookDao;

public class BookDaoTest extends AbstractTestCase<Book> {

	private static final int VERSION = 2;
	private static final int PRICE = 39;
	private static final String BOOK_PRESS = "电子工业出版社";
	private static final String AUTHOR_NAME = "张俊林";
	private static final String BOOK_NAME = "这就是收索引起技术核心详解";
	@Autowired
	private BookDao bookDao;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_find_by_BookId(){
		
		Book book = bookDao.findById(1);
		Assert.assertEquals(book.getId(), new Integer(1));
	}
    @Test
    public void test_insert_book_and_update_bookId(){
    	Book book = create();
    	bookDao.insert(book);
    	Assert.assertEquals(book.getAuthorName(), bookDao.findById(book.getId()).getAuthorName());
    	Assert.assertTrue(true);
    }
    
	@Override
	protected Book create() {
		return DomainObjectBuilder.newInstance().withField("bookName", BOOK_NAME).
		withField("authorName", AUTHOR_NAME).withField("bookPress", BOOK_PRESS).withField("bookPrice", PRICE)
		.withField("bookVersion", VERSION).withField("publishDate", new Date()).build(Book.class);
	}
}
