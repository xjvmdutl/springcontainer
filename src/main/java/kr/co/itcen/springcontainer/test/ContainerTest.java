package kr.co.itcen.springcontainer.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.itcen.springcontainer.user.User;

public class ContainerTest {

	public static void main(String[] args) {
//		testBeanFactory();
		//real
		testApplicationContext();
	}
	public static void testApplicationContext() {
		ApplicationContext appCtxt=new ClassPathXmlApplicationContext("config/user/applicationContext01.xml");
		
		//User user=appCtxt.getBean(User.class);//타입이 2개일 경우에는 오류가 난다.
		//같은 타입의 빈이 1개 이상 있는경우 type으로 가지고 오면 예외 발생 - > id를 주어서 가지고 와야 한다.
		//id로 가지고 오기
		User user1=(User)appCtxt.getBean("user1");//컨테이너가 타입을 모르기 떄문에 Object를 반환한다. 따라서 User로 캐스팅 해야한다.
		System.out.println(user1);
		//이름으로 가지고 오기
		User usr2 =  (User)appCtxt.getBean("usr2");
		System.out.println(usr2);
		//singleton 확인
		User user2 =  (User)appCtxt.getBean("user2");//기본 생성자로 빈을 만들기 떄문에 없으면 에러
		System.out.println(usr2 == user2);//한개는 이름, 하나는 아이디
		//User(Long,String)으로 생성된 빈 가져오기=>기본생성자가아닌 파라미터가 있는 생성자 호출
		
		User user3 =  (User)appCtxt.getBean("user3");
		System.out.println(user3);
		
		//User() 으로 생성되고 프로퍼티 세팅을 한 빈 가지고 오기, (setter)가 있어야 한다.
		User user4 =  (User)appCtxt.getBean("user4");
		System.out.println(user4);
		
		//DI 설정한 빈 가지고 오기
		User user5 =  (User)appCtxt.getBean("user5");
		System.out.println(user5);
		
		//DI 설정한 빈 가지고 오기2-> property를 user6에서만 사용할 friend를 호출
		User user6 =  (User)appCtxt.getBean("user6");
		System.out.println(user6);
		
		((ConfigurableApplicationContext)appCtxt).close();
	}
//	public static void testBeanFactory() { 
//		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("config/user/applicationContext01.xml"));
//		User user=bf.getBean(User.class);//에러가 난다.
//										//why? 빈 펙토리에서 User를 만들려고 하는데 실패를 했다.
//										//기본 생성자를 호출하지만 이게 없기 떄문에
//		System.out.println(user);
//		BeanFactory bf2 = new XmlBeanFactory(new ClassPathResource("config/user/applicationContext02.xml"));
//		user=bf2.getBean(User.class);//autoscanning을 통한 설정
//		System.out.println(user);
//		
//	}
}
