import java.util.HashMap;

public class MaxFrequentEle{
    public static void main(String[] args) {
        int arr[]={1,4,2,4,3,4,4};
        int count=0;
        int n=arr.length;
        frequency(arr,n);
    }
    public static void frequency(int arr[],int n){
        HashMap<Integer,Integer>hmap=new HashMap<>();
        for(int i=0;i<n;i++){
            
                hmap.put(arr[i],hmap.getOrDefault(arr[i],0)+1);
                
            }
            int maxFreq=0;
            int maxEle=0;
            int minEle=0;
            int minFreq=n;
            for(HashMap.Entry<Integer,Integer>entry:hmap.entrySet()){
                int ele=entry.getKey();
                int count=entry.getValue();
                if(count>maxFreq){
                    maxFreq=count;
                    maxEle=ele;
                }
                if(count<minFreq){
                    minFreq=count;
                    minEle=ele;
                }

            }
            
        System.out.println("Most frequent element: "+maxEle+" with frequency: "+maxFreq);
    System.out.println("Least frequent element: "+minEle+" with frequency: "+minFreq);
        
    }
    
    
}
