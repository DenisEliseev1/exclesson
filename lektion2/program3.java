package lektion2;


import java.util.Arrays;

public class program3 {
    /**
     * Задача 3. Сортировка массива строк
Напишите метод, который принимает массив строк и сортирует его в
алфавитном порядке. Если входной массив null, метод должен вернуть пустой
массив и вывести сообщение об ошибке.

     */
    public static void main(String[] args) {
        String [] strArr = new String[] {"asdsf","gfds", "bfgkjfk", "cgdjhg"};
        String [] strArrSort = sortWord(strArr);
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArrSort[i]);
        }

    }
    public static String [] sortWord (String [] strArr) {
        try {
            Arrays.sort (strArr);
            
        } catch (NullPointerException e) {
            System.out.println("Пустой массив");
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка");
        }
        finally{
            return strArr;
        }
        
    }
}