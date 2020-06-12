package ProblemStatement;

import java.util.*;

class RandomizedSet {
    List<Integer> list;
    Map<Integer,Integer> map;
    Random random;
    public RandomizedSet() {
        list = new ArrayList<Integer>();
        map = new HashMap<Integer,Integer>();
        random = new Random();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val))
            return false;
        list.add(val);
        map.put(val,list.size()-1);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val))
            return false;
        int index = map.get(val);
        int lastElement = list.get(list.size()-1);
        list.set(index,lastElement);
        map.put(lastElement,index);
        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}

public class InsertDeleteGetRandomInOone {
    public static void main(String[] args) {
        RandomizedSet randomSet = new RandomizedSet();
        System.out.println("While insert : " + randomSet.insert(1));
        System.out.println("While remove : " + randomSet.remove(2));
        System.out.println("While insert : " + randomSet.insert(2));
        System.out.println("Rendom element is " + randomSet.getRandom());
        System.out.println("While remove : " + randomSet.remove(1));
        System.out.println("While insert : " + randomSet.insert(2));
        System.out.println("Random element is : " + randomSet.getRandom());
        System.out.println("Finally elements are-");
        for(int i: randomSet.list) {
            System.out.print(i + ",");
        }
    }
}
