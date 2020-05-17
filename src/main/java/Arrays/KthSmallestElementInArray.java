package Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KthSmallestElementInArray {
    //using max heap
    //time complexity O(k+(n-k)logn)

    public static  int findSmallest(List<Integer> list, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.addAll(list.subList(0,k));
        for(int i=k;i<list.size();i++){
            if(list.get(i)<pq.peek())
            {
                pq.poll();
                pq.add(list.get(i));
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7,4,6,3,9,1,10);
        int k=3;
        System.out.println("Kth smallest element is-" + findSmallest(list,k));
    }
}
