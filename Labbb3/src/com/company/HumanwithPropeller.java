package com.company;

import java.net.PortUnreachableException;

public class HumanwithPropeller extends Human {
    private int mood = 0;
    HumanwithPropeller(String name, String DO) {
        super(name, DO);
    }

    public class propeller{
        public void start(){
            System.out.println("Пропеллер вращается, можено лететь! //тест объекта пропеллер вложенного класса propeller");
        }
    }
    public String mooddmin(){
        mood-=1;
        return "// настроение " + getName() + "уменьшено на -1 // ";

    }


    void doo(String b, String x) {
        System.out.print("вернулся с такой " + x + b);
    }
    void statinvis(int b) {
        if (b >= 6 ){
            System.out.print(", что его самого не было видно.");
        } else{
            System.out.print(", что его было отлично видно, ведь полотенец было мало, ");
        }

    }

    void Runto(String c, place room) {
        System.out.println(getName() + " сбегал в " + c + " и ");
        System.out.println(" //" + getName() + " " + room.getcount() + "// ");

    }
    void spoil(){
        System.out.print(getName() + " не смог испортить настроение тк песня была спета");
    }
}


