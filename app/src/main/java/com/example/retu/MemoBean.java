package com.example.retu;

public class MemoBean {
    private String title;
    private String content;
    private String time;

    public MemoBean(String title, String content,String time){
        this.title=title;
        this.content=content;
        this.time=time;
    }
    public String getTitle(){
        return title;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content=content;
    }

    public String getTime(){
        return time;
    }
    public void  setTitle(String title){
        this.title = title;
    }
    public void setTime(String time){
        this.time=time;
    }

}
