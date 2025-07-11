public class bubbleSort{
    public void bubbleSortArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    static void swap(int[] array , int min, int index){
        int temp = array[min];
        array[min] = array[index];
        array[index] =temp;
    }
    public static void main(String[] args) {
        int[] array = {1,4,9,5,7,8,2};
        bubbleSort sort = new bubbleSort();
        sort.bubbleSortArray(array);  
        for(int i : array)
            System.out.print(i);
    }
}