package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Songs;
import com.example.repo.MusicRepo;

@Service
public class MusicServiceImpl implements MusicService{
 
	@Autowired
	MusicRepo musicRepo;
	
	@Override
	public List<Songs> getAllSongs() {
	
		return musicRepo.findAll();
	}

	@Override
	public Songs saveSong(Songs song) {
		Songs song1=new Songs();
		int i=5;
		return musicRepo.save(song);
		
		
	}

	@Override
	public void story1() {
		System.out.println("from story1 branch");
	}

}
