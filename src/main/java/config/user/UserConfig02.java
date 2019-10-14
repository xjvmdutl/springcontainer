package config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.itcen.springcontainer.user.User;
@Configuration//설정파일임을 어노테이션으로 적어주면 Auto-scan으로 스캔하면서 읽어들인다.
//없을 경우 빈이 없다고 나온다.->null이 나오지 않음,exception이 발생한다.
public class UserConfig02 {
	@Bean//이것은 빈설정임을 알려주는 어노테이션//이 어노테이션을 인식을 하는 컨테이너를 만들어야 한다.
	public User user() {
		
		return new User();
	}
}
