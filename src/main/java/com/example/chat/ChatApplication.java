package com.example.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// db에 설정해주기
// db.runCommand( { convertToCapped: 'chat', size: 8192 } ) 
@SpringBootApplication
public class ChatApplication {


	public static void main(String[] args) {
		SpringApplication.run(ChatApplication.class, args);
	}

}
