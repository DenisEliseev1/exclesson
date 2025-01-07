package lektion1;


public class program2 {
    public static void main(String[] args) {
        /**
         * Реализуйте метод mergeAndValidateArrays, который принимает два
        массива целых чисел. Метод должен объединить массивы и вернуть новый
        массив. Если длины массивов не равны, выбрасывайте исключение
        IllegalArgumentException. Если хотя бы один элемент объединенного
        массива отрицательный, выбрасывайте исключение RuntimeException с
        сообщением "Обнаружен отрицательный элемент".
         */
        int [] arr1 = new int[] {1, 2, 3}; 
        int [] arr2 = new int[] {4, 5,-6}; 
        int [] sum = mergeAndValidateArrays(arr1, arr2);

        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i]+" ");
        }
    }
    public static int [] mergeAndValidateArrays (int [] arr1, int []arr2) {
        if (arr1.length != arr2.length) 
            throw new IllegalArgumentException ("Длины массивов не равны");
        int [] sum = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            if ((arr1[i]<0) || (arr2[i]<0))
                throw new RuntimeException("Обнаружен отрицательный элемент");
            sum [i] = arr1 [i];
            sum [i+arr1.length] = arr2 [i];
            
        }
        
        return sum;
        }

        
    }


