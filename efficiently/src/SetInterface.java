import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class SetInterface {

	public static void main(String[] args) {
LinkedHashSet<String> obj=new LinkedHashSet<String>();
obj.add("Praveen");
obj.add("Kumar");
obj.add("a");
obj.add("b");
obj.add("c");
Iterator obj1=obj.iterator();
while(obj1.hasNext()) {
	System.out.println(obj1.next());
}

	}

}
