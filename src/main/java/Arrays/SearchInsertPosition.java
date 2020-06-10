package Arrays;

public class SearchInsertPosition {
    private static int insertPosition(int arr[],int element){
        int i=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]>=element)
                return i;
        }
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,6,7,9};
        int element = 4;
        System.out.println("Index where element should be inserted is - " + insertPosition(arr,element));
    }
}
