package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        System.out.println(listA);
        ArrayList<String> listB= new ArrayList<>();
        listB.add(scanner.nextLine());
        listB.add(scanner.nextLine());
        listB.add(scanner.nextLine());
        listB.add(scanner.nextLine());
        listB.add(scanner.nextLine());
        System.out.println(listB);
        ArrayList<String>  listC= new ArrayList<>();
        listC.add(listA.get(0));
        listC.add(listB.get (4));
        listC.add(listA.get (1));
        listC.add(listB.get (3));
        listC.add(listA.get (2));
        listC.add(listB.get (2));
        listC.add(listA.get (3));
        listC.add(listB.get (1));
        listC.add(listA.get (4));
        listC.add(listB.get (0));
        System.out.println(listC);
        Collections.sort(listC);
        System.out.println(listC);








    }
}
