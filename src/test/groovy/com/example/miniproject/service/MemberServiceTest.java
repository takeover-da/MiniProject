package com.example.miniproject.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dto.MemberDTO;

@SpringBootTest
public class MemberServiceTest {

	@Autowired
	MemberService service;
	
	@Test
	public void 회원등록() {
		
		MemberDTO dto = MemberDTO.builder()
								 .id("u")
								 .password("u")
								 .name("또치")
								 .build();
		service.register(dto);
	}
	
}
