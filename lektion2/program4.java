package lektion2;
/**
 * Напишите метод, который находит среднее значение массива целых чисел.
Если массив пустой или null, метод должен вернуть Double.NaN и вывести
сообщение об ошибке.
 */
public class program4 {
    public static void main(String[] args) {
        int [] arr = new int[2] ;
        double mid = intMiddleMassive(arr);
        System.out.println(mid);
    }
    public static double intMiddleMassive (int [] arr){
        double double1 = 0.00;
        Integer sum = 0;
        int x = 1;
        try {
        for (Integer j = 0; j < arr.length; j++) {
           sum= sum+arr[j];

        }
        double1 = sum/arr.length;
        if (sum == 0){
            x = x/sum;
            
        }
        System.out.println(sum/arr.length);
        
        } catch (ArithmeticException e) {
            System.out.println("Пустой массив");
            double1 = Double.NaN;
        } catch (Exception e){
            System.out.println("Неизвестная ошибка");
        } 
        return double1;
    }
}
