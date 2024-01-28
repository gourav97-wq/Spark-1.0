package array;

public class ArraySum {
    public static void main(String[] args) {
        //int ar[]=new int[5];
        int[] ar ={1,2,3,4,5};

        int sum=0;
        for (int i = 0; i <ar.length ; i++) {
            System.out.println(ar[i]);
            sum=sum+ar[i];
            System.out.println("sum = "+sum);
        }
        }
    }

