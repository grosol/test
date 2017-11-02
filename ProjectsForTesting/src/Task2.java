public class Task2 {


    //Please, check the results of all methods
    public  int palindrome(String string) {

        int maxLength = 0;

        for (int i = 0; i < string.length(); i++) {

            if (maxLength > string.length() - i) break;

            int currLength = 1;

            int j = i;

            for (j = string.indexOf(string.charAt(i), j); j != -1 && j <= string.length(); ) {

                String curr = string.substring(i, j + 1);

                String currReverse = new StringBuilder().append(curr).reverse().toString();

                if (curr.equals(currReverse)) currLength = curr.length();

                j = string.indexOf(string.charAt(i), j + 1);
            }

            if (currLength > maxLength) maxLength = currLength;
        }

        return maxLength;
    }

    public int palindrome1(String string) {

        if (string.length() > 100) throw new IllegalArgumentException("String length is longest then 100 symbols!");

        char[] s = string.toCharArray();

        int maxPalindromeLength = 0;

        int currPalindromeLength;

        boolean checkPalindrome;

        int firstIndex;

        for (int indexOfCurrentSybol = string.length() - 1; indexOfCurrentSybol >= 0; indexOfCurrentSybol--) {

            currPalindromeLength = 1;

            firstIndex = -1;

            while (firstIndex < indexOfCurrentSybol) {


                firstIndex = string.indexOf(s[indexOfCurrentSybol], firstIndex + 1);
                if (firstIndex == -1) break;


                int endOfPolinome = indexOfCurrentSybol - 1;

                checkPalindrome = true;

                for (int staryOfPolinome = firstIndex + 1; staryOfPolinome <= endOfPolinome; staryOfPolinome++) {
                    if (s[staryOfPolinome] != s[endOfPolinome]) {

                        checkPalindrome = false;
                        break;

                    } else {
                        endOfPolinome--;
                    }
                }

                if (checkPalindrome) currPalindromeLength = indexOfCurrentSybol - firstIndex + 1;

                if (currPalindromeLength > maxPalindromeLength) maxPalindromeLength = currPalindromeLength;
            }


        }
        return maxPalindromeLength;
    }



}
