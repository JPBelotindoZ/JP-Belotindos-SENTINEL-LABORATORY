import java.util.Scanner;

public class Sentinel2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int amount;
        int total = 0;
        int count = 0;


        System.out.print("Enter an Amount (0 to stop): ");
        amount = input.nextInt();

        while(amount!=0){

            total += amount;
            count++;

            System.out.print("Enter a Amount (0 to stop): ");
            amount = input.nextInt();
        }

        System.out.println("Total amount spent = " + "PHP " + total);
        System.out.println("Number of items = " + count);

        input.close();
    }
}