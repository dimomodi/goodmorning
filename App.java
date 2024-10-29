/*
Programming Assignment

Lab 1 part 1 - Array

Initiate two integer arrays, x, and y, each containing 5 numbers.
Create another array z of length 5, the elements of which are the max of the respective numbers of the two arrays x and y.
Organize a nice-looking output to the terminal that looks like the following:
Array x = { array x values here separated by coma }

Array y = { array y values here separated by coma }

Array z = x + y = { array z values here separated by coma }

Lab 1 part 2 - ArrayList

Initiate an ArrayList that contain 5 names
Switch the first and last letters in each name in the ArrayList. Do not forget that each name begins with a capital letter, but the other letters are lowercase. The names with switched letters should follow the same rule as there are new names.
Organize a nice-looking output to the terminal that looks like the following:
Names = { list of names here separated by coma }

Names (switched) = { list of names with switched first and last letters here separated by coma }
 */

package edu.neu.mgen;

import java.util.ArrayList;
import java.util.Arrays;

public class App 
{
    public static void main(String[] args){

        // Part 1 - Array /////////////////////////////////

        int[] x = {1, 2, 3, 4, 5};
        int[] y = {5, 4, 3, 2, 1};

        int z[] = new int[5];
        for(int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        System.out.println("/// Lab 1 part 1 Result ///");

        System.out.print("Array x = ");
        printArr(x);

        System.out.print("Array y = ");
        printArr(y);

        System.out.print("Array z = x + y = ");
        printArr(z);


        // Part 2 - ArrayList /////////////////////////////////

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Adam", "Billy", "Caleb", "Dylan", "Eric"));
        ArrayList<String> namesSwitched = new ArrayList<>(names.size());

        for(int i = 0; i < names.size(); i++){
            if (names.get(i).length() == 1){
                namesSwitched.add(names.get(i));
                continue;
            }
            String temp = new String();
            int len = names.get(i).length();
            temp += Character.toUpperCase(names.get(i).charAt(len - 1));
            if (len > 2) {
                for(int j = 1; j < len - 1; j++) {
                    temp += names.get(i).charAt(j);
                }
            }
            temp += Character.toLowerCase(names.get(i).charAt(0));
            namesSwitched.add(temp);
        }

        System.out.println("/// Lab 1 part 2 Result ///");

        System.out.print("Names = ");
        printArrayList(names);        
        System.out.print("Names (switched) = ");
        printArrayList(namesSwitched);   

        System.out.println("/// End ///");


    }

    public static void printArr(int[] nums){
        System.out.print("{");
        for (int i = 0; i < nums.length; i++) {
            if(i == nums.length - 1){
                System.out.print(nums[i] + "}");
                System.out.println("");
                break;
            }
            System.out.print(nums[i] + ", ");
        }
    }
    public static void printArrayList(ArrayList<String> names){
        System.out.print("{");
        for (int i = 0; i < names.size(); i++) {
            if(i == names.size() - 1){
                System.out.print(names.get(i) + "}");
                System.out.println("");
                break;
            }
            System.out.print(names.get(i) + ", ");
        }
    }
}

/*
 * Di Mo
 */