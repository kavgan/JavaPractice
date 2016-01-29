package duplicate;

/**
 * Remove duplicates from a linked list.
 * This does not use Java's linked list
 * @author Kavita
 *
 */
public class RemoveDuplicatesFromLinkedList {

	static class Item{

		public Item(String s) {
			data=s;
		}

		Item next;
		Item previous;
		String data="";
	}

	public static void main(String[] args) {

		Item head,curr;
		
		//Create a linked list of elements
		head=addElement(null,"Cat");
		curr=addElement(head,"Mouse");
		curr=addElement(curr,"Dog");
		curr=addElement(curr,"Dog");
		curr=addElement(curr,"Dog");
		curr=addElement(curr,"Cat");
		curr=addElement(curr,"Cat");
		curr=addElement(curr,"Mouse");
		curr=addElement(curr,"Dog");
		curr=addElement(curr,"Chicken");
		curr=addElement(curr,"Horse");
		curr=addElement(curr,"Horse");


		//Before Duplicates Removed
		System.out.println("Before duplicates removed: ");
		curr=head;
		while(curr!=null){
			System.out.println(curr.data);
			curr=curr.next;
		}

		//Recursively remove duplicates
		Item tmp=head;
		while(tmp!=null){
			removeDup(tmp.next,tmp.data);
			tmp=tmp.next;
		}

		//After Duplicates Removed
		System.out.println("\nAfter duplicates removed: ");
		curr=head;
		while(curr!=null){
			System.out.println(curr.data);
			curr=curr.next;
		}


	}

	private static void removeDup(Item curr, String str) {

		//return when null
		if(curr==null)
			return;

		
		//update pointers to eliminate  duplicates
		if(curr.data.equalsIgnoreCase(str)){

			//assign current element's left neighbor's next to curr.next
			if(curr.previous!=null)
				curr.previous.next=curr.next;

			//assign current elements right neighbor's previous, curr.previous
			if(curr.next!=null)
				curr.next.previous=curr.previous;
		}

		//recurse and remove rest
		removeDup(curr.next, str);
	}

	private static Item addElement(Item prev, String string) {
		Item item=new Item(string);

		if(prev!=null) {	//in case this is the head. then prev will be null {
			item.previous=prev;
			prev.next=item;
		}

		return item;
	}

}
