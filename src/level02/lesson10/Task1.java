package level02.lesson10;
// Музей древностей

/*Твоя задача — спроектировать класс Artifact.
Артефакты, которые хранятся в музее, бывают трех видов.
Первый — о которых неизвестно ничего, кроме порядкового номера, присвоенному музеем (например: 212121).
Второй — о которых известен порядковый номер и культура, которой он был создан (например: 212121, "Ацтеки").
Третий вид — о которых известен порядковый номер, культура, которой он был создан, и точный век его создания (например: 212121, "Ацтеки", 12).

Создай класс Artifact, описывающий хранящиеся в музее древности, и напиши необходимое количество конструкторов для него. В методе main()
создай по одному артефакту каждого вида.*/
public class Task1 {
    public static class Artifact {
        int number;
        String culture;
        int century;


        public Artifact(int number) {
            this.number = number;

        }

        public Artifact (int number, String culture) {
            this.number = number;
            this.culture = culture;
        }

        public Artifact(int number, String culture, int century) {
            this.number = number;
            this.culture = culture;
            this.century = century;
        }

        public static void main(String[] args) {
            Artifact artifactNumber = new Artifact(212121);
            Artifact artifactNumberCulture = new Artifact(212121, "Ацтеки");
            Artifact artifactNumberCultureCentury = new Artifact(212121, "Ацтеки", 12);
            System.out.println(artifactNumber.number);
            System.out.println(artifactNumberCulture.number +" " + artifactNumberCulture.culture);
            System.out.println(artifactNumberCulture.number +" " + artifactNumberCulture.culture + " " + artifactNumberCultureCentury.century);
        }
    }
}
