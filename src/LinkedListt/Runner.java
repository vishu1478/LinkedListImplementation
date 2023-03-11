package LinkedListt;

public class Runner {

	public static void main(String[] args) {
		LinkedImplementation l= new LinkedImplementation();
		l.insert(5);
		l.insert(6);
		l.insert(7);
		l.insert(8);
		//l.deletAt(4);
		l.insertAt(0, 9);
		l.show();
	}

}
 