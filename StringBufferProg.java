package S1BM23AI176;

import java.util.Scanner;
public class StringBufferProg {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1="Hello";
        String s2="hello";
        //using equals method
        System.out.println("comparision of the String");
        if(s1.equals(s2)){
            System.out.println("strings are equal");
        }else{
            System.out.println("string are not equal");
        }
        //using equalsIgnoreCase
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }

        //using compareTo
        int result=s1.compareTo(s2);
        System.out.println(result);

        //concatenate two strings
        System.out.println("concatination of the String");
        System.out.println("enter a strings:");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String conStr=str1+str2;

        System.out.println("concatenation of strings:"+conStr);

        //create copies of strings
        System.out.println("copies creation of the String");
        String name="Hello, world";
        String copy=new String(name);
        System.out.println(copy);

        StringBuffer stringbuffer=new StringBuffer("Hello, World");

        System.out.println("capacity of StringBuffer: "+stringbuffer.capacity());

        String reversedUppercase=stringbuffer.reverse().toString().toUpperCase();
        System.out.println("Reversed and Uppercase: " + reversedUppercase);

        System.out.print("Enter a string to append: ");
        String userInput=sc.nextLine();

        String finalResult=reversedUppercase + userInput;
        System.out.println("Final Result: " + finalResult);

        sc.close();
            }
        }
