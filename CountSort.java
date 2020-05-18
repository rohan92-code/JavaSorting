public class CountingSort{
    
    
    public static void CountSort(int arr[],int n,int k)
    
    {
        int count[] = new int[k+1];
        int b[] = new int[n];
        
        
        for(int i=0; i<n; i++){
            ++ count[arr[i]];
        }
        
        for(int i = 1; i<=k; i++){
            count[i] = count[i] + count[i-1];
        }
        
        
        for(int i = n-1; i >=0 ; i--){
            b[--count[arr[i]]] = arr[i];
    
        }
        
        for(int i =0; i<n ; i++){
            arr[i] = b[i];
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
        int arr[] ={2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
         
         CountSort(arr,arr.length,9);
         printArray(arr);
     }
}
