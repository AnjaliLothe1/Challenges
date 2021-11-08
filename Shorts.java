package challengeNo1;
import java.util.*;
public class Shorts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		char arr[] = str.toCharArray();
		//int row = sc.nextInt();
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < arr.length; j++) {
				if(i==0 && (j==0 || j == 4 || j==8 || j==12) )
					System.out.print(arr[j]);
				else if(i==1 && j%2 != 0)
					System.out.print(arr[j]);
				else if(i==2 && (j==2 || j == 6 || j==10 || j==14))
					System.out.print(arr[j]);
				else
					System.out.print(".");
				
					
			}
			System.out.println();
		}
		char arr1[] = new char[20]; 
		int k=0;
		for(int i = 0; i < 3; i++) {
					
					for(int j = 0; j < arr.length; j++) {
						if(k<19) {
						if(i==0 && (j==0 || j == 4 || j==8 || j==12) ) {
							arr1[k]= arr[j];
							k++;
							}
						else if(i==1 && j%2 != 0) {
							arr1[k]= arr[j];
							k++;
							}
						else if(i==2 && (j==2 || j == 6 || j==10 || j==14)) {
							arr1[k]= arr[j];
							k++;}							
						}
					}
					System.out.println();
				}
		
		for(int i= 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
			
	}
		
}