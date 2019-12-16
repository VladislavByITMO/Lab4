/*Карлсон сбегал в комнату Малыша и вернулся с такой огромной охапкой полотенец,
что его самого не было видно.
Но все эти полотенца были грязные и мятые, и фрекен Бок рассердилась еще больше.
Шли дни. Малыш получил открытку от мамы и папы.
Путешествие было прекрасным, писали они, и они надеются,
что Малыш тоже весело проводит время и что он хорошо ладит с дядей Юлиусом и фрекен Бок.

 */
package com.company;

public class Main {
    public static void main(String[] args) {
        HumanwithPropeller karlson = new HumanwithPropeller("Karlson", "спит");
        HumanwithPropeller.propeller Propellerr = karlson.new propeller();
        System.out.print(karlson);
        mesto Rooms = new mesto(){
            @Override
            public String getName() {
                return null;
            }
            public void stay(){
                System.out.println("Все комнаты находятся в уютной квартире, в которой живет большая семья со своим другом Карлсоном и няней Фрекен бок " +
                        "и вот такая у них произовшла история: ");
            }
        };

        Kid Malish = new Kid("Malish", "отдыхает", 0);
        System.out.print(Malish);
        Malish.get();
        place room = new place("комната Malish", Objects.room,0);
        System.out.print(room);
        adult bok = new adult("Freken Bok", "",0);
        adult ul = new adult("Ulius", "",0);
        System.out.print(bok);
        adult mom = new adult("mama", " ",0);
        adult dad = new adult("papa", " ",0);
        System.out.print(mom);
        System.out.print(dad);
        things towel = new things("полотенец", status.Грязные, status.мятые);
        System.out.print(towel);
        System.out.println();
        Kid Rulle = new Kid("Рулле","удирает",0);
        Kid Fille = new Kid("Филле","удирает",0);
        System.out.print(Rulle);
        System.out.print(Fille);
        things Pistolet = new things("Pistolet");
        place Gostinay = new place("гостиная", Objects.гостиная,0);
        System.out.println(Gostinay);
        things sigara = new things("sigara");
        place kitchen = new place("кухня",Objects.кухня,0);

        System.out.print("Рассказ: \n");

        Rooms.stay();
        Propellerr.start();
        kitchen.get(Malish, karlson , bok, ul);
        ul.afraid();
        Malish.Answer(Rulle,Fille,Pistolet);
        ul.gotoGost(Gostinay);
        ul.getSigara(sigara);
        bok.clean();
        karlson.spoil();
        bok.towel(towel,karlson);
        karlson.Runto(room.getName(),room);
        karlson.doo(towel.getName(),towel.towel());
        karlson.statinvis(towel.count);
        towel.sost();
        bok.angry();
        mom.write();
        Malish.GgtLetter(mom, dad, ul, bok);
        Malish.Readabout(karlson,mom,dad);
        System.out.print(" The End ");
    }
}
