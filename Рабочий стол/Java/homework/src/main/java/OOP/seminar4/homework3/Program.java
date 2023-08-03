package OOP.seminar4.homework3;


import OOP.seminar4.homework3.controllers.UserController;
import OOP.seminar4.homework3.models.DataService;
import OOP.seminar4.homework3.models.Student;
import OOP.seminar4.homework3.models.StudentGroupService;
import OOP.seminar4.homework3.models.Teacher;
import OOP.seminar4.homework3.views.UserView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Program {

    /**
     * — Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
     * — Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
     * — Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
     * — Модифицировать класс Контроллер, добавив в него созданный сервис;
     * — Модифицировать класс Контроллер, добавив в него метод, сортирующий список потоков, путём вызова созданного сервиса.
     *
     * Формат сдачи: ссылка на гитхаб проект
     * @param args
     */

    public static void main(String[] args) {
        DataService dataService = new DataService();
        StudentGroupService studentGroupService = new StudentGroupService();
        UserView userView = new UserView();
        UserController userController = new UserController(dataService, studentGroupService, userView);

        Student student1 =  userController.createStudent("AAA1", "BBB1", "CCC1", LocalDate.now());
        Student student2 = userController.createStudent("AAA2", "BBB2", "CCC2", LocalDate.now());
        List<Student> students = new ArrayList<>(List.of(new Student[]{student1, student2}));
        userController.createStudentGroup(new Teacher("AAA", "BBB", "CCC", LocalDate.now()),
                students);


    }
}
