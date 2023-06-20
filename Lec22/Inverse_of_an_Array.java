package Lec22;

import java.util.Scanner;

public class Inverse_of_an_Array {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int [] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                inverseArr(arr);
            }
            public static void inverseArr(int [] arr){
                int [] newArr = new int[arr.length];
                for (int i = 0; i < arr.length; i++) {
                    newArr[arr[i]] = i;
                }
                Display(newArr);

            }
            public static void Display(int[] arr){
                for(int i = 0 ; i < arr.length ; i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
            }