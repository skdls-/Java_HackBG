import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class ReverseCollection {
    
    static void reverse(Collection<Integer> collection) {
        
        Integer[] integers = new Integer[collection.size()];
        
        int i = 0;
        
        collection.toArray();
        for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
            Integer integer = (Integer) iterator.next();
            integers[i] = integer;
            iterator.remove();
            i++;
        }
        for (int j = integers.length - 1; j >= 0; j--) {
            collection.add(integers[j]);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        ReverseCollection rev = new ReverseCollection();
        rev.reverse(l);
        System.out.println(Arrays.toString(l.toArray()));

    }

}
