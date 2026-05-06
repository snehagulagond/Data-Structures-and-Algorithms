//problem statement: count the number of digits in a number
//approach: keep dividing the number by 10 until it becomes 0 and count the number of times we can divide
//time complexity: O(d) where d is the number of digits in the number
//space complexity: O(1) as we are using only a constant amount of space to store the count and the number

public class countingdigits {
    
    public static void main(String[]args){
    int n=5342598;
    int count = 0;
    while(n>0){
       
        count=count+1;
        n=n/10;
    }
    System.out.println(count);

    

    }
}
