package util;

public class Test {
 
    public static void main(String[] args) {

        Person p = new Person();

        Student s1 = new Student(1001);

        Student s2 = new Student(1001);

        System.out.println(s1.equals(p));

        System.out.println(s1.equals(s2));

        System.out.println();
 


    }
}
