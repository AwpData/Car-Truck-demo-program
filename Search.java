import java.util.ArrayList; 

import java.util.Arrays; 

import java.util.Scanner; 

import java.io.*; 

  

public class MergeSort { 

    @SuppressWarnings("resource") 

    public static void main(String[] args) throws FileNotFoundException { 

        Scanner names = new Scanner(new File("src/names.txt")); 

        Scanner numbers = new Scanner(new File("src/numbers.txt")); 

        ArrayList<String> Names = new ArrayList<>(); 

        ArrayList<Integer> Numbers = new ArrayList<>(); 

  

        while (names.hasNextLine()) { 

            Names.add(names.nextLine()); 

        } 

        while (numbers.hasNextLine()) { 

            Numbers.add(numbers.nextInt()); 

        } 

        System.out.println(Names); 

        System.out.println(Numbers); 

        mergeSort(Names);     

        System.out.println(Names); 

    } 

  

    public static void mergeSort(ArrayList<String> arraylist) { 

        if (arraylist.size() > 1) { 

            ArrayList<String> left = new ArrayList<>(); 

            for (int i = 0; i < arraylist.size() / 2; i++) { 

                left.add(arraylist.get(i)); 

            } 

  

            ArrayList<String> right = new ArrayList<>(); 

            for (int i = arraylist.size() / 2 + 1; i < arraylist.size(); i++) { 

                right.add(arraylist.get(i)); 

            } 

            mergeSort(left); 

            mergeSort(right); 

            merge(arraylist, left, right); 

        } 

    } 

  

    public static void merge(ArrayList<String> arraylist, ArrayList<String> left, ArrayList<String> right) { 

        int i1 = 0; 

        int i2 = 0; 

        for (int i = 0; i < arraylist.size(); i++) { 

            if (i2 >= right.size() || (i1 < left.size() && (left.get(i1).compareTo(right.get(i2))) <= 0)) { 

                arraylist.set(i, left.get(i)); 

                i1++; 

            } else { 

                arraylist.set(i, right.get(i)); 

                i2++; 

            } 

        } 

    } 

} 

 
