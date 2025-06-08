package in.kgcoding.file;

import java.io.FileWriter;
import java.io.IOException; 


public class KgcodingWriter {
    public static void main(String[] args) {
        String fileName = "Java-course.txt";
        try(FileWriter writer = new FileWriter(fileName)){
            writer.write("This is the best Course");
            // for(int i=0; i<1000;i++){
            //     writer.write('*');
            // }
            writer.flush();
            System.out.println("File Written Successfully");
        } catch (IOException exception) {
          System.out.printf("Exception occured %s \n",exception.getMessage());
          
        }
    }
}
      
        
            
