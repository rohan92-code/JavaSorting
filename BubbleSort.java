public class BubbleSort{
    
    
   public static void bubble(int arr[], int n)
{
    
    
    for (int j=0 ; j <n ; j++){
        
        for(int i = 0 ; i < n-1 ; i++){
            
        if( arr[i+1] < arr[i]){
            
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    
    }
    
}

public static void printArray(int arr[]){
    int n = arr.length;
    
    for(int i = 0; i < n ; i++){
        System.out.print(arr[i]+"");
        System.out.println();
    }
}



     public static void main(String []args){
         
         int arr[] ={10,20,45,2,43,12,46};
         
         bubble(arr,arr.length);
         printArray(arr);
        
     }
}
