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
/*
* soruda verilen ağaç yapısının min değerini  yolun bulmak için yapımızın sonundan başlayarak aşağıdan yukarıya doğru bir tolama
* ve küçük olan değeri seçme işlemi yaparak gerçekleşicektir.
*
* elimde bulunan iki boyutlu bir dizinin son dizisini ele alarak başladım bu son diziyi yeni olan ve toplam işlemlerini üzerinde
* gerçekleştireceğim yeni bir dizi oluştudum ve iki boyutlu dizinin son dizisini buraya taşıdım.
*
* artık elimde bulunan yeni dizinin elemanarını her seferinde iki boyutlu dizinin bir önceki indexsine geçicek şekilde bir dögünü içinde
* şu şekilde bir işlem yapmaktayım eski ereyimin i'ninci satırındaki j'ninci suntununda bulunan sayı ile yeni dizimdeki j'nin ve j+1. sizindeki küçük olan
* elemanla topladım ve elimde yini bir sayı oluşmakta bu sayı yukarı doğru oluşan toplama işleminde en küçük sayıyı vermektedir
*
*
*
*
* */