/*
 * Created by PabloCM on 12/11/2020 01:53 pm with IntelliJ IDEA
 * Project words-counter
 */

package pablocm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class WordsCounter {

    public HashMap<String, Integer> wordsCounter(String text) {
        //Split, format and sort the text
        String[] splitText = textFormatter(text).split(" ");
        Arrays.sort(splitText);
        //Insert into a LinkedHashMap
        //LinedHashMap -> keep the insertion order vs HashMap -> Do not keep the insertion order
        LinkedHashMap<String, Integer> dir = new LinkedHashMap<String, Integer>();
        for (int i = 0; i < splitText.length; i++) {
            if (!dir.containsKey(splitText[i])) {
                dir.put(splitText[i], 1);
            } else {
                dir.replace(splitText[i], dir.get(splitText[i]) + 1);
            }
        }
        return dir;
    }

    public String textFormatter(String text) {
        return text.toLowerCase().
                replace(".", "").
                replace(":", "").
                replace(",", "").
                replace("!", "").
                replace("?", "")
                ;
    }
}
