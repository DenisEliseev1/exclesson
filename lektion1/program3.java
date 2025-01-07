package lektion1;

public class program3 {
    public static void main(String[] args) {
        /**
         * Реализуйте метод subArraysWithExceptionHandling, который принимает
два массива целых чисел. Метод должен возвращать новый массив, где
каждый элемент является разностью соответствующих элементов двух входных
массивов. Если длины массивов не равны, выбрасывайте
IllegalArgumentException с сообщением "Массивы разной длины". Если
результат разности оказывается отрицательным, выбрасывайте
RuntimeException с сообщением "Отрицательный результат разности".
         */
        int [] arr1 = new int[] {1, 2, 3}; 
        int [] arr2 = new int[] {4, 5,6}; 
        int [] sum = subArraysWithExceptionHandling (arr2, arr1);

        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i]+" ");
        }
    }
    public static int [] subArraysWithExceptionHandling (int [] arr1, int []arr2) {
        if (arr1.length != arr2.length) 
            throw new IllegalArgumentException ("Длины массивов не равны");
        int [] sum = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            sum [i] = arr1 [i] - arr2 [i];
            if (sum[i]<0)
                throw new RuntimeException("Обнаружен отрицательный элемент");
           
            
        }
        
        return sum;
        }
}
