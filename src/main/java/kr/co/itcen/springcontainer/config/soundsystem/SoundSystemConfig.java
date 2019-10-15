package kr.co.itcen.springcontainer.config.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"kr.co.itcen.springcontainer.soundsystem"} )
public class SoundSystemConfig {
	//명시와 스캔닝이랑 같이 동작
	//@Bean
	//	CDPlayer Cdplay() {
	//		return new CDPlayer();
	//	}
}
