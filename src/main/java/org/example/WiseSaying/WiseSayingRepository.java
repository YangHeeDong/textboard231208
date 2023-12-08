package org.example.WiseSaying;

import java.util.ArrayList;
import java.util.List;

public class WiseSayingRepository {

    List<WiseSaying> wiseSayingList = new ArrayList<>();
    int id = 0;
    public int create(String content, String author){
        id++;
        wiseSayingList.add(new WiseSaying(id, content, author));

        return id;
    }

    public List<WiseSaying> getList() {
        return wiseSayingList;
    }

    public int remove(WiseSaying ws) {
        wiseSayingList.remove(ws);
        return ws.getId();
    }

    public WiseSaying getById(int id){
        for(WiseSaying ws : wiseSayingList){
            if(ws.getId() == id){
                return ws;
            }
        }
        return null;
    }

    public int update(WiseSaying ws, String content, String author) {

        ws.setAuthor(author);
        ws.setContnet(content);

        return ws.getId();
    }
}
