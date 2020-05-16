public class HelloWorld{
    
    
   public static void select(int arr[], int n)
{
    for(int i=1 ; i<n; i++){
     int value = arr[i];
     int hole = i;
     
     while(hole > 0 &&  arr[hole-1] > value ){
         arr[hole] = arr[hole-1];
         hole = hole-1;
     }
     
       arr[hole] = value;
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
