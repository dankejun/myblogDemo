package com.example.blog.entity;

public class DiaryImg {
    private Integer id;
    private String imgName;
    private Integer diaryId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public Integer getDiaryId() {
        return diaryId;
    }

    public void setDiaryId(Integer diaryId) {
        this.diaryId = diaryId;
    }

    @Override
    public String toString() {
        return "DiaryImg{" +
                "id=" + id +
                ", imgName='" + imgName + '\'' +
                ", diaryId=" + diaryId +
                '}';
    }
}
