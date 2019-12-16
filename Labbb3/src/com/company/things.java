package com.company;

public class things {
    private String name;
    private status type;
    private status type2;
    private  int oldcount = 0;
    things(String name, status l, status q) {
        this.name = name;
        this.type = l;
        this.type2 = q;
    }
    things(String name) {
        this.name = name;
    }


    int count = ((int)(1 + Math.random() * 11));
    public String getcountold(){
        return " количество полотенец: " + oldcount;
    }
    public String getcount(){
        return "количество полотенец" + count;
    }
    public String towel(){
        if (count >= 6) {
            return "огромной охапкой ";}
        else{
            return "маленькой охапкой ";}
        }

    public String who() {
        return "Объект  " + name + " создано в количестве " + count + "шт";
    }
    public String getName() {
        return name;
    }

    void sost() {
        System.out.println("Но все эти " + name + " были " + type + " и " + type2 + ". ");
    }
    @Override
    public String toString() {
        return who();
    }
}
