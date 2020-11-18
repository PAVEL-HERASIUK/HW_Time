package by.epam.linear_program.main;

public class Main102 {

    public static void main(String args[]) {
        String str = "JavaProgLang";
        System.out.println(removeCharAt(str, 2)); // Выводим на экран строку str без символа "v", который находится во второй позиции или индексе 2. Напоминаем, что в Java отсчет начинается с нуля.
    }

    private static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 5); // Возвращаем подстроку s, которая начиная с нулевой позиции переданной строки (0) и заканчивается позицией символа (pos), который мы хотим удалить, соединенную с другой подстрокой s, которая начинается со следующей позиции после позиции символа (pos + 1), который мы удаляем, и заканчивается последней позицией переданной строки.
    }
}

