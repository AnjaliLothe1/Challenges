package challengeNo1;

import java.util.*;
public class myCode {
	
	public int subarray(int[] arr) 
	{
        int start=0,end=arr.length-1;
        for(;start<arr.length-1;start++)
        {
            if(arr[start]>arr[start+1])
            	break;
        }
		
        if(start==arr.length-1) return 0;
        for( ;end>0;end--)
        {
            if(arr[end]<arr[end-1]) break;
        }
		
        int minLength=Math.min(arr.length-start-1,end);
        for(;start>=0;start--)
        {
            for(int i=end;i<arr.length;i++)
            {
                if(arr[start]>arr[i]) 
                	continue;
                minLength = Math.min(minLength,i-start-1);
                break;
            }
        }
        return minLength;
    }

	public static void main(String[] args) {
		
		int n=0;
		
		Scanner sc=new Scanner(System.in);	
		System.out.println("Size of array");
		n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter value of array");
		for(int i=0; i<n; i++)  
		{  
		arr[i]=sc.nextInt();  
		} 
		
		System.out.println("Input: ");
		for (int i=0; i<n; i++)   
		{  
		System.out.println(arr[i]);  
		}  
		myCode ob=new myCode();
	
	
		System.out.println(	"\nOutput: "+ob.subarray(arr));
				
	}

}
