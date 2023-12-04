package com.board;

import com.board.dto.CalendarDTO;
import com.board.dto.ChatDTO;
import com.board.dto.GroupDTO;
import com.board.dto.UserDTO;
import com.board.mappers.GroupMapper;
import com.board.service.CalendarService;
import com.board.service.ChatService;
import com.board.service.GroupService;
import com.board.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class SpringBootBoardProjectApplicationTests {
	@Autowired
	GroupService groupService;
	@Autowired
	GroupMapper groupMapper;

	@Autowired
	UserService userService;

	@Autowired
	ChatService chatService;

	@Autowired
	CalendarService calendarService;

	@Test
	void contextLoads() {
//		groupMapper.user_group_insert(new GroupDTO());
		GroupDTO groupDTO = new GroupDTO();
		groupDTO.setGroupName("testGroup");
		groupDTO.setGroupNo(12);
		UserDTO userDTO = new UserDTO();
		userDTO.setId("test123");
		userDTO.setIdNo(18);
//		userService.group_invite_user("test123",groupDTO);
//		groupDTO.setCreateIdNo(2);
//		groupService.group_create(groupDTO, userDTO);
//		userService.group_secession_user("test123",groupDTO);
//		groupService.group_delete();
//		ChatDTO chatDTO	= new ChatDTO();
//		chatDTO.setGroupNo(12);
//		chatDTO.setContent("이건 test");
//		chatService.insert_chat(chatDTO);
		CalendarDTO calendarDTO = new CalendarDTO();
		calendarDTO.setStart(LocalDateTime.now());
		calendarDTO.setEnd(LocalDateTime.now());
		calendarDTO.setTitle("test");
		calendarDTO.setIdNo(18);
		calendarDTO.setGroupNo(12);
		calendarDTO.setAllDay("true");
//		calendarService.save_group_data(calendarDTO);


	}

}
