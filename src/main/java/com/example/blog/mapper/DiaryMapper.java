package com.example.blog.mapper;

import com.example.blog.entity.Diary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DiaryMapper {
    List<Diary> listAllDiary();

    Diary findDiaryById(Integer id);
}
