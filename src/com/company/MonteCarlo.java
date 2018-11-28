package com.company;
import java.util.Random;

public class MonteCarlo {
    public double h;
    public double k;
    public double r;

    private Random rndm = new Random();

    public MonteCarlo(double h, double k, double r){
        this.h = h;
        this.k = k;
        this.r = r;

    }

   public double nextRainDrop_x(){
        return rndm.nextDouble() * h;
   }

   public double nextRainDrop_y(){
        return rndm.nextDouble() * k;
   }

   public boolean insideCircle(double x, double y ){
        if (Math.pow((x-h),2) + Math.pow((y-k),2) <= Math.pow(r,2)){
            return true;
       }
       else{
            return false;
       }
   }
}
