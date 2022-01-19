package cells;

public class CellCollectionDriver {
	public static void main(String args[]) {
		CellCollection cell=new CellCollection(5);
		
		cell.add(new Cell());
		cell.add(new Cell());
		
		System.out.println(cell.get(0));
		System.out.println(cell.get(1));
		
		cell.get(0).setValue("First Cell");
		cell.get(1).setValue("Second Cell");
		
		System.out.println(cell.get(0));
		System.out.println(cell.get(1));
	}
}
