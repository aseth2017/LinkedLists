/**
 * Creates a ListNode, which is a data structure inside the LinkedList
 * Has an object which it contains and a pointer to the next ListNode
 * @author Anish Seth
 * @version 11-12-15
 * @param <E> The type of ListNode being created
 */
public class ListNode<E>
{
	private E object;
	private ListNode<E> next;
	
	public ListNode(E object)
	{
		this.object = object;
		next = null;
	}
	public ListNode(ListNode<E> pointer, E object)
	{
		next = pointer;
		object = null;
	}
	public E getObject()
	{
		return object;
	}
	public ListNode<E> getNext()
	{
		return next;
	}
	public void setObject(E object)
	{
		this.object = object;
	}
	public void setNext(ListNode<E> pointer)
	{
		next = pointer;
	}
	public String toString()
	{
		return object.toString();
	}
}
	