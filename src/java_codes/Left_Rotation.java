package java_codes;

public class Left_Rotation {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int last=arr[0];
	for(int i=0;i<=arr.length-1;i++) {
arr[i]=arr[i+1];
	}
	arr[0]=last;
	for(int i=0;i<arr.length-1;i++) {
		System.out.print(arr[i]+"  ");
	}
}
}
