package homeWork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSet {

	public static void main(String[] args) {


		List<String> list = new ArrayList<String>();
		list.add("Ajith");
		list.add("Shalini");
		list.add("bhuji");
		list.add("bobby");
		list.add("selvam");
		list.add("jay");


		System.out.println(list.get(1));
		System.out.println(list.size());
		System.out.println(list.remove(3));
		System.out.println(list.contains("Shalini"));


		for(String res : list) {
			System.out.println(res);
		}

		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		List<Integer> list1 = new ArrayList<Integer>(set);
	
		System.out.println(	list.get(2));

		System.out.println(set.add(5));
		System.out.println(set.size());
		System.out.println(set.remove(3));
		System.out.println(set.contains(2));
		for(Integer res: set) {
			System.out.println(res);
		}


		set.clear();

			System.out.println("no result: " + set);

	}














}
