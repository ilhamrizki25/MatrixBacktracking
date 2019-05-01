package Backtracking_app;

import java.util.Random;

public class MatrixGenerator {
    
    private Random randomInt;
    private char randomChar;
    private char[][] matrix;
    
    // Random matrix
    public MatrixGenerator(int N) {
        this.matrix = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                this.randomInt = new Random();
                this.randomChar = (char)(randomInt.nextInt(26) + 'a');
                this.matrix[i][j] = this.randomChar;
            }
        }
    }
    
    // Default matrix
    public MatrixGenerator(){
        
        //gajah, makan, angkat, basis, ikatan are words that can be found inside this matrix
        char[][] word = { 
            {'q', 'x', 'a', 'd', 'g', 'm', 'h', 'r', 'j', 'w'},
            {'w', 'b', 'a', 'd', 'v', 'a', 'h', 'e', 'n', 'q'},
            {'f', 'g', 'n', 'd', 'd', 'k', 'j', 'y', 'm', 'y'},
            {'g', 'i', 'g', 'd', 's', 'a', 'n', 'a', 'g', 'u'},
            {'h', 'k', 'k', 'y', 'a', 'n', 'm', 'y', 'h', 'u'},
            {'l', 'x', 'a', 'a', 'g', 'x', 'l', 'y', 't', 'l'},
            {'h', 'r', 't', 'd', 't', 'a', 'k', 'y', 't', 'a'},
            {'m', 'z', 'a', 'd', 's', 'a', 'i', 'y', 't', 'p'},
            {'x', 'x', 'a', 'd', 'v', 'a', 'n', 'y', 't', 'u'},
            {'t', 'c', 'a', 'd', 'b', 'a', 's', 'i', 's', 'n'} 
        };
        
        this.matrix = word;
    }
    
    public char[][] getMatrix() {
        return matrix;
    }
}
