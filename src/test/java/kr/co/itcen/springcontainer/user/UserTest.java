package kr.co.itcen.springcontainer.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.user.UserConfig01;
@RunWith(SpringJUnit4ClassRunner.class)//스프링에서 제공하는 Test어노테이션,테스트는 쓰레드로 각각의 메소드마다 실행시켜주기 떄문에 순서대로 나오는것이 아니다
@ContextConfiguration(classes = {UserConfig01.class})
public class UserTest {
	@Autowired
	private User user;//같은 컨테이너환경에 있기떄문에 주입을 받을수 있다.
	
	@Autowired
	private Friend friend;//같은 컨테이너환경에 있기떄문에 주입을 받을수 있다.
	
//	@Test//JUNIT만 가지고 JVM만 가지고 Test한 환경
//	public void testMethod() {
//		int x=8;
//		//assert(dao.getUser(10).getNo == 10L);//같아야지 Test가 성공(true)
//		assert(x-2==6);
//	}
	@Test
	public void testUserNull() {
		assertNotNull(user);
		//assert(user != null)와 같은 뜻
	}
	@Test
	public void testFriendNull() {
		assertNotNull(friend);
		//assert(user != null)와 같은 뜻
	}
	@Test
	public void testFriendDooly() {
		assertEquals(friend.getName(),"둘리");
		//assertNotEquals도 있다.
	}
}
