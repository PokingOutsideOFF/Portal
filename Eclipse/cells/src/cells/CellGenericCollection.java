package cells;
import java.util.*;
public class CellGenericCollection<T> {
	T[] cells;
	int index=0;
	
	public CellGenericCollection(int size) {
		cells=(T[])new Object[size];
	}
	
	public void add(T c) {
		cells[index]=c;
		index++;
	}
	
	public T get(int i) {
		return cells[i];
	}
}
