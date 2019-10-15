package kr.co.itcen.springcontainer.videosystem;

import java.util.List;

public class DVDPack {
	private String title;
	private String studio;
	private List<DigitalVideoDisc> dvds;
	
	public DVDPack(String title,String studio, List<DigitalVideoDisc> dvds) {
		this.title=title;
		this.studio=studio;
		this.dvds=dvds;
	}

	@Override
	public String toString() {
		return "DVDPack [title=" + title + ", studio=" + studio + ", dvds=" + dvds + "]";
	}
}
