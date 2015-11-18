public class LinkedListRunner
{
	public static void main(String[] args)
	{
		LinkedList<Integer> x = new LinkedList<Integer> ();
		x.add(2);
		x.add(17);
		System.out.println(x.removeFirst());
		System.out.print(x);
	}
}
