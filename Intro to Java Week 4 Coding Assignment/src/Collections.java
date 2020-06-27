import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		List<String> students = new ArrayList<String>();
		students.add("Rob");
		students.add("Rob");
		students.add("Samantha");
		
		for (String student : students) {
			System.out.println(student);
		}
		System.out.println(students.get(1));
	
		Set<String> states = new HashSet<String>();
		states.add("Arizona");
		states.add("Arizona");
		states.add("California");
		states.add("New York");
		
		for (String state : states) {
			System.out.println(state);
			System.out.println(states.contains("Arizona"));
		}
		
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		racerPlacements.put(1, "Tommy");
		racerPlacements.put(2, "Johnny");
		racerPlacements.put(3, "Cesar");
		
		System.out.println(racerPlacements.get(2));
		
		Set<Integer> racerKeys = racerPlacements.keySet();
		for(Integer key : racerKeys) {
			System.out.println(key + " : " + racerPlacements.get(key));
		}
		
		Collection<String> racers = racerPlacements.values();
		for (String racer : racers) {
			System.out.println(racer);
		}
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Cesar", "Coolest Fucken Guy");
		dictionary.put("Khristian", "Lamest Fucken Guy");
		dictionary.put("Alberto", "Weirdest Fucken Guy");
		
		System.out.println(dictionary.get("Cesar"));
	}
	
}
