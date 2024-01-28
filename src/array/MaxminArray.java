package array;

public class MaxminArray {
    public static void main(String[] args) {
        int[] ar={12,20,32,34,45};

        for(int a:ar)
        {
            System.out.print(a+" ");
        }

        //max in array
        int max=0, min=ar[0];
        for(int b:ar)
        {

            if (max <b) {
                max=b;
            }
        }
        for (int c:ar)
        {
            if (min>c)
            {
                min=c;
            }
        }
        System.out.println("");
        System.out.println(min);
        System.out.println(max);
    }
}
