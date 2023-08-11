package homework14;

public class HomeWork14 {
    //task 0
    public static String convertToUpperCase(String input) {
        char [] charArray = input.toCharArray();

        for (int i = 0 ; i < charArray.length ; i++) {
            char c = charArray[i];
            if ( c >= 'a' && c <= 'z') {
                charArray[i] = (char) (c - 'a' + 'A');

            }
        }
        return new String(charArray);

    }

    public static void main(String[] args) {
        String input = "Hello Sergey!";
        String result = convertToUpperCase(input);
        System.out.println(result);
    }

}
