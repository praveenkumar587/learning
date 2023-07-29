import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class map {

	public static void main(String[] args) {
		HashMap<String,String> obj=new HashMap<String,String>();
		obj.put("name", "mobai no");
		obj.put("names", "Emp no");
		obj.put("data", "set");
//		System.out.println(obj.get("name"));
//		System.out.println(obj.get("names"));
		Set obj1 =obj.entrySet();
		Iterator<String> entry=obj1.iterator();
		while(entry.hasNext());
		{
			System.out.println(entry.next());
		}
		
	}

}
