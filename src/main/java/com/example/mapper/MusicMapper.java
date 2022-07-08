package com.example.mapper;
import java.util.List;

import org.mapstruct.Mapper;

import com.example.dto.MusicDto;
import com.example.entity.Songs;

@Mapper(componentModel = "spring")
public interface MusicMapper {
	
  List<MusicDto > getDto(List<Songs> songs);
}
