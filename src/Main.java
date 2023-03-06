import java.util.Arrays;
import java.util.Random;

public class Main {
    static int[][] createMatrix(int x,int y){
        Random rand = new Random();
        int[][] matrix = new int[x][y];
        for(int i=0;i<matrix.length;i++){
            for (int j = 0;j<matrix[i].length;j++){
                matrix[i][j]= rand.nextInt(0,10);
            }
        }
        return matrix;
    }
    static void printArr(int[][] arr){
        for(int[] x : arr){
            System.out.println(Arrays.toString(x));
        }
    }
    static int[][] transpose(int[][] arr){
        int[][] tMatrix = new int[arr[0].length][arr.length] ;
        for(int i=0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                tMatrix[j][i]=arr[i][j];
            }
        }
        System.out.println("Transpose of the given matrix is :");
        printArr(tMatrix);
        return tMatrix;
    }

    public static void main(String[] args) {
        int[][] newMatrix = createMatrix(2,3);
        printArr(newMatrix);
        transpose(newMatrix);


    }
}
