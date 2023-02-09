package java_codes;

import java.util.ArrayList;
import java.util.List;

public class find_pairing_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ar=new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(10);
		ar.add(10);
		ar.add(20);
		int count=0;
		for(int i=0;i<ar.size();i++) {
			for(int j=i+1;j<ar.size();j++) {
				if(i==j) {
					count++;
				}
				if(count%2!=0) {
					System.out.println();
				}
			}
		}

	}

}
