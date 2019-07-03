import java.util.*;

public class Start{
    public static void main(String[] Args){
        // 1 txt , 2 csv files
        String[] csvInput = {"BengaliDictionary_36.csv","BengaliDictionary_93.csv" };
        String textInput = "BengaliDictionary_18.txt";
        MergeBangla mergeBangla = new MergeBangla();
        mergeBangla.fromCSV(csvInput[0]);
        mergeBangla.fromCSV(csvInput[1]);        
        mergeBangla.fromText(textInput);
    }
}