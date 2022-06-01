import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    private static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
    }

    private static void task3() {
        String fullName = "Иванов Семён Семёнович";
        String[] words = fullName.split(" ");
        for (int i = 0; i <  words.length; i++) {
            if (words[i].contains("ё")) {
                words[i] = words[i].replace("ё", "е");
            }
        }
        fullName = words[0] + " " + words[1] + " " + words[2];
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}