import java.util.Scanner;

public class aparicio_assignment3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Type array size:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int element = 1; // for loop use. See below
        for (int j = 0; j < size; j++){
            System.out.println("Enter array element #" + element + ":");
            element++;
            arr [j] = sc.nextInt();
        }
        // Before sort
        System.out.println("---Before sorting in ascending order---");
        for (int i = 0; i < size; i++){ // Prints out contents of array
            System.out.print(arr [i] + "\t");
        }
        // After sorting
        System.out.println("\n---After sorting in ascending order---");
        for (int k = 0; k < size; k++){
            System.out.print(arr [k] + "\t");
        }
    }
}

