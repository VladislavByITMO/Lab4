package com.company;

public abstract class Human implements Humans {
    private String Name;
    private String DO;

    Human(String Name, String Do) {
        this.Name = Name;
        this.DO = Do;
    }

    @Override
    public String getName() {
        return Name;
    }

    void speak() {
        System.out.print(" ");
    }

    public String getDO() {
        return DO;
    }

    public String who() {
        return "существо по имени " + Name + " создано\n";
    }

    void get() {
        System.out.print("Функция получать что-либо добалена " + getName() + " \n");
    }

    void time() {
        System.out.print("Функция весело проводить время добавлена " + getName() + "\n");
    }
    @Override
    public int hashCode() {
        return super.hashCode() + this.Name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode() ? true : false;
    }
    @Override
    public String toString() {
        return who();
    }

}
