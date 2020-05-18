public class ShellSort{
    
    
    public static void Sort(int arr[]){
        
        int len = arr.length;
        
        for(int gap = len/2; gap >= 1; gap/=2 )
        {
            for(int j = gap; j<len; j++){
                for(int i = j-gap; i >= 0 ; i = i-gap){
                    
                    if(arr[i+gap] > arr[i]){
                        break;
                    }
                    else{
                        int temp = arr[i];
                        arr[i] = arr[i + gap];
                        arr[i+ gap] = temp;
                    }
                    
                }
            }
        }
        
    }
    
    
    
   public static void printArray(int arr[]){
       
       int n = arr.length;
       for(int i=0; i < n ; i++){
           System.out.print(arr[i] + "");
           System.out.println();
       }
   }

