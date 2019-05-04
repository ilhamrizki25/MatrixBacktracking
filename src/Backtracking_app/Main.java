package Backtracking_app;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.GroupLayout.Alignment;

public class Main {
    
    public static void main(String[] args) throws IOException {
        boolean choice = true;
        int N;
        char[][] matrix = null;
        Scanner input = new Scanner(System.in);
   
        System.out.println(" WELCOME TO BACKTRACK APPS ");
        
        // Looping the program to execute the process backtracking 
        while (choice) {
            
            System.out.println("-----------------------------");
            System.out.println("1. Using Default Matrix");
            System.out.println("2. Generate Random Matrix");
            System.out.println("3. Exit");
            System.out.println("-----------------------------");
            System.out.print("Select option : ");
            int answer = input.nextInt();
            System.out.println();
            
            Scanner input2 = new Scanner(System.in);
            
            if (answer == 1){ // option 1
                // initialize the object of MatrixGenerator & get the default letter matrix
                MatrixGenerator obj = new MatrixGenerator();
                matrix = obj.getMatrix();
                
                System.out.println("------------MATRIX GENERATED------------");
                System.out.println();
                
                // print the the default matrix
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        System.out.print(" " + matrix[i][j]);
                    }
                    System.out.println();
                }
                
                // initialize the object of Backtrack
                Backtrack word = new Backtrack(matrix.length);
                
                System.out.println();
                System.out.println("word that can be found inside the matrix above are : gajah, makan, angkat, basis, ikatan");
                System.out.print("Type word that you want to be Backtracked : ");
                String ans1 = input2.nextLine();
                
              
                if (word.searchWord(matrix, ans1)) { // path found
                    System.out.println();
                    System.out.println("------------PATH FOUND------------");
                    System.out.println();
                    
                    word.print();
                    
                    System.out.println("\n");
                } else { // path not found
                    System.out.println("NO PATH FOUND");
                }
               
                System.out.println("Press Enter to continue");
                System.out.println("\n");
                try{ System.in.read(); }
                catch(Exception e){ }
    
            } else if (answer == 2) { // option 2
                
                // insert the length of matrix
                System.out.print("Input the length of Matrix : ");
                N = input.nextInt();
                
                // initialize the object of MatrixGenerator & get the random letter matrix
                MatrixGenerator obj = new MatrixGenerator(N);
                matrix = obj.getMatrix();
                
                System.out.println("------------MATRIX GENERATED------------");
                System.out.println();
                
                // print the the default matrix
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        System.out.print(" " + matrix[i][j]);
                    }
                    System.out.println();
                }
                
                System.out.println();
                System.out.println("You have to read the matrix above first before you type your desired word to be backtracked");
                System.out.print("Type word that you want to be Backtracked : ");
                String ans2 = input2.nextLine();
                
                // initialize the object of Backtrack
                Backtrack word = new Backtrack(matrix.length);
                
                if (word.searchWord(matrix, ans2)) { // path found
                    System.out.println();
                    System.out.println("------------PATH FOUND------------");
                    System.out.println();
                    
                    word.print();
                    
                    System.out.println("\n");
                } else { // path not found
                    System.out.println("NO PATH FOUND");
                }
                
                System.out.println("Press Enter to continue");
                System.out.println("\n");
                try{ System.in.read(); }
                catch(Exception e){ }
                
            } else { // other than option 1 or 2 a.k.a exit :)
                choice = false; //make the looping program stop
            }
        }
    }
}
