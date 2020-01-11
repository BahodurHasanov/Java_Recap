package day1.If;

import javax.swing.*;

public class Task1 {

    public static void main(String[] args) {


        int great = 101
                ;


        if (great >= 90 && great <= 100) {
            System.out.println("A");
        } else if(great<90&&great>=80){
            System.out.println("B");
        }else if(great<80&&great>=70){
            System.out.println("C");
        }else if (great<70&&great>=60){
            System.out.println("D");
        }else{
            System.out.println("fail");
        }






        // tesk 2


        int time=12;
        if(time>=0&&time<12){
            System.out.println("Good Morning");
        }else if(time>12&&time<=15){
            System.out.println("Good Afternoon");
        }else if (time>15&&time<=24){
            System.out.println("Good Night");
        }else {
            System.out.println("sleep");
        }



    }

}
