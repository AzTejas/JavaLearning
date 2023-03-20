package Array;

import java.util.ArrayList;
public class ArrayListConcept {
    static void xYZ(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(true);
        arrayList.add('f');
        arrayList.add("Tester");
        arrayList.add(12.32);
        arrayList.add(12345L);
        arrayList.add("ieweijhdfkjefhskjflsf");

        System.out.println(arrayList.get(2));
        System.out.println(arrayList.size());
        System.out.println(arrayList.remove(4));
        System.out.println(arrayList.size());
        System.out.println(arrayList);
    }

    public static void main(String[] args) {
        xYZ();

    }
}
