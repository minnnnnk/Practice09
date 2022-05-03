package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GoodsApp {

    public static void main(String[] args) {               
       Scanner sc = new Scanner(System.in);
       System.out.println("상품을 입력해주세요(종료 q)");
       List<Goods> gList = new ArrayList<Goods>();
       
       while (true) {
          String str = sc.nextLine();
          if(str.equals("q")) {
             break;
             
          } else {
             String[] Gds = str.split(",");
             gList.add(new Goods(Gds[0], Integer.parseInt(Gds[1]), Integer.parseInt(Gds[2])));
          }
          
       }
       int sum =0;
       System.out.println("[입력완료]");
       System.out.println("=========================");
       for(Goods g :gList) {
         g.showInfo();
         sum +=g.getCount();
         
      }
       System.out.println("모든 상품의 갯수는 "+sum+"개입니다.");
       
       sc.close();
    }

}