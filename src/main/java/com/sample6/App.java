package com.sample6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sample6-ctx.xml");
		
		VideoService videoService = context.getBean(VideoService.class);
		videoService.download("소풍.mp4"); 
		
	}
}
