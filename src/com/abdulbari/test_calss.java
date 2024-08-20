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
class  student{
    public int m1=0, m2=0, m3=0;
    public int roll;
    public String name;
    public String course;


    public void total(){
        System.out.println("Total is :- "+ (m1+m2+m3));
    }
    public void average(){
        System.out.println("Average  is :- "+ (m1+m2+m3)/3);
    }
    public void grade(){
        int avg =  (m1+m2+m3)/3;
        if(avg>= 70) System.out.println("You got A");
        else if(avg>=60 && avg <=69) System.out.println("You got B");
        else if(avg>=50 && avg <=59) System.out.println("You got C");
        else if(avg>=40 && avg <=49) System.out.println("You got D");
        else System.out.println("Fail");
    }


}





public class test_calss {

    public static void main(String[] args) {

        student modi = new student();
        modi.roll = 201;
        modi.name = "Amit Modi";
        modi.course = "IT";

        modi.m1=70;
        modi.m2=70;
        modi.m3=70;

        modi.average();
        modi.grade();
        modi.total();





    }
}
