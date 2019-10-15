package config.videosystem;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import kr.co.itcen.springcontainer.videosystem.Avengers;
import kr.co.itcen.springcontainer.videosystem.BlankDisc;
import kr.co.itcen.springcontainer.videosystem.DVDPlayer;
import kr.co.itcen.springcontainer.videosystem.DigitalVideoDisc;

@Configuration
//@Import({DVDConfig.class, , , , , , , })
public class DVDConfig {
	@Bean
	public Avengers avengers() {
		return new Avengers();
	}
	@Bean("avengersInfinityWar")
	public BlankDisc blankDisc() {
		BlankDisc blankDisc = new BlankDisc();
		blankDisc.setTitle("Avengers Infinity War");
		blankDisc.setStudio("MARVEL");
		blankDisc.setActors(Arrays.asList("Robert Downey Jr.","Scarlett Johansson","Chris Evans"));
		return blankDisc;
	}
}
