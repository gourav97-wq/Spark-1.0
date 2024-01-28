package array;

public class reverseArray {
    public static void main(String[] args) {
        int[] ar={12,20,32,34,45};

        for(int a:ar)
        {
            System.out.print(a+" ");
        }

        //reverse of Array
        int k=20;
        int rev=ar.length;
        for (int i = rev-1; i >=0 ; i--) {

            System.out.print(ar[i]+" ");
            if (ar[i]==k)
            {
                System.out.println("k = "+ar[i]);
            }

        }
    }
}
