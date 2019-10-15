package kr.co.itcen.springcontainer.videosystem;

public class DVDPlayer {
	private DigitalVideoDisc dvd;
	public DVDPlayer() {
	}
	
	public DVDPlayer(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	public DigitalVideoDisc getDvd() {
		return dvd;
	}

	public void setDvd(DigitalVideoDisc digitalVideoDisc) {
		this.dvd = digitalVideoDisc;
	}
	public void play() {
		dvd.play();
	}
	
}
