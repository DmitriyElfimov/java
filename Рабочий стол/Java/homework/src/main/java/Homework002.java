public class Homework002 {
    public static void main(String [] str) {
        String user = "name: Ivanov, county: Russia, sity: Moscow, age: null";
        //System.out.println(user);
        String[] a = user.split(", ");
        for (int i = 0; i<a.length; i++){
            if (a[i].contains("null"));
            else System.out.println(a[i]);
        }
        String student01 = "фамилия: Иванов, оценка: 5, предмет: Математика";
        String student02 = "фамилия: Петрова, оценка: 4, предмет: Информатика";
        String student03 = "фамилия: Краснов, оценка: 5, предмет: Физика";
        two(student01);
        two(student02);
        two(student03);

    }

    static void two (String student) {
        student = student.replaceAll("[,:]", "");
        String[] stud = student.split(" ");
        StringBuilder builder = new StringBuilder();
        builder.append("Студент ");
        builder.append(stud[1]);
        builder.append(" получил ");
        builder.append(stud[3]);
        builder.append(" по предмету ");
        builder.append(stud[5]);
        builder.append(".");
        System.out.println(builder);
        //System.out.println("Студент " + stud[1] + " получил " + stud[3] + " по предмету " + stud[5] + ".");
    }
}
