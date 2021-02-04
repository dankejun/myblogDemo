package com.example.blog.service;

import com.example.blog.entity.Diary;
import java.util.List;

public interface DiaryService {
    List<Diary> listAllDiary();

    Diary findDiaryById(Integer id);

}
