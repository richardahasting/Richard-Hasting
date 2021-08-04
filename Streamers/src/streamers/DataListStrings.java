
package streamers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;

/**
 *
 * @author richard
 * 
 * Mission: Place an array of String into a List
 */
public class DataListStrings {
    
  private ArrayList<String> dataList = new ArrayList<String>();

    public ArrayList<String> getDataList() {
        return dataList;
    }

    public static String[] getArray() {
        return array;
    }
    
static String [] array = {"aronical", "Aaronite", "Aaronitic", "Aaron's-beard","Aaronsburg", "Aaronson","AARP", "aarrgh","aarrghh", "Aaru","AAS",
"A'asia","aasvogel", "aasvogels","AAU", "AAUP","AAUW", "AAVSO","AAX", "A-axes","A-axis", "AB","ab-", "ABA","Ababa", "Ababdeh","Ababua",
"abac","abaca", "abacay","abacas", "abacate","abacaxi", "abaci","abacinate", "abacination","abacisci", "abaciscus","abacist", "aback",
"abacli", "Abaco", "abacot", "abacterial", "abactinal", "abactinally", "abaction", "abactor", "abaculi", "abaculus", "abacus", "abacuses",
"Abad", "abada", "Abadan", "Abaddon", "abadejo", "abadengo", "abadia", "Abadite", "abaff", "abaft", "Abagael", "Abagail", "Abagtha",
"abay", "abayah", "Abailard", "abaisance", "abaised", "abaiser", "abaisse", "abaissed", "abaka", "Abakan", "abakas", "Abakumov", "abalation",
"abalienate", "abalienated", "abalienating", "abalienation", "abalone", "abalones", "Abama", "abamp", "abampere", "abamperes", "abamps",
"Abana", "aband", "abandon", "abandonable", "abandoned", "abandonedly", "abandonee", "abandoner", "abandoners", "abandoning", "abandonment",
"abandonments", "abandons", "abandum", "abanet", "abanga", "Abanic", "abannition", "Abantes", "abapical", "abaptiston", "abaptistum",
"Abarambo", "Abarbarea", "Abaris", "abarthrosis", "abarticular", "abarticulation", "Abas", "abase", "abased", "abasedly", "abasedness",
"abasement", "abasements", "abaser", "abasers", "abases", "Abasgi", "abash", "abashed", "abashedly", "abashedness", "abashes",
"abashing", "abashless", "abashlessly", "abashment", "abashments", "abasia", "abasias", "abasic", "abasing", "abasio", "abask",
"abassi", "Abassieh", "Abassin"};
    
    // The new way! 
    public DataListStrings()
    {
        Arrays.stream(array).forEach(dataList::add);
    }
    
    // the old way
    public DataListStrings(Boolean dolt)
    {
        if (dolt)
            for(var i = 0; i < array.length; i++)
                dataList.add(array[i]);
    }    
}
