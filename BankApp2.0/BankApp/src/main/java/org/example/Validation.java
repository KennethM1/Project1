package org.example;


import java.util.Scanner;

public class Validation{

    public static boolean randomNumberCheck(){
        int x=(int)(Math.random() * 900);
        int rand= (int)(Math.random() * 900);
        if ((rand<900)&(rand>=1)){
            return true;
        }else if(x==rand){
            return false;
        } else {
            return false;
        }
    }

}