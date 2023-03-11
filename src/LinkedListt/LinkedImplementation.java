package LinkedListt;

public class LinkedImplementation {
	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.nextNode = null;
		if (head == null) {
			head = node;
		} else {
			Node node2 = head;
			while (node2.nextNode != null) {
				node2 = node2.nextNode;
			}
			node2.nextNode = node;
		}
		// System.out.println("1");
	}

	public void show() {
		Node node3 = head;
		// System.out.println(node3.data);
		do {
			System.out.println(node3.data);
			node3 = node3.nextNode;
		} while (node3 != null);
	}

	public void deletAt(int position) {
		Node node4 = head;
		Node node5;
		if (position == 1) {
			head = head.nextNode;
		}

		else {
			for (int i = 1; i < position - 1; i++) {
				node4 = node4.nextNode;

			}
			node5 = node4.nextNode;
			node4.nextNode = node5.nextNode;
		}
	}

	public void insertAt(int position, int data) {
       Node node6=new Node();
       node6.data=data;
       node6.nextNode=null;
       Node node7=head;
       for(int i=1;i<position-1;i++) {
    	   node7=node7.nextNode;
       }
       node6.nextNode=node7.nextNode;
       node7.nextNode=node6;
	}
}
