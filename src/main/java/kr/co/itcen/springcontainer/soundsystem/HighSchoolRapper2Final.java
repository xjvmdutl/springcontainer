package kr.co.itcen.springcontainer.soundsystem;

import org.springframework.stereotype.Component;

@Component//명시적이므로 annotaion을 달아야한다.
public class HighSchoolRapper2Final implements CompactDisc {
	private String title = "붕붕";
	private String artist = "김하온";
	
	@Override
	public void play() {
		System.out.println("playing "+ title + " by " + artist);
	}

}
