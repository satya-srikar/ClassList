import java.util.*;

public class ClassGrades {
	
	Map<String, String> classList = new HashMap<String, String>();
	
	public ClassGrades() {
		classList.put("Bob", "A");
		classList.put("Mary", "C");
		classList.put("Sarah", "B");
		classList.put("Philip", "A");
		classList.put("Greg", "F");
	}
	
	public void printClassList() {
		Iterator<Map.Entry<String, String>> entries = classList.entrySet().iterator();
		while(entries.hasNext()) {
			Map.Entry<String, String> entry = entries.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}
	
	public void printClassList2() {
		for(Map.Entry<String, String> entry : classList.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		
		System.out.println("\n Keys:\n");
		
		//iterate over keys only
		for(String key : classList.keySet()) {
			System.out.println("Key = " + key);
		}
		
		System.out.println("\n Values:\n");
		
		//iterate over values only
		for(String value : classList.values()) {
			System.out.println("Value = " + value);
		}
	}

	public static void main(String[] args) {
		ClassGrades myClassList = new ClassGrades();
		myClassList.printClassList();
		System.out.println("\n");
		myClassList.printClassList2();
	}

}
