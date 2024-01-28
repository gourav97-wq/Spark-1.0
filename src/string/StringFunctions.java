package string;

import java.util.Arrays;

public class StringFunctions {
    public static void main(String[] args) {
        //length
        String s="gourav panwar        ";
        System.out.println(s.length());//space also  counts

        //concatention
        String s1="siya";
        String s2="ram";
        String s3=s1+s2;
        System.out.println(s3);

        //tocharArray
        String s4="radhey";
        char arr[]=s4.toCharArray();
        System.out.println(Arrays.toString(arr));

        //charAt()
        String s5="tinku";
        System.out.println(s5.charAt(1));

        //compareTo
        String s6="hello";
        String s7="hy";
        int res =s6.compareTo(s7);
        System.out.println(res);

        // equals
        System.out.println(s6.equals(s7));

//        //contains()
        String s8="hello welcome to myworld";
//        System.out.println(s8.contains("myworld));
//        System.out.println(s8.contains("beep"));

        //indexOf()
        System.out.println(s8.indexOf('o'));

        //replace()
        String ss="hello world";
        String rep=ss.replace("hello","gourav");
        System.out.println(rep);

        //subString()
        String r1="hello welcome to myworld";
        String r2=r1.substring(0,8);
        String r3=r1.substring(4);
        System.out.println(r2);

    }
}
