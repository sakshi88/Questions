package Arrays;

public class SortColors {
    public static void sortColors(int arr[]) {
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high) {
            if(arr[mid]==0)
                swap(arr,low++,mid++);
            else if(arr[mid]==1)
                mid++;
            else if(arr[mid]==2)
                swap(arr,mid,high--);
        }
    }

    public static void swap(int arr[],int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[]= {0,2,1,1,2,0};
        System.out.println("After sorting: ");
        sortColors(arr);
        for(int i: arr)
            System.out.print(arr[i] + ",");
    }
}
