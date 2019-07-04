import java.util.*;
import java.io.*;

public class Endgame{
    String[] src; //= {"Basic.txt", "Common.txt", "Advanced.txt"};
    String banglatxt = "Bangla.txt";
    String banglaword;

    TreeMap<String, String> bangla, basic, common, advanced ; //= new TreeMap<>();
    
    Scanner scanner;
    
    public Endgame(){
        src= new String[]{"Basic.txt", "Common.txt", "Advanced.txt"};
        bangla = new TreeMap<>();
        basic = new TreeMap<>();
        common = new TreeMap<>();
        advanced = new TreeMap<>();
    }



    void Advanced()  throws FileNotFoundException{
        File file = new File(src[2]);
        scanner = new Scanner(file);
        String nextline = "";
        String mainword = "", wordmeaning = "";
        
        while(scanner.hasNextLine()){
            nextline = scanner.nextLine();
            int i1 = 0;
            mainword = "";
            while(nextline.charAt(i1)!=' '){
                mainword=mainword+nextline.charAt(i1);
                i1++;
            }
            wordmeaning = "";
            i1++;
            wordmeaning = nextline.substring(i1);
            
            banglaword = "";
            if(bangla.containsKey(mainword)){
                banglaword = bangla.get(mainword);
            }
            System.out.println("{"+mainword+"}\\\\");
            System.out.println("{"+banglaword+"}\\\\");
            System.out.println("{"+wordmeaning+"}\\\\");

        }
    }

    void Basic()  throws FileNotFoundException{
        File file = new File(src[0]);
        scanner = new Scanner(file);
        String nextline = "";
        String mainword = "", wordmeaning = "";
        
        while(scanner.hasNextLine()){
            nextline = scanner.nextLine();
            int i1 = 0;
            mainword = "";
            while(nextline.charAt(i1)!=' '){
                mainword=mainword+nextline.charAt(i1);
                i1++;
            }
            wordmeaning = "";
            i1++;
            wordmeaning = nextline.substring(i1);

            banglaword = "";
            if(bangla.containsKey(mainword)){
                banglaword = bangla.get(mainword);
            }
            System.out.println("{"+mainword+"}\\\\");
            System.out.println("{"+banglaword+"}\\\\");
            System.out.println("{"+wordmeaning+"}\\\\");
        }
    }

    void Common()  throws FileNotFoundException{
        File file = new File(src[1]);
        scanner = new Scanner(file);
        String nextline = "";
        String mainword = "", wordmeaning = "";
        
        while(scanner.hasNextLine()){
            nextline = scanner.nextLine();
            int i1 = 0;
            mainword = "";
            while(nextline.charAt(i1)!=' '){
                mainword=mainword+nextline.charAt(i1);
                i1++;
            }
            wordmeaning = "";
            i1++;
            wordmeaning = nextline.substring(i1);
            
            banglaword = "";
            if(bangla.containsKey(mainword)){
                banglaword = bangla.get(mainword);
            }
            System.out.println("{"+mainword+"}\\\\");
            System.out.println("{"+banglaword+"}\\\\");
            System.out.println("{"+wordmeaning+"}\\\\");
        }
    }

    void Bangla() throws FileNotFoundException{
        File file = new File(banglatxt);
        scanner = new Scanner(file);
        String nextline = "";
        String mainword = "", wordmeaning = "";
        while(scanner.hasNextLine()){
            nextline = scanner.nextLine();
            
            int i1 = 0;
            mainword = "";
            while(nextline.charAt(i1)!='$'){
                mainword=mainword+nextline.charAt(i1);
                i1++;
            }
            
            wordmeaning = "";
            i1+=2;
            wordmeaning = nextline.substring(i1);
        
            bangla.put(mainword, wordmeaning);
        
        }
        scanner.close();
    }
}