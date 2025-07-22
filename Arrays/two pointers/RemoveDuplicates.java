public class RemoveDuplicates {
    public static void removeDuplicates(int arr[]){
        int i = 0 ;// new found element
        int j = 0;//last swapped element
        int n = arr.length;
        while(i < n){
            if(arr[i] != arr[j] && arr[i] > arr[j]){
                j++;
                swap(arr,i,j);
                
            }
            // arr[i] = 0; 
            i++;
        }
    }
    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        int[] arr= {1,1,2,2,3,3};
        removeDuplicates(arr);
        for(int i : arr){
            System.out.print(i+ " ");
        }
    }
}