package kr.co.itcen.springcontainer.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/soundsystem/SoundSystemConfig.xml"})
public class SoundSystemXmlConfigTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	@Autowired
	private CompactDisc cd;//실제로는 주입받을 필요가 없다 ->왜냐하면 이미 cdPlay에 주입되어 있기 때문
	@Autowired
	private CDPlayer cdPlayer;
	
	@Test
	public void testCDNull() {
		assertNotNull(cd);
	}
	@Test
	public void testCDPlayer() {
		assertNotNull(cdPlayer);
	}
	//@Ignore이렇게 할시 테스트를 안함
	@Test
	public void testPlay() {
		cdPlayer.play();
		assertEquals("playing 붕붕 by 김하온",systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));//콘솔에 출력된 내용이 이리로 나온다.
		//현재 개행이 있기 떄문에 개행을 제거 해야 한다.하나는 리눅스 하나는 윈도우
		
	}
}
