package com.company;

public class Kid extends Human {
    static int moodlvl;
    public String Mood = " Грустно";
    Kid(String Name, String Do, int moodlv) {
        super(Name, Do);
        moodlvl = moodlv;
    }
    public String checkmood(){
        if (moodlvl < 0) {
            Mood = "грустно";}
            else {
                Mood = "Велело";}
        return Mood;
    }

    void getletter(String b,String c,String a, String z) throws GetLetterException {
        if (Mail.Mail() == 1) {
            System.out.println("Луна была в нужной фазе и " + getName() + " всё таки получил открытку от " + b + " и " + c + ".");
            moodlvl ++;
            System.out.println("(настроение " + getName() + " увеличино на +1)");
            Read(a,z);
        } else {
            throw new GetLetterException("{сработало исключение}, Малыш не получил открытки. \n");
        }


    }
    void GgtLetter(adult mom,adult dad,adult ul, adult bok){
        String b = mom.getName();
        String c = dad.getName();
        String a = ul.getName();
        String z = bok.getName();
        try {
            getletter(b, c, a, z);
        } catch (GetLetterException e){
            System.out.print(e.getMessage());
            System.out.println(getName() + " НЕ получил открытку от " + b + " и " + c + ". \r\n Снова подвела почта..");
            System.out.println("(настроение " + getName() + " уменьшино  на -1)");
            moodlvl --;
            System.exit(0);
        }

    }
     void Read(String a, String b){
        System.out.print(" Путешествие было прекрасным, писали они, и они надеются, что " + getName() + " тоже весело проводит время, и ");
        relationships(a,b);
    }

    void relationships(String a, String b) {
        System.out.println("что он хорошо ладит с дядей " + a + " и " + b + ".");
        System.out.println("(" + getName() + " на самом деле " + checkmood() + " проводит время )");
    }
    void Answer(Kid Rulle, Kid Fille, things Pist) {
        System.out.println("И когда " +  Rulle.getName() + " и " + Fille.getName() + "удрали, " + getName() + " долго пришлось объяснять, что " + Pist.getName() + " это игрушка");

    }
    public void Readabout(HumanwithPropeller karlson,adult mom, adult dad){
        System.out.println("О "+ karlson.getName() + ", который живет на крыше, там не было ни слова, " +
                "и Карлсона это сильно обидело.\n"+ karlson.mooddmin() + " Малыш был счастлив, что у Карлсона нет пяти эре, " +
                "чтобы купить почтовую марку. Он понимал, что "+ mom.getName() + " и " + dad.getName() + "не должны получать такой открытки");
    }

}
