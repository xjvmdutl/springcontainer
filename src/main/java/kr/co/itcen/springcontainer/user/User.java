package kr.co.itcen.springcontainer.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
	private Long no;
	private String name;
	//@Autowired //모든 객체에 자동으로 해준다, xml설정이 우선시 되고, 나머지는 설정 안된 애들은 <context:annotation-config />를 보고(안되면 명시적으로 xml로 설정한 객체만 본다) 값을 세팅!!!!
	private Friend friend;
	
	private List<String> friends;
	
	public User() {
		no = 1L;
		name = "준호";
	}
	public User(Long no, String name) {
		this.no=no;
		this.name=name;
	}
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Friend getFriend() {
		return friend;
	}
	public void setFriend(Friend friend) {
		this.friend = friend;
	}
	
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", friend=" + friend + ", friends=" + friends + "]";
	}
}
