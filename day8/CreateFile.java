package day8;
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String args[]){
        try{
            File f = new File("C:\\Users\\admin\\Desktop\\0007\\Rithesh\\hello.txt");
            if(f.createNewFile()){
                System.out.println("File Created: "+f.getName());
            }
            else
                System.out.println("File already exists!");
        }
        catch(IOException e){
            System.out.println("An eror Occured");
            e.printStackTrace();
        }
    }
}
