package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.database.Room;
import com.example.demo.database.RoomRepository;
import com.example.demo.database.User;

@Service
public class RoomServiceImpl implements RoomService {

	 @Autowired
	 RoomRepository repository; 
	 
	 public List<Room> listAll() {
		    List<Room> rooms = new ArrayList<>();
		    repository.findAll().forEach(rooms::add);
		    return rooms;
		}
	 
	 public void add(Room room){
		 
		 repository.save(room);
	 }

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.delete(id);
		
	}

	@Override
	public void update(Room room) {
		
		repository.save(room);
		
	}

	@Override
	public Room getOne(Long id) {
		return repository.findOne(id);
	}
	 
	@Override
	public Room getByNumber(@RequestParam("number") String number) {
		return repository.findByNumber(number);
	}
	
	
	
	
	
}
