package linkedlist;

import java.util.LinkedList;

public class MainList{
	public static void main(String[] args) {
		LinkedList<String> seasons = new LinkedList<String>();
		seasons.add("Spring");
		seasons.add("Summer");
		seasons.add("Fall");
		seasons.add("Winter");
		
		System.out.println("Initial list: " + seasons);
		
		// Use getFirst()
		seasons.getFirst();
		System.out.println("First list item " + seasons);
		
		// Use getLast()
		seasons.getLast();
		System.out.println("Last list item " + seasons);
		
		// Use removeFirst()
		seasons.removeFirst();
		System.out.println("Remove first list: " + seasons);
		
		// Use addLast()
		seasons.addLast("Spring");
		System.out.println("addLast list: " + seasons);
		
		// Use removeLast()
		seasons.removeLast();
		System.out.println("Remove last list: " + seasons);
		
		// Use add.First()
		seasons.addFirst("Spring");
		System.out.println("Add first list: " + seasons);
		
	}
}