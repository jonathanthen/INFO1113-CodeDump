import java.util.ArrayList;

public class CoasterStack {
	
	ArrayList<Coaster> list = new ArrayList<Coaster>();
	
	public Coaster take() {
		Coaster top = list.get(list.size() - 1);
		list.remove(top);
		return top;
	}
	public Coaster check() {
		if (list.size() == 0) {
			return null;
		}
		Coaster top = list.get(list.size() - 1);
		return top;
	}
	public void put(Coaster c) {
		list.add(c);
	}
	public int size() {
		return list.size();
	}
}