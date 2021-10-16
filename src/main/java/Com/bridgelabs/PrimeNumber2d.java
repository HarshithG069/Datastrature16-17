package Com.bridgelabs;
import java.util.Scanner;
public class PrimeNumber2d {
        // Function to check a number is prime or not
        boolean isPrime(int num)
        {
            int counter = 0;
            for (int i = 1; i <= num; i++)
            {
                if (num % i == 0)
                    counter = counter + 1;
            }

            if (counter == 2)
                return true;
            else
                return false;
        }

        public static void main(String args[])
        {
            // creating object of Matrix With Prime Numbers
            // class
            PrimeNumber2d mwp
                    = new PrimeNumber2d();

            // Enter the number of rows and column.
            int row = 14;
            int col = 12;

            // 2D array for storing prime numbers
            int Matrix[][] = new int[row][col];

            // size of resultant matrix
            int res = row * col;

            // 1D array for storing prime numbers
            int Result[] = new int[res];

            int i = 0, j;
            int k = 1;

            // Calling the method to check prime and
            // then result will be stored into the array
            while (i < res)
            {
                if (mwp.isPrime(k) == true)
                {
                    Result[i] = k;
                    i++;
                }
                k++;
            }

            // the result is now stored into the form
            // of matrix (in 2D array)
            int x = 0;
            for (i = 0; i < row; i++)
            {
                for (j = 0; j < col; j++)
                {
                    Matrix[i][j] = Result[x];
                    x++;
                }
            }

            // printing the result in 2D Array.
            System.out.println("The Resultant Matrix is : ");

            for (i = 0; i < row; i++)
            {
                for (j = 0; j < col; j++)
                {
                    System.out.print(Matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
}
