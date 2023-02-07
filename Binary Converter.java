import java.util.Scanner;

//your code goes here
public class Converter{
    public static String toBinary(int x){
        String bin = "";
        while (x > 0){
            bin = (x%2)+bin;
            x /=2;
        }
        return bin;
    }
}

public class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
    }
}