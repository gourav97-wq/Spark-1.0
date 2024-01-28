package string;

public class stringDemo {
    public static void main(String[] args) {
     /*
        String s1="hello";
        String s2=new String("hello");
        System.out.println(s1==s2);
        //there is two obj created one in scp by literal
        // and one in heap and also in scp but scp points to same obj by literal

      */
        /*
        String s1="hello";
        String s2="hello";
        String s3=s1+s2;
        //here two obj in scp create one obj of s1 and s2
        //and one object s3="hellohello" as s3 is different string

         */

        String s="gourav panwar";
        int a=s.length();
        System.out.println(a);
    }
}
