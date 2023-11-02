import java.util.Arrays;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {


//        num(300);


//    public static void num(int a) {
//        int sum = 0;
//        for (int i = 0; i < 300; i++) {
//            a = i;
//            if (a % 3 == 0 && a % 4 == 0 && a % 5 == 0 ){
//                sum+=i;
//            }
//
//        }System.out.println("Summa  : "+sum);;





//        int [] array1 = new int[10];
//        array(array1);
//    }




//    public static void array(int[] massive) {
//        for (int i = 0; i < massive.length; i++) {
//            massive[i] = new Random().nextInt(1, 88);
//        }
//                int[] sortArray = Arrays.copyOf(massive,massive.length);
//                for (int i = 0; i < sortArray.length ; i++) {
//                    for (int j = 0; j < sortArray.length - 1 ; j++) {
//                        if (sortArray[j] < sortArray[j +1]) {
//                            int san = sortArray[j + 1];
//                            sortArray[j + 1] = sortArray[j];
//                            sortArray[j] = san;
//                        }
//
//            }
//
//        }
//        System.out.println(Arrays.toString(massive));
//        System.out.println(Arrays.toString(sortArray));
//


//        int [] massive =  new int[10];
//        for (int i = 0; i < massive.length ; i++) {
//            int ran = new Random().nextInt(1,77);
//            massive[i]=ran;
//
//
//        }
//        int [] sortArray = Arrays.copyOf(massive,massive.length + 1);
//        for (int i = 0; i < sortArray.length - 1 ; i++) {
//            for (int j = 0; j < sortArray.length - 1 ; j++) {
//                if (sortArray[j] > sortArray[j+1]){
//                    int san = sortArray[j];
//                    sortArray[j]= sortArray[j+1];
//                    sortArray[j+1] = san;
//
//                }
//            }
//
//        }
//        sortArray[sortArray.length-1] = new Random().nextInt(77,99);
//
//        System.out.println(Arrays.toString(massive));
//        System.out.println(Arrays.toString(sortArray));



        int [] array = {12,23,44,222,222,222,21,78};
        for (int i = 0; i < array.length; i++) {
        }
        int max = array[0];

        for (int i = 0; i < array.length-1 ; i++) {
            if (array[i] == array [i+1] && array[i] == array[i+2]){
                System.out.println(true);
            }

        }
        int sum = 0;
        int [] newArr = new int[array.length-1];
        for (int i = 0; i < newArr.length + 1; i++) { //12
            if (newArr[sum] != array[sum]){

            }
             if (23 != array[i]){
                 newArr[sum] = array[i];
                 sum++;

             }

        }

        System.out.print(Arrays.toString(array));
        System.out.println("\nMaximum " + max);
        System.out.println();
        System.out.print(Arrays.toString(newArr));




//
//        int [] array = {12,23,44,53,532,222,21,78};
//        for (int i = 0; i < array.length; i++) {
//        }
//        for (int i = 0; i < array.length - 1; i++)
//            array[2] = 44;
//
//
//
//
//        int[] array = {12, 23, 44, 53, 532, 222, 21, 78};
//        for (int i = 0; i < array.length ; i++) {
//        }
//        int index = 2;
//
//        if (index >= 0 && index < array.length) {
//            for (int i = index; i < array.length - 1; i++) {
//                array[i] = array[i + 1];
//            }
//            array[array.length - 1] = 0;
//
//            System.out.println("Массив после удаления элемента по индексу " + index + ": " + Arrays.toString(array));
//        } else {
//            System.out.println("Недопустимый индекс для удаления.");
//        }
//
//        System.out.println(Arrays.toString(array));
//
//



    }


}
