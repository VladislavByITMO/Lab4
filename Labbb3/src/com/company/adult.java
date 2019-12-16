package com.company;

public class adult extends Human {
    private int moodlvl;

    adult(String name, String Do, int mood) {
        super(name, Do);
        moodlvl = mood;
    }



        public void angry() {
        System.out.print("и " + getName() + " рассердилась еще больше. Шли дни.  ");
    }

    void write() {
        System.out.print(getName() + " написала открытку и отправила по почти России Малышу, \n но все мы знаем, какая почта бывает коварная. ");
    }
    void afraid(){
        System.out.print("Дядя " + getName() + ", по правде сказать, тоже испугался пистолета. ");
        System.out.println("(настроение " + getName() + " уменьшено  на -1)");
        moodlvl --;
    }
    void getThings(){
        int Chance;
        Chance = ((int) (Math.random() * 2));
        if (Chance == 1) {
            System.out.println(getName() + "получил назад свои вещи, но все же не считал, что мальчики должны ходить с огнестрельным оружием");
            moodlvl++;
            System.out.println("Вещи были получены настроение увелечино +1");
        }else{
            System.out.print(getName() + "Не получил вещи назад, чем был расстроен, и он все же не счтает, что мальчики должны ходить с огнестрельным оружием ");
            moodlvl--;
            System.out.println("Вещи не были получены, настроение уменьшено -1");
        }
    }
    void gotoGost(place gostinay){
        System.out.print(getName() + " отправился в " + gostinay.getName() +" комнату //"  + gostinay.getcount() + " // ");
    }
        void getSigara(things sigara){
        System.out.println("чтобы взять " + sigara.getName());
        }
        void clean(){
        System.out.println( getName() + " стала убирать со стола и мыть посуду и напевать \"Ах, Фрида, для тебя это лучше!..\" ");
        }
        void towel(things towel,HumanwithPropeller karlson){
        System.out.println("Но тут она вдруг обнаружила, что нет ни одного полотенца"+ towel.getcountold()+ ", и снова рассердилась.");
        moodlvl--;
        System.out.println(" настроение уменьшено -1");
        System.out.println(karlson.getName() + " отправлен за полотенцами");
        }
}
