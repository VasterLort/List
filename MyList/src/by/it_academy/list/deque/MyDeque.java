package by.it_academy.list.deque;

public interface MyDeque<E> {
	public boolean isEmpty();
	public Object[] toArray();
	public void clear();
	public void addFirst(E e);
	public void addLast(E e);
	public E removeFirst();
	public E removeLast();
	public E getFirst();
	public E getLast();
	public boolean contains(Object o);
	public int size();
}
