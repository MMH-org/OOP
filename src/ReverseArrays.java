package src;

import java.util.Scanner;

public class ReverseArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many elements you want ?");
        int n = sc.nextInt();
        int[]elt=new int[n];

        for (int i=0; i<n;i++){
            System.out.println("Enter array element " +(i+1));
        }

    }
}
