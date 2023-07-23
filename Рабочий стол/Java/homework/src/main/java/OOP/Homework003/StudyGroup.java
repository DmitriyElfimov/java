package OOP.Homework003;

import java.util.ArrayList;
import java.util.List;
import OOP.Homework003.Iterator;
import OOP.Homework003.Student;

public class StudyGroup {
    private String nameGroup;
    private int size;
    public StudyGroup (String nameGroup){
        this.nameGroup = nameGroup;

    }
    public List<Student> students = new ArrayList<>();

    public StudyGroup() {
    }



    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
    public String getNameGroup() {
        return nameGroup;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Группа{" +
                "форма обучения'" + nameGroup + '\'' +
                ", количество студентов=" + students.size() +
                '}';
    }




}