import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int a = sc.nextInt();
        for(int i=1; i<11; i++){
            System.out.printf("%d * %d = %d ",a,i,a*i);
            System.out.println();
        }

    }
}
