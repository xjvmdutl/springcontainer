package kr.co.itcen.springcontainer.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.itcen.springcontainer.config.soundsystem.SoundSystemConfig;
/*
 * Auto Configuration - java Config
 * Component Scanning(@Component,@Named,@Autowired,@Inject
 * 						@Service ->3가지는 스프링 MVC에 적용이 된다.
 * 						@Controller
 * 						@Repository)
 * 
 */
//본래에는 원래 Test부터 만들어 주어야 한다.
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SoundSystemConfig.class})
public class SoundSystemJavaConfigTest {
	@Autowired
	@Qualifier("high3")
	private CompactDisc cd;
	@Autowired
	private CDPlayer cdPlayer;
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	@Test
	public void testCDNull() {
		assertNotNull(cd);
	}
	@Test
	public void testCDPlayerNull() {
		assertNotNull(cdPlayer);
	}
	@Test
	public void testPlay() {
		cdPlayer.play();
		assertEquals("playing 지구멸망 by 양승호",systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));//콘솔에 출력된 내용이 이리로 나온다.
		//현재 개행이 있기 떄문에 개행을 제거 해야 한다.하나는 리눅스 하나는 윈도우
		
	}
}
