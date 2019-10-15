package kr.co.itcen.springcontainer.videosystem;

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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/videosystem/VidioSystemConfig.xml" })
public class VideoSystemXmlConfigTest {
	@Rule

	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Autowired
	Avengers dvd1;

	@Autowired
	@Qualifier("ironMan")
	DigitalVideoDisc dvd2;
	
	@Autowired
	@Qualifier("avengersInfinityWar")
	DigitalVideoDisc dvd3;
	
	@Autowired
	@Qualifier("avengersEndgame")
	DigitalVideoDisc dvd4;

	@Autowired
	@Qualifier("avengersAgeOfUltron")
	DigitalVideoDisc dvd5;
	
	@Autowired
	@Qualifier("captainAmerica")
	DigitalVideoDisc dvd6;
	
	@Autowired
	@Qualifier("avengersDirectorEdition")
	DigitalVideoDisc dvd7;
	
	@Autowired
	@Qualifier("avengersExpansionPack")
	DigitalVideoDisc dvd8;
	
	@Autowired
	@Qualifier("avengersExpansionPack2")
	DigitalVideoDisc dvd9;
	
	@Autowired
	@Qualifier("avengersTriplePack")
	DVDPack dvdPack;
	
	
	@Autowired
	@Qualifier("Player1")
	DVDPlayer player1;

	@Autowired
	@Qualifier("Player2")
	DVDPlayer player2;

	@Autowired
	@Qualifier("Player3")
	DVDPlayer player3;
	
	@Autowired
	@Qualifier("Player4")
	DVDPlayer player4;
	
	@Autowired
	@Qualifier("Player5")
	DVDPlayer player5;
	
	
	
	@Test
	public void testDVD1Null() {

		assertNotNull(dvd1);

	}

	@Test
	public void testDVD2Null() {

		assertNotNull(dvd2);

	}

	@Test
	public void testDVD3Null() {

		assertNotNull(dvd3);
		System.out.println(dvd3);
		assertEquals("BlankDisc [title=AvengersInfinityWar, studio=MARVEL, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}

	@Test
	public void testDVD4Null() {

		assertNotNull(dvd4);
		System.out.println(dvd4);
		assertEquals("BlankDisc [title=Avengers Endgame, studio=MARVEL, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	@Test
	public void testDVD5Null() {

		assertNotNull(dvd5);
		System.out.println(dvd5);
		assertEquals("BlankDisc [title=Avengers Age Of Ultron, studio=MARVEL, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	@Test
	public void testDVD6Null() {

		assertNotNull(dvd6);
		System.out.println(dvd6);
		assertEquals("BlankDisc [title=Captain America, studio=MARVEL, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVD7Null() {

		assertNotNull(dvd7);
		System.out.println(dvd7);
		assertEquals("BlankDisc [title=Avengers Director's Edition, studio=MARVEL, actors=[Robert Downey Jr., Scarlett Johansson, Chris Evans]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVD8Null() {

		assertNotNull(dvd8);
		System.out.println(dvd8);
		assertEquals("BlankDisc [title=Avengers Expansion Pack, studio=MARVEL, actors=[Robert Downey Jr., Scarlett Johansson, Chris Evans]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVD9Null() {

		assertNotNull(dvd9);
		System.out.println(dvd9);
		assertEquals("BlankDisc [title=Avengers Expansion Pack2, studio=MARVEL, actors=[Robert Downey Jr., Scarlett Johansson, Chris Evans]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	@Test
	public void testDVDPackNull() {

		assertNotNull(dvdPack);
		System.out.println(dvdPack);
	}
	@Test
	public void testPlayer1Null() {

		assertNotNull(player1);

	}
	@Test
	public void testPlay1() {
		player1.play();
		assertEquals("Playing Movie MARVEL's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}

	@Test
	public void testPlayer2Null() {

		assertNotNull(player2);

	}

	@Test
	public void testPlay2() {

		player2.play();

		assertEquals("Playing Movie MARVEL's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));

	}

	@Test
	public void testPlayer3Null() {

		assertNotNull(player3);

	}

	@Test
	public void testPlay3() {
		player3.play();
		assertEquals("Playing Movie MARVEL's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	@Test
	public void testPlayer4Null() {
		assertNotNull(player4);
	}
	@Test
	public void testPlay4() {

		player4.play();
		
		assertEquals("Playing Movie MARVEL's Avengers Director's Edition", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));

	}
	@Test
	public void testPlayer5Null() {
		assertNotNull(player5);
	}
	@Test
	public void testPlay5() {

		player5.play();
		
		assertEquals("Playing Movie MARVEL's Captain America", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));

	}
}
