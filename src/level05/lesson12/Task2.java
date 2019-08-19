package level05.lesson12;
/*
Мужчина и женщина
*/
/*1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address*/
public class Task2 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Zhenya", "Moscow", 32);
        Man man2 = new Man("Ivan", "Odessa", 22);
        System.out.println(man1);
        System.out.println(man2);
        Woman woman1 = new Woman("Olya", "Kiev", 18);
        Woman woman2 = new Woman("Zoya", "Xerson", 21);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    //напишите тут ваш код
    public static class Man
    {
        private String name, address;
        private int age;

        public Man(String name, String address, int age)
        {
            this.name = name;
            this.address = address;
            this.age = age;
        }
        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman
    {
        private String name, address;
        private int age;

        public Woman(String name, String address, int age)
        {
            this.name = name;
            this.address = address;
            this.age = age;
        }
        public String toString()
        {
            return name + " " + age + " " + address;
        }

    }
}
