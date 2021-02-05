package com.example.blog.service.serviceimpl;

import com.example.blog.entity.Diary;
import com.example.blog.entity.DiaryCategory;
import com.example.blog.mapper.DiaryMapper;
import com.example.blog.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("diaryService")
public class DiaryServiceImpl implements DiaryService {

    @Autowired
    private DiaryMapper diaryMapper;

    @Override
    public List<Diary> listAllDiary() {
        return diaryMapper.listAllDiary();
    }

    @Override
    public Diary findDiaryById(Integer id) {
        return diaryMapper.findDiaryById(id);
    }

    @Override
    public List<DiaryCategory> showDiaryCategory() {
        return diaryMapper.showDiaryCategory();
    }
}
