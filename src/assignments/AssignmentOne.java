package assignments;

public class AssignmentOne {

    public static void main(String[] args) {
        System.out.println(factorialValue(4));
    }
    /**
     * 1. Write a function that takes a value n returns the sum of numbers 1 to n
     */
    public static int sumOfNumbers(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    //INSTRUCTOR CODE
    // public static int sum(int[] numbers) {
    //    int sum=0;
    //    for (int i = 0; i < numbers.length; i++) {
    //        sum=sum+numbers[i];
    //    }
    //    return sum;
    //}

     /** 2. Write a function that computes the factorial value
     * Definition: n! = n*(n-1)! , where 0! = 1
     * 1! = 1
     * 2! = 2 * 1! = 2 * 1
     * 3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
     * 4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
     * Hint: use the recursive method that was used to calculate Fibonnaci number
     */
    public static int factorialValue(int n){
        int value = 1;
        if(n == 1){
            return 1;
        } else if(n == 2){
            return 2;
        }
        for(int i = 1; i <= n; i++){
            value = value * i;
        }
        return value;
    }

    //INSTRUCTOR CODE
    // public static int factorial(int n) {
    //    if (n == 0) {
    //        return 1;
    //    }
    //    else if (n == 1) {
    //        return 1;
    //    }
    //    return factorial(n-1) * n;
    //}
     /**3. Write 3 functions that take an array as a parameter and return the minimum,
     * average, and maximum values of that array.
     * Hint: this should be static functions with a return type of the same data type as the array
     * declaration.
     */

    public static int minValue(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            while (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxValue(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = arr[i];
            while (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int avgValue(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum/arr.length;
    }

    //INSTRUCTOR CODE
    // public static int findMax(int[] arr) {
    //    int max = arr[0];
    //    for (i = 0; i < arr.length; i++) {
    //        if (arr[i] > max) {
    //            max = arr[i];
    //        }
    //    }
    //    return max;
    //}
    //
    //public static int findMin(int[] arr) {
    //    int min = arr[0];
    //    for (i = 0; i < arr.length; i++) {
    //        if (arr[i] < min) {
    //            min = arr[i];
    //        }
    //    }
    //    return min;
    //}
    //
    //public static int findAvg(int[] arr) {
    //    int sum = 0;
    //    for (i = 0; i < arr.length; i++) {
    //        sum = sum + arr[i];
    //    }
    //    return sum / arr.length;
    //}




}
