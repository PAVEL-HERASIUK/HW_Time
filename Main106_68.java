package by.epam.linear_program.main;
//2.Заменить в строке все вхождения word на letter;
public class Main106_68 {

    private static String changeWords(String word) {
        StringBuilder strBuilder = new StringBuilder();
        String letter;
        for (int i = 0; i < word.length(); i++) {
            if (i + 3 < word.length() && word.charAt(i) == 'w'
                    && word.charAt(i + 1) == 'o'
                    && word.charAt(i + 2) == 'r'
                    && word.charAt(i + 3) == 'd') {
                strBuilder.append("letter");
                i += 3;
            } else {
                strBuilder.append(word.charAt(i));
            }
        }
        letter = strBuilder.toString();
        return letter;
    }

    public static void main(String[] args) {
        String word = "displaying word count in microsoft word";
        String letter = changeWords(word);
        System.out.println(word);
        System.out.println(letter);
    }
}