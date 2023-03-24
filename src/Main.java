import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] d = readArray();
        System.out.println("\nThe smallest missing positive is: " + smallestMissingPositive(d));
    }

    public static int[] readArray(){
        Scanner sc = new Scanner(System.in);

        int n ;

        while(true){
            System.out.println("Enter the size of the array: ");
            if(sc.hasNextInt()){
                n = sc.nextInt();
                break;
            }else{
                System.out.println("Invalid input, please enter an integer.");
                sc.nextLine(); // clears the buffer
            }
        }

        int[] a = new int[n];

        System.out.println("Enter " + n + " elements for the array: ");

        for (int i = 0; i < n; i++) {
            System.out.println("Element " + (i+1)  + ": ");
            while(!sc.hasNextInt()){
                System.out.println("Invalid input, please enter an integer.");
                sc.nextLine(); // clears the buffer
                System.out.println("Element " + (i+1)  + ": ");
            }
            a[i] = sc.nextInt();
        }

        System.out.println("The elements of the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();

        return a;
    }


    public static int smallestMissingPositive(int[] A) {
        int n = A.length;
        boolean[] present = new boolean[n+1];

        for (int j : A) {
            if (j > 0 && j <= n) {
                present[j] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }

        return n+1;
    }


}