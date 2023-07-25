package day8;
import java.util.Scanner;
import java.io.File;

public class delete_folder {
    public static void main(String args[]){
        String filePath;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter directory path: ");
        filePath = sc.nextLine();
        sc.close();
        File f = new File(filePath);
        try{
            deleteDirectory(f);
            f.delete();
            System.out.println("Your Directory is Deleted Successfully");
        }
        catch(Exception e){
            System.out.println("e.getMessage()");
        }
    }
    public static void deleteDirectory(File f){
        for (File subfile:f.listFiles()){
            if (subfile.isDirectory()){
                deleteDirectory(subfile);
            }
            subfile.delete();
        }
    }
}
