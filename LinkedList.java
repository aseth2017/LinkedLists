/**
 * Creates a LinkedList
 * Does not have random access
 * @author Anish Seth
 * @version 11-18-15
 */
public class LinkedList<E>// implements Stack<E>, Queue<E>
{
	protected ListNode<E> head; //First item in the LinkedList
	private ListNode<E> tail; //Last item in the LinkedList
	private int size; //Size of LinkedList
	
	/**
	 * Constructor
	 * Sets head and tail pointers to null
	 */
	public LinkedList()
	{
		head = null;
		tail = null;
		size = 0;
	}
	/**
	 * Constructor
	 * Sets head pointer equal to ListNode parameter
	 */
	public LinkedList(ListNode<E> h)
	{
		head = h;
		size++;
	}
	public int Size()
	{
		return size;
	}
	
	public int Size(ListNode<E> node)
	{
		if(node == null)
			return 0;
		else
			return Size(node.getNext());
	}
	public boolean add(E item)
	{
		return add(item, size);
	}
	public boolean add(E item, int i)
	{
		ListNode<E> x = new ListNode<E>(item);
		if(i < 0 || i > size)
			throw new IndexOutOfBoundsException();
		if(i==0)
		{
			if(size==0)
			{
				head = new ListNode<E>(x,null);
				tail = head;
				size++;
				return true;
			}
		}
		else if(i == size-1)
		{
			tail.setNext(x);
			size++;
			return true;
		}
		int index = 0;
		for(ListNode<E> next = head.getNext(); next != null; next = next.getNext())
		{
			if(index == i-1)
			{
				x.setNext(next.getNext());
				next.setNext(x);
				size++;
				return true;
			}
			index++;
		}
		return false;
	}
	//How the list will be displayed once printed
	public String toString()
	{
		String s = "{";
		for(ListNode<E> x = head.getNext(); x != null; x = x.getNext())
		{
			s += x.toString() + ", ";
		}
		s += "}";
		return s;
	}
/*	
	//Copy constructor
	public LinkedList(LinkedList<E> other)
	{
		
	}
	//Add object to the end of the list 
	public void add(E o)
	{
		
	}
	//Add object to stack
	public void push(E item)
	{
		
	}
	//Add object to queue
	public void offer(E item)
	{
		
	}
	//Remove item and return whether or not object was removed
	public boolean remove(E o)
	{
		
	}
	//Remove and return item at specified index
	public E remove(int index)
	{
		int counter = 0;
		ListNode<E> x = head;
		while(counter <= index)
		{
			if(counter==index)
			{
				
			}
		}
	}*/
	//Remove and return first item in the list
	public E removeFirst()
	{
		E hold = head.getObject();
		head = head.getNext();
		size--;
		return hold;
	}
/*	//Remove and return last item in the list
	public E removeLast()
	{
		E hold = tail.getObject();
		tail = null;
		size--;
		return hold;
	}
	//Add object to front of list
	public void addFirst(E item)
	{
		add(item, 0);
	}
	//Add object to end of list
	public void addLast(E item)
	{
		add(item);
	}
	//Return whether or not list contains specified object
	public boolean contains(E o)
	{
		for(ListNode<E> next = head.getNext(); next != null; next = next.getNext())
		{
			if(next.getObject() == o)
				return true;
		}
		return false;
	}
	//Return size of the list
	public int size()
	{
		return size;
	}
	//Remove all items from the list
	public void clear()
	{

	}
	//Return item at specified index
	public E get(int i)
	{
		
	}
	//Place object at specified location
	public E set(int i, E o)
	{
		
	}
	//Add object at specified location
	public void add(int i, E o)
	{
		
	}
	//Return index of the first instance of specified object
	public int indexOf(E o)
	{
		
	}
	//Remove object from queue
	public E poll()
	{
		return removeLast();
	}
	//Remove object from stack
	public E pop()
	{
		return removeLast();
	}
	//Return whether or not list is empty
	public boolean isEmpty()
	{
		
	}
	//Create and return an iterator
	public Iterator<E> iterator()
	{
		
	}
*/
}
