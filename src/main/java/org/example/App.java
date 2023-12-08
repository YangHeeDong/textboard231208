package org.example;

import org.example.WiseSaying.WiseSayingController;

import java.util.List;
import java.util.Scanner;

public class App {

    WiseSayingController wsc;

    App(){
        wsc = new WiseSayingController();
    }

    void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");

        while(true){
            System.out.print("명령 )");
            String command = sc.nextLine();
            String actionCode = null;
            Integer id = null ;

            try{
                String[] commandList = command.split("\\?");
                actionCode = commandList[0];
                if(actionCode.startsWith("삭제") || actionCode.startsWith("수정")){
                    id = Integer.parseInt(commandList[1].split("=")[1]);
                }
            }catch (Exception e){
                System.out.println("잘못된 명령어입니다.");
                continue;
            }


            switch (actionCode){
                case "등록" :
                    wsc.create();
                    break;
                case "종료" :
                    wsc.close();
                    return;
                case "목록" :
                    wsc.showList();
                    break;
                case "삭제" :
                    wsc.remove(id);
                    break;
                case "수정" :
                    wsc.update(id);
                    break;
            }

        }
    }

}
