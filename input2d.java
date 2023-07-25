import java.util.Scanner;

public class input2d {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter no. columns: ");
        int cols = sc.nextInt();
        int a1[][] = new int[rows][cols];
        int a2[][] = new int[rows][cols];
        int sum[][] = new int[rows][cols];
        System.out.println("Enter the first matrix elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the second matrix elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a2[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum[i][j] = a1[i][j] + a2[i][j];
            }
        }
        System.out.println("The sum matrix is: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
