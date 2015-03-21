package com.hackbulgaria.corejava;

import java.util.Arrays;

public class Problems2Impl implements Problems2 {

    @Override
    public boolean isOdd(int number) {

        if (number % 2 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int min(int... array) {

        int minel = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minel > array[i]) {
                minel = array[i];
            }
        }

        return minel;
    }

    @Override
    public int kthMin(int k, int[] array) {

        Arrays.sort(array);

        return array[k - 1];
    }

    @Override
    public float getAverage(int[] array) {


        float sumall = 0;
        for (int i = 0; i < array.length; i++) {
            sumall = sumall + array[i];
        }

        return sumall / array.length;
    }

    public boolean divsallbelow(int upperBound, int number) {
        for (int i = upperBound; i > 1; i--) {

            if (number % i != 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public long getSmallestMultiple(int upperBound) {
        int result = 1;
        while (!divsallbelow(upperBound, result)) {
            result = result + 1;
        }

        return (long) result;
    }

    @Override
    public long getLargestPalindrome(long N) {
        long result = N;
        while (!isPalindrome((int) result)) {
            result = result - 1;
        }

        return result;
    }

    @Override
    public int[] histogram(short[][] image) {
     // TODO Auto-generated method stub
        return null;
    }

    public int factorial(int n) {
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result = result * i;
        }
        return result;
    };

    @Override
    public long doubleFac(int n) {

        return factorial(factorial(n));
    }

    @Override
    public long kthFac(int k, int n) {
        int result = factorial(n);
        for (int i = k; i > 1; i--) {
            result = factorial(result);
        }

        return result;
    }

    @Override
    public int countOfocc(int n, int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n)
                count = count + 1;
        }
        return count;
    }

    @Override
    public int getOddOccurrence(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (countOfocc(array[i], array) % 2 != 0)
                return array[i];
        }
        return 0;
    }

    @Override
    public long pow(int a, int b) {
        {
            if (b == 0)
                return 1;
            long temp = pow(a, b / 2);
            if (b % 2 == 0)
                return (long) temp * temp;
            else
                return (long) (a * temp * temp);
        }
    }

    @Override
    public long maximalScalarSum(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int result = 0;
        for (int i = 0 ; i < a.length ; i++)
        {
            result = result + a[i]*b[i];
        }
        
        return result;
    }

    @Override
    public int maxSpan(int[] array) {
        int max_span = 0;
        int j = array.length - 1;
        int i = 0;
        
        while ( i < array.length - 1)
        {
            while (array[i] != array[j])
            {
                j--;
            }
            if (j - i > max_span)
                max_span = j - i + 1;
            
            j = array.length - 1;
            i += 1;
        }
        
        return max_span;
    }

    @Override
    public boolean canBalance(int[] array) {
        int i = 0;
        
        int sum_left = 0;
        int sum_right = 0;
        
        while ( i < array.length - 1)
        {
            for (int j = 0 ; j <= i; j ++)
            {
                sum_left += array[j];
            }
            for (int k = array.length - 1 ; k > i ; k -- )
            {
                sum_right += array[k];
            }
            if (sum_left == sum_right)
            {
                return true;
            }
            sum_left = 0;
            sum_right = 0;
            i++;
        }
        
        return false;
    }

    @Override
    public int[][] rescale(int[][] original, int newWidth, int newHeight) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String reverseMe(String argument) {
        String reverse = "";
        int length = argument.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + argument.charAt(i);
        }
        return reverse;
    }

    @Override
    public String copyEveryChar(String input, int k) {
        String result = "";
        for ( int i = 0; i < input.length() ; i++ )
        {
            for (int j = 0 ; j < k ; j++)
                result = result + input.charAt(i);
        }

        return result;
    }

    @Override
    public String reverseEveryWord(String arg) {
        String[] words=arg.split(" ");
        String result = "";
        
        for ( int i = 0 ; i < words.length; i ++)
        {
            result += reverseMe(words[i]);
            result += ' ';
        }
        
        result = result.substring(0, result.length() - 1);
        return result;
    }

    @Override
    public boolean isPalindrome(String argument) {

        String reverse = "";
        int length = argument.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + argument.charAt(i);
        }

        if (argument.equals(reverse))
            return true;
        else
            return false;
    }

    @Override
    public boolean isPalindrome(int number) {
        String str;
        str = String.valueOf(number);
        String reverse = "";
        int length = str.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }

    @Override
    public int getPalindromeLength(String input) {
        
       int length = input.length();
       int star_index = 0;
       while (input.charAt(star_index) != '*')
           star_index ++;
       
       int i = 0;
       while (i <= length / 2 && input.charAt(star_index - i) == input.charAt(star_index + i))
       {
           i++;
       }
       return i -1 ;
    }

    @Override
    public int countOcurrences(String needle, String haystack) {
        int count = (haystack.length() - haystack.replace(needle, "").length())/ needle.length();
        return count;
    }

    @Override
    public String decodeURL(String input) {
        input = input.replace("%20", "");
        input = input.replace("%3A", ":");
        input = input.replace("%3D", "?");
        input = input.replace("%2F", "/");
        return input;
    }

    @Override
    public int sumOfNumbers(String input) {

        input=input.replaceAll("[a-zA-Z]"," ");

        String[] numbers=input.split(" ");
        int sum = 0;
        for(int i=0 ; i<numbers.length; i++){
            try{
                sum+=Integer.parseInt(numbers[i]);
            }
            catch( Exception e ) {
              //Just in case, the element in the array is not parse-able into Integer, Ignore it
            }
        }

        return sum;
    }
    
    public int countOccurances(char A, String str)
    {
        int count = 0;
        for ( int i = 0 ; i < str.length(); i ++)
        {
            if (A == str.charAt(i))
            {
                count ++;
            }
        }
        return count;
    }

    @Override
    public boolean areAnagrams(String A, String B) {
        for ( int i = 0 ; i < A.length(); i ++)
        {
            int count_in_A = countOccurances(A.charAt(i), A);
            int count_in_B = countOccurances(A.charAt(i), B);
            if (count_in_A != count_in_B)
                return false;
        }
        return true;
    }

    @Override
    public boolean hasAnagramOf(String string, String string2) {
        
        int A_length = string.length();
        for ( int i = 0 ; i <= string2.length() - A_length; i ++)
        {
            String curr_substring = string2.substring(i, i + A_length);
            System.out.println("Curr str: " + string + " Comparing with " + curr_substring);
            if (areAnagrams(curr_substring, string))
                return true;
        }
        return false;
    }
}
