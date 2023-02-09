package java_codes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Duplicate_char {
public static void main(String[] args) {/*
	String s="Jagtapaagt";
	char [] ch=s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		int count=0;
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				System.out.println(ch[j]);
				count++;
			}
			System.out.println(count);

		}
	}*/

Scanner scan = new Scanner(System.in);
int n = scan .nextInt();

/* Count pairs */
ArrayList<Integer> al=new ArrayList<Integer>();
HashSet<Integer> set = new HashSet<>();
int pairs = 0;
for (int i = 0; i < n; i++) {
    int cost = scan.nextInt();
    if (al.contains(cost)) {
        al.remove(cost);
        pairs++;
    } else {
        al.add(cost);
    }
}

/* Print output */
scan.close();
System.out.println(pairs);
}
}
