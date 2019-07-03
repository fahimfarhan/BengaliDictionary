import java.util.*;
import java.io.*;

public class MergeBangla{
    Scanner sc;
    public MergeBangla(){}

    public void fromCSV(String fname){
        try{
            String datasrc = "./datasource/"+fname;
            String nextLine =  "";
            File file = new File(datasrc);
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                nextLine = sc.nextLine();
                String[] temp = nextLine.split(",");
                int len = temp[0].length();
                String meaning = nextLine.substring(len);
                System.out.println(temp[0]+"$"+meaning);
            }
        }catch(Exception x){
            x.printStackTrace();
        }finally{
            sc.close();
        }
        
    }
    public void fromText(String fname){
        try{
            String datasrc = "./datasource/"+fname;
            String nextLine =  "";
            File file = new File(datasrc);
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                nextLine = sc.nextLine();
                nextLine = nextLine.substring(1);
                String[] temp = nextLine.split(";");
                
                int len = temp[0].length();
                String meaning = nextLine.substring(len);
                System.out.println(temp[0]+"$"+meaning);
            }
        }catch(Exception x){
            x.printStackTrace();
        }finally{
            sc.close();
        }
        
    }
}