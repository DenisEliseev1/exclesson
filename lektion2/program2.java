package lektion2;
/**
 * Напишите метод, который проверяет, является ли введенная строка
палиндромом. Если строка палиндром, возвращайте "Palindrome". Если нет
— "Not a palindrome".
 */

public class program2 {
    public static void main(String[] args) {
        String str = " abcbc";
        checkPalindrom(str);
    }
    public static void checkPalindrom (String str){
        try {
            if (str == "") str = null;
            str = str.replace(" ","").toLowerCase();            
            String rts = replace(str);
            int x = 0;
            System.out.println("1 - " + rts);
            System.out.println("2 - " + str);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != rts.charAt(i)) {
                    x++;
                }
            }
            if (x !=0){
                System.out.println("Not a palindrome");
            } else System.out.println("Palindrome");
            
        } catch (NullPointerException e) {
            System.out.println("Пустая строка");
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка");
        }
       
    }
    public static String replace (String str) {
        String rts = "";
        for (int i = 0; i < str.length(); i++) {
            rts = str.charAt(i)+rts; 
        }
        return rts;

    }
}
