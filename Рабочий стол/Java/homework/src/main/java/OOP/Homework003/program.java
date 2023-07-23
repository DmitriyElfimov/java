package OOP.Homework003;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

import static OOP.Homework003.Controller.*;

public class program {
    public static void main(String[] args) throws IOException {
        Student student1 = new Student("Иванов", 1);
        Student student2 = new Student("Петров", 2);
        Student student3 = new Student("Сидоров", 3);
        Student student4 = new Student("Иванова", 4);
        Student student5 = new Student("Петрова", 5);
        Student student6 = new Student("Васечкин", 6);
        Student student7 = new Student("Рыжиков", 7);
        Student student8 = new Student("Сидорова", 8);
        Student student9 = new Student("Чижиков", 9);
        Student student10 = new Student("Муч-мяуч", 10);

        StudyGroup group = new StudyGroup("очная");
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        StudyGroup group2 = new StudyGroup("заочная");
        group2.addStudent(student4);
        group2.addStudent(student5);
        group2.addStudent(student6);
        group2.addStudent(student7);
        group2.addStudent(student8);
        group.addStudent(student9);
        group2.addStudent(student10);
        Potok groups = new Potok();
        groups.addGroup(group);
        groups.addGroup(group2);

        Iterator<Student> iterator = group.getStudents().iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }
        System.out.println();
        iterator = group2.getStudents().iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }
        Iterator<StudyGroup> groupIterator = groups.getGroups().iterator();
        while (groupIterator.hasNext()){
            StudyGroup students = groupIterator.next();
            System.out.println(students);
        }


        iterator = group.getStudents().iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName() == "Иванов") {
                iterator.remove();
            }
        }
        System.out.println("Студент Иванов был удален из учебной группы.");
        for (Student student : group.getStudents()) {
            System.out.println(student);
        }




    }

}
