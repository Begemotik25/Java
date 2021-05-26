package Lab1_2;

interface Print{

    void show();
}

public class Program {

    static void read(Print p){

        p.show();
    }

    static Print createPrint(boolean option){

        if(option)
            return new Person1("Stepan", "Petrov");
        else
            return (Print) new Person1("Ivan");
    }


    public static void main(String[] args) {

        Print print= createPrint(false);
        print.show();

        read(new Person1("Ivan", "Ivanov"));
        read(new Person2("Sveta"));
    }
}

class Person1 implements Print {

    String name;
    String surname;

    Person1(String name, String surname){

        this.name = name;
        this.surname = surname;
    }

    public Person1(String name) {
        this.name = name;
    }

    public void show() {

        System.out.printf(" \n", name, surname);
    }
}

class Person2 implements Print {

    private String name;

    String getName(){
        return name;
    }

    Person2(String name){

        this.name = name;
    }
    public void show() {
        System.out.println(name);
    }
}
