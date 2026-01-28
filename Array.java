import java.util.Scanner;

class Array {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = s.nextInt();

        int numbers[] = new int[size];

        System.out.println("Enter elements of array");
        for (int i = 0; i < size; i++) {
            numbers[i] = s.nextInt();
        }

        System.out.println("Now we traverse the array elements entered:");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

        printSum(numbers); 
    }

    static void printSum(int arr[]) {
        int sum=0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum = arr[i] + arr[i + 1];
            
        }
    System.out.println("Sum: " + sum);
    }
}
