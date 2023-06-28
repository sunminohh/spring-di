package com.sample5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KakaotalkMessageSender implements MessageSender {

	private static final Logger logger = LoggerFactory.getLogger(KakaotalkMessageSender.class);
	
	@Override
	public void send(String from, String to, String title, String content) {
		logger.debug("카톡 메세지 시작");
		logger.info("카톡 발송자: " +from);
		logger.info("카톡 수신자: " +to);
		logger.info("카톡 제목: " +title);
		logger.info("카톡 내용: " +content);
		
		logger.debug("카톡 메세지 종료");
	}
}
