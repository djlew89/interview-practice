import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // 1) Reverse a String
        String str = "hello";
        String reverse = "";
        int strLength = str.length();
        for (int i = 0; i < strLength; i++) {
            reverse = str.charAt(i) + reverse;
        }
        System.out.println(reverse);

        // 2) Check if Palindrome
        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindome");
        }

        // 3) Number of occurrences of a charcter in a String
        int count = 0;
        char search = 'l';
        for (int i = 0; i < strLength; i++) {
            if (str.charAt(i) == search) {
                count++;
            }
        }
        System.out.println(count);

        // 4) Check if Anagrams
        boolean isAnagram = false;
        if (str.length() != reverse.length()) {
            System.out.println(str + "and " + reverse + "are not anagrams.");
        } else {
            char[] anagram1 = str.toCharArray();
            char[] anagram2 = reverse.toCharArray();

            Arrays.sort(anagram1);
            Arrays.sort(anagram2);

            isAnagram = Arrays.equals(anagram1, anagram2);
        }
        if (isAnagram) {
            System.out.println("Anagrams");
        } else System.out.println("Not Anagrams");

        // 5) Calculate number of vowels and consonants in a String
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < strLength; i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vowels++;
            else consonants++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        // 6) Get matching elements in an integer array
        int[] intArray = {1, 2, 3, 4, 5, 1, 2, 6, 7};

        System.out.println("Matching elements: ");
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) { // NOTE THE NESTED LOOP INTEGER
                if (intArray[i] == intArray[j]) {
                    System.out.println(intArray[i]);
                }
            }
        }

        System.out.println();
        System.out.println("Bubble sort array");
        // 7) Bubble sort array
        int[] a = {1, 2, 7, 6, 4, 12, 9};
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // swap a[j+1] and a[j]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int number : a) {
            System.out.println(number);
        }

        System.out.println();
        System.out.println("Insertion sort array");
        // 8) Insertion sort array
        // Time complexity is O(n^2) where n is equal to the length of the array to be sorted.
        int[] arr = {4, 3, 2, 10, 12, 1, 5, 6};
        int arrLength = arr.length;
        for (int i = 1; i < arrLength; ++i) {
            int key = arr[i];
            int j = i - 1;

            /*Move elements of arr[0..i-1], that are greater than the key,
            to one position ahead of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        for (int number : arr) {
            System.out.println(number);
        }

        System.out.println();
        System.out.println("Reverse array");
        // 9) Reverse an array by swapping first with last, second with second last, etc.
        int[] array = {1, 2, 3, 4, 5};
        int arrayLength = array.length;
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = array[i];
            array[i] = array[arrayLength - i - 1];
            array[arrayLength - i - 1] = t;
        }
        for (k = 0; k < arrayLength; k++) {
            System.out.println(array[k]);
        }

        System.out.println();
        System.out.println("Swap numbers without declaring 3rd variable");
        // 10) Swap two numbers without declaring a 3rd variable.
        int num1 = 10;
        int num2 = 20;

        System.out.println("Num1: " + num1 + " " + "Num2: " + num2);
        num2 = num2 + num1;
        num1 = num2 - num1;
        num2 = num2 - num1;
        System.out.println("Num1 is now: " + num1 + " " + "Num2 is now: " + num2);


        System.out.println();
        System.out.println("Print Fibonacci series using recursion");
        // 11) Static method below
        int number = 10;
        System.out.println(fibonacci(number));

        System.out.println();
        System.out.println("Factorial of an Integer");
        // 12) Static method below
        System.out.println(factorial(15));

        System.out.println();
        System.out.println("Reverse a linked list");
        // 13) Reverse a linked list using the descending iterator method
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int m = 0; m < 10; m++) {
            linkedList.add(m);
        }
        LinkedList<Integer> revLinkedList = new LinkedList<>();
        linkedList.descendingIterator().forEachRemaining(revLinkedList::add); // (::) behaves like a lambda
        System.out.println(revLinkedList);

        System.out.println();
        System.out.println("Implement Binary Search"); // Time complexity is 0(log N)
        // 14) Implement Binary Search

        /* Divide the array in half each iteration until the element is found,
         * ONLY WORKS ON SORTED ARRAYS, if the value of low becomes greater than high at any point
         * it means the element is not in the list */
        int[] newArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91}; // target = 23


    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static long factorial(long n) {
        if (n == 1) return 1;
        return (n * factorial(n - 1));
    }
}