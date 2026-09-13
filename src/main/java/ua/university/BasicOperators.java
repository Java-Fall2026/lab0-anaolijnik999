package ua.university;

/**
 * BasicOperators class contains a set of static methods
 * for practicing Java operators, loops, arrays, and branching.
 */
public class BasicOperators {

    /**
     * Returns the sum and average of three integers.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return double array where [0] is the sum and [1] is the average
     */
    public static double[] sumAndAverage(int a, int b, int c) {
        double s = a + b + c;
        double avg = s/3.0;

        double[] res= {s, avg};

        return res;
    }

    /**
     * Returns the maximum of three integers.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return the largest of the three values
     */
    public static int maxOfThree(int a, int b, int c) {
        int max = c;
        if (a > max) {
            max = a;
        }
        
        if (b > max) {
            max = b;
        }

        return max;
    }

    /**
     * Returns the corresponding grade letter for a given numeric score.
     * <p>
     * The grading scale is as follows:
     * <ul>
     *     <li>90-100: 'A'</li>
     *     <li>80-89:  'B'</li>
     *     <li>70-79:  'C'</li>
     *     <li>60-69:  'D'</li>
     *     <li>50-59:  'E'</li>
     *     <li>0-49:   'F'</li>
     * </ul>
     *
     * @param score the numeric score, expected to be between 0 and 100 inclusive
     * @return the grade letter corresponding to the given score
     * @throws IllegalArgumentException if {@code score} is less than 0 or greater than 100
     */
    public static char gradeFromScore(int score) {

        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("score = between 0 and 100");
        }

        if (score >= 90) {
            return 'A';
        } 
        else if (score >= 80) {
            return 'B';
        } 
        else if (score >= 70) {
            return 'C';
        } 
        else if (score >= 60) {
            return 'D';
        } 
        else if (score >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }

    /**
     * Returns the English name of the day of the week for a number 1-7,
     * where 1 is Monday and 7 is Sunday.
     * <p>
     * Returned values are exactly:
     * {@code "Monday"}, {@code "Tuesday"}, {@code "Wednesday"},
     * {@code "Thursday"}, {@code "Friday"}, {@code "Saturday"}, {@code "Sunday"}.
     *
     * @param day the day number, from 1 (Monday) to 7 (Sunday)
     * @return the English name of the day
     * @throws IllegalArgumentException if {@code day} is less than 1 or greater than 7
     */
    public static String dayOfWeek(int day) {
        if (day < 1 || day > 7) {
            throw new IllegalArgumentException("day = between 1 and 7");
        }

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return days[day - 1];
    }

    /**
     * Returns an array counting down from n to 1.
     *
     * @param n the starting value
     * @return an array holding n, n-1, ..., 1; an empty array if {@code n} is 0
     * @throws IllegalArgumentException if {@code n} is negative
     */
    public static int[] countdown(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n = non-negative");
        } 

        if (n == 0) {
            return new int[0];
        }
        
        int[] res = new int[n];

        for (int i = 1; i <= n; i++) {
            res[i - 1] = n - i + 1;
        }


