import java.io.FilterOutputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {


        // Математичесукие операторы

        //1
//        Scanner scanner  = new Scanner(System.in);
//        System.out.println(" Биография толтуруу ");
//        String name = scanner.nextLine();
//        String name2 = scanner.nextLine();
//        int age = scanner.nextInt();
//        int stag = scanner.nextInt();
//
//        System.out.println("Атыныз : " + name);
//        System.out.println("Фамиляныз : " + name2);
//        System.out.println("Жашыныз : " + age);
//        System.out.println("Стажыныз :"+ stag);

        //2
//
//        double a = 3.42;
//        double b = (int) a;
//        double c = a-b;
//        System.out.printf("%.2f " ,c);

        //3

//        Random random =new Random();
//        int a  = random.nextInt(1,10);
//        System.out.println(a);
//        int b  = random.nextInt(1,10);
//        System.out.println(b);
//        int c  = random.nextInt(1,10);
//        System.out.println(c);
//
//        double result = a + b + c;
//        double result2 = result / 3;
//        System.out.println("Summa :"+result);
//        System.out.println("Arifmetika :"+result2);


        // Условные операторы

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число :");
//        int scan = scanner.nextInt();
//        if (scan>0){
//            System.out.println("Positive ");
//        }else System.out.println("Negative ");
//        System.out.println();

//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        if(a > b && a > c){
//            System.out.println(a);
//        } else if (b > a && b> c) {
//            System.out.println(b);
//
//        }else System.out.println(c);

//        System.out.print("first number ");
//        int a = new Scanner(System.in).nextInt();
//        System.out.print("+ - * /  :");
//        String a2 = new Scanner(System.in).next();
//        System.out.print("second number");
//        int b = new Scanner(System.in).nextInt();
//
//        switch (a2){
//            case "+" : System.out.println(a + b);
//            break;
//            case "-" : System.out.println(a - b);
//            break;
//            case "*" : System.out.println(a * b);break;
//            case "/" : System.out.println((float) a /(float) b);
//            break;
//            default:
//        }


//        Scanner scanner =new Scanner(System.in);
//        System.out.println("Sandy jaz ");
//        int scam = scanner.nextInt();
//        if (scam>50){
//            System.out.println("Ottunuz");
//        }else System.out.println("Kaldyn ");


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Summany jaz :");
//        int som = new Scanner(System.in).nextInt();
//        System.out.println("Валютаны танда RUB,DOLLAR,EURO,LIRA");
//        String val = new Scanner(System.in).nextLine();
//
//        switch (val.toUpperCase()){
//            case "EURO":
//                System.out.println("EURO :"+som * 0.011);
//
//            case "RUB":
//                System.out.println("RUB :" + som * 1.05);
//
//            case "DOLLAR":
//                System.out.println("DOLLAR :" + som * 0.015);
//
//            case "LIRA" :
//                System.out.println("LIRA :" + som * 0.32);
//
//            default:
//        }


//        System.out.println("Sandy jaz :");
//        int number = new Scanner(System.in).nextInt();
//        for (int i = 0; i < number ; i++) {
//            System.out.println(i);
//        }
//
//        System.out.println("Sandy jaz :");
//        int number2 = new Scanner(System.in).nextInt();
//        for (int i = number2; i >= 1 ; i--) {
//            System.out.println(i);
//        }

//        int num = 10;
//        for (int i = 0; i < num ; i++) {
//            System.out.println(i);
//            }  for (int j = num; j >= 1; j--) {
//                System.out.println(j);
//        }


//        for (int i = 0;i<5;i++){
//            for (int j =0 ; j<=i;j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
////        };
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("First number :");
//        int a = scanner.nextInt();
//        System.out.println("Second number :");
//        int b = scanner.nextInt();
//
//        for (int i = a; i <= b ; i++){
//            System.out.println(i);
//        }
//
//
//        while (a <= b){
//            System.out.println(a);
//            a++;
//        }


//        int a = new Scanner(System.in).nextInt();
//        for (int i = 0; i < 10 ; i++) {
//            int result = (a * i);
//            System.out.printf("\n%d * %d = %d",a,i,result);
//        }


//        int sum = 0;
//        for (int i = 0; true; i++) {
//            int num = new Scanner(System.in).nextInt();
//            sum += num;
//            int sum2 = sum + num;
//            if (num == 0) {
//                System.out.println("Coliv " + i);
//                System.out.println("Summa " + sum2);
//                System.out.println("Arifmetika " + sum2 / i);
//            }


//        int s = 0;
//        int i;
//        int[] a = new int[10];
//        for ( i = 0; i < a.length; i++) {
//            a[i] = new Random().nextInt(1, 10);
//            s+=a[i];
//            System.out.print(a[i] + "  ");
//        }
//        System.out.println("\n Summa : " + s);
//        System.out.println("Arifmetika :" + s / i );


//        System.out.println("San beriniz ");
//        int a = new Scanner(System.in).nextInt();
//        int [] massiv = new int[a];
//
//        int counter = 0;
//        for (int i = 0; i < massiv.length; i++) {
//            massiv[i] = new Random().nextInt(1,10);
//            counter+=massiv[i];
//
//            System.out.print(massiv[i] + " ");
//
//        }
//        System.out.println("\nSumma :" + counter);


//        int res = 1000;
//        int[] massive = new int[10];
//        int number = new Scanner(System.in).nextInt();
//
//        for (int i = 0; i < massive.length; i++) {
//            massive[i] = new Random().nextInt(1, 10);
//            System.out.print(massive[i] + " ");
//
//
//        }
//        for (int i = 0; i < massive.length; i++) {
//            if (number == massive[i]) {
//               res = i;
//            }
//
//        }
//        if (res != 1000 ){
//            System.out.println("\n INDEX :" + res);
//        }else System.out.println("\n MYNDAI MASSIV JOK ");


//        System.out.print("First san  : ");
//        int first = new  Scanner(System.in).nextInt();
//        System.out.print("Komanda tap + - * / ^  :");
//        String command = new  Scanner(System.in).nextLine();
//        System.out.print("Second san   :");
//        int second = new Scanner(System.in).nextInt();
//
//
//        switch (command){
//            case "+" :
//                System.out.printf("%d + %d = %d " , first,second,(first+second));
//                break;
//            case "-" :
//                System.out.printf("%d - %d = %d " ,first,second,(first-second));
//                break;
//            case "*" :
//                System.out.printf("%d * %d = %d" ,first,second,(first*second));
//                break;
//            case "/" :
//                System.out.printf("%d / %d = %d" ,first,second,(first/second));
//                break;
//            default:
//        }


//        String login = "aliaskar03";
//        String password = "ali";
//
//        System.out.print("Write your login :");
//        String log = new    Scanner(System.in).nextLine();
//        System.out.print("Write your password : ");
//        String pas = new Scanner(System.in).nextLine();
//
//        if (login.equals(log) && password.equals(pas) ){
//            System.out.println("Welcome to learn !");
//        } else if ((!login.equals(log) && password.equals(pas))) {
//            System.out.println("Login error !");
//        } else if (login.equals(log) && !(password.equals(pas))) {
//            System.out.println("Password error");
//        }else System.out.println("ERROR!!!!!!!!!!!");

//
//        System.out.println("San jaz ");
//        int san = new  Scanner(System.in).nextInt();
//        int num = new  Random().nextInt(1,3);
//        System.out.println(num);
//
//        if (num == 1){
//            System.out.println("Kamen ");
//            if (num<san){
//                System.out.println("Proigrali :");
//            }if (num>san){
//                System.out.println("Vyigrali ");
//            }if (num == san){
//                System.out.println("Nichia ");
//            }
//        }


            //////////////////////////////////////////??????????????????
//        do {
//            System.out.println("First number :");
//            int san = new Scanner(System.in).nextInt();
//            System.out.println("Second number :");
//            int san2 = new Scanner(System.in).nextInt();
//            int result = san + san2;
//
//        }while ()


//        while(true){
//
//        System.out.println(" Sandy jaz : ");
//        int san = new Scanner(System.in).nextInt();
//        int san2 = new Random().nextInt(1, 10);
//        System.out.println("Random san :" + san2);
//        int sum ;
//
//
//            if (san == san2){
//                System.out.println("Tokto :");
//                break;
//
//            } else if (san>san2) {
//                System.out.println("Oto jogoru san :");
//
//            }else System.out.println("Oto tomon san :");
//        }


//        while (true){
//            System.out.println("\n Sandy jaz :");
//            int san = new Scanner(System.in).nextInt();
//
//            for (int i = 0; i < 10 ; i++) {
//                int result = san * i;
//                System.out.printf(" \n%d * %d = %d ",san,i,result);
//            }
//
//        }


//        System.out.print("Sandar  : ");
//        for (int i = 1; i < 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.print( i + " ");
//            }
//        }


//        int num = new Scanner(System.in).nextInt();
////        int num2 = new  Scanner(System.in).nextInt();
////
////        for (int i = num; i <= num2; i++) {
////            System.out.println(i);
////        }
////        for (int j = num2; j >= num ; j--) {
////                System.out.println(j);
////        }


//        int num = 10;
//        for (int i = 1; i < num ; i++) {
//            for (int j = 1; j <num ; j++) {
//                int result = i * j;
//                System.out.printf("%6d" ,result);
//            }
//            System.out.println();
//        }


//        int num = 10;
//        int a = 0;
//        while (a < 10){
//            int res = num * a;
//            System.out.printf("%d * %d = %d",num,a,res);
//            a++;
//        }


//        for (int i = 0; i < 100; i+=7) {
//            if (i % 2 == 0){
//                System.out.print(i + " ");
//            }
//        }


//        int [] massive = {1,2,3,4,5,6,7,8,9,10};
//        for (int i = 1; i < massive.length; i++) {
//            System.out.println(">>>>>>>>>>>>>>>");
//            for (int j = 1; j < massive.length ; j++) {
//                int result = i * j;
//                System.out.printf("\n%d * %d = %d ",i,j,result);
//            }
//
//        }


//        int sak = 0;
//        int count = 0;
//        int count1 = 0;
//        int[] sum = new int[15];
//        for (int i = 0; i < sum.length; i++) {
//            sum[i] = new Random().nextInt(1, 10);
//            System.out.print(sum[i] + " ");
//        }
//        System.out.print("\nChetnyi :" );
//        for (int j = 0; j < sum.length; j++) {
//            sak = sum[j];
//            if (sum[j] % 2 == 0) {
//                count++;
//                System.out.print(" " + sak);
//            }
//            if (sum[j] % 2 != 0){
//                count1++;
//            }
//
//        }
//
//        System.out.print("\nColichestvo : " + count);
//        System.out.println("\n Colichestvo not :" +count1);


//        System.out.println("Sandy jaz ");
//        int random = new Random().nextInt(1,10);
//        int [] ran = new int[random];
//
//        for (int i = 0; i < ran.length; i++) {
//            ran[i] = new Scanner(System.in).nextInt();
//
//            if (ran[i] == ran[ran.length - 2]){
//                System.out.println("Element jok ");
//            }
//        }


//        String [] soz = {"Naryn","Chui","Jalal Abad ", "Chui"};
//        String scaner = new Scanner(System.in).nextLine();
//
//        boolean isTrue=false;
//        for (int i = 0; i < soz.length ; i++) {
//
//            if (scaner.equals(soz[i])) {
//                System.out.println("Kaitalandy ");
//                isTrue=true;
//            }
//        }if (!isTrue){
//            System.out.println("error");
//        }


//        int [] massiv = new int[100];
//        int [] massiv1 = new int[100];
//
//
//        for (int i = 0; i < massiv.length ; i++) {
//            massiv[i]=i;
//            if (massiv[i] % 2 != 0){
//                System.out.print(massiv[i]+ " ");
//            }
//        }
//        System.out.println();
//        for (int i = massiv.length -1 ; i >= 0 ; i--) {
//            massiv[i] = i;
//            if (massiv[i] % 2 != 0) {
//                System.out.print(massiv[i] + " ");
//        }
//
//        }


//        int [] massive = {100,20,30,80,50,60};
//        int max =massive[0];
//        int secondmax = massive [0];
//
//        for (int i = 0; i < massive.length; i++) {
//
//            if (massive[i]>max) {
//                secondmax=max;
//                max = massive[i];
//
//            } else if (massive[i] > secondmax && massive[i] != max) {
//                secondmax=massive[i];
//            }
//        }
//        System.out.println(Arrays.toString(massive));
//        System.out.println("Maximim :" + max);
//        System.out.println("Maximum 2 : " + secondmax);


//        int[] massive = {2000,20,30,8000,5000,60};
//        int max = massive[0];
//        int secondMax = massive[0];
//
//        for (int i = 0; i < massive.length; i++) {
//            if (massive[i] > max) {
//                secondMax = max;
//                max = massive[i];
//            } else if (massive[i] > secondMax && massive[i] != max) {
//                secondMax = massive[i];
//            }
//        }
//
//        System.out.println(Arrays.toString(massive));
//        System.out.println("Maximum: " + max);
//        System.out.println("Second Maximum: " + secondMax);

//             Сортировка

//        int [] massive = {12,11,45,34,19};
//        for (int i = 0; i < massive.length ; i++) {
//            for (int j = 0; j < massive.length -1 ; j++) {
//                if (massive[j] < massive[j+1]){
//                    int san = massive[j+1];
//                    massive[j+1]=massive[j];
//                    massive[j]=san;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(massive));


//        int[] num = new int[5];
//        int[] num2 = new int[5];
//
//        int sum = 0;
//        int sum2 = 0;
//
//        for (int i = 0; i < num.length; i++) {
//            num[i] = new Random().nextInt(1, 10);
//            num2[i] = new Random().nextInt(1, 10);
//
//        }
//        for (int i = 0; i < 5; i++) {
//            sum += num[i];
//            sum2 += num2[i];
//
//        }
//        int res = sum / num.length;
//        int res2 = sum2 / num2.length;
//
//        System.out.println(Arrays.toString(num));
//        System.out.println(Arrays.toString(num2));
//        System.out.println("Summa 1 :" + sum);
//        System.out.println("Summa 2 :" + sum2);
//        System.out.println("Arifmetika :" + sum / num.length);
//        System.out.println("Arifmetika 2:" + sum2 / num.length);
//
//        if (res != res2) {
//            System.out.println("Bashka ");
//        } else {
//            System.out.println("Barabar ");
//        }


//
//                int[] num = new int[5];
//                int[] num2 = new int[5];
//
//                int sum = 0;
//                int sum2 = 0;
//
//                for (int i = 0; i < num.length; i++) {
//                    num[i] = new Random().nextInt(1, 10);
//                    num2[i] = new Random().nextInt(1, 10);
//                }
//
//                for (int i = 0; i < 5; i++) {
//                    sum += num[i];
//                    sum2 += num2[i];
//                }
//
//                int res = sum / num.length;
//                int res2 = sum2 / num2.length;
//
//                System.out.println(Arrays.toString(num));
//                System.out.println(Arrays.toString(num2));
//                System.out.println("Summa 1: " + sum);
//                System.out.println("Summa 2: " + sum2);
//                System.out.println("Arifmetika 1: " + res);
//                System.out.println("Arifmetika 2: " + res2);
//
//                if (res != res2) {
//                    System.out.println("Bashka");
//                } else {
//                    System.out.println("Barabar");
//                }


//        int [] massive  =new int[10];
//        for (int i = 0; i < massive.length ; i++) {
//            massive[i]=new Random().nextInt(1,99);
//
//        }
//
//        for (int i = 0; i < massive.length ; i++) {
//            for (int j = 0; j < massive.length -1 ; j++) {
//
//                if (massive[j]>massive[j+1]){
//                    int san = massive[j];
//                    massive[j]=massive[j+1];
//                    massive[j+1]=san;
//                }
//
//            }
//
//        }
//        System.out.println(Arrays.toString(massive));


//        int[] massive = new int[10];
//        for (int i = 0; i < massive.length ; i++) {
//            massive[i]=new Random().nextInt(1,100);
//        }
//        double max = massive[0];
//        double min = massive[0];
//        double arifmetika = massive[0];
//
//
//
//        for (int i = 0; i < massive.length; i++) {
//
//            if (massive[i] > max) {
//                max = massive[i];
//            }
//
//                if (min > massive[i]) {
//                    min = massive[i];
//                }
//                arifmetika+=massive[i]/massive.length;
//        }
//        System.out.println(Arrays.toString(massive));
//        System.out.println("MAXIMUM   : " + max);
//        System.out.println("MINIMUM   : " + min);
//        System.out.println("ARIFMETIKA   : " + arifmetika);


//
//        int [] massive =new int[10];
//
//        for (int i = 0; i < massive.length ; i++) {
//            massive[i]  = new Scanner(System.in).nextInt();
//        }
//
//        int max = massive[0];
//
//        for (int i = 0; i < massive.length ; i++) {
//            if (massive[i] > max){
//                max = massive[i];
//            }
//        }
//        System.out.println(Arrays.toString(massive));
//        System.out.println(" Maximum  : " + max);


//        int [] massive = new int[15];
//        for (int i = 0; i < massive.length ; i++) {
//            massive[i]  = new Random().nextInt(1,99);
//        }
//
//        int minimum = massive[0];
//
//        for (int k = 0; k < massive.length ; k++) {
//            if (massive[k] < minimum ){
//                 minimum = massive[k];
//            }
//        }
//        System.out.println(Arrays.toString(massive));
//        System.out.println("Minimum     : " + minimum);


//        int [] massive = new int[20];
//        for (int i = 0; i < massive.length ; i++) {
//            massive[i] = new Random().nextInt(1,500);
//        }
//
//        for (int i = 0; i < massive.length ; i++) {
//            for (int j = 0; j < massive.length - 1 ; j++) {
//
//                if (massive[j] > massive[j + 1]) {
//                    int san = massive[j];
//                    massive[j] = massive[j + 1];
//                    massive[j + 1] = san;
//                }
//            }
//
//        }   System.out.println(Arrays.toString(massive));


//        int [] randon = new int[10];
//        for (int i = 0; i < randon.length; i++) {
//            randon[i] = new Random().nextInt(1,60);
//        }
//        int sum = 0;
//        int arif = 0;
//        for (int  l = 0;  l < randon.length ;  l++) {
//            sum+=randon[l];
//
//            arif = sum / randon.length;
//        }
//        System.out.println(Arrays.toString(randon));
//        System.out.println("Summa   :" + sum);
//        System.out.println("Arifmetika   :" + arif);


//        System.out.println("Razmerdi  ber :  ");
//        int [] massive = new int[new Scanner(System.in).nextInt()];
//        for (int i = 0; i < massive.length ; i++) {
//            massive[i] = new Random().nextInt(1,99);
//        }
//        int sum  = 0 ;
//        for (int i = 0; i < massive.length ; i++) {
//            sum+=massive[i];
//
//        }
//        System.out.println(Arrays.toString(massive));
//        System.out.println("Summa   : " + sum);


//        int scanner = new Scanner(System.in).nextInt();
//        int scaner2 = new Scanner(System.in).nextInt();
//
//        for (int i = scanner; i > 0 ; i--) {
//            if (scanner<scaner2) {
//                System.out.println(i);
//            }
//        }

//
//        int scaner = new Scanner(System.in).nextInt();
//        int scaner2 = new Scanner(System.in).nextInt();
//
//        for (int i = 0; i < scaner ; i++) {
//            f
//        }








        }
    }











