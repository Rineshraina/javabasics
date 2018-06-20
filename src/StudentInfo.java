package com.java.util;

import java.util.*;


public class StudentInfo {
	public static void main(String[] args) {
		
	
	Student s1=new Student(1,"stud1",987);
	Student s2=new Student(2,"stud2",1087);
	Student s3=new Student(3,"stud3",877);
	Student s4=new Student(4,"stud4",1117);
	Student s5=new Student(5,"stud5",720);
	Student[] stu= {s1,s2,s3,s4,s5};
Comparator<Student>comparator=new Comparator<Student>() {
	
	
	@Override
	public int compare(Student o1, Student o2) {
		 return Double.compare(o2.getMark(),o1.getMark());
		
	}
};
Arrays.sort(stu,comparator);

System.out.println("comparator"+Arrays.toString(stu));
List<String>list=new ArrayList<String>();
	list.add("one");
	list.add("two");
	list.add("three");
	System.out.println("list"+list.get(2));
	List<Student>stulist=new ArrayList<Student>(Arrays.asList(stu));
	System.out.println("arraylist"+stulist);
	Comparator<Student>comparator1=new Comparator<Student>() {
		
		
		@Override
		public int compare(Student o1, Student o2) {
			 return Double.compare(o1.getMark(),o2.getMark());
			
		}
	};
	Collections.sort(stulist,comparator1);
System.out.println("listcomparator"+stulist);
LinkedList<String>linkedlist=new LinkedList<String>();
linkedlist.add("one");
linkedlist.add("two");
linkedlist.add("three");
linkedlist.offerLast("fourrr");
linkedlist.offerFirst("oneee");
System.out.println("linkedlist"+linkedlist);
Iterator<String> iter=linkedlist.descendingIterator();
while(iter.hasNext()) {
	System.out.println("iterator"+iter.next());
}
for(String str:linkedlist) {
	System.out.println("foreach"+str);
}
Set<String> set=new HashSet<String>();
set.add("one");
set.add("two");
set.add("one");
System.out.println("set"+set);
Set<String> setOne=new HashSet<String>(list);
System.out.println("hashset"+setOne);
LinkedHashSet<String> linked=new LinkedHashSet<String>();
linked.add("one");
for (int i = 0; i < 10; i++) {
	linked.add("two"+i);
	setOne.add("two"+i);
	
}
System.out.println("linkedhashset "+linked);
System.out.println("for"+setOne);
TreeSet<String> tree=new TreeSet<String>();
tree.add("one");
tree.add("two");
tree.add("three");
tree.add("four");
System.out.println("treeset"+tree);
NavigableSet<String> navi=tree.headSet("one", true);
System.out.println("headsettree"+navi);
NavigableSet<String> navitail=tree.tailSet("three", true);
System.out.println("treetailset"+navitail);
Map<String, Integer>map=new HashMap<String,Integer>();
	map.put("one",32);
	map.put("two",12);
	map.put("three",82);
	System.out.println("haspmap"+map);
	Set<String>set1=map.keySet();
	Collection<Integer>val=map.values();
	Iterator<String>iterkey=set1.iterator();
	Iterator<Integer>iterval=val.iterator();
	while (iterkey.hasNext()) {
		System.out.println(iterkey.next()+"=="+iterval.next());
	}
	Integer value=map.get("three");
	System.out.println(value);
	Map<String,Integer>maplink=new LinkedHashMap<String,Integer>();
	maplink.put("one",20);
	maplink.put("two",30);
	maplink.put("three",27);
	maplink.put("four",54);
	System.out.println("linkedhashmap"+maplink);
	TreeMap<String,Integer>mapl=new TreeMap<String,Integer>();
	mapl.put("one",20);
	mapl.put("two",30);
	mapl.put("three",27);
	mapl.put("four",54);
	System.out.println("treemap"+mapl);
	NavigableMap<String,Integer>navimap=mapl.headMap("three", true);
	System.out.println("treeheadmap"+navimap);
	NavigableMap<String,Integer>navitail1=mapl.tailMap("three", true);
	System.out.println("treetailmap"+navitail1);
	
	}
	
	
}