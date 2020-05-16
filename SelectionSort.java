public class HelloWorld{
    
    
   public static void select(int arr[], int i)
{
    for (int k =0; k<i-1; k++ ){
     int kmin = k;
    
    for(int j=k+1; j<i; j++)
         if(arr[j] < arr[kmin]) kmin = j;
    
      int temp = arr[k];
      arr[k] = arr[kmin];
      arr[kmin] = temp;
    
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
         
         select(arr,arr.length);
         printArray(arr);
        
     }
}
