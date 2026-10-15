package assignmentDay5;

public class VowelConsonantCheck {
    public static void main(String[] args) {
        char ch = 'e';
        char lowerCh = Character.toLowerCase(ch);

        if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println("Not an alphabetic character.");
        }
    }
}
