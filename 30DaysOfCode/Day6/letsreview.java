import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      
       for (int i = 0; i < n; i++)
        {
           String s=sc.next();
       
            for (int j = 0; j < s.length(); j+=2)
            { 
                System.out.print(s.charAt(j));
            }
            System.out.print(" ");
            for (int j = 1; j < s.length(); j+=2)
            {
                System.out.print(s.charAt(j));
            }
        System.out.println();
        }
        
    }
}