        return res;
    }

    /**
     * Returns the factorial of n.
     *
     * @param n the number whose factorial is calculated
     * @return the factorial of {@code n}; 1 when {@code n} is 0
     * @throws IllegalArgumentException if {@code n} is negative
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n = non-negative");
        }

        if (n == 0) {
            return 1;
        }

        long res = 1;

        for (int i = 1; i <= n; i++) {
            res *= i;
        }

        return res;
    }

    /**
     * Returns a reversed copy of the array.
     *
     * @param arr the array to reverse; must not be null
     * @return a new array holding the elements in reverse order;
     *         the argument is left unchanged
     * @throws IllegalArgumentException if {@code arr} is null
     */
    public static int[] reverseArray(int[] arr) {

        if (arr == null) {
            throw new IllegalArgumentException("arr = non-null");
        }

        int[] res = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            res[i] = arr[arr.length - 1 - i];
        }

        return res;
    }

    /**
     * Returns the sum of all elements in a 2D array (matrix).
     *
     * @param matrix the matrix to sum; must not be null
     * @return the sum of every element; 0 for a matrix with no elements
     * @throws IllegalArgumentException if {@code matrix} is null
     */
    public static int sumMatrix(int[][] matrix) {

        if (matrix == null) {
            throw new IllegalArgumentException("matrix = non-null");
        }

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    /**
     * Checks if a string is a palindrome.
     * <p>
     * Comparison is case-sensitive and takes every character into account,
     * including spaces and punctuation.
     *
     * @param s the string to check; must not be null
     * @return {@code true} if {@code s} reads the same forwards and backwards
     * @throws IllegalArgumentException if {@code s} is null
     */
    public static boolean isPalindrome(String s) {

        if (s == null) {
            throw new IllegalArgumentException("s = non-null");
        }

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns the minimum and maximum of an array.
     *
     * @param arr the array to scan; must not be null or empty
     * @return double-element array where [0] is the minimum and [1] is the maximum
     * @throws IllegalArgumentException if {@code arr} is null or empty
     */
    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("arr = non-null and non-empty");
        }

        int res[] = {0, 0};

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        res[0] = min;
        res[1] = max;
        return res;
    }

    /**
     * Returns an n x n multiplication table.
     * <p>
     * The element at row i and column j holds the product (i + 1) * (j + 1).
     *
     * @param n the size of the table
     * @return a matrix of n rows by n columns
     * @throws IllegalArgumentException if {@code n} is less than 1
     */
    public static int[][] multiplicationTable(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("n = positive");
        }

        int[][] res = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = (i + 1) * (j + 1);
            }
        }

        return res;
    }

    /**
     * Returns all even numbers from 2 up to and including n.
     *
     * @param n the upper bound, inclusive
     * @return an array of even numbers in ascending order;
     *         an empty array if {@code n} is less than 2
     */
    public static int[] evenNumbersUpToN(int n) {
        if (n < 2) {
            return new int[0];
        }

        int[] res = new int[n / 2];

        for (int i = 1; i <= n / 2; i++) {
            res[i - 1] = i * 2;
        }


        return res;
    }

    /**
     * Checks if a number is prime.
     *
     * @param n the number to check
     * @return {@code true} if {@code n} is prime;
     *         {@code false} for any {@code n} less than 2
     */
    public static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Counts vowels in a string.
     * <p>
     * Only the Latin vowels a, e, i, o, u are counted, in both lower
     * and upper case. The letter y is not counted.
     *
     * @param s the string to scan; must not be null
     * @return the number of vowels found
     * @throws IllegalArgumentException if {@code s} is null
     */
    public static int countVowels(String s) {

        if (s == null) {
            throw new IllegalArgumentException("s = non-null");
        }

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns the first n Fibonacci numbers, starting with 0 and 1.
     *
     * @param n how many numbers to return
     * @return an array holding 0, 1, 1, 2, 3, ... of length {@code n};
     *         an empty array if {@code n} is 0
     * @throws IllegalArgumentException if {@code n} is negative
     */
    public static int[] fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n = non-negative");
        }

        if (n == 0) {
            return new int[0];
        }

        int[] res = new int[n];

        res[0] = 0;
        if (n > 1) {
            res[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res;
    }

    /**
     * Returns the transpose of a 2D array (matrix).
     *
     * @param matrix a rectangular matrix; must not be null
     * @return a new matrix where rows and columns are swapped;
     *         the argument is left unchanged
     * @throws IllegalArgumentException if {@code matrix} is null
     */
    public static int[][] transpose(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("matrix = non-null");
        }

        int[][] res = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }

    /**
     * Returns a sorted copy of the array in ascending order.
     *
     * @param arr the array to sort; must not be null
     * @return a new array holding the elements in ascending order;
     *         the argument is left unchanged
     * @throws IllegalArgumentException if {@code arr} is null
     */
    public static int[] sortArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("arr = non-null");
        }

        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }

        for (int i = 0; i < res.length - 1; i++) {
            for (int j = 0; j < res.length - 1 - i; j++) {
                if (res[j] > res[j + 1]) {
                    int temp = res[j];
                    res[j] = res[j + 1];
                    res[j + 1] = temp;
                }
            }
        }
        return res;
    }
}
