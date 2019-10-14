package kr.co.itcen.springcontainer.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component//명시적으로 할것이 아니기 떄문에 annotation필요
public class CDPlayer {
	@Autowired//주입필요
	private CompactDisc cd;
	public void play() {
		cd.play();
	}
}
