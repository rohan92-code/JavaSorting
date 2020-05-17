
public class QuickSort{
    
    
    public static int  Partition(int arr [],int start,int end){
        
        int pivot = end;
        int pIndex = start;
        
        for(int i=start; i<end ; i++){
            
            if(arr[i] <= arr[pivot]){
                
                int temp = arr[pIndex];
                arr[pIndex] = arr[i];
                arr[i] = temp;
                
                pIndex = pIndex + 1;
            }
            
        }
        
        int temp1 = arr[end];
        arr[end] = arr[pIndex];
        arr[pIndex] = temp1;
        
        return  pIndex;
        
    }
    
    
    public static void Quicksort(int arr[],int start, int end){
        
        if(start < end){
            int pIndex = Partition(arr,start,end);
            Quicksort(arr,start,pIndex-1);
            Quicksort(arr,pIndex+1,end);
        }
        
    }
    
    public static void printArray(int arr[]){
        
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]);
            System.out.println();
        }
        
    }
    
     public static void main(String []args){
         
        int arr[] = {12,4,5,23,12,8,9,45,76};
        
        int n = arr.length-1;
        
        Quicksort(arr,0,n);
        
        printArray(arr);
     }
     
}
