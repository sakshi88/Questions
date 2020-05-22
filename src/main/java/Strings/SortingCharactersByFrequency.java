package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortingCharactersByFrequency {

    private static String sort(String str){
        if(str==null || str.length()==0)
            return str;
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        for(Character c: str.toCharArray())
            map.put(c, map.containsKey(c) ? map.get(c) +1 : 1);

        List<Character> list[] = new ArrayList[str.length()+1];
        for(Character key : map.keySet()){
            if(list[map.get(key)]==null)
                list[map.get(key)] =  new ArrayList<>();
            list[map.get(key)].add(key);
        }

        //print the string
        for(int i=list.length-1; i>=0;i--){
            if(list[i]!=null){
                for(char c: list[i])
                {
                    for(int j=0;j<i;j++){
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "tree";
        //output expected is"eert"
        //sort the characters in decreasing order and return the string
        str = sort(str);
        System.out.println("String expected is-" + str);
    }
}
