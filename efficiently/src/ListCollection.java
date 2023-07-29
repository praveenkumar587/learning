import java.util.ArrayList;
import java.util.Iterator;


public class ListCollection {

	public static void main(String[] args) {

		ArrayList<Integer> obj = new ArrayList<Integer>();

		obj.add(1);
		obj.add(13);
		System.out.println(obj.size());
		Iterator<Integer> goal = obj.iterator();
		for(int x=0;x<=obj.size();x++) {
			System.out.println(obj.get(x));
			
		}

	while (goal.hasNext()) {
		System.out.println(goal.next());

	}

	}

}
