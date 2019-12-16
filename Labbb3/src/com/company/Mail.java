package com.company;
public class Mail{
    static int Chance;
    public static int Mail(){
        Chance = ((int) (Math.random() * 2));
        return Chance;

    }
}
