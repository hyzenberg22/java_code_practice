package com.abdulbari;

public class methode_overloading {
    static void calc_shapes(int len, int breath){
        System.out.println("The Area of the shape is :- "+ len*breath);
    }
    static void calc_shapes(int len, int breath, int height){
        System.out.println("The Area of the shape is :- "+ 0.5*(len+breath)*height);
    }
    static void calc_shapes(int redius){
        System.out.format("The Area of the shape is : %.2f" ,  Math.PI*Math.pow(redius, 2));
    }
    static  void var_args(int y, int...x){
        for(int i=0; i<x.length; i++){
            System.out.println(x[i]);
        }
    }



    public static void main(String[] args){
       var_args(10, 20, 30, 40 , 50);
    }
}

