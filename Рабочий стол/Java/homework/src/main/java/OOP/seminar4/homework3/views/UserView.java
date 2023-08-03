package OOP.seminar4.homework3.views;

import OOP.seminar4.homework3.models.StudentGroup;
import OOP.seminar4.homework3.models.User;

import java.util.List;

public class UserView {

    public void printOnConsole(List<User> list){
        System.out.println("Актуальный список всех студентов:");
        System.out.println("================================");
        for (User user: list) {
            System.out.println(user);
        }
        System.out.println("================================\n");
    }

    public void printOnConsole(StudentGroup group){
        System.out.println("=== Группа ===");
        System.out.println(group);
    }

}
