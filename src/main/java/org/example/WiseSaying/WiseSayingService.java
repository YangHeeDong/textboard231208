package org.example.WiseSaying;

import org.example.WiseSaying.WiseSaying;

import java.util.ArrayList;
import java.util.List;

public class WiseSayingService {
    WiseSayingRepository wsr;

    public WiseSayingService(){
        wsr = new WiseSayingRepository();
    }
    public int create(String content, String author){
        return wsr.create(content, author);
    }

    public List<WiseSaying> getList() {
        return wsr.getList();
    }

    public int remove(WiseSaying ws) {
        return wsr.remove(ws);
    }

    public WiseSaying getById(int id){
        return wsr.getById(id);
    }

    public int update(WiseSaying ws, String content, String author) {
        return wsr.update(ws,content,author);
    }
}
