
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
	