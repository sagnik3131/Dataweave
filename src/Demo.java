import java.util.*;
public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List list = new ArrayList();
		
		for(int i = 0; i < n; i++)
			list.add(sc.nextInt());
		list.add("###");
		
		for(int i = 0; i < m ; i++)
			list.add(sc.next());
		Iterator it = new Demo().fun(list);
		while(it.hasNext()) {
			Object element = it.next();
			System.out.println((String)element);
		}
	}
	
	Iterator fun(List list) {
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object e = it.next();
			if(e instanceof String) {
				break;
			}
		}
		return it;
	}
	
	
}
