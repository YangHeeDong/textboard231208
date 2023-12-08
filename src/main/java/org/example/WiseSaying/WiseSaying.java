package org.example.WiseSaying;

import java.util.ArrayList;

public class WiseSaying{
    private int id;
    private String content;
    private String author;

    public WiseSaying(int id, String content, String author){
        this.id = id;
        this.content = content;
        this.author = author;
    }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getContent(){
        return content;
    }
    public void setContnet(String content){
        this.content = content;
    }
}
