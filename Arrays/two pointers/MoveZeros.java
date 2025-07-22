public class MoveZeros {
    static void moveZeros(int[] arr){
        int i = 0 ;//moving pointer
        int j = 0 ;//last zero
        int n  = arr.length;
        while(i  < n){
            if(arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
            i++;
        }
    }
    public static void main(String[] args){
        int[] arr =  {0,1,0,2,0,3};
        for(int i : arr){
            System.out.print(i+ " ");
        }
        System.out.println();
        moveZeros(arr);
        for(int i : arr){
            System.out.print(i+ " ");
        }
    }
}
