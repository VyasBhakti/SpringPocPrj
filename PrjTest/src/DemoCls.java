import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 */

/**
 * @author 1229632
 *
 */
public class DemoCls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> one, two;
		one = new ArrayList();
		one.add(1);
		one.add(2);
		one.add(3);
		one.add(4);
		one.add(5);
		
		two = new ArrayList();
		two.add(1);
		two.add(3);
		two.add(5);
		two.add(2);
		two.add(4);
		
		one.equals(two);
		one.containsAll(two);
		
		System.out.println("Equals result : " + one.equals(two));
		System.out.println("contains result : " + one.contains(two));
		System.out.println("containsAll result : " + one.containsAll(two));
		
		Set<Integer> oneS, twoS;
		oneS = new HashSet<Integer>();
		oneS.add(1);
		oneS.add(2);
		oneS.add(3);
		oneS.add(4);
		oneS.add(5);
		
		twoS = new HashSet<Integer>();
		twoS.add(1);
		twoS.add(3);
		twoS.add(5);
		twoS.add(2);
		twoS.add(4);
		
		System.out.println("\n Equals result in Set: " + oneS.equals(twoS));
		System.out.println("contains result in Set: " + oneS.contains(twoS));
		System.out.println("containsAll result in Set: " + oneS.containsAll(twoS));
		
		Map<Integer,Integer> oneM, twoM;
		oneM = new HashMap<Integer,Integer>();
		oneM.put(1,1);
		oneM.put(2,2);
		oneM.put(3,3);
		oneM.put(4,4);
		oneM.put(5,5);
		
		twoM = new HashMap<Integer,Integer>();
		twoM.put(1,1);
		twoM.put(3,3);
		twoM.put(5,5);
		twoM.put(2,2);
		twoM.put(4,4);
		
		System.out.println("\n Equals result in map: " + oneS.equals(twoS));
		System.out.println("contains result in map: " + oneS.contains(twoS));
		System.out.println("containsAll result in map: " + oneS.containsAll(twoS));
		
	}

}
