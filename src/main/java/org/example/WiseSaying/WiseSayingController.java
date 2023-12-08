package org.example.WiseSaying;

import org.example.Container;

import java.util.List;
import java.util.Scanner;

public class WiseSayingController {
   WiseSayingService wss;
    Scanner sc = Container.getScanner();

   public WiseSayingController(){
       wss = new WiseSayingService();
   }

    public void create(){

        System.out.print("명언 :");
        String content = sc.nextLine();
        System.out.print("작가 :");
        String author = sc.nextLine();

        System.out.println(wss.create(content, author) + "번 명언이 등록되었습니다.");
    }

    public void close() {
        System.out.println("앱을 종료합니다.");
    }

    public void remove(int id) {
        WiseSaying ws = wss.getById(id);
        if(ws == null){
            System.out.println(id+"번은 없는 명언입니다.");
            return;
        }

        System.out.println(wss.remove(ws)+"번 명언이 삭제 되었습니다.");
    }

    public void update(int id) {
        WiseSaying ws = wss.getById(id);
        if(ws == null){
            System.out.println(id+"번은 없는 명언입니다.");
            return;
        }
        System.out.println("명언(기존) : "+ws.getContent());
        System.out.print("명언 :");
        String content = sc.nextLine();
        System.out.println("작가(기존) :"+ws.getAuthor());
        System.out.print("작가 :");
        String author = sc.nextLine();

        System.out.println(wss.update(ws,content,author)+"번 명언을 수정하였습니다.");
    }

    public void showList() {
        List<WiseSaying> wiseSayingList = wss.getList();
        System.out.println("번호 / 작가 / 명언");
        for(WiseSaying ws : wiseSayingList){
            System.out.println(ws.getId()+" / "+ws.getAuthor()+" / "+ws.getContent());
        }
    }

}
