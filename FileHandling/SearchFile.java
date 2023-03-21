import java.io.*;

public class SearchFile {
    public static void main(String args[]){
        File file = new File("FileHandling.txt");
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            String content = "";

            while(line!= null){
                String searching = line + System.lineSeparator();
                if(searching.contains("Adarsh")){
                    System.out.println("RollNO of searched person is : "+searching.substring(0 , 3));
                }
                content = content + searching ;
                line = reader.readLine();
            }
            reader.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }    
}
