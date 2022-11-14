package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.MusicDto;
import com.example.entity.Songs;
import com.example.mapper.MusicMapper;
import com.example.service.MusicService;

@RestController
@RequestMapping("/music")
public class MusicController {


	//first commit
	//second commit
	//third commit
	@Autowired
	MusicService musicService;
	@Autowired
	MusicMapper musicMapper;
	
	@GetMapping

	List<Songs> getAllSongs()
	{
		return musicService.getAllSongs();
	}
	
	@GetMapping("/dto")
	List<MusicDto>  getDto(String id)
	{
		List<Songs> music=musicService.getAllSongs();
		return  musicMapper.getDto(music);
	}
	
	@PostMapping
	Songs saveSong(@RequestBody Songs song)
	{
		return musicService.saveSong(song);
	}
	
	
}
