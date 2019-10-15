package kr.co.itcen.springcontainer.soundsystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("high3")
public class HighSchoolRapper3Final implements CompactDisc {
	private String title = "지구멸망";
	private String artist = "양승호";
	@Override
	public void play() {
		System.out.println("playing "+ title + " by " + artist);
	}

}
