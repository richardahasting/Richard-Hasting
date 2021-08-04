
package streamers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author richard
 */
public class Streamer1 {
    
    
    // Mission: eliminate all words with a length of 5. sort them, count 
    // and print the total number of letters in the list, and then have a 
    // new list without the 5 letter words
    public static void test(String[] args) {
        DataListStrings dls = new DataListStrings();
        List<String> dataList = dls.getDataList();
        
        System.out.println("dataList has "+ dataList.size() + " words in it");
        // old way
        ArrayList <String> newList = new ArrayList<>();
        int foo = 0;
        int count = 0;
        for (String line : dataList)
            if (line.length() == 5) 
                foo ++;
            else{
                newList.add(line);
                count += line.length();
            }
        
        System.out.println("dataList has "+ foo + " 5 letter words in it");
        System.out.println(count + "\n" + newList);
  
        newList.clear();
        // the new way
        foo = (int) dataList.parallelStream().filter(l -> l.length() == 5)
                .count();
        // the new way
        dataList.stream().filter(l -> l.length() !=5 )
                .forEach(l-> {newList.add(l);});
        // and in parallel too
        
        count = newList.parallelStream().
                filter(l -> l.length() != 5)
                .mapToInt(l-> l.length())
                .sum();
                
         
        System.out.println("dataList has "+ foo + " 5 letter words in it");
        
        System.out.println(count + "\n" + newList);
        
    }
    
    public static void main(String[] args) {
        test(args);
    }
}
