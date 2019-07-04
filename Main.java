import java.io.FileNotFoundException;

public class Main{
    public static void main(String[] args) throws FileNotFoundException{ 
        Endgame endgame = new Endgame();
        endgame.Bangla();
        System.out.println("\\chapter{COMMON WORDS}"); // \chapter{আমি বাংলায় গান গাই। }
        endgame.Common();
        System.out.println("\\chapter{BASIC WORDS}");
        endgame.Basic();
        System.out.println("\\chapter{ADVANCED WORDS}");
        endgame.Advanced();
    }
}