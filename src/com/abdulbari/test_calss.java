package com.abdulbari;

class TV{
    private int channel=1 ;
    private int volume=5;

    public void change_chanel(int inp_channel){
        channel=inp_channel;
        System.out.println("Your channel is now set to:- " +channel);
    }
    public void change_volume(int inp_vol){
        volume=volume+inp_vol;
        System.out.println("Your volume is now set to:- " +volume);
    }
}
class rectriangle {
    public int length;
    public int breadth;

    public void area (){
        System.out.println("The area is :- "+ length*breadth);
    }

    public void peremeater(){
        System.out.println("The peremeater is:- " + 2*(length+breadth));
    }
    public boolean is_squre(){
        if(length==breadth) return true;
        return false;
    }
}
class cylinder{
    public int radius;
    public int height;

    public void liodarea(){
        
    }


}


public class test_calss {

    public static void main(String[] args) {

        TV samsung = new TV();
        rectriangle rc = new rectriangle();


        rc.length = 10;
        rc.breadth=10;
        rc.area();
        System.out.println(rc.is_squre());
    }
}
