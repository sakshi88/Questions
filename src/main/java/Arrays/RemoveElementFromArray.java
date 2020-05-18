package Arrays;

public class RemoveElementFromArray {

    //assumptions: no duplicate element is there
    //returning the index of the number of elements now left in the array
    //order of  the elements after deleting does not matter
    public static int deleteElement(int nums[],int element){
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == element) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7,8,9};
        int element =6;
        System.out.println("Array after deleting the elements is-");
        int n = deleteElement(arr,element);
        System.out.println(n);
    }
}
