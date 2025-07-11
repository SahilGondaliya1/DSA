public class bubbleSort{
    public void bubbleSortArray(int[] array){

        for(int i = 0 ; i < array.length ; i++){
           int min = i;
            for(int j = i ; j < array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            swap(array,min,i);
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