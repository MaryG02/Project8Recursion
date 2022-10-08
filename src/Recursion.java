import java.util.Scanner;
public class Recursion {
    // 1.1 Recursively count down from the given number
    public static void printNumbers(int i) {
        if(i <= 0)
            return;
        System.out.print(i + " ");
        printNumbers(i - 1);
    }
    // 1.2 Recursively count up to the given number
    public static void printNumbersUp(int i) {
        if (i <= 0)
            return;
        printNumbersUp(i - 1);
        System.out.print(i + " ");
    }
    // 1.3
    public static void SayHi(){
        System.out.println("Hi");
         SayHi();
    }
    //2.2
    public static int arraySum(int[] array) {
        return arraySumRec(array, array.length - 1);
    }
    public static int arraySumRec(int[] array, int index) {
        if (index < 0)
            return 0;
        return (arraySumRec(array, index - 1) + array[index]);
    }
    //2.1
    public static void printArray(int[] array, int i){
        if (i<0)
            return;
        System.out.println(array[i]);
        printArray(array, i-1);
    }
    //2.3
public static int findCountInArray(int[] array, int a, int i){
        int count = 0;
        if (a<=0)
            return 0;
        if (array[a] == i)
            count++;
        return (count+ findCountInArray(array, a-1, i));

}
    public static void main(String[] args) {
        printNumbers(9);
        System.out.println();
        printNumbersUp(9);
        System.out.println();
        // SayHi();   // to view StackOverFlow error
        int[] array = {1, 2, 3, 3, 5};
        printArray(array, array.length-1);
        int arraySum = arraySum(array);
        System.out.println("Sum of array: " + arraySum);
        System.out.println("Enter the number you want to find");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        System.out.println("There are " +findCountInArray(array, array.length-1, i )+ " equal elements");
    }

}
