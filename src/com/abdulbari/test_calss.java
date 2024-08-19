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

public class test_calss {

    public static void main(String[] args) {

        TV samsung = new TV();
        samsung.change_volume(10);
    }
}
