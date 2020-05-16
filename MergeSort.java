
import java.util.*;
public class MergeSort{
    
    
   public static void Merge(int left[], int right[], int arr[])
{
    
    int ln = left.length;
    int rn = right.length;
    int len = arr.length;

    int i=0,j=0,k = 0;

    while (i < ln && j < rn ){
        
        if(left[i] <= right[j]){
            
        arr[k] = left[i];
            
        k  = k + 1;
        i  = i + 1;
        
        }
        else
        {
            
        arr[k] = right[j];
            
        k = k + 1;
        j = j + 1;
        
        }
    }
    
    while (i < ln){
        
        arr[k] = left[i];
            
        k = k + 1;
        i = i + 1;
        
    }
    
     while (j < rn){
           
        arr[k] = right[j];
        
        k = k + 1;
        j = j + 1;
        
    }
    
}

public static void MergeSort(int arr[]){
    
       int len = arr.length;
    
        if(len < 2) return;
    
        int mid = len/2;
        
        int  left[] = new int[mid];
         
        int right[] = new  int[len-mid];
         
    
         for(int i = 0; i < mid ; i ++ ){
          
           left[i] = arr[i] ;
         
         }
         
         for(int i = mid ; i < len ; i++){
          right[i-mid] = arr[i];
         }
         
         MergeSort(left);
         MergeSort(right);
         Merge(left,right,arr);
    
}


public static void printArray(int arr[]){
    int n = arr.length;
    
    for(int i = 0; i < n ; i++){
        System.out.print(arr[i]+"");
        System.out.println();
    }
}

 public static void main(String []args){
         
        int arr[] ={10,20,45,2,43,12,46,45};
         
        MergeSort(arr);
        printArray(arr);
        
     }
}
