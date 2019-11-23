package javafiles;
import java.util.Scanner ;
import java.io.* ;
public class Javafiles {
    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner (System.in) ;
        File file = new File ("C:\\Users\\MENDJA\\Desktop\\TP-GL.txt");
        
        if (!file.exists()) {
            
            file.createNewFile();
            FileWriter writer = new FileWriter("C:\\Users\\MENDJA\\Desktop\\TP-GL.txt");
            System.out.print("Write Something : ");
            String cont = read.nextLine();
            System.out.println("");
            writer.write(cont);
            writer.close();
            
        }else {

            FileReader reader = new FileReader ("C:\\Users\\MENDJA\\Desktop\\TP-GL.txt");

            int ch = reader.read();
            String txt = "" ;

            while (ch != -1) {
                txt += (char)ch;
                ch = reader.read();
            }
            System.out.println("The File is already existed & its content is : \n"+txt);
        }
        }   
}
