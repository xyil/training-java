package linkedlist;

import java.util.LinkedList;

public class MainList{
	public static void main(String[] args) {
		LinkedList<String> seasons = new LinkedList<String>();
		seasons.add("Spring");
		seasons.add("Summer");
		seasons.add("Fall");
		seasons.add("Winter");
		
		// Use removeFirst()
		seasons.removeFirst();
		
		// Use addLast()
		seasons.addLast("Spring");
		
		// Use removeLast()
		seasons.removeLast();
		
		// Use add.First()
		seasons.addFirst("Spring");
		
		// Use getFirst()
		seasons.getFirst();
		
		// Use getLast()
		seasons.getLast();
		
		System.out.println(seasons);
	}
}