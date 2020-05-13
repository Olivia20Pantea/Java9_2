package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<String> listaL = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul de elemente din lista L: ");
        int l=scanner.nextInt();
        int i,nr;
        String x;
        System.out.println("Introduceti elementele listei L: ");
        scanner.nextLine();
        for (i = 0; i < l; i++){
            x=scanner.nextLine();
            listaL.add(x);
        }
        ArrayList<Integer> listaP = new ArrayList<>();
        System.out.print("Introduceti numarul de elemente din lista P: ");
        int p=scanner.nextInt();
        int n;
        System.out.println("Introduceti elementele listei L: ");
        for (i = 0; i < p; i++){
            n=scanner.nextInt();
            listaP.add(n);
        }
        Collections.sort(listaP);
        for (i = 0; i < listaP.size(); i++)
        {
            nr=listaP.get(i);
            if(nr<listaL.size()){
                listaL.remove(nr);
                System.out.print("\n"+"Elementul de pe pozitia "+nr+" a fost sters."+"\n"+"Acum lista L contine: ");
                System.out.print(listaL);
                System.out.println();
            }
            else
                System.out.println("\n"+"Lista L nu are niciun element pe pozitia "+listaP.get(i));
        }
        System.out.print("Elementele listei L dupa ce au fost sterse pe rand elementele de pe pozitiile specificate de elementele listei P sunt: ");
        System.out.print(listaL);
    }
}