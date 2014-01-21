import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import acm.program.ConsoleProgram;

/**
 * Some Java tutorial for hashmaps
 */

/**
 * @author dirty
 *
 */
public class HashmapInternetExample extends ConsoleProgram {
	
	public void run() {
		println("alsdkf");
		HashMap<String, Integer> cache = new HashMap<String, Integer>();
		Hashtable<Integer, String> source = new Hashtable<Integer, String>();
		HashMap<Integer, String> map = new HashMap(source);
		map.put(21, "Twenty One ");
		//map.put(21.0, "Twenty One"); //compiler error not integer
		
		/*Integer key = 21;
		String value = map.get(key);
		println("Key: " + key + " value " + value);*/
		
		map.put(31, "Thirty One");
		
		Iterator<Integer> keySetIterator = map.keySet().iterator();
		while(keySetIterator.hasNext()) {
			Integer key = keySetIterator.next();
			println("key: " + key + " value: " + map.get(key));
		}
		
		// HashMap demo from tutorialspoint.com
		// Create a hash map
		HashMap hm = new HashMap();
		// Put elements to the map
		hm.put("Zara", new Double(3434.34));
		hm.put("Mahnaz", new Double(123.22));
		hm.put("Ayan", new Double(1378.00));
		hm.put("Daisy", new Double(99.22));
		hm.put("Qadir", new Double(-19.08));
		
		// Get a set of the entries
		Set set = hm.entrySet();
		// Get an iterator
		Iterator i = set.iterator();
		// Display elements
		while(i.hasNext())	{
			Map.Entry me = (Map.Entry) i.next();
			println(me.getKey() + ": " + me.getValue());
		}
		println();
		// Deposit 1000 into Zara's account.
		double balance = ((Double)hm.get("Zara")).doubleValue();
		hm.put("Zara", new Double(balance + 1000));
		println("Zara's new balance: " + hm.get("Zara"));
		
	}

	
	
	
	
	
}
