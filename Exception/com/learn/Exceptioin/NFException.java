package com.learn.Exceptioin;

public class NFException {
    public static void main(String[] args) {
        try{
            double parseDouble=Double.parseDouble(("123"));
            System.out.println("paresed double:" +parseDouble);
            Integer abc=new Integer("234");
            System.out.println("parsed double:"+abc);

        }catch (NumberFormatException e){
            System.out.println("NumberFormatException thrown"+e.getMessage());
        }
    }
}
