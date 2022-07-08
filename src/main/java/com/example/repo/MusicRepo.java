package com.example.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Songs;
@Repository
public interface MusicRepo extends MongoRepository<Songs, String> {

}
