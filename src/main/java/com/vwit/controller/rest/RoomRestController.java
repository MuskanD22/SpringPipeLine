package com.vwit.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vwit.entity.Room;

@RestController
@RequestMapping("/api/")
public class RoomRestController {
	
	@GetMapping("room")
	public Room getRoom()
	{
		Room r = new Room();
		r.setRoomName("Meeting Room");
		return r;
	}
	@PostMapping("room")
	public Room createRoom() {
		Room r = new Room();
		r.setRoomName("Meeting Room");
		return r;
	}

}