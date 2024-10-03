public class Add_Matrix  
{  
    public static void main(String[] args) {  
        int rows, cols;  
  
        //Initialize matrix a  
          int a[][] = {  
                          {4, 5, 6},  
                          {3, 4, 1},  
                          {1, 2, 3}  
                       };  
  
          //Initialize matrix b  
          int b[][] = {  
                          {2, 0, 3},  
                         {2, 3, 1},  
                         {1, 1, 1}  
                     };  
  
          //Calculates number of rows and columns present in given matrix  
          rows = a.length;  
        cols = a[0].length;  
  
          //Array add will hold the result  
        int add[][] = new int[rows][cols];  
  
        //Performs addition of matrices a and b. Store the result in matrix add  
        for(int i = 0; i < rows; i++){  
            for(int j = 0; j < cols; j++){  
                add[i][j] = a[i][j] - b[i][j];  
            }  
        }  
  
        System.out.println("Addition of two matrices: ");  
        for(int i = 0; i < rows; i++){  
            for(int j = 0; j < cols; j++){  
               System.out.print(add[i][j] + " ");  
            }  
            System.out.println();  
        }  
    }  
} 
