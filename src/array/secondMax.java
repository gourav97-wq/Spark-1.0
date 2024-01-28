package array;

import java.util.Scanner;

public class secondMax {
        public static void main(String[] args) {
        Scanner sd=new Scanner(System.in);

        System.out.println("Enter the size of array......");
        int size=sd.nextInt();
        int[] arr=new int[size];

        System.out.println("Enter the array elements.......");
        for (int i = 0; i <size ; i++) {

            arr[i]=sd.nextInt();

        }

        for (int i =0 ; i < size ; i++) {
            for (int j = i+1; j <size ; j++) {

                if (arr[i]>arr[j]) {
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
                System.out.println("");
            }
            for (int a:arr)
            {
                System.out.print(" "+a+" ");
            }
            System.out.println(" Second largest = "+(arr.length-1));
            System.out.println("second smallest = "+(arr[1]));
        }

    }
}
