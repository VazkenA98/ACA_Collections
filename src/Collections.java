import java.util.*;

public class Collections<T> implements Iterator {
    private T obj;
    private Set<T> hashset = new LinkedHashSet<T>();
    private LinkedList<T> linkedList = new LinkedList<T>();
    private ArrayList<T> arrList = new ArrayList<T>();
    private int i = 0;


    private void addToCollections(T obj) {
        hashset.add(obj);
        arrList.addAll(hashset);
        if (arrList.size() > 1) {
            if (arrList.get(arrList.size() - 1).equals(linkedList.getLast())) {
                arrList.add(null);
            }
        }
        linkedList.addLast(arrList.get(arrList.size() - 1));
        linkedList.remove(null);
        arrList.clear();


    }

    public void add(T obj) {
        this.obj = obj;
        addToCollections(obj);

    }

    public void add(int pos, T obj) {
        this.obj = obj;
        addToCollections(obj);
        linkedList.add(pos, obj);
        linkedList.removeLastOccurrence(linkedList.getLast());

    }

    public T get(int pos) {

        arrList.addAll(linkedList);
        obj = arrList.get(pos);
        arrList.clear();
        return obj;
    }

    public Boolean contains(T obj) {
        arrList.addAll(linkedList);
        boolean result = arrList.contains(obj);
        arrList.clear();
        return result;

    }

    public void remove(int pos) {
        linkedList.remove(pos);
    }

    public void remove(T obj) {
        linkedList.remove(obj);
    }

    @Override
    public boolean hasNext() {
        return i < linkedList.size();
    }

    @Override
    public Object next() {
        T obj = linkedList.get(i);
        i += 1;
        return obj;
    }


    @Override
    public String toString() {
        return "Collections{" +
                "arrList=" + linkedList +
                '}';
    }


}
