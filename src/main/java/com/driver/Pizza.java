package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean flag;

    private Boolean flag1;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        price = isVeg ? 300 : 400;
        flag=false;
        flag1=false;
    }

    public int getPrice() {

        return this.price;
    }
    public void addExtraCheese(){
        // your code goes here
        if (!flag) {
            price += 80;
            flag = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!flag1) {
            if (isVeg) {
                price += 70;
            } else {
                price += 120;
            }
            flag1 = true;
        }
    }


    public void addTakeaway(){
        // your code goes here
        price+=20;
    }

    public String getBill(){
        // your code goes here
        if (flag) {
            bill = "Extra Cheese Added: 80\n";
        }
        if (flag1) {
            bill += "Extra Toppings Added: " + (isVeg ? 70 : 120) + "\n";
        }
        if (price > 400) {
            bill += "Paperbag Added: 20\n";
        }
        bill = "Base Price Of The Pizza: " + (isVeg ? 300 : 400) + "\n" + bill;
        bill += "Total Price: " + price + "\n";

        return this.bill;
    }
}
