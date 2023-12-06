package _Frameworks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class I_CollectionClass {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        num.add(45);
        num.add(78);
        num.add(96);
        num.add(45);
        num.add(13);
        num.add(35);
        num.add(59);
        System.out.println(Collections.min(num));
        System.out.println(Collections.max(num));
        System.out.println(Collections.frequency(num,45));
        num.sort(Collections.reverseOrder());
        System.out.println(num);

        List<Student> std = new ArrayList<>();
        std.add(new Student("Sunny", 12));
        std.add(new Student("Sibun", 2));
        std.add(new Student("Nikhil", 22));
        std.add(new Student("Ayush", 32));

        Student s1 = new Student("Sonu", 42);
        Student s2 = new Student("Chetan", 52);

//        System.out.println(s1.compareTo(s2));

        std.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(std);

    }
}