package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int sqrCount = 0;
        int cirCount = 0;

        MonteCarlo mcObj = new MonteCarlo(5,3,2);

        for (int i = 0; i < 1000000; i++){
            if (mcObj.insideCircle(mcObj.nextRainDrop_x(), mcObj.nextRainDrop_y())){
                cirCount++;
            }else {
                sqrCount++;
            }
        }
        System.out.println(cirCount * (Math.pow(mcObj.h * 2, 2)) / (sqrCount * Math.pow(mcObj.r, 2)));
    }
}
