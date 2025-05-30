package NirmanProject;

import java.util.ArrayList;
import java.util.Collections;

public class ObjectArray {

	public static void main(String[] args) {
		ArrayList<Object> L1 = new ArrayList();
		ArrayList<Integer> L2 = new ArrayList();
		ArrayList<String> L3 = new ArrayList();
		L1.add(56);
		L1.add(67);
		L1.add(89);
		L1.add(34);
		L1.add(12);
		L1.add("Mohan");
		L1.add("Perumal");
		L1.add("Harish");
		L1.add("Laksh");
		
		System.out.println(L1);
		for(Object ob : L1) {
			if(ob instanceof Integer) {
				L2.add((Integer)ob);
			}
			else if(ob instanceof String) {
				L3.add((String)ob);
			}
		}
		
		System.out.println(L2);
		System.out.println(L3);
		
		Collections.sort(L2);
		Collections.sort(L3);
		L1.clear();
		L1 = new ArrayList(L2);
		L1.addAll(L3);
		
		System.out.println(L1);

	}

}
