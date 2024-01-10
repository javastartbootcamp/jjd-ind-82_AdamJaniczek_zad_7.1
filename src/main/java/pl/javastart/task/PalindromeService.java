package pl.javastart.task;

public class PalindromeService {

    // nie zmieniaj sygnatury tej metody. Jest ona testowana w PalindromeServiceTest
    public boolean isPalindrome(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        int firstElement = 0;
        int lastElement = array.length - 1;
        while (firstElement < lastElement) {
            if (array[firstElement] != array[lastElement]) {
                return false;
            }
            firstElement++;
            lastElement--;
        }
        return true;
    }
}
