import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> flist= new ArrayList();
        flist.add(2);
        flist.add(5);
        flist.add(34);
        flist.add(78);

        flist.add(2,45);  //index-2
        flist.add(1,89);
        System.out.println("after add:" + flist);

        ArrayList<Integer> slist=new ArrayList<>();
        slist.addAll(flist);

        System.out.println("list 1->" + flist); //
        System.out.println("list 2->" + slist);

        Collection.addAll(flist,32,54,68);
        System.out.println("list 1->" + flist);
        flist.removeAll(slist);

        System.out.println("after removeall->list 1 :" + flist);
        System.out.println("after removeall->list2:"+slist);



































    }
}
