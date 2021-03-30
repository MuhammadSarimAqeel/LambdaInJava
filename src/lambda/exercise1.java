package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;



public class exercise1 {

	public static void main(String[] args) {
		

		
		

		List<person> people =Arrays.asList(
				
				new person ( 1, "Sarim", "Aqeel"),
				new person (2, "Sam", "Khan"),
				new person ( 3, "Aashir", "Aqeel"),
				new person ( 4, "Zain", "Khan"),
				new person ( 5, "John", "Campbell")
				
				);
		
		
		
		
		
		
//		System.out.println("Printing all person");
//		for(person p : people) {
//			System.out.println(p);
//		}
		
		
		
		System.out.println("Printing all person");
		people.forEach(p->System.out.println(p));
		
		
//		this is by method reference syntax
//		System.out.println("Printing all person");
//		people.forEach(System.out::println);
		
		
		System.out.println("Printing person whose firstname start with S");
		people.stream().filter(p->p.getFirstname().startsWith("S")).forEach(p-> System.out.println(p));
		
		
//		Collections.sort(people, new Comparator<person>() {
//
//			public int compare(person o1, person o2) {
//			
//				return o1.getLastname().compareTo(o2.getLastname());
//			}
//		});
//		
		
		Collections.sort(people, (p1, p2)-> p1.getLastname().compareTo(p2.getLastname()));
		
		System.out.println("All person sorted by last name");
		printAll(people);
		
		
		System.out.println("All person whose lastname starts with A");
		printConditionally(people,(p)-> p.getLastname().startsWith("A"));
		
		
		
		
	}


		
//		printConditionally(people, new Condition() {
//
//			@Override
//			public boolean test(person p) {
//				
//				return p.getLastname().startsWith("S");
//			}});
//		
//	}
	
	
	


	private static void printAll(List<person> people) {
		for(person p : people) {
			System.out.println(p);
		}
		
	}
	
	

	private static void printConditionally(List<person> people , Condition condition) {
		for(person p : people) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
		
	}

	interface Condition{
		boolean test(person p);
		
	}
	
}

