package com.abdulbari;

// example of the constructor and the constructor overloading
class rectangle{
    private int length;
    private int breathe;

    public rectangle(){
        length=1;
        breathe=1;
    }
    public rectangle(int len, int bre){
        length=len;
        breathe=bre;
    }
    public rectangle(int side){
        length=breathe=side;
    }


    public void show(){
        System.out.format("The lenght is %d and the breadth is %d", length, breathe);
    }
}

class Product{
    private int itemNo, price, quantity;
    private String name;

    public Product(){
        itemNo=0;
        price=0;
        quantity=0;
        name="Test_Name";
    }
    public Product(int item , int pr, int quant){
        itemNo=item;
        price=pr;
        quantity=quant;
    }
    public Product(String name){

    }

    public int setItemno(int item ){ itemNo;}
    public int setPrice(int price ){ itemNo;}
    public int setQuantity(int quantity){ itemNo;}

    public int getItemno(){return itemNo;}
    public int getPrice(){return itemNo;}
    public int getQuantity(){return itemNo;}



}

class Customer{

}

public class data_hiding {

    public static void main(String[] args){
        rectangle re = new rectangle(2);
        re.show();
    }
}
