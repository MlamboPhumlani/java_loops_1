package Java_Output_Formating;

import java.io.BufferedReader;
import java.util.Scanner;
import java.util.*;

public class Loop1 {

    public static void sol(int N){

        for(int i=1; i<=10;i++){
            System.out.println(N+" x "+i+" "+"= "+N*i);
        }
    }
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in); 
        boolean value =false;
        do{
            try {
                int N= obj.nextInt();
                Loop1.sol(N);
                value =true;
                
            } catch (NumberFormatException e) {
               System.out.print("Enter the integer number please");
            }
            
        }while(value);
       obj.close();

    }
}


