import java.util.*;

public class Task2_f0rest {
    public int getBiggestPalindrom(String str) {
        str = str.toLowerCase();
        if(str == null){
            throw new NullPointerException("");
        }else if(str.isEmpty()){
            throw new IllegalArgumentException("Input string is empty");
        } else if(str.length() > 100){
            throw new IllegalArgumentException("Input string is more than 100 symbols");
        }


        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < str.toCharArray().length; i++) {
            characters.add(str.toCharArray()[i]);
        }

        int maxLenght = 0;

        String temp = str;

        for(Character ch:characters) {
            char testChar = ch;
            StringBuilder stringBuilder = new StringBuilder();
            str = temp;

            for (int i = 0; i < str.length(); i++) {
                int firstIndex = str.indexOf(testChar);
                int lastIndex = str.lastIndexOf(testChar);
                str = str.substring(firstIndex, lastIndex + 1);
                String reverseStr = stringBuilder.append(str).reverse().toString();

                if (str.equals(reverseStr)) {
                    if(maxLenght<str.length()) {
                        maxLenght = str.length();
                    }
                    break;
                } else {
                    lastIndex -= 2;
                    str = str.substring(firstIndex, lastIndex);
                    stringBuilder.setLength(0);
                }
            }
        }

        return maxLenght;
    }
}
