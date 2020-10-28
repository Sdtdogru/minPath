package com.company;

public class Main {





    public static void main(String[] args) {
         int Array[][] = {{7},
                {6,3},
                {3, 8, 5},
                {11,2,10,9}};

        int []newArray = new int[Array.length];
        System.out.println(Array.length);
        int n = Array.length - 1;

        for (int i = 0; i < Array[n].length; i++) {
            newArray[i] = Array[n][i];
        }
        for (int i = Array.length - 2;i >= 0; i--){
            for (int j = 0; j < Array[i].length; j++){
                newArray[j] = Array[i][j] + (int)Math.min(newArray[j],  newArray[j + 1]);

        }
            System.out.println(newArray[0]);
        }
    }
}
