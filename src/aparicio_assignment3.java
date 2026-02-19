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
        System.out.println("====Exchange Sort Algorithm====");
        exchangeSort(arr);
        for (int n = 0; n < arr.length; n++){
            System.out.print(arr [n] + "\t");
        }
        System.out.println();

        // Binary Search
        binarySearch(arr);
        sc.close();
    }

    private static void exchangeSort(int[] arr){
        for (int l = 0; l < arr.length - 1; l++){

            for (int m = l + 1; m < arr.length; m++){
                if (arr[l] > arr[m]){
                    int temp = arr[l];
                    arr[l] = arr[m];
                    arr[m] = temp;
                }
            }

            for (int k = 0; k < arr.length; k++){
                System.out.print(arr [k] + "\t");
            }
            System.out.println();
        }
    }

    private static void binarySearch(int[] arr){
        Scanner sc2 = new Scanner(System.in);

        System.out.println("\nEnter the element to search for:");
        int target = sc2.nextInt();
        int low = 0;
        int high = arr.length - 1;
        int mid;

        for (int o = 0; o < arr.length; o++){
            mid = (low + high) / 2;
            if (target == arr[mid]){
                System.out.println("Search Found!!");
                break;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    }
}

