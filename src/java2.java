import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class java2 {
    public static void main(String[] args) {

//        int [] array1 = new int[10];
//        for (int i = 0; i < array1.length; i++) {
//            int ran = new Random().nextInt(1,55);
//            array1[i] = ran;
//        }
//        int[] sortArray = Arrays.copyOf(array1,array1.length);
//        for (int i = 0; i <sortArray.length ; i++) {
//            for (int j = 0; j < sortArray.length - 1; j++) {
//
//                if (sortArray[j] > sortArray[j+1]){
//                    int max = sortArray[j];
//                    sortArray[j] = sortArray[j+1];
//                    sortArray[j+1]=max;
//                }
//            }
//
//        }
//        int [] sortArray1 = Arrays.copyOf(array1,array1.length);
//        for (int i = 0; i < sortArray1.length; i++) {
//            for (int j = 0; j < sortArray1.length - 1 ; j++) {
//                if (sortArray1[j]<sortArray1[j+1]){
//                    int min = sortArray1[j+1];
//                    sortArray1[j+1]=sortArray1[j];
//                    sortArray1[j] = min;
//                }
//            }
//
//        }
//        System.out.println("Без сортировка : " + Arrays.toString(array1));
//        System.out.println("Сортировка по -->" + Arrays.toString(sortArray));
//        System.out.println("Сортировка по <--" + Arrays.toString(sortArray1));
//


//        int scanner = new Scanner(System.in).nextInt();
//        int random = new Random().nextInt(1,10);
//        System.out.println(random);
//        san(scanner,random);

//        int num  =number(new Scanner(System.in).nextInt());
//        System.out.println(num);


//        Scanner scaner = new Scanner(System.in);
//        System.out.println("write you number 1 and 2 :");
//        int num = num(scaner.nextInt(),scaner.nextInt());
//        System.out.println(num);


//        System.out.println("write your number :");
//        int number = num(new Scanner(System.in).nextInt());
//        System.out.println(number);


//        System.out.println("Write your year of birth :");
//        int scaner = new Scanner(System.in).nextInt();
//        System.out.println("Write your year now :");
//        int scanner2 = new Scanner(System.in).nextInt();
//
//        int result = age(scaner,scanner2);
//        System.out.println(result);


//        String scan = new Scanner(System.in).nextLine();
//        soz(scan);


//        System.out.println("Sandy jaz  ");
//        int scan = new Scanner(System.in).nextInt();
//
//        if (scan == 1) System.out.println("Hello");
//        else if (scan == 2) System.out.println("Bye  ");
//        else System.out.println("Invalid number ");


//    }

//    public static void hello (){
//        System.out.println(" Hello : ");
//    }
//    public static void bye (){
//        System.out.println(" Bye : ");


//    }
//    public static void soz (String name){
//        System.out.println("Salam  " + name);


//    }
//    public static int age  (int dateofbirth , int nowyear){
//        return nowyear-dateofbirth;


//    }
//    public static int num(int a){
//        if (a % 2 == 0){
//            System.out.println("Жуп сан :");
//        }else System.out.println("Tak san :");
//        return a;


//    }
//    public static int num (int a, int b){
//        return (a + b)/2;
//    }
//    public static int number (int san){
//        int n = 0;
//        for (int i = 0; i < san ; i++) {
//            n += i;
//        }return n;


//    }
//    public static boolean san (int scan , int ran ){
//            boolean istrue = true;
//            if (scan == ran) {
//                System.out.println(true);
//            } else System.out.println(false);
//            return istrue;
//
//        }
//


        int [] massive = new int[5];
        for (int i = 0; i < massive.length ; i++) {
            int ran = new Random().nextInt(1,99);
            massive[i] = ran;
        }
        int [] sortMassive = Arrays.copyOf(massive,massive.length);
        for (int i = 0; i < sortMassive.length ; i++) {
            for (int j = 0; j < sortMassive.length - 1; j++) {
                if (sortMassive[j] < sortMassive[j + 1]) {
                    int san = sortMassive[j];
                    sortMassive[j] = sortMassive[j + 1];
                    sortMassive[j + 1] = san;
                }
            }
        }
        int [] sortArray2 = Arrays.copyOf(massive,massive.length);
        for (int i = 0; i < sortArray2.length; i++) {
            for (int l = 0; l < sortArray2.length - 1 ; l++) {
                if (sortArray2[l] > sortArray2[l+1]){
                    int num = sortArray2[l];
                    sortArray2[l]=sortArray2[l+1];
                    sortArray2[l+1]=num;
                }
            }

            }
            int max = massive[0];
        int max2 = massive[0];
        int min = massive[0];
        int min2= massive[0];
        int sum = massive [0];
        int arif = massive[0];

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > max) {
                max2 = max;
                max = massive[i];
            } else if (massive[i] > max2 && max != massive[i] ){
                  max2 =massive[i];
                }

        }
        for (int i = 0; i < massive.length ; i++) {
            if (massive[i] < min){
                min2 = min;
                min = massive[i];
            } else if (massive[i]<min2 && massive[i] != min) {
                min2 = massive[i];

            }

        }
        for (int i = 0; i < massive.length; i++) {
            sum+=massive[i];
            arif = sum / massive.length;
        }

        int [] newArr = Arrays.copyOf(massive,massive.length + 2);
        for (int i = 0; i < newArr.length ; i++) {
        }
        newArr [massive.length ] = 500;
        newArr [massive.length + 1] = 53;

        int minus = massive[1];

        for (int i = 0; i < massive.length - 1 ; i++) {
            if ( i != minus);
        }

        System.out.println(Arrays.toString(massive));
        System.out.println(Arrays.toString(sortMassive));
        System.out.println(Arrays.toString(sortArray2));
        System.out.println("Maximum    :   "+ max);
        System.out.println("Maximum2   :   "+ max2);
        System.out.println("Minimum    :   "+ min);
        System.out.println("Minimum2   :   "+ min2);
        System.out.println("Summa      :   "+ sum);
        System.out.println("Arifmertika:   "+ arif);
        System.out.println(Arrays.toString(newArr));
        System.out.println(minus);


//        Scanner scanner = new Scanner(System.in);
//        String num = scanner.nextLine();
//        String teiri = "";
//        for (int i = num.length() -1; i >= 0 ; i--) {
//            teiri = teiri + num.charAt(i);
//        }
//        if (teiri.equalsIgnoreCase(num)){
//            System.out.println("Polindrom ");
//        }else System.out.println("Polindrom emes ");

//        System.out.println(Math.pow(3, 2));
//        System.out.println(Math.sqrt(9));
//        System.out.println(Math.floor(27.9));
//        System.out.println(Math.ceil(24.4));


    }
}
