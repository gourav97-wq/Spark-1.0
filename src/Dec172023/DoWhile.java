package Dec172023;

public class DoWhile {
    public static void main(String[] args) {

        //case 1:
        int i=1;
        do
        {
            System.out.println(i);
            i++;
        }
        while(i<=100);

        //case 2:
        int j=4;
        do {
            System.out.println(j);
            j++;
        }
        while(j<3); //here condition is false but loop chal raha hai
    }
}
