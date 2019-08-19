package level05.lesson09;
/*
Конструктор
*/
/*Разберись, что делает программа.
Найди и исправь одну ошибку в классе Circle. Метод main изменять нельзя.*/
public class Task8 {
    public Color color;

    public static void main(String[] args) {
        Task8 circle = new Task8();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public Task8() {
        color = new Color();
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
