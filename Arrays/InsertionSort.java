public class InsertionSort {
    public void insertionSort(int[] arr){
        int window = 0 ;
        //KEEP TWO OPERATION IN MIND 1. EXTEND OR SWAP
        while(window < arr.length-1){
            if(arr[window] > arr[window+1])
            {
                insert(arr,window+1);
            }
            else{
                window++;
            }
        }
    }

    static void insert(int[] arr, int index){
        while(index > 0 && arr[index] < arr[index-1] ){
            swap(arr,index,index-1);
            index--;
        }
    }

    static void swap(int[] array , int min, int index){
        int temp = array[min];
        array[min] = array[index];
        array[index] =temp;
    }
    public static void main(String[] args) {
        int[] array = {1,4,9,5,7,8,2};
        InsertionSort sort = new InsertionSort();
        sort.insertionSort(array); 
        for(int i : array)
            System.out.print(i);
    }
}
