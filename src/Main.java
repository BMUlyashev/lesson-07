import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        // Дополнительные задания
        task5();
        task6();
        task7();
        task8();
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

    private static void task5() {
        String fullName = "Ivanov Ivan Ivanovich";
        String firstName = "";
        String middleName = "";
        String lastName = "";

        int firstSpaceIndex = fullName.indexOf(' '); // индекс первого пробела
        int lastSpaceIndex = fullName.lastIndexOf(' ');
        lastName = fullName.substring(0, firstSpaceIndex);
        firstName =  fullName.substring(firstSpaceIndex + 1, lastSpaceIndex).trim(); // Если больше одного пробела
        middleName = fullName.substring(lastSpaceIndex + 1);
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
    }

    private static void task6() {
        String fullName = "ivanov ivan ivanovich";
        String[] subStrFullName = fullName.split(" ");
        fullName = "";
        for (int i = 0; i < subStrFullName.length; i++) {
            char[] letter = subStrFullName[i].trim().toCharArray();
            letter[0] = Character.toUpperCase(letter[0]);
            subStrFullName[i] = new String(letter);
            if (i != subStrFullName.length - 1) {
                fullName += subStrFullName[i] + " ";
            } else {
                fullName += subStrFullName[i];
            }
        }
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + fullName);
    }

    private static void task7() {
        String firstStr = "135";
        String secondStr = "246";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < firstStr.length(); i++) {
            sb.append(firstStr.charAt(i));
            sb.append(secondStr.charAt(i));
        }
        System.out.println("Данные строки — " + sb);
    }

    private static void task8() {
        String str = "aabccddefgghiijjkk";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}