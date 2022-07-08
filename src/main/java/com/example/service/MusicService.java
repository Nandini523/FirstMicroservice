package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Songs;

@Service
public interface MusicService {

	List<Songs> getAllSongs();
	Songs saveSong(Songs song);
	void story1();

	
}
