/*
@author BO
 */

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int c = -99999,b = 0;
        Scanner scanner = new Scanner(System.in);
       /* String[] name = {"ALi" , "Galymzhan" , "Rauan" , "Islam" , "Sanzhar"};
        int[] age = {16, 17 , 15 , 19, 18};
        String[] address = {"Oskemen", "Almaty" , "Astana" , "Semey" , "Turkestan"};
        for (int i = 0; i < age.length; i++) {
            if (age[i] > c) {
                c = age[i];
                b = i;
            }
        }
        System.out.println(name[b] + " " + c + "(" + b + ")" + " live in " + address[b]);
   */
        String[] name = new String[10];
        int[] age = new int[10];
        String[] address = new String[10];
        for (int i = 0; i < name.length; i++) name[i] = scanner.next();
        for (int i = 0; i < age.length; i++) age[i] = scanner.nextInt();
        for (int i = 0; i < address.length; i++) address[i] = scanner.next();
        for (int i = 0; i < age.length; i++) {
            if (age[i] > c) {
                c = age[i];
                b = i;
            }
        }
        System.out.println(name[b] + " " + c + "(" + b + ")" + " live in " + address[b]);
    }
}