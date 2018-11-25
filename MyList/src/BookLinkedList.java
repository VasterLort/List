import java.util.NoSuchElementException;

public class BookLinkedList<E> implements MyDeque<E> {
	private int size = 0;
	private Node<E> first;
	private Node<E> last;

	public BookLinkedList() {
		first = new Node<E>(null, null, last);
		last = new Node<E>(null, first, null);
	}
	
	private static class Node<E> {
		E element;
		Node<E> next;
		Node<E> prev;

		Node(E element, Node<E> prev, Node<E> next) {
			this.element = element;
			this.next = next;
			this.prev = prev;
		}

		public E getElement() {
			return element;
		}

		public void setElement(E e) {
			element = e;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node n) {
			next = n;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node p) {
			prev = p;
		}

	}

	@Override
	public void clear() {

	}

	@Override
	public boolean isEmpty() {
		if(size == 0)return true;
		else return false;
	}

	@Override
	public Object[] toArray() {
		Object[] result = new Object[size];
        int i = 0;
        for (Node<E> x = first; x != null; x = x.next)
            result[i++] = x.element;
        return result;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addFirst(E e) {
		Node<E> next = first;
		next.setElement(e);
		first = new Node<E>(null, null, next);
		next.setPrev(first);;
		size++;
	}

	@Override
	public void addLast(E e) {
		Node<E> prev = last;
		prev.setElement(e);
		last = new Node<E>(null, prev, null);
		prev.setNext(last);
		size++;
	}

	@Override
	public boolean contains(Object o) {
		boolean check = false;
        for (Node<E> x = first; x != null; x = x.next) {
        	if(o.equals(x.element)) {
        		check = true;
        	}
        }
        return check;
	}

	@Override
	public Object getFirst() {
		Node<E> f = first;
        if (f == null)
            throw new NoSuchElementException();
        return f.element;
	}

	@Override
	public Object getLast() {
		Node<E> l = last;
        if (l == null)
            throw new NoSuchElementException();
        return l.element;
	}

	@Override
	public boolean offer(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offerFirst(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offerLast(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peekFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peekLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object pollFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object pollLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void push(Object arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeFirstOccurrence(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeLastOccurrence(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		return size;
	}

}
