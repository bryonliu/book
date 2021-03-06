package com.turtledove.bookdrift.infrastruct.dao.test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.turtledove.bookdrift.common.AbstractClass.AbstractTestCase;
import com.turtledove.bookdrift.domain.entity.DomainObjectBuilder;
import com.turtledove.bookdrift.domain.entity.User;
import com.turtledove.bookdrift.infrastruct.dao.UserDao;

public class UserDaoTest extends AbstractTestCase<User>{

	private static final String INSERT_TEST_EMAIL = "insert@test.com";
	private static final String USER_EMAIL = "liubshwzc@gmail.com";
	@Autowired
	UserDao userDao;
	@Test
	public void test_get_user(){
		System.out.println(userDao.getUser(USER_EMAIL).getUserName());
		Assert.assertEquals(userDao.getUser(USER_EMAIL).getUserEmail(), USER_EMAIL);
	}
	
	@Test
	public void test_insert() {
		User user = create();
		userDao.insert(user);
	  Assert.assertEquals(userDao.getUser(INSERT_TEST_EMAIL).getUserEmail(), INSERT_TEST_EMAIL);
	}

	@Override
	protected User create() {
		return DomainObjectBuilder.newInstance().withField("userEmail", INSERT_TEST_EMAIL)
		.withField("userLevel", 10).withField("userName", "insert").withField("userPwd", "123456")
		.build(User.class);
	}
 
}
