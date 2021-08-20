public class maxarray {
    public static void main(String[] args) {
        int[] arr = {3,4,2,6,9,1,2,3};
        int max = arrmax(arr);
        System.out.println(max);
    }

    static int arrmax(int[] arr){
        int max = arr[0];
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}

