package lektion1;

/**
 * Реализуйте метод convertAndSum, который принимает массив строк, каждая
из которых должна быть преобразована в целое число. Метод возвращает
сумму всех чисел. Если хотя бы одна строка не может быть преобразована в
число, метод должен выбросить исключение NumberFormatException.
Дополнительно, если сумма чисел превышает 100, выбрасывайте
ArithmeticException с сообщением "Превышен лимит суммы".

 */


public class program {

    public static void main(String[] args) {
        String[] str = new String[] {"1", "g", "3"};
        System.out.println(convertAndSum (str));
    }

    public static int convertAndSum (String[]strArr){
        int sum = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].matches("-?\\d+") != true) {
                throw new NumberFormatException ("Не корректные тип данных в массиве");
            }
            else sum = sum + Integer.parseInt(strArr[i]);
        }
        if (sum>100){
            throw new ArithmeticException("Превышен лимит суммы");
        }
       return sum;
    }
}