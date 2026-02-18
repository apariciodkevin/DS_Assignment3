import java.util.Scanner;

public class aparicio_assignment3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Type array size:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++){ // Prints out contents of array
            System.out.print(arr [i] + "\t");
        }
    }
}
