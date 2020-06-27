import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;

public class Assignment_Week4 {

	public static void main(String[] args) {
		
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Cesar");
		employeeNames.add("Nallely");
		employeeNames.add("Ronaldo");
		employeeNames.add("Khristian");
		employeeNames.add("Christopher");

		System.out.print("These are the employee names: " + employeeNames);
		System.out.println("\n");
	
	    HashSet<Integer> ids = new HashSet<Integer>();
        ids.add(10001);
        ids.add(10002);
        ids.add(10003);
        ids.add(10004);
        ids.add(10005);
        
        int i = 0;
        
        System.out.print("These are the employee ids: " + ids);
        System.out.println("\n");
        
	    HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
	        for (Integer id : ids) {
	            employeeMap.put(id, employeeNames.get(i));
	            i ++ ;
	        }
	        
	        for (Integer key : employeeMap.keySet()) {
	            System.out.print("Employee " + key + " is " + employeeMap.get(key));
	            System.out.println("\n");
	        }

	        StringBuilder idsBuilder = new StringBuilder();
	        for (Integer id : ids) {
	            idsBuilder.append(id + "-");
	        }

	        StringBuilder namesBuilder = new StringBuilder();
	        idsBuilder.setLength(29);
	        System.out.print(idsBuilder.toString());
	        System.out.println("\n");

	        for (String name : employeeNames) {
	            namesBuilder.append(name + " ");
	        }
	        System.out.println(namesBuilder.toString() + " ");
	    }
	}
