package level02.lesson10;
// Сайт знакомств

/*Вы создаете базу данных пользователей для сайта знакомств.
Да вот беда — вы подзабыли в каком порядке их нужно указывать, а технического задания под рукой нет.
Спроектируйте класс User,  у которого будут поля — имя (String) возраст (short) и рост (int).
Создайте для него необходимое количество конструкторов, чтобы имя, возраст и рост можно было указывать в любом порядке.*/
public class Task2 {
    public static class User {

        String name;
        short age;
        int height;

        public User(short age, String name, int height){
            this.age = age;
            this.name = name;
            this.height = height;
        }

        public User(short age, int height, String name){
            this.age = age;
            this.height = height;
            this.name = name;
        }

        public User(int height, short age, String name){
            this.height = height;
            this.age = age;
            this.name = name;
        }

        public User(int height, String name, short age){
            this.height = height;
            this.name = name;
            this.age = age;
        }

        public User(String name, int height, short age){
            this.name = name;
            this.height = height;
            this.age = age;
        }

        public User(String name, short age, int height){
            this.name = name;
            this.age = age;
            this.height = height;
        }


        public static void main(String[] args) {
            // write your code here
            User user1 = new User("Ирина", (short) 25, 175);
            System.out.println("Новый пользователь - " + user1.name + ", " + user1.age + "лет, " + user1.height + " см.");
            User user2 = new User((short) 35, "Юлия", 180);
            System.out.println("Новый пользователь - " + user2.name + ", " + user2.age + " лет.");
            User user3 = new User("Ольга", 167, (short) 28);
            System.out.println("Новый пользователь - " + user3.name + ", " + user3.height + " см" + ", " + user1.age + " лет.");

        }
    }
}
