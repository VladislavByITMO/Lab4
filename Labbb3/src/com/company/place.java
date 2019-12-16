package com.company;

public class place implements mesto {
    private String Name;
    private Objects type;
    private int count;

    public place(String name, Objects type, int count) {
        Name = name;
        this.type = type;
        this.count = count;
    }
    public String getcount(){
        count++;
        return "добавлен в место: " + getName() + ", количество объектов в комнате :" + count;
    }
    void get(Kid malish, HumanwithPropeller karlson, adult bok, adult ul){
        System.out.println(malish.getName() +", "+karlson.getName() + ", " + bok.getName()+ ", " + ul.getName()+ " добавлены в комнату:" + getName());
        count+=4;
        System.out.println("Количество людей в комнате :" + count);
        //локальный класс
        class obj{
            private String name;
            public obj(String name){
                this.name=name;
            }
        }
    }
    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void stay() {
    }


    public Objects getType() {
        return type;
    }

    public String toString() {
        return "место " + getName() + " создано\n";
    }
}
