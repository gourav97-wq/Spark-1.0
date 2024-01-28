package array;

public class arrayDemo {
    public static void main(String[] args) {
        int[] arr =new int[10];
        // //int[] arr ={10,23,34,45,45,5,6,5,7,6};
        int sum=0;

        for (int i = 0; i <10 ; i++) {

            arr[i]=i;


        }
        //for each loop
        for(int a:arr)
        {
            sum=sum+a;
            System.out.println(a);
        }
        System.out.println( "sum = "+sum);
        System.out.println("length of array = "+arr.length);
    }
}
