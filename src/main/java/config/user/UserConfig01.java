package config.user;

import org.springframework.context.annotation.Bean;

import kr.co.itcen.springcontainer.user.Friend;
import kr.co.itcen.springcontainer.user.User;

public class UserConfig01 {
	@Bean//이것은 빈설정임을 알려주는 어노테이션//이 어노테이션을 인식을 하는 컨테이너를 만들어야 한다.
	public User user() {
		
		return new User(3L,"태영");
	}
	@Bean 
	public Friend friend() {
		return new Friend("둘리");
	}
}
