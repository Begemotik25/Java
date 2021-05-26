package Lab1_2;

public class Fourth  {
    //Створіть тестовий приклад, який демонструє використання інтерфейсу у якості локальної змінної, параметра методу, у якості повертаємого значення.

    public interface Printable {
        abstract String func(String s);
    }

    void Modify(String[] array, Printable pr) {
        for (int i = 0; i < array.length; i++) {
            array[i] = pr.func(array[i]);
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {

        Fourth f1 = new Fourth();
        String[] arr = {"Orange","Apple","Peach"};
        f1.Modify(arr, new Pr()) ;
    }
}

class Pr implements Fourth.Printable{
    @Override
    public String func(String s)
    {
        return s+" "+s+" " + "Banana";
    }
}



