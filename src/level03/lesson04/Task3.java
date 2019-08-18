package level03.lesson04;
/*
Привет StarCraft!
*/

/*Создать 5 зергов, 3 протосса и 4 террана.
Дать им всем уникальные имена.*/
public class Task3 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "Vaska1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Vaska2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Vaska3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Vaska4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Vaska5";

        Protoss protoss1 = new Protoss();
        protoss1.name = "Men1";
        Protoss protoss2 = new Protoss();
        protoss2.name = "Men2";
        Protoss protoss3 = new Protoss();
        protoss3.name = "Men3";

        Terran terran1 = new Terran();
        terran1.name = "Belka1";
        Terran terran2 = new Terran();
        terran2.name = "Belka2";
        Terran terran3 = new Terran();
        terran3.name = "Belka3";
        Terran terran4 = new Terran();
        terran4.name = "Belka4";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;

    }
}
