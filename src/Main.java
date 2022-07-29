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
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);

        //        Задание 3
        System.out.println("Задание 3");
        fullName = "Иванов Семён Семёнович";
        String fixedFullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fixedFullName);

        //        Задание 4
        System.out.println("Задание 4");
        String withoutSpaces = "Ivanov Ivan Ivanovich";
        int firstSpace = withoutSpaces.indexOf(" ");
        int secondSpace = withoutSpaces.indexOf(" ", firstSpace + 1);
        String lastNameWithoutSpaces = withoutSpaces.substring(0, firstSpace);
        String firstNameWithoutSpaces = withoutSpaces.substring(firstSpace, secondSpace);
        String middleNameWithoutSpaces = withoutSpaces.substring(secondSpace, withoutSpaces.length());
        System.out.println("Имя сотрудника — " + firstNameWithoutSpaces);
        System.out.println("Фамилия сотрудника — " + lastNameWithoutSpaces);
        System.out.println("Отчество сотрудника — " + middleNameWithoutSpaces);

        //        Задание 5
        System.out.println("Задание 5");
        String fullNameLowercase = "ivanov ivan ivanovich";
        char[] string = fullNameLowercase.toCharArray();
        string[0] = Character.toUpperCase(string[0]);
        for (int i = 0; i < string.length; i++) {
            if (string[i] == ' ') {
                string[i + 1] = Character.toUpperCase(string[i + 1]);
            }
        }
        String fullNameCapitalLetters = new String(string);
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв - " + fullNameCapitalLetters);

        //        Задание 6
        System.out.println("Задание 6");
        String one = "135";
        String two = "246";
        StringBuilder sb = new StringBuilder(one);
        StringBuilder sb2 = new StringBuilder(two);
        int j = 0;
        for (int i = 1; i < sb.length() + 1; i++) {
            sb.insert(i, sb2.charAt(j));
            i++;
            j++;
        }
        System.out.println("Данные строки — " + sb);

        //        Задание 7
        System.out.println("Задание 7");
        String str = "aabccddefgghiijjkk";
        char[] replay = str.toCharArray();
        StringBuilder sbNew = new StringBuilder();
        for (int i = 0; i < replay.length-1; i++) {
            if (replay[i] == replay[i+1]) {
                sbNew.append(replay[i]);
            }
        }
        System.out.println("Дублируются следующие буквы - " + sbNew);


    }


}



