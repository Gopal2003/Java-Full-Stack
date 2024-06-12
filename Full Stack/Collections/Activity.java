import java.util.*;

public class Activity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taking String input.
        String input = scanner.nextLine();

        String reversed = getReversedString(input);
        System.out.println(reversed);
        String encodedString = getEncodedStirng(reversed);

        System.out.println("The Encrypted Code is : " + encodedString);
    }

    //Function to return the ReversedString.
    public static String getReversedString(String input)
    {
        String ans = input;
        int ptr1 = 0,ptr2 = input.length() - 1;

        while(ptr1 < ptr2)
        {
            char ch1 = ans.charAt(ptr1);
            char ch2 = ans.charAt(ptr2);

            //Performing Swapping Operation.
            ans = ans.replace(ch1,ch2);
            ans = ans.replace(ch2,ch1);

            ptr1++;
            ptr2--;
        }

        return ans;
    }

    //Function to Encode the String.
    public static String getEncodedStirng(String str)
    {
        String encoded = str;

        Map<Character,Character> hmap = new HashMap<>();
        hmap.put('a','0'); 
        hmap.put('e','1'); 
        hmap.put('i','2'); 
        hmap.put('o','3'); 
        hmap.put('u','4'); 

        for(Character ch :str.toCharArray())
        {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            {
                char code = hmap.get(ch);
                str = str.replace(ch,code);
            }
        }

        return encoded;
    }
}

/*
 *static void encryption(String str)
{
String reversedString = new StringBuilder(str).reverse().toString();

String sample="aeiou";
for(char letter : sample.toCharArray()){

reversedString = reversedString.replaceAll(String.valueOf(letter)),
String.valueOf(sample.indexOf(String.valueOf(letter))));
}


reversedString = reversedString.replaceAll("a", "0");
reversedString = reversedString.replaceAll("e", "1");
reversedString = reversedString.replaceAll("i", "2");
reversedString = reversedString.replaceAll("o", "3");
reversedString = reversedString.replaceAll("u", "4");

reversedString = reversedString+"aca";

System.out.println("Final Output: " + reversedString);

}
 */

 /*
  rivsed
  static void encryption(String str)
{
String reversedString = new StringBuilder(str).reverse().toString();

String sample="aeiou";
for(char letter : sample.toCharArray()){

reversedString = reversedString.replaceAll(
String.valueOf(letter),
String.valueOf(sample.indexOf(String.valueOf(letter))));
}


reversedString = reversedString.replaceAll("a", "0");
reversedString = reversedString.replaceAll("e", "1");
reversedString = reversedString.replaceAll("i", "2");
reversedString = reversedString.replaceAll("o", "3");
reversedString = reversedString.replaceAll("u", "4");

reversedString = reversedString+"aca";

System.out.println("Final Output: " + reversedString);

}
  */
