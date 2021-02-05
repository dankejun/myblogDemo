package com.example.blog.mapper;

import com.example.blog.entity.Diary;
import com.example.blog.entity.DiaryCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DiaryMapper {
    List<Diary> listAllDiary();

    Diary findDiaryById(Integer id);

    List<DiaryCategory> showDiaryCategory();
}
