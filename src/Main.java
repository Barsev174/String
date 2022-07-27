import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        Задание 1
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

//        Задание 2
        System.out.println("Задание 2");
        fullName = fullName .toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);

        //        Задание 3
        System.out.println("Задание 3");
        fullName = "Иванов Семён Семёнович";
        String fixedFullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fixedFullName);

    }
}


