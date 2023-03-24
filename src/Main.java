import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int d[] = readArray();
        System.out.println("\nThe smallest missing positive is: " + smallestMissingPositive(d));
    }

    public static int[] readArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = 0;

        if(sc.hasNextInt()){
            n = sc.nextInt();
        }
        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                a[i] = sc.nextInt();
            }
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

        for (int i = 0; i < n; i++) {
            if (A[i] > 0 && A[i] <= n) {
                present[A[i]] = true;
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