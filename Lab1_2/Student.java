package Lab1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

class Student {
    private String name;
    private List<Integer> balls = new Vector<Integer>();


    public Student(String name) {
        this.name = name;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            balls.add(random.nextInt(100));
        }
    }

   // public double markStud() {
      //  double mark = 0;
     //   for (int i = 0; i <; i++) {

       // }
   // }


    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Ivan"));
        students.add(new Student("Ivan1"));
        students.add(new Student("Ivan2"));
        students.add(new Student("Ivan3"));
        students.add(new Student("Ivan4"));

       // List<Student> students1;
       // double mark = 0;
        //  for(Student s:students1) {
        //    mark+=s.
        //  }


    }
}

