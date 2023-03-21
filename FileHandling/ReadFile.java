import java.io.*;
public class ReadFile {
    public static void main(String args[]){
        File file = new File("FileHandling.txt");
        BufferedReader read = null;
        

        try{
            read = new BufferedReader(new FileReader(file));
            String  line = read.readLine();
            String content = "";
            while(line != null){
                content = content + line +System.lineSeparator();
                line = read.readLine();
            }
            System.out.println(content);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    

