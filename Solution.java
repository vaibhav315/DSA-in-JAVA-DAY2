class Solution {


  void pushZerosToEnd(int[] arr) {
        int index = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] !=0){
                if (i != index){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                }
                index++;
            }
        }    
    }
        

    public static void main(String[]args){
        Solution sol = new Solution();
        int[]arr = {0,1,0,3,12,0,5};
        sol.pushZerosToEnd(arr);
        for (int num : arr){
            System.out.print(num +" ");
        }
    }    
}  
    
