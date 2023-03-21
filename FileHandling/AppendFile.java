import java.io.*;

public class AppendFile {
    
    public static void main(String args[]){
        File file = new File("FileHandling.txt");
        String ss = "5  Aayush Tiwari    99";
        try{
            FileWriter fw = new FileWriter(file,true);
            
            fw.write(ss + System.lineSeparator());
            fw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
