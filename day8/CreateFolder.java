package day8;
import java.io.File;
import java.util.Scanner;

public class CreateFolder {
    public static void main(String args[]){
        System.out.println("Enter the path where you want to create a folder");
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        System.out.println("Enter the name of the desired directory");
        path += sc.next();
        File f1 = new File(path);
        if(f1.mkdir()){
            System.out.println("Folder is Created Successfully");
        }
        else{
            System.out.println("Folder is not Created");
        }
    }
}