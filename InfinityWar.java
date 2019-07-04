import java.util.*;
import java.io.*;

public class InfinityWar{
    public InfinityWar(int i){

        Scanner sc;
        String[] src = {"basic.txt", "common.txt", "advanced.txt"};

        try{
            File file = new File(src[i]);
            sc = new Scanner(file);
            
            String nextline="";
            String mainWord = "";
            int len = 0;
            while(sc.hasNextLine()){
                nextline = sc.nextLine();
                if(nextline.contains("):")){
                    System.out.println("");
                }
                System.out.print(nextline+"|");
            }
            
            
        }catch(Exception x){
            x.printStackTrace();
        }
    }
}