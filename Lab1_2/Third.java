package Lab1_2;

public class Third {
    //Створіть метод, який дозволяє модифікувати елементи будь якого масиву int[], використовуючи кожний елемент масиву, як аргумент певної
    // функції( f(x)=3*x*x+5*x-21 наприклад). Масив  та функція передаються як параметри методу.
    public interface Algorythmic {
        abstract int function(int first);
    }

    void Modify(int[] array, Algorythmic alg) {
        for (int i = 0; i < array.length; i++) {
            array[i] = alg.function(array[i]);
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        Third t1 = new Third();
        int[] arr = {1, 2, 3, 4, 5};
        t1.Modify(arr, new Alg()) ;
    }
}

class Alg implements Third.Algorythmic{
    @Override
    public int function(int first)
    {
        return 3*first*first+5*first-21 ;
    }
}








