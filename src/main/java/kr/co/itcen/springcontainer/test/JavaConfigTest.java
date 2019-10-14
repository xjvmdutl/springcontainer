package kr.co.itcen.springcontainer.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.user.UserConfig01;
import kr.co.itcen.springcontainer.user.User;

public class JavaConfigTest {

	public static void main(String[] args) {
		testUser01();
		testUser02();
	}
	//1. Explicit Java Config(명시적인 JAVConfig 설정)[java config class]
	//Java Config Class를 명시한다. 
	public static void testUser01() {
		ApplicationContext appCntx = new AnnotationConfigApplicationContext(UserConfig01.class);//이러한 설정은 자바로 설정하기 떄문에 잘못 입력시 바로 에러가 뜬다
		User user = appCntx.getBean(User.class);
		System.out.println(user);
		((ConfigurableApplicationContext)appCntx).close();
	
	}
	//2.자동으로 Java Config Class를 Scan한다.(auto-scan)
	public static void testUser02() {
		ApplicationContext appCntx = new AnnotationConfigApplicationContext("config.user");//패키지를 적어준다->package파일 밑을 스캔닝한다.
		//base Package를 지정한다.
		User user = appCntx.getBean(User.class);
		System.out.println(user);
		((ConfigurableApplicationContext)appCntx).close();
	
	}
}