package level12.lesson12;
/*
Изоморфы наступают
*/
/*Написать метод, который возвращает минимальное число в массиве и его позицию (индекс).*/
public class Task13 {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Index of minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        //напишите тут ваш код

        int numMin = array[0];
        for (int i = 1; i < array.length; i++) {
            if(numMin > array[i]) {numMin = array[i];}
            else {continue;}
        }

        int numIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (numMin == array[i]) {numIndex = i;}
            else {continue;}
        }

        return new Pair<Integer, Integer>(numMin, numIndex);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
