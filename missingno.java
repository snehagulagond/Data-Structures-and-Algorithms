public class missingno{
    public static void main(String[]args){
        int arr[]={1,2,4,5,6,7,8,9};
        int i=0;
        for(i=0;i<11;i++){
            if(arr[i]!=i+1){
                System.out.println("Missing number is: "+(i+1));
                break;
            }
        }

    }
}
    
