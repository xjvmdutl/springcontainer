package kr.co.itcen.springcontainer.soundsystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component//명시적으로 할것이 아니기 떄문에 annotation필요
public class CDPlayer {
	//와이어링1:(@Autowired) + 필드
	@Autowired//주입필요
	@Qualifier("high3")//이름을 달아주면 이름을 단 거로 주입받는다 주입가능
	private CompactDisc compactcd;
	//와이어링2:(@Autowired) + 생성자
	//@Autowired
	//와이어링2-1 : @Inject
	//->spring기반의 와이어링 어노테이션을 사용할수 없는경우 사용한다
	//@Autowired와는 별 차이는 없다. 자기가 선호하는 것을 일관성 있게 사용하면 된다.
	//@Inject//자바에서 정의한 DI주입, Autowire는 스프링에서의 제공
	//@Autowired
	public CDPlayer(CompactDisc compactcd) {
		this.compactcd=compactcd;
	}
	public CDPlayer() {
		System.out.println("CDPlayer() 기본 생성자 호출");
	}
	//와이어링3 : @Autowired + setter
	//@Autowired
	public void setCompactcd(CompactDisc compactcd) {
		this.compactcd= compactcd;
	}
	//와이어링4 : @Autowired + 일반 메소드(setter가 아니다)
	//@Autowired
	public void insertCompackDisc(CompactDisc compactcd) {
		this.compactcd= compactcd;
	}
		
	public void play() {
		compactcd.play();
	}
}
