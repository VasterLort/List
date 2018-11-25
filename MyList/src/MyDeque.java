import java.util.Collection;
import java.util.Iterator;

public interface MyDeque<E> {
	public boolean isEmpty();
	public Object[] toArray();
	public void clear();
	public void addFirst(E e);
	public void addLast(E e);
	public boolean offerFirst(Object o);
	public boolean offerLast(Object o);
	public Object removeFirst();
	public Object removeLast();
	public Object pollFirst();
	public Object pollLast();
	public Object getFirst();
	public Object getLast();
	public Object peekFirst();
	public Object peekLast();
	public boolean removeFirstOccurrence(Object o);
	public boolean removeLastOccurrence(Object o);
	public boolean add(Object e);
	public boolean offer(Object e);
	public Object remove();
	public Object poll();
	public Object peek();
	public void push(Object e);
	public Object pop();
	public boolean remove(Object o);
	public boolean contains(Object o);
	public int size();
}
